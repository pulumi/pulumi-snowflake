// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := snowflake.NewExternalTable(ctx, "externalTable", &snowflake.ExternalTableArgs{
// 			Columns: ExternalTableColumnArray{
// 				&ExternalTableColumnArgs{
// 					Name: pulumi.String("id"),
// 					Type: pulumi.String("int"),
// 				},
// 				&ExternalTableColumnArgs{
// 					Name: pulumi.String("data"),
// 					Type: pulumi.String("text"),
// 				},
// 			},
// 			Comment:  pulumi.String("External table"),
// 			Database: pulumi.String("db"),
// 			Schema:   pulumi.String("schema"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// # format is database name | schema name | external table name
//
// ```sh
//  $ pulumi import snowflake:index/externalTable:ExternalTable example 'dbName|schemaName|externalTableName'
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
	return reflect.TypeOf((*ExternalTable)(nil))
}

func (i *ExternalTable) ToExternalTableOutput() ExternalTableOutput {
	return i.ToExternalTableOutputWithContext(context.Background())
}

func (i *ExternalTable) ToExternalTableOutputWithContext(ctx context.Context) ExternalTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalTableOutput)
}

func (i *ExternalTable) ToExternalTablePtrOutput() ExternalTablePtrOutput {
	return i.ToExternalTablePtrOutputWithContext(context.Background())
}

func (i *ExternalTable) ToExternalTablePtrOutputWithContext(ctx context.Context) ExternalTablePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalTablePtrOutput)
}

type ExternalTablePtrInput interface {
	pulumi.Input

	ToExternalTablePtrOutput() ExternalTablePtrOutput
	ToExternalTablePtrOutputWithContext(ctx context.Context) ExternalTablePtrOutput
}

type externalTablePtrType ExternalTableArgs

func (*externalTablePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalTable)(nil))
}

func (i *externalTablePtrType) ToExternalTablePtrOutput() ExternalTablePtrOutput {
	return i.ToExternalTablePtrOutputWithContext(context.Background())
}

func (i *externalTablePtrType) ToExternalTablePtrOutputWithContext(ctx context.Context) ExternalTablePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalTablePtrOutput)
}

// ExternalTableArrayInput is an input type that accepts ExternalTableArray and ExternalTableArrayOutput values.
// You can construct a concrete instance of `ExternalTableArrayInput` via:
//
//          ExternalTableArray{ ExternalTableArgs{...} }
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
//          ExternalTableMap{ "key": ExternalTableArgs{...} }
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
	return reflect.TypeOf((*ExternalTable)(nil))
}

func (o ExternalTableOutput) ToExternalTableOutput() ExternalTableOutput {
	return o
}

func (o ExternalTableOutput) ToExternalTableOutputWithContext(ctx context.Context) ExternalTableOutput {
	return o
}

func (o ExternalTableOutput) ToExternalTablePtrOutput() ExternalTablePtrOutput {
	return o.ToExternalTablePtrOutputWithContext(context.Background())
}

func (o ExternalTableOutput) ToExternalTablePtrOutputWithContext(ctx context.Context) ExternalTablePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ExternalTable) *ExternalTable {
		return &v
	}).(ExternalTablePtrOutput)
}

type ExternalTablePtrOutput struct{ *pulumi.OutputState }

func (ExternalTablePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalTable)(nil))
}

func (o ExternalTablePtrOutput) ToExternalTablePtrOutput() ExternalTablePtrOutput {
	return o
}

func (o ExternalTablePtrOutput) ToExternalTablePtrOutputWithContext(ctx context.Context) ExternalTablePtrOutput {
	return o
}

func (o ExternalTablePtrOutput) Elem() ExternalTableOutput {
	return o.ApplyT(func(v *ExternalTable) ExternalTable {
		if v != nil {
			return *v
		}
		var ret ExternalTable
		return ret
	}).(ExternalTableOutput)
}

type ExternalTableArrayOutput struct{ *pulumi.OutputState }

func (ExternalTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExternalTable)(nil))
}

func (o ExternalTableArrayOutput) ToExternalTableArrayOutput() ExternalTableArrayOutput {
	return o
}

func (o ExternalTableArrayOutput) ToExternalTableArrayOutputWithContext(ctx context.Context) ExternalTableArrayOutput {
	return o
}

func (o ExternalTableArrayOutput) Index(i pulumi.IntInput) ExternalTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ExternalTable {
		return vs[0].([]ExternalTable)[vs[1].(int)]
	}).(ExternalTableOutput)
}

type ExternalTableMapOutput struct{ *pulumi.OutputState }

func (ExternalTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ExternalTable)(nil))
}

func (o ExternalTableMapOutput) ToExternalTableMapOutput() ExternalTableMapOutput {
	return o
}

func (o ExternalTableMapOutput) ToExternalTableMapOutputWithContext(ctx context.Context) ExternalTableMapOutput {
	return o
}

func (o ExternalTableMapOutput) MapIndex(k pulumi.StringInput) ExternalTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ExternalTable {
		return vs[0].(map[string]ExternalTable)[vs[1].(string)]
	}).(ExternalTableOutput)
}

func init() {
	pulumi.RegisterOutputType(ExternalTableOutput{})
	pulumi.RegisterOutputType(ExternalTablePtrOutput{})
	pulumi.RegisterOutputType(ExternalTableArrayOutput{})
	pulumi.RegisterOutputType(ExternalTableMapOutput{})
}
