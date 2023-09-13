// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// format is database name | schema name | stored procedure name | <list of arg types, separated with '-'>
//
// ```sh
//
//	$ pulumi import snowflake:index/procedure:Procedure example 'dbName|schemaName|procedureName|varchar-varchar-varchar'
//
// ```
type Procedure struct {
	pulumi.CustomResourceState

	// List of the arguments for the procedure
	Arguments ProcedureArgumentArrayOutput `pulumi:"arguments"`
	// Specifies a comment for the procedure.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the procedure. Don't use the | character.
	Database pulumi.StringOutput `pulumi:"database"`
	// Sets execute context - see caller's rights and owner's rights
	ExecuteAs pulumi.StringPtrOutput `pulumi:"executeAs"`
	// The handler method for Java / Python procedures.
	Handler pulumi.StringPtrOutput `pulumi:"handler"`
	// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
	Imports pulumi.StringArrayOutput `pulumi:"imports"`
	// Specifies the language of the stored procedure code.
	Language pulumi.StringPtrOutput `pulumi:"language"`
	// Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the behavior of the procedure when called with null inputs.
	NullInputBehavior pulumi.StringPtrOutput `pulumi:"nullInputBehavior"`
	// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages pulumi.StringArrayOutput `pulumi:"packages"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrOutput `pulumi:"returnBehavior"`
	// The return type of the procedure
	ReturnType pulumi.StringOutput `pulumi:"returnType"`
	// Required for Python procedures. Specifies Python runtime version.
	RuntimeVersion pulumi.StringPtrOutput `pulumi:"runtimeVersion"`
	// The schema in which to create the procedure. Don't use the | character.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies the code used to create the procedure.
	Statement pulumi.StringOutput `pulumi:"statement"`
}

// NewProcedure registers a new resource with the given unique name, arguments, and options.
func NewProcedure(ctx *pulumi.Context,
	name string, args *ProcedureArgs, opts ...pulumi.ResourceOption) (*Procedure, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.ReturnType == nil {
		return nil, errors.New("invalid value for required argument 'ReturnType'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Statement == nil {
		return nil, errors.New("invalid value for required argument 'Statement'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Procedure
	err := ctx.RegisterResource("snowflake:index/procedure:Procedure", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProcedure gets an existing Procedure resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProcedure(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProcedureState, opts ...pulumi.ResourceOption) (*Procedure, error) {
	var resource Procedure
	err := ctx.ReadResource("snowflake:index/procedure:Procedure", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Procedure resources.
type procedureState struct {
	// List of the arguments for the procedure
	Arguments []ProcedureArgument `pulumi:"arguments"`
	// Specifies a comment for the procedure.
	Comment *string `pulumi:"comment"`
	// The database in which to create the procedure. Don't use the | character.
	Database *string `pulumi:"database"`
	// Sets execute context - see caller's rights and owner's rights
	ExecuteAs *string `pulumi:"executeAs"`
	// The handler method for Java / Python procedures.
	Handler *string `pulumi:"handler"`
	// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
	Imports []string `pulumi:"imports"`
	// Specifies the language of the stored procedure code.
	Language *string `pulumi:"language"`
	// Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the procedure when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages []string `pulumi:"packages"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// The return type of the procedure
	ReturnType *string `pulumi:"returnType"`
	// Required for Python procedures. Specifies Python runtime version.
	RuntimeVersion *string `pulumi:"runtimeVersion"`
	// The schema in which to create the procedure. Don't use the | character.
	Schema *string `pulumi:"schema"`
	// Specifies the code used to create the procedure.
	Statement *string `pulumi:"statement"`
}

type ProcedureState struct {
	// List of the arguments for the procedure
	Arguments ProcedureArgumentArrayInput
	// Specifies a comment for the procedure.
	Comment pulumi.StringPtrInput
	// The database in which to create the procedure. Don't use the | character.
	Database pulumi.StringPtrInput
	// Sets execute context - see caller's rights and owner's rights
	ExecuteAs pulumi.StringPtrInput
	// The handler method for Java / Python procedures.
	Handler pulumi.StringPtrInput
	// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
	Imports pulumi.StringArrayInput
	// Specifies the language of the stored procedure code.
	Language pulumi.StringPtrInput
	// Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the procedure when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages pulumi.StringArrayInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// The return type of the procedure
	ReturnType pulumi.StringPtrInput
	// Required for Python procedures. Specifies Python runtime version.
	RuntimeVersion pulumi.StringPtrInput
	// The schema in which to create the procedure. Don't use the | character.
	Schema pulumi.StringPtrInput
	// Specifies the code used to create the procedure.
	Statement pulumi.StringPtrInput
}

func (ProcedureState) ElementType() reflect.Type {
	return reflect.TypeOf((*procedureState)(nil)).Elem()
}

type procedureArgs struct {
	// List of the arguments for the procedure
	Arguments []ProcedureArgument `pulumi:"arguments"`
	// Specifies a comment for the procedure.
	Comment *string `pulumi:"comment"`
	// The database in which to create the procedure. Don't use the | character.
	Database string `pulumi:"database"`
	// Sets execute context - see caller's rights and owner's rights
	ExecuteAs *string `pulumi:"executeAs"`
	// The handler method for Java / Python procedures.
	Handler *string `pulumi:"handler"`
	// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
	Imports []string `pulumi:"imports"`
	// Specifies the language of the stored procedure code.
	Language *string `pulumi:"language"`
	// Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the procedure when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages []string `pulumi:"packages"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// The return type of the procedure
	ReturnType string `pulumi:"returnType"`
	// Required for Python procedures. Specifies Python runtime version.
	RuntimeVersion *string `pulumi:"runtimeVersion"`
	// The schema in which to create the procedure. Don't use the | character.
	Schema string `pulumi:"schema"`
	// Specifies the code used to create the procedure.
	Statement string `pulumi:"statement"`
}

// The set of arguments for constructing a Procedure resource.
type ProcedureArgs struct {
	// List of the arguments for the procedure
	Arguments ProcedureArgumentArrayInput
	// Specifies a comment for the procedure.
	Comment pulumi.StringPtrInput
	// The database in which to create the procedure. Don't use the | character.
	Database pulumi.StringInput
	// Sets execute context - see caller's rights and owner's rights
	ExecuteAs pulumi.StringPtrInput
	// The handler method for Java / Python procedures.
	Handler pulumi.StringPtrInput
	// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
	Imports pulumi.StringArrayInput
	// Specifies the language of the stored procedure code.
	Language pulumi.StringPtrInput
	// Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the procedure when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages pulumi.StringArrayInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// The return type of the procedure
	ReturnType pulumi.StringInput
	// Required for Python procedures. Specifies Python runtime version.
	RuntimeVersion pulumi.StringPtrInput
	// The schema in which to create the procedure. Don't use the | character.
	Schema pulumi.StringInput
	// Specifies the code used to create the procedure.
	Statement pulumi.StringInput
}

func (ProcedureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*procedureArgs)(nil)).Elem()
}

type ProcedureInput interface {
	pulumi.Input

	ToProcedureOutput() ProcedureOutput
	ToProcedureOutputWithContext(ctx context.Context) ProcedureOutput
}

func (*Procedure) ElementType() reflect.Type {
	return reflect.TypeOf((**Procedure)(nil)).Elem()
}

func (i *Procedure) ToProcedureOutput() ProcedureOutput {
	return i.ToProcedureOutputWithContext(context.Background())
}

func (i *Procedure) ToProcedureOutputWithContext(ctx context.Context) ProcedureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureOutput)
}

func (i *Procedure) ToOutput(ctx context.Context) pulumix.Output[*Procedure] {
	return pulumix.Output[*Procedure]{
		OutputState: i.ToProcedureOutputWithContext(ctx).OutputState,
	}
}

// ProcedureArrayInput is an input type that accepts ProcedureArray and ProcedureArrayOutput values.
// You can construct a concrete instance of `ProcedureArrayInput` via:
//
//	ProcedureArray{ ProcedureArgs{...} }
type ProcedureArrayInput interface {
	pulumi.Input

	ToProcedureArrayOutput() ProcedureArrayOutput
	ToProcedureArrayOutputWithContext(context.Context) ProcedureArrayOutput
}

type ProcedureArray []ProcedureInput

func (ProcedureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Procedure)(nil)).Elem()
}

func (i ProcedureArray) ToProcedureArrayOutput() ProcedureArrayOutput {
	return i.ToProcedureArrayOutputWithContext(context.Background())
}

func (i ProcedureArray) ToProcedureArrayOutputWithContext(ctx context.Context) ProcedureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureArrayOutput)
}

func (i ProcedureArray) ToOutput(ctx context.Context) pulumix.Output[[]*Procedure] {
	return pulumix.Output[[]*Procedure]{
		OutputState: i.ToProcedureArrayOutputWithContext(ctx).OutputState,
	}
}

// ProcedureMapInput is an input type that accepts ProcedureMap and ProcedureMapOutput values.
// You can construct a concrete instance of `ProcedureMapInput` via:
//
//	ProcedureMap{ "key": ProcedureArgs{...} }
type ProcedureMapInput interface {
	pulumi.Input

	ToProcedureMapOutput() ProcedureMapOutput
	ToProcedureMapOutputWithContext(context.Context) ProcedureMapOutput
}

type ProcedureMap map[string]ProcedureInput

func (ProcedureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Procedure)(nil)).Elem()
}

func (i ProcedureMap) ToProcedureMapOutput() ProcedureMapOutput {
	return i.ToProcedureMapOutputWithContext(context.Background())
}

func (i ProcedureMap) ToProcedureMapOutputWithContext(ctx context.Context) ProcedureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcedureMapOutput)
}

func (i ProcedureMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Procedure] {
	return pulumix.Output[map[string]*Procedure]{
		OutputState: i.ToProcedureMapOutputWithContext(ctx).OutputState,
	}
}

type ProcedureOutput struct{ *pulumi.OutputState }

func (ProcedureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Procedure)(nil)).Elem()
}

func (o ProcedureOutput) ToProcedureOutput() ProcedureOutput {
	return o
}

func (o ProcedureOutput) ToProcedureOutputWithContext(ctx context.Context) ProcedureOutput {
	return o
}

func (o ProcedureOutput) ToOutput(ctx context.Context) pulumix.Output[*Procedure] {
	return pulumix.Output[*Procedure]{
		OutputState: o.OutputState,
	}
}

// List of the arguments for the procedure
func (o ProcedureOutput) Arguments() ProcedureArgumentArrayOutput {
	return o.ApplyT(func(v *Procedure) ProcedureArgumentArrayOutput { return v.Arguments }).(ProcedureArgumentArrayOutput)
}

// Specifies a comment for the procedure.
func (o ProcedureOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the procedure. Don't use the | character.
func (o ProcedureOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Sets execute context - see caller's rights and owner's rights
func (o ProcedureOutput) ExecuteAs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.ExecuteAs }).(pulumi.StringPtrOutput)
}

// The handler method for Java / Python procedures.
func (o ProcedureOutput) Handler() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.Handler }).(pulumi.StringPtrOutput)
}

// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
func (o ProcedureOutput) Imports() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringArrayOutput { return v.Imports }).(pulumi.StringArrayOutput)
}

// Specifies the language of the stored procedure code.
func (o ProcedureOutput) Language() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.Language }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
func (o ProcedureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the behavior of the procedure when called with null inputs.
func (o ProcedureOutput) NullInputBehavior() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.NullInputBehavior }).(pulumi.StringPtrOutput)
}

// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
func (o ProcedureOutput) Packages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringArrayOutput { return v.Packages }).(pulumi.StringArrayOutput)
}

// Specifies the behavior of the function when returning results
func (o ProcedureOutput) ReturnBehavior() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.ReturnBehavior }).(pulumi.StringPtrOutput)
}

// The return type of the procedure
func (o ProcedureOutput) ReturnType() pulumi.StringOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringOutput { return v.ReturnType }).(pulumi.StringOutput)
}

// Required for Python procedures. Specifies Python runtime version.
func (o ProcedureOutput) RuntimeVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringPtrOutput { return v.RuntimeVersion }).(pulumi.StringPtrOutput)
}

// The schema in which to create the procedure. Don't use the | character.
func (o ProcedureOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies the code used to create the procedure.
func (o ProcedureOutput) Statement() pulumi.StringOutput {
	return o.ApplyT(func(v *Procedure) pulumi.StringOutput { return v.Statement }).(pulumi.StringOutput)
}

type ProcedureArrayOutput struct{ *pulumi.OutputState }

func (ProcedureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Procedure)(nil)).Elem()
}

func (o ProcedureArrayOutput) ToProcedureArrayOutput() ProcedureArrayOutput {
	return o
}

func (o ProcedureArrayOutput) ToProcedureArrayOutputWithContext(ctx context.Context) ProcedureArrayOutput {
	return o
}

func (o ProcedureArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Procedure] {
	return pulumix.Output[[]*Procedure]{
		OutputState: o.OutputState,
	}
}

func (o ProcedureArrayOutput) Index(i pulumi.IntInput) ProcedureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Procedure {
		return vs[0].([]*Procedure)[vs[1].(int)]
	}).(ProcedureOutput)
}

type ProcedureMapOutput struct{ *pulumi.OutputState }

func (ProcedureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Procedure)(nil)).Elem()
}

func (o ProcedureMapOutput) ToProcedureMapOutput() ProcedureMapOutput {
	return o
}

func (o ProcedureMapOutput) ToProcedureMapOutputWithContext(ctx context.Context) ProcedureMapOutput {
	return o
}

func (o ProcedureMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Procedure] {
	return pulumix.Output[map[string]*Procedure]{
		OutputState: o.OutputState,
	}
}

func (o ProcedureMapOutput) MapIndex(k pulumi.StringInput) ProcedureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Procedure {
		return vs[0].(map[string]*Procedure)[vs[1].(string)]
	}).(ProcedureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProcedureInput)(nil)).Elem(), &Procedure{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcedureArrayInput)(nil)).Elem(), ProcedureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcedureMapInput)(nil)).Elem(), ProcedureMap{})
	pulumi.RegisterOutputType(ProcedureOutput{})
	pulumi.RegisterOutputType(ProcedureArrayOutput{})
	pulumi.RegisterOutputType(ProcedureMapOutput{})
}
