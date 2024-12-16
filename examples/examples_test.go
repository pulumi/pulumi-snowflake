package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	t.Skip("Skipping tests - not enough customer usage to justify integration tests of this provider")
	checkCreds(t)
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func checkCreds(t *testing.T) {
	if _, exists := os.LookupEnv("SNOWFLAKE_USER"); !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_USER environment variable")
	}

	if _, exists := os.LookupEnv("SNOWFLAKE_PASSWORD"); !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_PASSWORD environment variable")
	}

	if _, exists := os.LookupEnv("SNOWFLAKE_ACCOUNT"); !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_ACCOUNT environment variable")
	}

	if _, exists := os.LookupEnv("SNOWFLAKE_ROLE"); !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_ROLE environment variable")
	}

	if _, exists := os.LookupEnv("SNOWFLAKE_REGION"); !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_REGION environment variable")
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}
