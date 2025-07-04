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
// Data source used to get details of filtered services. Filtering is aligned with the current possibilities for [SHOW SERVICES](https://docs.snowflake.com/en/sql-reference/sql/show-services) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `services`. By default, the results includes both services and job services. If you want to filter only services or job service, set `serviceType` with a relevant option.
func GetServices(ctx *pulumi.Context, args *GetServicesArgs, opts ...pulumi.InvokeOption) (*GetServicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServicesResult
	err := ctx.Invoke("snowflake:index/getServices:getServices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServices.
type GetServicesArgs struct {
	// IN clause to filter the list of objects
	In *GetServicesIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetServicesLimit `pulumi:"limit"`
	// (Default: `ALL`) The type filtering of `SHOW SERVICES` results. `ALL` returns both services and job services. `JOBS_ONLY` returns only job services (`JOB` option in SQL). `SERVICES_ONLY` returns only services (`EXCLUDE_JOBS` option in SQL).
	ServiceType *string `pulumi:"serviceType"`
	// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
	StartsWith *string `pulumi:"startsWith"`
	// (Default: `true`) Runs DESC SERVICE for each service returned by SHOW SERVICES. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

// A collection of values returned by getServices.
type GetServicesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IN clause to filter the list of objects
	In *GetServicesIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetServicesLimit `pulumi:"limit"`
	// (Default: `ALL`) The type filtering of `SHOW SERVICES` results. `ALL` returns both services and job services. `JOBS_ONLY` returns only job services (`JOB` option in SQL). `SERVICES_ONLY` returns only services (`EXCLUDE_JOBS` option in SQL).
	ServiceType *string `pulumi:"serviceType"`
	// Holds the aggregated output of all services details queries.
	Services []GetServicesService `pulumi:"services"`
	// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
	StartsWith *string `pulumi:"startsWith"`
	// (Default: `true`) Runs DESC SERVICE for each service returned by SHOW SERVICES. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

func GetServicesOutput(ctx *pulumi.Context, args GetServicesOutputArgs, opts ...pulumi.InvokeOption) GetServicesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetServicesResultOutput, error) {
			args := v.(GetServicesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getServices:getServices", args, GetServicesResultOutput{}, options).(GetServicesResultOutput), nil
		}).(GetServicesResultOutput)
}

// A collection of arguments for invoking getServices.
type GetServicesOutputArgs struct {
	// IN clause to filter the list of objects
	In GetServicesInPtrInput `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit GetServicesLimitPtrInput `pulumi:"limit"`
	// (Default: `ALL`) The type filtering of `SHOW SERVICES` results. `ALL` returns both services and job services. `JOBS_ONLY` returns only job services (`JOB` option in SQL). `SERVICES_ONLY` returns only services (`EXCLUDE_JOBS` option in SQL).
	ServiceType pulumi.StringPtrInput `pulumi:"serviceType"`
	// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
	StartsWith pulumi.StringPtrInput `pulumi:"startsWith"`
	// (Default: `true`) Runs DESC SERVICE for each service returned by SHOW SERVICES. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe pulumi.BoolPtrInput `pulumi:"withDescribe"`
}

func (GetServicesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicesArgs)(nil)).Elem()
}

// A collection of values returned by getServices.
type GetServicesResultOutput struct{ *pulumi.OutputState }

func (GetServicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicesResult)(nil)).Elem()
}

func (o GetServicesResultOutput) ToGetServicesResultOutput() GetServicesResultOutput {
	return o
}

func (o GetServicesResultOutput) ToGetServicesResultOutputWithContext(ctx context.Context) GetServicesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicesResult) string { return v.Id }).(pulumi.StringOutput)
}

// IN clause to filter the list of objects
func (o GetServicesResultOutput) In() GetServicesInPtrOutput {
	return o.ApplyT(func(v GetServicesResult) *GetServicesIn { return v.In }).(GetServicesInPtrOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetServicesResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServicesResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
func (o GetServicesResultOutput) Limit() GetServicesLimitPtrOutput {
	return o.ApplyT(func(v GetServicesResult) *GetServicesLimit { return v.Limit }).(GetServicesLimitPtrOutput)
}

// (Default: `ALL`) The type filtering of `SHOW SERVICES` results. `ALL` returns both services and job services. `JOBS_ONLY` returns only job services (`JOB` option in SQL). `SERVICES_ONLY` returns only services (`EXCLUDE_JOBS` option in SQL).
func (o GetServicesResultOutput) ServiceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServicesResult) *string { return v.ServiceType }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all services details queries.
func (o GetServicesResultOutput) Services() GetServicesServiceArrayOutput {
	return o.ApplyT(func(v GetServicesResult) []GetServicesService { return v.Services }).(GetServicesServiceArrayOutput)
}

// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
func (o GetServicesResultOutput) StartsWith() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServicesResult) *string { return v.StartsWith }).(pulumi.StringPtrOutput)
}

// (Default: `true`) Runs DESC SERVICE for each service returned by SHOW SERVICES. The output of describe is saved to the description field. By default this value is set to true.
func (o GetServicesResultOutput) WithDescribe() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetServicesResult) *bool { return v.WithDescribe }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServicesResultOutput{})
}
