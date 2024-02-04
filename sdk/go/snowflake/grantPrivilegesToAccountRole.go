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

// ## Import
//
// ### Import examples #### Grant all privileges OnAccountObject (Database)
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `"\"test_db_role\"|false|false|ALL|OnAccountObject|DATABASE|\"test_db\""`
//
// ```
//
// #### Grant list of privileges OnAllSchemasInDatabase
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `"\"test_db_role\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\"test_db\""`
//
// ```
//
// #### Grant list of privileges on table
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \"test_table\""`
//
// ```
//
// #### Grant list of privileges OnAll tables in schema
//
// ```sh
//
//	$ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \"test_schema\""`
//
// ```
type GrantPrivilegesToAccountRole struct {
	pulumi.CustomResourceState

	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName pulumi.StringOutput `pulumi:"accountRoleName"`
	// Grant all privileges on the account role.
	AllPrivileges pulumi.BoolPtrOutput `pulumi:"allPrivileges"`
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply pulumi.BoolPtrOutput `pulumi:"alwaysApply"`
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger pulumi.StringPtrOutput `pulumi:"alwaysApplyTrigger"`
	// If true, the privileges will be granted on the account.
	OnAccount pulumi.BoolPtrOutput `pulumi:"onAccount"`
	// Specifies the account object on which privileges will be granted
	OnAccountObject GrantPrivilegesToAccountRoleOnAccountObjectPtrOutput `pulumi:"onAccountObject"`
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToAccountRoleOnSchemaPtrOutput `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToAccountRoleOnSchemaObjectPtrOutput `pulumi:"onSchemaObject"`
	// The privileges to grant on the account role.
	Privileges pulumi.StringArrayOutput `pulumi:"privileges"`
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewGrantPrivilegesToAccountRole registers a new resource with the given unique name, arguments, and options.
func NewGrantPrivilegesToAccountRole(ctx *pulumi.Context,
	name string, args *GrantPrivilegesToAccountRoleArgs, opts ...pulumi.ResourceOption) (*GrantPrivilegesToAccountRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountRoleName == nil {
		return nil, errors.New("invalid value for required argument 'AccountRoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantPrivilegesToAccountRole
	err := ctx.RegisterResource("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantPrivilegesToAccountRole gets an existing GrantPrivilegesToAccountRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantPrivilegesToAccountRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantPrivilegesToAccountRoleState, opts ...pulumi.ResourceOption) (*GrantPrivilegesToAccountRole, error) {
	var resource GrantPrivilegesToAccountRole
	err := ctx.ReadResource("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantPrivilegesToAccountRole resources.
type grantPrivilegesToAccountRoleState struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName *string `pulumi:"accountRoleName"`
	// Grant all privileges on the account role.
	AllPrivileges *bool `pulumi:"allPrivileges"`
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply *bool `pulumi:"alwaysApply"`
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger *string `pulumi:"alwaysApplyTrigger"`
	// If true, the privileges will be granted on the account.
	OnAccount *bool `pulumi:"onAccount"`
	// Specifies the account object on which privileges will be granted
	OnAccountObject *GrantPrivilegesToAccountRoleOnAccountObject `pulumi:"onAccountObject"`
	// Specifies the schema on which privileges will be granted.
	OnSchema *GrantPrivilegesToAccountRoleOnSchema `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject *GrantPrivilegesToAccountRoleOnSchemaObject `pulumi:"onSchemaObject"`
	// The privileges to grant on the account role.
	Privileges []string `pulumi:"privileges"`
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type GrantPrivilegesToAccountRoleState struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName pulumi.StringPtrInput
	// Grant all privileges on the account role.
	AllPrivileges pulumi.BoolPtrInput
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply pulumi.BoolPtrInput
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger pulumi.StringPtrInput
	// If true, the privileges will be granted on the account.
	OnAccount pulumi.BoolPtrInput
	// Specifies the account object on which privileges will be granted
	OnAccountObject GrantPrivilegesToAccountRoleOnAccountObjectPtrInput
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToAccountRoleOnSchemaPtrInput
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToAccountRoleOnSchemaObjectPtrInput
	// The privileges to grant on the account role.
	Privileges pulumi.StringArrayInput
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption pulumi.BoolPtrInput
}

func (GrantPrivilegesToAccountRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToAccountRoleState)(nil)).Elem()
}

type grantPrivilegesToAccountRoleArgs struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName string `pulumi:"accountRoleName"`
	// Grant all privileges on the account role.
	AllPrivileges *bool `pulumi:"allPrivileges"`
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply *bool `pulumi:"alwaysApply"`
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger *string `pulumi:"alwaysApplyTrigger"`
	// If true, the privileges will be granted on the account.
	OnAccount *bool `pulumi:"onAccount"`
	// Specifies the account object on which privileges will be granted
	OnAccountObject *GrantPrivilegesToAccountRoleOnAccountObject `pulumi:"onAccountObject"`
	// Specifies the schema on which privileges will be granted.
	OnSchema *GrantPrivilegesToAccountRoleOnSchema `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject *GrantPrivilegesToAccountRoleOnSchemaObject `pulumi:"onSchemaObject"`
	// The privileges to grant on the account role.
	Privileges []string `pulumi:"privileges"`
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a GrantPrivilegesToAccountRole resource.
type GrantPrivilegesToAccountRoleArgs struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName pulumi.StringInput
	// Grant all privileges on the account role.
	AllPrivileges pulumi.BoolPtrInput
	// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
	// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
	// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
	// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
	// of the config being eventually convergent (producing an empty plan).
	AlwaysApply pulumi.BoolPtrInput
	// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
	AlwaysApplyTrigger pulumi.StringPtrInput
	// If true, the privileges will be granted on the account.
	OnAccount pulumi.BoolPtrInput
	// Specifies the account object on which privileges will be granted
	OnAccountObject GrantPrivilegesToAccountRoleOnAccountObjectPtrInput
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToAccountRoleOnSchemaPtrInput
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToAccountRoleOnSchemaObjectPtrInput
	// The privileges to grant on the account role.
	Privileges pulumi.StringArrayInput
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption pulumi.BoolPtrInput
}

func (GrantPrivilegesToAccountRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToAccountRoleArgs)(nil)).Elem()
}

type GrantPrivilegesToAccountRoleInput interface {
	pulumi.Input

	ToGrantPrivilegesToAccountRoleOutput() GrantPrivilegesToAccountRoleOutput
	ToGrantPrivilegesToAccountRoleOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleOutput
}

func (*GrantPrivilegesToAccountRole) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToAccountRole)(nil)).Elem()
}

func (i *GrantPrivilegesToAccountRole) ToGrantPrivilegesToAccountRoleOutput() GrantPrivilegesToAccountRoleOutput {
	return i.ToGrantPrivilegesToAccountRoleOutputWithContext(context.Background())
}

func (i *GrantPrivilegesToAccountRole) ToGrantPrivilegesToAccountRoleOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToAccountRoleOutput)
}

// GrantPrivilegesToAccountRoleArrayInput is an input type that accepts GrantPrivilegesToAccountRoleArray and GrantPrivilegesToAccountRoleArrayOutput values.
// You can construct a concrete instance of `GrantPrivilegesToAccountRoleArrayInput` via:
//
//	GrantPrivilegesToAccountRoleArray{ GrantPrivilegesToAccountRoleArgs{...} }
type GrantPrivilegesToAccountRoleArrayInput interface {
	pulumi.Input

	ToGrantPrivilegesToAccountRoleArrayOutput() GrantPrivilegesToAccountRoleArrayOutput
	ToGrantPrivilegesToAccountRoleArrayOutputWithContext(context.Context) GrantPrivilegesToAccountRoleArrayOutput
}

type GrantPrivilegesToAccountRoleArray []GrantPrivilegesToAccountRoleInput

func (GrantPrivilegesToAccountRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToAccountRole)(nil)).Elem()
}

func (i GrantPrivilegesToAccountRoleArray) ToGrantPrivilegesToAccountRoleArrayOutput() GrantPrivilegesToAccountRoleArrayOutput {
	return i.ToGrantPrivilegesToAccountRoleArrayOutputWithContext(context.Background())
}

func (i GrantPrivilegesToAccountRoleArray) ToGrantPrivilegesToAccountRoleArrayOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToAccountRoleArrayOutput)
}

// GrantPrivilegesToAccountRoleMapInput is an input type that accepts GrantPrivilegesToAccountRoleMap and GrantPrivilegesToAccountRoleMapOutput values.
// You can construct a concrete instance of `GrantPrivilegesToAccountRoleMapInput` via:
//
//	GrantPrivilegesToAccountRoleMap{ "key": GrantPrivilegesToAccountRoleArgs{...} }
type GrantPrivilegesToAccountRoleMapInput interface {
	pulumi.Input

	ToGrantPrivilegesToAccountRoleMapOutput() GrantPrivilegesToAccountRoleMapOutput
	ToGrantPrivilegesToAccountRoleMapOutputWithContext(context.Context) GrantPrivilegesToAccountRoleMapOutput
}

type GrantPrivilegesToAccountRoleMap map[string]GrantPrivilegesToAccountRoleInput

func (GrantPrivilegesToAccountRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToAccountRole)(nil)).Elem()
}

func (i GrantPrivilegesToAccountRoleMap) ToGrantPrivilegesToAccountRoleMapOutput() GrantPrivilegesToAccountRoleMapOutput {
	return i.ToGrantPrivilegesToAccountRoleMapOutputWithContext(context.Background())
}

func (i GrantPrivilegesToAccountRoleMap) ToGrantPrivilegesToAccountRoleMapOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToAccountRoleMapOutput)
}

type GrantPrivilegesToAccountRoleOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToAccountRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToAccountRole)(nil)).Elem()
}

func (o GrantPrivilegesToAccountRoleOutput) ToGrantPrivilegesToAccountRoleOutput() GrantPrivilegesToAccountRoleOutput {
	return o
}

func (o GrantPrivilegesToAccountRoleOutput) ToGrantPrivilegesToAccountRoleOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleOutput {
	return o
}

// The fully qualified name of the account role to which privileges will be granted.
func (o GrantPrivilegesToAccountRoleOutput) AccountRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.StringOutput { return v.AccountRoleName }).(pulumi.StringOutput)
}

// Grant all privileges on the account role.
func (o GrantPrivilegesToAccountRoleOutput) AllPrivileges() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.BoolPtrOutput { return v.AllPrivileges }).(pulumi.BoolPtrOutput)
}

// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
// of the config being eventually convergent (producing an empty plan).
func (o GrantPrivilegesToAccountRoleOutput) AlwaysApply() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.BoolPtrOutput { return v.AlwaysApply }).(pulumi.BoolPtrOutput)
}

// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
func (o GrantPrivilegesToAccountRoleOutput) AlwaysApplyTrigger() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.StringPtrOutput { return v.AlwaysApplyTrigger }).(pulumi.StringPtrOutput)
}

// If true, the privileges will be granted on the account.
func (o GrantPrivilegesToAccountRoleOutput) OnAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.BoolPtrOutput { return v.OnAccount }).(pulumi.BoolPtrOutput)
}

// Specifies the account object on which privileges will be granted
func (o GrantPrivilegesToAccountRoleOutput) OnAccountObject() GrantPrivilegesToAccountRoleOnAccountObjectPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) GrantPrivilegesToAccountRoleOnAccountObjectPtrOutput {
		return v.OnAccountObject
	}).(GrantPrivilegesToAccountRoleOnAccountObjectPtrOutput)
}

// Specifies the schema on which privileges will be granted.
func (o GrantPrivilegesToAccountRoleOutput) OnSchema() GrantPrivilegesToAccountRoleOnSchemaPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) GrantPrivilegesToAccountRoleOnSchemaPtrOutput { return v.OnSchema }).(GrantPrivilegesToAccountRoleOnSchemaPtrOutput)
}

// Specifies the schema object on which privileges will be granted.
func (o GrantPrivilegesToAccountRoleOutput) OnSchemaObject() GrantPrivilegesToAccountRoleOnSchemaObjectPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) GrantPrivilegesToAccountRoleOnSchemaObjectPtrOutput {
		return v.OnSchemaObject
	}).(GrantPrivilegesToAccountRoleOnSchemaObjectPtrOutput)
}

// The privileges to grant on the account role.
func (o GrantPrivilegesToAccountRoleOutput) Privileges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.StringArrayOutput { return v.Privileges }).(pulumi.StringArrayOutput)
}

// Specifies whether the grantee can grant the privileges to other users.
func (o GrantPrivilegesToAccountRoleOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToAccountRole) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type GrantPrivilegesToAccountRoleArrayOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToAccountRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToAccountRole)(nil)).Elem()
}

func (o GrantPrivilegesToAccountRoleArrayOutput) ToGrantPrivilegesToAccountRoleArrayOutput() GrantPrivilegesToAccountRoleArrayOutput {
	return o
}

func (o GrantPrivilegesToAccountRoleArrayOutput) ToGrantPrivilegesToAccountRoleArrayOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleArrayOutput {
	return o
}

func (o GrantPrivilegesToAccountRoleArrayOutput) Index(i pulumi.IntInput) GrantPrivilegesToAccountRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantPrivilegesToAccountRole {
		return vs[0].([]*GrantPrivilegesToAccountRole)[vs[1].(int)]
	}).(GrantPrivilegesToAccountRoleOutput)
}

type GrantPrivilegesToAccountRoleMapOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToAccountRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToAccountRole)(nil)).Elem()
}

func (o GrantPrivilegesToAccountRoleMapOutput) ToGrantPrivilegesToAccountRoleMapOutput() GrantPrivilegesToAccountRoleMapOutput {
	return o
}

func (o GrantPrivilegesToAccountRoleMapOutput) ToGrantPrivilegesToAccountRoleMapOutputWithContext(ctx context.Context) GrantPrivilegesToAccountRoleMapOutput {
	return o
}

func (o GrantPrivilegesToAccountRoleMapOutput) MapIndex(k pulumi.StringInput) GrantPrivilegesToAccountRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantPrivilegesToAccountRole {
		return vs[0].(map[string]*GrantPrivilegesToAccountRole)[vs[1].(string)]
	}).(GrantPrivilegesToAccountRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToAccountRoleInput)(nil)).Elem(), &GrantPrivilegesToAccountRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToAccountRoleArrayInput)(nil)).Elem(), GrantPrivilegesToAccountRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToAccountRoleMapInput)(nil)).Elem(), GrantPrivilegesToAccountRoleMap{})
	pulumi.RegisterOutputType(GrantPrivilegesToAccountRoleOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToAccountRoleArrayOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToAccountRoleMapOutput{})
}
