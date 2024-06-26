// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>
//
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
//			_, err := snowflake.NewResourceMonitorGrant(ctx, "grant", &snowflake.ResourceMonitorGrantArgs{
//				MonitorName: pulumi.String("monitor"),
//				Privilege:   pulumi.String("MODIFY"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//				},
//				WithGrantOption: pulumi.Bool(false),
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
// format is monitor_name|privilege|with_grant_option|roles
//
// ```sh
// $ pulumi import snowflake:index/resourceMonitorGrant:ResourceMonitorGrant example "MY_RESOURCE_MONITOR|MONITOR|false|role1,role2"
// ```
type ResourceMonitorGrant struct {
	pulumi.CustomResourceState

	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// Identifier for the resource monitor; must be unique for your account.
	MonitorName pulumi.StringOutput `pulumi:"monitorName"`
	// The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewResourceMonitorGrant registers a new resource with the given unique name, arguments, and options.
func NewResourceMonitorGrant(ctx *pulumi.Context,
	name string, args *ResourceMonitorGrantArgs, opts ...pulumi.ResourceOption) (*ResourceMonitorGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MonitorName == nil {
		return nil, errors.New("invalid value for required argument 'MonitorName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceMonitorGrant
	err := ctx.RegisterResource("snowflake:index/resourceMonitorGrant:ResourceMonitorGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceMonitorGrant gets an existing ResourceMonitorGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceMonitorGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceMonitorGrantState, opts ...pulumi.ResourceOption) (*ResourceMonitorGrant, error) {
	var resource ResourceMonitorGrant
	err := ctx.ReadResource("snowflake:index/resourceMonitorGrant:ResourceMonitorGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceMonitorGrant resources.
type resourceMonitorGrantState struct {
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// Identifier for the resource monitor; must be unique for your account.
	MonitorName *string `pulumi:"monitorName"`
	// The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type ResourceMonitorGrantState struct {
	EnableMultipleGrants pulumi.BoolPtrInput
	// Identifier for the resource monitor; must be unique for your account.
	MonitorName pulumi.StringPtrInput
	// The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (ResourceMonitorGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceMonitorGrantState)(nil)).Elem()
}

type resourceMonitorGrantArgs struct {
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// Identifier for the resource monitor; must be unique for your account.
	MonitorName string `pulumi:"monitorName"`
	// The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a ResourceMonitorGrant resource.
type ResourceMonitorGrantArgs struct {
	EnableMultipleGrants pulumi.BoolPtrInput
	// Identifier for the resource monitor; must be unique for your account.
	MonitorName pulumi.StringInput
	// The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (ResourceMonitorGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceMonitorGrantArgs)(nil)).Elem()
}

type ResourceMonitorGrantInput interface {
	pulumi.Input

	ToResourceMonitorGrantOutput() ResourceMonitorGrantOutput
	ToResourceMonitorGrantOutputWithContext(ctx context.Context) ResourceMonitorGrantOutput
}

func (*ResourceMonitorGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceMonitorGrant)(nil)).Elem()
}

func (i *ResourceMonitorGrant) ToResourceMonitorGrantOutput() ResourceMonitorGrantOutput {
	return i.ToResourceMonitorGrantOutputWithContext(context.Background())
}

func (i *ResourceMonitorGrant) ToResourceMonitorGrantOutputWithContext(ctx context.Context) ResourceMonitorGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMonitorGrantOutput)
}

// ResourceMonitorGrantArrayInput is an input type that accepts ResourceMonitorGrantArray and ResourceMonitorGrantArrayOutput values.
// You can construct a concrete instance of `ResourceMonitorGrantArrayInput` via:
//
//	ResourceMonitorGrantArray{ ResourceMonitorGrantArgs{...} }
type ResourceMonitorGrantArrayInput interface {
	pulumi.Input

	ToResourceMonitorGrantArrayOutput() ResourceMonitorGrantArrayOutput
	ToResourceMonitorGrantArrayOutputWithContext(context.Context) ResourceMonitorGrantArrayOutput
}

type ResourceMonitorGrantArray []ResourceMonitorGrantInput

func (ResourceMonitorGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceMonitorGrant)(nil)).Elem()
}

func (i ResourceMonitorGrantArray) ToResourceMonitorGrantArrayOutput() ResourceMonitorGrantArrayOutput {
	return i.ToResourceMonitorGrantArrayOutputWithContext(context.Background())
}

func (i ResourceMonitorGrantArray) ToResourceMonitorGrantArrayOutputWithContext(ctx context.Context) ResourceMonitorGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMonitorGrantArrayOutput)
}

// ResourceMonitorGrantMapInput is an input type that accepts ResourceMonitorGrantMap and ResourceMonitorGrantMapOutput values.
// You can construct a concrete instance of `ResourceMonitorGrantMapInput` via:
//
//	ResourceMonitorGrantMap{ "key": ResourceMonitorGrantArgs{...} }
type ResourceMonitorGrantMapInput interface {
	pulumi.Input

	ToResourceMonitorGrantMapOutput() ResourceMonitorGrantMapOutput
	ToResourceMonitorGrantMapOutputWithContext(context.Context) ResourceMonitorGrantMapOutput
}

type ResourceMonitorGrantMap map[string]ResourceMonitorGrantInput

func (ResourceMonitorGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceMonitorGrant)(nil)).Elem()
}

func (i ResourceMonitorGrantMap) ToResourceMonitorGrantMapOutput() ResourceMonitorGrantMapOutput {
	return i.ToResourceMonitorGrantMapOutputWithContext(context.Background())
}

func (i ResourceMonitorGrantMap) ToResourceMonitorGrantMapOutputWithContext(ctx context.Context) ResourceMonitorGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMonitorGrantMapOutput)
}

type ResourceMonitorGrantOutput struct{ *pulumi.OutputState }

func (ResourceMonitorGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceMonitorGrant)(nil)).Elem()
}

func (o ResourceMonitorGrantOutput) ToResourceMonitorGrantOutput() ResourceMonitorGrantOutput {
	return o
}

func (o ResourceMonitorGrantOutput) ToResourceMonitorGrantOutputWithContext(ctx context.Context) ResourceMonitorGrantOutput {
	return o
}

func (o ResourceMonitorGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ResourceMonitorGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// Identifier for the resource monitor; must be unique for your account.
func (o ResourceMonitorGrantOutput) MonitorName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceMonitorGrant) pulumi.StringOutput { return v.MonitorName }).(pulumi.StringOutput)
}

// The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
func (o ResourceMonitorGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceMonitorGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o ResourceMonitorGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResourceMonitorGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o ResourceMonitorGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ResourceMonitorGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type ResourceMonitorGrantArrayOutput struct{ *pulumi.OutputState }

func (ResourceMonitorGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceMonitorGrant)(nil)).Elem()
}

func (o ResourceMonitorGrantArrayOutput) ToResourceMonitorGrantArrayOutput() ResourceMonitorGrantArrayOutput {
	return o
}

func (o ResourceMonitorGrantArrayOutput) ToResourceMonitorGrantArrayOutputWithContext(ctx context.Context) ResourceMonitorGrantArrayOutput {
	return o
}

func (o ResourceMonitorGrantArrayOutput) Index(i pulumi.IntInput) ResourceMonitorGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceMonitorGrant {
		return vs[0].([]*ResourceMonitorGrant)[vs[1].(int)]
	}).(ResourceMonitorGrantOutput)
}

type ResourceMonitorGrantMapOutput struct{ *pulumi.OutputState }

func (ResourceMonitorGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceMonitorGrant)(nil)).Elem()
}

func (o ResourceMonitorGrantMapOutput) ToResourceMonitorGrantMapOutput() ResourceMonitorGrantMapOutput {
	return o
}

func (o ResourceMonitorGrantMapOutput) ToResourceMonitorGrantMapOutputWithContext(ctx context.Context) ResourceMonitorGrantMapOutput {
	return o
}

func (o ResourceMonitorGrantMapOutput) MapIndex(k pulumi.StringInput) ResourceMonitorGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceMonitorGrant {
		return vs[0].(map[string]*ResourceMonitorGrant)[vs[1].(string)]
	}).(ResourceMonitorGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMonitorGrantInput)(nil)).Elem(), &ResourceMonitorGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMonitorGrantArrayInput)(nil)).Elem(), ResourceMonitorGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMonitorGrantMapInput)(nil)).Elem(), ResourceMonitorGrantMap{})
	pulumi.RegisterOutputType(ResourceMonitorGrantOutput{})
	pulumi.RegisterOutputType(ResourceMonitorGrantArrayOutput{})
	pulumi.RegisterOutputType(ResourceMonitorGrantMapOutput{})
}
