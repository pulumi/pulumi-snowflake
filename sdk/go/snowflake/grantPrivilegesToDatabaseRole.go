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

// !> **Warning** Be careful when using `alwaysApply` field. It will always produce a plan (even when no changes were made) and can be harmful in some setups. For more details why we decided to introduce it to go our document explaining those design decisions (coming soon).
//
// ## Example Usage
// ### on database privileges
// ##################################
//
// # list of privileges
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  privileges         = ["CREATE", "MONITOR"]
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_database        = snowflake_database_role.db_role.database
//	}
//
// # all privileges + grant option
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_database        = snowflake_database_role.db_role.database
//	  all_privileges     = true
//	  with_grant_option  = true
//	}
//
// # all privileges + grant option + always apply
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_database        = snowflake_database_role.db_role.database
//	  always_apply       = true
//	  all_privileges     = true
//	  with_grant_option  = true
//	}
//
// ##################################
// ### schema privileges
// ##################################
//
// # list of privileges
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  privileges         = ["MODIFY", "CREATE TABLE"]
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_schema {
//	    schema_name = "\"${snowflake_database_role.db_role.database}\".\"my_schema\"" # note this is a fully qualified name!
//	  }
//	}
//
// # all privileges + grant option
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_schema {
//	    schema_name = "\"${snowflake_database_role.db_role.database}\".\"my_schema\"" # note this is a fully qualified name!
//	  }
//	  all_privileges    = true
//	  with_grant_option = true
//	}
//
// # all schemas in database
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  privileges         = ["MODIFY", "CREATE TABLE"]
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_schema {
//	    all_schemas_in_database = snowflake_database_role.db_role.database
//	  }
//	}
//
// # future schemas in database
//
//	resource "snowflake_grant_privileges_to_database_role" "example" {
//	  privileges         = ["MODIFY", "CREATE TABLE"]
//	  database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
//	  on_schema {
//	    future_schemas_in_database = snowflake_database_role.db_role.database
//	  }
//	}
//
// ##################################
//
// ## Import
//
// ### Import examples #### Grant all privileges OnDatabase
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|ALL|OnDatabase|\"test_db\""`
//
// ```
//
// #### Grant list of privileges OnAllSchemasInDatabase
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\"test_db\""`
//
// ```
//
// #### Grant list of privileges on table
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_table\""`
//
// ```
//
// #### Grant list of privileges OnAll tables in schema
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_schema\""`
//
// ```
type GrantPrivilegesToDatabaseRole struct {
	pulumi.CustomResourceState

	// Grant all privileges on the database role.
	AllPrivileges pulumi.BoolPtrOutput `pulumi:"allPrivileges"`
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply pulumi.BoolPtrOutput `pulumi:"alwaysApply"`
	// This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
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
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply *bool `pulumi:"alwaysApply"`
	// This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
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
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply pulumi.BoolPtrInput
	// This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
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
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply *bool `pulumi:"alwaysApply"`
	// This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
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
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply pulumi.BoolPtrInput
	// This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
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

// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
// of the config being eventually convergent (producing an empty plan).
func (o GrantPrivilegesToDatabaseRoleOutput) AlwaysApply() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToDatabaseRole) pulumi.BoolPtrOutput { return v.AlwaysApply }).(pulumi.BoolPtrOutput)
}

// This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
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