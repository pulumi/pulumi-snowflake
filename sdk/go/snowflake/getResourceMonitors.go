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
// Datasource used to get details of filtered resource monitors. Filtering is aligned with the current possibilities for [SHOW RESOURCE MONITORS](https://docs.snowflake.com/en/sql-reference/sql/show-resource-monitors) query (`like` is supported). The results of SHOW is encapsulated in showOutput collection.
func GetResourceMonitors(ctx *pulumi.Context, args *GetResourceMonitorsArgs, opts ...pulumi.InvokeOption) (*GetResourceMonitorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetResourceMonitorsResult
	err := ctx.Invoke("snowflake:index/getResourceMonitors:getResourceMonitors", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getResourceMonitors.
type GetResourceMonitorsArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
}

// A collection of values returned by getResourceMonitors.
type GetResourceMonitorsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Holds the aggregated output of all resource monitor details queries.
	ResourceMonitors []GetResourceMonitorsResourceMonitor `pulumi:"resourceMonitors"`
}

func GetResourceMonitorsOutput(ctx *pulumi.Context, args GetResourceMonitorsOutputArgs, opts ...pulumi.InvokeOption) GetResourceMonitorsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetResourceMonitorsResultOutput, error) {
			args := v.(GetResourceMonitorsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetResourceMonitorsResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getResourceMonitors:getResourceMonitors", args, &rv, "", opts...)
			if err != nil {
				return GetResourceMonitorsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetResourceMonitorsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetResourceMonitorsResultOutput), nil
			}
			return output, nil
		}).(GetResourceMonitorsResultOutput)
}

// A collection of arguments for invoking getResourceMonitors.
type GetResourceMonitorsOutputArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
}

func (GetResourceMonitorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceMonitorsArgs)(nil)).Elem()
}

// A collection of values returned by getResourceMonitors.
type GetResourceMonitorsResultOutput struct{ *pulumi.OutputState }

func (GetResourceMonitorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceMonitorsResult)(nil)).Elem()
}

func (o GetResourceMonitorsResultOutput) ToGetResourceMonitorsResultOutput() GetResourceMonitorsResultOutput {
	return o
}

func (o GetResourceMonitorsResultOutput) ToGetResourceMonitorsResultOutputWithContext(ctx context.Context) GetResourceMonitorsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetResourceMonitorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourceMonitorsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetResourceMonitorsResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceMonitorsResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all resource monitor details queries.
func (o GetResourceMonitorsResultOutput) ResourceMonitors() GetResourceMonitorsResourceMonitorArrayOutput {
	return o.ApplyT(func(v GetResourceMonitorsResult) []GetResourceMonitorsResourceMonitor { return v.ResourceMonitors }).(GetResourceMonitorsResourceMonitorArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetResourceMonitorsResultOutput{})
}
