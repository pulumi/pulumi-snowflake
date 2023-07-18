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
//			_, err := snowflake.NewSchema(ctx, "schema", &snowflake.SchemaArgs{
//				Comment:           pulumi.String("A schema."),
//				DataRetentionDays: pulumi.Int(1),
//				Database:          pulumi.String("database"),
//				IsManaged:         pulumi.Bool(false),
//				IsTransient:       pulumi.Bool(false),
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
// format is dbName | schemaName
//
// ```sh
//
//	$ pulumi import snowflake:index/schema:Schema example 'dbName|schemaName'
//
// ```
type Schema struct {
	pulumi.CustomResourceState

	// Specifies a comment for the schema.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
	DataRetentionDays pulumi.IntPtrOutput `pulumi:"dataRetentionDays"`
	// The database in which to create the schema.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
	IsManaged pulumi.BoolPtrOutput `pulumi:"isManaged"`
	// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient pulumi.BoolPtrOutput `pulumi:"isTransient"`
	// Specifies the identifier for the schema; must be unique for the database in which the schema is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags SchemaTagArrayOutput `pulumi:"tags"`
}

// NewSchema registers a new resource with the given unique name, arguments, and options.
func NewSchema(ctx *pulumi.Context,
	name string, args *SchemaArgs, opts ...pulumi.ResourceOption) (*Schema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Schema
	err := ctx.RegisterResource("snowflake:index/schema:Schema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchema gets an existing Schema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaState, opts ...pulumi.ResourceOption) (*Schema, error) {
	var resource Schema
	err := ctx.ReadResource("snowflake:index/schema:Schema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schema resources.
type schemaState struct {
	// Specifies a comment for the schema.
	Comment *string `pulumi:"comment"`
	// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
	DataRetentionDays *int `pulumi:"dataRetentionDays"`
	// The database in which to create the schema.
	Database *string `pulumi:"database"`
	// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
	IsManaged *bool `pulumi:"isManaged"`
	// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient *bool `pulumi:"isTransient"`
	// Specifies the identifier for the schema; must be unique for the database in which the schema is created.
	Name *string `pulumi:"name"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []SchemaTag `pulumi:"tags"`
}

type SchemaState struct {
	// Specifies a comment for the schema.
	Comment pulumi.StringPtrInput
	// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
	DataRetentionDays pulumi.IntPtrInput
	// The database in which to create the schema.
	Database pulumi.StringPtrInput
	// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
	IsManaged pulumi.BoolPtrInput
	// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient pulumi.BoolPtrInput
	// Specifies the identifier for the schema; must be unique for the database in which the schema is created.
	Name pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags SchemaTagArrayInput
}

func (SchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaState)(nil)).Elem()
}

type schemaArgs struct {
	// Specifies a comment for the schema.
	Comment *string `pulumi:"comment"`
	// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
	DataRetentionDays *int `pulumi:"dataRetentionDays"`
	// The database in which to create the schema.
	Database string `pulumi:"database"`
	// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
	IsManaged *bool `pulumi:"isManaged"`
	// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient *bool `pulumi:"isTransient"`
	// Specifies the identifier for the schema; must be unique for the database in which the schema is created.
	Name *string `pulumi:"name"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []SchemaTag `pulumi:"tags"`
}

// The set of arguments for constructing a Schema resource.
type SchemaArgs struct {
	// Specifies a comment for the schema.
	Comment pulumi.StringPtrInput
	// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
	DataRetentionDays pulumi.IntPtrInput
	// The database in which to create the schema.
	Database pulumi.StringInput
	// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
	IsManaged pulumi.BoolPtrInput
	// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient pulumi.BoolPtrInput
	// Specifies the identifier for the schema; must be unique for the database in which the schema is created.
	Name pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags SchemaTagArrayInput
}

func (SchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaArgs)(nil)).Elem()
}

type SchemaInput interface {
	pulumi.Input

	ToSchemaOutput() SchemaOutput
	ToSchemaOutputWithContext(ctx context.Context) SchemaOutput
}

func (*Schema) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (i *Schema) ToSchemaOutput() SchemaOutput {
	return i.ToSchemaOutputWithContext(context.Background())
}

func (i *Schema) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaOutput)
}

// SchemaArrayInput is an input type that accepts SchemaArray and SchemaArrayOutput values.
// You can construct a concrete instance of `SchemaArrayInput` via:
//
//	SchemaArray{ SchemaArgs{...} }
type SchemaArrayInput interface {
	pulumi.Input

	ToSchemaArrayOutput() SchemaArrayOutput
	ToSchemaArrayOutputWithContext(context.Context) SchemaArrayOutput
}

type SchemaArray []SchemaInput

func (SchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (i SchemaArray) ToSchemaArrayOutput() SchemaArrayOutput {
	return i.ToSchemaArrayOutputWithContext(context.Background())
}

func (i SchemaArray) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaArrayOutput)
}

// SchemaMapInput is an input type that accepts SchemaMap and SchemaMapOutput values.
// You can construct a concrete instance of `SchemaMapInput` via:
//
//	SchemaMap{ "key": SchemaArgs{...} }
type SchemaMapInput interface {
	pulumi.Input

	ToSchemaMapOutput() SchemaMapOutput
	ToSchemaMapOutputWithContext(context.Context) SchemaMapOutput
}

type SchemaMap map[string]SchemaInput

func (SchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (i SchemaMap) ToSchemaMapOutput() SchemaMapOutput {
	return i.ToSchemaMapOutputWithContext(context.Background())
}

func (i SchemaMap) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaMapOutput)
}

type SchemaOutput struct{ *pulumi.OutputState }

func (SchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (o SchemaOutput) ToSchemaOutput() SchemaOutput {
	return o
}

func (o SchemaOutput) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return o
}

// Specifies a comment for the schema.
func (o SchemaOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
func (o SchemaOutput) DataRetentionDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.IntPtrOutput { return v.DataRetentionDays }).(pulumi.IntPtrOutput)
}

// The database in which to create the schema.
func (o SchemaOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
func (o SchemaOutput) IsManaged() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.BoolPtrOutput { return v.IsManaged }).(pulumi.BoolPtrOutput)
}

// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
func (o SchemaOutput) IsTransient() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.BoolPtrOutput { return v.IsTransient }).(pulumi.BoolPtrOutput)
}

// Specifies the identifier for the schema; must be unique for the database in which the schema is created.
func (o SchemaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Definitions of a tag to associate with the resource.
//
// Deprecated: Use the 'snowflake_tag_association' resource instead.
func (o SchemaOutput) Tags() SchemaTagArrayOutput {
	return o.ApplyT(func(v *Schema) SchemaTagArrayOutput { return v.Tags }).(SchemaTagArrayOutput)
}

type SchemaArrayOutput struct{ *pulumi.OutputState }

func (SchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (o SchemaArrayOutput) ToSchemaArrayOutput() SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) Index(i pulumi.IntInput) SchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].([]*Schema)[vs[1].(int)]
	}).(SchemaOutput)
}

type SchemaMapOutput struct{ *pulumi.OutputState }

func (SchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (o SchemaMapOutput) ToSchemaMapOutput() SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) MapIndex(k pulumi.StringInput) SchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].(map[string]*Schema)[vs[1].(string)]
	}).(SchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaInput)(nil)).Elem(), &Schema{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaArrayInput)(nil)).Elem(), SchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaMapInput)(nil)).Elem(), SchemaMap{})
	pulumi.RegisterOutputType(SchemaOutput{})
	pulumi.RegisterOutputType(SchemaArrayOutput{})
	pulumi.RegisterOutputType(SchemaMapOutput{})
}
