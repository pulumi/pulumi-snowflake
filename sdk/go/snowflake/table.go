// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

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
// 		schema, err := snowflake.NewSchema(ctx, "schema", &snowflake.SchemaArgs{
// 			Database:          pulumi.String("database"),
// 			DataRetentionDays: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		sequence, err := snowflake.NewSequence(ctx, "sequence", &snowflake.SequenceArgs{
// 			Database: schema.Database,
// 			Schema:   schema.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = snowflake.NewTable(ctx, "table", &snowflake.TableArgs{
// 			Database: schema.Database,
// 			Schema:   schema.Name,
// 			Comment:  pulumi.String("A table."),
// 			ClusterBies: pulumi.StringArray{
// 				pulumi.String("to_date(DATE)"),
// 			},
// 			DataRetentionDays: schema.DataRetentionDays,
// 			ChangeTracking:    pulumi.Bool(false),
// 			Columns: TableColumnArray{
// 				&TableColumnArgs{
// 					Name:     pulumi.String("id"),
// 					Type:     pulumi.String("int"),
// 					Nullable: pulumi.Bool(true),
// 					Default: &TableColumnDefaultArgs{
// 						Sequence: sequence.FullyQualifiedName,
// 					},
// 				},
// 				&TableColumnArgs{
// 					Name:     pulumi.String("identity"),
// 					Type:     pulumi.String("NUMBER(38,0)"),
// 					Nullable: pulumi.Bool(true),
// 					Identity: &TableColumnIdentityArgs{
// 						StartNum: pulumi.Int(1),
// 						StepNum:  pulumi.Int(3),
// 					},
// 				},
// 				&TableColumnArgs{
// 					Name:     pulumi.String("data"),
// 					Type:     pulumi.String("text"),
// 					Nullable: pulumi.Bool(false),
// 				},
// 				&TableColumnArgs{
// 					Name: pulumi.String("DATE"),
// 					Type: pulumi.String("TIMESTAMP_NTZ(9)"),
// 				},
// 				&TableColumnArgs{
// 					Name:    pulumi.String("extra"),
// 					Type:    pulumi.String("VARIANT"),
// 					Comment: pulumi.String("extra data"),
// 				},
// 			},
// 			PrimaryKey: &TablePrimaryKeyArgs{
// 				Name: pulumi.String("my_key"),
// 				Keys: pulumi.StringArray{
// 					pulumi.String("data"),
// 				},
// 			},
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
// # format is database name | schema name | table name
//
// ```sh
//  $ pulumi import snowflake:index/table:Table example 'databaseName|schemaName|tableName'
// ```
type Table struct {
	pulumi.CustomResourceState

	// Specifies whether to enable change tracking on the table. Default false.
	ChangeTracking pulumi.BoolPtrOutput `pulumi:"changeTracking"`
	// A list of one or more table columns/expressions to be used as clustering key(s) for the table
	ClusterBies pulumi.StringArrayOutput `pulumi:"clusterBies"`
	// Definitions of a column to create in the table. Minimum one required.
	Columns TableColumnArrayOutput `pulumi:"columns"`
	// Specifies a comment for the table.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on
	// historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the
	// schema attribute to this argument.
	DataRetentionDays pulumi.IntPtrOutput `pulumi:"dataRetentionDays"`
	// The database in which to create the table.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Name of the role that owns the table.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Definitions of primary key constraint to create on table
	PrimaryKey TablePrimaryKeyPtrOutput `pulumi:"primaryKey"`
	// The schema in which to create the table.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Definitions of a tag to associate with the resource.
	Tags TableTagArrayOutput `pulumi:"tags"`
}

// NewTable registers a new resource with the given unique name, arguments, and options.
func NewTable(ctx *pulumi.Context,
	name string, args *TableArgs, opts ...pulumi.ResourceOption) (*Table, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Columns == nil {
		return nil, errors.New("invalid value for required argument 'Columns'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	var resource Table
	err := ctx.RegisterResource("snowflake:index/table:Table", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTable gets an existing Table resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableState, opts ...pulumi.ResourceOption) (*Table, error) {
	var resource Table
	err := ctx.ReadResource("snowflake:index/table:Table", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Table resources.
type tableState struct {
	// Specifies whether to enable change tracking on the table. Default false.
	ChangeTracking *bool `pulumi:"changeTracking"`
	// A list of one or more table columns/expressions to be used as clustering key(s) for the table
	ClusterBies []string `pulumi:"clusterBies"`
	// Definitions of a column to create in the table. Minimum one required.
	Columns []TableColumn `pulumi:"columns"`
	// Specifies a comment for the table.
	Comment *string `pulumi:"comment"`
	// Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on
	// historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the
	// schema attribute to this argument.
	DataRetentionDays *int `pulumi:"dataRetentionDays"`
	// The database in which to create the table.
	Database *string `pulumi:"database"`
	// Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
	Name *string `pulumi:"name"`
	// Name of the role that owns the table.
	Owner *string `pulumi:"owner"`
	// Definitions of primary key constraint to create on table
	PrimaryKey *TablePrimaryKey `pulumi:"primaryKey"`
	// The schema in which to create the table.
	Schema *string `pulumi:"schema"`
	// Definitions of a tag to associate with the resource.
	Tags []TableTag `pulumi:"tags"`
}

type TableState struct {
	// Specifies whether to enable change tracking on the table. Default false.
	ChangeTracking pulumi.BoolPtrInput
	// A list of one or more table columns/expressions to be used as clustering key(s) for the table
	ClusterBies pulumi.StringArrayInput
	// Definitions of a column to create in the table. Minimum one required.
	Columns TableColumnArrayInput
	// Specifies a comment for the table.
	Comment pulumi.StringPtrInput
	// Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on
	// historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the
	// schema attribute to this argument.
	DataRetentionDays pulumi.IntPtrInput
	// The database in which to create the table.
	Database pulumi.StringPtrInput
	// Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
	Name pulumi.StringPtrInput
	// Name of the role that owns the table.
	Owner pulumi.StringPtrInput
	// Definitions of primary key constraint to create on table
	PrimaryKey TablePrimaryKeyPtrInput
	// The schema in which to create the table.
	Schema pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	Tags TableTagArrayInput
}

func (TableState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableState)(nil)).Elem()
}

type tableArgs struct {
	// Specifies whether to enable change tracking on the table. Default false.
	ChangeTracking *bool `pulumi:"changeTracking"`
	// A list of one or more table columns/expressions to be used as clustering key(s) for the table
	ClusterBies []string `pulumi:"clusterBies"`
	// Definitions of a column to create in the table. Minimum one required.
	Columns []TableColumn `pulumi:"columns"`
	// Specifies a comment for the table.
	Comment *string `pulumi:"comment"`
	// Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on
	// historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the
	// schema attribute to this argument.
	DataRetentionDays *int `pulumi:"dataRetentionDays"`
	// The database in which to create the table.
	Database string `pulumi:"database"`
	// Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
	Name *string `pulumi:"name"`
	// Definitions of primary key constraint to create on table
	PrimaryKey *TablePrimaryKey `pulumi:"primaryKey"`
	// The schema in which to create the table.
	Schema string `pulumi:"schema"`
	// Definitions of a tag to associate with the resource.
	Tags []TableTag `pulumi:"tags"`
}

// The set of arguments for constructing a Table resource.
type TableArgs struct {
	// Specifies whether to enable change tracking on the table. Default false.
	ChangeTracking pulumi.BoolPtrInput
	// A list of one or more table columns/expressions to be used as clustering key(s) for the table
	ClusterBies pulumi.StringArrayInput
	// Definitions of a column to create in the table. Minimum one required.
	Columns TableColumnArrayInput
	// Specifies a comment for the table.
	Comment pulumi.StringPtrInput
	// Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on
	// historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the
	// schema attribute to this argument.
	DataRetentionDays pulumi.IntPtrInput
	// The database in which to create the table.
	Database pulumi.StringInput
	// Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
	Name pulumi.StringPtrInput
	// Definitions of primary key constraint to create on table
	PrimaryKey TablePrimaryKeyPtrInput
	// The schema in which to create the table.
	Schema pulumi.StringInput
	// Definitions of a tag to associate with the resource.
	Tags TableTagArrayInput
}

func (TableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableArgs)(nil)).Elem()
}

type TableInput interface {
	pulumi.Input

	ToTableOutput() TableOutput
	ToTableOutputWithContext(ctx context.Context) TableOutput
}

func (*Table) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (i *Table) ToTableOutput() TableOutput {
	return i.ToTableOutputWithContext(context.Background())
}

func (i *Table) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableOutput)
}

// TableArrayInput is an input type that accepts TableArray and TableArrayOutput values.
// You can construct a concrete instance of `TableArrayInput` via:
//
//          TableArray{ TableArgs{...} }
type TableArrayInput interface {
	pulumi.Input

	ToTableArrayOutput() TableArrayOutput
	ToTableArrayOutputWithContext(context.Context) TableArrayOutput
}

type TableArray []TableInput

func (TableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (i TableArray) ToTableArrayOutput() TableArrayOutput {
	return i.ToTableArrayOutputWithContext(context.Background())
}

func (i TableArray) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableArrayOutput)
}

// TableMapInput is an input type that accepts TableMap and TableMapOutput values.
// You can construct a concrete instance of `TableMapInput` via:
//
//          TableMap{ "key": TableArgs{...} }
type TableMapInput interface {
	pulumi.Input

	ToTableMapOutput() TableMapOutput
	ToTableMapOutputWithContext(context.Context) TableMapOutput
}

type TableMap map[string]TableInput

func (TableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (i TableMap) ToTableMapOutput() TableMapOutput {
	return i.ToTableMapOutputWithContext(context.Background())
}

func (i TableMap) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableMapOutput)
}

type TableOutput struct{ *pulumi.OutputState }

func (TableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (o TableOutput) ToTableOutput() TableOutput {
	return o
}

func (o TableOutput) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return o
}

// Specifies whether to enable change tracking on the table. Default false.
func (o TableOutput) ChangeTracking() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.BoolPtrOutput { return v.ChangeTracking }).(pulumi.BoolPtrOutput)
}

// A list of one or more table columns/expressions to be used as clustering key(s) for the table
func (o TableOutput) ClusterBies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Table) pulumi.StringArrayOutput { return v.ClusterBies }).(pulumi.StringArrayOutput)
}

// Definitions of a column to create in the table. Minimum one required.
func (o TableOutput) Columns() TableColumnArrayOutput {
	return o.ApplyT(func(v *Table) TableColumnArrayOutput { return v.Columns }).(TableColumnArrayOutput)
}

// Specifies a comment for the table.
func (o TableOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on
// historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the
// schema attribute to this argument.
func (o TableOutput) DataRetentionDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.IntPtrOutput { return v.DataRetentionDays }).(pulumi.IntPtrOutput)
}

// The database in which to create the table.
func (o TableOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
func (o TableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Name of the role that owns the table.
func (o TableOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Definitions of primary key constraint to create on table
func (o TableOutput) PrimaryKey() TablePrimaryKeyPtrOutput {
	return o.ApplyT(func(v *Table) TablePrimaryKeyPtrOutput { return v.PrimaryKey }).(TablePrimaryKeyPtrOutput)
}

// The schema in which to create the table.
func (o TableOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Definitions of a tag to associate with the resource.
func (o TableOutput) Tags() TableTagArrayOutput {
	return o.ApplyT(func(v *Table) TableTagArrayOutput { return v.Tags }).(TableTagArrayOutput)
}

type TableArrayOutput struct{ *pulumi.OutputState }

func (TableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (o TableArrayOutput) ToTableArrayOutput() TableArrayOutput {
	return o
}

func (o TableArrayOutput) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return o
}

func (o TableArrayOutput) Index(i pulumi.IntInput) TableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Table {
		return vs[0].([]*Table)[vs[1].(int)]
	}).(TableOutput)
}

type TableMapOutput struct{ *pulumi.OutputState }

func (TableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (o TableMapOutput) ToTableMapOutput() TableMapOutput {
	return o
}

func (o TableMapOutput) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return o
}

func (o TableMapOutput) MapIndex(k pulumi.StringInput) TableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Table {
		return vs[0].(map[string]*Table)[vs[1].(string)]
	}).(TableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableInput)(nil)).Elem(), &Table{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableArrayInput)(nil)).Elem(), TableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableMapInput)(nil)).Elem(), TableMap{})
	pulumi.RegisterOutputType(TableOutput{})
	pulumi.RegisterOutputType(TableArrayOutput{})
	pulumi.RegisterOutputType(TableMapOutput{})
}
