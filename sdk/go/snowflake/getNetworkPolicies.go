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
// Datasource used to get details of filtered network policies. Filtering is aligned with the current possibilities for [SHOW NETWORK POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-network-policies) query (`like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection.
func GetNetworkPolicies(ctx *pulumi.Context, args *GetNetworkPoliciesArgs, opts ...pulumi.InvokeOption) (*GetNetworkPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworkPoliciesResult
	err := ctx.Invoke("snowflake:index/getNetworkPolicies:getNetworkPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkPolicies.
type GetNetworkPoliciesArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Runs DESC NETWORK POLICY for each network policy returned by SHOW NETWORK POLICIES. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

// A collection of values returned by getNetworkPolicies.
type GetNetworkPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Holds the aggregated output of all network policies details queries.
	NetworkPolicies []GetNetworkPoliciesNetworkPolicy `pulumi:"networkPolicies"`
	// Runs DESC NETWORK POLICY for each network policy returned by SHOW NETWORK POLICIES. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

func GetNetworkPoliciesOutput(ctx *pulumi.Context, args GetNetworkPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetNetworkPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworkPoliciesResult, error) {
			args := v.(GetNetworkPoliciesArgs)
			r, err := GetNetworkPolicies(ctx, &args, opts...)
			var s GetNetworkPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworkPoliciesResultOutput)
}

// A collection of arguments for invoking getNetworkPolicies.
type GetNetworkPoliciesOutputArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Runs DESC NETWORK POLICY for each network policy returned by SHOW NETWORK POLICIES. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe pulumi.BoolPtrInput `pulumi:"withDescribe"`
}

func (GetNetworkPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkPolicies.
type GetNetworkPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetNetworkPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkPoliciesResult)(nil)).Elem()
}

func (o GetNetworkPoliciesResultOutput) ToGetNetworkPoliciesResultOutput() GetNetworkPoliciesResultOutput {
	return o
}

func (o GetNetworkPoliciesResultOutput) ToGetNetworkPoliciesResultOutputWithContext(ctx context.Context) GetNetworkPoliciesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworkPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetNetworkPoliciesResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkPoliciesResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all network policies details queries.
func (o GetNetworkPoliciesResultOutput) NetworkPolicies() GetNetworkPoliciesNetworkPolicyArrayOutput {
	return o.ApplyT(func(v GetNetworkPoliciesResult) []GetNetworkPoliciesNetworkPolicy { return v.NetworkPolicies }).(GetNetworkPoliciesNetworkPolicyArrayOutput)
}

// Runs DESC NETWORK POLICY for each network policy returned by SHOW NETWORK POLICIES. The output of describe is saved to the description field. By default this value is set to true.
func (o GetNetworkPoliciesResultOutput) WithDescribe() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNetworkPoliciesResult) *bool { return v.WithDescribe }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworkPoliciesResultOutput{})
}
