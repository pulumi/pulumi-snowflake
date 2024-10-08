// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **V1 release candidate** This datasource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
//
// Datasource used to get details of filtered roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `inClass` are all supported). The results of SHOW are encapsulated in one output collection.
func GetRoles(ctx *pulumi.Context, args *GetRolesArgs, opts ...pulumi.InvokeOption) (*GetRolesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRolesResult
	err := ctx.Invoke("snowflake:index/getRoles:getRoles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoles.
type GetRolesArgs struct {
	// Filters the SHOW GRANTS output by class name.
	InClass *string `pulumi:"inClass"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
}

// A collection of values returned by getRoles.
type GetRolesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the SHOW GRANTS output by class name.
	InClass *string `pulumi:"inClass"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Holds the aggregated output of all role details queries.
	Roles []GetRolesRole `pulumi:"roles"`
}

func GetRolesOutput(ctx *pulumi.Context, args GetRolesOutputArgs, opts ...pulumi.InvokeOption) GetRolesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRolesResultOutput, error) {
			args := v.(GetRolesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetRolesResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getRoles:getRoles", args, &rv, "", opts...)
			if err != nil {
				return GetRolesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetRolesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetRolesResultOutput), nil
			}
			return output, nil
		}).(GetRolesResultOutput)
}

// A collection of arguments for invoking getRoles.
type GetRolesOutputArgs struct {
	// Filters the SHOW GRANTS output by class name.
	InClass pulumi.StringPtrInput `pulumi:"inClass"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
}

func (GetRolesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRolesArgs)(nil)).Elem()
}

// A collection of values returned by getRoles.
type GetRolesResultOutput struct{ *pulumi.OutputState }

func (GetRolesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRolesResult)(nil)).Elem()
}

func (o GetRolesResultOutput) ToGetRolesResultOutput() GetRolesResultOutput {
	return o
}

func (o GetRolesResultOutput) ToGetRolesResultOutputWithContext(ctx context.Context) GetRolesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the SHOW GRANTS output by class name.
func (o GetRolesResultOutput) InClass() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRolesResult) *string { return v.InClass }).(pulumi.StringPtrOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetRolesResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRolesResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all role details queries.
func (o GetRolesResultOutput) Roles() GetRolesRoleArrayOutput {
	return o.ApplyT(func(v GetRolesResult) []GetRolesRole { return v.Roles }).(GetRolesRoleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRolesResultOutput{})
}
