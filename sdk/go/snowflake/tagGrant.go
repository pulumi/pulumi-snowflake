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

// > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>
//
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
//			_, err := snowflake.NewTagGrant(ctx, "example", &snowflake.TagGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				SchemaName:   pulumi.String("schema"),
//				TagName:      pulumi.String("tag"),
//				Roles: pulumi.StringArray{
//					pulumi.String("TEST_ROLE"),
//				},
//				Privilege: pulumi.String("OWNERSHIP"),
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
// format is database|schema|tag|privilege|with_grant_option|roles
//
// ```sh
// $ pulumi import snowflake:index/tagGrant:TagGrant example "MY_DATABASE|MY_SCHEMA|MY_TAG|USAGE|false|role1,role2"
// ```
type TagGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the tag on which to grant privileges.
	DatabaseName         pulumi.StringOutput  `pulumi:"databaseName"`
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the tag on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// The name of the tag on which to grant privileges.
	TagName pulumi.StringOutput `pulumi:"tagName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewTagGrant registers a new resource with the given unique name, arguments, and options.
func NewTagGrant(ctx *pulumi.Context,
	name string, args *TagGrantArgs, opts ...pulumi.ResourceOption) (*TagGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	if args.TagName == nil {
		return nil, errors.New("invalid value for required argument 'TagName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TagGrant
	err := ctx.RegisterResource("snowflake:index/tagGrant:TagGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTagGrant gets an existing TagGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTagGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagGrantState, opts ...pulumi.ResourceOption) (*TagGrant, error) {
	var resource TagGrant
	err := ctx.ReadResource("snowflake:index/tagGrant:TagGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TagGrant resources.
type tagGrantState struct {
	// The name of the database containing the tag on which to grant privileges.
	DatabaseName         *string `pulumi:"databaseName"`
	EnableMultipleGrants *bool   `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the tag on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// The name of the tag on which to grant privileges.
	TagName *string `pulumi:"tagName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type TagGrantState struct {
	// The name of the database containing the tag on which to grant privileges.
	DatabaseName         pulumi.StringPtrInput
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the tag on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// The name of the tag on which to grant privileges.
	TagName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (TagGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagGrantState)(nil)).Elem()
}

type tagGrantArgs struct {
	// The name of the database containing the tag on which to grant privileges.
	DatabaseName         string `pulumi:"databaseName"`
	EnableMultipleGrants *bool  `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the tag on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// The name of the tag on which to grant privileges.
	TagName string `pulumi:"tagName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a TagGrant resource.
type TagGrantArgs struct {
	// The name of the database containing the tag on which to grant privileges.
	DatabaseName         pulumi.StringInput
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the tag on which to grant privileges.
	SchemaName pulumi.StringInput
	// The name of the tag on which to grant privileges.
	TagName pulumi.StringInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (TagGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagGrantArgs)(nil)).Elem()
}

type TagGrantInput interface {
	pulumi.Input

	ToTagGrantOutput() TagGrantOutput
	ToTagGrantOutputWithContext(ctx context.Context) TagGrantOutput
}

func (*TagGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**TagGrant)(nil)).Elem()
}

func (i *TagGrant) ToTagGrantOutput() TagGrantOutput {
	return i.ToTagGrantOutputWithContext(context.Background())
}

func (i *TagGrant) ToTagGrantOutputWithContext(ctx context.Context) TagGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagGrantOutput)
}

// TagGrantArrayInput is an input type that accepts TagGrantArray and TagGrantArrayOutput values.
// You can construct a concrete instance of `TagGrantArrayInput` via:
//
//	TagGrantArray{ TagGrantArgs{...} }
type TagGrantArrayInput interface {
	pulumi.Input

	ToTagGrantArrayOutput() TagGrantArrayOutput
	ToTagGrantArrayOutputWithContext(context.Context) TagGrantArrayOutput
}

type TagGrantArray []TagGrantInput

func (TagGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagGrant)(nil)).Elem()
}

func (i TagGrantArray) ToTagGrantArrayOutput() TagGrantArrayOutput {
	return i.ToTagGrantArrayOutputWithContext(context.Background())
}

func (i TagGrantArray) ToTagGrantArrayOutputWithContext(ctx context.Context) TagGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagGrantArrayOutput)
}

// TagGrantMapInput is an input type that accepts TagGrantMap and TagGrantMapOutput values.
// You can construct a concrete instance of `TagGrantMapInput` via:
//
//	TagGrantMap{ "key": TagGrantArgs{...} }
type TagGrantMapInput interface {
	pulumi.Input

	ToTagGrantMapOutput() TagGrantMapOutput
	ToTagGrantMapOutputWithContext(context.Context) TagGrantMapOutput
}

type TagGrantMap map[string]TagGrantInput

func (TagGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagGrant)(nil)).Elem()
}

func (i TagGrantMap) ToTagGrantMapOutput() TagGrantMapOutput {
	return i.ToTagGrantMapOutputWithContext(context.Background())
}

func (i TagGrantMap) ToTagGrantMapOutputWithContext(ctx context.Context) TagGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagGrantMapOutput)
}

type TagGrantOutput struct{ *pulumi.OutputState }

func (TagGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TagGrant)(nil)).Elem()
}

func (o TagGrantOutput) ToTagGrantOutput() TagGrantOutput {
	return o
}

func (o TagGrantOutput) ToTagGrantOutputWithContext(ctx context.Context) TagGrantOutput {
	return o
}

// The name of the database containing the tag on which to grant privileges.
func (o TagGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

func (o TagGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
func (o TagGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
func (o TagGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o TagGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the tag on which to grant privileges.
func (o TagGrantOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

// The name of the tag on which to grant privileges.
func (o TagGrantOutput) TagName() pulumi.StringOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.StringOutput { return v.TagName }).(pulumi.StringOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o TagGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TagGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type TagGrantArrayOutput struct{ *pulumi.OutputState }

func (TagGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagGrant)(nil)).Elem()
}

func (o TagGrantArrayOutput) ToTagGrantArrayOutput() TagGrantArrayOutput {
	return o
}

func (o TagGrantArrayOutput) ToTagGrantArrayOutputWithContext(ctx context.Context) TagGrantArrayOutput {
	return o
}

func (o TagGrantArrayOutput) Index(i pulumi.IntInput) TagGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TagGrant {
		return vs[0].([]*TagGrant)[vs[1].(int)]
	}).(TagGrantOutput)
}

type TagGrantMapOutput struct{ *pulumi.OutputState }

func (TagGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagGrant)(nil)).Elem()
}

func (o TagGrantMapOutput) ToTagGrantMapOutput() TagGrantMapOutput {
	return o
}

func (o TagGrantMapOutput) ToTagGrantMapOutputWithContext(ctx context.Context) TagGrantMapOutput {
	return o
}

func (o TagGrantMapOutput) MapIndex(k pulumi.StringInput) TagGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TagGrant {
		return vs[0].(map[string]*TagGrant)[vs[1].(string)]
	}).(TagGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagGrantInput)(nil)).Elem(), &TagGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagGrantArrayInput)(nil)).Elem(), TagGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagGrantMapInput)(nil)).Elem(), TagGrantMap{})
	pulumi.RegisterOutputType(TagGrantOutput{})
	pulumi.RegisterOutputType(TagGrantArrayOutput{})
	pulumi.RegisterOutputType(TagGrantMapOutput{})
}
