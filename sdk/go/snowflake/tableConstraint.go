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
// $ pulumi import snowflake:index/tableConstraint:TableConstraint example 'myconstraintfk❄️FOREIGN KEY❄️databaseName|schemaName|tableName'
// ```
type TableConstraint struct {
	pulumi.CustomResourceState

	// Columns to use in constraint key
	Columns pulumi.StringArrayOutput `pulumi:"columns"`
	// Comment for the table constraint
	//
	// Deprecated: Not used. Will be removed.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// (Default: `true`) Whether the constraint is deferrable
	Deferrable pulumi.BoolPtrOutput `pulumi:"deferrable"`
	// (Default: `true`) Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
	Enable pulumi.BoolPtrOutput `pulumi:"enable"`
	// (Default: `false`) Whether the constraint is enforced
	Enforced pulumi.BoolPtrOutput `pulumi:"enforced"`
	// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
	ForeignKeyProperties TableConstraintForeignKeyPropertiesPtrOutput `pulumi:"foreignKeyProperties"`
	// (Default: `DEFERRED`) Whether the constraint is initially deferred or immediate
	Initially pulumi.StringPtrOutput `pulumi:"initially"`
	// Name of constraint
	Name pulumi.StringOutput `pulumi:"name"`
	// (Default: `true`) Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
	Rely pulumi.BoolPtrOutput `pulumi:"rely"`
	// Identifier for table to create constraint on. Format must follow: "\"&lt;db*name&gt;\".\"&lt;schema*name&gt;\".\"&lt;table*name&gt;\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
	TableId pulumi.StringOutput `pulumi:"tableId"`
	// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
	Type pulumi.StringOutput `pulumi:"type"`
	// (Default: `false`) Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
	Validate pulumi.BoolPtrOutput `pulumi:"validate"`
}

// NewTableConstraint registers a new resource with the given unique name, arguments, and options.
func NewTableConstraint(ctx *pulumi.Context,
	name string, args *TableConstraintArgs, opts ...pulumi.ResourceOption) (*TableConstraint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Columns == nil {
		return nil, errors.New("invalid value for required argument 'Columns'")
	}
	if args.TableId == nil {
		return nil, errors.New("invalid value for required argument 'TableId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TableConstraint
	err := ctx.RegisterResource("snowflake:index/tableConstraint:TableConstraint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTableConstraint gets an existing TableConstraint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTableConstraint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableConstraintState, opts ...pulumi.ResourceOption) (*TableConstraint, error) {
	var resource TableConstraint
	err := ctx.ReadResource("snowflake:index/tableConstraint:TableConstraint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TableConstraint resources.
type tableConstraintState struct {
	// Columns to use in constraint key
	Columns []string `pulumi:"columns"`
	// Comment for the table constraint
	//
	// Deprecated: Not used. Will be removed.
	Comment *string `pulumi:"comment"`
	// (Default: `true`) Whether the constraint is deferrable
	Deferrable *bool `pulumi:"deferrable"`
	// (Default: `true`) Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
	Enable *bool `pulumi:"enable"`
	// (Default: `false`) Whether the constraint is enforced
	Enforced *bool `pulumi:"enforced"`
	// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
	ForeignKeyProperties *TableConstraintForeignKeyProperties `pulumi:"foreignKeyProperties"`
	// (Default: `DEFERRED`) Whether the constraint is initially deferred or immediate
	Initially *string `pulumi:"initially"`
	// Name of constraint
	Name *string `pulumi:"name"`
	// (Default: `true`) Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
	Rely *bool `pulumi:"rely"`
	// Identifier for table to create constraint on. Format must follow: "\"&lt;db*name&gt;\".\"&lt;schema*name&gt;\".\"&lt;table*name&gt;\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
	TableId *string `pulumi:"tableId"`
	// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
	Type *string `pulumi:"type"`
	// (Default: `false`) Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
	Validate *bool `pulumi:"validate"`
}

type TableConstraintState struct {
	// Columns to use in constraint key
	Columns pulumi.StringArrayInput
	// Comment for the table constraint
	//
	// Deprecated: Not used. Will be removed.
	Comment pulumi.StringPtrInput
	// (Default: `true`) Whether the constraint is deferrable
	Deferrable pulumi.BoolPtrInput
	// (Default: `true`) Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
	Enable pulumi.BoolPtrInput
	// (Default: `false`) Whether the constraint is enforced
	Enforced pulumi.BoolPtrInput
	// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
	ForeignKeyProperties TableConstraintForeignKeyPropertiesPtrInput
	// (Default: `DEFERRED`) Whether the constraint is initially deferred or immediate
	Initially pulumi.StringPtrInput
	// Name of constraint
	Name pulumi.StringPtrInput
	// (Default: `true`) Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
	Rely pulumi.BoolPtrInput
	// Identifier for table to create constraint on. Format must follow: "\"&lt;db*name&gt;\".\"&lt;schema*name&gt;\".\"&lt;table*name&gt;\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
	TableId pulumi.StringPtrInput
	// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
	Type pulumi.StringPtrInput
	// (Default: `false`) Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
	Validate pulumi.BoolPtrInput
}

func (TableConstraintState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableConstraintState)(nil)).Elem()
}

type tableConstraintArgs struct {
	// Columns to use in constraint key
	Columns []string `pulumi:"columns"`
	// Comment for the table constraint
	//
	// Deprecated: Not used. Will be removed.
	Comment *string `pulumi:"comment"`
	// (Default: `true`) Whether the constraint is deferrable
	Deferrable *bool `pulumi:"deferrable"`
	// (Default: `true`) Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
	Enable *bool `pulumi:"enable"`
	// (Default: `false`) Whether the constraint is enforced
	Enforced *bool `pulumi:"enforced"`
	// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
	ForeignKeyProperties *TableConstraintForeignKeyProperties `pulumi:"foreignKeyProperties"`
	// (Default: `DEFERRED`) Whether the constraint is initially deferred or immediate
	Initially *string `pulumi:"initially"`
	// Name of constraint
	Name *string `pulumi:"name"`
	// (Default: `true`) Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
	Rely *bool `pulumi:"rely"`
	// Identifier for table to create constraint on. Format must follow: "\"&lt;db*name&gt;\".\"&lt;schema*name&gt;\".\"&lt;table*name&gt;\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
	TableId string `pulumi:"tableId"`
	// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
	Type string `pulumi:"type"`
	// (Default: `false`) Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
	Validate *bool `pulumi:"validate"`
}

// The set of arguments for constructing a TableConstraint resource.
type TableConstraintArgs struct {
	// Columns to use in constraint key
	Columns pulumi.StringArrayInput
	// Comment for the table constraint
	//
	// Deprecated: Not used. Will be removed.
	Comment pulumi.StringPtrInput
	// (Default: `true`) Whether the constraint is deferrable
	Deferrable pulumi.BoolPtrInput
	// (Default: `true`) Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
	Enable pulumi.BoolPtrInput
	// (Default: `false`) Whether the constraint is enforced
	Enforced pulumi.BoolPtrInput
	// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
	ForeignKeyProperties TableConstraintForeignKeyPropertiesPtrInput
	// (Default: `DEFERRED`) Whether the constraint is initially deferred or immediate
	Initially pulumi.StringPtrInput
	// Name of constraint
	Name pulumi.StringPtrInput
	// (Default: `true`) Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
	Rely pulumi.BoolPtrInput
	// Identifier for table to create constraint on. Format must follow: "\"&lt;db*name&gt;\".\"&lt;schema*name&gt;\".\"&lt;table*name&gt;\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
	TableId pulumi.StringInput
	// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
	Type pulumi.StringInput
	// (Default: `false`) Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
	Validate pulumi.BoolPtrInput
}

func (TableConstraintArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableConstraintArgs)(nil)).Elem()
}

type TableConstraintInput interface {
	pulumi.Input

	ToTableConstraintOutput() TableConstraintOutput
	ToTableConstraintOutputWithContext(ctx context.Context) TableConstraintOutput
}

func (*TableConstraint) ElementType() reflect.Type {
	return reflect.TypeOf((**TableConstraint)(nil)).Elem()
}

func (i *TableConstraint) ToTableConstraintOutput() TableConstraintOutput {
	return i.ToTableConstraintOutputWithContext(context.Background())
}

func (i *TableConstraint) ToTableConstraintOutputWithContext(ctx context.Context) TableConstraintOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableConstraintOutput)
}

// TableConstraintArrayInput is an input type that accepts TableConstraintArray and TableConstraintArrayOutput values.
// You can construct a concrete instance of `TableConstraintArrayInput` via:
//
//	TableConstraintArray{ TableConstraintArgs{...} }
type TableConstraintArrayInput interface {
	pulumi.Input

	ToTableConstraintArrayOutput() TableConstraintArrayOutput
	ToTableConstraintArrayOutputWithContext(context.Context) TableConstraintArrayOutput
}

type TableConstraintArray []TableConstraintInput

func (TableConstraintArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableConstraint)(nil)).Elem()
}

func (i TableConstraintArray) ToTableConstraintArrayOutput() TableConstraintArrayOutput {
	return i.ToTableConstraintArrayOutputWithContext(context.Background())
}

func (i TableConstraintArray) ToTableConstraintArrayOutputWithContext(ctx context.Context) TableConstraintArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableConstraintArrayOutput)
}

// TableConstraintMapInput is an input type that accepts TableConstraintMap and TableConstraintMapOutput values.
// You can construct a concrete instance of `TableConstraintMapInput` via:
//
//	TableConstraintMap{ "key": TableConstraintArgs{...} }
type TableConstraintMapInput interface {
	pulumi.Input

	ToTableConstraintMapOutput() TableConstraintMapOutput
	ToTableConstraintMapOutputWithContext(context.Context) TableConstraintMapOutput
}

type TableConstraintMap map[string]TableConstraintInput

func (TableConstraintMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableConstraint)(nil)).Elem()
}

func (i TableConstraintMap) ToTableConstraintMapOutput() TableConstraintMapOutput {
	return i.ToTableConstraintMapOutputWithContext(context.Background())
}

func (i TableConstraintMap) ToTableConstraintMapOutputWithContext(ctx context.Context) TableConstraintMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableConstraintMapOutput)
}

type TableConstraintOutput struct{ *pulumi.OutputState }

func (TableConstraintOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TableConstraint)(nil)).Elem()
}

func (o TableConstraintOutput) ToTableConstraintOutput() TableConstraintOutput {
	return o
}

func (o TableConstraintOutput) ToTableConstraintOutputWithContext(ctx context.Context) TableConstraintOutput {
	return o
}

// Columns to use in constraint key
func (o TableConstraintOutput) Columns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.StringArrayOutput { return v.Columns }).(pulumi.StringArrayOutput)
}

// Comment for the table constraint
//
// Deprecated: Not used. Will be removed.
func (o TableConstraintOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// (Default: `true`) Whether the constraint is deferrable
func (o TableConstraintOutput) Deferrable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.BoolPtrOutput { return v.Deferrable }).(pulumi.BoolPtrOutput)
}

// (Default: `true`) Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
func (o TableConstraintOutput) Enable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.BoolPtrOutput { return v.Enable }).(pulumi.BoolPtrOutput)
}

// (Default: `false`) Whether the constraint is enforced
func (o TableConstraintOutput) Enforced() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.BoolPtrOutput { return v.Enforced }).(pulumi.BoolPtrOutput)
}

// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
func (o TableConstraintOutput) ForeignKeyProperties() TableConstraintForeignKeyPropertiesPtrOutput {
	return o.ApplyT(func(v *TableConstraint) TableConstraintForeignKeyPropertiesPtrOutput { return v.ForeignKeyProperties }).(TableConstraintForeignKeyPropertiesPtrOutput)
}

// (Default: `DEFERRED`) Whether the constraint is initially deferred or immediate
func (o TableConstraintOutput) Initially() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.StringPtrOutput { return v.Initially }).(pulumi.StringPtrOutput)
}

// Name of constraint
func (o TableConstraintOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Default: `true`) Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
func (o TableConstraintOutput) Rely() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.BoolPtrOutput { return v.Rely }).(pulumi.BoolPtrOutput)
}

// Identifier for table to create constraint on. Format must follow: "\"&lt;db*name&gt;\".\"&lt;schema*name&gt;\".\"&lt;table*name&gt;\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
func (o TableConstraintOutput) TableId() pulumi.StringOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.StringOutput { return v.TableId }).(pulumi.StringOutput)
}

// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
func (o TableConstraintOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// (Default: `false`) Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
func (o TableConstraintOutput) Validate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableConstraint) pulumi.BoolPtrOutput { return v.Validate }).(pulumi.BoolPtrOutput)
}

type TableConstraintArrayOutput struct{ *pulumi.OutputState }

func (TableConstraintArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableConstraint)(nil)).Elem()
}

func (o TableConstraintArrayOutput) ToTableConstraintArrayOutput() TableConstraintArrayOutput {
	return o
}

func (o TableConstraintArrayOutput) ToTableConstraintArrayOutputWithContext(ctx context.Context) TableConstraintArrayOutput {
	return o
}

func (o TableConstraintArrayOutput) Index(i pulumi.IntInput) TableConstraintOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TableConstraint {
		return vs[0].([]*TableConstraint)[vs[1].(int)]
	}).(TableConstraintOutput)
}

type TableConstraintMapOutput struct{ *pulumi.OutputState }

func (TableConstraintMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableConstraint)(nil)).Elem()
}

func (o TableConstraintMapOutput) ToTableConstraintMapOutput() TableConstraintMapOutput {
	return o
}

func (o TableConstraintMapOutput) ToTableConstraintMapOutputWithContext(ctx context.Context) TableConstraintMapOutput {
	return o
}

func (o TableConstraintMapOutput) MapIndex(k pulumi.StringInput) TableConstraintOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TableConstraint {
		return vs[0].(map[string]*TableConstraint)[vs[1].(string)]
	}).(TableConstraintOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableConstraintInput)(nil)).Elem(), &TableConstraint{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableConstraintArrayInput)(nil)).Elem(), TableConstraintArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableConstraintMapInput)(nil)).Elem(), TableConstraintMap{})
	pulumi.RegisterOutputType(TableConstraintOutput{})
	pulumi.RegisterOutputType(TableConstraintArrayOutput{})
	pulumi.RegisterOutputType(TableConstraintMapOutput{})
}
