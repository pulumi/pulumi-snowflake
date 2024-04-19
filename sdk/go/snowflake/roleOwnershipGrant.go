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

// > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantOwnership instead. <deprecation>
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
//			role, err := snowflake.NewRole(ctx, "role", &snowflake.RoleArgs{
//				Comment: pulumi.String("for testing"),
//			})
//			if err != nil {
//				return err
//			}
//			otherRole, err := snowflake.NewRole(ctx, "otherRole", nil)
//			if err != nil {
//				return err
//			}
//			// ensure the Terraform user inherits ownership privileges for the rking_test_role role
//			// otherwise Terraform will fail to destroy the rking_test_role2 role due to insufficient privileges
//			_, err = snowflake.NewRoleGrants(ctx, "grants", &snowflake.RoleGrantsArgs{
//				RoleName: role.Name,
//				Roles: pulumi.StringArray{
//					pulumi.String("ACCOUNTADMIN"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewRoleOwnershipGrant(ctx, "grant", &snowflake.RoleOwnershipGrantArgs{
//				OnRoleName:    role.Name,
//				ToRoleName:    otherRole.Name,
//				CurrentGrants: pulumi.String("COPY"),
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
// ```sh
// $ pulumi import snowflake:index/roleOwnershipGrant:RoleOwnershipGrant example "<on_role_name>|<to_role_name>|<current_grants>"
// ```
type RoleOwnershipGrant struct {
	pulumi.CustomResourceState

	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants pulumi.StringPtrOutput `pulumi:"currentGrants"`
	// The name of the role ownership is granted on.
	OnRoleName pulumi.StringOutput `pulumi:"onRoleName"`
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName pulumi.StringOutput `pulumi:"toRoleName"`
}

// NewRoleOwnershipGrant registers a new resource with the given unique name, arguments, and options.
func NewRoleOwnershipGrant(ctx *pulumi.Context,
	name string, args *RoleOwnershipGrantArgs, opts ...pulumi.ResourceOption) (*RoleOwnershipGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OnRoleName == nil {
		return nil, errors.New("invalid value for required argument 'OnRoleName'")
	}
	if args.ToRoleName == nil {
		return nil, errors.New("invalid value for required argument 'ToRoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoleOwnershipGrant
	err := ctx.RegisterResource("snowflake:index/roleOwnershipGrant:RoleOwnershipGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleOwnershipGrant gets an existing RoleOwnershipGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleOwnershipGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleOwnershipGrantState, opts ...pulumi.ResourceOption) (*RoleOwnershipGrant, error) {
	var resource RoleOwnershipGrant
	err := ctx.ReadResource("snowflake:index/roleOwnershipGrant:RoleOwnershipGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleOwnershipGrant resources.
type roleOwnershipGrantState struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants *string `pulumi:"currentGrants"`
	// The name of the role ownership is granted on.
	OnRoleName *string `pulumi:"onRoleName"`
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName *string `pulumi:"toRoleName"`
}

type RoleOwnershipGrantState struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants pulumi.StringPtrInput
	// The name of the role ownership is granted on.
	OnRoleName pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName pulumi.StringPtrInput
}

func (RoleOwnershipGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleOwnershipGrantState)(nil)).Elem()
}

type roleOwnershipGrantArgs struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants *string `pulumi:"currentGrants"`
	// The name of the role ownership is granted on.
	OnRoleName string `pulumi:"onRoleName"`
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName string `pulumi:"toRoleName"`
}

// The set of arguments for constructing a RoleOwnershipGrant resource.
type RoleOwnershipGrantArgs struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants pulumi.StringPtrInput
	// The name of the role ownership is granted on.
	OnRoleName pulumi.StringInput
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName pulumi.StringInput
}

func (RoleOwnershipGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleOwnershipGrantArgs)(nil)).Elem()
}

type RoleOwnershipGrantInput interface {
	pulumi.Input

	ToRoleOwnershipGrantOutput() RoleOwnershipGrantOutput
	ToRoleOwnershipGrantOutputWithContext(ctx context.Context) RoleOwnershipGrantOutput
}

func (*RoleOwnershipGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleOwnershipGrant)(nil)).Elem()
}

func (i *RoleOwnershipGrant) ToRoleOwnershipGrantOutput() RoleOwnershipGrantOutput {
	return i.ToRoleOwnershipGrantOutputWithContext(context.Background())
}

func (i *RoleOwnershipGrant) ToRoleOwnershipGrantOutputWithContext(ctx context.Context) RoleOwnershipGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOwnershipGrantOutput)
}

// RoleOwnershipGrantArrayInput is an input type that accepts RoleOwnershipGrantArray and RoleOwnershipGrantArrayOutput values.
// You can construct a concrete instance of `RoleOwnershipGrantArrayInput` via:
//
//	RoleOwnershipGrantArray{ RoleOwnershipGrantArgs{...} }
type RoleOwnershipGrantArrayInput interface {
	pulumi.Input

	ToRoleOwnershipGrantArrayOutput() RoleOwnershipGrantArrayOutput
	ToRoleOwnershipGrantArrayOutputWithContext(context.Context) RoleOwnershipGrantArrayOutput
}

type RoleOwnershipGrantArray []RoleOwnershipGrantInput

func (RoleOwnershipGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleOwnershipGrant)(nil)).Elem()
}

func (i RoleOwnershipGrantArray) ToRoleOwnershipGrantArrayOutput() RoleOwnershipGrantArrayOutput {
	return i.ToRoleOwnershipGrantArrayOutputWithContext(context.Background())
}

func (i RoleOwnershipGrantArray) ToRoleOwnershipGrantArrayOutputWithContext(ctx context.Context) RoleOwnershipGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOwnershipGrantArrayOutput)
}

// RoleOwnershipGrantMapInput is an input type that accepts RoleOwnershipGrantMap and RoleOwnershipGrantMapOutput values.
// You can construct a concrete instance of `RoleOwnershipGrantMapInput` via:
//
//	RoleOwnershipGrantMap{ "key": RoleOwnershipGrantArgs{...} }
type RoleOwnershipGrantMapInput interface {
	pulumi.Input

	ToRoleOwnershipGrantMapOutput() RoleOwnershipGrantMapOutput
	ToRoleOwnershipGrantMapOutputWithContext(context.Context) RoleOwnershipGrantMapOutput
}

type RoleOwnershipGrantMap map[string]RoleOwnershipGrantInput

func (RoleOwnershipGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleOwnershipGrant)(nil)).Elem()
}

func (i RoleOwnershipGrantMap) ToRoleOwnershipGrantMapOutput() RoleOwnershipGrantMapOutput {
	return i.ToRoleOwnershipGrantMapOutputWithContext(context.Background())
}

func (i RoleOwnershipGrantMap) ToRoleOwnershipGrantMapOutputWithContext(ctx context.Context) RoleOwnershipGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOwnershipGrantMapOutput)
}

type RoleOwnershipGrantOutput struct{ *pulumi.OutputState }

func (RoleOwnershipGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleOwnershipGrant)(nil)).Elem()
}

func (o RoleOwnershipGrantOutput) ToRoleOwnershipGrantOutput() RoleOwnershipGrantOutput {
	return o
}

func (o RoleOwnershipGrantOutput) ToRoleOwnershipGrantOutputWithContext(ctx context.Context) RoleOwnershipGrantOutput {
	return o
}

// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
func (o RoleOwnershipGrantOutput) CurrentGrants() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RoleOwnershipGrant) pulumi.StringPtrOutput { return v.CurrentGrants }).(pulumi.StringPtrOutput)
}

// The name of the role ownership is granted on.
func (o RoleOwnershipGrantOutput) OnRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleOwnershipGrant) pulumi.StringOutput { return v.OnRoleName }).(pulumi.StringOutput)
}

// The name of the role to revert ownership to on destroy.
func (o RoleOwnershipGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RoleOwnershipGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
func (o RoleOwnershipGrantOutput) ToRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleOwnershipGrant) pulumi.StringOutput { return v.ToRoleName }).(pulumi.StringOutput)
}

type RoleOwnershipGrantArrayOutput struct{ *pulumi.OutputState }

func (RoleOwnershipGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleOwnershipGrant)(nil)).Elem()
}

func (o RoleOwnershipGrantArrayOutput) ToRoleOwnershipGrantArrayOutput() RoleOwnershipGrantArrayOutput {
	return o
}

func (o RoleOwnershipGrantArrayOutput) ToRoleOwnershipGrantArrayOutputWithContext(ctx context.Context) RoleOwnershipGrantArrayOutput {
	return o
}

func (o RoleOwnershipGrantArrayOutput) Index(i pulumi.IntInput) RoleOwnershipGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoleOwnershipGrant {
		return vs[0].([]*RoleOwnershipGrant)[vs[1].(int)]
	}).(RoleOwnershipGrantOutput)
}

type RoleOwnershipGrantMapOutput struct{ *pulumi.OutputState }

func (RoleOwnershipGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleOwnershipGrant)(nil)).Elem()
}

func (o RoleOwnershipGrantMapOutput) ToRoleOwnershipGrantMapOutput() RoleOwnershipGrantMapOutput {
	return o
}

func (o RoleOwnershipGrantMapOutput) ToRoleOwnershipGrantMapOutputWithContext(ctx context.Context) RoleOwnershipGrantMapOutput {
	return o
}

func (o RoleOwnershipGrantMapOutput) MapIndex(k pulumi.StringInput) RoleOwnershipGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoleOwnershipGrant {
		return vs[0].(map[string]*RoleOwnershipGrant)[vs[1].(string)]
	}).(RoleOwnershipGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleOwnershipGrantInput)(nil)).Elem(), &RoleOwnershipGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleOwnershipGrantArrayInput)(nil)).Elem(), RoleOwnershipGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleOwnershipGrantMapInput)(nil)).Elem(), RoleOwnershipGrantMap{})
	pulumi.RegisterOutputType(RoleOwnershipGrantOutput{})
	pulumi.RegisterOutputType(RoleOwnershipGrantArrayOutput{})
	pulumi.RegisterOutputType(RoleOwnershipGrantMapOutput{})
}
