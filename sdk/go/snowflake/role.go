// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := snowflake.NewRole(ctx, "role", &snowflake.RoleArgs{
// 			Comment: pulumi.String("A role."),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// ```sh
//  $ pulumi import snowflake:index/role:Role example roleName
// ```
type Role struct {
	pulumi.CustomResourceState

	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	Name    pulumi.StringOutput    `pulumi:"name"`
	// Definitions of a tag to associate with the resource.
	Tags RoleTagArrayOutput `pulumi:"tags"`
}

// NewRole registers a new resource with the given unique name, arguments, and options.
func NewRole(ctx *pulumi.Context,
	name string, args *RoleArgs, opts ...pulumi.ResourceOption) (*Role, error) {
	if args == nil {
		args = &RoleArgs{}
	}

	var resource Role
	err := ctx.RegisterResource("snowflake:index/role:Role", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRole gets an existing Role resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleState, opts ...pulumi.ResourceOption) (*Role, error) {
	var resource Role
	err := ctx.ReadResource("snowflake:index/role:Role", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Role resources.
type roleState struct {
	Comment *string `pulumi:"comment"`
	Name    *string `pulumi:"name"`
	// Definitions of a tag to associate with the resource.
	Tags []RoleTag `pulumi:"tags"`
}

type RoleState struct {
	Comment pulumi.StringPtrInput
	Name    pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	Tags RoleTagArrayInput
}

func (RoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleState)(nil)).Elem()
}

type roleArgs struct {
	Comment *string `pulumi:"comment"`
	Name    *string `pulumi:"name"`
	// Definitions of a tag to associate with the resource.
	Tags []RoleTag `pulumi:"tags"`
}

// The set of arguments for constructing a Role resource.
type RoleArgs struct {
	Comment pulumi.StringPtrInput
	Name    pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	Tags RoleTagArrayInput
}

func (RoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleArgs)(nil)).Elem()
}

type RoleInput interface {
	pulumi.Input

	ToRoleOutput() RoleOutput
	ToRoleOutputWithContext(ctx context.Context) RoleOutput
}

func (*Role) ElementType() reflect.Type {
	return reflect.TypeOf((*Role)(nil))
}

func (i *Role) ToRoleOutput() RoleOutput {
	return i.ToRoleOutputWithContext(context.Background())
}

func (i *Role) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOutput)
}

func (i *Role) ToRolePtrOutput() RolePtrOutput {
	return i.ToRolePtrOutputWithContext(context.Background())
}

func (i *Role) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePtrOutput)
}

type RolePtrInput interface {
	pulumi.Input

	ToRolePtrOutput() RolePtrOutput
	ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput
}

type rolePtrType RoleArgs

func (*rolePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil))
}

func (i *rolePtrType) ToRolePtrOutput() RolePtrOutput {
	return i.ToRolePtrOutputWithContext(context.Background())
}

func (i *rolePtrType) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePtrOutput)
}

// RoleArrayInput is an input type that accepts RoleArray and RoleArrayOutput values.
// You can construct a concrete instance of `RoleArrayInput` via:
//
//          RoleArray{ RoleArgs{...} }
type RoleArrayInput interface {
	pulumi.Input

	ToRoleArrayOutput() RoleArrayOutput
	ToRoleArrayOutputWithContext(context.Context) RoleArrayOutput
}

type RoleArray []RoleInput

func (RoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Role)(nil)).Elem()
}

func (i RoleArray) ToRoleArrayOutput() RoleArrayOutput {
	return i.ToRoleArrayOutputWithContext(context.Background())
}

func (i RoleArray) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleArrayOutput)
}

// RoleMapInput is an input type that accepts RoleMap and RoleMapOutput values.
// You can construct a concrete instance of `RoleMapInput` via:
//
//          RoleMap{ "key": RoleArgs{...} }
type RoleMapInput interface {
	pulumi.Input

	ToRoleMapOutput() RoleMapOutput
	ToRoleMapOutputWithContext(context.Context) RoleMapOutput
}

type RoleMap map[string]RoleInput

func (RoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Role)(nil)).Elem()
}

func (i RoleMap) ToRoleMapOutput() RoleMapOutput {
	return i.ToRoleMapOutputWithContext(context.Background())
}

func (i RoleMap) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMapOutput)
}

type RoleOutput struct{ *pulumi.OutputState }

func (RoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Role)(nil))
}

func (o RoleOutput) ToRoleOutput() RoleOutput {
	return o
}

func (o RoleOutput) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return o
}

func (o RoleOutput) ToRolePtrOutput() RolePtrOutput {
	return o.ToRolePtrOutputWithContext(context.Background())
}

func (o RoleOutput) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Role) *Role {
		return &v
	}).(RolePtrOutput)
}

type RolePtrOutput struct{ *pulumi.OutputState }

func (RolePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil))
}

func (o RolePtrOutput) ToRolePtrOutput() RolePtrOutput {
	return o
}

func (o RolePtrOutput) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return o
}

func (o RolePtrOutput) Elem() RoleOutput {
	return o.ApplyT(func(v *Role) Role {
		if v != nil {
			return *v
		}
		var ret Role
		return ret
	}).(RoleOutput)
}

type RoleArrayOutput struct{ *pulumi.OutputState }

func (RoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Role)(nil))
}

func (o RoleArrayOutput) ToRoleArrayOutput() RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) Index(i pulumi.IntInput) RoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Role {
		return vs[0].([]Role)[vs[1].(int)]
	}).(RoleOutput)
}

type RoleMapOutput struct{ *pulumi.OutputState }

func (RoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Role)(nil))
}

func (o RoleMapOutput) ToRoleMapOutput() RoleMapOutput {
	return o
}

func (o RoleMapOutput) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return o
}

func (o RoleMapOutput) MapIndex(k pulumi.StringInput) RoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Role {
		return vs[0].(map[string]Role)[vs[1].(string)]
	}).(RoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleInput)(nil)).Elem(), &Role{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePtrInput)(nil)).Elem(), &Role{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleArrayInput)(nil)).Elem(), RoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleMapInput)(nil)).Elem(), RoleMap{})
	pulumi.RegisterOutputType(RoleOutput{})
	pulumi.RegisterOutputType(RolePtrOutput{})
	pulumi.RegisterOutputType(RoleArrayOutput{})
	pulumi.RegisterOutputType(RoleMapOutput{})
}
