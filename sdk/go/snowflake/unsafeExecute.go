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

type UnsafeExecute struct {
	pulumi.CustomResourceState

	// SQL statement to execute. Forces recreation of resource on change.
	Execute pulumi.StringOutput `pulumi:"execute"`
	// Optional SQL statement to do a read. Invoked after creation and every time it is changed.
	Query pulumi.StringPtrOutput `pulumi:"query"`
	// List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
	QueryResults pulumi.StringMapArrayOutput `pulumi:"queryResults"`
	// SQL statement to revert the execute statement. Invoked when resource is being destroyed.
	Revert pulumi.StringOutput `pulumi:"revert"`
}

// NewUnsafeExecute registers a new resource with the given unique name, arguments, and options.
func NewUnsafeExecute(ctx *pulumi.Context,
	name string, args *UnsafeExecuteArgs, opts ...pulumi.ResourceOption) (*UnsafeExecute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Execute == nil {
		return nil, errors.New("invalid value for required argument 'Execute'")
	}
	if args.Revert == nil {
		return nil, errors.New("invalid value for required argument 'Revert'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UnsafeExecute
	err := ctx.RegisterResource("snowflake:index/unsafeExecute:UnsafeExecute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUnsafeExecute gets an existing UnsafeExecute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUnsafeExecute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UnsafeExecuteState, opts ...pulumi.ResourceOption) (*UnsafeExecute, error) {
	var resource UnsafeExecute
	err := ctx.ReadResource("snowflake:index/unsafeExecute:UnsafeExecute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UnsafeExecute resources.
type unsafeExecuteState struct {
	// SQL statement to execute. Forces recreation of resource on change.
	Execute *string `pulumi:"execute"`
	// Optional SQL statement to do a read. Invoked after creation and every time it is changed.
	Query *string `pulumi:"query"`
	// List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
	QueryResults []map[string]string `pulumi:"queryResults"`
	// SQL statement to revert the execute statement. Invoked when resource is being destroyed.
	Revert *string `pulumi:"revert"`
}

type UnsafeExecuteState struct {
	// SQL statement to execute. Forces recreation of resource on change.
	Execute pulumi.StringPtrInput
	// Optional SQL statement to do a read. Invoked after creation and every time it is changed.
	Query pulumi.StringPtrInput
	// List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
	QueryResults pulumi.StringMapArrayInput
	// SQL statement to revert the execute statement. Invoked when resource is being destroyed.
	Revert pulumi.StringPtrInput
}

func (UnsafeExecuteState) ElementType() reflect.Type {
	return reflect.TypeOf((*unsafeExecuteState)(nil)).Elem()
}

type unsafeExecuteArgs struct {
	// SQL statement to execute. Forces recreation of resource on change.
	Execute string `pulumi:"execute"`
	// Optional SQL statement to do a read. Invoked after creation and every time it is changed.
	Query *string `pulumi:"query"`
	// SQL statement to revert the execute statement. Invoked when resource is being destroyed.
	Revert string `pulumi:"revert"`
}

// The set of arguments for constructing a UnsafeExecute resource.
type UnsafeExecuteArgs struct {
	// SQL statement to execute. Forces recreation of resource on change.
	Execute pulumi.StringInput
	// Optional SQL statement to do a read. Invoked after creation and every time it is changed.
	Query pulumi.StringPtrInput
	// SQL statement to revert the execute statement. Invoked when resource is being destroyed.
	Revert pulumi.StringInput
}

func (UnsafeExecuteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*unsafeExecuteArgs)(nil)).Elem()
}

type UnsafeExecuteInput interface {
	pulumi.Input

	ToUnsafeExecuteOutput() UnsafeExecuteOutput
	ToUnsafeExecuteOutputWithContext(ctx context.Context) UnsafeExecuteOutput
}

func (*UnsafeExecute) ElementType() reflect.Type {
	return reflect.TypeOf((**UnsafeExecute)(nil)).Elem()
}

func (i *UnsafeExecute) ToUnsafeExecuteOutput() UnsafeExecuteOutput {
	return i.ToUnsafeExecuteOutputWithContext(context.Background())
}

func (i *UnsafeExecute) ToUnsafeExecuteOutputWithContext(ctx context.Context) UnsafeExecuteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UnsafeExecuteOutput)
}

// UnsafeExecuteArrayInput is an input type that accepts UnsafeExecuteArray and UnsafeExecuteArrayOutput values.
// You can construct a concrete instance of `UnsafeExecuteArrayInput` via:
//
//	UnsafeExecuteArray{ UnsafeExecuteArgs{...} }
type UnsafeExecuteArrayInput interface {
	pulumi.Input

	ToUnsafeExecuteArrayOutput() UnsafeExecuteArrayOutput
	ToUnsafeExecuteArrayOutputWithContext(context.Context) UnsafeExecuteArrayOutput
}

type UnsafeExecuteArray []UnsafeExecuteInput

func (UnsafeExecuteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UnsafeExecute)(nil)).Elem()
}

func (i UnsafeExecuteArray) ToUnsafeExecuteArrayOutput() UnsafeExecuteArrayOutput {
	return i.ToUnsafeExecuteArrayOutputWithContext(context.Background())
}

func (i UnsafeExecuteArray) ToUnsafeExecuteArrayOutputWithContext(ctx context.Context) UnsafeExecuteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UnsafeExecuteArrayOutput)
}

// UnsafeExecuteMapInput is an input type that accepts UnsafeExecuteMap and UnsafeExecuteMapOutput values.
// You can construct a concrete instance of `UnsafeExecuteMapInput` via:
//
//	UnsafeExecuteMap{ "key": UnsafeExecuteArgs{...} }
type UnsafeExecuteMapInput interface {
	pulumi.Input

	ToUnsafeExecuteMapOutput() UnsafeExecuteMapOutput
	ToUnsafeExecuteMapOutputWithContext(context.Context) UnsafeExecuteMapOutput
}

type UnsafeExecuteMap map[string]UnsafeExecuteInput

func (UnsafeExecuteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UnsafeExecute)(nil)).Elem()
}

func (i UnsafeExecuteMap) ToUnsafeExecuteMapOutput() UnsafeExecuteMapOutput {
	return i.ToUnsafeExecuteMapOutputWithContext(context.Background())
}

func (i UnsafeExecuteMap) ToUnsafeExecuteMapOutputWithContext(ctx context.Context) UnsafeExecuteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UnsafeExecuteMapOutput)
}

type UnsafeExecuteOutput struct{ *pulumi.OutputState }

func (UnsafeExecuteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UnsafeExecute)(nil)).Elem()
}

func (o UnsafeExecuteOutput) ToUnsafeExecuteOutput() UnsafeExecuteOutput {
	return o
}

func (o UnsafeExecuteOutput) ToUnsafeExecuteOutputWithContext(ctx context.Context) UnsafeExecuteOutput {
	return o
}

// SQL statement to execute. Forces recreation of resource on change.
func (o UnsafeExecuteOutput) Execute() pulumi.StringOutput {
	return o.ApplyT(func(v *UnsafeExecute) pulumi.StringOutput { return v.Execute }).(pulumi.StringOutput)
}

// Optional SQL statement to do a read. Invoked after creation and every time it is changed.
func (o UnsafeExecuteOutput) Query() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UnsafeExecute) pulumi.StringPtrOutput { return v.Query }).(pulumi.StringPtrOutput)
}

// List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
func (o UnsafeExecuteOutput) QueryResults() pulumi.StringMapArrayOutput {
	return o.ApplyT(func(v *UnsafeExecute) pulumi.StringMapArrayOutput { return v.QueryResults }).(pulumi.StringMapArrayOutput)
}

// SQL statement to revert the execute statement. Invoked when resource is being destroyed.
func (o UnsafeExecuteOutput) Revert() pulumi.StringOutput {
	return o.ApplyT(func(v *UnsafeExecute) pulumi.StringOutput { return v.Revert }).(pulumi.StringOutput)
}

type UnsafeExecuteArrayOutput struct{ *pulumi.OutputState }

func (UnsafeExecuteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UnsafeExecute)(nil)).Elem()
}

func (o UnsafeExecuteArrayOutput) ToUnsafeExecuteArrayOutput() UnsafeExecuteArrayOutput {
	return o
}

func (o UnsafeExecuteArrayOutput) ToUnsafeExecuteArrayOutputWithContext(ctx context.Context) UnsafeExecuteArrayOutput {
	return o
}

func (o UnsafeExecuteArrayOutput) Index(i pulumi.IntInput) UnsafeExecuteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UnsafeExecute {
		return vs[0].([]*UnsafeExecute)[vs[1].(int)]
	}).(UnsafeExecuteOutput)
}

type UnsafeExecuteMapOutput struct{ *pulumi.OutputState }

func (UnsafeExecuteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UnsafeExecute)(nil)).Elem()
}

func (o UnsafeExecuteMapOutput) ToUnsafeExecuteMapOutput() UnsafeExecuteMapOutput {
	return o
}

func (o UnsafeExecuteMapOutput) ToUnsafeExecuteMapOutputWithContext(ctx context.Context) UnsafeExecuteMapOutput {
	return o
}

func (o UnsafeExecuteMapOutput) MapIndex(k pulumi.StringInput) UnsafeExecuteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UnsafeExecute {
		return vs[0].(map[string]*UnsafeExecute)[vs[1].(string)]
	}).(UnsafeExecuteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UnsafeExecuteInput)(nil)).Elem(), &UnsafeExecute{})
	pulumi.RegisterInputType(reflect.TypeOf((*UnsafeExecuteArrayInput)(nil)).Elem(), UnsafeExecuteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UnsafeExecuteMapInput)(nil)).Elem(), UnsafeExecuteMap{})
	pulumi.RegisterOutputType(UnsafeExecuteOutput{})
	pulumi.RegisterOutputType(UnsafeExecuteArrayOutput{})
	pulumi.RegisterOutputType(UnsafeExecuteMapOutput{})
}
