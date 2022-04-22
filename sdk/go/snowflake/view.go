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
// 		_, err := snowflake.NewView(ctx, "view", &snowflake.ViewArgs{
// 			Database:  pulumi.String("db"),
// 			Schema:    pulumi.String("schema"),
// 			Comment:   pulumi.String("comment"),
// 			Statement: pulumi.String("select * from foo;\n"),
// 			OrReplace: pulumi.Bool(false),
// 			IsSecure:  pulumi.Bool(false),
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
// # format is database name | schema name | view name
//
// ```sh
//  $ pulumi import snowflake:index/view:View example 'dbName|schemaName|viewName'
// ```
type View struct {
	pulumi.CustomResourceState

	// Specifies a comment for the view.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the view. Don't use the | character.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrOutput `pulumi:"isSecure"`
	// Specifies the identifier for the view; must be unique for the schema in which the view is created. Don't use the | character.
	Name pulumi.StringOutput `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrOutput `pulumi:"orReplace"`
	// The schema in which to create the view. Don't use the | character.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement pulumi.StringOutput `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
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
	// The database in which to create the view. Don't use the | character.
	Database *string `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Specifies the identifier for the view; must be unique for the schema in which the view is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace *bool `pulumi:"orReplace"`
	// The schema in which to create the view. Don't use the | character.
	Schema *string `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement *string `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	Tags []ViewTag `pulumi:"tags"`
}

type ViewState struct {
	// Specifies a comment for the view.
	Comment pulumi.StringPtrInput
	// The database in which to create the view. Don't use the | character.
	Database pulumi.StringPtrInput
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrInput
	// Specifies the identifier for the view; must be unique for the schema in which the view is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrInput
	// The schema in which to create the view. Don't use the | character.
	Schema pulumi.StringPtrInput
	// Specifies the query used to create the view.
	Statement pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	Tags ViewTagArrayInput
}

func (ViewState) ElementType() reflect.Type {
	return reflect.TypeOf((*viewState)(nil)).Elem()
}

type viewArgs struct {
	// Specifies a comment for the view.
	Comment *string `pulumi:"comment"`
	// The database in which to create the view. Don't use the | character.
	Database string `pulumi:"database"`
	// Specifies that the view is secure.
	IsSecure *bool `pulumi:"isSecure"`
	// Specifies the identifier for the view; must be unique for the schema in which the view is created. Don't use the | character.
	Name *string `pulumi:"name"`
	// Overwrites the View if it exists.
	OrReplace *bool `pulumi:"orReplace"`
	// The schema in which to create the view. Don't use the | character.
	Schema string `pulumi:"schema"`
	// Specifies the query used to create the view.
	Statement string `pulumi:"statement"`
	// Definitions of a tag to associate with the resource.
	Tags []ViewTag `pulumi:"tags"`
}

// The set of arguments for constructing a View resource.
type ViewArgs struct {
	// Specifies a comment for the view.
	Comment pulumi.StringPtrInput
	// The database in which to create the view. Don't use the | character.
	Database pulumi.StringInput
	// Specifies that the view is secure.
	IsSecure pulumi.BoolPtrInput
	// Specifies the identifier for the view; must be unique for the schema in which the view is created. Don't use the | character.
	Name pulumi.StringPtrInput
	// Overwrites the View if it exists.
	OrReplace pulumi.BoolPtrInput
	// The schema in which to create the view. Don't use the | character.
	Schema pulumi.StringInput
	// Specifies the query used to create the view.
	Statement pulumi.StringInput
	// Definitions of a tag to associate with the resource.
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

// ViewArrayInput is an input type that accepts ViewArray and ViewArrayOutput values.
// You can construct a concrete instance of `ViewArrayInput` via:
//
//          ViewArray{ ViewArgs{...} }
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

// ViewMapInput is an input type that accepts ViewMap and ViewMapOutput values.
// You can construct a concrete instance of `ViewMapInput` via:
//
//          ViewMap{ "key": ViewArgs{...} }
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
