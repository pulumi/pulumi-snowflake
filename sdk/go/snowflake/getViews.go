// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source used to get details of filtered views. Filtering is aligned with the current possibilities for [SHOW VIEWS](https://docs.snowflake.com/en/sql-reference/sql/show-views) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `views`.
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
	// IN clause to filter the list of views
	In *GetViewsIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetViewsLimit `pulumi:"limit"`
	// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
	StartsWith *string `pulumi:"startsWith"`
	// (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

// A collection of values returned by getViews.
type GetViewsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IN clause to filter the list of views
	In *GetViewsIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetViewsLimit `pulumi:"limit"`
	// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
	StartsWith *string `pulumi:"startsWith"`
	// Holds the aggregated output of all views details queries.
	Views []GetViewsView `pulumi:"views"`
	// (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

func GetViewsOutput(ctx *pulumi.Context, args GetViewsOutputArgs, opts ...pulumi.InvokeOption) GetViewsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetViewsResultOutput, error) {
			args := v.(GetViewsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getViews:getViews", args, GetViewsResultOutput{}, options).(GetViewsResultOutput), nil
		}).(GetViewsResultOutput)
}

// A collection of arguments for invoking getViews.
type GetViewsOutputArgs struct {
	// IN clause to filter the list of views
	In GetViewsInPtrInput `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit GetViewsLimitPtrInput `pulumi:"limit"`
	// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
	StartsWith pulumi.StringPtrInput `pulumi:"startsWith"`
	// (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe pulumi.BoolPtrInput `pulumi:"withDescribe"`
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

// The provider-assigned unique ID for this managed resource.
func (o GetViewsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.Id }).(pulumi.StringOutput)
}

// IN clause to filter the list of views
func (o GetViewsResultOutput) In() GetViewsInPtrOutput {
	return o.ApplyT(func(v GetViewsResult) *GetViewsIn { return v.In }).(GetViewsInPtrOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetViewsResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetViewsResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
func (o GetViewsResultOutput) Limit() GetViewsLimitPtrOutput {
	return o.ApplyT(func(v GetViewsResult) *GetViewsLimit { return v.Limit }).(GetViewsLimitPtrOutput)
}

// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
func (o GetViewsResultOutput) StartsWith() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetViewsResult) *string { return v.StartsWith }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all views details queries.
func (o GetViewsResultOutput) Views() GetViewsViewArrayOutput {
	return o.ApplyT(func(v GetViewsResult) []GetViewsView { return v.Views }).(GetViewsViewArrayOutput)
}

// (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
func (o GetViewsResultOutput) WithDescribe() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetViewsResult) *bool { return v.WithDescribe }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetViewsResultOutput{})
}
