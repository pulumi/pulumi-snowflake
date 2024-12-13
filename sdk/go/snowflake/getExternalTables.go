// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
//
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
//			_, err := snowflake.GetExternalTables(ctx, &snowflake.GetExternalTablesArgs{
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
func GetExternalTables(ctx *pulumi.Context, args *GetExternalTablesArgs, opts ...pulumi.InvokeOption) (*GetExternalTablesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetExternalTablesResult
	err := ctx.Invoke("snowflake:index/getExternalTables:getExternalTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExternalTables.
type GetExternalTablesArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the external tables from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getExternalTables.
type GetExternalTablesResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The external tables in the schema
	ExternalTables []GetExternalTablesExternalTable `pulumi:"externalTables"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the external tables from.
	Schema string `pulumi:"schema"`
}

func GetExternalTablesOutput(ctx *pulumi.Context, args GetExternalTablesOutputArgs, opts ...pulumi.InvokeOption) GetExternalTablesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetExternalTablesResultOutput, error) {
			args := v.(GetExternalTablesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getExternalTables:getExternalTables", args, GetExternalTablesResultOutput{}, options).(GetExternalTablesResultOutput), nil
		}).(GetExternalTablesResultOutput)
}

// A collection of arguments for invoking getExternalTables.
type GetExternalTablesOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the external tables from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetExternalTablesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExternalTablesArgs)(nil)).Elem()
}

// A collection of values returned by getExternalTables.
type GetExternalTablesResultOutput struct{ *pulumi.OutputState }

func (GetExternalTablesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExternalTablesResult)(nil)).Elem()
}

func (o GetExternalTablesResultOutput) ToGetExternalTablesResultOutput() GetExternalTablesResultOutput {
	return o
}

func (o GetExternalTablesResultOutput) ToGetExternalTablesResultOutputWithContext(ctx context.Context) GetExternalTablesResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetExternalTablesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalTablesResult) string { return v.Database }).(pulumi.StringOutput)
}

// The external tables in the schema
func (o GetExternalTablesResultOutput) ExternalTables() GetExternalTablesExternalTableArrayOutput {
	return o.ApplyT(func(v GetExternalTablesResult) []GetExternalTablesExternalTable { return v.ExternalTables }).(GetExternalTablesExternalTableArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetExternalTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the external tables from.
func (o GetExternalTablesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalTablesResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetExternalTablesResultOutput{})
}
