// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetShares(ctx *pulumi.Context, args *GetSharesArgs, opts ...pulumi.InvokeOption) (*GetSharesResult, error) {
	var rv GetSharesResult
	err := ctx.Invoke("snowflake:index/getShares:getShares", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getShares.
type GetSharesArgs struct {
	// Filters the command output by object name.
	Pattern *string `pulumi:"pattern"`
}

// A collection of values returned by getShares.
type GetSharesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the command output by object name.
	Pattern *string `pulumi:"pattern"`
	// List of all the shares available in the system.
	Shares []GetSharesShare `pulumi:"shares"`
}

func GetSharesOutput(ctx *pulumi.Context, args GetSharesOutputArgs, opts ...pulumi.InvokeOption) GetSharesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSharesResult, error) {
			args := v.(GetSharesArgs)
			r, err := GetShares(ctx, &args, opts...)
			var s GetSharesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSharesResultOutput)
}

// A collection of arguments for invoking getShares.
type GetSharesOutputArgs struct {
	// Filters the command output by object name.
	Pattern pulumi.StringPtrInput `pulumi:"pattern"`
}

func (GetSharesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharesArgs)(nil)).Elem()
}

// A collection of values returned by getShares.
type GetSharesResultOutput struct{ *pulumi.OutputState }

func (GetSharesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharesResult)(nil)).Elem()
}

func (o GetSharesResultOutput) ToGetSharesResultOutput() GetSharesResultOutput {
	return o
}

func (o GetSharesResultOutput) ToGetSharesResultOutputWithContext(ctx context.Context) GetSharesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSharesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the command output by object name.
func (o GetSharesResultOutput) Pattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSharesResult) *string { return v.Pattern }).(pulumi.StringPtrOutput)
}

// List of all the shares available in the system.
func (o GetSharesResultOutput) Shares() GetSharesShareArrayOutput {
	return o.ApplyT(func(v GetSharesResult) []GetSharesShare { return v.Shares }).(GetSharesShareArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSharesResultOutput{})
}