// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ssm"
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			this, err := snowflake.GetCurrentAccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ssm.NewParameter(ctx, "snowflakeAccountUrl", &ssm.ParameterArgs{
//				Type:  pulumi.String(ssm.ParameterTypeString),
//				Value: pulumi.String(this.Url),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetCurrentAccount(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetCurrentAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCurrentAccountResult
	err := ctx.Invoke("snowflake:index/getCurrentAccount:getCurrentAccount", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getCurrentAccount.
type GetCurrentAccountResult struct {
	// The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
	Account string `pulumi:"account"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Snowflake Region; as returned by CURRENT_REGION()
	Region string `pulumi:"region"`
	// The Snowflake URL.
	Url string `pulumi:"url"`
}

func GetCurrentAccountOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetCurrentAccountResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetCurrentAccountResult, error) {
		r, err := GetCurrentAccount(ctx, opts...)
		var s GetCurrentAccountResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetCurrentAccountResultOutput)
}

// A collection of values returned by getCurrentAccount.
type GetCurrentAccountResultOutput struct{ *pulumi.OutputState }

func (GetCurrentAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCurrentAccountResult)(nil)).Elem()
}

func (o GetCurrentAccountResultOutput) ToGetCurrentAccountResultOutput() GetCurrentAccountResultOutput {
	return o
}

func (o GetCurrentAccountResultOutput) ToGetCurrentAccountResultOutputWithContext(ctx context.Context) GetCurrentAccountResultOutput {
	return o
}

// The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
func (o GetCurrentAccountResultOutput) Account() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentAccountResult) string { return v.Account }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCurrentAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Snowflake Region; as returned by CURRENT_REGION()
func (o GetCurrentAccountResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentAccountResult) string { return v.Region }).(pulumi.StringOutput)
}

// The Snowflake URL.
func (o GetCurrentAccountResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentAccountResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCurrentAccountResultOutput{})
}
