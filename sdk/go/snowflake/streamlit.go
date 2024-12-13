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
// $ pulumi import snowflake:index/streamlit:Streamlit example '"<database_name>"."<schema_name>"."<streamlit_name>"'
// ```
type Streamlit struct {
	pulumi.CustomResourceState

	// Specifies a comment for the streamlit.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
	DescribeOutputs StreamlitDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
	DirectoryLocation pulumi.StringPtrOutput `pulumi:"directoryLocation"`
	// External access integrations connected to the Streamlit.
	ExternalAccessIntegrations pulumi.StringArrayOutput `pulumi:"externalAccessIntegrations"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directoryLocation`
	MainFile pulumi.StringOutput `pulumi:"mainFile"`
	// String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
	QueryWarehouse pulumi.StringPtrOutput `pulumi:"queryWarehouse"`
	// The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Outputs the result of `SHOW STREAMLIT` for the given streamlit.
	ShowOutputs StreamlitShowOutputArrayOutput `pulumi:"showOutputs"`
	// The stage in which streamlit files are located. For more information about this resource, see docs.
	Stage pulumi.StringOutput `pulumi:"stage"`
	// Specifies a title for the Streamlit app to display in Snowsight.
	Title pulumi.StringPtrOutput `pulumi:"title"`
}

// NewStreamlit registers a new resource with the given unique name, arguments, and options.
func NewStreamlit(ctx *pulumi.Context,
	name string, args *StreamlitArgs, opts ...pulumi.ResourceOption) (*Streamlit, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.MainFile == nil {
		return nil, errors.New("invalid value for required argument 'MainFile'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Stage == nil {
		return nil, errors.New("invalid value for required argument 'Stage'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Streamlit
	err := ctx.RegisterResource("snowflake:index/streamlit:Streamlit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamlit gets an existing Streamlit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamlit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamlitState, opts ...pulumi.ResourceOption) (*Streamlit, error) {
	var resource Streamlit
	err := ctx.ReadResource("snowflake:index/streamlit:Streamlit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Streamlit resources.
type streamlitState struct {
	// Specifies a comment for the streamlit.
	Comment *string `pulumi:"comment"`
	// The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
	DescribeOutputs []StreamlitDescribeOutput `pulumi:"describeOutputs"`
	// Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
	DirectoryLocation *string `pulumi:"directoryLocation"`
	// External access integrations connected to the Streamlit.
	ExternalAccessIntegrations []string `pulumi:"externalAccessIntegrations"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directoryLocation`
	MainFile *string `pulumi:"mainFile"`
	// String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
	QueryWarehouse *string `pulumi:"queryWarehouse"`
	// The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema *string `pulumi:"schema"`
	// Outputs the result of `SHOW STREAMLIT` for the given streamlit.
	ShowOutputs []StreamlitShowOutput `pulumi:"showOutputs"`
	// The stage in which streamlit files are located. For more information about this resource, see docs.
	Stage *string `pulumi:"stage"`
	// Specifies a title for the Streamlit app to display in Snowsight.
	Title *string `pulumi:"title"`
}

type StreamlitState struct {
	// Specifies a comment for the streamlit.
	Comment pulumi.StringPtrInput
	// The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
	DescribeOutputs StreamlitDescribeOutputArrayInput
	// Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
	DirectoryLocation pulumi.StringPtrInput
	// External access integrations connected to the Streamlit.
	ExternalAccessIntegrations pulumi.StringArrayInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directoryLocation`
	MainFile pulumi.StringPtrInput
	// String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
	QueryWarehouse pulumi.StringPtrInput
	// The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringPtrInput
	// Outputs the result of `SHOW STREAMLIT` for the given streamlit.
	ShowOutputs StreamlitShowOutputArrayInput
	// The stage in which streamlit files are located. For more information about this resource, see docs.
	Stage pulumi.StringPtrInput
	// Specifies a title for the Streamlit app to display in Snowsight.
	Title pulumi.StringPtrInput
}

func (StreamlitState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamlitState)(nil)).Elem()
}

type streamlitArgs struct {
	// Specifies a comment for the streamlit.
	Comment *string `pulumi:"comment"`
	// The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
	DirectoryLocation *string `pulumi:"directoryLocation"`
	// External access integrations connected to the Streamlit.
	ExternalAccessIntegrations []string `pulumi:"externalAccessIntegrations"`
	// Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directoryLocation`
	MainFile string `pulumi:"mainFile"`
	// String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
	QueryWarehouse *string `pulumi:"queryWarehouse"`
	// The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema string `pulumi:"schema"`
	// The stage in which streamlit files are located. For more information about this resource, see docs.
	Stage string `pulumi:"stage"`
	// Specifies a title for the Streamlit app to display in Snowsight.
	Title *string `pulumi:"title"`
}

// The set of arguments for constructing a Streamlit resource.
type StreamlitArgs struct {
	// Specifies a comment for the streamlit.
	Comment pulumi.StringPtrInput
	// The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
	DirectoryLocation pulumi.StringPtrInput
	// External access integrations connected to the Streamlit.
	ExternalAccessIntegrations pulumi.StringArrayInput
	// Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directoryLocation`
	MainFile pulumi.StringInput
	// String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
	QueryWarehouse pulumi.StringPtrInput
	// The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringInput
	// The stage in which streamlit files are located. For more information about this resource, see docs.
	Stage pulumi.StringInput
	// Specifies a title for the Streamlit app to display in Snowsight.
	Title pulumi.StringPtrInput
}

func (StreamlitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamlitArgs)(nil)).Elem()
}

type StreamlitInput interface {
	pulumi.Input

	ToStreamlitOutput() StreamlitOutput
	ToStreamlitOutputWithContext(ctx context.Context) StreamlitOutput
}

func (*Streamlit) ElementType() reflect.Type {
	return reflect.TypeOf((**Streamlit)(nil)).Elem()
}

func (i *Streamlit) ToStreamlitOutput() StreamlitOutput {
	return i.ToStreamlitOutputWithContext(context.Background())
}

func (i *Streamlit) ToStreamlitOutputWithContext(ctx context.Context) StreamlitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamlitOutput)
}

// StreamlitArrayInput is an input type that accepts StreamlitArray and StreamlitArrayOutput values.
// You can construct a concrete instance of `StreamlitArrayInput` via:
//
//	StreamlitArray{ StreamlitArgs{...} }
type StreamlitArrayInput interface {
	pulumi.Input

	ToStreamlitArrayOutput() StreamlitArrayOutput
	ToStreamlitArrayOutputWithContext(context.Context) StreamlitArrayOutput
}

type StreamlitArray []StreamlitInput

func (StreamlitArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Streamlit)(nil)).Elem()
}

func (i StreamlitArray) ToStreamlitArrayOutput() StreamlitArrayOutput {
	return i.ToStreamlitArrayOutputWithContext(context.Background())
}

func (i StreamlitArray) ToStreamlitArrayOutputWithContext(ctx context.Context) StreamlitArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamlitArrayOutput)
}

// StreamlitMapInput is an input type that accepts StreamlitMap and StreamlitMapOutput values.
// You can construct a concrete instance of `StreamlitMapInput` via:
//
//	StreamlitMap{ "key": StreamlitArgs{...} }
type StreamlitMapInput interface {
	pulumi.Input

	ToStreamlitMapOutput() StreamlitMapOutput
	ToStreamlitMapOutputWithContext(context.Context) StreamlitMapOutput
}

type StreamlitMap map[string]StreamlitInput

func (StreamlitMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Streamlit)(nil)).Elem()
}

func (i StreamlitMap) ToStreamlitMapOutput() StreamlitMapOutput {
	return i.ToStreamlitMapOutputWithContext(context.Background())
}

func (i StreamlitMap) ToStreamlitMapOutputWithContext(ctx context.Context) StreamlitMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamlitMapOutput)
}

type StreamlitOutput struct{ *pulumi.OutputState }

func (StreamlitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Streamlit)(nil)).Elem()
}

func (o StreamlitOutput) ToStreamlitOutput() StreamlitOutput {
	return o
}

func (o StreamlitOutput) ToStreamlitOutputWithContext(ctx context.Context) StreamlitOutput {
	return o
}

// Specifies a comment for the streamlit.
func (o StreamlitOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o StreamlitOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
func (o StreamlitOutput) DescribeOutputs() StreamlitDescribeOutputArrayOutput {
	return o.ApplyT(func(v *Streamlit) StreamlitDescribeOutputArrayOutput { return v.DescribeOutputs }).(StreamlitDescribeOutputArrayOutput)
}

// Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
func (o StreamlitOutput) DirectoryLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringPtrOutput { return v.DirectoryLocation }).(pulumi.StringPtrOutput)
}

// External access integrations connected to the Streamlit.
func (o StreamlitOutput) ExternalAccessIntegrations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringArrayOutput { return v.ExternalAccessIntegrations }).(pulumi.StringArrayOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o StreamlitOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directoryLocation`
func (o StreamlitOutput) MainFile() pulumi.StringOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringOutput { return v.MainFile }).(pulumi.StringOutput)
}

// String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o StreamlitOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
func (o StreamlitOutput) QueryWarehouse() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringPtrOutput { return v.QueryWarehouse }).(pulumi.StringPtrOutput)
}

// The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o StreamlitOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW STREAMLIT` for the given streamlit.
func (o StreamlitOutput) ShowOutputs() StreamlitShowOutputArrayOutput {
	return o.ApplyT(func(v *Streamlit) StreamlitShowOutputArrayOutput { return v.ShowOutputs }).(StreamlitShowOutputArrayOutput)
}

// The stage in which streamlit files are located. For more information about this resource, see docs.
func (o StreamlitOutput) Stage() pulumi.StringOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringOutput { return v.Stage }).(pulumi.StringOutput)
}

// Specifies a title for the Streamlit app to display in Snowsight.
func (o StreamlitOutput) Title() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Streamlit) pulumi.StringPtrOutput { return v.Title }).(pulumi.StringPtrOutput)
}

type StreamlitArrayOutput struct{ *pulumi.OutputState }

func (StreamlitArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Streamlit)(nil)).Elem()
}

func (o StreamlitArrayOutput) ToStreamlitArrayOutput() StreamlitArrayOutput {
	return o
}

func (o StreamlitArrayOutput) ToStreamlitArrayOutputWithContext(ctx context.Context) StreamlitArrayOutput {
	return o
}

func (o StreamlitArrayOutput) Index(i pulumi.IntInput) StreamlitOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Streamlit {
		return vs[0].([]*Streamlit)[vs[1].(int)]
	}).(StreamlitOutput)
}

type StreamlitMapOutput struct{ *pulumi.OutputState }

func (StreamlitMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Streamlit)(nil)).Elem()
}

func (o StreamlitMapOutput) ToStreamlitMapOutput() StreamlitMapOutput {
	return o
}

func (o StreamlitMapOutput) ToStreamlitMapOutputWithContext(ctx context.Context) StreamlitMapOutput {
	return o
}

func (o StreamlitMapOutput) MapIndex(k pulumi.StringInput) StreamlitOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Streamlit {
		return vs[0].(map[string]*Streamlit)[vs[1].(string)]
	}).(StreamlitOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamlitInput)(nil)).Elem(), &Streamlit{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamlitArrayInput)(nil)).Elem(), StreamlitArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamlitMapInput)(nil)).Elem(), StreamlitMap{})
	pulumi.RegisterOutputType(StreamlitOutput{})
	pulumi.RegisterOutputType(StreamlitArrayOutput{})
	pulumi.RegisterOutputType(StreamlitMapOutput{})
}
