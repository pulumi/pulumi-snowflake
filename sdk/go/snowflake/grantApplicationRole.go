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

// ## Example Usage
//
// ## Import
//
// format is application_role_name (string) | object_type (ACCOUNT_ROLE|APPLICATION) | grantee_name (string)
//
// ```sh
// $ pulumi import snowflake:index/grantApplicationRole:GrantApplicationRole \"app_role_1\"|ACCOUNT_ROLE|\"my_role\""
// ```
type GrantApplicationRole struct {
	pulumi.CustomResourceState

	// The fully qualified name of the application on which application role will be granted.
	ApplicationName pulumi.StringPtrOutput `pulumi:"applicationName"`
	// Specifies the identifier for the application role to grant.
	ApplicationRoleName pulumi.StringOutput `pulumi:"applicationRoleName"`
	// The fully qualified name of the account role on which application role will be granted.
	ParentAccountRoleName pulumi.StringPtrOutput `pulumi:"parentAccountRoleName"`
}

// NewGrantApplicationRole registers a new resource with the given unique name, arguments, and options.
func NewGrantApplicationRole(ctx *pulumi.Context,
	name string, args *GrantApplicationRoleArgs, opts ...pulumi.ResourceOption) (*GrantApplicationRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationRoleName == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationRoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantApplicationRole
	err := ctx.RegisterResource("snowflake:index/grantApplicationRole:GrantApplicationRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantApplicationRole gets an existing GrantApplicationRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantApplicationRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantApplicationRoleState, opts ...pulumi.ResourceOption) (*GrantApplicationRole, error) {
	var resource GrantApplicationRole
	err := ctx.ReadResource("snowflake:index/grantApplicationRole:GrantApplicationRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantApplicationRole resources.
type grantApplicationRoleState struct {
	// The fully qualified name of the application on which application role will be granted.
	ApplicationName *string `pulumi:"applicationName"`
	// Specifies the identifier for the application role to grant.
	ApplicationRoleName *string `pulumi:"applicationRoleName"`
	// The fully qualified name of the account role on which application role will be granted.
	ParentAccountRoleName *string `pulumi:"parentAccountRoleName"`
}

type GrantApplicationRoleState struct {
	// The fully qualified name of the application on which application role will be granted.
	ApplicationName pulumi.StringPtrInput
	// Specifies the identifier for the application role to grant.
	ApplicationRoleName pulumi.StringPtrInput
	// The fully qualified name of the account role on which application role will be granted.
	ParentAccountRoleName pulumi.StringPtrInput
}

func (GrantApplicationRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantApplicationRoleState)(nil)).Elem()
}

type grantApplicationRoleArgs struct {
	// The fully qualified name of the application on which application role will be granted.
	ApplicationName *string `pulumi:"applicationName"`
	// Specifies the identifier for the application role to grant.
	ApplicationRoleName string `pulumi:"applicationRoleName"`
	// The fully qualified name of the account role on which application role will be granted.
	ParentAccountRoleName *string `pulumi:"parentAccountRoleName"`
}

// The set of arguments for constructing a GrantApplicationRole resource.
type GrantApplicationRoleArgs struct {
	// The fully qualified name of the application on which application role will be granted.
	ApplicationName pulumi.StringPtrInput
	// Specifies the identifier for the application role to grant.
	ApplicationRoleName pulumi.StringInput
	// The fully qualified name of the account role on which application role will be granted.
	ParentAccountRoleName pulumi.StringPtrInput
}

func (GrantApplicationRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantApplicationRoleArgs)(nil)).Elem()
}

type GrantApplicationRoleInput interface {
	pulumi.Input

	ToGrantApplicationRoleOutput() GrantApplicationRoleOutput
	ToGrantApplicationRoleOutputWithContext(ctx context.Context) GrantApplicationRoleOutput
}

func (*GrantApplicationRole) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantApplicationRole)(nil)).Elem()
}

func (i *GrantApplicationRole) ToGrantApplicationRoleOutput() GrantApplicationRoleOutput {
	return i.ToGrantApplicationRoleOutputWithContext(context.Background())
}

func (i *GrantApplicationRole) ToGrantApplicationRoleOutputWithContext(ctx context.Context) GrantApplicationRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantApplicationRoleOutput)
}

// GrantApplicationRoleArrayInput is an input type that accepts GrantApplicationRoleArray and GrantApplicationRoleArrayOutput values.
// You can construct a concrete instance of `GrantApplicationRoleArrayInput` via:
//
//	GrantApplicationRoleArray{ GrantApplicationRoleArgs{...} }
type GrantApplicationRoleArrayInput interface {
	pulumi.Input

	ToGrantApplicationRoleArrayOutput() GrantApplicationRoleArrayOutput
	ToGrantApplicationRoleArrayOutputWithContext(context.Context) GrantApplicationRoleArrayOutput
}

type GrantApplicationRoleArray []GrantApplicationRoleInput

func (GrantApplicationRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantApplicationRole)(nil)).Elem()
}

func (i GrantApplicationRoleArray) ToGrantApplicationRoleArrayOutput() GrantApplicationRoleArrayOutput {
	return i.ToGrantApplicationRoleArrayOutputWithContext(context.Background())
}

func (i GrantApplicationRoleArray) ToGrantApplicationRoleArrayOutputWithContext(ctx context.Context) GrantApplicationRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantApplicationRoleArrayOutput)
}

// GrantApplicationRoleMapInput is an input type that accepts GrantApplicationRoleMap and GrantApplicationRoleMapOutput values.
// You can construct a concrete instance of `GrantApplicationRoleMapInput` via:
//
//	GrantApplicationRoleMap{ "key": GrantApplicationRoleArgs{...} }
type GrantApplicationRoleMapInput interface {
	pulumi.Input

	ToGrantApplicationRoleMapOutput() GrantApplicationRoleMapOutput
	ToGrantApplicationRoleMapOutputWithContext(context.Context) GrantApplicationRoleMapOutput
}

type GrantApplicationRoleMap map[string]GrantApplicationRoleInput

func (GrantApplicationRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantApplicationRole)(nil)).Elem()
}

func (i GrantApplicationRoleMap) ToGrantApplicationRoleMapOutput() GrantApplicationRoleMapOutput {
	return i.ToGrantApplicationRoleMapOutputWithContext(context.Background())
}

func (i GrantApplicationRoleMap) ToGrantApplicationRoleMapOutputWithContext(ctx context.Context) GrantApplicationRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantApplicationRoleMapOutput)
}

type GrantApplicationRoleOutput struct{ *pulumi.OutputState }

func (GrantApplicationRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantApplicationRole)(nil)).Elem()
}

func (o GrantApplicationRoleOutput) ToGrantApplicationRoleOutput() GrantApplicationRoleOutput {
	return o
}

func (o GrantApplicationRoleOutput) ToGrantApplicationRoleOutputWithContext(ctx context.Context) GrantApplicationRoleOutput {
	return o
}

// The fully qualified name of the application on which application role will be granted.
func (o GrantApplicationRoleOutput) ApplicationName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantApplicationRole) pulumi.StringPtrOutput { return v.ApplicationName }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the application role to grant.
func (o GrantApplicationRoleOutput) ApplicationRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantApplicationRole) pulumi.StringOutput { return v.ApplicationRoleName }).(pulumi.StringOutput)
}

// The fully qualified name of the account role on which application role will be granted.
func (o GrantApplicationRoleOutput) ParentAccountRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantApplicationRole) pulumi.StringPtrOutput { return v.ParentAccountRoleName }).(pulumi.StringPtrOutput)
}

type GrantApplicationRoleArrayOutput struct{ *pulumi.OutputState }

func (GrantApplicationRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantApplicationRole)(nil)).Elem()
}

func (o GrantApplicationRoleArrayOutput) ToGrantApplicationRoleArrayOutput() GrantApplicationRoleArrayOutput {
	return o
}

func (o GrantApplicationRoleArrayOutput) ToGrantApplicationRoleArrayOutputWithContext(ctx context.Context) GrantApplicationRoleArrayOutput {
	return o
}

func (o GrantApplicationRoleArrayOutput) Index(i pulumi.IntInput) GrantApplicationRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantApplicationRole {
		return vs[0].([]*GrantApplicationRole)[vs[1].(int)]
	}).(GrantApplicationRoleOutput)
}

type GrantApplicationRoleMapOutput struct{ *pulumi.OutputState }

func (GrantApplicationRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantApplicationRole)(nil)).Elem()
}

func (o GrantApplicationRoleMapOutput) ToGrantApplicationRoleMapOutput() GrantApplicationRoleMapOutput {
	return o
}

func (o GrantApplicationRoleMapOutput) ToGrantApplicationRoleMapOutputWithContext(ctx context.Context) GrantApplicationRoleMapOutput {
	return o
}

func (o GrantApplicationRoleMapOutput) MapIndex(k pulumi.StringInput) GrantApplicationRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantApplicationRole {
		return vs[0].(map[string]*GrantApplicationRole)[vs[1].(string)]
	}).(GrantApplicationRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantApplicationRoleInput)(nil)).Elem(), &GrantApplicationRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantApplicationRoleArrayInput)(nil)).Elem(), GrantApplicationRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantApplicationRoleMapInput)(nil)).Elem(), GrantApplicationRoleMap{})
	pulumi.RegisterOutputType(GrantApplicationRoleOutput{})
	pulumi.RegisterOutputType(GrantApplicationRoleArrayOutput{})
	pulumi.RegisterOutputType(GrantApplicationRoleMapOutput{})
}
