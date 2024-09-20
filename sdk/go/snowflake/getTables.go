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
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTablesResultOutput, error) {
			args := v.(GetTablesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetTablesResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getTables:getTables", args, &rv, "", opts...)
			if err != nil {
				return GetTablesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetTablesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetTablesResultOutput), nil
			}
			return output, nil
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
