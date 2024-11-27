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
// $ pulumi import snowflake:index/tag:Tag example '"<database_name>"."<schema_name>"."<tag_name>"'
// ```
type Tag struct {
	pulumi.CustomResourceState

	// Set of allowed values for the tag.
	AllowedValues pulumi.StringArrayOutput `pulumi:"allowedValues"`
	// Specifies a comment for the tag.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database pulumi.StringOutput `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them.
	MaskingPolicies pulumi.StringArrayOutput `pulumi:"maskingPolicies"`
	// Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Outputs the result of `SHOW TAGS` for the given tag.
	ShowOutputs TagShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewTag registers a new resource with the given unique name, arguments, and options.
func NewTag(ctx *pulumi.Context,
	name string, args *TagArgs, opts ...pulumi.ResourceOption) (*Tag, error) {
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
	var resource Tag
	err := ctx.RegisterResource("snowflake:index/tag:Tag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTag gets an existing Tag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagState, opts ...pulumi.ResourceOption) (*Tag, error) {
	var resource Tag
	err := ctx.ReadResource("snowflake:index/tag:Tag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tag resources.
type tagState struct {
	// Set of allowed values for the tag.
	AllowedValues []string `pulumi:"allowedValues"`
	// Specifies a comment for the tag.
	Comment *string `pulumi:"comment"`
	// The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database *string `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them.
	MaskingPolicies []string `pulumi:"maskingPolicies"`
	// Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name *string `pulumi:"name"`
	// The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Schema *string `pulumi:"schema"`
	// Outputs the result of `SHOW TAGS` for the given tag.
	ShowOutputs []TagShowOutput `pulumi:"showOutputs"`
}

type TagState struct {
	// Set of allowed values for the tag.
	AllowedValues pulumi.StringArrayInput
	// Specifies a comment for the tag.
	Comment pulumi.StringPtrInput
	// The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them.
	MaskingPolicies pulumi.StringArrayInput
	// Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name pulumi.StringPtrInput
	// The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Schema pulumi.StringPtrInput
	// Outputs the result of `SHOW TAGS` for the given tag.
	ShowOutputs TagShowOutputArrayInput
}

func (TagState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagState)(nil)).Elem()
}

type tagArgs struct {
	// Set of allowed values for the tag.
	AllowedValues []string `pulumi:"allowedValues"`
	// Specifies a comment for the tag.
	Comment *string `pulumi:"comment"`
	// The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database string `pulumi:"database"`
	// Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them.
	MaskingPolicies []string `pulumi:"maskingPolicies"`
	// Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name *string `pulumi:"name"`
	// The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a Tag resource.
type TagArgs struct {
	// Set of allowed values for the tag.
	AllowedValues pulumi.StringArrayInput
	// Specifies a comment for the tag.
	Comment pulumi.StringPtrInput
	// The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database pulumi.StringInput
	// Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them.
	MaskingPolicies pulumi.StringArrayInput
	// Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name pulumi.StringPtrInput
	// The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Schema pulumi.StringInput
}

func (TagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagArgs)(nil)).Elem()
}

type TagInput interface {
	pulumi.Input

	ToTagOutput() TagOutput
	ToTagOutputWithContext(ctx context.Context) TagOutput
}

func (*Tag) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (i *Tag) ToTagOutput() TagOutput {
	return i.ToTagOutputWithContext(context.Background())
}

func (i *Tag) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagOutput)
}

// TagArrayInput is an input type that accepts TagArray and TagArrayOutput values.
// You can construct a concrete instance of `TagArrayInput` via:
//
//	TagArray{ TagArgs{...} }
type TagArrayInput interface {
	pulumi.Input

	ToTagArrayOutput() TagArrayOutput
	ToTagArrayOutputWithContext(context.Context) TagArrayOutput
}

type TagArray []TagInput

func (TagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (i TagArray) ToTagArrayOutput() TagArrayOutput {
	return i.ToTagArrayOutputWithContext(context.Background())
}

func (i TagArray) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagArrayOutput)
}

// TagMapInput is an input type that accepts TagMap and TagMapOutput values.
// You can construct a concrete instance of `TagMapInput` via:
//
//	TagMap{ "key": TagArgs{...} }
type TagMapInput interface {
	pulumi.Input

	ToTagMapOutput() TagMapOutput
	ToTagMapOutputWithContext(context.Context) TagMapOutput
}

type TagMap map[string]TagInput

func (TagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (i TagMap) ToTagMapOutput() TagMapOutput {
	return i.ToTagMapOutputWithContext(context.Background())
}

func (i TagMap) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagMapOutput)
}

type TagOutput struct{ *pulumi.OutputState }

func (TagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (o TagOutput) ToTagOutput() TagOutput {
	return o
}

func (o TagOutput) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return o
}

// Set of allowed values for the tag.
func (o TagOutput) AllowedValues() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringArrayOutput { return v.AllowedValues }).(pulumi.StringArrayOutput)
}

// Specifies a comment for the tag.
func (o TagOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
func (o TagOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o TagOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them.
func (o TagOutput) MaskingPolicies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringArrayOutput { return v.MaskingPolicies }).(pulumi.StringArrayOutput)
}

// Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
func (o TagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
func (o TagOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW TAGS` for the given tag.
func (o TagOutput) ShowOutputs() TagShowOutputArrayOutput {
	return o.ApplyT(func(v *Tag) TagShowOutputArrayOutput { return v.ShowOutputs }).(TagShowOutputArrayOutput)
}

type TagArrayOutput struct{ *pulumi.OutputState }

func (TagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (o TagArrayOutput) ToTagArrayOutput() TagArrayOutput {
	return o
}

func (o TagArrayOutput) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return o
}

func (o TagArrayOutput) Index(i pulumi.IntInput) TagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].([]*Tag)[vs[1].(int)]
	}).(TagOutput)
}

type TagMapOutput struct{ *pulumi.OutputState }

func (TagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (o TagMapOutput) ToTagMapOutput() TagMapOutput {
	return o
}

func (o TagMapOutput) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return o
}

func (o TagMapOutput) MapIndex(k pulumi.StringInput) TagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].(map[string]*Tag)[vs[1].(string)]
	}).(TagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagInput)(nil)).Elem(), &Tag{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagArrayInput)(nil)).Elem(), TagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagMapInput)(nil)).Elem(), TagMap{})
	pulumi.RegisterOutputType(TagOutput{})
	pulumi.RegisterOutputType(TagArrayOutput{})
	pulumi.RegisterOutputType(TagMapOutput{})
}
