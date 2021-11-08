// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Function struct {
	pulumi.CustomResourceState

	// List of the arguments for the function
	Arguments FunctionArgumentArrayOutput `pulumi:"arguments"`
	// Specifies a comment for the function.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the function. Don't use the | character.
	Database pulumi.StringOutput `pulumi:"database"`
	// The language of the statement
	Language pulumi.StringPtrOutput `pulumi:"language"`
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior pulumi.StringPtrOutput `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrOutput `pulumi:"returnBehavior"`
	// The return type of the function
	ReturnType pulumi.StringOutput `pulumi:"returnType"`
	// The schema in which to create the function. Don't use the | character.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies the javascript / java / sql code used to create the function.
	Statement pulumi.StringOutput `pulumi:"statement"`
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
	// The language of the statement
	Language *string `pulumi:"language"`
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// The return type of the function
	ReturnType *string `pulumi:"returnType"`
	// The schema in which to create the function. Don't use the | character.
	Schema *string `pulumi:"schema"`
	// Specifies the javascript / java / sql code used to create the function.
	Statement *string `pulumi:"statement"`
}

type FunctionState struct {
	// List of the arguments for the function
	Arguments FunctionArgumentArrayInput
	// Specifies a comment for the function.
	Comment pulumi.StringPtrInput
	// The database in which to create the function. Don't use the | character.
	Database pulumi.StringPtrInput
	// The language of the statement
	Language pulumi.StringPtrInput
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// The return type of the function
	ReturnType pulumi.StringPtrInput
	// The schema in which to create the function. Don't use the | character.
	Schema pulumi.StringPtrInput
	// Specifies the javascript / java / sql code used to create the function.
	Statement pulumi.StringPtrInput
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
	// The language of the statement
	Language *string `pulumi:"language"`
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// The return type of the function
	ReturnType string `pulumi:"returnType"`
	// The schema in which to create the function. Don't use the | character.
	Schema string `pulumi:"schema"`
	// Specifies the javascript / java / sql code used to create the function.
	Statement string `pulumi:"statement"`
}

// The set of arguments for constructing a Function resource.
type FunctionArgs struct {
	// List of the arguments for the function
	Arguments FunctionArgumentArrayInput
	// Specifies a comment for the function.
	Comment pulumi.StringPtrInput
	// The database in which to create the function. Don't use the | character.
	Database pulumi.StringInput
	// The language of the statement
	Language pulumi.StringPtrInput
	// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the function when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// The return type of the function
	ReturnType pulumi.StringInput
	// The schema in which to create the function. Don't use the | character.
	Schema pulumi.StringInput
	// Specifies the javascript / java / sql code used to create the function.
	Statement pulumi.StringInput
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
	return reflect.TypeOf((*Function)(nil))
}

func (i *Function) ToFunctionOutput() FunctionOutput {
	return i.ToFunctionOutputWithContext(context.Background())
}

func (i *Function) ToFunctionOutputWithContext(ctx context.Context) FunctionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionOutput)
}

func (i *Function) ToFunctionPtrOutput() FunctionPtrOutput {
	return i.ToFunctionPtrOutputWithContext(context.Background())
}

func (i *Function) ToFunctionPtrOutputWithContext(ctx context.Context) FunctionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionPtrOutput)
}

type FunctionPtrInput interface {
	pulumi.Input

	ToFunctionPtrOutput() FunctionPtrOutput
	ToFunctionPtrOutputWithContext(ctx context.Context) FunctionPtrOutput
}

type functionPtrType FunctionArgs

func (*functionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Function)(nil))
}

func (i *functionPtrType) ToFunctionPtrOutput() FunctionPtrOutput {
	return i.ToFunctionPtrOutputWithContext(context.Background())
}

func (i *functionPtrType) ToFunctionPtrOutputWithContext(ctx context.Context) FunctionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionPtrOutput)
}

// FunctionArrayInput is an input type that accepts FunctionArray and FunctionArrayOutput values.
// You can construct a concrete instance of `FunctionArrayInput` via:
//
//          FunctionArray{ FunctionArgs{...} }
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
//          FunctionMap{ "key": FunctionArgs{...} }
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
	return reflect.TypeOf((*Function)(nil))
}

func (o FunctionOutput) ToFunctionOutput() FunctionOutput {
	return o
}

func (o FunctionOutput) ToFunctionOutputWithContext(ctx context.Context) FunctionOutput {
	return o
}

func (o FunctionOutput) ToFunctionPtrOutput() FunctionPtrOutput {
	return o.ToFunctionPtrOutputWithContext(context.Background())
}

func (o FunctionOutput) ToFunctionPtrOutputWithContext(ctx context.Context) FunctionPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Function) *Function {
		return &v
	}).(FunctionPtrOutput)
}

type FunctionPtrOutput struct{ *pulumi.OutputState }

func (FunctionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Function)(nil))
}

func (o FunctionPtrOutput) ToFunctionPtrOutput() FunctionPtrOutput {
	return o
}

func (o FunctionPtrOutput) ToFunctionPtrOutputWithContext(ctx context.Context) FunctionPtrOutput {
	return o
}

func (o FunctionPtrOutput) Elem() FunctionOutput {
	return o.ApplyT(func(v *Function) Function {
		if v != nil {
			return *v
		}
		var ret Function
		return ret
	}).(FunctionOutput)
}

type FunctionArrayOutput struct{ *pulumi.OutputState }

func (FunctionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Function)(nil))
}

func (o FunctionArrayOutput) ToFunctionArrayOutput() FunctionArrayOutput {
	return o
}

func (o FunctionArrayOutput) ToFunctionArrayOutputWithContext(ctx context.Context) FunctionArrayOutput {
	return o
}

func (o FunctionArrayOutput) Index(i pulumi.IntInput) FunctionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Function {
		return vs[0].([]Function)[vs[1].(int)]
	}).(FunctionOutput)
}

type FunctionMapOutput struct{ *pulumi.OutputState }

func (FunctionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Function)(nil))
}

func (o FunctionMapOutput) ToFunctionMapOutput() FunctionMapOutput {
	return o
}

func (o FunctionMapOutput) ToFunctionMapOutputWithContext(ctx context.Context) FunctionMapOutput {
	return o
}

func (o FunctionMapOutput) MapIndex(k pulumi.StringInput) FunctionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Function {
		return vs[0].(map[string]Function)[vs[1].(string)]
	}).(FunctionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionInput)(nil)).Elem(), &Function{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionPtrInput)(nil)).Elem(), &Function{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionArrayInput)(nil)).Elem(), FunctionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionMapInput)(nil)).Elem(), FunctionMap{})
	pulumi.RegisterOutputType(FunctionOutput{})
	pulumi.RegisterOutputType(FunctionPtrOutput{})
	pulumi.RegisterOutputType(FunctionArrayOutput{})
	pulumi.RegisterOutputType(FunctionMapOutput{})
}
