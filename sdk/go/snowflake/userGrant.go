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
//			_, err := snowflake.NewUserGrant(ctx, "grant", &snowflake.UserGrantArgs{
//				UserName:  pulumi.String("user"),
//				Privilege: pulumi.String("MONITOR"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				WithGrantOption: pulumi.Bool(false),
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
// format is user_name|privilege|with_grant_option|roles
//
// ```sh
// $ pulumi import snowflake:index/userGrant:UserGrant example "USERNAME|MONITOR|false|role1,role2"
// ```
type UserGrant struct {
	pulumi.CustomResourceState

	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the user. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the user on which to grant privileges.
	UserName pulumi.StringOutput `pulumi:"userName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewUserGrant registers a new resource with the given unique name, arguments, and options.
func NewUserGrant(ctx *pulumi.Context,
	name string, args *UserGrantArgs, opts ...pulumi.ResourceOption) (*UserGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Privilege == nil {
		return nil, errors.New("invalid value for required argument 'Privilege'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserGrant
	err := ctx.RegisterResource("snowflake:index/userGrant:UserGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserGrant gets an existing UserGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserGrantState, opts ...pulumi.ResourceOption) (*UserGrant, error) {
	var resource UserGrant
	err := ctx.ReadResource("snowflake:index/userGrant:UserGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserGrant resources.
type userGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the user. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the user on which to grant privileges.
	UserName *string `pulumi:"userName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type UserGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the user. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the user on which to grant privileges.
	UserName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (UserGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*userGrantState)(nil)).Elem()
}

type userGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the user. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the user on which to grant privileges.
	UserName string `pulumi:"userName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a UserGrant resource.
type UserGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the user. To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the user on which to grant privileges.
	UserName pulumi.StringInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (UserGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userGrantArgs)(nil)).Elem()
}

type UserGrantInput interface {
	pulumi.Input

	ToUserGrantOutput() UserGrantOutput
	ToUserGrantOutputWithContext(ctx context.Context) UserGrantOutput
}

func (*UserGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGrant)(nil)).Elem()
}

func (i *UserGrant) ToUserGrantOutput() UserGrantOutput {
	return i.ToUserGrantOutputWithContext(context.Background())
}

func (i *UserGrant) ToUserGrantOutputWithContext(ctx context.Context) UserGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGrantOutput)
}

// UserGrantArrayInput is an input type that accepts UserGrantArray and UserGrantArrayOutput values.
// You can construct a concrete instance of `UserGrantArrayInput` via:
//
//	UserGrantArray{ UserGrantArgs{...} }
type UserGrantArrayInput interface {
	pulumi.Input

	ToUserGrantArrayOutput() UserGrantArrayOutput
	ToUserGrantArrayOutputWithContext(context.Context) UserGrantArrayOutput
}

type UserGrantArray []UserGrantInput

func (UserGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGrant)(nil)).Elem()
}

func (i UserGrantArray) ToUserGrantArrayOutput() UserGrantArrayOutput {
	return i.ToUserGrantArrayOutputWithContext(context.Background())
}

func (i UserGrantArray) ToUserGrantArrayOutputWithContext(ctx context.Context) UserGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGrantArrayOutput)
}

// UserGrantMapInput is an input type that accepts UserGrantMap and UserGrantMapOutput values.
// You can construct a concrete instance of `UserGrantMapInput` via:
//
//	UserGrantMap{ "key": UserGrantArgs{...} }
type UserGrantMapInput interface {
	pulumi.Input

	ToUserGrantMapOutput() UserGrantMapOutput
	ToUserGrantMapOutputWithContext(context.Context) UserGrantMapOutput
}

type UserGrantMap map[string]UserGrantInput

func (UserGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGrant)(nil)).Elem()
}

func (i UserGrantMap) ToUserGrantMapOutput() UserGrantMapOutput {
	return i.ToUserGrantMapOutputWithContext(context.Background())
}

func (i UserGrantMap) ToUserGrantMapOutputWithContext(ctx context.Context) UserGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGrantMapOutput)
}

type UserGrantOutput struct{ *pulumi.OutputState }

func (UserGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGrant)(nil)).Elem()
}

func (o UserGrantOutput) ToUserGrantOutput() UserGrantOutput {
	return o
}

func (o UserGrantOutput) ToUserGrantOutputWithContext(ctx context.Context) UserGrantOutput {
	return o
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o UserGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *UserGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the user. To grant all privileges, use the value `ALL PRIVILEGES`.
func (o UserGrantOutput) Privilege() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGrant) pulumi.StringOutput { return v.Privilege }).(pulumi.StringOutput)
}

// Grants privilege to these roles.
func (o UserGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *UserGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the user on which to grant privileges.
func (o UserGrantOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGrant) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o UserGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *UserGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type UserGrantArrayOutput struct{ *pulumi.OutputState }

func (UserGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGrant)(nil)).Elem()
}

func (o UserGrantArrayOutput) ToUserGrantArrayOutput() UserGrantArrayOutput {
	return o
}

func (o UserGrantArrayOutput) ToUserGrantArrayOutputWithContext(ctx context.Context) UserGrantArrayOutput {
	return o
}

func (o UserGrantArrayOutput) Index(i pulumi.IntInput) UserGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserGrant {
		return vs[0].([]*UserGrant)[vs[1].(int)]
	}).(UserGrantOutput)
}

type UserGrantMapOutput struct{ *pulumi.OutputState }

func (UserGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGrant)(nil)).Elem()
}

func (o UserGrantMapOutput) ToUserGrantMapOutput() UserGrantMapOutput {
	return o
}

func (o UserGrantMapOutput) ToUserGrantMapOutputWithContext(ctx context.Context) UserGrantMapOutput {
	return o
}

func (o UserGrantMapOutput) MapIndex(k pulumi.StringInput) UserGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserGrant {
		return vs[0].(map[string]*UserGrant)[vs[1].(string)]
	}).(UserGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserGrantInput)(nil)).Elem(), &UserGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGrantArrayInput)(nil)).Elem(), UserGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGrantMapInput)(nil)).Elem(), UserGrantMap{})
	pulumi.RegisterOutputType(UserGrantOutput{})
	pulumi.RegisterOutputType(UserGrantArrayOutput{})
	pulumi.RegisterOutputType(UserGrantMapOutput{})
}
