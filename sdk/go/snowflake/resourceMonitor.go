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
//			_, err := snowflake.NewResourceMonitor(ctx, "monitor", &snowflake.ResourceMonitorArgs{
//				Name:           pulumi.String("monitor"),
//				CreditQuota:    pulumi.Int(100),
//				Frequency:      pulumi.String("DAILY"),
//				StartTimestamp: pulumi.String("2020-12-07 00:00"),
//				EndTimestamp:   pulumi.String("2021-12-07 00:00"),
//				NotifyTriggers: pulumi.IntArray{
//					pulumi.Int(40),
//					pulumi.Int(50),
//				},
//				SuspendTriggers:          pulumi.IntArray(50),
//				SuspendImmediateTriggers: pulumi.IntArray(90),
//				NotifyUsers: pulumi.StringArray{
//					pulumi.String("USERONE"),
//					pulumi.String("USERTWO"),
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
//
// ## Import
//
// format is the resource monitor name
//
// ```sh
// $ pulumi import snowflake:index/resourceMonitor:ResourceMonitor example 'resourceMonitorName'
// ```
type ResourceMonitor struct {
	pulumi.CustomResourceState

	// The number of credits allocated monthly to the resource monitor.
	CreditQuota pulumi.IntOutput `pulumi:"creditQuota"`
	// The date and time when the resource monitor suspends the assigned warehouses.
	EndTimestamp pulumi.StringPtrOutput `pulumi:"endTimestamp"`
	// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
	Frequency pulumi.StringOutput `pulumi:"frequency"`
	// Identifier for the resource monitor; must be unique for your account.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of percentage thresholds at which to send an alert to subscribed users.
	NotifyTriggers pulumi.IntArrayOutput `pulumi:"notifyTriggers"`
	// Specifies the list of users to receive email notifications on resource monitors.
	NotifyUsers pulumi.StringArrayOutput `pulumi:"notifyUsers"`
	// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
	SetForAccount pulumi.BoolPtrOutput `pulumi:"setForAccount"`
	// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
	StartTimestamp pulumi.StringOutput `pulumi:"startTimestamp"`
	// The number that represents the percentage threshold at which to immediately suspend all warehouses.
	SuspendImmediateTrigger pulumi.IntPtrOutput `pulumi:"suspendImmediateTrigger"`
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendImmediateTrigger instead
	SuspendImmediateTriggers pulumi.IntArrayOutput `pulumi:"suspendImmediateTriggers"`
	// The number that represents the percentage threshold at which to suspend all warehouses.
	SuspendTrigger pulumi.IntPtrOutput `pulumi:"suspendTrigger"`
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendTrigger instead
	SuspendTriggers pulumi.IntArrayOutput `pulumi:"suspendTriggers"`
	// A list of warehouses to apply the resource monitor to.
	Warehouses pulumi.StringArrayOutput `pulumi:"warehouses"`
}

// NewResourceMonitor registers a new resource with the given unique name, arguments, and options.
func NewResourceMonitor(ctx *pulumi.Context,
	name string, args *ResourceMonitorArgs, opts ...pulumi.ResourceOption) (*ResourceMonitor, error) {
	if args == nil {
		args = &ResourceMonitorArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceMonitor
	err := ctx.RegisterResource("snowflake:index/resourceMonitor:ResourceMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceMonitor gets an existing ResourceMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceMonitorState, opts ...pulumi.ResourceOption) (*ResourceMonitor, error) {
	var resource ResourceMonitor
	err := ctx.ReadResource("snowflake:index/resourceMonitor:ResourceMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceMonitor resources.
type resourceMonitorState struct {
	// The number of credits allocated monthly to the resource monitor.
	CreditQuota *int `pulumi:"creditQuota"`
	// The date and time when the resource monitor suspends the assigned warehouses.
	EndTimestamp *string `pulumi:"endTimestamp"`
	// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
	Frequency *string `pulumi:"frequency"`
	// Identifier for the resource monitor; must be unique for your account.
	Name *string `pulumi:"name"`
	// A list of percentage thresholds at which to send an alert to subscribed users.
	NotifyTriggers []int `pulumi:"notifyTriggers"`
	// Specifies the list of users to receive email notifications on resource monitors.
	NotifyUsers []string `pulumi:"notifyUsers"`
	// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
	SetForAccount *bool `pulumi:"setForAccount"`
	// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
	StartTimestamp *string `pulumi:"startTimestamp"`
	// The number that represents the percentage threshold at which to immediately suspend all warehouses.
	SuspendImmediateTrigger *int `pulumi:"suspendImmediateTrigger"`
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendImmediateTrigger instead
	SuspendImmediateTriggers []int `pulumi:"suspendImmediateTriggers"`
	// The number that represents the percentage threshold at which to suspend all warehouses.
	SuspendTrigger *int `pulumi:"suspendTrigger"`
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendTrigger instead
	SuspendTriggers []int `pulumi:"suspendTriggers"`
	// A list of warehouses to apply the resource monitor to.
	Warehouses []string `pulumi:"warehouses"`
}

type ResourceMonitorState struct {
	// The number of credits allocated monthly to the resource monitor.
	CreditQuota pulumi.IntPtrInput
	// The date and time when the resource monitor suspends the assigned warehouses.
	EndTimestamp pulumi.StringPtrInput
	// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
	Frequency pulumi.StringPtrInput
	// Identifier for the resource monitor; must be unique for your account.
	Name pulumi.StringPtrInput
	// A list of percentage thresholds at which to send an alert to subscribed users.
	NotifyTriggers pulumi.IntArrayInput
	// Specifies the list of users to receive email notifications on resource monitors.
	NotifyUsers pulumi.StringArrayInput
	// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
	SetForAccount pulumi.BoolPtrInput
	// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
	StartTimestamp pulumi.StringPtrInput
	// The number that represents the percentage threshold at which to immediately suspend all warehouses.
	SuspendImmediateTrigger pulumi.IntPtrInput
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendImmediateTrigger instead
	SuspendImmediateTriggers pulumi.IntArrayInput
	// The number that represents the percentage threshold at which to suspend all warehouses.
	SuspendTrigger pulumi.IntPtrInput
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendTrigger instead
	SuspendTriggers pulumi.IntArrayInput
	// A list of warehouses to apply the resource monitor to.
	Warehouses pulumi.StringArrayInput
}

func (ResourceMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceMonitorState)(nil)).Elem()
}

type resourceMonitorArgs struct {
	// The number of credits allocated monthly to the resource monitor.
	CreditQuota *int `pulumi:"creditQuota"`
	// The date and time when the resource monitor suspends the assigned warehouses.
	EndTimestamp *string `pulumi:"endTimestamp"`
	// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
	Frequency *string `pulumi:"frequency"`
	// Identifier for the resource monitor; must be unique for your account.
	Name *string `pulumi:"name"`
	// A list of percentage thresholds at which to send an alert to subscribed users.
	NotifyTriggers []int `pulumi:"notifyTriggers"`
	// Specifies the list of users to receive email notifications on resource monitors.
	NotifyUsers []string `pulumi:"notifyUsers"`
	// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
	SetForAccount *bool `pulumi:"setForAccount"`
	// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
	StartTimestamp *string `pulumi:"startTimestamp"`
	// The number that represents the percentage threshold at which to immediately suspend all warehouses.
	SuspendImmediateTrigger *int `pulumi:"suspendImmediateTrigger"`
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendImmediateTrigger instead
	SuspendImmediateTriggers []int `pulumi:"suspendImmediateTriggers"`
	// The number that represents the percentage threshold at which to suspend all warehouses.
	SuspendTrigger *int `pulumi:"suspendTrigger"`
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendTrigger instead
	SuspendTriggers []int `pulumi:"suspendTriggers"`
	// A list of warehouses to apply the resource monitor to.
	Warehouses []string `pulumi:"warehouses"`
}

// The set of arguments for constructing a ResourceMonitor resource.
type ResourceMonitorArgs struct {
	// The number of credits allocated monthly to the resource monitor.
	CreditQuota pulumi.IntPtrInput
	// The date and time when the resource monitor suspends the assigned warehouses.
	EndTimestamp pulumi.StringPtrInput
	// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
	Frequency pulumi.StringPtrInput
	// Identifier for the resource monitor; must be unique for your account.
	Name pulumi.StringPtrInput
	// A list of percentage thresholds at which to send an alert to subscribed users.
	NotifyTriggers pulumi.IntArrayInput
	// Specifies the list of users to receive email notifications on resource monitors.
	NotifyUsers pulumi.StringArrayInput
	// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
	SetForAccount pulumi.BoolPtrInput
	// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
	StartTimestamp pulumi.StringPtrInput
	// The number that represents the percentage threshold at which to immediately suspend all warehouses.
	SuspendImmediateTrigger pulumi.IntPtrInput
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendImmediateTrigger instead
	SuspendImmediateTriggers pulumi.IntArrayInput
	// The number that represents the percentage threshold at which to suspend all warehouses.
	SuspendTrigger pulumi.IntPtrInput
	// A list of percentage thresholds at which to suspend all warehouses.
	//
	// Deprecated: Use suspendTrigger instead
	SuspendTriggers pulumi.IntArrayInput
	// A list of warehouses to apply the resource monitor to.
	Warehouses pulumi.StringArrayInput
}

func (ResourceMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceMonitorArgs)(nil)).Elem()
}

type ResourceMonitorInput interface {
	pulumi.Input

	ToResourceMonitorOutput() ResourceMonitorOutput
	ToResourceMonitorOutputWithContext(ctx context.Context) ResourceMonitorOutput
}

func (*ResourceMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceMonitor)(nil)).Elem()
}

func (i *ResourceMonitor) ToResourceMonitorOutput() ResourceMonitorOutput {
	return i.ToResourceMonitorOutputWithContext(context.Background())
}

func (i *ResourceMonitor) ToResourceMonitorOutputWithContext(ctx context.Context) ResourceMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMonitorOutput)
}

// ResourceMonitorArrayInput is an input type that accepts ResourceMonitorArray and ResourceMonitorArrayOutput values.
// You can construct a concrete instance of `ResourceMonitorArrayInput` via:
//
//	ResourceMonitorArray{ ResourceMonitorArgs{...} }
type ResourceMonitorArrayInput interface {
	pulumi.Input

	ToResourceMonitorArrayOutput() ResourceMonitorArrayOutput
	ToResourceMonitorArrayOutputWithContext(context.Context) ResourceMonitorArrayOutput
}

type ResourceMonitorArray []ResourceMonitorInput

func (ResourceMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceMonitor)(nil)).Elem()
}

func (i ResourceMonitorArray) ToResourceMonitorArrayOutput() ResourceMonitorArrayOutput {
	return i.ToResourceMonitorArrayOutputWithContext(context.Background())
}

func (i ResourceMonitorArray) ToResourceMonitorArrayOutputWithContext(ctx context.Context) ResourceMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMonitorArrayOutput)
}

// ResourceMonitorMapInput is an input type that accepts ResourceMonitorMap and ResourceMonitorMapOutput values.
// You can construct a concrete instance of `ResourceMonitorMapInput` via:
//
//	ResourceMonitorMap{ "key": ResourceMonitorArgs{...} }
type ResourceMonitorMapInput interface {
	pulumi.Input

	ToResourceMonitorMapOutput() ResourceMonitorMapOutput
	ToResourceMonitorMapOutputWithContext(context.Context) ResourceMonitorMapOutput
}

type ResourceMonitorMap map[string]ResourceMonitorInput

func (ResourceMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceMonitor)(nil)).Elem()
}

func (i ResourceMonitorMap) ToResourceMonitorMapOutput() ResourceMonitorMapOutput {
	return i.ToResourceMonitorMapOutputWithContext(context.Background())
}

func (i ResourceMonitorMap) ToResourceMonitorMapOutputWithContext(ctx context.Context) ResourceMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMonitorMapOutput)
}

type ResourceMonitorOutput struct{ *pulumi.OutputState }

func (ResourceMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceMonitor)(nil)).Elem()
}

func (o ResourceMonitorOutput) ToResourceMonitorOutput() ResourceMonitorOutput {
	return o
}

func (o ResourceMonitorOutput) ToResourceMonitorOutputWithContext(ctx context.Context) ResourceMonitorOutput {
	return o
}

// The number of credits allocated monthly to the resource monitor.
func (o ResourceMonitorOutput) CreditQuota() pulumi.IntOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.IntOutput { return v.CreditQuota }).(pulumi.IntOutput)
}

// The date and time when the resource monitor suspends the assigned warehouses.
func (o ResourceMonitorOutput) EndTimestamp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.StringPtrOutput { return v.EndTimestamp }).(pulumi.StringPtrOutput)
}

// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
func (o ResourceMonitorOutput) Frequency() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.StringOutput { return v.Frequency }).(pulumi.StringOutput)
}

// Identifier for the resource monitor; must be unique for your account.
func (o ResourceMonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of percentage thresholds at which to send an alert to subscribed users.
func (o ResourceMonitorOutput) NotifyTriggers() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.IntArrayOutput { return v.NotifyTriggers }).(pulumi.IntArrayOutput)
}

// Specifies the list of users to receive email notifications on resource monitors.
func (o ResourceMonitorOutput) NotifyUsers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.StringArrayOutput { return v.NotifyUsers }).(pulumi.StringArrayOutput)
}

// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
func (o ResourceMonitorOutput) SetForAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.BoolPtrOutput { return v.SetForAccount }).(pulumi.BoolPtrOutput)
}

// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
func (o ResourceMonitorOutput) StartTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.StringOutput { return v.StartTimestamp }).(pulumi.StringOutput)
}

// The number that represents the percentage threshold at which to immediately suspend all warehouses.
func (o ResourceMonitorOutput) SuspendImmediateTrigger() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.IntPtrOutput { return v.SuspendImmediateTrigger }).(pulumi.IntPtrOutput)
}

// A list of percentage thresholds at which to suspend all warehouses.
//
// Deprecated: Use suspendImmediateTrigger instead
func (o ResourceMonitorOutput) SuspendImmediateTriggers() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.IntArrayOutput { return v.SuspendImmediateTriggers }).(pulumi.IntArrayOutput)
}

// The number that represents the percentage threshold at which to suspend all warehouses.
func (o ResourceMonitorOutput) SuspendTrigger() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.IntPtrOutput { return v.SuspendTrigger }).(pulumi.IntPtrOutput)
}

// A list of percentage thresholds at which to suspend all warehouses.
//
// Deprecated: Use suspendTrigger instead
func (o ResourceMonitorOutput) SuspendTriggers() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.IntArrayOutput { return v.SuspendTriggers }).(pulumi.IntArrayOutput)
}

// A list of warehouses to apply the resource monitor to.
func (o ResourceMonitorOutput) Warehouses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResourceMonitor) pulumi.StringArrayOutput { return v.Warehouses }).(pulumi.StringArrayOutput)
}

type ResourceMonitorArrayOutput struct{ *pulumi.OutputState }

func (ResourceMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceMonitor)(nil)).Elem()
}

func (o ResourceMonitorArrayOutput) ToResourceMonitorArrayOutput() ResourceMonitorArrayOutput {
	return o
}

func (o ResourceMonitorArrayOutput) ToResourceMonitorArrayOutputWithContext(ctx context.Context) ResourceMonitorArrayOutput {
	return o
}

func (o ResourceMonitorArrayOutput) Index(i pulumi.IntInput) ResourceMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceMonitor {
		return vs[0].([]*ResourceMonitor)[vs[1].(int)]
	}).(ResourceMonitorOutput)
}

type ResourceMonitorMapOutput struct{ *pulumi.OutputState }

func (ResourceMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceMonitor)(nil)).Elem()
}

func (o ResourceMonitorMapOutput) ToResourceMonitorMapOutput() ResourceMonitorMapOutput {
	return o
}

func (o ResourceMonitorMapOutput) ToResourceMonitorMapOutputWithContext(ctx context.Context) ResourceMonitorMapOutput {
	return o
}

func (o ResourceMonitorMapOutput) MapIndex(k pulumi.StringInput) ResourceMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceMonitor {
		return vs[0].(map[string]*ResourceMonitor)[vs[1].(string)]
	}).(ResourceMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMonitorInput)(nil)).Elem(), &ResourceMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMonitorArrayInput)(nil)).Elem(), ResourceMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMonitorMapInput)(nil)).Elem(), ResourceMonitorMap{})
	pulumi.RegisterOutputType(ResourceMonitorOutput{})
	pulumi.RegisterOutputType(ResourceMonitorArrayOutput{})
	pulumi.RegisterOutputType(ResourceMonitorMapOutput{})
}
