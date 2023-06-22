// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
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
//			role, err := snowflake.NewRole(ctx, "role", &snowflake.RoleArgs{
//				Comment: pulumi.String("for testing"),
//			})
//			if err != nil {
//				return err
//			}
//			user, err := snowflake.NewUser(ctx, "user", &snowflake.UserArgs{
//				Comment: pulumi.String("for testing"),
//			})
//			if err != nil {
//				return err
//			}
//			user2, err := snowflake.NewUser(ctx, "user2", &snowflake.UserArgs{
//				Comment: pulumi.String("for testing"),
//			})
//			if err != nil {
//				return err
//			}
//			otherRole, err := snowflake.NewRole(ctx, "otherRole", nil)
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewRoleGrants(ctx, "grants", &snowflake.RoleGrantsArgs{
//				RoleName: role.Name,
//				Roles: pulumi.StringArray{
//					otherRole.Name,
//				},
//				Users: pulumi.StringArray{
//					user.Name,
//					user2.Name,
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
// format is role_name|roles|users
//
// ```sh
//
//	$ pulumi import snowflake:index/roleGrants:RoleGrants example "role_name|role1,role2|user1,user2"
//
// ```
type RoleGrants struct {
	pulumi.CustomResourceState

	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The name of the role we are granting.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// Grants role to this specified role.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// Grants role to this specified user.
	Users pulumi.StringArrayOutput `pulumi:"users"`
}

// NewRoleGrants registers a new resource with the given unique name, arguments, and options.
func NewRoleGrants(ctx *pulumi.Context,
	name string, args *RoleGrantsArgs, opts ...pulumi.ResourceOption) (*RoleGrants, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	var resource RoleGrants
	err := ctx.RegisterResource("snowflake:index/roleGrants:RoleGrants", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleGrants gets an existing RoleGrants resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleGrants(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleGrantsState, opts ...pulumi.ResourceOption) (*RoleGrants, error) {
	var resource RoleGrants
	err := ctx.ReadResource("snowflake:index/roleGrants:RoleGrants", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleGrants resources.
type roleGrantsState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the role we are granting.
	RoleName *string `pulumi:"roleName"`
	// Grants role to this specified role.
	Roles []string `pulumi:"roles"`
	// Grants role to this specified user.
	Users []string `pulumi:"users"`
}

type RoleGrantsState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the role we are granting.
	RoleName pulumi.StringPtrInput
	// Grants role to this specified role.
	Roles pulumi.StringArrayInput
	// Grants role to this specified user.
	Users pulumi.StringArrayInput
}

func (RoleGrantsState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleGrantsState)(nil)).Elem()
}

type roleGrantsArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the role we are granting.
	RoleName string `pulumi:"roleName"`
	// Grants role to this specified role.
	Roles []string `pulumi:"roles"`
	// Grants role to this specified user.
	Users []string `pulumi:"users"`
}

// The set of arguments for constructing a RoleGrants resource.
type RoleGrantsArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the role we are granting.
	RoleName pulumi.StringInput
	// Grants role to this specified role.
	Roles pulumi.StringArrayInput
	// Grants role to this specified user.
	Users pulumi.StringArrayInput
}

func (RoleGrantsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleGrantsArgs)(nil)).Elem()
}

type RoleGrantsInput interface {
	pulumi.Input

	ToRoleGrantsOutput() RoleGrantsOutput
	ToRoleGrantsOutputWithContext(ctx context.Context) RoleGrantsOutput
}

func (*RoleGrants) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleGrants)(nil)).Elem()
}

func (i *RoleGrants) ToRoleGrantsOutput() RoleGrantsOutput {
	return i.ToRoleGrantsOutputWithContext(context.Background())
}

func (i *RoleGrants) ToRoleGrantsOutputWithContext(ctx context.Context) RoleGrantsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleGrantsOutput)
}

// RoleGrantsArrayInput is an input type that accepts RoleGrantsArray and RoleGrantsArrayOutput values.
// You can construct a concrete instance of `RoleGrantsArrayInput` via:
//
//	RoleGrantsArray{ RoleGrantsArgs{...} }
type RoleGrantsArrayInput interface {
	pulumi.Input

	ToRoleGrantsArrayOutput() RoleGrantsArrayOutput
	ToRoleGrantsArrayOutputWithContext(context.Context) RoleGrantsArrayOutput
}

type RoleGrantsArray []RoleGrantsInput

func (RoleGrantsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleGrants)(nil)).Elem()
}

func (i RoleGrantsArray) ToRoleGrantsArrayOutput() RoleGrantsArrayOutput {
	return i.ToRoleGrantsArrayOutputWithContext(context.Background())
}

func (i RoleGrantsArray) ToRoleGrantsArrayOutputWithContext(ctx context.Context) RoleGrantsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleGrantsArrayOutput)
}

// RoleGrantsMapInput is an input type that accepts RoleGrantsMap and RoleGrantsMapOutput values.
// You can construct a concrete instance of `RoleGrantsMapInput` via:
//
//	RoleGrantsMap{ "key": RoleGrantsArgs{...} }
type RoleGrantsMapInput interface {
	pulumi.Input

	ToRoleGrantsMapOutput() RoleGrantsMapOutput
	ToRoleGrantsMapOutputWithContext(context.Context) RoleGrantsMapOutput
}

type RoleGrantsMap map[string]RoleGrantsInput

func (RoleGrantsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleGrants)(nil)).Elem()
}

func (i RoleGrantsMap) ToRoleGrantsMapOutput() RoleGrantsMapOutput {
	return i.ToRoleGrantsMapOutputWithContext(context.Background())
}

func (i RoleGrantsMap) ToRoleGrantsMapOutputWithContext(ctx context.Context) RoleGrantsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleGrantsMapOutput)
}

type RoleGrantsOutput struct{ *pulumi.OutputState }

func (RoleGrantsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleGrants)(nil)).Elem()
}

func (o RoleGrantsOutput) ToRoleGrantsOutput() RoleGrantsOutput {
	return o
}

func (o RoleGrantsOutput) ToRoleGrantsOutputWithContext(ctx context.Context) RoleGrantsOutput {
	return o
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o RoleGrantsOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleGrants) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The name of the role we are granting.
func (o RoleGrantsOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleGrants) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// Grants role to this specified role.
func (o RoleGrantsOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleGrants) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// Grants role to this specified user.
func (o RoleGrantsOutput) Users() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleGrants) pulumi.StringArrayOutput { return v.Users }).(pulumi.StringArrayOutput)
}

type RoleGrantsArrayOutput struct{ *pulumi.OutputState }

func (RoleGrantsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleGrants)(nil)).Elem()
}

func (o RoleGrantsArrayOutput) ToRoleGrantsArrayOutput() RoleGrantsArrayOutput {
	return o
}

func (o RoleGrantsArrayOutput) ToRoleGrantsArrayOutputWithContext(ctx context.Context) RoleGrantsArrayOutput {
	return o
}

func (o RoleGrantsArrayOutput) Index(i pulumi.IntInput) RoleGrantsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoleGrants {
		return vs[0].([]*RoleGrants)[vs[1].(int)]
	}).(RoleGrantsOutput)
}

type RoleGrantsMapOutput struct{ *pulumi.OutputState }

func (RoleGrantsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleGrants)(nil)).Elem()
}

func (o RoleGrantsMapOutput) ToRoleGrantsMapOutput() RoleGrantsMapOutput {
	return o
}

func (o RoleGrantsMapOutput) ToRoleGrantsMapOutputWithContext(ctx context.Context) RoleGrantsMapOutput {
	return o
}

func (o RoleGrantsMapOutput) MapIndex(k pulumi.StringInput) RoleGrantsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoleGrants {
		return vs[0].(map[string]*RoleGrants)[vs[1].(string)]
	}).(RoleGrantsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleGrantsInput)(nil)).Elem(), &RoleGrants{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleGrantsArrayInput)(nil)).Elem(), RoleGrantsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleGrantsMapInput)(nil)).Elem(), RoleGrantsMap{})
	pulumi.RegisterOutputType(RoleGrantsOutput{})
	pulumi.RegisterOutputType(RoleGrantsArrayOutput{})
	pulumi.RegisterOutputType(RoleGrantsMapOutput{})
}
