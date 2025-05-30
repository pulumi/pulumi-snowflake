// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.GetTables(ctx, &snowflake.GetTablesArgs{
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
//
// > **Note** If a field has a default value, it is shown next to the type in the schema.
func GetTables(ctx *pulumi.Context, args *GetTablesArgs, opts ...pulumi.InvokeOption) (*GetTablesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTablesResult
	err := ctx.Invoke("snowflake:index/getTables:getTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTables.
type GetTablesArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the tables from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getTables.
type GetTablesResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the tables from.
	Schema string `pulumi:"schema"`
	// The tables in the schema
	Tables []GetTablesTable `pulumi:"tables"`
}

func GetTablesOutput(ctx *pulumi.Context, args GetTablesOutputArgs, opts ...pulumi.InvokeOption) GetTablesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTablesResultOutput, error) {
			args := v.(GetTablesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getTables:getTables", args, GetTablesResultOutput{}, options).(GetTablesResultOutput), nil
		}).(GetTablesResultOutput)
}

// A collection of arguments for invoking getTables.
type GetTablesOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the tables from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetTablesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTablesArgs)(nil)).Elem()
}

// A collection of values returned by getTables.
type GetTablesResultOutput struct{ *pulumi.OutputState }

func (GetTablesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTablesResult)(nil)).Elem()
}

func (o GetTablesResultOutput) ToGetTablesResultOutput() GetTablesResultOutput {
	return o
}

func (o GetTablesResultOutput) ToGetTablesResultOutputWithContext(ctx context.Context) GetTablesResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetTablesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetTablesResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the tables from.
func (o GetTablesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetTablesResult) string { return v.Schema }).(pulumi.StringOutput)
}

// The tables in the schema
func (o GetTablesResultOutput) Tables() GetTablesTableArrayOutput {
	return o.ApplyT(func(v GetTablesResult) []GetTablesTable { return v.Tables }).(GetTablesTableArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTablesResultOutput{})
}
