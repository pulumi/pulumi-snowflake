// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetSystemGetSnowflakePlatformInfo(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetSystemGetSnowflakePlatformInfoResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSystemGetSnowflakePlatformInfoResult
	err := ctx.Invoke("snowflake:index/getSystemGetSnowflakePlatformInfo:getSystemGetSnowflakePlatformInfo", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getSystemGetSnowflakePlatformInfo.
type GetSystemGetSnowflakePlatformInfoResult struct {
	// Snowflake AWS Virtual Private Cloud IDs
	AwsVpcIds []string `pulumi:"awsVpcIds"`
	// Snowflake Azure Virtual Network Subnet IDs
	AzureVnetSubnetIds []string `pulumi:"azureVnetSubnetIds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetSystemGetSnowflakePlatformInfoOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetSystemGetSnowflakePlatformInfoResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetSystemGetSnowflakePlatformInfoResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("snowflake:index/getSystemGetSnowflakePlatformInfo:getSystemGetSnowflakePlatformInfo", nil, GetSystemGetSnowflakePlatformInfoResultOutput{}, options).(GetSystemGetSnowflakePlatformInfoResultOutput), nil
	}).(GetSystemGetSnowflakePlatformInfoResultOutput)
}

// A collection of values returned by getSystemGetSnowflakePlatformInfo.
type GetSystemGetSnowflakePlatformInfoResultOutput struct{ *pulumi.OutputState }

func (GetSystemGetSnowflakePlatformInfoResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGetSnowflakePlatformInfoResult)(nil)).Elem()
}

func (o GetSystemGetSnowflakePlatformInfoResultOutput) ToGetSystemGetSnowflakePlatformInfoResultOutput() GetSystemGetSnowflakePlatformInfoResultOutput {
	return o
}

func (o GetSystemGetSnowflakePlatformInfoResultOutput) ToGetSystemGetSnowflakePlatformInfoResultOutputWithContext(ctx context.Context) GetSystemGetSnowflakePlatformInfoResultOutput {
	return o
}

// Snowflake AWS Virtual Private Cloud IDs
func (o GetSystemGetSnowflakePlatformInfoResultOutput) AwsVpcIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSystemGetSnowflakePlatformInfoResult) []string { return v.AwsVpcIds }).(pulumi.StringArrayOutput)
}

// Snowflake Azure Virtual Network Subnet IDs
func (o GetSystemGetSnowflakePlatformInfoResultOutput) AzureVnetSubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSystemGetSnowflakePlatformInfoResult) []string { return v.AzureVnetSubnetIds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSystemGetSnowflakePlatformInfoResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetSnowflakePlatformInfoResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSystemGetSnowflakePlatformInfoResultOutput{})
}
