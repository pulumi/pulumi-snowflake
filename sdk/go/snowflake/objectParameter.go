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
// ```sh
// $ pulumi import snowflake:index/objectParameter:ObjectParameter s <key>|<object_type>|<object_identifier>
// ```
type ObjectParameter struct {
	pulumi.CustomResourceState

	// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
	Key pulumi.StringOutput `pulumi:"key"`
	// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectIdentifiers ObjectParameterObjectIdentifierArrayOutput `pulumi:"objectIdentifiers"`
	// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectType pulumi.StringPtrOutput `pulumi:"objectType"`
	// If true, the object parameter will be set on the account level.
	OnAccount pulumi.BoolPtrOutput `pulumi:"onAccount"`
	// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewObjectParameter registers a new resource with the given unique name, arguments, and options.
func NewObjectParameter(ctx *pulumi.Context,
	name string, args *ObjectParameterArgs, opts ...pulumi.ResourceOption) (*ObjectParameter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ObjectParameter
	err := ctx.RegisterResource("snowflake:index/objectParameter:ObjectParameter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectParameter gets an existing ObjectParameter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectParameter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectParameterState, opts ...pulumi.ResourceOption) (*ObjectParameter, error) {
	var resource ObjectParameter
	err := ctx.ReadResource("snowflake:index/objectParameter:ObjectParameter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectParameter resources.
type objectParameterState struct {
	// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
	Key *string `pulumi:"key"`
	// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectIdentifiers []ObjectParameterObjectIdentifier `pulumi:"objectIdentifiers"`
	// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectType *string `pulumi:"objectType"`
	// If true, the object parameter will be set on the account level.
	OnAccount *bool `pulumi:"onAccount"`
	// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value *string `pulumi:"value"`
}

type ObjectParameterState struct {
	// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
	Key pulumi.StringPtrInput
	// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectIdentifiers ObjectParameterObjectIdentifierArrayInput
	// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectType pulumi.StringPtrInput
	// If true, the object parameter will be set on the account level.
	OnAccount pulumi.BoolPtrInput
	// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value pulumi.StringPtrInput
}

func (ObjectParameterState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectParameterState)(nil)).Elem()
}

type objectParameterArgs struct {
	// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
	Key string `pulumi:"key"`
	// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectIdentifiers []ObjectParameterObjectIdentifier `pulumi:"objectIdentifiers"`
	// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectType *string `pulumi:"objectType"`
	// If true, the object parameter will be set on the account level.
	OnAccount *bool `pulumi:"onAccount"`
	// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a ObjectParameter resource.
type ObjectParameterArgs struct {
	// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
	Key pulumi.StringInput
	// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectIdentifiers ObjectParameterObjectIdentifierArrayInput
	// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
	ObjectType pulumi.StringPtrInput
	// If true, the object parameter will be set on the account level.
	OnAccount pulumi.BoolPtrInput
	// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value pulumi.StringInput
}

func (ObjectParameterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectParameterArgs)(nil)).Elem()
}

type ObjectParameterInput interface {
	pulumi.Input

	ToObjectParameterOutput() ObjectParameterOutput
	ToObjectParameterOutputWithContext(ctx context.Context) ObjectParameterOutput
}

func (*ObjectParameter) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectParameter)(nil)).Elem()
}

func (i *ObjectParameter) ToObjectParameterOutput() ObjectParameterOutput {
	return i.ToObjectParameterOutputWithContext(context.Background())
}

func (i *ObjectParameter) ToObjectParameterOutputWithContext(ctx context.Context) ObjectParameterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectParameterOutput)
}

// ObjectParameterArrayInput is an input type that accepts ObjectParameterArray and ObjectParameterArrayOutput values.
// You can construct a concrete instance of `ObjectParameterArrayInput` via:
//
//	ObjectParameterArray{ ObjectParameterArgs{...} }
type ObjectParameterArrayInput interface {
	pulumi.Input

	ToObjectParameterArrayOutput() ObjectParameterArrayOutput
	ToObjectParameterArrayOutputWithContext(context.Context) ObjectParameterArrayOutput
}

type ObjectParameterArray []ObjectParameterInput

func (ObjectParameterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectParameter)(nil)).Elem()
}

func (i ObjectParameterArray) ToObjectParameterArrayOutput() ObjectParameterArrayOutput {
	return i.ToObjectParameterArrayOutputWithContext(context.Background())
}

func (i ObjectParameterArray) ToObjectParameterArrayOutputWithContext(ctx context.Context) ObjectParameterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectParameterArrayOutput)
}

// ObjectParameterMapInput is an input type that accepts ObjectParameterMap and ObjectParameterMapOutput values.
// You can construct a concrete instance of `ObjectParameterMapInput` via:
//
//	ObjectParameterMap{ "key": ObjectParameterArgs{...} }
type ObjectParameterMapInput interface {
	pulumi.Input

	ToObjectParameterMapOutput() ObjectParameterMapOutput
	ToObjectParameterMapOutputWithContext(context.Context) ObjectParameterMapOutput
}

type ObjectParameterMap map[string]ObjectParameterInput

func (ObjectParameterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectParameter)(nil)).Elem()
}

func (i ObjectParameterMap) ToObjectParameterMapOutput() ObjectParameterMapOutput {
	return i.ToObjectParameterMapOutputWithContext(context.Background())
}

func (i ObjectParameterMap) ToObjectParameterMapOutputWithContext(ctx context.Context) ObjectParameterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectParameterMapOutput)
}

type ObjectParameterOutput struct{ *pulumi.OutputState }

func (ObjectParameterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectParameter)(nil)).Elem()
}

func (o ObjectParameterOutput) ToObjectParameterOutput() ObjectParameterOutput {
	return o
}

func (o ObjectParameterOutput) ToObjectParameterOutputWithContext(ctx context.Context) ObjectParameterOutput {
	return o
}

// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
func (o ObjectParameterOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectParameter) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
func (o ObjectParameterOutput) ObjectIdentifiers() ObjectParameterObjectIdentifierArrayOutput {
	return o.ApplyT(func(v *ObjectParameter) ObjectParameterObjectIdentifierArrayOutput { return v.ObjectIdentifiers }).(ObjectParameterObjectIdentifierArrayOutput)
}

// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
func (o ObjectParameterOutput) ObjectType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectParameter) pulumi.StringPtrOutput { return v.ObjectType }).(pulumi.StringPtrOutput)
}

// If true, the object parameter will be set on the account level.
func (o ObjectParameterOutput) OnAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ObjectParameter) pulumi.BoolPtrOutput { return v.OnAccount }).(pulumi.BoolPtrOutput)
}

// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
func (o ObjectParameterOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectParameter) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type ObjectParameterArrayOutput struct{ *pulumi.OutputState }

func (ObjectParameterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectParameter)(nil)).Elem()
}

func (o ObjectParameterArrayOutput) ToObjectParameterArrayOutput() ObjectParameterArrayOutput {
	return o
}

func (o ObjectParameterArrayOutput) ToObjectParameterArrayOutputWithContext(ctx context.Context) ObjectParameterArrayOutput {
	return o
}

func (o ObjectParameterArrayOutput) Index(i pulumi.IntInput) ObjectParameterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectParameter {
		return vs[0].([]*ObjectParameter)[vs[1].(int)]
	}).(ObjectParameterOutput)
}

type ObjectParameterMapOutput struct{ *pulumi.OutputState }

func (ObjectParameterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectParameter)(nil)).Elem()
}

func (o ObjectParameterMapOutput) ToObjectParameterMapOutput() ObjectParameterMapOutput {
	return o
}

func (o ObjectParameterMapOutput) ToObjectParameterMapOutputWithContext(ctx context.Context) ObjectParameterMapOutput {
	return o
}

func (o ObjectParameterMapOutput) MapIndex(k pulumi.StringInput) ObjectParameterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectParameter {
		return vs[0].(map[string]*ObjectParameter)[vs[1].(string)]
	}).(ObjectParameterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectParameterInput)(nil)).Elem(), &ObjectParameter{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectParameterArrayInput)(nil)).Elem(), ObjectParameterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectParameterMapInput)(nil)).Elem(), ObjectParameterMap{})
	pulumi.RegisterOutputType(ObjectParameterOutput{})
	pulumi.RegisterOutputType(ObjectParameterArrayOutput{})
	pulumi.RegisterOutputType(ObjectParameterMapOutput{})
}
