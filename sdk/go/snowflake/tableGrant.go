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
//			_, err := snowflake.NewTableGrant(ctx, "grant", &snowflake.TableGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				SchemaName:   pulumi.String("schema"),
//				TableName:    pulumi.String("table"),
//				Privilege:    pulumi.String("SELECT"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//				},
//				Shares: pulumi.StringArray{
//					pulumi.String("share1"),
//				},
//				OnFuture:        pulumi.Bool(false),
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
// format is database_name|schema_name|table_name|privilege|with_grant_option|on_future|on_all|roles|shares
//
// ```sh
// $ pulumi import snowflake:index/tableGrant:TableGrant example "MY_DATABASE|MY_SCHEMA|MY_TABLE|USAGE|false|false|false|role1,role2|share1,share2"
// ```
type TableGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future tables on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrOutput `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future tables on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if on*future or on*all are unset).
	Shares pulumi.StringArrayOutput `pulumi:"shares"`
	// The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
	TableName pulumi.StringPtrOutput `pulumi:"tableName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewTableGrant registers a new resource with the given unique name, arguments, and options.
func NewTableGrant(ctx *pulumi.Context,
	name string, args *TableGrantArgs, opts ...pulumi.ResourceOption) (*TableGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TableGrant
	err := ctx.RegisterResource("snowflake:index/tableGrant:TableGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTableGrant gets an existing TableGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTableGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableGrantState, opts ...pulumi.ResourceOption) (*TableGrant, error) {
	var resource TableGrant
	err := ctx.ReadResource("snowflake:index/tableGrant:TableGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TableGrant resources.
type tableGrantState struct {
	// The name of the database containing the current or future tables on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future tables on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if on*future or on*all are unset).
	Shares []string `pulumi:"shares"`
	// The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
	TableName *string `pulumi:"tableName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type TableGrantState struct {
	// The name of the database containing the current or future tables on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future tables on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if on*future or on*all are unset).
	Shares pulumi.StringArrayInput
	// The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
	TableName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (TableGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableGrantState)(nil)).Elem()
}

type tableGrantArgs struct {
	// The name of the database containing the current or future tables on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future tables on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if on*future or on*all are unset).
	Shares []string `pulumi:"shares"`
	// The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
	TableName *string `pulumi:"tableName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a TableGrant resource.
type TableGrantArgs struct {
	// The name of the database containing the current or future tables on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future tables on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if on*future or on*all are unset).
	Shares pulumi.StringArrayInput
	// The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
	TableName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (TableGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableGrantArgs)(nil)).Elem()
}

type TableGrantInput interface {
	pulumi.Input

	ToTableGrantOutput() TableGrantOutput
	ToTableGrantOutputWithContext(ctx context.Context) TableGrantOutput
}

func (*TableGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**TableGrant)(nil)).Elem()
}

func (i *TableGrant) ToTableGrantOutput() TableGrantOutput {
	return i.ToTableGrantOutputWithContext(context.Background())
}

func (i *TableGrant) ToTableGrantOutputWithContext(ctx context.Context) TableGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableGrantOutput)
}

// TableGrantArrayInput is an input type that accepts TableGrantArray and TableGrantArrayOutput values.
// You can construct a concrete instance of `TableGrantArrayInput` via:
//
//	TableGrantArray{ TableGrantArgs{...} }
type TableGrantArrayInput interface {
	pulumi.Input

	ToTableGrantArrayOutput() TableGrantArrayOutput
	ToTableGrantArrayOutputWithContext(context.Context) TableGrantArrayOutput
}

type TableGrantArray []TableGrantInput

func (TableGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableGrant)(nil)).Elem()
}

func (i TableGrantArray) ToTableGrantArrayOutput() TableGrantArrayOutput {
	return i.ToTableGrantArrayOutputWithContext(context.Background())
}

func (i TableGrantArray) ToTableGrantArrayOutputWithContext(ctx context.Context) TableGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableGrantArrayOutput)
}

// TableGrantMapInput is an input type that accepts TableGrantMap and TableGrantMapOutput values.
// You can construct a concrete instance of `TableGrantMapInput` via:
//
//	TableGrantMap{ "key": TableGrantArgs{...} }
type TableGrantMapInput interface {
	pulumi.Input

	ToTableGrantMapOutput() TableGrantMapOutput
	ToTableGrantMapOutputWithContext(context.Context) TableGrantMapOutput
}

type TableGrantMap map[string]TableGrantInput

func (TableGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableGrant)(nil)).Elem()
}

func (i TableGrantMap) ToTableGrantMapOutput() TableGrantMapOutput {
	return i.ToTableGrantMapOutputWithContext(context.Background())
}

func (i TableGrantMap) ToTableGrantMapOutputWithContext(ctx context.Context) TableGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableGrantMapOutput)
}

type TableGrantOutput struct{ *pulumi.OutputState }

func (TableGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TableGrant)(nil)).Elem()
}

func (o TableGrantOutput) ToTableGrantOutput() TableGrantOutput {
	return o
}

func (o TableGrantOutput) ToTableGrantOutputWithContext(ctx context.Context) TableGrantOutput {
	return o
}

// The name of the database containing the current or future tables on which to grant privileges.
func (o TableGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o TableGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
func (o TableGrantOutput) OnAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.BoolPtrOutput { return v.OnAll }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
func (o TableGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
func (o TableGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
func (o TableGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o TableGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future tables on which to grant privileges.
func (o TableGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these shares (only valid if on*future or on*all are unset).
func (o TableGrantOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringArrayOutput { return v.Shares }).(pulumi.StringArrayOutput)
}

// The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
func (o TableGrantOutput) TableName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.StringPtrOutput { return v.TableName }).(pulumi.StringPtrOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o TableGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type TableGrantArrayOutput struct{ *pulumi.OutputState }

func (TableGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableGrant)(nil)).Elem()
}

func (o TableGrantArrayOutput) ToTableGrantArrayOutput() TableGrantArrayOutput {
	return o
}

func (o TableGrantArrayOutput) ToTableGrantArrayOutputWithContext(ctx context.Context) TableGrantArrayOutput {
	return o
}

func (o TableGrantArrayOutput) Index(i pulumi.IntInput) TableGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TableGrant {
		return vs[0].([]*TableGrant)[vs[1].(int)]
	}).(TableGrantOutput)
}

type TableGrantMapOutput struct{ *pulumi.OutputState }

func (TableGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableGrant)(nil)).Elem()
}

func (o TableGrantMapOutput) ToTableGrantMapOutput() TableGrantMapOutput {
	return o
}

func (o TableGrantMapOutput) ToTableGrantMapOutputWithContext(ctx context.Context) TableGrantMapOutput {
	return o
}

func (o TableGrantMapOutput) MapIndex(k pulumi.StringInput) TableGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TableGrant {
		return vs[0].(map[string]*TableGrant)[vs[1].(string)]
	}).(TableGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableGrantInput)(nil)).Elem(), &TableGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableGrantArrayInput)(nil)).Elem(), TableGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableGrantMapInput)(nil)).Elem(), TableGrantMap{})
	pulumi.RegisterOutputType(TableGrantOutput{})
	pulumi.RegisterOutputType(TableGrantArrayOutput{})
	pulumi.RegisterOutputType(TableGrantMapOutput{})
}
