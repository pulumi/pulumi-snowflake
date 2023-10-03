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
//			_, err := snowflake.NewView(ctx, "view", &snowflake.ViewArgs{
//				Database:  pulumi.String("database"),
//				Schema:    pulumi.String("schema"),
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
//	$ pulumi import snowflake:index/view:View example 'dbName|schemaName|viewName'
//
// ```
type View struct {
	pulumi.CustomResourceState

	// Specifies a comment for the view.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
	CopyGrants pulumi.BoolPtrOutput `pulumi:"copyGrants"`
	// The timestamp at which the view was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Name of the database that the tag was created in.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrOutput `pulumi:"isSecure"`
	// Tag name, e.g. department.
	Name pulumi.StringOutput `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrOutput `pulumi:"orReplace"`
	// Name of the schema that the tag was created in.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement pulumi.StringOutput `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags ViewTagArrayOutput `pulumi:"tags"`
}

// NewView registers a new resource with the given unique name, arguments, and options.
func NewView(ctx *pulumi.Context,
	name string, args *ViewArgs, opts ...pulumi.ResourceOption) (*View, error) {
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
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource View
	err := ctx.RegisterResource("snowflake:index/view:View", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetView gets an existing View resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetView(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ViewState, opts ...pulumi.ResourceOption) (*View, error) {
	var resource View
	err := ctx.ReadResource("snowflake:index/view:View", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering View resources.
type viewState struct {
	// Specifies a comment for the view.
	Comment *string `pulumi:"comment"`
	// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
	CopyGrants *bool `pulumi:"copyGrants"`
	// The timestamp at which the view was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Name of the database that the tag was created in.
	Database *string `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Tag name, e.g. department.
	Name *string `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace *bool `pulumi:"orReplace"`
	// Name of the schema that the tag was created in.
	Schema *string `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement *string `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []ViewTag `pulumi:"tags"`
}

type ViewState struct {
	// Specifies a comment for the view.
	Comment pulumi.StringPtrInput
	// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
	CopyGrants pulumi.BoolPtrInput
	// The timestamp at which the view was created.
	CreatedOn pulumi.StringPtrInput
	// Name of the database that the tag was created in.
	Database pulumi.StringPtrInput
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrInput
	// Tag name, e.g. department.
	Name pulumi.StringPtrInput
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrInput
	// Name of the schema that the tag was created in.
	Schema pulumi.StringPtrInput
	// Specifies the query used to create the view.
	Statement pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags ViewTagArrayInput
}

func (ViewState) ElementType() reflect.Type {
	return reflect.TypeOf((*viewState)(nil)).Elem()
}

type viewArgs struct {
	// Specifies a comment for the view.
	Comment *string `pulumi:"comment"`
	// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
	CopyGrants *bool `pulumi:"copyGrants"`
	// Name of the database that the tag was created in.
	Database string `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Tag name, e.g. department.
	Name *string `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace *bool `pulumi:"orReplace"`
	// Name of the schema that the tag was created in.
	Schema string `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement string `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []ViewTag `pulumi:"tags"`
}

// The set of arguments for constructing a View resource.
type ViewArgs struct {
	// Specifies a comment for the view.
	Comment pulumi.StringPtrInput
	// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
	CopyGrants pulumi.BoolPtrInput
	// Name of the database that the tag was created in.
	Database pulumi.StringInput
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrInput
	// Tag name, e.g. department.
	Name pulumi.StringPtrInput
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrInput
	// Name of the schema that the tag was created in.
	Schema pulumi.StringInput
	// Specifies the query used to create the view.
	Statement pulumi.StringInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags ViewTagArrayInput
}

func (ViewArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*viewArgs)(nil)).Elem()
}

type ViewInput interface {
	pulumi.Input

	ToViewOutput() ViewOutput
	ToViewOutputWithContext(ctx context.Context) ViewOutput
}

func (*View) ElementType() reflect.Type {
	return reflect.TypeOf((**View)(nil)).Elem()
}

func (i *View) ToViewOutput() ViewOutput {
	return i.ToViewOutputWithContext(context.Background())
}

func (i *View) ToViewOutputWithContext(ctx context.Context) ViewOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewOutput)
}

func (i *View) ToOutput(ctx context.Context) pulumix.Output[*View] {
	return pulumix.Output[*View]{
		OutputState: i.ToViewOutputWithContext(ctx).OutputState,
	}
}

// ViewArrayInput is an input type that accepts ViewArray and ViewArrayOutput values.
// You can construct a concrete instance of `ViewArrayInput` via:
//
//	ViewArray{ ViewArgs{...} }
type ViewArrayInput interface {
	pulumi.Input

	ToViewArrayOutput() ViewArrayOutput
	ToViewArrayOutputWithContext(context.Context) ViewArrayOutput
}

type ViewArray []ViewInput

func (ViewArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*View)(nil)).Elem()
}

func (i ViewArray) ToViewArrayOutput() ViewArrayOutput {
	return i.ToViewArrayOutputWithContext(context.Background())
}

func (i ViewArray) ToViewArrayOutputWithContext(ctx context.Context) ViewArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewArrayOutput)
}

func (i ViewArray) ToOutput(ctx context.Context) pulumix.Output[[]*View] {
	return pulumix.Output[[]*View]{
		OutputState: i.ToViewArrayOutputWithContext(ctx).OutputState,
	}
}

// ViewMapInput is an input type that accepts ViewMap and ViewMapOutput values.
// You can construct a concrete instance of `ViewMapInput` via:
//
//	ViewMap{ "key": ViewArgs{...} }
type ViewMapInput interface {
	pulumi.Input

	ToViewMapOutput() ViewMapOutput
	ToViewMapOutputWithContext(context.Context) ViewMapOutput
}

type ViewMap map[string]ViewInput

func (ViewMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*View)(nil)).Elem()
}

func (i ViewMap) ToViewMapOutput() ViewMapOutput {
	return i.ToViewMapOutputWithContext(context.Background())
}

func (i ViewMap) ToViewMapOutputWithContext(ctx context.Context) ViewMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ViewMapOutput)
}

func (i ViewMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*View] {
	return pulumix.Output[map[string]*View]{
		OutputState: i.ToViewMapOutputWithContext(ctx).OutputState,
	}
}

type ViewOutput struct{ *pulumi.OutputState }

func (ViewOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**View)(nil)).Elem()
}

func (o ViewOutput) ToViewOutput() ViewOutput {
	return o
}

func (o ViewOutput) ToViewOutputWithContext(ctx context.Context) ViewOutput {
	return o
}

func (o ViewOutput) ToOutput(ctx context.Context) pulumix.Output[*View] {
	return pulumix.Output[*View]{
		OutputState: o.OutputState,
	}
}

// Specifies a comment for the view.
func (o ViewOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *View) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
func (o ViewOutput) CopyGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *View) pulumi.BoolPtrOutput { return v.CopyGrants }).(pulumi.BoolPtrOutput)
}

// The timestamp at which the view was created.
func (o ViewOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *View) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Name of the database that the tag was created in.
func (o ViewOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *View) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies that the view is secure.
func (o ViewOutput) IsSecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *View) pulumi.BoolPtrOutput { return v.IsSecure }).(pulumi.BoolPtrOutput)
}

// Tag name, e.g. department.
func (o ViewOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *View) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Overwrites the View if it exists.
func (o ViewOutput) OrReplace() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *View) pulumi.BoolPtrOutput { return v.OrReplace }).(pulumi.BoolPtrOutput)
}

// Name of the schema that the tag was created in.
func (o ViewOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *View) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies the query used to create the view.
func (o ViewOutput) Statement() pulumi.StringOutput {
	return o.ApplyT(func(v *View) pulumi.StringOutput { return v.Statement }).(pulumi.StringOutput)
}

// Definitions of a tag to associate with the resource.
//
// Deprecated: Use the 'snowflake_tag_association' resource instead.
func (o ViewOutput) Tags() ViewTagArrayOutput {
	return o.ApplyT(func(v *View) ViewTagArrayOutput { return v.Tags }).(ViewTagArrayOutput)
}

type ViewArrayOutput struct{ *pulumi.OutputState }

func (ViewArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*View)(nil)).Elem()
}

func (o ViewArrayOutput) ToViewArrayOutput() ViewArrayOutput {
	return o
}

func (o ViewArrayOutput) ToViewArrayOutputWithContext(ctx context.Context) ViewArrayOutput {
	return o
}

func (o ViewArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*View] {
	return pulumix.Output[[]*View]{
		OutputState: o.OutputState,
	}
}

func (o ViewArrayOutput) Index(i pulumi.IntInput) ViewOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *View {
		return vs[0].([]*View)[vs[1].(int)]
	}).(ViewOutput)
}

type ViewMapOutput struct{ *pulumi.OutputState }

func (ViewMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*View)(nil)).Elem()
}

func (o ViewMapOutput) ToViewMapOutput() ViewMapOutput {
	return o
}

func (o ViewMapOutput) ToViewMapOutputWithContext(ctx context.Context) ViewMapOutput {
	return o
}

func (o ViewMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*View] {
	return pulumix.Output[map[string]*View]{
		OutputState: o.OutputState,
	}
}

func (o ViewMapOutput) MapIndex(k pulumi.StringInput) ViewOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *View {
		return vs[0].(map[string]*View)[vs[1].(string)]
	}).(ViewOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ViewInput)(nil)).Elem(), &View{})
	pulumi.RegisterInputType(reflect.TypeOf((*ViewArrayInput)(nil)).Elem(), ViewArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ViewMapInput)(nil)).Elem(), ViewMap{})
	pulumi.RegisterOutputType(ViewOutput{})
	pulumi.RegisterOutputType(ViewArrayOutput{})
	pulumi.RegisterOutputType(ViewMapOutput{})
}
