package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	checkCreds(t)
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func checkCreds(t *testing.T) {
	_, exists := os.LookupEnv("SNOWFLAKE_USER")
	if !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_USER environment variable")
	}

	_, exists = os.LookupEnv("SNOWFLAKE_PASSWORD")
	if !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_PASSWORD environment variable")
	}

	_, exists = os.LookupEnv("SNOWFLAKE_ACCOUNT")
	if !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_ACCOUNT environment variable")
	}

	_, exists = os.LookupEnv("SNOWFLAKE_ROLE")
	if !exists {
		t.Skipf("Skipping test due to missing SNOWFLAKE_ROLE environment variable")
	}

	_, exists = os.LookupEnv("SNOWFLAKE_REGION")
	if !exists {
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
