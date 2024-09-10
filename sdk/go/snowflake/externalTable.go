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
// format is database name | schema name | external table name
//
// ```sh
// $ pulumi import snowflake:index/externalTable:ExternalTable example 'dbName|schemaName|externalTableName'
// ```
type ExternalTable struct {
	pulumi.CustomResourceState

	// Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
	AutoRefresh pulumi.BoolPtrOutput `pulumi:"autoRefresh"`
	// Specifies the aws sns topic for the external table.
	AwsSnsTopic pulumi.StringPtrOutput `pulumi:"awsSnsTopic"`
	// Definitions of a column to create in the external table. Minimum one required.
	Columns ExternalTableColumnArrayOutput `pulumi:"columns"`
	// Specifies a comment for the external table.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
	CopyGrants pulumi.BoolPtrOutput `pulumi:"copyGrants"`
	// The database in which to create the external table.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies the file format for the external table.
	FileFormat pulumi.StringOutput `pulumi:"fileFormat"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies a location for the external table.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Name of the role that owns the external table.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Specifies any partition columns to evaluate for the external table.
	PartitionBies pulumi.StringArrayOutput `pulumi:"partitionBies"`
	// Specifies the file names and/or paths on the external stage to match.
	Pattern pulumi.StringPtrOutput `pulumi:"pattern"`
	// Specifies weather to refresh when an external table is created.
	RefreshOnCreate pulumi.BoolPtrOutput `pulumi:"refreshOnCreate"`
	// The schema in which to create the external table.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Identifies the external table table type. For now, only "delta" for Delta Lake table format is supported.
	TableFormat pulumi.StringPtrOutput `pulumi:"tableFormat"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags ExternalTableTagArrayOutput `pulumi:"tags"`
}

// NewExternalTable registers a new resource with the given unique name, arguments, and options.
func NewExternalTable(ctx *pulumi.Context,
	name string, args *ExternalTableArgs, opts ...pulumi.ResourceOption) (*ExternalTable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Columns == nil {
		return nil, errors.New("invalid value for required argument 'Columns'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.FileFormat == nil {
		return nil, errors.New("invalid value for required argument 'FileFormat'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ExternalTable
	err := ctx.RegisterResource("snowflake:index/externalTable:ExternalTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExternalTable gets an existing ExternalTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExternalTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExternalTableState, opts ...pulumi.ResourceOption) (*ExternalTable, error) {
	var resource ExternalTable
	err := ctx.ReadResource("snowflake:index/externalTable:ExternalTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExternalTable resources.
type externalTableState struct {
	// Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
	AutoRefresh *bool `pulumi:"autoRefresh"`
	// Specifies the aws sns topic for the external table.
	AwsSnsTopic *string `pulumi:"awsSnsTopic"`
	// Definitions of a column to create in the external table. Minimum one required.
	Columns []ExternalTableColumn `pulumi:"columns"`
	// Specifies a comment for the external table.
	Comment *string `pulumi:"comment"`
	// Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
	CopyGrants *bool `pulumi:"copyGrants"`
	// The database in which to create the external table.
	Database *string `pulumi:"database"`
	// Specifies the file format for the external table.
	FileFormat *string `pulumi:"fileFormat"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies a location for the external table.
	Location *string `pulumi:"location"`
	// Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
	Name *string `pulumi:"name"`
	// Name of the role that owns the external table.
	Owner *string `pulumi:"owner"`
	// Specifies any partition columns to evaluate for the external table.
	PartitionBies []string `pulumi:"partitionBies"`
	// Specifies the file names and/or paths on the external stage to match.
	Pattern *string `pulumi:"pattern"`
	// Specifies weather to refresh when an external table is created.
	RefreshOnCreate *bool `pulumi:"refreshOnCreate"`
	// The schema in which to create the external table.
	Schema *string `pulumi:"schema"`
	// Identifies the external table table type. For now, only "delta" for Delta Lake table format is supported.
	TableFormat *string `pulumi:"tableFormat"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []ExternalTableTag `pulumi:"tags"`
}

type ExternalTableState struct {
	// Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
	AutoRefresh pulumi.BoolPtrInput
	// Specifies the aws sns topic for the external table.
	AwsSnsTopic pulumi.StringPtrInput
	// Definitions of a column to create in the external table. Minimum one required.
	Columns ExternalTableColumnArrayInput
	// Specifies a comment for the external table.
	Comment pulumi.StringPtrInput
	// Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
	CopyGrants pulumi.BoolPtrInput
	// The database in which to create the external table.
	Database pulumi.StringPtrInput
	// Specifies the file format for the external table.
	FileFormat pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies a location for the external table.
	Location pulumi.StringPtrInput
	// Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
	Name pulumi.StringPtrInput
	// Name of the role that owns the external table.
	Owner pulumi.StringPtrInput
	// Specifies any partition columns to evaluate for the external table.
	PartitionBies pulumi.StringArrayInput
	// Specifies the file names and/or paths on the external stage to match.
	Pattern pulumi.StringPtrInput
	// Specifies weather to refresh when an external table is created.
	RefreshOnCreate pulumi.BoolPtrInput
	// The schema in which to create the external table.
	Schema pulumi.StringPtrInput
	// Identifies the external table table type. For now, only "delta" for Delta Lake table format is supported.
	TableFormat pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags ExternalTableTagArrayInput
}

func (ExternalTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*externalTableState)(nil)).Elem()
}

type externalTableArgs struct {
	// Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
	AutoRefresh *bool `pulumi:"autoRefresh"`
	// Specifies the aws sns topic for the external table.
	AwsSnsTopic *string `pulumi:"awsSnsTopic"`
	// Definitions of a column to create in the external table. Minimum one required.
	Columns []ExternalTableColumn `pulumi:"columns"`
	// Specifies a comment for the external table.
	Comment *string `pulumi:"comment"`
	// Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
	CopyGrants *bool `pulumi:"copyGrants"`
	// The database in which to create the external table.
	Database string `pulumi:"database"`
	// Specifies the file format for the external table.
	FileFormat string `pulumi:"fileFormat"`
	// Specifies a location for the external table.
	Location string `pulumi:"location"`
	// Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
	Name *string `pulumi:"name"`
	// Specifies any partition columns to evaluate for the external table.
	PartitionBies []string `pulumi:"partitionBies"`
	// Specifies the file names and/or paths on the external stage to match.
	Pattern *string `pulumi:"pattern"`
	// Specifies weather to refresh when an external table is created.
	RefreshOnCreate *bool `pulumi:"refreshOnCreate"`
	// The schema in which to create the external table.
	Schema string `pulumi:"schema"`
	// Identifies the external table table type. For now, only "delta" for Delta Lake table format is supported.
	TableFormat *string `pulumi:"tableFormat"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []ExternalTableTag `pulumi:"tags"`
}

// The set of arguments for constructing a ExternalTable resource.
type ExternalTableArgs struct {
	// Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
	AutoRefresh pulumi.BoolPtrInput
	// Specifies the aws sns topic for the external table.
	AwsSnsTopic pulumi.StringPtrInput
	// Definitions of a column to create in the external table. Minimum one required.
	Columns ExternalTableColumnArrayInput
	// Specifies a comment for the external table.
	Comment pulumi.StringPtrInput
	// Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
	CopyGrants pulumi.BoolPtrInput
	// The database in which to create the external table.
	Database pulumi.StringInput
	// Specifies the file format for the external table.
	FileFormat pulumi.StringInput
	// Specifies a location for the external table.
	Location pulumi.StringInput
	// Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
	Name pulumi.StringPtrInput
	// Specifies any partition columns to evaluate for the external table.
	PartitionBies pulumi.StringArrayInput
	// Specifies the file names and/or paths on the external stage to match.
	Pattern pulumi.StringPtrInput
	// Specifies weather to refresh when an external table is created.
	RefreshOnCreate pulumi.BoolPtrInput
	// The schema in which to create the external table.
	Schema pulumi.StringInput
	// Identifies the external table table type. For now, only "delta" for Delta Lake table format is supported.
	TableFormat pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags ExternalTableTagArrayInput
}

func (ExternalTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*externalTableArgs)(nil)).Elem()
}

type ExternalTableInput interface {
	pulumi.Input

	ToExternalTableOutput() ExternalTableOutput
	ToExternalTableOutputWithContext(ctx context.Context) ExternalTableOutput
}

func (*ExternalTable) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalTable)(nil)).Elem()
}

func (i *ExternalTable) ToExternalTableOutput() ExternalTableOutput {
	return i.ToExternalTableOutputWithContext(context.Background())
}

func (i *ExternalTable) ToExternalTableOutputWithContext(ctx context.Context) ExternalTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalTableOutput)
}

// ExternalTableArrayInput is an input type that accepts ExternalTableArray and ExternalTableArrayOutput values.
// You can construct a concrete instance of `ExternalTableArrayInput` via:
//
//	ExternalTableArray{ ExternalTableArgs{...} }
type ExternalTableArrayInput interface {
	pulumi.Input

	ToExternalTableArrayOutput() ExternalTableArrayOutput
	ToExternalTableArrayOutputWithContext(context.Context) ExternalTableArrayOutput
}

type ExternalTableArray []ExternalTableInput

func (ExternalTableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalTable)(nil)).Elem()
}

func (i ExternalTableArray) ToExternalTableArrayOutput() ExternalTableArrayOutput {
	return i.ToExternalTableArrayOutputWithContext(context.Background())
}

func (i ExternalTableArray) ToExternalTableArrayOutputWithContext(ctx context.Context) ExternalTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalTableArrayOutput)
}

// ExternalTableMapInput is an input type that accepts ExternalTableMap and ExternalTableMapOutput values.
// You can construct a concrete instance of `ExternalTableMapInput` via:
//
//	ExternalTableMap{ "key": ExternalTableArgs{...} }
type ExternalTableMapInput interface {
	pulumi.Input

	ToExternalTableMapOutput() ExternalTableMapOutput
	ToExternalTableMapOutputWithContext(context.Context) ExternalTableMapOutput
}

type ExternalTableMap map[string]ExternalTableInput

func (ExternalTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalTable)(nil)).Elem()
}

func (i ExternalTableMap) ToExternalTableMapOutput() ExternalTableMapOutput {
	return i.ToExternalTableMapOutputWithContext(context.Background())
}

func (i ExternalTableMap) ToExternalTableMapOutputWithContext(ctx context.Context) ExternalTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalTableMapOutput)
}

type ExternalTableOutput struct{ *pulumi.OutputState }

func (ExternalTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalTable)(nil)).Elem()
}

func (o ExternalTableOutput) ToExternalTableOutput() ExternalTableOutput {
	return o
}

func (o ExternalTableOutput) ToExternalTableOutputWithContext(ctx context.Context) ExternalTableOutput {
	return o
}

// Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
func (o ExternalTableOutput) AutoRefresh() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.BoolPtrOutput { return v.AutoRefresh }).(pulumi.BoolPtrOutput)
}

// Specifies the aws sns topic for the external table.
func (o ExternalTableOutput) AwsSnsTopic() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringPtrOutput { return v.AwsSnsTopic }).(pulumi.StringPtrOutput)
}

// Definitions of a column to create in the external table. Minimum one required.
func (o ExternalTableOutput) Columns() ExternalTableColumnArrayOutput {
	return o.ApplyT(func(v *ExternalTable) ExternalTableColumnArrayOutput { return v.Columns }).(ExternalTableColumnArrayOutput)
}

// Specifies a comment for the external table.
func (o ExternalTableOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
func (o ExternalTableOutput) CopyGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.BoolPtrOutput { return v.CopyGrants }).(pulumi.BoolPtrOutput)
}

// The database in which to create the external table.
func (o ExternalTableOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies the file format for the external table.
func (o ExternalTableOutput) FileFormat() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.FileFormat }).(pulumi.StringOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o ExternalTableOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies a location for the external table.
func (o ExternalTableOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
func (o ExternalTableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Name of the role that owns the external table.
func (o ExternalTableOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Specifies any partition columns to evaluate for the external table.
func (o ExternalTableOutput) PartitionBies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringArrayOutput { return v.PartitionBies }).(pulumi.StringArrayOutput)
}

// Specifies the file names and/or paths on the external stage to match.
func (o ExternalTableOutput) Pattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringPtrOutput { return v.Pattern }).(pulumi.StringPtrOutput)
}

// Specifies weather to refresh when an external table is created.
func (o ExternalTableOutput) RefreshOnCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.BoolPtrOutput { return v.RefreshOnCreate }).(pulumi.BoolPtrOutput)
}

// The schema in which to create the external table.
func (o ExternalTableOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Identifies the external table table type. For now, only "delta" for Delta Lake table format is supported.
func (o ExternalTableOutput) TableFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalTable) pulumi.StringPtrOutput { return v.TableFormat }).(pulumi.StringPtrOutput)
}

// Definitions of a tag to associate with the resource.
//
// Deprecated: Use the 'snowflake_tag_association' resource instead.
func (o ExternalTableOutput) Tags() ExternalTableTagArrayOutput {
	return o.ApplyT(func(v *ExternalTable) ExternalTableTagArrayOutput { return v.Tags }).(ExternalTableTagArrayOutput)
}

type ExternalTableArrayOutput struct{ *pulumi.OutputState }

func (ExternalTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalTable)(nil)).Elem()
}

func (o ExternalTableArrayOutput) ToExternalTableArrayOutput() ExternalTableArrayOutput {
	return o
}

func (o ExternalTableArrayOutput) ToExternalTableArrayOutputWithContext(ctx context.Context) ExternalTableArrayOutput {
	return o
}

func (o ExternalTableArrayOutput) Index(i pulumi.IntInput) ExternalTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExternalTable {
		return vs[0].([]*ExternalTable)[vs[1].(int)]
	}).(ExternalTableOutput)
}

type ExternalTableMapOutput struct{ *pulumi.OutputState }

func (ExternalTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalTable)(nil)).Elem()
}

func (o ExternalTableMapOutput) ToExternalTableMapOutput() ExternalTableMapOutput {
	return o
}

func (o ExternalTableMapOutput) ToExternalTableMapOutputWithContext(ctx context.Context) ExternalTableMapOutput {
	return o
}

func (o ExternalTableMapOutput) MapIndex(k pulumi.StringInput) ExternalTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExternalTable {
		return vs[0].(map[string]*ExternalTable)[vs[1].(string)]
	}).(ExternalTableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalTableInput)(nil)).Elem(), &ExternalTable{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalTableArrayInput)(nil)).Elem(), ExternalTableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalTableMapInput)(nil)).Elem(), ExternalTableMap{})
	pulumi.RegisterOutputType(ExternalTableOutput{})
	pulumi.RegisterOutputType(ExternalTableArrayOutput{})
	pulumi.RegisterOutputType(ExternalTableMapOutput{})
}
