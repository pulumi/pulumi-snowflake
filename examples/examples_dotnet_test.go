// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
// +build dotnet all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccUserCSharp(t *testing.T) {
	test := getCsharpBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "user", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getCsharpBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseCsharp := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.Snowflake",
		},
	})

	return baseCsharp
}
