// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetCurrentRole(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetCurrentRoleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCurrentRoleResult
	err := ctx.Invoke("snowflake:index/getCurrentRole:getCurrentRole", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getCurrentRole.
type GetCurrentRoleResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the [primary role](https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#label-access-control-role-enforcement) in use for the current session.
	Name string `pulumi:"name"`
}
