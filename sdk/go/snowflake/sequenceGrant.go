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
//			_, err := snowflake.NewSequenceGrant(ctx, "grant", &snowflake.SequenceGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				OnFuture:     pulumi.Bool(false),
//				Privilege:    pulumi.String("SELECT"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				SchemaName:      pulumi.String("schema"),
//				SequenceName:    pulumi.String("sequence"),
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
// format is database_name|schema_name|sequence_name|privilege|with_grant_option|on_future|roles
//
// ```sh
//
//	$ pulumi import snowflake:index/sequenceGrant:SequenceGrant example "MY_DATABASE|MY_SCHEMA|MY_SEQUENCE|USAGE|false|false|role1,role2"
//
// ```
type SequenceGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future sequences on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrOutput `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future sequence. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future sequences on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// The name of the sequence on which to grant privileges immediately (only valid if onFuture is false).
	SequenceName pulumi.StringPtrOutput `pulumi:"sequenceName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewSequenceGrant registers a new resource with the given unique name, arguments, and options.
func NewSequenceGrant(ctx *pulumi.Context,
	name string, args *SequenceGrantArgs, opts ...pulumi.ResourceOption) (*SequenceGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	var resource SequenceGrant
	err := ctx.RegisterResource("snowflake:index/sequenceGrant:SequenceGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSequenceGrant gets an existing SequenceGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSequenceGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SequenceGrantState, opts ...pulumi.ResourceOption) (*SequenceGrant, error) {
	var resource SequenceGrant
	err := ctx.ReadResource("snowflake:index/sequenceGrant:SequenceGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SequenceGrant resources.
type sequenceGrantState struct {
	// The name of the database containing the current or future sequences on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future sequence. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future sequences on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// The name of the sequence on which to grant privileges immediately (only valid if onFuture is false).
	SequenceName *string `pulumi:"sequenceName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type SequenceGrantState struct {
	// The name of the database containing the current or future sequences on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future sequence. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future sequences on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// The name of the sequence on which to grant privileges immediately (only valid if onFuture is false).
	SequenceName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (SequenceGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*sequenceGrantState)(nil)).Elem()
}

type sequenceGrantArgs struct {
	// The name of the database containing the current or future sequences on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future sequence. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future sequences on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// The name of the sequence on which to grant privileges immediately (only valid if onFuture is false).
	SequenceName *string `pulumi:"sequenceName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a SequenceGrant resource.
type SequenceGrantArgs struct {
	// The name of the database containing the current or future sequences on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future sequence. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future sequences on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// The name of the sequence on which to grant privileges immediately (only valid if onFuture is false).
	SequenceName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (SequenceGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sequenceGrantArgs)(nil)).Elem()
}

type SequenceGrantInput interface {
	pulumi.Input

	ToSequenceGrantOutput() SequenceGrantOutput
	ToSequenceGrantOutputWithContext(ctx context.Context) SequenceGrantOutput
}

func (*SequenceGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**SequenceGrant)(nil)).Elem()
}

func (i *SequenceGrant) ToSequenceGrantOutput() SequenceGrantOutput {
	return i.ToSequenceGrantOutputWithContext(context.Background())
}

func (i *SequenceGrant) ToSequenceGrantOutputWithContext(ctx context.Context) SequenceGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SequenceGrantOutput)
}

// SequenceGrantArrayInput is an input type that accepts SequenceGrantArray and SequenceGrantArrayOutput values.
// You can construct a concrete instance of `SequenceGrantArrayInput` via:
//
//	SequenceGrantArray{ SequenceGrantArgs{...} }
type SequenceGrantArrayInput interface {
	pulumi.Input

	ToSequenceGrantArrayOutput() SequenceGrantArrayOutput
	ToSequenceGrantArrayOutputWithContext(context.Context) SequenceGrantArrayOutput
}

type SequenceGrantArray []SequenceGrantInput

func (SequenceGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SequenceGrant)(nil)).Elem()
}

func (i SequenceGrantArray) ToSequenceGrantArrayOutput() SequenceGrantArrayOutput {
	return i.ToSequenceGrantArrayOutputWithContext(context.Background())
}

func (i SequenceGrantArray) ToSequenceGrantArrayOutputWithContext(ctx context.Context) SequenceGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SequenceGrantArrayOutput)
}

// SequenceGrantMapInput is an input type that accepts SequenceGrantMap and SequenceGrantMapOutput values.
// You can construct a concrete instance of `SequenceGrantMapInput` via:
//
//	SequenceGrantMap{ "key": SequenceGrantArgs{...} }
type SequenceGrantMapInput interface {
	pulumi.Input

	ToSequenceGrantMapOutput() SequenceGrantMapOutput
	ToSequenceGrantMapOutputWithContext(context.Context) SequenceGrantMapOutput
}

type SequenceGrantMap map[string]SequenceGrantInput

func (SequenceGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SequenceGrant)(nil)).Elem()
}

func (i SequenceGrantMap) ToSequenceGrantMapOutput() SequenceGrantMapOutput {
	return i.ToSequenceGrantMapOutputWithContext(context.Background())
}

func (i SequenceGrantMap) ToSequenceGrantMapOutputWithContext(ctx context.Context) SequenceGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SequenceGrantMapOutput)
}

type SequenceGrantOutput struct{ *pulumi.OutputState }

func (SequenceGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SequenceGrant)(nil)).Elem()
}

func (o SequenceGrantOutput) ToSequenceGrantOutput() SequenceGrantOutput {
	return o
}

func (o SequenceGrantOutput) ToSequenceGrantOutputWithContext(ctx context.Context) SequenceGrantOutput {
	return o
}

// The name of the database containing the current or future sequences on which to grant privileges.
func (o SequenceGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o SequenceGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
func (o SequenceGrantOutput) OnAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.BoolPtrOutput { return v.OnAll }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
func (o SequenceGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future sequence. To grant all privileges, use the value `ALL PRIVILEGES`
func (o SequenceGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
func (o SequenceGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o SequenceGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future sequences on which to grant privileges.
func (o SequenceGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// The name of the sequence on which to grant privileges immediately (only valid if onFuture is false).
func (o SequenceGrantOutput) SequenceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.StringPtrOutput { return v.SequenceName }).(pulumi.StringPtrOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o SequenceGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SequenceGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type SequenceGrantArrayOutput struct{ *pulumi.OutputState }

func (SequenceGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SequenceGrant)(nil)).Elem()
}

func (o SequenceGrantArrayOutput) ToSequenceGrantArrayOutput() SequenceGrantArrayOutput {
	return o
}

func (o SequenceGrantArrayOutput) ToSequenceGrantArrayOutputWithContext(ctx context.Context) SequenceGrantArrayOutput {
	return o
}

func (o SequenceGrantArrayOutput) Index(i pulumi.IntInput) SequenceGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SequenceGrant {
		return vs[0].([]*SequenceGrant)[vs[1].(int)]
	}).(SequenceGrantOutput)
}

type SequenceGrantMapOutput struct{ *pulumi.OutputState }

func (SequenceGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SequenceGrant)(nil)).Elem()
}

func (o SequenceGrantMapOutput) ToSequenceGrantMapOutput() SequenceGrantMapOutput {
	return o
}

func (o SequenceGrantMapOutput) ToSequenceGrantMapOutputWithContext(ctx context.Context) SequenceGrantMapOutput {
	return o
}

func (o SequenceGrantMapOutput) MapIndex(k pulumi.StringInput) SequenceGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SequenceGrant {
		return vs[0].(map[string]*SequenceGrant)[vs[1].(string)]
	}).(SequenceGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SequenceGrantInput)(nil)).Elem(), &SequenceGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*SequenceGrantArrayInput)(nil)).Elem(), SequenceGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SequenceGrantMapInput)(nil)).Elem(), SequenceGrantMap{})
	pulumi.RegisterOutputType(SequenceGrantOutput{})
	pulumi.RegisterOutputType(SequenceGrantArrayOutput{})
	pulumi.RegisterOutputType(SequenceGrantMapOutput{})
}
