// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
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
//			_, err := snowflake.GetViews(ctx, &snowflake.GetViewsArgs{
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
func GetViews(ctx *pulumi.Context, args *GetViewsArgs, opts ...pulumi.InvokeOption) (*GetViewsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetViewsResult
	err := ctx.Invoke("snowflake:index/getViews:getViews", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getViews.
type GetViewsArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the views from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getViews.
type GetViewsResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the views from.
	Schema string `pulumi:"schema"`
	// The views in the schema
	Views []GetViewsView `pulumi:"views"`
}

func GetViewsOutput(ctx *pulumi.Context, args GetViewsOutputArgs, opts ...pulumi.InvokeOption) GetViewsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetViewsResult, error) {
			args := v.(GetViewsArgs)
			r, err := GetViews(ctx, &args, opts...)
			var s GetViewsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetViewsResultOutput)
}

// A collection of arguments for invoking getViews.
type GetViewsOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the views from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetViewsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetViewsArgs)(nil)).Elem()
}

// A collection of values returned by getViews.
type GetViewsResultOutput struct{ *pulumi.OutputState }

func (GetViewsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetViewsResult)(nil)).Elem()
}

func (o GetViewsResultOutput) ToGetViewsResultOutput() GetViewsResultOutput {
	return o
}

func (o GetViewsResultOutput) ToGetViewsResultOutputWithContext(ctx context.Context) GetViewsResultOutput {
	return o
}

func (o GetViewsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetViewsResult] {
	return pulumix.Output[GetViewsResult]{
		OutputState: o.OutputState,
	}
}

// The database from which to return the schemas from.
func (o GetViewsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetViewsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the views from.
func (o GetViewsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.Schema }).(pulumi.StringOutput)
}

// The views in the schema
func (o GetViewsResultOutput) Views() GetViewsViewArrayOutput {
	return o.ApplyT(func(v GetViewsResult) []GetViewsView { return v.Views }).(GetViewsViewArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetViewsResultOutput{})
}
