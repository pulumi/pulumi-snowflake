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
//			_, err := snowflake.GetMaterializedViews(ctx, &snowflake.GetMaterializedViewsArgs{
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
func GetMaterializedViews(ctx *pulumi.Context, args *GetMaterializedViewsArgs, opts ...pulumi.InvokeOption) (*GetMaterializedViewsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMaterializedViewsResult
	err := ctx.Invoke("snowflake:index/getMaterializedViews:getMaterializedViews", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMaterializedViews.
type GetMaterializedViewsArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the views from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getMaterializedViews.
type GetMaterializedViewsResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The views in the schema
	MaterializedViews []GetMaterializedViewsMaterializedView `pulumi:"materializedViews"`
	// The schema from which to return the views from.
	Schema string `pulumi:"schema"`
}

func GetMaterializedViewsOutput(ctx *pulumi.Context, args GetMaterializedViewsOutputArgs, opts ...pulumi.InvokeOption) GetMaterializedViewsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMaterializedViewsResultOutput, error) {
			args := v.(GetMaterializedViewsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getMaterializedViews:getMaterializedViews", args, GetMaterializedViewsResultOutput{}, options).(GetMaterializedViewsResultOutput), nil
		}).(GetMaterializedViewsResultOutput)
}

// A collection of arguments for invoking getMaterializedViews.
type GetMaterializedViewsOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the views from.
	Schema pulumi.StringInput `pulumi:"schema"`
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

// The database from which to return the schemas from.
func (o GetMaterializedViewsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMaterializedViewsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The views in the schema
func (o GetMaterializedViewsResultOutput) MaterializedViews() GetMaterializedViewsMaterializedViewArrayOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) []GetMaterializedViewsMaterializedView { return v.MaterializedViews }).(GetMaterializedViewsMaterializedViewArrayOutput)
}

// The schema from which to return the views from.
func (o GetMaterializedViewsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMaterializedViewsResultOutput{})
}
