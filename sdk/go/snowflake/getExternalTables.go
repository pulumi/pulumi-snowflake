// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := snowflake.GetExternalTables(ctx, &GetExternalTablesArgs{
// 			Database: "MYDB",
// 			Schema:   "MYSCHEMA",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetExternalTables(ctx *pulumi.Context, args *GetExternalTablesArgs, opts ...pulumi.InvokeOption) (*GetExternalTablesResult, error) {
	var rv GetExternalTablesResult
	err := ctx.Invoke("snowflake:index/getExternalTables:getExternalTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExternalTables.
type GetExternalTablesArgs struct {
	Database string `pulumi:"database"`
	Schema   string `pulumi:"schema"`
}

// A collection of values returned by getExternalTables.
type GetExternalTablesResult struct {
	Database       string                           `pulumi:"database"`
	ExternalTables []GetExternalTablesExternalTable `pulumi:"externalTables"`
	// The provider-assigned unique ID for this managed resource.
	Id     string `pulumi:"id"`
	Schema string `pulumi:"schema"`
}

func GetExternalTablesOutput(ctx *pulumi.Context, args GetExternalTablesOutputArgs, opts ...pulumi.InvokeOption) GetExternalTablesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetExternalTablesResult, error) {
			args := v.(GetExternalTablesArgs)
			r, err := GetExternalTables(ctx, &args, opts...)
			var s GetExternalTablesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetExternalTablesResultOutput)
}

// A collection of arguments for invoking getExternalTables.
type GetExternalTablesOutputArgs struct {
	Database pulumi.StringInput `pulumi:"database"`
	Schema   pulumi.StringInput `pulumi:"schema"`
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

func (o GetExternalTablesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalTablesResult) string { return v.Database }).(pulumi.StringOutput)
}

func (o GetExternalTablesResultOutput) ExternalTables() GetExternalTablesExternalTableArrayOutput {
	return o.ApplyT(func(v GetExternalTablesResult) []GetExternalTablesExternalTable { return v.ExternalTables }).(GetExternalTablesExternalTableArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetExternalTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetExternalTablesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalTablesResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetExternalTablesResultOutput{})
}
