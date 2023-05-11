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
//			_, err := snowflake.NewProcedureGrant(ctx, "grant", &snowflake.ProcedureGrantArgs{
//				ArgumentDataTypes: pulumi.StringArray{
//					pulumi.String("array"),
//					pulumi.String("string"),
//				},
//				DatabaseName:  pulumi.String("database"),
//				OnFuture:      pulumi.Bool(false),
//				Privilege:     pulumi.String("USAGE"),
//				ProcedureName: pulumi.String("procedure"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				SchemaName: pulumi.String("schema"),
//				Shares: pulumi.StringArray{
//					pulumi.String("share1"),
//					pulumi.String("share2"),
//				},
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
// format is database_name|schema_name|procedure_name|argument_data_types|privilege|with_grant_option|on_future|roles|shares
//
// ```sh
//
//	$ pulumi import snowflake:index/procedureGrant:ProcedureGrant example "MY_DATABASE|MY_SCHEMA|MY_PROCEDURE|ARG1TYPE,ARG2TYPE|USAGE|false|false|role1,role2|share1,share2"
//
// ```
type ProcedureGrant struct {
	pulumi.CustomResourceState

	// List of the argument data types for the procedure (must be present if procedure has arguments and procedureName is present)
	ArgumentDataTypes pulumi.StringArrayOutput `pulumi:"argumentDataTypes"`
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrOutput `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future procedure.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName pulumi.StringPtrOutput `pulumi:"procedureName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares pulumi.StringArrayOutput `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewProcedureGrant registers a new resource with the given unique name, arguments, and options.
func NewProcedureGrant(ctx *pulumi.Context,
	name string, args *ProcedureGrantArgs, opts ...pulumi.ResourceOption) (*ProcedureGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	var resource ProcedureGrant
	err := ctx.RegisterResource("snowflake:index/procedureGrant:ProcedureGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProcedureGrant gets an existing ProcedureGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProcedureGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProcedureGrantState, opts ...pulumi.ResourceOption) (*ProcedureGrant, error) {
	var resource ProcedureGrant
	err := ctx.ReadResource("snowflake:index/procedureGrant:ProcedureGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProcedureGrant resources.
type procedureGrantState struct {
	// List of the argument data types for the procedure (must be present if procedure has arguments and procedureName is present)
	ArgumentDataTypes []string `pulumi:"argumentDataTypes"`
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future procedure.
	Privilege *string `pulumi:"privilege"`
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName *string `pulumi:"procedureName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type ProcedureGrantState struct {
	// List of the argument data types for the procedure (must be present if procedure has arguments and procedureName is present)
	ArgumentDataTypes pulumi.StringArrayInput
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future procedure.
	Privilege pulumi.StringPtrInput
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (ProcedureGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*procedureGrantState)(nil)).Elem()
}

type procedureGrantArgs struct {
	// List of the argument data types for the procedure (must be present if procedure has arguments and procedureName is present)
	ArgumentDataTypes []string `pulumi:"argumentDataTypes"`
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future procedure.
	Privilege *string `pulumi:"privilege"`
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName *string `pulumi:"procedureName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a ProcedureGrant resource.
type ProcedureGrantArgs struct {
	// List of the argument data types for the procedure (must be present if procedure has arguments and procedureName is present)
	ArgumentDataTypes pulumi.StringArrayInput
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future procedure.
	Privilege pulumi.StringPtrInput
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (ProcedureGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*procedureGrantArgs)(nil)).Elem()
}

type ProcedureGrantInput interface {
	pulumi.Input

	ToProcedureGrantOutput() ProcedureGrantOutput
	ToProcedureGrantOutputWithContext(ctx context.Context) ProcedureGrantOutput
}

func (*ProcedureGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcedureGrant)(nil)).Elem()
}

func (i *ProcedureGrant) ToProcedureGrantOutput() ProcedureGrantOutput {
	return i.ToProcedureGrantOutputWithContext(context.Background())
}

func (i *ProcedureGrant) ToProcedureGrantOutputWithContext(ctx context.Context) ProcedureGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureGrantOutput)
}

// ProcedureGrantArrayInput is an input type that accepts ProcedureGrantArray and ProcedureGrantArrayOutput values.
// You can construct a concrete instance of `ProcedureGrantArrayInput` via:
//
//	ProcedureGrantArray{ ProcedureGrantArgs{...} }
type ProcedureGrantArrayInput interface {
	pulumi.Input

	ToProcedureGrantArrayOutput() ProcedureGrantArrayOutput
	ToProcedureGrantArrayOutputWithContext(context.Context) ProcedureGrantArrayOutput
}

type ProcedureGrantArray []ProcedureGrantInput

func (ProcedureGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProcedureGrant)(nil)).Elem()
}

func (i ProcedureGrantArray) ToProcedureGrantArrayOutput() ProcedureGrantArrayOutput {
	return i.ToProcedureGrantArrayOutputWithContext(context.Background())
}

func (i ProcedureGrantArray) ToProcedureGrantArrayOutputWithContext(ctx context.Context) ProcedureGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureGrantArrayOutput)
}

// ProcedureGrantMapInput is an input type that accepts ProcedureGrantMap and ProcedureGrantMapOutput values.
// You can construct a concrete instance of `ProcedureGrantMapInput` via:
//
//	ProcedureGrantMap{ "key": ProcedureGrantArgs{...} }
type ProcedureGrantMapInput interface {
	pulumi.Input

	ToProcedureGrantMapOutput() ProcedureGrantMapOutput
	ToProcedureGrantMapOutputWithContext(context.Context) ProcedureGrantMapOutput
}

type ProcedureGrantMap map[string]ProcedureGrantInput

func (ProcedureGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProcedureGrant)(nil)).Elem()
}

func (i ProcedureGrantMap) ToProcedureGrantMapOutput() ProcedureGrantMapOutput {
	return i.ToProcedureGrantMapOutputWithContext(context.Background())
}

func (i ProcedureGrantMap) ToProcedureGrantMapOutputWithContext(ctx context.Context) ProcedureGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureGrantMapOutput)
}

type ProcedureGrantOutput struct{ *pulumi.OutputState }

func (ProcedureGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcedureGrant)(nil)).Elem()
}

func (o ProcedureGrantOutput) ToProcedureGrantOutput() ProcedureGrantOutput {
	return o
}

func (o ProcedureGrantOutput) ToProcedureGrantOutputWithContext(ctx context.Context) ProcedureGrantOutput {
	return o
}

// List of the argument data types for the procedure (must be present if procedure has arguments and procedureName is present)
func (o ProcedureGrantOutput) ArgumentDataTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringArrayOutput { return v.ArgumentDataTypes }).(pulumi.StringArrayOutput)
}

// The name of the database containing the current or future procedures on which to grant privileges.
func (o ProcedureGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o ProcedureGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
func (o ProcedureGrantOutput) OnAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.BoolPtrOutput { return v.OnAll }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
func (o ProcedureGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future procedure.
func (o ProcedureGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
func (o ProcedureGrantOutput) ProcedureName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringPtrOutput { return v.ProcedureName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o ProcedureGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future procedures on which to grant privileges.
func (o ProcedureGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these shares (only valid if onFuture is false).
func (o ProcedureGrantOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.StringArrayOutput { return v.Shares }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o ProcedureGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProcedureGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type ProcedureGrantArrayOutput struct{ *pulumi.OutputState }

func (ProcedureGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProcedureGrant)(nil)).Elem()
}

func (o ProcedureGrantArrayOutput) ToProcedureGrantArrayOutput() ProcedureGrantArrayOutput {
	return o
}

func (o ProcedureGrantArrayOutput) ToProcedureGrantArrayOutputWithContext(ctx context.Context) ProcedureGrantArrayOutput {
	return o
}

func (o ProcedureGrantArrayOutput) Index(i pulumi.IntInput) ProcedureGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProcedureGrant {
		return vs[0].([]*ProcedureGrant)[vs[1].(int)]
	}).(ProcedureGrantOutput)
}

type ProcedureGrantMapOutput struct{ *pulumi.OutputState }

func (ProcedureGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProcedureGrant)(nil)).Elem()
}

func (o ProcedureGrantMapOutput) ToProcedureGrantMapOutput() ProcedureGrantMapOutput {
	return o
}

func (o ProcedureGrantMapOutput) ToProcedureGrantMapOutputWithContext(ctx context.Context) ProcedureGrantMapOutput {
	return o
}

func (o ProcedureGrantMapOutput) MapIndex(k pulumi.StringInput) ProcedureGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProcedureGrant {
		return vs[0].(map[string]*ProcedureGrant)[vs[1].(string)]
	}).(ProcedureGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProcedureGrantInput)(nil)).Elem(), &ProcedureGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcedureGrantArrayInput)(nil)).Elem(), ProcedureGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcedureGrantMapInput)(nil)).Elem(), ProcedureGrantMap{})
	pulumi.RegisterOutputType(ProcedureGrantOutput{})
	pulumi.RegisterOutputType(ProcedureGrantArrayOutput{})
	pulumi.RegisterOutputType(ProcedureGrantMapOutput{})
}
