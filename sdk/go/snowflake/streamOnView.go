// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ```sh
// $ pulumi import snowflake:index/streamOnView:StreamOnView example '"<database_name>"."<schema_name>"."<stream_name>"'
// ```
type StreamOnView struct {
	pulumi.CustomResourceState

	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AppendOnly pulumi.StringPtrOutput      `pulumi:"appendOnly"`
	At         StreamOnViewAtPtrOutput     `pulumi:"at"`
	Before     StreamOnViewBeforePtrOutput `pulumi:"before"`
	// Specifies a comment for the stream.
	Comment    pulumi.StringPtrOutput `pulumi:"comment"`
	CopyGrants pulumi.BoolPtrOutput   `pulumi:"copyGrants"`
	// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Outputs the result of `DESCRIBE STREAM` for the given stream.
	DescribeOutputs StreamOnViewDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema          pulumi.StringOutput    `pulumi:"schema"`
	ShowInitialRows pulumi.StringPtrOutput `pulumi:"showInitialRows"`
	// Outputs the result of `SHOW STREAMS` for the given stream.
	ShowOutputs StreamOnViewShowOutputArrayOutput `pulumi:"showOutputs"`
	Stale       pulumi.BoolOutput                 `pulumi:"stale"`
	// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
	StreamType pulumi.StringOutput `pulumi:"streamType"`
	// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
	View pulumi.StringOutput `pulumi:"view"`
}

// NewStreamOnView registers a new resource with the given unique name, arguments, and options.
func NewStreamOnView(ctx *pulumi.Context,
	name string, args *StreamOnViewArgs, opts ...pulumi.ResourceOption) (*StreamOnView, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.View == nil {
		return nil, errors.New("invalid value for required argument 'View'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamOnView
	err := ctx.RegisterResource("snowflake:index/streamOnView:StreamOnView", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamOnView gets an existing StreamOnView resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamOnView(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamOnViewState, opts ...pulumi.ResourceOption) (*StreamOnView, error) {
	var resource StreamOnView
	err := ctx.ReadResource("snowflake:index/streamOnView:StreamOnView", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamOnView resources.
type streamOnViewState struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AppendOnly *string             `pulumi:"appendOnly"`
	At         *StreamOnViewAt     `pulumi:"at"`
	Before     *StreamOnViewBefore `pulumi:"before"`
	// Specifies a comment for the stream.
	Comment    *string `pulumi:"comment"`
	CopyGrants *bool   `pulumi:"copyGrants"`
	// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Outputs the result of `DESCRIBE STREAM` for the given stream.
	DescribeOutputs []StreamOnViewDescribeOutput `pulumi:"describeOutputs"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema          *string `pulumi:"schema"`
	ShowInitialRows *string `pulumi:"showInitialRows"`
	// Outputs the result of `SHOW STREAMS` for the given stream.
	ShowOutputs []StreamOnViewShowOutput `pulumi:"showOutputs"`
	Stale       *bool                    `pulumi:"stale"`
	// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
	StreamType *string `pulumi:"streamType"`
	// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
	View *string `pulumi:"view"`
}

type StreamOnViewState struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AppendOnly pulumi.StringPtrInput
	At         StreamOnViewAtPtrInput
	Before     StreamOnViewBeforePtrInput
	// Specifies a comment for the stream.
	Comment    pulumi.StringPtrInput
	CopyGrants pulumi.BoolPtrInput
	// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE STREAM` for the given stream.
	DescribeOutputs StreamOnViewDescribeOutputArrayInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema          pulumi.StringPtrInput
	ShowInitialRows pulumi.StringPtrInput
	// Outputs the result of `SHOW STREAMS` for the given stream.
	ShowOutputs StreamOnViewShowOutputArrayInput
	Stale       pulumi.BoolPtrInput
	// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
	StreamType pulumi.StringPtrInput
	// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
	View pulumi.StringPtrInput
}

func (StreamOnViewState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamOnViewState)(nil)).Elem()
}

type streamOnViewArgs struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AppendOnly *string             `pulumi:"appendOnly"`
	At         *StreamOnViewAt     `pulumi:"at"`
	Before     *StreamOnViewBefore `pulumi:"before"`
	// Specifies a comment for the stream.
	Comment    *string `pulumi:"comment"`
	CopyGrants *bool   `pulumi:"copyGrants"`
	// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema          string  `pulumi:"schema"`
	ShowInitialRows *string `pulumi:"showInitialRows"`
	// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
	View string `pulumi:"view"`
}

// The set of arguments for constructing a StreamOnView resource.
type StreamOnViewArgs struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AppendOnly pulumi.StringPtrInput
	At         StreamOnViewAtPtrInput
	Before     StreamOnViewBeforePtrInput
	// Specifies a comment for the stream.
	Comment    pulumi.StringPtrInput
	CopyGrants pulumi.BoolPtrInput
	// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema          pulumi.StringInput
	ShowInitialRows pulumi.StringPtrInput
	// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
	View pulumi.StringInput
}

func (StreamOnViewArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamOnViewArgs)(nil)).Elem()
}

type StreamOnViewInput interface {
	pulumi.Input

	ToStreamOnViewOutput() StreamOnViewOutput
	ToStreamOnViewOutputWithContext(ctx context.Context) StreamOnViewOutput
}

func (*StreamOnView) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamOnView)(nil)).Elem()
}

func (i *StreamOnView) ToStreamOnViewOutput() StreamOnViewOutput {
	return i.ToStreamOnViewOutputWithContext(context.Background())
}

func (i *StreamOnView) ToStreamOnViewOutputWithContext(ctx context.Context) StreamOnViewOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamOnViewOutput)
}

// StreamOnViewArrayInput is an input type that accepts StreamOnViewArray and StreamOnViewArrayOutput values.
// You can construct a concrete instance of `StreamOnViewArrayInput` via:
//
//	StreamOnViewArray{ StreamOnViewArgs{...} }
type StreamOnViewArrayInput interface {
	pulumi.Input

	ToStreamOnViewArrayOutput() StreamOnViewArrayOutput
	ToStreamOnViewArrayOutputWithContext(context.Context) StreamOnViewArrayOutput
}

type StreamOnViewArray []StreamOnViewInput

func (StreamOnViewArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamOnView)(nil)).Elem()
}

func (i StreamOnViewArray) ToStreamOnViewArrayOutput() StreamOnViewArrayOutput {
	return i.ToStreamOnViewArrayOutputWithContext(context.Background())
}

func (i StreamOnViewArray) ToStreamOnViewArrayOutputWithContext(ctx context.Context) StreamOnViewArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamOnViewArrayOutput)
}

// StreamOnViewMapInput is an input type that accepts StreamOnViewMap and StreamOnViewMapOutput values.
// You can construct a concrete instance of `StreamOnViewMapInput` via:
//
//	StreamOnViewMap{ "key": StreamOnViewArgs{...} }
type StreamOnViewMapInput interface {
	pulumi.Input

	ToStreamOnViewMapOutput() StreamOnViewMapOutput
	ToStreamOnViewMapOutputWithContext(context.Context) StreamOnViewMapOutput
}

type StreamOnViewMap map[string]StreamOnViewInput

func (StreamOnViewMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamOnView)(nil)).Elem()
}

func (i StreamOnViewMap) ToStreamOnViewMapOutput() StreamOnViewMapOutput {
	return i.ToStreamOnViewMapOutputWithContext(context.Background())
}

func (i StreamOnViewMap) ToStreamOnViewMapOutputWithContext(ctx context.Context) StreamOnViewMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamOnViewMapOutput)
}

type StreamOnViewOutput struct{ *pulumi.OutputState }

func (StreamOnViewOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamOnView)(nil)).Elem()
}

func (o StreamOnViewOutput) ToStreamOnViewOutput() StreamOnViewOutput {
	return o
}

func (o StreamOnViewOutput) ToStreamOnViewOutputWithContext(ctx context.Context) StreamOnViewOutput {
	return o
}

// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
func (o StreamOnViewOutput) AppendOnly() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringPtrOutput { return v.AppendOnly }).(pulumi.StringPtrOutput)
}

func (o StreamOnViewOutput) At() StreamOnViewAtPtrOutput {
	return o.ApplyT(func(v *StreamOnView) StreamOnViewAtPtrOutput { return v.At }).(StreamOnViewAtPtrOutput)
}

func (o StreamOnViewOutput) Before() StreamOnViewBeforePtrOutput {
	return o.ApplyT(func(v *StreamOnView) StreamOnViewBeforePtrOutput { return v.Before }).(StreamOnViewBeforePtrOutput)
}

// Specifies a comment for the stream.
func (o StreamOnViewOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o StreamOnViewOutput) CopyGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.BoolPtrOutput { return v.CopyGrants }).(pulumi.BoolPtrOutput)
}

// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o StreamOnViewOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Outputs the result of `DESCRIBE STREAM` for the given stream.
func (o StreamOnViewOutput) DescribeOutputs() StreamOnViewDescribeOutputArrayOutput {
	return o.ApplyT(func(v *StreamOnView) StreamOnViewDescribeOutputArrayOutput { return v.DescribeOutputs }).(StreamOnViewDescribeOutputArrayOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o StreamOnViewOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o StreamOnViewOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o StreamOnViewOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

func (o StreamOnViewOutput) ShowInitialRows() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringPtrOutput { return v.ShowInitialRows }).(pulumi.StringPtrOutput)
}

// Outputs the result of `SHOW STREAMS` for the given stream.
func (o StreamOnViewOutput) ShowOutputs() StreamOnViewShowOutputArrayOutput {
	return o.ApplyT(func(v *StreamOnView) StreamOnViewShowOutputArrayOutput { return v.ShowOutputs }).(StreamOnViewShowOutputArrayOutput)
}

func (o StreamOnViewOutput) Stale() pulumi.BoolOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.BoolOutput { return v.Stale }).(pulumi.BoolOutput)
}

// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
func (o StreamOnViewOutput) StreamType() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringOutput { return v.StreamType }).(pulumi.StringOutput)
}

// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
func (o StreamOnViewOutput) View() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamOnView) pulumi.StringOutput { return v.View }).(pulumi.StringOutput)
}

type StreamOnViewArrayOutput struct{ *pulumi.OutputState }

func (StreamOnViewArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamOnView)(nil)).Elem()
}

func (o StreamOnViewArrayOutput) ToStreamOnViewArrayOutput() StreamOnViewArrayOutput {
	return o
}

func (o StreamOnViewArrayOutput) ToStreamOnViewArrayOutputWithContext(ctx context.Context) StreamOnViewArrayOutput {
	return o
}

func (o StreamOnViewArrayOutput) Index(i pulumi.IntInput) StreamOnViewOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamOnView {
		return vs[0].([]*StreamOnView)[vs[1].(int)]
	}).(StreamOnViewOutput)
}

type StreamOnViewMapOutput struct{ *pulumi.OutputState }

func (StreamOnViewMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamOnView)(nil)).Elem()
}

func (o StreamOnViewMapOutput) ToStreamOnViewMapOutput() StreamOnViewMapOutput {
	return o
}

func (o StreamOnViewMapOutput) ToStreamOnViewMapOutputWithContext(ctx context.Context) StreamOnViewMapOutput {
	return o
}

func (o StreamOnViewMapOutput) MapIndex(k pulumi.StringInput) StreamOnViewOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamOnView {
		return vs[0].(map[string]*StreamOnView)[vs[1].(string)]
	}).(StreamOnViewOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamOnViewInput)(nil)).Elem(), &StreamOnView{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamOnViewArrayInput)(nil)).Elem(), StreamOnViewArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamOnViewMapInput)(nil)).Elem(), StreamOnViewMap{})
	pulumi.RegisterOutputType(StreamOnViewOutput{})
	pulumi.RegisterOutputType(StreamOnViewArrayOutput{})
	pulumi.RegisterOutputType(StreamOnViewMapOutput{})
}
