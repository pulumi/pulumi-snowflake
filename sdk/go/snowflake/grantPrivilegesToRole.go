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
//			// ## global privileges
//			// #################################
//			// list of privileges
//			_, err := snowflake.NewGrantPrivilegesToRole(ctx, "g1", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("MODIFY"),
//					pulumi.String("USAGE"),
//				},
//				RoleName:  pulumi.Any(r.Name),
//				OnAccount: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			// all privileges + grant option
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g2", &snowflake.GrantPrivilegesToRoleArgs{
//				RoleName:        pulumi.Any(r.Name),
//				OnAccount:       pulumi.Bool(true),
//				AllPrivileges:   pulumi.Bool(true),
//				WithGrantOption: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			// list of privileges
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g3", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("CREATE"),
//					pulumi.String("MONITOR"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnAccountObject: &snowflake.GrantPrivilegesToRoleOnAccountObjectArgs{
//					ObjectType: pulumi.String("DATABASE"),
//					ObjectName: pulumi.Any(d.Name),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// all privileges + grant option
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g4", &snowflake.GrantPrivilegesToRoleArgs{
//				RoleName: pulumi.Any(r.Name),
//				OnAccountObject: &snowflake.GrantPrivilegesToRoleOnAccountObjectArgs{
//					ObjectType: pulumi.String("DATABASE"),
//					ObjectName: pulumi.Any(d.Name),
//				},
//				AllPrivileges:   pulumi.Bool(true),
//				WithGrantOption: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			// list of privileges
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g5", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("MODIFY"),
//					pulumi.String("CREATE TABLE"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchema: &snowflake.GrantPrivilegesToRoleOnSchemaArgs{
//					SchemaName: pulumi.String("\"my_db\".\"my_schema\""),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// all privileges + grant option
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g6", &snowflake.GrantPrivilegesToRoleArgs{
//				RoleName: pulumi.Any(r.Name),
//				OnSchema: &snowflake.GrantPrivilegesToRoleOnSchemaArgs{
//					SchemaName: pulumi.String("\"my_db\".\"my_schema\""),
//				},
//				AllPrivileges:   pulumi.Bool(true),
//				WithGrantOption: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			// all schemas in database
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g7", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("MODIFY"),
//					pulumi.String("CREATE TABLE"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchema: &snowflake.GrantPrivilegesToRoleOnSchemaArgs{
//					AllSchemasInDatabase: pulumi.Any(d.Name),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// future schemas in database
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g8", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("MODIFY"),
//					pulumi.String("CREATE TABLE"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchema: &snowflake.GrantPrivilegesToRoleOnSchemaArgs{
//					FutureSchemasInDatabase: pulumi.Any(d.Name),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// list of privileges
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g9", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("SELECT"),
//					pulumi.String("REFERENCES"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchemaObject: &snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs{
//					ObjectType: pulumi.String("VIEW"),
//					ObjectName: pulumi.String("\"my_db\".\"my_schema\".\"my_view\""),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// all privileges + grant option
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g10", &snowflake.GrantPrivilegesToRoleArgs{
//				RoleName: pulumi.Any(r.Name),
//				OnSchemaObject: &snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs{
//					ObjectType: pulumi.String("VIEW"),
//					ObjectName: pulumi.String("\"my_db\".\"my_schema\".\"my_view\""),
//				},
//				AllPrivileges:   pulumi.Bool(true),
//				WithGrantOption: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			// all in database
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g11", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("SELECT"),
//					pulumi.String("INSERT"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchemaObject: &snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs{
//					All: &snowflake.GrantPrivilegesToRoleOnSchemaObjectAllArgs{
//						ObjectTypePlural: pulumi.String("TABLES"),
//						InDatabase:       pulumi.Any(d.Name),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// all in schema
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g12", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("SELECT"),
//					pulumi.String("INSERT"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchemaObject: &snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs{
//					All: &snowflake.GrantPrivilegesToRoleOnSchemaObjectAllArgs{
//						ObjectTypePlural: pulumi.String("TABLES"),
//						InSchema:         pulumi.String("\"my_db\".\"my_schema\""),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// future in database
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g13", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("SELECT"),
//					pulumi.String("INSERT"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchemaObject: &snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs{
//					Future: &snowflake.GrantPrivilegesToRoleOnSchemaObjectFutureArgs{
//						ObjectTypePlural: pulumi.String("TABLES"),
//						InDatabase:       pulumi.Any(d.Name),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// future in schema
//			_, err = snowflake.NewGrantPrivilegesToRole(ctx, "g14", &snowflake.GrantPrivilegesToRoleArgs{
//				Privileges: pulumi.StringArray{
//					pulumi.String("SELECT"),
//					pulumi.String("INSERT"),
//				},
//				RoleName: pulumi.Any(r.Name),
//				OnSchemaObject: &snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs{
//					Future: &snowflake.GrantPrivilegesToRoleOnSchemaObjectFutureArgs{
//						ObjectTypePlural: pulumi.String("TABLES"),
//						InSchema:         pulumi.String("\"my_db\".\"my_schema\""),
//					},
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// format is role_name (string) | privileges (comma-delimited string) | all_privileges (bool) |with_grant_option (bool) | on_account (bool) | on_account_object (bool) | on_schema (bool) | on_schema_object (bool) | all (bool) | future (bool) | object_type (string) | object_name (string) | object_type_plural (string) | in_schema (bool) | schema_name (string) | in_database (bool) | database_name (string)
//
// ```sh
// $ pulumi import snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole "test_role|MANAGE GRANTS,MONITOR USAGE|false|false|true|false|false|false|false|false||||false||false|"
// ```
type GrantPrivilegesToRole struct {
	pulumi.CustomResourceState

	// Grant all privileges on the account role.
	AllPrivileges pulumi.BoolPtrOutput `pulumi:"allPrivileges"`
	// If true, the privileges will be granted on the account.
	OnAccount pulumi.BoolPtrOutput `pulumi:"onAccount"`
	// Specifies the account object on which privileges will be granted
	OnAccountObject GrantPrivilegesToRoleOnAccountObjectPtrOutput `pulumi:"onAccountObject"`
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToRoleOnSchemaPtrOutput `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToRoleOnSchemaObjectPtrOutput `pulumi:"onSchemaObject"`
	// The privileges to grant on the account role.
	Privileges pulumi.StringArrayOutput `pulumi:"privileges"`
	// The fully qualified name of the role to which privileges will be granted.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewGrantPrivilegesToRole registers a new resource with the given unique name, arguments, and options.
func NewGrantPrivilegesToRole(ctx *pulumi.Context,
	name string, args *GrantPrivilegesToRoleArgs, opts ...pulumi.ResourceOption) (*GrantPrivilegesToRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantPrivilegesToRole
	err := ctx.RegisterResource("snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantPrivilegesToRole gets an existing GrantPrivilegesToRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantPrivilegesToRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantPrivilegesToRoleState, opts ...pulumi.ResourceOption) (*GrantPrivilegesToRole, error) {
	var resource GrantPrivilegesToRole
	err := ctx.ReadResource("snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantPrivilegesToRole resources.
type grantPrivilegesToRoleState struct {
	// Grant all privileges on the account role.
	AllPrivileges *bool `pulumi:"allPrivileges"`
	// If true, the privileges will be granted on the account.
	OnAccount *bool `pulumi:"onAccount"`
	// Specifies the account object on which privileges will be granted
	OnAccountObject *GrantPrivilegesToRoleOnAccountObject `pulumi:"onAccountObject"`
	// Specifies the schema on which privileges will be granted.
	OnSchema *GrantPrivilegesToRoleOnSchema `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject *GrantPrivilegesToRoleOnSchemaObject `pulumi:"onSchemaObject"`
	// The privileges to grant on the account role.
	Privileges []string `pulumi:"privileges"`
	// The fully qualified name of the role to which privileges will be granted.
	RoleName *string `pulumi:"roleName"`
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type GrantPrivilegesToRoleState struct {
	// Grant all privileges on the account role.
	AllPrivileges pulumi.BoolPtrInput
	// If true, the privileges will be granted on the account.
	OnAccount pulumi.BoolPtrInput
	// Specifies the account object on which privileges will be granted
	OnAccountObject GrantPrivilegesToRoleOnAccountObjectPtrInput
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToRoleOnSchemaPtrInput
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToRoleOnSchemaObjectPtrInput
	// The privileges to grant on the account role.
	Privileges pulumi.StringArrayInput
	// The fully qualified name of the role to which privileges will be granted.
	RoleName pulumi.StringPtrInput
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption pulumi.BoolPtrInput
}

func (GrantPrivilegesToRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToRoleState)(nil)).Elem()
}

type grantPrivilegesToRoleArgs struct {
	// Grant all privileges on the account role.
	AllPrivileges *bool `pulumi:"allPrivileges"`
	// If true, the privileges will be granted on the account.
	OnAccount *bool `pulumi:"onAccount"`
	// Specifies the account object on which privileges will be granted
	OnAccountObject *GrantPrivilegesToRoleOnAccountObject `pulumi:"onAccountObject"`
	// Specifies the schema on which privileges will be granted.
	OnSchema *GrantPrivilegesToRoleOnSchema `pulumi:"onSchema"`
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject *GrantPrivilegesToRoleOnSchemaObject `pulumi:"onSchemaObject"`
	// The privileges to grant on the account role.
	Privileges []string `pulumi:"privileges"`
	// The fully qualified name of the role to which privileges will be granted.
	RoleName string `pulumi:"roleName"`
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a GrantPrivilegesToRole resource.
type GrantPrivilegesToRoleArgs struct {
	// Grant all privileges on the account role.
	AllPrivileges pulumi.BoolPtrInput
	// If true, the privileges will be granted on the account.
	OnAccount pulumi.BoolPtrInput
	// Specifies the account object on which privileges will be granted
	OnAccountObject GrantPrivilegesToRoleOnAccountObjectPtrInput
	// Specifies the schema on which privileges will be granted.
	OnSchema GrantPrivilegesToRoleOnSchemaPtrInput
	// Specifies the schema object on which privileges will be granted.
	OnSchemaObject GrantPrivilegesToRoleOnSchemaObjectPtrInput
	// The privileges to grant on the account role.
	Privileges pulumi.StringArrayInput
	// The fully qualified name of the role to which privileges will be granted.
	RoleName pulumi.StringInput
	// Specifies whether the grantee can grant the privileges to other users.
	WithGrantOption pulumi.BoolPtrInput
}

func (GrantPrivilegesToRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToRoleArgs)(nil)).Elem()
}

type GrantPrivilegesToRoleInput interface {
	pulumi.Input

	ToGrantPrivilegesToRoleOutput() GrantPrivilegesToRoleOutput
	ToGrantPrivilegesToRoleOutputWithContext(ctx context.Context) GrantPrivilegesToRoleOutput
}

func (*GrantPrivilegesToRole) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToRole)(nil)).Elem()
}

func (i *GrantPrivilegesToRole) ToGrantPrivilegesToRoleOutput() GrantPrivilegesToRoleOutput {
	return i.ToGrantPrivilegesToRoleOutputWithContext(context.Background())
}

func (i *GrantPrivilegesToRole) ToGrantPrivilegesToRoleOutputWithContext(ctx context.Context) GrantPrivilegesToRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToRoleOutput)
}

// GrantPrivilegesToRoleArrayInput is an input type that accepts GrantPrivilegesToRoleArray and GrantPrivilegesToRoleArrayOutput values.
// You can construct a concrete instance of `GrantPrivilegesToRoleArrayInput` via:
//
//	GrantPrivilegesToRoleArray{ GrantPrivilegesToRoleArgs{...} }
type GrantPrivilegesToRoleArrayInput interface {
	pulumi.Input

	ToGrantPrivilegesToRoleArrayOutput() GrantPrivilegesToRoleArrayOutput
	ToGrantPrivilegesToRoleArrayOutputWithContext(context.Context) GrantPrivilegesToRoleArrayOutput
}

type GrantPrivilegesToRoleArray []GrantPrivilegesToRoleInput

func (GrantPrivilegesToRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToRole)(nil)).Elem()
}

func (i GrantPrivilegesToRoleArray) ToGrantPrivilegesToRoleArrayOutput() GrantPrivilegesToRoleArrayOutput {
	return i.ToGrantPrivilegesToRoleArrayOutputWithContext(context.Background())
}

func (i GrantPrivilegesToRoleArray) ToGrantPrivilegesToRoleArrayOutputWithContext(ctx context.Context) GrantPrivilegesToRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToRoleArrayOutput)
}

// GrantPrivilegesToRoleMapInput is an input type that accepts GrantPrivilegesToRoleMap and GrantPrivilegesToRoleMapOutput values.
// You can construct a concrete instance of `GrantPrivilegesToRoleMapInput` via:
//
//	GrantPrivilegesToRoleMap{ "key": GrantPrivilegesToRoleArgs{...} }
type GrantPrivilegesToRoleMapInput interface {
	pulumi.Input

	ToGrantPrivilegesToRoleMapOutput() GrantPrivilegesToRoleMapOutput
	ToGrantPrivilegesToRoleMapOutputWithContext(context.Context) GrantPrivilegesToRoleMapOutput
}

type GrantPrivilegesToRoleMap map[string]GrantPrivilegesToRoleInput

func (GrantPrivilegesToRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToRole)(nil)).Elem()
}

func (i GrantPrivilegesToRoleMap) ToGrantPrivilegesToRoleMapOutput() GrantPrivilegesToRoleMapOutput {
	return i.ToGrantPrivilegesToRoleMapOutputWithContext(context.Background())
}

func (i GrantPrivilegesToRoleMap) ToGrantPrivilegesToRoleMapOutputWithContext(ctx context.Context) GrantPrivilegesToRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToRoleMapOutput)
}

type GrantPrivilegesToRoleOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToRole)(nil)).Elem()
}

func (o GrantPrivilegesToRoleOutput) ToGrantPrivilegesToRoleOutput() GrantPrivilegesToRoleOutput {
	return o
}

func (o GrantPrivilegesToRoleOutput) ToGrantPrivilegesToRoleOutputWithContext(ctx context.Context) GrantPrivilegesToRoleOutput {
	return o
}

// Grant all privileges on the account role.
func (o GrantPrivilegesToRoleOutput) AllPrivileges() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) pulumi.BoolPtrOutput { return v.AllPrivileges }).(pulumi.BoolPtrOutput)
}

// If true, the privileges will be granted on the account.
func (o GrantPrivilegesToRoleOutput) OnAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) pulumi.BoolPtrOutput { return v.OnAccount }).(pulumi.BoolPtrOutput)
}

// Specifies the account object on which privileges will be granted
func (o GrantPrivilegesToRoleOutput) OnAccountObject() GrantPrivilegesToRoleOnAccountObjectPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) GrantPrivilegesToRoleOnAccountObjectPtrOutput { return v.OnAccountObject }).(GrantPrivilegesToRoleOnAccountObjectPtrOutput)
}

// Specifies the schema on which privileges will be granted.
func (o GrantPrivilegesToRoleOutput) OnSchema() GrantPrivilegesToRoleOnSchemaPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) GrantPrivilegesToRoleOnSchemaPtrOutput { return v.OnSchema }).(GrantPrivilegesToRoleOnSchemaPtrOutput)
}

// Specifies the schema object on which privileges will be granted.
func (o GrantPrivilegesToRoleOutput) OnSchemaObject() GrantPrivilegesToRoleOnSchemaObjectPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) GrantPrivilegesToRoleOnSchemaObjectPtrOutput { return v.OnSchemaObject }).(GrantPrivilegesToRoleOnSchemaObjectPtrOutput)
}

// The privileges to grant on the account role.
func (o GrantPrivilegesToRoleOutput) Privileges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) pulumi.StringArrayOutput { return v.Privileges }).(pulumi.StringArrayOutput)
}

// The fully qualified name of the role to which privileges will be granted.
func (o GrantPrivilegesToRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// Specifies whether the grantee can grant the privileges to other users.
func (o GrantPrivilegesToRoleOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToRole) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type GrantPrivilegesToRoleArrayOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToRole)(nil)).Elem()
}

func (o GrantPrivilegesToRoleArrayOutput) ToGrantPrivilegesToRoleArrayOutput() GrantPrivilegesToRoleArrayOutput {
	return o
}

func (o GrantPrivilegesToRoleArrayOutput) ToGrantPrivilegesToRoleArrayOutputWithContext(ctx context.Context) GrantPrivilegesToRoleArrayOutput {
	return o
}

func (o GrantPrivilegesToRoleArrayOutput) Index(i pulumi.IntInput) GrantPrivilegesToRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantPrivilegesToRole {
		return vs[0].([]*GrantPrivilegesToRole)[vs[1].(int)]
	}).(GrantPrivilegesToRoleOutput)
}

type GrantPrivilegesToRoleMapOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToRole)(nil)).Elem()
}

func (o GrantPrivilegesToRoleMapOutput) ToGrantPrivilegesToRoleMapOutput() GrantPrivilegesToRoleMapOutput {
	return o
}

func (o GrantPrivilegesToRoleMapOutput) ToGrantPrivilegesToRoleMapOutputWithContext(ctx context.Context) GrantPrivilegesToRoleMapOutput {
	return o
}

func (o GrantPrivilegesToRoleMapOutput) MapIndex(k pulumi.StringInput) GrantPrivilegesToRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantPrivilegesToRole {
		return vs[0].(map[string]*GrantPrivilegesToRole)[vs[1].(string)]
	}).(GrantPrivilegesToRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToRoleInput)(nil)).Elem(), &GrantPrivilegesToRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToRoleArrayInput)(nil)).Elem(), GrantPrivilegesToRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToRoleMapInput)(nil)).Elem(), GrantPrivilegesToRoleMap{})
	pulumi.RegisterOutputType(GrantPrivilegesToRoleOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToRoleArrayOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToRoleMapOutput{})
}
