// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.GetRowAccessPolicies(ctx, &snowflake.GetRowAccessPoliciesArgs{
//				Database: "MYDB",
//				Schema:   "MYSCHEMA",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetRowAccessPolicies(ctx *pulumi.Context, args *GetRowAccessPoliciesArgs, opts ...pulumi.InvokeOption) (*GetRowAccessPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRowAccessPoliciesResult
	err := ctx.Invoke("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRowAccessPolicies.
type GetRowAccessPoliciesArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the row access policy from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getRowAccessPolicies.
type GetRowAccessPoliciesResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The row access policy in the schema
	RowAccessPolicies []GetRowAccessPoliciesRowAccessPolicy `pulumi:"rowAccessPolicies"`
	// The schema from which to return the row access policy from.
	Schema string `pulumi:"schema"`
}

func GetRowAccessPoliciesOutput(ctx *pulumi.Context, args GetRowAccessPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetRowAccessPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRowAccessPoliciesResultOutput, error) {
			args := v.(GetRowAccessPoliciesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetRowAccessPoliciesResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", args, &rv, "", opts...)
			if err != nil {
				return GetRowAccessPoliciesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetRowAccessPoliciesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetRowAccessPoliciesResultOutput), nil
			}
			return output, nil
		}).(GetRowAccessPoliciesResultOutput)
}

// A collection of arguments for invoking getRowAccessPolicies.
type GetRowAccessPoliciesOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the row access policy from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetRowAccessPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRowAccessPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getRowAccessPolicies.
type GetRowAccessPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetRowAccessPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRowAccessPoliciesResult)(nil)).Elem()
}

func (o GetRowAccessPoliciesResultOutput) ToGetRowAccessPoliciesResultOutput() GetRowAccessPoliciesResultOutput {
	return o
}

func (o GetRowAccessPoliciesResultOutput) ToGetRowAccessPoliciesResultOutputWithContext(ctx context.Context) GetRowAccessPoliciesResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetRowAccessPoliciesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetRowAccessPoliciesResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRowAccessPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRowAccessPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The row access policy in the schema
func (o GetRowAccessPoliciesResultOutput) RowAccessPolicies() GetRowAccessPoliciesRowAccessPolicyArrayOutput {
	return o.ApplyT(func(v GetRowAccessPoliciesResult) []GetRowAccessPoliciesRowAccessPolicy { return v.RowAccessPolicies }).(GetRowAccessPoliciesRowAccessPolicyArrayOutput)
}

// The schema from which to return the row access policy from.
func (o GetRowAccessPoliciesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetRowAccessPoliciesResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRowAccessPoliciesResultOutput{})
}
