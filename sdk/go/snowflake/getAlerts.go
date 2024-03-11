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
//			_, err := snowflake.GetAlerts(ctx, &snowflake.GetAlertsArgs{
//				Database: pulumi.StringRef("MYDB"),
//				Schema:   pulumi.StringRef("MYSCHEMA"),
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
func GetAlerts(ctx *pulumi.Context, args *GetAlertsArgs, opts ...pulumi.InvokeOption) (*GetAlertsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAlertsResult
	err := ctx.Invoke("snowflake:index/getAlerts:getAlerts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlerts.
type GetAlertsArgs struct {
	// The database from which to return the alerts from.
	Database *string `pulumi:"database"`
	// Filters the command output by object name.
	Pattern *string `pulumi:"pattern"`
	// The schema from which to return the alerts from.
	Schema *string `pulumi:"schema"`
}

// A collection of values returned by getAlerts.
type GetAlertsResult struct {
	// Lists alerts for the current/specified database or schema, or across the entire account.
	Alerts []GetAlertsAlert `pulumi:"alerts"`
	// The database from which to return the alerts from.
	Database *string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the command output by object name.
	Pattern *string `pulumi:"pattern"`
	// The schema from which to return the alerts from.
	Schema *string `pulumi:"schema"`
}

func GetAlertsOutput(ctx *pulumi.Context, args GetAlertsOutputArgs, opts ...pulumi.InvokeOption) GetAlertsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAlertsResult, error) {
			args := v.(GetAlertsArgs)
			r, err := GetAlerts(ctx, &args, opts...)
			var s GetAlertsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAlertsResultOutput)
}

// A collection of arguments for invoking getAlerts.
type GetAlertsOutputArgs struct {
	// The database from which to return the alerts from.
	Database pulumi.StringPtrInput `pulumi:"database"`
	// Filters the command output by object name.
	Pattern pulumi.StringPtrInput `pulumi:"pattern"`
	// The schema from which to return the alerts from.
	Schema pulumi.StringPtrInput `pulumi:"schema"`
}

func (GetAlertsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAlertsArgs)(nil)).Elem()
}

// A collection of values returned by getAlerts.
type GetAlertsResultOutput struct{ *pulumi.OutputState }

func (GetAlertsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAlertsResult)(nil)).Elem()
}

func (o GetAlertsResultOutput) ToGetAlertsResultOutput() GetAlertsResultOutput {
	return o
}

func (o GetAlertsResultOutput) ToGetAlertsResultOutputWithContext(ctx context.Context) GetAlertsResultOutput {
	return o
}

// Lists alerts for the current/specified database or schema, or across the entire account.
func (o GetAlertsResultOutput) Alerts() GetAlertsAlertArrayOutput {
	return o.ApplyT(func(v GetAlertsResult) []GetAlertsAlert { return v.Alerts }).(GetAlertsAlertArrayOutput)
}

// The database from which to return the alerts from.
func (o GetAlertsResultOutput) Database() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAlertsResult) *string { return v.Database }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAlertsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAlertsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the command output by object name.
func (o GetAlertsResultOutput) Pattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAlertsResult) *string { return v.Pattern }).(pulumi.StringPtrOutput)
}

// The schema from which to return the alerts from.
func (o GetAlertsResultOutput) Schema() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAlertsResult) *string { return v.Schema }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAlertsResultOutput{})
}
