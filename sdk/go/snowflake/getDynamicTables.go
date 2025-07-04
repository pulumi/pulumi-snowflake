// Code generated by pulumi-language-go DO NOT EDIT.
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
// > **Note** If a field has a default value, it is shown next to the type in the schema.
func GetDynamicTables(ctx *pulumi.Context, args *GetDynamicTablesArgs, opts ...pulumi.InvokeOption) (*GetDynamicTablesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDynamicTablesResult
	err := ctx.Invoke("snowflake:index/getDynamicTables:getDynamicTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDynamicTables.
type GetDynamicTablesArgs struct {
	// IN clause to filter the list of dynamic tables.
	In *GetDynamicTablesIn `pulumi:"in"`
	// LIKE clause to filter the list of dynamic tables.
	Like *GetDynamicTablesLike `pulumi:"like"`
	// Optionally limits the maximum number of rows returned, while also enabling “pagination” of the results. Note that the actual number of rows returned might be less than the specified limit (e.g. the number of existing objects is less than the specified limit).
	Limit *GetDynamicTablesLimit `pulumi:"limit"`
	// Optionally filters the command output based on the characters that appear at the beginning of the object name. The string is case-sensitive.
	StartsWith *string `pulumi:"startsWith"`
}

// A collection of values returned by getDynamicTables.
type GetDynamicTablesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IN clause to filter the list of dynamic tables.
	In *GetDynamicTablesIn `pulumi:"in"`
	// LIKE clause to filter the list of dynamic tables.
	Like *GetDynamicTablesLike `pulumi:"like"`
	// Optionally limits the maximum number of rows returned, while also enabling “pagination” of the results. Note that the actual number of rows returned might be less than the specified limit (e.g. the number of existing objects is less than the specified limit).
	Limit *GetDynamicTablesLimit `pulumi:"limit"`
	// The list of dynamic tables.
	Records []GetDynamicTablesRecord `pulumi:"records"`
	// Optionally filters the command output based on the characters that appear at the beginning of the object name. The string is case-sensitive.
	StartsWith *string `pulumi:"startsWith"`
}

func GetDynamicTablesOutput(ctx *pulumi.Context, args GetDynamicTablesOutputArgs, opts ...pulumi.InvokeOption) GetDynamicTablesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDynamicTablesResultOutput, error) {
			args := v.(GetDynamicTablesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getDynamicTables:getDynamicTables", args, GetDynamicTablesResultOutput{}, options).(GetDynamicTablesResultOutput), nil
		}).(GetDynamicTablesResultOutput)
}

// A collection of arguments for invoking getDynamicTables.
type GetDynamicTablesOutputArgs struct {
	// IN clause to filter the list of dynamic tables.
	In GetDynamicTablesInPtrInput `pulumi:"in"`
	// LIKE clause to filter the list of dynamic tables.
	Like GetDynamicTablesLikePtrInput `pulumi:"like"`
	// Optionally limits the maximum number of rows returned, while also enabling “pagination” of the results. Note that the actual number of rows returned might be less than the specified limit (e.g. the number of existing objects is less than the specified limit).
	Limit GetDynamicTablesLimitPtrInput `pulumi:"limit"`
	// Optionally filters the command output based on the characters that appear at the beginning of the object name. The string is case-sensitive.
	StartsWith pulumi.StringPtrInput `pulumi:"startsWith"`
}

func (GetDynamicTablesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDynamicTablesArgs)(nil)).Elem()
}

// A collection of values returned by getDynamicTables.
type GetDynamicTablesResultOutput struct{ *pulumi.OutputState }

func (GetDynamicTablesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDynamicTablesResult)(nil)).Elem()
}

func (o GetDynamicTablesResultOutput) ToGetDynamicTablesResultOutput() GetDynamicTablesResultOutput {
	return o
}

func (o GetDynamicTablesResultOutput) ToGetDynamicTablesResultOutputWithContext(ctx context.Context) GetDynamicTablesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDynamicTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDynamicTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

// IN clause to filter the list of dynamic tables.
func (o GetDynamicTablesResultOutput) In() GetDynamicTablesInPtrOutput {
	return o.ApplyT(func(v GetDynamicTablesResult) *GetDynamicTablesIn { return v.In }).(GetDynamicTablesInPtrOutput)
}

// LIKE clause to filter the list of dynamic tables.
func (o GetDynamicTablesResultOutput) Like() GetDynamicTablesLikePtrOutput {
	return o.ApplyT(func(v GetDynamicTablesResult) *GetDynamicTablesLike { return v.Like }).(GetDynamicTablesLikePtrOutput)
}

// Optionally limits the maximum number of rows returned, while also enabling “pagination” of the results. Note that the actual number of rows returned might be less than the specified limit (e.g. the number of existing objects is less than the specified limit).
func (o GetDynamicTablesResultOutput) Limit() GetDynamicTablesLimitPtrOutput {
	return o.ApplyT(func(v GetDynamicTablesResult) *GetDynamicTablesLimit { return v.Limit }).(GetDynamicTablesLimitPtrOutput)
}

// The list of dynamic tables.
func (o GetDynamicTablesResultOutput) Records() GetDynamicTablesRecordArrayOutput {
	return o.ApplyT(func(v GetDynamicTablesResult) []GetDynamicTablesRecord { return v.Records }).(GetDynamicTablesRecordArrayOutput)
}

// Optionally filters the command output based on the characters that appear at the beginning of the object name. The string is case-sensitive.
func (o GetDynamicTablesResultOutput) StartsWith() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicTablesResult) *string { return v.StartsWith }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDynamicTablesResultOutput{})
}
