package snowflake

import (
	"encoding/json"
	"os"
	"regexp"
	"strings"
	"testing"

	"github.com/Snowflake-Labs/terraform-provider-snowflake/pkg/provider/previewfeatures"
	"github.com/stretchr/testify/require"
)

var (
	// Accept both the local HTML escape and normal Markdown code if the bridge later preserves literal values.
	previewFeatureValuePattern = regexp.MustCompile(
		`<code>(snowflake_[a-z0-9_]+_(?:resource|datasource))</code>` +
			"|`(snowflake_[a-z0-9_]+_(?:resource|datasource))`",
	)
	convertedPreviewFeatureValuePattern = regexp.MustCompile(`snowflake[A-Z][A-Za-z0-9]*`)
)

func TestPreviewFeatureValuesArePreservedInGeneratedDocs(t *testing.T) {
	registryDocs, err := os.ReadFile("../docs/_index.md")
	require.NoError(t, err)

	var schema struct {
		Config struct {
			Variables map[string]struct {
				Description string `json:"description"`
			} `json:"variables"`
		} `json:"config"`
		Provider struct {
			Properties map[string]struct {
				Description string `json:"description"`
			} `json:"properties"`
			InputProperties map[string]struct {
				Description string `json:"description"`
			} `json:"inputProperties"`
		} `json:"provider"`
	}
	schemaJSON, err := os.ReadFile("cmd/pulumi-resource-snowflake/schema.json")
	require.NoError(t, err)
	require.NoError(t, json.Unmarshal(schemaJSON, &schema))

	descriptions := map[string]string{
		"registry":        registryPreviewFeaturesDescription(t, string(registryDocs)),
		"config schema":   schema.Config.Variables["previewFeaturesEnabled"].Description,
		"provider output": schema.Provider.Properties["previewFeaturesEnabled"].Description,
		"provider input":  schema.Provider.InputProperties["previewFeaturesEnabled"].Description,
	}

	for name, description := range descriptions {
		t.Run(name, func(t *testing.T) {
			matches := previewFeatureValuePattern.FindAllStringSubmatch(description, -1)
			actual := make([]string, 0, len(matches))
			for _, match := range matches {
				if match[1] != "" {
					actual = append(actual, match[1])
				} else {
					actual = append(actual, match[2])
				}
			}

			require.Len(t, actual, len(previewfeatures.ValidPreviewFeatures))
			require.ElementsMatch(t, previewfeatures.ValidPreviewFeatures, actual)
			require.NotRegexp(t, convertedPreviewFeatureValuePattern, description)
		})
	}
}

func registryPreviewFeaturesDescription(t *testing.T, docs string) string {
	t.Helper()

	const prefix = "- `previewFeaturesEnabled`"
	start := strings.Index(docs, prefix)
	require.NotEqual(t, -1, start, "could not find previewFeaturesEnabled in Registry docs")

	end := strings.IndexByte(docs[start:], '\n')
	require.NotEqual(t, -1, end, "could not find end of previewFeaturesEnabled description")
	return docs[start : start+end]
}
