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
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws"
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			snowflakePrivateLink, err := snowflake.GetSystemGetPrivateLinkConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			snowflakePrivateLinkSecurityGroup, err := aws.NewSecurityGroup(ctx, "snowflake_private_link", &aws.SecurityGroupArgs{
//				VpcId: vpcId,
//				Ingress: []interface{}{
//					map[string]interface{}{
//						"fromPort":   80,
//						"toPort":     80,
//						"cidrBlocks": vpcCidr,
//						"protocol":   "tcp",
//					},
//					map[string]interface{}{
//						"fromPort":   443,
//						"toPort":     443,
//						"cidrBlocks": vpcCidr,
//						"protocol":   "tcp",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			snowflakePrivateLinkVpcEndpoint, err := aws.NewVpcEndpoint(ctx, "snowflake_private_link", &aws.VpcEndpointArgs{
//				VpcId:           vpcId,
//				ServiceName:     snowflakePrivateLink.AwsVpceId,
//				VpcEndpointType: "Interface",
//				SecurityGroupIds: []interface{}{
//					snowflakePrivateLinkSecurityGroup.Id,
//				},
//				SubnetIds:         subnetIds,
//				PrivateDnsEnabled: false,
//			})
//			if err != nil {
//				return err
//			}
//			snowflakePrivateLinkRoute53Zone, err := aws.NewRoute53Zone(ctx, "snowflake_private_link", &aws.Route53ZoneArgs{
//				Name: "privatelink.snowflakecomputing.com",
//				Vpc: []map[string]interface{}{
//					map[string]interface{}{
//						"vpcId": vpcId,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = aws.NewRoute53Record(ctx, "snowflake_private_link_url", &aws.Route53RecordArgs{
//				ZoneId: snowflakePrivateLinkRoute53Zone.ZoneId,
//				Name:   snowflakePrivateLink.AccountUrl,
//				Type:   "CNAME",
//				Ttl:    "300",
//				Records: []interface{}{
//					snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = aws.NewRoute53Record(ctx, "snowflake_private_link_ocsp_url", &aws.Route53RecordArgs{
//				ZoneId: snowflakePrivateLinkRoute53Zone.ZoneId,
//				Name:   snowflakePrivateLink.OcspUrl,
//				Type:   "CNAME",
//				Ttl:    "300",
//				Records: []interface{}{
//					snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSystemGetPrivateLinkConfig(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetSystemGetPrivateLinkConfigResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSystemGetPrivateLinkConfigResult
	err := ctx.Invoke("snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getSystemGetPrivateLinkConfig.
type GetSystemGetPrivateLinkConfigResult struct {
	// The name of your Snowflake account.
	AccountName string `pulumi:"accountName"`
	// The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
	AccountUrl string `pulumi:"accountUrl"`
	// The AWS VPCE ID for your account.
	AwsVpceId string `pulumi:"awsVpceId"`
	// The Azure Private Link Service ID for your account.
	AzurePlsId string `pulumi:"azurePlsId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The endpoint to connect to your Snowflake internal stage using AWS PrivateLink or Azure Private Link.
	InternalStage string `pulumi:"internalStage"`
	// The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
	OcspUrl string `pulumi:"ocspUrl"`
	// The regionless URL to connect to your Snowflake account using AWS PrivateLink, Azure Private Link, or Google Cloud Private Service Connect.
	RegionlessAccountUrl string `pulumi:"regionlessAccountUrl"`
	// The URL for your organization to access Snowsight using Private Connectivity to the Snowflake Service.
	RegionlessSnowsightUrl string `pulumi:"regionlessSnowsightUrl"`
	// The URL containing the cloud region to access Snowsight and the Snowflake Marketplace using Private Connectivity to the Snowflake Service.
	SnowsightUrl string `pulumi:"snowsightUrl"`
}

func GetSystemGetPrivateLinkConfigOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetSystemGetPrivateLinkConfigResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetSystemGetPrivateLinkConfigResultOutput, error) {
		opts = internal.PkgInvokeDefaultOpts(opts)
		var rv GetSystemGetPrivateLinkConfigResult
		secret, err := ctx.InvokePackageRaw("snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig", nil, &rv, "", opts...)
		if err != nil {
			return GetSystemGetPrivateLinkConfigResultOutput{}, err
		}

		output := pulumi.ToOutput(rv).(GetSystemGetPrivateLinkConfigResultOutput)
		if secret {
			return pulumi.ToSecret(output).(GetSystemGetPrivateLinkConfigResultOutput), nil
		}
		return output, nil
	}).(GetSystemGetPrivateLinkConfigResultOutput)
}

// A collection of values returned by getSystemGetPrivateLinkConfig.
type GetSystemGetPrivateLinkConfigResultOutput struct{ *pulumi.OutputState }

func (GetSystemGetPrivateLinkConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGetPrivateLinkConfigResult)(nil)).Elem()
}

func (o GetSystemGetPrivateLinkConfigResultOutput) ToGetSystemGetPrivateLinkConfigResultOutput() GetSystemGetPrivateLinkConfigResultOutput {
	return o
}

func (o GetSystemGetPrivateLinkConfigResultOutput) ToGetSystemGetPrivateLinkConfigResultOutputWithContext(ctx context.Context) GetSystemGetPrivateLinkConfigResultOutput {
	return o
}

// The name of your Snowflake account.
func (o GetSystemGetPrivateLinkConfigResultOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.AccountName }).(pulumi.StringOutput)
}

// The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
func (o GetSystemGetPrivateLinkConfigResultOutput) AccountUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.AccountUrl }).(pulumi.StringOutput)
}

// The AWS VPCE ID for your account.
func (o GetSystemGetPrivateLinkConfigResultOutput) AwsVpceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.AwsVpceId }).(pulumi.StringOutput)
}

// The Azure Private Link Service ID for your account.
func (o GetSystemGetPrivateLinkConfigResultOutput) AzurePlsId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.AzurePlsId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSystemGetPrivateLinkConfigResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.Id }).(pulumi.StringOutput)
}

// The endpoint to connect to your Snowflake internal stage using AWS PrivateLink or Azure Private Link.
func (o GetSystemGetPrivateLinkConfigResultOutput) InternalStage() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.InternalStage }).(pulumi.StringOutput)
}

// The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
func (o GetSystemGetPrivateLinkConfigResultOutput) OcspUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.OcspUrl }).(pulumi.StringOutput)
}

// The regionless URL to connect to your Snowflake account using AWS PrivateLink, Azure Private Link, or Google Cloud Private Service Connect.
func (o GetSystemGetPrivateLinkConfigResultOutput) RegionlessAccountUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.RegionlessAccountUrl }).(pulumi.StringOutput)
}

// The URL for your organization to access Snowsight using Private Connectivity to the Snowflake Service.
func (o GetSystemGetPrivateLinkConfigResultOutput) RegionlessSnowsightUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.RegionlessSnowsightUrl }).(pulumi.StringOutput)
}

// The URL containing the cloud region to access Snowsight and the Snowflake Marketplace using Private Connectivity to the Snowflake Service.
func (o GetSystemGetPrivateLinkConfigResultOutput) SnowsightUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetPrivateLinkConfigResult) string { return v.SnowsightUrl }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSystemGetPrivateLinkConfigResultOutput{})
}
