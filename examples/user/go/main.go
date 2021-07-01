package main

import (
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		user, err := snowflake.NewUser(ctx, "go-user", nil)
		if err != nil {
			return err
		}

		ctx.Export("username", user.Name)
	})
}
