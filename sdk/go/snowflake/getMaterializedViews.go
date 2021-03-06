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
// 		_, err := snowflake.GetMaterializedViews(ctx, &GetMaterializedViewsArgs{
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
func GetMaterializedViews(ctx *pulumi.Context, args *GetMaterializedViewsArgs, opts ...pulumi.InvokeOption) (*GetMaterializedViewsResult, error) {
	var rv GetMaterializedViewsResult
	err := ctx.Invoke("snowflake:index/getMaterializedViews:getMaterializedViews", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMaterializedViews.
type GetMaterializedViewsArgs struct {
	Database string `pulumi:"database"`
	Schema   string `pulumi:"schema"`
}

// A collection of values returned by getMaterializedViews.
type GetMaterializedViewsResult struct {
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id                string                                 `pulumi:"id"`
	MaterializedViews []GetMaterializedViewsMaterializedView `pulumi:"materializedViews"`
	Schema            string                                 `pulumi:"schema"`
}

func GetMaterializedViewsOutput(ctx *pulumi.Context, args GetMaterializedViewsOutputArgs, opts ...pulumi.InvokeOption) GetMaterializedViewsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetMaterializedViewsResult, error) {
			args := v.(GetMaterializedViewsArgs)
			r, err := GetMaterializedViews(ctx, &args, opts...)
			var s GetMaterializedViewsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetMaterializedViewsResultOutput)
}

// A collection of arguments for invoking getMaterializedViews.
type GetMaterializedViewsOutputArgs struct {
	Database pulumi.StringInput `pulumi:"database"`
	Schema   pulumi.StringInput `pulumi:"schema"`
}

func (GetMaterializedViewsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMaterializedViewsArgs)(nil)).Elem()
}

// A collection of values returned by getMaterializedViews.
type GetMaterializedViewsResultOutput struct{ *pulumi.OutputState }

func (GetMaterializedViewsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMaterializedViewsResult)(nil)).Elem()
}

func (o GetMaterializedViewsResultOutput) ToGetMaterializedViewsResultOutput() GetMaterializedViewsResultOutput {
	return o
}

func (o GetMaterializedViewsResultOutput) ToGetMaterializedViewsResultOutputWithContext(ctx context.Context) GetMaterializedViewsResultOutput {
	return o
}

func (o GetMaterializedViewsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMaterializedViewsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetMaterializedViewsResultOutput) MaterializedViews() GetMaterializedViewsMaterializedViewArrayOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) []GetMaterializedViewsMaterializedView { return v.MaterializedViews }).(GetMaterializedViewsMaterializedViewArrayOutput)
}

func (o GetMaterializedViewsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMaterializedViewsResultOutput{})
}
