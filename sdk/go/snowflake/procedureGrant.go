// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
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
// 		_, err := snowflake.NewProcedureGrant(ctx, "grant", &snowflake.ProcedureGrantArgs{
// 			DatabaseName:  pulumi.String("db"),
// 			SchemaName:    pulumi.String("schema"),
// 			ProcedureName: pulumi.String("procedure"),
// 			Arguments: ProcedureGrantArgumentArray{
// 				&ProcedureGrantArgumentArgs{
// 					Name: pulumi.String("a"),
// 					Type: pulumi.String("array"),
// 				},
// 				&ProcedureGrantArgumentArgs{
// 					Name: pulumi.String("b"),
// 					Type: pulumi.String("string"),
// 				},
// 			},
// 			ReturnType: pulumi.String("string"),
// 			Privilege:  pulumi.String("select"),
// 			Roles: pulumi.StringArray{
// 				pulumi.String("role1"),
// 				pulumi.String("role2"),
// 			},
// 			Shares: pulumi.StringArray{
// 				pulumi.String("share1"),
// 				pulumi.String("share2"),
// 			},
// 			OnFuture:        pulumi.Bool(false),
// 			WithGrantOption: pulumi.Bool(false),
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
// # format is database name | schema name | procedure signature | privilege | true/false for with_grant_option
//
// ```sh
//  $ pulumi import snowflake:index/procedureGrant:ProcedureGrant example 'dbName|schemaName|procedureName(ARG1 ARG1TYPE, ARG2 ARG2TYPE):RETURNTYPE|USAGE|false'
// ```
type ProcedureGrant struct {
	pulumi.CustomResourceState

	// List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
	Arguments ProcedureGrantArgumentArrayOutput `pulumi:"arguments"`
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future procedure.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName pulumi.StringPtrOutput `pulumi:"procedureName"`
	// The return type of the procedure (must be present if procedureName is present)
	ReturnType pulumi.StringPtrOutput `pulumi:"returnType"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
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
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
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
	// List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
	Arguments []ProcedureGrantArgument `pulumi:"arguments"`
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future procedure.
	Privilege *string `pulumi:"privilege"`
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName *string `pulumi:"procedureName"`
	// The return type of the procedure (must be present if procedureName is present)
	ReturnType *string `pulumi:"returnType"`
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
	// List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
	Arguments ProcedureGrantArgumentArrayInput
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future procedure.
	Privilege pulumi.StringPtrInput
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName pulumi.StringPtrInput
	// The return type of the procedure (must be present if procedureName is present)
	ReturnType pulumi.StringPtrInput
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
	// List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
	Arguments []ProcedureGrantArgument `pulumi:"arguments"`
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future procedure.
	Privilege *string `pulumi:"privilege"`
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName *string `pulumi:"procedureName"`
	// The return type of the procedure (must be present if procedureName is present)
	ReturnType *string `pulumi:"returnType"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a ProcedureGrant resource.
type ProcedureGrantArgs struct {
	// List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
	Arguments ProcedureGrantArgumentArrayInput
	// The name of the database containing the current or future procedures on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future procedure.
	Privilege pulumi.StringPtrInput
	// The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
	ProcedureName pulumi.StringPtrInput
	// The return type of the procedure (must be present if procedureName is present)
	ReturnType pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future procedures on which to grant privileges.
	SchemaName pulumi.StringInput
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
	return reflect.TypeOf((*ProcedureGrant)(nil))
}

func (i *ProcedureGrant) ToProcedureGrantOutput() ProcedureGrantOutput {
	return i.ToProcedureGrantOutputWithContext(context.Background())
}

func (i *ProcedureGrant) ToProcedureGrantOutputWithContext(ctx context.Context) ProcedureGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureGrantOutput)
}

func (i *ProcedureGrant) ToProcedureGrantPtrOutput() ProcedureGrantPtrOutput {
	return i.ToProcedureGrantPtrOutputWithContext(context.Background())
}

func (i *ProcedureGrant) ToProcedureGrantPtrOutputWithContext(ctx context.Context) ProcedureGrantPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureGrantPtrOutput)
}

type ProcedureGrantPtrInput interface {
	pulumi.Input

	ToProcedureGrantPtrOutput() ProcedureGrantPtrOutput
	ToProcedureGrantPtrOutputWithContext(ctx context.Context) ProcedureGrantPtrOutput
}

type procedureGrantPtrType ProcedureGrantArgs

func (*procedureGrantPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcedureGrant)(nil))
}

func (i *procedureGrantPtrType) ToProcedureGrantPtrOutput() ProcedureGrantPtrOutput {
	return i.ToProcedureGrantPtrOutputWithContext(context.Background())
}

func (i *procedureGrantPtrType) ToProcedureGrantPtrOutputWithContext(ctx context.Context) ProcedureGrantPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureGrantPtrOutput)
}

// ProcedureGrantArrayInput is an input type that accepts ProcedureGrantArray and ProcedureGrantArrayOutput values.
// You can construct a concrete instance of `ProcedureGrantArrayInput` via:
//
//          ProcedureGrantArray{ ProcedureGrantArgs{...} }
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
//          ProcedureGrantMap{ "key": ProcedureGrantArgs{...} }
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
	return reflect.TypeOf((*ProcedureGrant)(nil))
}

func (o ProcedureGrantOutput) ToProcedureGrantOutput() ProcedureGrantOutput {
	return o
}

func (o ProcedureGrantOutput) ToProcedureGrantOutputWithContext(ctx context.Context) ProcedureGrantOutput {
	return o
}

func (o ProcedureGrantOutput) ToProcedureGrantPtrOutput() ProcedureGrantPtrOutput {
	return o.ToProcedureGrantPtrOutputWithContext(context.Background())
}

func (o ProcedureGrantOutput) ToProcedureGrantPtrOutputWithContext(ctx context.Context) ProcedureGrantPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProcedureGrant) *ProcedureGrant {
		return &v
	}).(ProcedureGrantPtrOutput)
}

type ProcedureGrantPtrOutput struct{ *pulumi.OutputState }

func (ProcedureGrantPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcedureGrant)(nil))
}

func (o ProcedureGrantPtrOutput) ToProcedureGrantPtrOutput() ProcedureGrantPtrOutput {
	return o
}

func (o ProcedureGrantPtrOutput) ToProcedureGrantPtrOutputWithContext(ctx context.Context) ProcedureGrantPtrOutput {
	return o
}

func (o ProcedureGrantPtrOutput) Elem() ProcedureGrantOutput {
	return o.ApplyT(func(v *ProcedureGrant) ProcedureGrant {
		if v != nil {
			return *v
		}
		var ret ProcedureGrant
		return ret
	}).(ProcedureGrantOutput)
}

type ProcedureGrantArrayOutput struct{ *pulumi.OutputState }

func (ProcedureGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProcedureGrant)(nil))
}

func (o ProcedureGrantArrayOutput) ToProcedureGrantArrayOutput() ProcedureGrantArrayOutput {
	return o
}

func (o ProcedureGrantArrayOutput) ToProcedureGrantArrayOutputWithContext(ctx context.Context) ProcedureGrantArrayOutput {
	return o
}

func (o ProcedureGrantArrayOutput) Index(i pulumi.IntInput) ProcedureGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProcedureGrant {
		return vs[0].([]ProcedureGrant)[vs[1].(int)]
	}).(ProcedureGrantOutput)
}

type ProcedureGrantMapOutput struct{ *pulumi.OutputState }

func (ProcedureGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ProcedureGrant)(nil))
}

func (o ProcedureGrantMapOutput) ToProcedureGrantMapOutput() ProcedureGrantMapOutput {
	return o
}

func (o ProcedureGrantMapOutput) ToProcedureGrantMapOutputWithContext(ctx context.Context) ProcedureGrantMapOutput {
	return o
}

func (o ProcedureGrantMapOutput) MapIndex(k pulumi.StringInput) ProcedureGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ProcedureGrant {
		return vs[0].(map[string]ProcedureGrant)[vs[1].(string)]
	}).(ProcedureGrantOutput)
}

func init() {
	pulumi.RegisterOutputType(ProcedureGrantOutput{})
	pulumi.RegisterOutputType(ProcedureGrantPtrOutput{})
	pulumi.RegisterOutputType(ProcedureGrantArrayOutput{})
	pulumi.RegisterOutputType(ProcedureGrantMapOutput{})
}
