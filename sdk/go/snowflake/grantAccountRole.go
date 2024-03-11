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
//			// #################################
//			// ## grant account role to account role
//			// #################################
//			roleRole, err := snowflake.NewRole(ctx, "roleRole", nil)
//			if err != nil {
//				return err
//			}
//			parentRole, err := snowflake.NewRole(ctx, "parentRole", nil)
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewGrantAccountRole(ctx, "grantAccountRole", &snowflake.GrantAccountRoleArgs{
//				RoleName:       roleRole.Name,
//				ParentRoleName: parentRole.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewRole(ctx, "roleIndex/roleRole", nil)
//			if err != nil {
//				return err
//			}
//			user, err := snowflake.NewUser(ctx, "user", nil)
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewGrantAccountRole(ctx, "index/grantAccountRoleGrantAccountRole", &snowflake.GrantAccountRoleArgs{
//				RoleName: roleRole.Name,
//				UserName: user.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// format is role_name (string) | grantee_object_type (ROLE|USER) | grantee_name (string)
//
// ```sh
// $ pulumi import snowflake:index/grantAccountRole:GrantAccountRole "\"test_role\"|ROLE|\"test_parent_role\""
// ```
type GrantAccountRole struct {
	pulumi.CustomResourceState

	// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
	ParentRoleName pulumi.StringPtrOutput `pulumi:"parentRoleName"`
	// The fully qualified name of the role which will be granted to the user or parent role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// The fully qualified name of the user on which specified role will be granted.
	UserName pulumi.StringPtrOutput `pulumi:"userName"`
}

// NewGrantAccountRole registers a new resource with the given unique name, arguments, and options.
func NewGrantAccountRole(ctx *pulumi.Context,
	name string, args *GrantAccountRoleArgs, opts ...pulumi.ResourceOption) (*GrantAccountRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantAccountRole
	err := ctx.RegisterResource("snowflake:index/grantAccountRole:GrantAccountRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantAccountRole gets an existing GrantAccountRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantAccountRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantAccountRoleState, opts ...pulumi.ResourceOption) (*GrantAccountRole, error) {
	var resource GrantAccountRole
	err := ctx.ReadResource("snowflake:index/grantAccountRole:GrantAccountRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantAccountRole resources.
type grantAccountRoleState struct {
	// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
	ParentRoleName *string `pulumi:"parentRoleName"`
	// The fully qualified name of the role which will be granted to the user or parent role.
	RoleName *string `pulumi:"roleName"`
	// The fully qualified name of the user on which specified role will be granted.
	UserName *string `pulumi:"userName"`
}

type GrantAccountRoleState struct {
	// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
	ParentRoleName pulumi.StringPtrInput
	// The fully qualified name of the role which will be granted to the user or parent role.
	RoleName pulumi.StringPtrInput
	// The fully qualified name of the user on which specified role will be granted.
	UserName pulumi.StringPtrInput
}

func (GrantAccountRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantAccountRoleState)(nil)).Elem()
}

type grantAccountRoleArgs struct {
	// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
	ParentRoleName *string `pulumi:"parentRoleName"`
	// The fully qualified name of the role which will be granted to the user or parent role.
	RoleName string `pulumi:"roleName"`
	// The fully qualified name of the user on which specified role will be granted.
	UserName *string `pulumi:"userName"`
}

// The set of arguments for constructing a GrantAccountRole resource.
type GrantAccountRoleArgs struct {
	// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
	ParentRoleName pulumi.StringPtrInput
	// The fully qualified name of the role which will be granted to the user or parent role.
	RoleName pulumi.StringInput
	// The fully qualified name of the user on which specified role will be granted.
	UserName pulumi.StringPtrInput
}

func (GrantAccountRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantAccountRoleArgs)(nil)).Elem()
}

type GrantAccountRoleInput interface {
	pulumi.Input

	ToGrantAccountRoleOutput() GrantAccountRoleOutput
	ToGrantAccountRoleOutputWithContext(ctx context.Context) GrantAccountRoleOutput
}

func (*GrantAccountRole) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantAccountRole)(nil)).Elem()
}

func (i *GrantAccountRole) ToGrantAccountRoleOutput() GrantAccountRoleOutput {
	return i.ToGrantAccountRoleOutputWithContext(context.Background())
}

func (i *GrantAccountRole) ToGrantAccountRoleOutputWithContext(ctx context.Context) GrantAccountRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantAccountRoleOutput)
}

// GrantAccountRoleArrayInput is an input type that accepts GrantAccountRoleArray and GrantAccountRoleArrayOutput values.
// You can construct a concrete instance of `GrantAccountRoleArrayInput` via:
//
//	GrantAccountRoleArray{ GrantAccountRoleArgs{...} }
type GrantAccountRoleArrayInput interface {
	pulumi.Input

	ToGrantAccountRoleArrayOutput() GrantAccountRoleArrayOutput
	ToGrantAccountRoleArrayOutputWithContext(context.Context) GrantAccountRoleArrayOutput
}

type GrantAccountRoleArray []GrantAccountRoleInput

func (GrantAccountRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantAccountRole)(nil)).Elem()
}

func (i GrantAccountRoleArray) ToGrantAccountRoleArrayOutput() GrantAccountRoleArrayOutput {
	return i.ToGrantAccountRoleArrayOutputWithContext(context.Background())
}

func (i GrantAccountRoleArray) ToGrantAccountRoleArrayOutputWithContext(ctx context.Context) GrantAccountRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantAccountRoleArrayOutput)
}

// GrantAccountRoleMapInput is an input type that accepts GrantAccountRoleMap and GrantAccountRoleMapOutput values.
// You can construct a concrete instance of `GrantAccountRoleMapInput` via:
//
//	GrantAccountRoleMap{ "key": GrantAccountRoleArgs{...} }
type GrantAccountRoleMapInput interface {
	pulumi.Input

	ToGrantAccountRoleMapOutput() GrantAccountRoleMapOutput
	ToGrantAccountRoleMapOutputWithContext(context.Context) GrantAccountRoleMapOutput
}

type GrantAccountRoleMap map[string]GrantAccountRoleInput

func (GrantAccountRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantAccountRole)(nil)).Elem()
}

func (i GrantAccountRoleMap) ToGrantAccountRoleMapOutput() GrantAccountRoleMapOutput {
	return i.ToGrantAccountRoleMapOutputWithContext(context.Background())
}

func (i GrantAccountRoleMap) ToGrantAccountRoleMapOutputWithContext(ctx context.Context) GrantAccountRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantAccountRoleMapOutput)
}

type GrantAccountRoleOutput struct{ *pulumi.OutputState }

func (GrantAccountRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantAccountRole)(nil)).Elem()
}

func (o GrantAccountRoleOutput) ToGrantAccountRoleOutput() GrantAccountRoleOutput {
	return o
}

func (o GrantAccountRoleOutput) ToGrantAccountRoleOutputWithContext(ctx context.Context) GrantAccountRoleOutput {
	return o
}

// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
func (o GrantAccountRoleOutput) ParentRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantAccountRole) pulumi.StringPtrOutput { return v.ParentRoleName }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the role which will be granted to the user or parent role.
func (o GrantAccountRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantAccountRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// The fully qualified name of the user on which specified role will be granted.
func (o GrantAccountRoleOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantAccountRole) pulumi.StringPtrOutput { return v.UserName }).(pulumi.StringPtrOutput)
}

type GrantAccountRoleArrayOutput struct{ *pulumi.OutputState }

func (GrantAccountRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantAccountRole)(nil)).Elem()
}

func (o GrantAccountRoleArrayOutput) ToGrantAccountRoleArrayOutput() GrantAccountRoleArrayOutput {
	return o
}

func (o GrantAccountRoleArrayOutput) ToGrantAccountRoleArrayOutputWithContext(ctx context.Context) GrantAccountRoleArrayOutput {
	return o
}

func (o GrantAccountRoleArrayOutput) Index(i pulumi.IntInput) GrantAccountRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantAccountRole {
		return vs[0].([]*GrantAccountRole)[vs[1].(int)]
	}).(GrantAccountRoleOutput)
}

type GrantAccountRoleMapOutput struct{ *pulumi.OutputState }

func (GrantAccountRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantAccountRole)(nil)).Elem()
}

func (o GrantAccountRoleMapOutput) ToGrantAccountRoleMapOutput() GrantAccountRoleMapOutput {
	return o
}

func (o GrantAccountRoleMapOutput) ToGrantAccountRoleMapOutputWithContext(ctx context.Context) GrantAccountRoleMapOutput {
	return o
}

func (o GrantAccountRoleMapOutput) MapIndex(k pulumi.StringInput) GrantAccountRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantAccountRole {
		return vs[0].(map[string]*GrantAccountRole)[vs[1].(string)]
	}).(GrantAccountRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantAccountRoleInput)(nil)).Elem(), &GrantAccountRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantAccountRoleArrayInput)(nil)).Elem(), GrantAccountRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantAccountRoleMapInput)(nil)).Elem(), GrantAccountRoleMap{})
	pulumi.RegisterOutputType(GrantAccountRoleOutput{})
	pulumi.RegisterOutputType(GrantAccountRoleArrayOutput{})
	pulumi.RegisterOutputType(GrantAccountRoleMapOutput{})
}
