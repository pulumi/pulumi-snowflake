package main

import (
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := snowflake.NewProvider(
			ctx,
			"engcloud-ingest-user-provider",
			&snowflake.ProviderArgs{
				Account:  pulumi.String("snowhouse"),
				Region:   pulumi.String("us-west-2"),
				Role:     pulumi.String("my-role"),
				Username: pulumi.String("my-user"),
				Password: pulumi.String("my-secret-password"),
			})
		if err != nil {
			return err
		}
		return nil
	})
}
