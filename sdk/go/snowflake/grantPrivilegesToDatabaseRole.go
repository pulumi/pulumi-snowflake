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

// > **Note** This is a preview resource. It's ready for general use. In case of any errors, please file an issue in our GitHub repository.
//
// !> **Warning** Be careful when using `alwaysApply` field. It will always produce a plan (even when no changes were made) and can be harmful in some setups. For more details why we decided to introduce it to go our document explaining those design decisions (coming soon).
//
// #### Grant all privileges OnDatabase
//
// ```sh
// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|ALL|OnDatabase|\"test_db\""`
// ```
//
// #### Grant list of privileges OnAllSchemasInDatabase
//
// ```sh
// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\"test_db\""`
// ```
//
// #### Grant list of privileges on table
//
// ```sh
// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_table\""`
// ```
//
// #### Grant list of privileges OnAll tables in schema
//
// ```sh
// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_schema\""`
// ```
type GrantPrivilegesToDatabaseRole struct {
	pulumi.CustomResourceState

	// Grant all privileges on the database role.
	AllPrivileges pulumi.BoolPtrOutput `pulumi:"allPrivileges"`
	AlwaysApply   pulumi.BoolPtrOutput `pulumi:"alwaysApply"`
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger pulumi.StringPtrOutput `pulumi:"alwaysApplyTrigger"`
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName pulumi.StringOutput `pulumi:"databaseRoleName"`
	// The fully qualified name of the database on which privileges will be granted.
	OnDatabase pulumi.StringPtrOutput `pulumi:"onDatabase"`
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToDatabaseRoleOnSchemaPtrOutput `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToDatabaseRoleOnSchemaObjectPtrOutput `pulumi:"onSchemaObject"`
	// The privileges to grant on the database role.
	Privileges pulumi.StringArrayOutput `pulumi:"privileges"`
	// If specified, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewGrantPrivilegesToDatabaseRole registers a new resource with the given unique name, arguments, and options.
func NewGrantPrivilegesToDatabaseRole(ctx *pulumi.Context,
	name string, args *GrantPrivilegesToDatabaseRoleArgs, opts ...pulumi.ResourceOption) (*GrantPrivilegesToDatabaseRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseRoleName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseRoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantPrivilegesToDatabaseRole
	err := ctx.RegisterResource("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantPrivilegesToDatabaseRole gets an existing GrantPrivilegesToDatabaseRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantPrivilegesToDatabaseRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantPrivilegesToDatabaseRoleState, opts ...pulumi.ResourceOption) (*GrantPrivilegesToDatabaseRole, error) {
	var resource GrantPrivilegesToDatabaseRole
	err := ctx.ReadResource("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantPrivilegesToDatabaseRole resources.
type grantPrivilegesToDatabaseRoleState struct {
	// Grant all privileges on the database role.
	AllPrivileges *bool `pulumi:"allPrivileges"`
	AlwaysApply   *bool `pulumi:"alwaysApply"`
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger *string `pulumi:"alwaysApplyTrigger"`
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName *string `pulumi:"databaseRoleName"`
	// The fully qualified name of the database on which privileges will be granted.
	OnDatabase *string `pulumi:"onDatabase"`
	// Specifies the schema on which privileges will be granted.
	OnSchema *GrantPrivilegesToDatabaseRoleOnSchema `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject *GrantPrivilegesToDatabaseRoleOnSchemaObject `pulumi:"onSchemaObject"`
	// The privileges to grant on the database role.
	Privileges []string `pulumi:"privileges"`
	// If specified, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type GrantPrivilegesToDatabaseRoleState struct {
	// Grant all privileges on the database role.
	AllPrivileges pulumi.BoolPtrInput
	AlwaysApply   pulumi.BoolPtrInput
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger pulumi.StringPtrInput
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName pulumi.StringPtrInput
	// The fully qualified name of the database on which privileges will be granted.
	OnDatabase pulumi.StringPtrInput
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToDatabaseRoleOnSchemaPtrInput
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToDatabaseRoleOnSchemaObjectPtrInput
	// The privileges to grant on the database role.
	Privileges pulumi.StringArrayInput
	// If specified, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (GrantPrivilegesToDatabaseRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToDatabaseRoleState)(nil)).Elem()
}

type grantPrivilegesToDatabaseRoleArgs struct {
	// Grant all privileges on the database role.
	AllPrivileges *bool `pulumi:"allPrivileges"`
	AlwaysApply   *bool `pulumi:"alwaysApply"`
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger *string `pulumi:"alwaysApplyTrigger"`
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName string `pulumi:"databaseRoleName"`
	// The fully qualified name of the database on which privileges will be granted.
	OnDatabase *string `pulumi:"onDatabase"`
	// Specifies the schema on which privileges will be granted.
	OnSchema *GrantPrivilegesToDatabaseRoleOnSchema `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject *GrantPrivilegesToDatabaseRoleOnSchemaObject `pulumi:"onSchemaObject"`
	// The privileges to grant on the database role.
	Privileges []string `pulumi:"privileges"`
	// If specified, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a GrantPrivilegesToDatabaseRole resource.
type GrantPrivilegesToDatabaseRoleArgs struct {
	// Grant all privileges on the database role.
	AllPrivileges pulumi.BoolPtrInput
	AlwaysApply   pulumi.BoolPtrInput
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger pulumi.StringPtrInput
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName pulumi.StringInput
	// The fully qualified name of the database on which privileges will be granted.
	OnDatabase pulumi.StringPtrInput
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToDatabaseRoleOnSchemaPtrInput
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToDatabaseRoleOnSchemaObjectPtrInput
	// The privileges to grant on the database role.
	Privileges pulumi.StringArrayInput
	// If specified, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (GrantPrivilegesToDatabaseRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToDatabaseRoleArgs)(nil)).Elem()
}

type GrantPrivilegesToDatabaseRoleInput interface {
	pulumi.Input

	ToGrantPrivilegesToDatabaseRoleOutput() GrantPrivilegesToDatabaseRoleOutput
	ToGrantPrivilegesToDatabaseRoleOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleOutput
}

func (*GrantPrivilegesToDatabaseRole) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToDatabaseRole)(nil)).Elem()
}

func (i *GrantPrivilegesToDatabaseRole) ToGrantPrivilegesToDatabaseRoleOutput() GrantPrivilegesToDatabaseRoleOutput {
	return i.ToGrantPrivilegesToDatabaseRoleOutputWithContext(context.Background())
}

func (i *GrantPrivilegesToDatabaseRole) ToGrantPrivilegesToDatabaseRoleOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToDatabaseRoleOutput)
}

// GrantPrivilegesToDatabaseRoleArrayInput is an input type that accepts GrantPrivilegesToDatabaseRoleArray and GrantPrivilegesToDatabaseRoleArrayOutput values.
// You can construct a concrete instance of `GrantPrivilegesToDatabaseRoleArrayInput` via:
//
//	GrantPrivilegesToDatabaseRoleArray{ GrantPrivilegesToDatabaseRoleArgs{...} }
type GrantPrivilegesToDatabaseRoleArrayInput interface {
	pulumi.Input

	ToGrantPrivilegesToDatabaseRoleArrayOutput() GrantPrivilegesToDatabaseRoleArrayOutput
	ToGrantPrivilegesToDatabaseRoleArrayOutputWithContext(context.Context) GrantPrivilegesToDatabaseRoleArrayOutput
}

type GrantPrivilegesToDatabaseRoleArray []GrantPrivilegesToDatabaseRoleInput

func (GrantPrivilegesToDatabaseRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToDatabaseRole)(nil)).Elem()
}

func (i GrantPrivilegesToDatabaseRoleArray) ToGrantPrivilegesToDatabaseRoleArrayOutput() GrantPrivilegesToDatabaseRoleArrayOutput {
	return i.ToGrantPrivilegesToDatabaseRoleArrayOutputWithContext(context.Background())
}

func (i GrantPrivilegesToDatabaseRoleArray) ToGrantPrivilegesToDatabaseRoleArrayOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToDatabaseRoleArrayOutput)
}

// GrantPrivilegesToDatabaseRoleMapInput is an input type that accepts GrantPrivilegesToDatabaseRoleMap and GrantPrivilegesToDatabaseRoleMapOutput values.
// You can construct a concrete instance of `GrantPrivilegesToDatabaseRoleMapInput` via:
//
//	GrantPrivilegesToDatabaseRoleMap{ "key": GrantPrivilegesToDatabaseRoleArgs{...} }
type GrantPrivilegesToDatabaseRoleMapInput interface {
	pulumi.Input

	ToGrantPrivilegesToDatabaseRoleMapOutput() GrantPrivilegesToDatabaseRoleMapOutput
	ToGrantPrivilegesToDatabaseRoleMapOutputWithContext(context.Context) GrantPrivilegesToDatabaseRoleMapOutput
}

type GrantPrivilegesToDatabaseRoleMap map[string]GrantPrivilegesToDatabaseRoleInput

func (GrantPrivilegesToDatabaseRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToDatabaseRole)(nil)).Elem()
}

func (i GrantPrivilegesToDatabaseRoleMap) ToGrantPrivilegesToDatabaseRoleMapOutput() GrantPrivilegesToDatabaseRoleMapOutput {
	return i.ToGrantPrivilegesToDatabaseRoleMapOutputWithContext(context.Background())
}

func (i GrantPrivilegesToDatabaseRoleMap) ToGrantPrivilegesToDatabaseRoleMapOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToDatabaseRoleMapOutput)
}

type GrantPrivilegesToDatabaseRoleOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToDatabaseRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToDatabaseRole)(nil)).Elem()
}

func (o GrantPrivilegesToDatabaseRoleOutput) ToGrantPrivilegesToDatabaseRoleOutput() GrantPrivilegesToDatabaseRoleOutput {
	return o
}

func (o GrantPrivilegesToDatabaseRoleOutput) ToGrantPrivilegesToDatabaseRoleOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleOutput {
	return o
}

// Grant all privileges on the database role.
func (o GrantPrivilegesToDatabaseRoleOutput) AllPrivileges() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.BoolPtrOutput { return v.AllPrivileges }).(pulumi.BoolPtrOutput)
}

func (o GrantPrivilegesToDatabaseRoleOutput) AlwaysApply() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.BoolPtrOutput { return v.AlwaysApply }).(pulumi.BoolPtrOutput)
}

// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
func (o GrantPrivilegesToDatabaseRoleOutput) AlwaysApplyTrigger() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.StringPtrOutput { return v.AlwaysApplyTrigger }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the database role to which privileges will be granted.
func (o GrantPrivilegesToDatabaseRoleOutput) DatabaseRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.StringOutput { return v.DatabaseRoleName }).(pulumi.StringOutput)
}

// The fully qualified name of the database on which privileges will be granted.
func (o GrantPrivilegesToDatabaseRoleOutput) OnDatabase() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.StringPtrOutput { return v.OnDatabase }).(pulumi.StringPtrOutput)
}

// Specifies the schema on which privileges will be granted.
func (o GrantPrivilegesToDatabaseRoleOutput) OnSchema() GrantPrivilegesToDatabaseRoleOnSchemaPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) GrantPrivilegesToDatabaseRoleOnSchemaPtrOutput {
		return v.OnSchema
	}).(GrantPrivilegesToDatabaseRoleOnSchemaPtrOutput)
}

// Specifies the schema object on which privileges will be granted.
func (o GrantPrivilegesToDatabaseRoleOutput) OnSchemaObject() GrantPrivilegesToDatabaseRoleOnSchemaObjectPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) GrantPrivilegesToDatabaseRoleOnSchemaObjectPtrOutput {
		return v.OnSchemaObject
	}).(GrantPrivilegesToDatabaseRoleOnSchemaObjectPtrOutput)
}

// The privileges to grant on the database role.
func (o GrantPrivilegesToDatabaseRoleOutput) Privileges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.StringArrayOutput { return v.Privileges }).(pulumi.StringArrayOutput)
}

// If specified, allows the recipient role to grant the privileges to other roles.
func (o GrantPrivilegesToDatabaseRoleOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type GrantPrivilegesToDatabaseRoleArrayOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToDatabaseRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToDatabaseRole)(nil)).Elem()
}

func (o GrantPrivilegesToDatabaseRoleArrayOutput) ToGrantPrivilegesToDatabaseRoleArrayOutput() GrantPrivilegesToDatabaseRoleArrayOutput {
	return o
}

func (o GrantPrivilegesToDatabaseRoleArrayOutput) ToGrantPrivilegesToDatabaseRoleArrayOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleArrayOutput {
	return o
}

func (o GrantPrivilegesToDatabaseRoleArrayOutput) Index(i pulumi.IntInput) GrantPrivilegesToDatabaseRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantPrivilegesToDatabaseRole {
		return vs[0].([]*GrantPrivilegesToDatabaseRole)[vs[1].(int)]
	}).(GrantPrivilegesToDatabaseRoleOutput)
}

type GrantPrivilegesToDatabaseRoleMapOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToDatabaseRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToDatabaseRole)(nil)).Elem()
}

func (o GrantPrivilegesToDatabaseRoleMapOutput) ToGrantPrivilegesToDatabaseRoleMapOutput() GrantPrivilegesToDatabaseRoleMapOutput {
	return o
}

func (o GrantPrivilegesToDatabaseRoleMapOutput) ToGrantPrivilegesToDatabaseRoleMapOutputWithContext(ctx context.Context) GrantPrivilegesToDatabaseRoleMapOutput {
	return o
}

func (o GrantPrivilegesToDatabaseRoleMapOutput) MapIndex(k pulumi.StringInput) GrantPrivilegesToDatabaseRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantPrivilegesToDatabaseRole {
		return vs[0].(map[string]*GrantPrivilegesToDatabaseRole)[vs[1].(string)]
	}).(GrantPrivilegesToDatabaseRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToDatabaseRoleInput)(nil)).Elem(), &GrantPrivilegesToDatabaseRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToDatabaseRoleArrayInput)(nil)).Elem(), GrantPrivilegesToDatabaseRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToDatabaseRoleMapInput)(nil)).Elem(), GrantPrivilegesToDatabaseRoleMap{})
	pulumi.RegisterOutputType(GrantPrivilegesToDatabaseRoleOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToDatabaseRoleArrayOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToDatabaseRoleMapOutput{})
}
