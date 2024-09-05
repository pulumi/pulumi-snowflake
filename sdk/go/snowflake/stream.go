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
// format is database name | schema name | stream name
//
// ```sh
// $ pulumi import snowflake:index/stream:Stream example 'dbName|schemaName|streamName'
// ```
type Stream struct {
	pulumi.CustomResourceState

	// Type of the stream that will be created.
	AppendOnly pulumi.BoolPtrOutput `pulumi:"appendOnly"`
	// Specifies a comment for the stream.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the stream.
	Database pulumi.StringOutput `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Create an insert only stream type.
	InsertOnly pulumi.BoolPtrOutput `pulumi:"insertOnly"`
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies an identifier for the stage the stream will monitor.
	OnStage pulumi.StringPtrOutput `pulumi:"onStage"`
	// Specifies an identifier for the table the stream will monitor.
	OnTable pulumi.StringPtrOutput `pulumi:"onTable"`
	// Specifies an identifier for the view the stream will monitor.
	OnView pulumi.StringPtrOutput `pulumi:"onView"`
	// Name of the role that owns the stream.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// The schema in which to create the stream.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
	ShowInitialRows pulumi.BoolPtrOutput `pulumi:"showInitialRows"`
}

// NewStream registers a new resource with the given unique name, arguments, and options.
func NewStream(ctx *pulumi.Context,
	name string, args *StreamArgs, opts ...pulumi.ResourceOption) (*Stream, error) {
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
	var resource Stream
	err := ctx.RegisterResource("snowflake:index/stream:Stream", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStream gets an existing Stream resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStream(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamState, opts ...pulumi.ResourceOption) (*Stream, error) {
	var resource Stream
	err := ctx.ReadResource("snowflake:index/stream:Stream", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stream resources.
type streamState struct {
	// Type of the stream that will be created.
	AppendOnly *bool `pulumi:"appendOnly"`
	// Specifies a comment for the stream.
	Comment *string `pulumi:"comment"`
	// The database in which to create the stream.
	Database *string `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Create an insert only stream type.
	InsertOnly *bool `pulumi:"insertOnly"`
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
	Name *string `pulumi:"name"`
	// Specifies an identifier for the stage the stream will monitor.
	OnStage *string `pulumi:"onStage"`
	// Specifies an identifier for the table the stream will monitor.
	OnTable *string `pulumi:"onTable"`
	// Specifies an identifier for the view the stream will monitor.
	OnView *string `pulumi:"onView"`
	// Name of the role that owns the stream.
	Owner *string `pulumi:"owner"`
	// The schema in which to create the stream.
	Schema *string `pulumi:"schema"`
	// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
	ShowInitialRows *bool `pulumi:"showInitialRows"`
}

type StreamState struct {
	// Type of the stream that will be created.
	AppendOnly pulumi.BoolPtrInput
	// Specifies a comment for the stream.
	Comment pulumi.StringPtrInput
	// The database in which to create the stream.
	Database pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Create an insert only stream type.
	InsertOnly pulumi.BoolPtrInput
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
	Name pulumi.StringPtrInput
	// Specifies an identifier for the stage the stream will monitor.
	OnStage pulumi.StringPtrInput
	// Specifies an identifier for the table the stream will monitor.
	OnTable pulumi.StringPtrInput
	// Specifies an identifier for the view the stream will monitor.
	OnView pulumi.StringPtrInput
	// Name of the role that owns the stream.
	Owner pulumi.StringPtrInput
	// The schema in which to create the stream.
	Schema pulumi.StringPtrInput
	// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
	ShowInitialRows pulumi.BoolPtrInput
}

func (StreamState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamState)(nil)).Elem()
}

type streamArgs struct {
	// Type of the stream that will be created.
	AppendOnly *bool `pulumi:"appendOnly"`
	// Specifies a comment for the stream.
	Comment *string `pulumi:"comment"`
	// The database in which to create the stream.
	Database string `pulumi:"database"`
	// Create an insert only stream type.
	InsertOnly *bool `pulumi:"insertOnly"`
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
	Name *string `pulumi:"name"`
	// Specifies an identifier for the stage the stream will monitor.
	OnStage *string `pulumi:"onStage"`
	// Specifies an identifier for the table the stream will monitor.
	OnTable *string `pulumi:"onTable"`
	// Specifies an identifier for the view the stream will monitor.
	OnView *string `pulumi:"onView"`
	// The schema in which to create the stream.
	Schema string `pulumi:"schema"`
	// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
	ShowInitialRows *bool `pulumi:"showInitialRows"`
}

// The set of arguments for constructing a Stream resource.
type StreamArgs struct {
	// Type of the stream that will be created.
	AppendOnly pulumi.BoolPtrInput
	// Specifies a comment for the stream.
	Comment pulumi.StringPtrInput
	// The database in which to create the stream.
	Database pulumi.StringInput
	// Create an insert only stream type.
	InsertOnly pulumi.BoolPtrInput
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
	Name pulumi.StringPtrInput
	// Specifies an identifier for the stage the stream will monitor.
	OnStage pulumi.StringPtrInput
	// Specifies an identifier for the table the stream will monitor.
	OnTable pulumi.StringPtrInput
	// Specifies an identifier for the view the stream will monitor.
	OnView pulumi.StringPtrInput
	// The schema in which to create the stream.
	Schema pulumi.StringInput
	// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
	ShowInitialRows pulumi.BoolPtrInput
}

func (StreamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamArgs)(nil)).Elem()
}

type StreamInput interface {
	pulumi.Input

	ToStreamOutput() StreamOutput
	ToStreamOutputWithContext(ctx context.Context) StreamOutput
}

func (*Stream) ElementType() reflect.Type {
	return reflect.TypeOf((**Stream)(nil)).Elem()
}

func (i *Stream) ToStreamOutput() StreamOutput {
	return i.ToStreamOutputWithContext(context.Background())
}

func (i *Stream) ToStreamOutputWithContext(ctx context.Context) StreamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamOutput)
}

// StreamArrayInput is an input type that accepts StreamArray and StreamArrayOutput values.
// You can construct a concrete instance of `StreamArrayInput` via:
//
//	StreamArray{ StreamArgs{...} }
type StreamArrayInput interface {
	pulumi.Input

	ToStreamArrayOutput() StreamArrayOutput
	ToStreamArrayOutputWithContext(context.Context) StreamArrayOutput
}

type StreamArray []StreamInput

func (StreamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stream)(nil)).Elem()
}

func (i StreamArray) ToStreamArrayOutput() StreamArrayOutput {
	return i.ToStreamArrayOutputWithContext(context.Background())
}

func (i StreamArray) ToStreamArrayOutputWithContext(ctx context.Context) StreamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamArrayOutput)
}

// StreamMapInput is an input type that accepts StreamMap and StreamMapOutput values.
// You can construct a concrete instance of `StreamMapInput` via:
//
//	StreamMap{ "key": StreamArgs{...} }
type StreamMapInput interface {
	pulumi.Input

	ToStreamMapOutput() StreamMapOutput
	ToStreamMapOutputWithContext(context.Context) StreamMapOutput
}

type StreamMap map[string]StreamInput

func (StreamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stream)(nil)).Elem()
}

func (i StreamMap) ToStreamMapOutput() StreamMapOutput {
	return i.ToStreamMapOutputWithContext(context.Background())
}

func (i StreamMap) ToStreamMapOutputWithContext(ctx context.Context) StreamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamMapOutput)
}

type StreamOutput struct{ *pulumi.OutputState }

func (StreamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stream)(nil)).Elem()
}

func (o StreamOutput) ToStreamOutput() StreamOutput {
	return o
}

func (o StreamOutput) ToStreamOutputWithContext(ctx context.Context) StreamOutput {
	return o
}

// Type of the stream that will be created.
func (o StreamOutput) AppendOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.BoolPtrOutput { return v.AppendOnly }).(pulumi.BoolPtrOutput)
}

// Specifies a comment for the stream.
func (o StreamOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the stream.
func (o StreamOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o StreamOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Create an insert only stream type.
func (o StreamOutput) InsertOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.BoolPtrOutput { return v.InsertOnly }).(pulumi.BoolPtrOutput)
}

// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
func (o StreamOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies an identifier for the stage the stream will monitor.
func (o StreamOutput) OnStage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringPtrOutput { return v.OnStage }).(pulumi.StringPtrOutput)
}

// Specifies an identifier for the table the stream will monitor.
func (o StreamOutput) OnTable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringPtrOutput { return v.OnTable }).(pulumi.StringPtrOutput)
}

// Specifies an identifier for the view the stream will monitor.
func (o StreamOutput) OnView() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringPtrOutput { return v.OnView }).(pulumi.StringPtrOutput)
}

// Name of the role that owns the stream.
func (o StreamOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// The schema in which to create the stream.
func (o StreamOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
func (o StreamOutput) ShowInitialRows() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.BoolPtrOutput { return v.ShowInitialRows }).(pulumi.BoolPtrOutput)
}

type StreamArrayOutput struct{ *pulumi.OutputState }

func (StreamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stream)(nil)).Elem()
}

func (o StreamArrayOutput) ToStreamArrayOutput() StreamArrayOutput {
	return o
}

func (o StreamArrayOutput) ToStreamArrayOutputWithContext(ctx context.Context) StreamArrayOutput {
	return o
}

func (o StreamArrayOutput) Index(i pulumi.IntInput) StreamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stream {
		return vs[0].([]*Stream)[vs[1].(int)]
	}).(StreamOutput)
}

type StreamMapOutput struct{ *pulumi.OutputState }

func (StreamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stream)(nil)).Elem()
}

func (o StreamMapOutput) ToStreamMapOutput() StreamMapOutput {
	return o
}

func (o StreamMapOutput) ToStreamMapOutputWithContext(ctx context.Context) StreamMapOutput {
	return o
}

func (o StreamMapOutput) MapIndex(k pulumi.StringInput) StreamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stream {
		return vs[0].(map[string]*Stream)[vs[1].(string)]
	}).(StreamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamInput)(nil)).Elem(), &Stream{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamArrayInput)(nil)).Elem(), StreamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamMapInput)(nil)).Elem(), StreamMap{})
	pulumi.RegisterOutputType(StreamOutput{})
	pulumi.RegisterOutputType(StreamArrayOutput{})
	pulumi.RegisterOutputType(StreamMapOutput{})
}
