// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source used to get details of filtered security integrations. Filtering is aligned with the current possibilities for [SHOW SECURITY INTEGRATIONS](https://docs.snowflake.com/en/sql-reference/sql/show-integrations) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `securityIntegrations`.
func GetSecurityIntegrations(ctx *pulumi.Context, args *GetSecurityIntegrationsArgs, opts ...pulumi.InvokeOption) (*GetSecurityIntegrationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecurityIntegrationsResult
	err := ctx.Invoke("snowflake:index/getSecurityIntegrations:getSecurityIntegrations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecurityIntegrations.
type GetSecurityIntegrationsArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

// A collection of values returned by getSecurityIntegrations.
type GetSecurityIntegrationsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Holds the aggregated output of all security integrations details queries.
	SecurityIntegrations []GetSecurityIntegrationsSecurityIntegration `pulumi:"securityIntegrations"`
	// Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

func GetSecurityIntegrationsOutput(ctx *pulumi.Context, args GetSecurityIntegrationsOutputArgs, opts ...pulumi.InvokeOption) GetSecurityIntegrationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSecurityIntegrationsResultOutput, error) {
			args := v.(GetSecurityIntegrationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getSecurityIntegrations:getSecurityIntegrations", args, GetSecurityIntegrationsResultOutput{}, options).(GetSecurityIntegrationsResultOutput), nil
		}).(GetSecurityIntegrationsResultOutput)
}

// A collection of arguments for invoking getSecurityIntegrations.
type GetSecurityIntegrationsOutputArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe pulumi.BoolPtrInput `pulumi:"withDescribe"`
}

func (GetSecurityIntegrationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityIntegrationsArgs)(nil)).Elem()
}

// A collection of values returned by getSecurityIntegrations.
type GetSecurityIntegrationsResultOutput struct{ *pulumi.OutputState }

func (GetSecurityIntegrationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityIntegrationsResult)(nil)).Elem()
}

func (o GetSecurityIntegrationsResultOutput) ToGetSecurityIntegrationsResultOutput() GetSecurityIntegrationsResultOutput {
	return o
}

func (o GetSecurityIntegrationsResultOutput) ToGetSecurityIntegrationsResultOutputWithContext(ctx context.Context) GetSecurityIntegrationsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecurityIntegrationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecurityIntegrationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetSecurityIntegrationsResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityIntegrationsResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all security integrations details queries.
func (o GetSecurityIntegrationsResultOutput) SecurityIntegrations() GetSecurityIntegrationsSecurityIntegrationArrayOutput {
	return o.ApplyT(func(v GetSecurityIntegrationsResult) []GetSecurityIntegrationsSecurityIntegration {
		return v.SecurityIntegrations
	}).(GetSecurityIntegrationsSecurityIntegrationArrayOutput)
}

// Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
func (o GetSecurityIntegrationsResultOutput) WithDescribe() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSecurityIntegrationsResult) *bool { return v.WithDescribe }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecurityIntegrationsResultOutput{})
}
