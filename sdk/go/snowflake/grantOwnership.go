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
// ### Import examples
//
// #### OnObject on Schema ToAccountRole
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|COPY|OnObject|SCHEMA|"database_name"."schema_name"'`
// ```
//
// #### OnObject on Schema ToDatabaseRole
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToDatabaseRole|"database_name"."database_role_name"|COPY|OnObject|SCHEMA|"database_name"."schema_name"'`
// ```
//
// #### OnObject on Table
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|COPY|OnObject|TABLE|"database_name"."schema_name"."table_name"'`
// ```
//
// #### OnAll InDatabase
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|REVOKE|OnAll|TABLES|InDatabase|"database_name"'`
// ```
//
// #### OnAll InSchema
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"||OnAll|TABLES|InSchema|"database_name"."schema_name"'`
// ```
//
// #### OnFuture InDatabase
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"||OnFuture|TABLES|InDatabase|"database_name"'`
// ```
//
// #### OnFuture InSchema
//
// ```sh
// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|COPY|OnFuture|TABLES|InSchema|"database_name"."schema_name"'`
// ```
type GrantOwnership struct {
	pulumi.CustomResourceState

	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName pulumi.StringPtrOutput `pulumi:"accountRoleName"`
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName pulumi.StringPtrOutput `pulumi:"databaseRoleName"`
	// Configures which object(s) should transfer their ownership to the specified role.
	On GrantOwnershipOnOutput `pulumi:"on"`
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
	OutboundPrivileges pulumi.StringPtrOutput `pulumi:"outboundPrivileges"`
}

// NewGrantOwnership registers a new resource with the given unique name, arguments, and options.
func NewGrantOwnership(ctx *pulumi.Context,
	name string, args *GrantOwnershipArgs, opts ...pulumi.ResourceOption) (*GrantOwnership, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.On == nil {
		return nil, errors.New("invalid value for required argument 'On'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantOwnership
	err := ctx.RegisterResource("snowflake:index/grantOwnership:GrantOwnership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantOwnership gets an existing GrantOwnership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantOwnership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantOwnershipState, opts ...pulumi.ResourceOption) (*GrantOwnership, error) {
	var resource GrantOwnership
	err := ctx.ReadResource("snowflake:index/grantOwnership:GrantOwnership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantOwnership resources.
type grantOwnershipState struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName *string `pulumi:"accountRoleName"`
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName *string `pulumi:"databaseRoleName"`
	// Configures which object(s) should transfer their ownership to the specified role.
	On *GrantOwnershipOn `pulumi:"on"`
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
	OutboundPrivileges *string `pulumi:"outboundPrivileges"`
}

type GrantOwnershipState struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName pulumi.StringPtrInput
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName pulumi.StringPtrInput
	// Configures which object(s) should transfer their ownership to the specified role.
	On GrantOwnershipOnPtrInput
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
	OutboundPrivileges pulumi.StringPtrInput
}

func (GrantOwnershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantOwnershipState)(nil)).Elem()
}

type grantOwnershipArgs struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName *string `pulumi:"accountRoleName"`
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName *string `pulumi:"databaseRoleName"`
	// Configures which object(s) should transfer their ownership to the specified role.
	On GrantOwnershipOn `pulumi:"on"`
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
	OutboundPrivileges *string `pulumi:"outboundPrivileges"`
}

// The set of arguments for constructing a GrantOwnership resource.
type GrantOwnershipArgs struct {
	// The fully qualified name of the account role to which privileges will be granted.
	AccountRoleName pulumi.StringPtrInput
	// The fully qualified name of the database role to which privileges will be granted.
	DatabaseRoleName pulumi.StringPtrInput
	// Configures which object(s) should transfer their ownership to the specified role.
	On GrantOwnershipOnInput
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
	OutboundPrivileges pulumi.StringPtrInput
}

func (GrantOwnershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantOwnershipArgs)(nil)).Elem()
}

type GrantOwnershipInput interface {
	pulumi.Input

	ToGrantOwnershipOutput() GrantOwnershipOutput
	ToGrantOwnershipOutputWithContext(ctx context.Context) GrantOwnershipOutput
}

func (*GrantOwnership) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantOwnership)(nil)).Elem()
}

func (i *GrantOwnership) ToGrantOwnershipOutput() GrantOwnershipOutput {
	return i.ToGrantOwnershipOutputWithContext(context.Background())
}

func (i *GrantOwnership) ToGrantOwnershipOutputWithContext(ctx context.Context) GrantOwnershipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantOwnershipOutput)
}

// GrantOwnershipArrayInput is an input type that accepts GrantOwnershipArray and GrantOwnershipArrayOutput values.
// You can construct a concrete instance of `GrantOwnershipArrayInput` via:
//
//	GrantOwnershipArray{ GrantOwnershipArgs{...} }
type GrantOwnershipArrayInput interface {
	pulumi.Input

	ToGrantOwnershipArrayOutput() GrantOwnershipArrayOutput
	ToGrantOwnershipArrayOutputWithContext(context.Context) GrantOwnershipArrayOutput
}

type GrantOwnershipArray []GrantOwnershipInput

func (GrantOwnershipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantOwnership)(nil)).Elem()
}

func (i GrantOwnershipArray) ToGrantOwnershipArrayOutput() GrantOwnershipArrayOutput {
	return i.ToGrantOwnershipArrayOutputWithContext(context.Background())
}

func (i GrantOwnershipArray) ToGrantOwnershipArrayOutputWithContext(ctx context.Context) GrantOwnershipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantOwnershipArrayOutput)
}

// GrantOwnershipMapInput is an input type that accepts GrantOwnershipMap and GrantOwnershipMapOutput values.
// You can construct a concrete instance of `GrantOwnershipMapInput` via:
//
//	GrantOwnershipMap{ "key": GrantOwnershipArgs{...} }
type GrantOwnershipMapInput interface {
	pulumi.Input

	ToGrantOwnershipMapOutput() GrantOwnershipMapOutput
	ToGrantOwnershipMapOutputWithContext(context.Context) GrantOwnershipMapOutput
}

type GrantOwnershipMap map[string]GrantOwnershipInput

func (GrantOwnershipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantOwnership)(nil)).Elem()
}

func (i GrantOwnershipMap) ToGrantOwnershipMapOutput() GrantOwnershipMapOutput {
	return i.ToGrantOwnershipMapOutputWithContext(context.Background())
}

func (i GrantOwnershipMap) ToGrantOwnershipMapOutputWithContext(ctx context.Context) GrantOwnershipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantOwnershipMapOutput)
}

type GrantOwnershipOutput struct{ *pulumi.OutputState }

func (GrantOwnershipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantOwnership)(nil)).Elem()
}

func (o GrantOwnershipOutput) ToGrantOwnershipOutput() GrantOwnershipOutput {
	return o
}

func (o GrantOwnershipOutput) ToGrantOwnershipOutputWithContext(ctx context.Context) GrantOwnershipOutput {
	return o
}

// The fully qualified name of the account role to which privileges will be granted.
func (o GrantOwnershipOutput) AccountRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantOwnership) pulumi.StringPtrOutput { return v.AccountRoleName }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the database role to which privileges will be granted.
func (o GrantOwnershipOutput) DatabaseRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantOwnership) pulumi.StringPtrOutput { return v.DatabaseRoleName }).(pulumi.StringPtrOutput)
}

// Configures which object(s) should transfer their ownership to the specified role.
func (o GrantOwnershipOutput) On() GrantOwnershipOnOutput {
	return o.ApplyT(func(v *GrantOwnership) GrantOwnershipOnOutput { return v.On }).(GrantOwnershipOnOutput)
}

// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
func (o GrantOwnershipOutput) OutboundPrivileges() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantOwnership) pulumi.StringPtrOutput { return v.OutboundPrivileges }).(pulumi.StringPtrOutput)
}

type GrantOwnershipArrayOutput struct{ *pulumi.OutputState }

func (GrantOwnershipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantOwnership)(nil)).Elem()
}

func (o GrantOwnershipArrayOutput) ToGrantOwnershipArrayOutput() GrantOwnershipArrayOutput {
	return o
}

func (o GrantOwnershipArrayOutput) ToGrantOwnershipArrayOutputWithContext(ctx context.Context) GrantOwnershipArrayOutput {
	return o
}

func (o GrantOwnershipArrayOutput) Index(i pulumi.IntInput) GrantOwnershipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantOwnership {
		return vs[0].([]*GrantOwnership)[vs[1].(int)]
	}).(GrantOwnershipOutput)
}

type GrantOwnershipMapOutput struct{ *pulumi.OutputState }

func (GrantOwnershipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantOwnership)(nil)).Elem()
}

func (o GrantOwnershipMapOutput) ToGrantOwnershipMapOutput() GrantOwnershipMapOutput {
	return o
}

func (o GrantOwnershipMapOutput) ToGrantOwnershipMapOutputWithContext(ctx context.Context) GrantOwnershipMapOutput {
	return o
}

func (o GrantOwnershipMapOutput) MapIndex(k pulumi.StringInput) GrantOwnershipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantOwnership {
		return vs[0].(map[string]*GrantOwnership)[vs[1].(string)]
	}).(GrantOwnershipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantOwnershipInput)(nil)).Elem(), &GrantOwnership{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantOwnershipArrayInput)(nil)).Elem(), GrantOwnershipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantOwnershipMapInput)(nil)).Elem(), GrantOwnershipMap{})
	pulumi.RegisterOutputType(GrantOwnershipOutput{})
	pulumi.RegisterOutputType(GrantOwnershipArrayOutput{})
	pulumi.RegisterOutputType(GrantOwnershipMapOutput{})
}
