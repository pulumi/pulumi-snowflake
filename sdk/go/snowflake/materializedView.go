// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
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
//			_, err := snowflake.NewMaterializedView(ctx, "view", &snowflake.MaterializedViewArgs{
//				Database:  pulumi.String("db"),
//				Schema:    pulumi.String("schema"),
//				Warehouse: pulumi.String("warehouse"),
//				Comment:   pulumi.String("comment"),
//				Statement: pulumi.String("select * from foo;\n"),
//				OrReplace: pulumi.Bool(false),
//				IsSecure:  pulumi.Bool(false),
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
// format is database name | schema name | view name
//
// ```sh
//
//	$ pulumi import snowflake:index/materializedView:MaterializedView example 'dbName|schemaName|viewName'
//
// ```
type MaterializedView struct {
	pulumi.CustomResourceState

	// Specifies a comment for the view.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the view. Don't use the | character.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrOutput `pulumi:"isSecure"`
	// Specifies the identifier for the view; must be unique for the schema in which the view is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrOutput `pulumi:"orReplace"`
	// The schema in which to create the view. Don't use the | character.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement pulumi.StringOutput `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags MaterializedViewTagArrayOutput `pulumi:"tags"`
	// The warehouse name.
	Warehouse pulumi.StringOutput `pulumi:"warehouse"`
}

// NewMaterializedView registers a new resource with the given unique name, arguments, and options.
func NewMaterializedView(ctx *pulumi.Context,
	name string, args *MaterializedViewArgs, opts ...pulumi.ResourceOption) (*MaterializedView, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Statement == nil {
		return nil, errors.New("invalid value for required argument 'Statement'")
	}
	if args.Warehouse == nil {
		return nil, errors.New("invalid value for required argument 'Warehouse'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MaterializedView
	err := ctx.RegisterResource("snowflake:index/materializedView:MaterializedView", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaterializedView gets an existing MaterializedView resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaterializedView(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaterializedViewState, opts ...pulumi.ResourceOption) (*MaterializedView, error) {
	var resource MaterializedView
	err := ctx.ReadResource("snowflake:index/materializedView:MaterializedView", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MaterializedView resources.
type materializedViewState struct {
	// Specifies a comment for the view.
	Comment *string `pulumi:"comment"`
	// The database in which to create the view. Don't use the | character.
	Database *string `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Specifies the identifier for the view; must be unique for the schema in which the view is created.
	Name *string `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace *bool `pulumi:"orReplace"`
	// The schema in which to create the view. Don't use the | character.
	Schema *string `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement *string `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []MaterializedViewTag `pulumi:"tags"`
	// The warehouse name.
	Warehouse *string `pulumi:"warehouse"`
}

type MaterializedViewState struct {
	// Specifies a comment for the view.
	Comment pulumi.StringPtrInput
	// The database in which to create the view. Don't use the | character.
	Database pulumi.StringPtrInput
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrInput
	// Specifies the identifier for the view; must be unique for the schema in which the view is created.
	Name pulumi.StringPtrInput
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrInput
	// The schema in which to create the view. Don't use the | character.
	Schema pulumi.StringPtrInput
	// Specifies the query used to create the view.
	Statement pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags MaterializedViewTagArrayInput
	// The warehouse name.
	Warehouse pulumi.StringPtrInput
}

func (MaterializedViewState) ElementType() reflect.Type {
	return reflect.TypeOf((*materializedViewState)(nil)).Elem()
}

type materializedViewArgs struct {
	// Specifies a comment for the view.
	Comment *string `pulumi:"comment"`
	// The database in which to create the view. Don't use the | character.
	Database string `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Specifies the identifier for the view; must be unique for the schema in which the view is created.
	Name *string `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace *bool `pulumi:"orReplace"`
	// The schema in which to create the view. Don't use the | character.
	Schema string `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement string `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []MaterializedViewTag `pulumi:"tags"`
	// The warehouse name.
	Warehouse string `pulumi:"warehouse"`
}

// The set of arguments for constructing a MaterializedView resource.
type MaterializedViewArgs struct {
	// Specifies a comment for the view.
	Comment pulumi.StringPtrInput
	// The database in which to create the view. Don't use the | character.
	Database pulumi.StringInput
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrInput
	// Specifies the identifier for the view; must be unique for the schema in which the view is created.
	Name pulumi.StringPtrInput
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrInput
	// The schema in which to create the view. Don't use the | character.
	Schema pulumi.StringInput
	// Specifies the query used to create the view.
	Statement pulumi.StringInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags MaterializedViewTagArrayInput
	// The warehouse name.
	Warehouse pulumi.StringInput
}

func (MaterializedViewArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*materializedViewArgs)(nil)).Elem()
}

type MaterializedViewInput interface {
	pulumi.Input

	ToMaterializedViewOutput() MaterializedViewOutput
	ToMaterializedViewOutputWithContext(ctx context.Context) MaterializedViewOutput
}

func (*MaterializedView) ElementType() reflect.Type {
	return reflect.TypeOf((**MaterializedView)(nil)).Elem()
}

func (i *MaterializedView) ToMaterializedViewOutput() MaterializedViewOutput {
	return i.ToMaterializedViewOutputWithContext(context.Background())
}

func (i *MaterializedView) ToMaterializedViewOutputWithContext(ctx context.Context) MaterializedViewOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewOutput)
}

func (i *MaterializedView) ToOutput(ctx context.Context) pulumix.Output[*MaterializedView] {
	return pulumix.Output[*MaterializedView]{
		OutputState: i.ToMaterializedViewOutputWithContext(ctx).OutputState,
	}
}

// MaterializedViewArrayInput is an input type that accepts MaterializedViewArray and MaterializedViewArrayOutput values.
// You can construct a concrete instance of `MaterializedViewArrayInput` via:
//
//	MaterializedViewArray{ MaterializedViewArgs{...} }
type MaterializedViewArrayInput interface {
	pulumi.Input

	ToMaterializedViewArrayOutput() MaterializedViewArrayOutput
	ToMaterializedViewArrayOutputWithContext(context.Context) MaterializedViewArrayOutput
}

type MaterializedViewArray []MaterializedViewInput

func (MaterializedViewArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaterializedView)(nil)).Elem()
}

func (i MaterializedViewArray) ToMaterializedViewArrayOutput() MaterializedViewArrayOutput {
	return i.ToMaterializedViewArrayOutputWithContext(context.Background())
}

func (i MaterializedViewArray) ToMaterializedViewArrayOutputWithContext(ctx context.Context) MaterializedViewArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewArrayOutput)
}

func (i MaterializedViewArray) ToOutput(ctx context.Context) pulumix.Output[[]*MaterializedView] {
	return pulumix.Output[[]*MaterializedView]{
		OutputState: i.ToMaterializedViewArrayOutputWithContext(ctx).OutputState,
	}
}

// MaterializedViewMapInput is an input type that accepts MaterializedViewMap and MaterializedViewMapOutput values.
// You can construct a concrete instance of `MaterializedViewMapInput` via:
//
//	MaterializedViewMap{ "key": MaterializedViewArgs{...} }
type MaterializedViewMapInput interface {
	pulumi.Input

	ToMaterializedViewMapOutput() MaterializedViewMapOutput
	ToMaterializedViewMapOutputWithContext(context.Context) MaterializedViewMapOutput
}

type MaterializedViewMap map[string]MaterializedViewInput

func (MaterializedViewMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaterializedView)(nil)).Elem()
}

func (i MaterializedViewMap) ToMaterializedViewMapOutput() MaterializedViewMapOutput {
	return i.ToMaterializedViewMapOutputWithContext(context.Background())
}

func (i MaterializedViewMap) ToMaterializedViewMapOutputWithContext(ctx context.Context) MaterializedViewMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewMapOutput)
}

func (i MaterializedViewMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MaterializedView] {
	return pulumix.Output[map[string]*MaterializedView]{
		OutputState: i.ToMaterializedViewMapOutputWithContext(ctx).OutputState,
	}
}

type MaterializedViewOutput struct{ *pulumi.OutputState }

func (MaterializedViewOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MaterializedView)(nil)).Elem()
}

func (o MaterializedViewOutput) ToMaterializedViewOutput() MaterializedViewOutput {
	return o
}

func (o MaterializedViewOutput) ToMaterializedViewOutputWithContext(ctx context.Context) MaterializedViewOutput {
	return o
}

func (o MaterializedViewOutput) ToOutput(ctx context.Context) pulumix.Output[*MaterializedView] {
	return pulumix.Output[*MaterializedView]{
		OutputState: o.OutputState,
	}
}

// Specifies a comment for the view.
func (o MaterializedViewOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the view. Don't use the | character.
func (o MaterializedViewOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies that the view is secure.
func (o MaterializedViewOutput) IsSecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.BoolPtrOutput { return v.IsSecure }).(pulumi.BoolPtrOutput)
}

// Specifies the identifier for the view; must be unique for the schema in which the view is created.
func (o MaterializedViewOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Overwrites the View if it exists.
func (o MaterializedViewOutput) OrReplace() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.BoolPtrOutput { return v.OrReplace }).(pulumi.BoolPtrOutput)
}

// The schema in which to create the view. Don't use the | character.
func (o MaterializedViewOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies the query used to create the view.
func (o MaterializedViewOutput) Statement() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Statement }).(pulumi.StringOutput)
}

// Definitions of a tag to associate with the resource.
//
// Deprecated: Use the 'snowflake_tag_association' resource instead.
func (o MaterializedViewOutput) Tags() MaterializedViewTagArrayOutput {
	return o.ApplyT(func(v *MaterializedView) MaterializedViewTagArrayOutput { return v.Tags }).(MaterializedViewTagArrayOutput)
}

// The warehouse name.
func (o MaterializedViewOutput) Warehouse() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedView) pulumi.StringOutput { return v.Warehouse }).(pulumi.StringOutput)
}

type MaterializedViewArrayOutput struct{ *pulumi.OutputState }

func (MaterializedViewArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaterializedView)(nil)).Elem()
}

func (o MaterializedViewArrayOutput) ToMaterializedViewArrayOutput() MaterializedViewArrayOutput {
	return o
}

func (o MaterializedViewArrayOutput) ToMaterializedViewArrayOutputWithContext(ctx context.Context) MaterializedViewArrayOutput {
	return o
}

func (o MaterializedViewArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MaterializedView] {
	return pulumix.Output[[]*MaterializedView]{
		OutputState: o.OutputState,
	}
}

func (o MaterializedViewArrayOutput) Index(i pulumi.IntInput) MaterializedViewOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MaterializedView {
		return vs[0].([]*MaterializedView)[vs[1].(int)]
	}).(MaterializedViewOutput)
}

type MaterializedViewMapOutput struct{ *pulumi.OutputState }

func (MaterializedViewMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaterializedView)(nil)).Elem()
}

func (o MaterializedViewMapOutput) ToMaterializedViewMapOutput() MaterializedViewMapOutput {
	return o
}

func (o MaterializedViewMapOutput) ToMaterializedViewMapOutputWithContext(ctx context.Context) MaterializedViewMapOutput {
	return o
}

func (o MaterializedViewMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MaterializedView] {
	return pulumix.Output[map[string]*MaterializedView]{
		OutputState: o.OutputState,
	}
}

func (o MaterializedViewMapOutput) MapIndex(k pulumi.StringInput) MaterializedViewOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MaterializedView {
		return vs[0].(map[string]*MaterializedView)[vs[1].(string)]
	}).(MaterializedViewOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewInput)(nil)).Elem(), &MaterializedView{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewArrayInput)(nil)).Elem(), MaterializedViewArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewMapInput)(nil)).Elem(), MaterializedViewMap{})
	pulumi.RegisterOutputType(MaterializedViewOutput{})
	pulumi.RegisterOutputType(MaterializedViewArrayOutput{})
	pulumi.RegisterOutputType(MaterializedViewMapOutput{})
}
