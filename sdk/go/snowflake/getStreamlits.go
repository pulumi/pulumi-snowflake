// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
//
// Datasource used to get details of filtered streamlits. Filtering is aligned with the current possibilities for [SHOW STREAMLITS](https://docs.snowflake.com/en/sql-reference/sql/show-streamlits) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `streamlits`.
func GetStreamlits(ctx *pulumi.Context, args *GetStreamlitsArgs, opts ...pulumi.InvokeOption) (*GetStreamlitsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStreamlitsResult
	err := ctx.Invoke("snowflake:index/getStreamlits:getStreamlits", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamlits.
type GetStreamlitsArgs struct {
	// IN clause to filter the list of streamlits
	In *GetStreamlitsIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetStreamlitsLimit `pulumi:"limit"`
	// Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

// A collection of values returned by getStreamlits.
type GetStreamlitsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IN clause to filter the list of streamlits
	In *GetStreamlitsIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetStreamlitsLimit `pulumi:"limit"`
	// Holds the aggregated output of all streamlits details queries.
	Streamlits []GetStreamlitsStreamlit `pulumi:"streamlits"`
	// Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

func GetStreamlitsOutput(ctx *pulumi.Context, args GetStreamlitsOutputArgs, opts ...pulumi.InvokeOption) GetStreamlitsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStreamlitsResultOutput, error) {
			args := v.(GetStreamlitsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetStreamlitsResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getStreamlits:getStreamlits", args, &rv, "", opts...)
			if err != nil {
				return GetStreamlitsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetStreamlitsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetStreamlitsResultOutput), nil
			}
			return output, nil
		}).(GetStreamlitsResultOutput)
}

// A collection of arguments for invoking getStreamlits.
type GetStreamlitsOutputArgs struct {
	// IN clause to filter the list of streamlits
	In GetStreamlitsInPtrInput `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit GetStreamlitsLimitPtrInput `pulumi:"limit"`
	// Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe pulumi.BoolPtrInput `pulumi:"withDescribe"`
}

func (GetStreamlitsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStreamlitsArgs)(nil)).Elem()
}

// A collection of values returned by getStreamlits.
type GetStreamlitsResultOutput struct{ *pulumi.OutputState }

func (GetStreamlitsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStreamlitsResult)(nil)).Elem()
}

func (o GetStreamlitsResultOutput) ToGetStreamlitsResultOutput() GetStreamlitsResultOutput {
	return o
}

func (o GetStreamlitsResultOutput) ToGetStreamlitsResultOutputWithContext(ctx context.Context) GetStreamlitsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetStreamlitsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStreamlitsResult) string { return v.Id }).(pulumi.StringOutput)
}

// IN clause to filter the list of streamlits
func (o GetStreamlitsResultOutput) In() GetStreamlitsInPtrOutput {
	return o.ApplyT(func(v GetStreamlitsResult) *GetStreamlitsIn { return v.In }).(GetStreamlitsInPtrOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetStreamlitsResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStreamlitsResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
func (o GetStreamlitsResultOutput) Limit() GetStreamlitsLimitPtrOutput {
	return o.ApplyT(func(v GetStreamlitsResult) *GetStreamlitsLimit { return v.Limit }).(GetStreamlitsLimitPtrOutput)
}

// Holds the aggregated output of all streamlits details queries.
func (o GetStreamlitsResultOutput) Streamlits() GetStreamlitsStreamlitArrayOutput {
	return o.ApplyT(func(v GetStreamlitsResult) []GetStreamlitsStreamlit { return v.Streamlits }).(GetStreamlitsStreamlitArrayOutput)
}

// Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
func (o GetStreamlitsResultOutput) WithDescribe() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStreamlitsResult) *bool { return v.WithDescribe }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStreamlitsResultOutput{})
}
