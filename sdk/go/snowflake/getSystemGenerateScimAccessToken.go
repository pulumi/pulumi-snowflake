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
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.GetSystemGenerateScimAccessToken(ctx, &snowflake.GetSystemGenerateScimAccessTokenArgs{
//				IntegrationName: "AAD_PROVISIONING",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetSystemGenerateScimAccessToken(ctx *pulumi.Context, args *GetSystemGenerateScimAccessTokenArgs, opts ...pulumi.InvokeOption) (*GetSystemGenerateScimAccessTokenResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSystemGenerateScimAccessTokenResult
	err := ctx.Invoke("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSystemGenerateScimAccessToken.
type GetSystemGenerateScimAccessTokenArgs struct {
	// SCIM Integration Name
	IntegrationName string `pulumi:"integrationName"`
}

// A collection of values returned by getSystemGenerateScimAccessToken.
type GetSystemGenerateScimAccessTokenResult struct {
	// SCIM Access Token
	AccessToken string `pulumi:"accessToken"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// SCIM Integration Name
	IntegrationName string `pulumi:"integrationName"`
}

func GetSystemGenerateScimAccessTokenOutput(ctx *pulumi.Context, args GetSystemGenerateScimAccessTokenOutputArgs, opts ...pulumi.InvokeOption) GetSystemGenerateScimAccessTokenResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSystemGenerateScimAccessTokenResult, error) {
			args := v.(GetSystemGenerateScimAccessTokenArgs)
			r, err := GetSystemGenerateScimAccessToken(ctx, &args, opts...)
			var s GetSystemGenerateScimAccessTokenResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSystemGenerateScimAccessTokenResultOutput)
}

// A collection of arguments for invoking getSystemGenerateScimAccessToken.
type GetSystemGenerateScimAccessTokenOutputArgs struct {
	// SCIM Integration Name
	IntegrationName pulumi.StringInput `pulumi:"integrationName"`
}

func (GetSystemGenerateScimAccessTokenOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGenerateScimAccessTokenArgs)(nil)).Elem()
}

// A collection of values returned by getSystemGenerateScimAccessToken.
type GetSystemGenerateScimAccessTokenResultOutput struct{ *pulumi.OutputState }

func (GetSystemGenerateScimAccessTokenResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGenerateScimAccessTokenResult)(nil)).Elem()
}

func (o GetSystemGenerateScimAccessTokenResultOutput) ToGetSystemGenerateScimAccessTokenResultOutput() GetSystemGenerateScimAccessTokenResultOutput {
	return o
}

func (o GetSystemGenerateScimAccessTokenResultOutput) ToGetSystemGenerateScimAccessTokenResultOutputWithContext(ctx context.Context) GetSystemGenerateScimAccessTokenResultOutput {
	return o
}

// SCIM Access Token
func (o GetSystemGenerateScimAccessTokenResultOutput) AccessToken() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGenerateScimAccessTokenResult) string { return v.AccessToken }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSystemGenerateScimAccessTokenResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGenerateScimAccessTokenResult) string { return v.Id }).(pulumi.StringOutput)
}

// SCIM Integration Name
func (o GetSystemGenerateScimAccessTokenResultOutput) IntegrationName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGenerateScimAccessTokenResult) string { return v.IntegrationName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSystemGenerateScimAccessTokenResultOutput{})
}
