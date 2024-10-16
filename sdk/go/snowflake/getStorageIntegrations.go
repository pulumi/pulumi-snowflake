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
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.GetStorageIntegrations(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetStorageIntegrations(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetStorageIntegrationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStorageIntegrationsResult
	err := ctx.Invoke("snowflake:index/getStorageIntegrations:getStorageIntegrations", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getStorageIntegrations.
type GetStorageIntegrationsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The storage integrations in the database
	StorageIntegrations []GetStorageIntegrationsStorageIntegration `pulumi:"storageIntegrations"`
}

func GetStorageIntegrationsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetStorageIntegrationsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetStorageIntegrationsResultOutput, error) {
		opts = internal.PkgInvokeDefaultOpts(opts)
		var rv GetStorageIntegrationsResult
		secret, err := ctx.InvokePackageRaw("snowflake:index/getStorageIntegrations:getStorageIntegrations", nil, &rv, "", opts...)
		if err != nil {
			return GetStorageIntegrationsResultOutput{}, err
		}

		output := pulumi.ToOutput(rv).(GetStorageIntegrationsResultOutput)
		if secret {
			return pulumi.ToSecret(output).(GetStorageIntegrationsResultOutput), nil
		}
		return output, nil
	}).(GetStorageIntegrationsResultOutput)
}

// A collection of values returned by getStorageIntegrations.
type GetStorageIntegrationsResultOutput struct{ *pulumi.OutputState }

func (GetStorageIntegrationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStorageIntegrationsResult)(nil)).Elem()
}

func (o GetStorageIntegrationsResultOutput) ToGetStorageIntegrationsResultOutput() GetStorageIntegrationsResultOutput {
	return o
}

func (o GetStorageIntegrationsResultOutput) ToGetStorageIntegrationsResultOutputWithContext(ctx context.Context) GetStorageIntegrationsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetStorageIntegrationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStorageIntegrationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The storage integrations in the database
func (o GetStorageIntegrationsResultOutput) StorageIntegrations() GetStorageIntegrationsStorageIntegrationArrayOutput {
	return o.ApplyT(func(v GetStorageIntegrationsResult) []GetStorageIntegrationsStorageIntegration {
		return v.StorageIntegrations
	}).(GetStorageIntegrationsStorageIntegrationArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStorageIntegrationsResultOutput{})
}
