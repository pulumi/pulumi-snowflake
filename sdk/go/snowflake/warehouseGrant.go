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
//			_, err := snowflake.NewWarehouseGrant(ctx, "grant", &snowflake.WarehouseGrantArgs{
//				Privilege: pulumi.String("MODIFY"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				WarehouseName:   pulumi.String("warehouse"),
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
// format is warehouse_name|privilege|with_grant_option|roles
//
// ```sh
//
//	$ pulumi import snowflake:index/warehouseGrant:WarehouseGrant example "MY_WAREHOUSE|MODIFY|false|role1,role2"
//
// ```
type WarehouseGrant struct {
	pulumi.CustomResourceState

	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the warehouse on which to grant privileges.
	WarehouseName pulumi.StringOutput `pulumi:"warehouseName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewWarehouseGrant registers a new resource with the given unique name, arguments, and options.
func NewWarehouseGrant(ctx *pulumi.Context,
	name string, args *WarehouseGrantArgs, opts ...pulumi.ResourceOption) (*WarehouseGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.WarehouseName == nil {
		return nil, errors.New("invalid value for required argument 'WarehouseName'")
	}
	var resource WarehouseGrant
	err := ctx.RegisterResource("snowflake:index/warehouseGrant:WarehouseGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWarehouseGrant gets an existing WarehouseGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWarehouseGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WarehouseGrantState, opts ...pulumi.ResourceOption) (*WarehouseGrant, error) {
	var resource WarehouseGrant
	err := ctx.ReadResource("snowflake:index/warehouseGrant:WarehouseGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WarehouseGrant resources.
type warehouseGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the warehouse on which to grant privileges.
	WarehouseName *string `pulumi:"warehouseName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type WarehouseGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the warehouse on which to grant privileges.
	WarehouseName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (WarehouseGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*warehouseGrantState)(nil)).Elem()
}

type warehouseGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the warehouse on which to grant privileges.
	WarehouseName string `pulumi:"warehouseName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a WarehouseGrant resource.
type WarehouseGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the warehouse on which to grant privileges.
	WarehouseName pulumi.StringInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (WarehouseGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*warehouseGrantArgs)(nil)).Elem()
}

type WarehouseGrantInput interface {
	pulumi.Input

	ToWarehouseGrantOutput() WarehouseGrantOutput
	ToWarehouseGrantOutputWithContext(ctx context.Context) WarehouseGrantOutput
}

func (*WarehouseGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**WarehouseGrant)(nil)).Elem()
}

func (i *WarehouseGrant) ToWarehouseGrantOutput() WarehouseGrantOutput {
	return i.ToWarehouseGrantOutputWithContext(context.Background())
}

func (i *WarehouseGrant) ToWarehouseGrantOutputWithContext(ctx context.Context) WarehouseGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WarehouseGrantOutput)
}

// WarehouseGrantArrayInput is an input type that accepts WarehouseGrantArray and WarehouseGrantArrayOutput values.
// You can construct a concrete instance of `WarehouseGrantArrayInput` via:
//
//	WarehouseGrantArray{ WarehouseGrantArgs{...} }
type WarehouseGrantArrayInput interface {
	pulumi.Input

	ToWarehouseGrantArrayOutput() WarehouseGrantArrayOutput
	ToWarehouseGrantArrayOutputWithContext(context.Context) WarehouseGrantArrayOutput
}

type WarehouseGrantArray []WarehouseGrantInput

func (WarehouseGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WarehouseGrant)(nil)).Elem()
}

func (i WarehouseGrantArray) ToWarehouseGrantArrayOutput() WarehouseGrantArrayOutput {
	return i.ToWarehouseGrantArrayOutputWithContext(context.Background())
}

func (i WarehouseGrantArray) ToWarehouseGrantArrayOutputWithContext(ctx context.Context) WarehouseGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WarehouseGrantArrayOutput)
}

// WarehouseGrantMapInput is an input type that accepts WarehouseGrantMap and WarehouseGrantMapOutput values.
// You can construct a concrete instance of `WarehouseGrantMapInput` via:
//
//	WarehouseGrantMap{ "key": WarehouseGrantArgs{...} }
type WarehouseGrantMapInput interface {
	pulumi.Input

	ToWarehouseGrantMapOutput() WarehouseGrantMapOutput
	ToWarehouseGrantMapOutputWithContext(context.Context) WarehouseGrantMapOutput
}

type WarehouseGrantMap map[string]WarehouseGrantInput

func (WarehouseGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WarehouseGrant)(nil)).Elem()
}

func (i WarehouseGrantMap) ToWarehouseGrantMapOutput() WarehouseGrantMapOutput {
	return i.ToWarehouseGrantMapOutputWithContext(context.Background())
}

func (i WarehouseGrantMap) ToWarehouseGrantMapOutputWithContext(ctx context.Context) WarehouseGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WarehouseGrantMapOutput)
}

type WarehouseGrantOutput struct{ *pulumi.OutputState }

func (WarehouseGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WarehouseGrant)(nil)).Elem()
}

func (o WarehouseGrantOutput) ToWarehouseGrantOutput() WarehouseGrantOutput {
	return o
}

func (o WarehouseGrantOutput) ToWarehouseGrantOutputWithContext(ctx context.Context) WarehouseGrantOutput {
	return o
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o WarehouseGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WarehouseGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
func (o WarehouseGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WarehouseGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
func (o WarehouseGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WarehouseGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o WarehouseGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WarehouseGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the warehouse on which to grant privileges.
func (o WarehouseGrantOutput) WarehouseName() pulumi.StringOutput {
	return o.ApplyT(func(v *WarehouseGrant) pulumi.StringOutput { return v.WarehouseName }).(pulumi.StringOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o WarehouseGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WarehouseGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type WarehouseGrantArrayOutput struct{ *pulumi.OutputState }

func (WarehouseGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WarehouseGrant)(nil)).Elem()
}

func (o WarehouseGrantArrayOutput) ToWarehouseGrantArrayOutput() WarehouseGrantArrayOutput {
	return o
}

func (o WarehouseGrantArrayOutput) ToWarehouseGrantArrayOutputWithContext(ctx context.Context) WarehouseGrantArrayOutput {
	return o
}

func (o WarehouseGrantArrayOutput) Index(i pulumi.IntInput) WarehouseGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WarehouseGrant {
		return vs[0].([]*WarehouseGrant)[vs[1].(int)]
	}).(WarehouseGrantOutput)
}

type WarehouseGrantMapOutput struct{ *pulumi.OutputState }

func (WarehouseGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WarehouseGrant)(nil)).Elem()
}

func (o WarehouseGrantMapOutput) ToWarehouseGrantMapOutput() WarehouseGrantMapOutput {
	return o
}

func (o WarehouseGrantMapOutput) ToWarehouseGrantMapOutputWithContext(ctx context.Context) WarehouseGrantMapOutput {
	return o
}

func (o WarehouseGrantMapOutput) MapIndex(k pulumi.StringInput) WarehouseGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WarehouseGrant {
		return vs[0].(map[string]*WarehouseGrant)[vs[1].(string)]
	}).(WarehouseGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WarehouseGrantInput)(nil)).Elem(), &WarehouseGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*WarehouseGrantArrayInput)(nil)).Elem(), WarehouseGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WarehouseGrantMapInput)(nil)).Elem(), WarehouseGrantMap{})
	pulumi.RegisterOutputType(WarehouseGrantOutput{})
	pulumi.RegisterOutputType(WarehouseGrantArrayOutput{})
	pulumi.RegisterOutputType(WarehouseGrantMapOutput{})
}
