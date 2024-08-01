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
	"fmt"
	"path/filepath"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	snowflake "github.com/Snowflake-Labs/terraform-provider-snowflake/pkg/provider"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-snowflake/provider/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "snowflake"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(snowflake.Provider(),
		shimv2.WithPlanResourceChange(func(_ string) bool { return true }),
	)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "snowflake",
		Description: "A Pulumi package for creating and managing snowflake cloud resources.",
		Keywords:    []string{"pulumi", "snowflake"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "Snowflake-Labs",
		Repository:  "https://github.com/pulumi/pulumi-snowflake",
		Config: map[string]*tfbridge.SchemaInfo{
			"account": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_ACCOUNT"}},
			},
			"username": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_USER"}},
			},
			"password": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_PASSWORD"}},
			},
			"oauth_access_token": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_OAUTH_ACCESS_TOKEN"}},
			},
			"oauth_refresh_token": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_OAUTH_REFRESH_TOKEN"}},
			},
			"oauth_client_id": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_OAUTH_CLIENT_ID"}},
			},
			"oauth_client_secret": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_OAUTH_CLIENT_SECRET"}},
			},
			"oauth_endpoint": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_OAUTH_ENDPOINT"}},
			},
			"oauth_redirect_url": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_OAUTH_REDIRECT_URL"}},
			},
			"browser_auth": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_USE_BROWSER_AUTH"}},
			},
			"private_key_path": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_PRIVATE_KEY_PATH"}},
			},
			"private_key_passphrase": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_PRIVATE_KEY_PASSPHRASE"}},
			},
			"role": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_ROLE"}},
			},
			"region": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_REGION"}},
			},
			"host": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_HOST"}},
			},
			"port": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_PORT"}},
			},
			"protocol": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_PROTOCOL"}},
			},
			"warehouse": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"SNOWFLAKE_WAREHOUSE"}},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Because "privatelink" is translated to "PrivateLink", this must be manually mapped.
			"snowflake_system_get_privatelink_config": {Tok: makeDataSource(mainMod, "getSystemGetPrivateLinkConfig")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				},
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule("snowflake_",
		mainMod, tfbridgetokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-snowflake/bridge-metadata.json
var metadata []byte
