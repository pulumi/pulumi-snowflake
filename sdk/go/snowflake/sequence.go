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
//			_, err := snowflake.NewDatabase(ctx, "database", &snowflake.DatabaseArgs{
//				Name: pulumi.String("things"),
//			})
//			if err != nil {
//				return err
//			}
//			testSchema, err := snowflake.NewSchema(ctx, "test_schema", &snowflake.SchemaArgs{
//				Name:     pulumi.String("things"),
//				Database: pulumi.Any(testDatabase.Name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewSequence(ctx, "test_sequence", &snowflake.SequenceArgs{
//				Database: pulumi.Any(testDatabase.Name),
//				Schema:   testSchema.Name,
//				Name:     pulumi.String("thing_counter"),
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
// format is database name | schema name | sequence name
//
// ```sh
// $ pulumi import snowflake:index/sequence:Sequence example 'dbName|schemaName|sequenceName'
// ```
type Sequence struct {
	pulumi.CustomResourceState

	// Specifies a comment for the sequence.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the sequence. Don't use the | character.
	Database pulumi.StringOutput `pulumi:"database"`
	// The fully qualified name of the sequence.
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// The amount the sequence will increase by each time it is used
	Increment pulumi.IntPtrOutput `pulumi:"increment"`
	// Specifies the name for the sequence.
	Name pulumi.StringOutput `pulumi:"name"`
	// The increment sequence interval.
	NextValue pulumi.IntOutput `pulumi:"nextValue"`
	// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
	Ordering pulumi.StringPtrOutput `pulumi:"ordering"`
	// The schema in which to create the sequence. Don't use the | character.
	Schema pulumi.StringOutput `pulumi:"schema"`
}

// NewSequence registers a new resource with the given unique name, arguments, and options.
func NewSequence(ctx *pulumi.Context,
	name string, args *SequenceArgs, opts ...pulumi.ResourceOption) (*Sequence, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Sequence
	err := ctx.RegisterResource("snowflake:index/sequence:Sequence", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSequence gets an existing Sequence resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSequence(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SequenceState, opts ...pulumi.ResourceOption) (*Sequence, error) {
	var resource Sequence
	err := ctx.ReadResource("snowflake:index/sequence:Sequence", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Sequence resources.
type sequenceState struct {
	// Specifies a comment for the sequence.
	Comment *string `pulumi:"comment"`
	// The database in which to create the sequence. Don't use the | character.
	Database *string `pulumi:"database"`
	// The fully qualified name of the sequence.
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// The amount the sequence will increase by each time it is used
	Increment *int `pulumi:"increment"`
	// Specifies the name for the sequence.
	Name *string `pulumi:"name"`
	// The increment sequence interval.
	NextValue *int `pulumi:"nextValue"`
	// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
	Ordering *string `pulumi:"ordering"`
	// The schema in which to create the sequence. Don't use the | character.
	Schema *string `pulumi:"schema"`
}

type SequenceState struct {
	// Specifies a comment for the sequence.
	Comment pulumi.StringPtrInput
	// The database in which to create the sequence. Don't use the | character.
	Database pulumi.StringPtrInput
	// The fully qualified name of the sequence.
	FullyQualifiedName pulumi.StringPtrInput
	// The amount the sequence will increase by each time it is used
	Increment pulumi.IntPtrInput
	// Specifies the name for the sequence.
	Name pulumi.StringPtrInput
	// The increment sequence interval.
	NextValue pulumi.IntPtrInput
	// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
	Ordering pulumi.StringPtrInput
	// The schema in which to create the sequence. Don't use the | character.
	Schema pulumi.StringPtrInput
}

func (SequenceState) ElementType() reflect.Type {
	return reflect.TypeOf((*sequenceState)(nil)).Elem()
}

type sequenceArgs struct {
	// Specifies a comment for the sequence.
	Comment *string `pulumi:"comment"`
	// The database in which to create the sequence. Don't use the | character.
	Database string `pulumi:"database"`
	// The amount the sequence will increase by each time it is used
	Increment *int `pulumi:"increment"`
	// Specifies the name for the sequence.
	Name *string `pulumi:"name"`
	// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
	Ordering *string `pulumi:"ordering"`
	// The schema in which to create the sequence. Don't use the | character.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a Sequence resource.
type SequenceArgs struct {
	// Specifies a comment for the sequence.
	Comment pulumi.StringPtrInput
	// The database in which to create the sequence. Don't use the | character.
	Database pulumi.StringInput
	// The amount the sequence will increase by each time it is used
	Increment pulumi.IntPtrInput
	// Specifies the name for the sequence.
	Name pulumi.StringPtrInput
	// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
	Ordering pulumi.StringPtrInput
	// The schema in which to create the sequence. Don't use the | character.
	Schema pulumi.StringInput
}

func (SequenceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sequenceArgs)(nil)).Elem()
}

type SequenceInput interface {
	pulumi.Input

	ToSequenceOutput() SequenceOutput
	ToSequenceOutputWithContext(ctx context.Context) SequenceOutput
}

func (*Sequence) ElementType() reflect.Type {
	return reflect.TypeOf((**Sequence)(nil)).Elem()
}

func (i *Sequence) ToSequenceOutput() SequenceOutput {
	return i.ToSequenceOutputWithContext(context.Background())
}

func (i *Sequence) ToSequenceOutputWithContext(ctx context.Context) SequenceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SequenceOutput)
}

// SequenceArrayInput is an input type that accepts SequenceArray and SequenceArrayOutput values.
// You can construct a concrete instance of `SequenceArrayInput` via:
//
//	SequenceArray{ SequenceArgs{...} }
type SequenceArrayInput interface {
	pulumi.Input

	ToSequenceArrayOutput() SequenceArrayOutput
	ToSequenceArrayOutputWithContext(context.Context) SequenceArrayOutput
}

type SequenceArray []SequenceInput

func (SequenceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sequence)(nil)).Elem()
}

func (i SequenceArray) ToSequenceArrayOutput() SequenceArrayOutput {
	return i.ToSequenceArrayOutputWithContext(context.Background())
}

func (i SequenceArray) ToSequenceArrayOutputWithContext(ctx context.Context) SequenceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SequenceArrayOutput)
}

// SequenceMapInput is an input type that accepts SequenceMap and SequenceMapOutput values.
// You can construct a concrete instance of `SequenceMapInput` via:
//
//	SequenceMap{ "key": SequenceArgs{...} }
type SequenceMapInput interface {
	pulumi.Input

	ToSequenceMapOutput() SequenceMapOutput
	ToSequenceMapOutputWithContext(context.Context) SequenceMapOutput
}

type SequenceMap map[string]SequenceInput

func (SequenceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sequence)(nil)).Elem()
}

func (i SequenceMap) ToSequenceMapOutput() SequenceMapOutput {
	return i.ToSequenceMapOutputWithContext(context.Background())
}

func (i SequenceMap) ToSequenceMapOutputWithContext(ctx context.Context) SequenceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SequenceMapOutput)
}

type SequenceOutput struct{ *pulumi.OutputState }

func (SequenceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Sequence)(nil)).Elem()
}

func (o SequenceOutput) ToSequenceOutput() SequenceOutput {
	return o
}

func (o SequenceOutput) ToSequenceOutputWithContext(ctx context.Context) SequenceOutput {
	return o
}

// Specifies a comment for the sequence.
func (o SequenceOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Sequence) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the sequence. Don't use the | character.
func (o SequenceOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Sequence) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// The fully qualified name of the sequence.
func (o SequenceOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Sequence) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// The amount the sequence will increase by each time it is used
func (o SequenceOutput) Increment() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Sequence) pulumi.IntPtrOutput { return v.Increment }).(pulumi.IntPtrOutput)
}

// Specifies the name for the sequence.
func (o SequenceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Sequence) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The increment sequence interval.
func (o SequenceOutput) NextValue() pulumi.IntOutput {
	return o.ApplyT(func(v *Sequence) pulumi.IntOutput { return v.NextValue }).(pulumi.IntOutput)
}

// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
func (o SequenceOutput) Ordering() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Sequence) pulumi.StringPtrOutput { return v.Ordering }).(pulumi.StringPtrOutput)
}

// The schema in which to create the sequence. Don't use the | character.
func (o SequenceOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Sequence) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

type SequenceArrayOutput struct{ *pulumi.OutputState }

func (SequenceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sequence)(nil)).Elem()
}

func (o SequenceArrayOutput) ToSequenceArrayOutput() SequenceArrayOutput {
	return o
}

func (o SequenceArrayOutput) ToSequenceArrayOutputWithContext(ctx context.Context) SequenceArrayOutput {
	return o
}

func (o SequenceArrayOutput) Index(i pulumi.IntInput) SequenceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Sequence {
		return vs[0].([]*Sequence)[vs[1].(int)]
	}).(SequenceOutput)
}

type SequenceMapOutput struct{ *pulumi.OutputState }

func (SequenceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sequence)(nil)).Elem()
}

func (o SequenceMapOutput) ToSequenceMapOutput() SequenceMapOutput {
	return o
}

func (o SequenceMapOutput) ToSequenceMapOutputWithContext(ctx context.Context) SequenceMapOutput {
	return o
}

func (o SequenceMapOutput) MapIndex(k pulumi.StringInput) SequenceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Sequence {
		return vs[0].(map[string]*Sequence)[vs[1].(string)]
	}).(SequenceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SequenceInput)(nil)).Elem(), &Sequence{})
	pulumi.RegisterInputType(reflect.TypeOf((*SequenceArrayInput)(nil)).Elem(), SequenceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SequenceMapInput)(nil)).Elem(), SequenceMap{})
	pulumi.RegisterOutputType(SequenceOutput{})
	pulumi.RegisterOutputType(SequenceArrayOutput{})
	pulumi.RegisterOutputType(SequenceMapOutput{})
}
