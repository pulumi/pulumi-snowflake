// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package snowflake

import (
	"bytes"
	"fmt"
	"os"
	"path"
	"regexp"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	snowflake "github.com/Snowflake-Labs/terraform-provider-snowflake/pkg/provider"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"

	"github.com/pulumi/pulumi-snowflake/provider/v2/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "snowflake"
	// modules:
	mainMod = "index" // the y module
)

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() info.Provider {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(snowflake.Provider())

	// Create a Pulumi provider mapping
	prov := info.Provider{
		P:           p,
		Name:        "snowflake",
		Description: "A Pulumi package for creating and managing snowflake cloud resources.",
		Keywords:    []string{"pulumi", "snowflake"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "snowflakedb",
		Repository:  "https://github.com/pulumi/pulumi-snowflake",
		Version:     version.Version,
		DocRules:    &info.DocRule{EditRules: docEditRules},
		Config: map[string]*info.Schema{
			// Fix pluralization.
			//
			// Previously was "previewFeaturesEnableds".
			"preview_features_enabled": {Name: "previewFeaturesEnabled"},

			"host":                   {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_HOST"}}},
			"password":               {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_PASSWORD"}}},
			"port":                   {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_PORT"}}},
			"private_key_passphrase": {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_PRIVATE_KEY_PASSPHRASE"}}},
			"protocol":               {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_PROTOCOL"}}},
			"role":                   {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_ROLE"}}},
			"warehouse":              {Default: &info.Default{EnvVars: []string{"SNOWFLAKE_WAREHOUSE"}}},
		},
		Resources: map[string]*info.Resource{
			"snowflake_execute": {Fields: map[string]*info.Schema{
				// Workaround for https://github.com/pulumi/pulumi/issues/13294
				"execute": {CSharpName: "ExecuteSQL"},
			}},
		},
		DataSources: map[string]*info.DataSource{
			// Because "privatelink" is translated to "PrivateLink", this must be manually mapped.
			"snowflake_system_get_privatelink_config": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSystemGetPrivateLinkConfig"),
			},
		},
		JavaScript: &info.JavaScript{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &info.Python{
			RespectSchemaVersion: true,
			PyProject:            struct{ Enabled bool }{true},
		},

		Golang: &info.Golang{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &info.CSharp{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: info.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tokens.SingleModule("snowflake_",
		mainMod, tokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

func docEditRules(defaults []info.DocsEdit) []info.DocsEdit {
	//nolint:lll
	const (
		roadmap = `-> **Note** The current roadmap is available in our GitHub repository: [ROADMAP.md](https://github.com/snowflakedb/terraform-provider-snowflake/blob/main/ROADMAP.md).
`
		migration = `~> **Note** Please check the [migration guide](https://github.com/snowflakedb/terraform-provider-snowflake/blob/main/MIGRATION_GUIDE.md) when changing the version of the provider.
`
	)
	edits := []info.DocsEdit{
		removeLiteralFromIndex(roadmap),
		removeLiteralFromIndex(migration),
		fixExample,
		removeMainTf,
		removePreviewFeatures(),
	}
	return append(
		edits,
		defaults...,
	)
}

func removeLiteralFromIndex(s string) info.DocsEdit {
	b := []byte(s)
	return info.DocsEdit{
		Path: "index.md",
		Edit: func(_ string, content []byte) ([]byte, error) {
			dst := bytes.ReplaceAll(content, b, nil)
			if len(dst) == len(content) {
				return nil, fmt.Errorf("could not find %q to remove", s)
			}
			return dst, nil
		},
	}
}

func removePreviewFeatures() info.DocsEdit {
	const disclaimerPrefix = "~> **Disclaimer** The project is in v1 version, but some features are in preview."
	disclaimer := regexp.MustCompile("(?m)" + regexp.QuoteMeta(disclaimerPrefix) + ".*?\n")

	const featureFlagPrefix = "- `preview_features_enabled` (Set of String) A list of preview features"
	featureFlag := regexp.MustCompile("(?m)" + regexp.QuoteMeta(featureFlagPrefix) + ".*?\n")

	remove := func(src []byte, regexp ...*regexp.Regexp) ([]byte, error) {
		for _, r := range regexp {
			dst := r.ReplaceAllLiteral(src, nil)
			if len(src) == len(dst) {
				return nil, fmt.Errorf("did not find regexp %s in %s", r, string(src))
			}
			src = dst
		}
		return src, nil
	}
	return info.DocsEdit{
		Path:  "index.md",
		Phase: info.PostCodeTranslation,
		Edit: func(_ string, content []byte) ([]byte, error) {
			return remove(content,
				disclaimer, featureFlag,
			)
		},
	}
}

// Separates multiple "provider" declarations in top-level example
var fixExample = info.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replacesDir := "docs/index-md-replaces/"

		input, err := os.ReadFile(replacesDir + "example-input.md")
		if err != nil {
			return nil, err
		}
		desired, err := os.ReadFile(replacesDir + "example-desired.md")
		if err != nil {
			return nil, err
		}
		if bytes.Contains(content, input) {
			content = bytes.ReplaceAll(
				content,
				input,
				desired,
			)
		} else {
			// Hard error to ensure we keep this content up to date
			return nil, fmt.Errorf("could not find text in upstream index.md, "+
				"please verify file content at %s\n*****\n%s\n*****\n", replacesDir+"example-input.md", string(input))
		}
		return content, nil
	},
}

var removeMainTf = info.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		removeBytes := []byte(" in `main.tf` in a configuration directory")
		return bytes.ReplaceAll(content, removeBytes, nil), nil
	},
}

//go:embed cmd/pulumi-resource-snowflake/bridge-metadata.json
var metadata []byte
