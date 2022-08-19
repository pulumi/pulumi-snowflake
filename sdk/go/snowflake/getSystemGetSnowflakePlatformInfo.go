// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetSystemGetSnowflakePlatformInfo(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetSystemGetSnowflakePlatformInfoResult, error) {
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
