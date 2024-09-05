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
// format is <database_name>.<schema_name>.<function_name>(<arg types, separated with ','>)
//
// ```sh
// $ pulumi import snowflake:index/function:Function example 'dbName.schemaName.functionName(varchar, varchar, varchar)'
// ```
type Function struct {
	pulumi.CustomResourceState

	// List of the arguments for the function
	Arguments FunctionArgumentArrayOutput `pulumi:"arguments"`
	// Specifies a comment for the function.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the function. Don't use the | character.
	Database pulumi.StringOutput `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// The handler method for Java / Python function.
	Handler pulumi.StringPtrOutput `pulumi:"handler"`
	// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
	Imports pulumi.StringArrayOutput `pulumi:"imports"`
	// Specifies that the function is secure.
	IsSecure pulumi.BoolPtrOutput `pulumi:"isSecure"`
	// Specifies the language of the stored function code.
	Language pulumi.StringPtrOutput `pulumi:"language"`
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior pulumi.StringPtrOutput `pulumi:"nullInputBehavior"`
	// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages pulumi.StringArrayOutput `pulumi:"packages"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrOutput `pulumi:"returnBehavior"`
	// The return type of the function
	ReturnType pulumi.StringOutput `pulumi:"returnType"`
	// Required for Python functions. Specifies Python runtime version.
	RuntimeVersion pulumi.StringPtrOutput `pulumi:"runtimeVersion"`
	// The schema in which to create the function. Don't use the | character.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies the javascript / java / scala / sql / python code used to create the function.
	Statement pulumi.StringOutput `pulumi:"statement"`
	// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
	TargetPath pulumi.StringPtrOutput `pulumi:"targetPath"`
}

// NewFunction registers a new resource with the given unique name, arguments, and options.
func NewFunction(ctx *pulumi.Context,
	name string, args *FunctionArgs, opts ...pulumi.ResourceOption) (*Function, error) {
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
	var resource Function
	err := ctx.RegisterResource("snowflake:index/function:Function", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunction gets an existing Function resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionState, opts ...pulumi.ResourceOption) (*Function, error) {
	var resource Function
	err := ctx.ReadResource("snowflake:index/function:Function", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Function resources.
type functionState struct {
	// List of the arguments for the function
	Arguments []FunctionArgument `pulumi:"arguments"`
	// Specifies a comment for the function.
	Comment *string `pulumi:"comment"`
	// The database in which to create the function. Don't use the | character.
	Database *string `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// The handler method for Java / Python function.
	Handler *string `pulumi:"handler"`
	// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
	Imports []string `pulumi:"imports"`
	// Specifies that the function is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Specifies the language of the stored function code.
	Language *string `pulumi:"language"`
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages []string `pulumi:"packages"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// The return type of the function
	ReturnType *string `pulumi:"returnType"`
	// Required for Python functions. Specifies Python runtime version.
	RuntimeVersion *string `pulumi:"runtimeVersion"`
	// The schema in which to create the function. Don't use the | character.
	Schema *string `pulumi:"schema"`
	// Specifies the javascript / java / scala / sql / python code used to create the function.
	Statement *string `pulumi:"statement"`
	// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
	TargetPath *string `pulumi:"targetPath"`
}

type FunctionState struct {
	// List of the arguments for the function
	Arguments FunctionArgumentArrayInput
	// Specifies a comment for the function.
	Comment pulumi.StringPtrInput
	// The database in which to create the function. Don't use the | character.
	Database pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// The handler method for Java / Python function.
	Handler pulumi.StringPtrInput
	// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
	Imports pulumi.StringArrayInput
	// Specifies that the function is secure.
	IsSecure pulumi.BoolPtrInput
	// Specifies the language of the stored function code.
	Language pulumi.StringPtrInput
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages pulumi.StringArrayInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// The return type of the function
	ReturnType pulumi.StringPtrInput
	// Required for Python functions. Specifies Python runtime version.
	RuntimeVersion pulumi.StringPtrInput
	// The schema in which to create the function. Don't use the | character.
	Schema pulumi.StringPtrInput
	// Specifies the javascript / java / scala / sql / python code used to create the function.
	Statement pulumi.StringPtrInput
	// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
	TargetPath pulumi.StringPtrInput
}

func (FunctionState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionState)(nil)).Elem()
}

type functionArgs struct {
	// List of the arguments for the function
	Arguments []FunctionArgument `pulumi:"arguments"`
	// Specifies a comment for the function.
	Comment *string `pulumi:"comment"`
	// The database in which to create the function. Don't use the | character.
	Database string `pulumi:"database"`
	// The handler method for Java / Python function.
	Handler *string `pulumi:"handler"`
	// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
	Imports []string `pulumi:"imports"`
	// Specifies that the function is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Specifies the language of the stored function code.
	Language *string `pulumi:"language"`
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages []string `pulumi:"packages"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// The return type of the function
	ReturnType string `pulumi:"returnType"`
	// Required for Python functions. Specifies Python runtime version.
	RuntimeVersion *string `pulumi:"runtimeVersion"`
	// The schema in which to create the function. Don't use the | character.
	Schema string `pulumi:"schema"`
	// Specifies the javascript / java / scala / sql / python code used to create the function.
	Statement string `pulumi:"statement"`
	// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
	TargetPath *string `pulumi:"targetPath"`
}

// The set of arguments for constructing a Function resource.
type FunctionArgs struct {
	// List of the arguments for the function
	Arguments FunctionArgumentArrayInput
	// Specifies a comment for the function.
	Comment pulumi.StringPtrInput
	// The database in which to create the function. Don't use the | character.
	Database pulumi.StringInput
	// The handler method for Java / Python function.
	Handler pulumi.StringPtrInput
	// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
	Imports pulumi.StringArrayInput
	// Specifies that the function is secure.
	IsSecure pulumi.BoolPtrInput
	// Specifies the language of the stored function code.
	Language pulumi.StringPtrInput
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
	Packages pulumi.StringArrayInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// The return type of the function
	ReturnType pulumi.StringInput
	// Required for Python functions. Specifies Python runtime version.
	RuntimeVersion pulumi.StringPtrInput
	// The schema in which to create the function. Don't use the | character.
	Schema pulumi.StringInput
	// Specifies the javascript / java / scala / sql / python code used to create the function.
	Statement pulumi.StringInput
	// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
	TargetPath pulumi.StringPtrInput
}

func (FunctionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionArgs)(nil)).Elem()
}

type FunctionInput interface {
	pulumi.Input

	ToFunctionOutput() FunctionOutput
	ToFunctionOutputWithContext(ctx context.Context) FunctionOutput
}

func (*Function) ElementType() reflect.Type {
	return reflect.TypeOf((**Function)(nil)).Elem()
}

func (i *Function) ToFunctionOutput() FunctionOutput {
	return i.ToFunctionOutputWithContext(context.Background())
}

func (i *Function) ToFunctionOutputWithContext(ctx context.Context) FunctionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionOutput)
}

// FunctionArrayInput is an input type that accepts FunctionArray and FunctionArrayOutput values.
// You can construct a concrete instance of `FunctionArrayInput` via:
//
//	FunctionArray{ FunctionArgs{...} }
type FunctionArrayInput interface {
	pulumi.Input

	ToFunctionArrayOutput() FunctionArrayOutput
	ToFunctionArrayOutputWithContext(context.Context) FunctionArrayOutput
}

type FunctionArray []FunctionInput

func (FunctionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Function)(nil)).Elem()
}

func (i FunctionArray) ToFunctionArrayOutput() FunctionArrayOutput {
	return i.ToFunctionArrayOutputWithContext(context.Background())
}

func (i FunctionArray) ToFunctionArrayOutputWithContext(ctx context.Context) FunctionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionArrayOutput)
}

// FunctionMapInput is an input type that accepts FunctionMap and FunctionMapOutput values.
// You can construct a concrete instance of `FunctionMapInput` via:
//
//	FunctionMap{ "key": FunctionArgs{...} }
type FunctionMapInput interface {
	pulumi.Input

	ToFunctionMapOutput() FunctionMapOutput
	ToFunctionMapOutputWithContext(context.Context) FunctionMapOutput
}

type FunctionMap map[string]FunctionInput

func (FunctionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Function)(nil)).Elem()
}

func (i FunctionMap) ToFunctionMapOutput() FunctionMapOutput {
	return i.ToFunctionMapOutputWithContext(context.Background())
}

func (i FunctionMap) ToFunctionMapOutputWithContext(ctx context.Context) FunctionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionMapOutput)
}

type FunctionOutput struct{ *pulumi.OutputState }

func (FunctionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Function)(nil)).Elem()
}

func (o FunctionOutput) ToFunctionOutput() FunctionOutput {
	return o
}

func (o FunctionOutput) ToFunctionOutputWithContext(ctx context.Context) FunctionOutput {
	return o
}

// List of the arguments for the function
func (o FunctionOutput) Arguments() FunctionArgumentArrayOutput {
	return o.ApplyT(func(v *Function) FunctionArgumentArrayOutput { return v.Arguments }).(FunctionArgumentArrayOutput)
}

// Specifies a comment for the function.
func (o FunctionOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the function. Don't use the | character.
func (o FunctionOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o FunctionOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// The handler method for Java / Python function.
func (o FunctionOutput) Handler() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.Handler }).(pulumi.StringPtrOutput)
}

// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
func (o FunctionOutput) Imports() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Function) pulumi.StringArrayOutput { return v.Imports }).(pulumi.StringArrayOutput)
}

// Specifies that the function is secure.
func (o FunctionOutput) IsSecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.BoolPtrOutput { return v.IsSecure }).(pulumi.BoolPtrOutput)
}

// Specifies the language of the stored function code.
func (o FunctionOutput) Language() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.Language }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
func (o FunctionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the behavior of the function when called with null inputs.
func (o FunctionOutput) NullInputBehavior() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.NullInputBehavior }).(pulumi.StringPtrOutput)
}

// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
func (o FunctionOutput) Packages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Function) pulumi.StringArrayOutput { return v.Packages }).(pulumi.StringArrayOutput)
}

// Specifies the behavior of the function when returning results
func (o FunctionOutput) ReturnBehavior() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.ReturnBehavior }).(pulumi.StringPtrOutput)
}

// The return type of the function
func (o FunctionOutput) ReturnType() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.ReturnType }).(pulumi.StringOutput)
}

// Required for Python functions. Specifies Python runtime version.
func (o FunctionOutput) RuntimeVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.RuntimeVersion }).(pulumi.StringPtrOutput)
}

// The schema in which to create the function. Don't use the | character.
func (o FunctionOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies the javascript / java / scala / sql / python code used to create the function.
func (o FunctionOutput) Statement() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Statement }).(pulumi.StringOutput)
}

// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
func (o FunctionOutput) TargetPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.TargetPath }).(pulumi.StringPtrOutput)
}

type FunctionArrayOutput struct{ *pulumi.OutputState }

func (FunctionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Function)(nil)).Elem()
}

func (o FunctionArrayOutput) ToFunctionArrayOutput() FunctionArrayOutput {
	return o
}

func (o FunctionArrayOutput) ToFunctionArrayOutputWithContext(ctx context.Context) FunctionArrayOutput {
	return o
}

func (o FunctionArrayOutput) Index(i pulumi.IntInput) FunctionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Function {
		return vs[0].([]*Function)[vs[1].(int)]
	}).(FunctionOutput)
}

type FunctionMapOutput struct{ *pulumi.OutputState }

func (FunctionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Function)(nil)).Elem()
}

func (o FunctionMapOutput) ToFunctionMapOutput() FunctionMapOutput {
	return o
}

func (o FunctionMapOutput) ToFunctionMapOutputWithContext(ctx context.Context) FunctionMapOutput {
	return o
}

func (o FunctionMapOutput) MapIndex(k pulumi.StringInput) FunctionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Function {
		return vs[0].(map[string]*Function)[vs[1].(string)]
	}).(FunctionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionInput)(nil)).Elem(), &Function{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionArrayInput)(nil)).Elem(), FunctionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionMapInput)(nil)).Elem(), FunctionMap{})
	pulumi.RegisterOutputType(FunctionOutput{})
	pulumi.RegisterOutputType(FunctionArrayOutput{})
	pulumi.RegisterOutputType(FunctionMapOutput{})
}
