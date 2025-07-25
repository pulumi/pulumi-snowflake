// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ```sh
// $ pulumi import snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment example "MY_DATABASE|MY_SCHEMA|PASSWORD_POLICY_NAME|USER_NAME"
// ```
type UserPasswordPolicyAttachment struct {
	pulumi.CustomResourceState

	// Fully qualified name of the password policy
	PasswordPolicyName pulumi.StringOutput `pulumi:"passwordPolicyName"`
	// User name of the user you want to attach the password policy to
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewUserPasswordPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewUserPasswordPolicyAttachment(ctx *pulumi.Context,
	name string, args *UserPasswordPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*UserPasswordPolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PasswordPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'PasswordPolicyName'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserPasswordPolicyAttachment
	err := ctx.RegisterResource("snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserPasswordPolicyAttachment gets an existing UserPasswordPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserPasswordPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserPasswordPolicyAttachmentState, opts ...pulumi.ResourceOption) (*UserPasswordPolicyAttachment, error) {
	var resource UserPasswordPolicyAttachment
	err := ctx.ReadResource("snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserPasswordPolicyAttachment resources.
type userPasswordPolicyAttachmentState struct {
	// Fully qualified name of the password policy
	PasswordPolicyName *string `pulumi:"passwordPolicyName"`
	// User name of the user you want to attach the password policy to
	UserName *string `pulumi:"userName"`
}

type UserPasswordPolicyAttachmentState struct {
	// Fully qualified name of the password policy
	PasswordPolicyName pulumi.StringPtrInput
	// User name of the user you want to attach the password policy to
	UserName pulumi.StringPtrInput
}

func (UserPasswordPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*userPasswordPolicyAttachmentState)(nil)).Elem()
}

type userPasswordPolicyAttachmentArgs struct {
	// Fully qualified name of the password policy
	PasswordPolicyName string `pulumi:"passwordPolicyName"`
	// User name of the user you want to attach the password policy to
	UserName string `pulumi:"userName"`
}

// The set of arguments for constructing a UserPasswordPolicyAttachment resource.
type UserPasswordPolicyAttachmentArgs struct {
	// Fully qualified name of the password policy
	PasswordPolicyName pulumi.StringInput
	// User name of the user you want to attach the password policy to
	UserName pulumi.StringInput
}

func (UserPasswordPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userPasswordPolicyAttachmentArgs)(nil)).Elem()
}

type UserPasswordPolicyAttachmentInput interface {
	pulumi.Input

	ToUserPasswordPolicyAttachmentOutput() UserPasswordPolicyAttachmentOutput
	ToUserPasswordPolicyAttachmentOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentOutput
}

func (*UserPasswordPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPasswordPolicyAttachment)(nil)).Elem()
}

func (i *UserPasswordPolicyAttachment) ToUserPasswordPolicyAttachmentOutput() UserPasswordPolicyAttachmentOutput {
	return i.ToUserPasswordPolicyAttachmentOutputWithContext(context.Background())
}

func (i *UserPasswordPolicyAttachment) ToUserPasswordPolicyAttachmentOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPasswordPolicyAttachmentOutput)
}

// UserPasswordPolicyAttachmentArrayInput is an input type that accepts UserPasswordPolicyAttachmentArray and UserPasswordPolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `UserPasswordPolicyAttachmentArrayInput` via:
//
//	UserPasswordPolicyAttachmentArray{ UserPasswordPolicyAttachmentArgs{...} }
type UserPasswordPolicyAttachmentArrayInput interface {
	pulumi.Input

	ToUserPasswordPolicyAttachmentArrayOutput() UserPasswordPolicyAttachmentArrayOutput
	ToUserPasswordPolicyAttachmentArrayOutputWithContext(context.Context) UserPasswordPolicyAttachmentArrayOutput
}

type UserPasswordPolicyAttachmentArray []UserPasswordPolicyAttachmentInput

func (UserPasswordPolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPasswordPolicyAttachment)(nil)).Elem()
}

func (i UserPasswordPolicyAttachmentArray) ToUserPasswordPolicyAttachmentArrayOutput() UserPasswordPolicyAttachmentArrayOutput {
	return i.ToUserPasswordPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i UserPasswordPolicyAttachmentArray) ToUserPasswordPolicyAttachmentArrayOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPasswordPolicyAttachmentArrayOutput)
}

// UserPasswordPolicyAttachmentMapInput is an input type that accepts UserPasswordPolicyAttachmentMap and UserPasswordPolicyAttachmentMapOutput values.
// You can construct a concrete instance of `UserPasswordPolicyAttachmentMapInput` via:
//
//	UserPasswordPolicyAttachmentMap{ "key": UserPasswordPolicyAttachmentArgs{...} }
type UserPasswordPolicyAttachmentMapInput interface {
	pulumi.Input

	ToUserPasswordPolicyAttachmentMapOutput() UserPasswordPolicyAttachmentMapOutput
	ToUserPasswordPolicyAttachmentMapOutputWithContext(context.Context) UserPasswordPolicyAttachmentMapOutput
}

type UserPasswordPolicyAttachmentMap map[string]UserPasswordPolicyAttachmentInput

func (UserPasswordPolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPasswordPolicyAttachment)(nil)).Elem()
}

func (i UserPasswordPolicyAttachmentMap) ToUserPasswordPolicyAttachmentMapOutput() UserPasswordPolicyAttachmentMapOutput {
	return i.ToUserPasswordPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i UserPasswordPolicyAttachmentMap) ToUserPasswordPolicyAttachmentMapOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPasswordPolicyAttachmentMapOutput)
}

type UserPasswordPolicyAttachmentOutput struct{ *pulumi.OutputState }

func (UserPasswordPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPasswordPolicyAttachment)(nil)).Elem()
}

func (o UserPasswordPolicyAttachmentOutput) ToUserPasswordPolicyAttachmentOutput() UserPasswordPolicyAttachmentOutput {
	return o
}

func (o UserPasswordPolicyAttachmentOutput) ToUserPasswordPolicyAttachmentOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentOutput {
	return o
}

// Fully qualified name of the password policy
func (o UserPasswordPolicyAttachmentOutput) PasswordPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPasswordPolicyAttachment) pulumi.StringOutput { return v.PasswordPolicyName }).(pulumi.StringOutput)
}

// User name of the user you want to attach the password policy to
func (o UserPasswordPolicyAttachmentOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPasswordPolicyAttachment) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type UserPasswordPolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (UserPasswordPolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPasswordPolicyAttachment)(nil)).Elem()
}

func (o UserPasswordPolicyAttachmentArrayOutput) ToUserPasswordPolicyAttachmentArrayOutput() UserPasswordPolicyAttachmentArrayOutput {
	return o
}

func (o UserPasswordPolicyAttachmentArrayOutput) ToUserPasswordPolicyAttachmentArrayOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentArrayOutput {
	return o
}

func (o UserPasswordPolicyAttachmentArrayOutput) Index(i pulumi.IntInput) UserPasswordPolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserPasswordPolicyAttachment {
		return vs[0].([]*UserPasswordPolicyAttachment)[vs[1].(int)]
	}).(UserPasswordPolicyAttachmentOutput)
}

type UserPasswordPolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (UserPasswordPolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPasswordPolicyAttachment)(nil)).Elem()
}

func (o UserPasswordPolicyAttachmentMapOutput) ToUserPasswordPolicyAttachmentMapOutput() UserPasswordPolicyAttachmentMapOutput {
	return o
}

func (o UserPasswordPolicyAttachmentMapOutput) ToUserPasswordPolicyAttachmentMapOutputWithContext(ctx context.Context) UserPasswordPolicyAttachmentMapOutput {
	return o
}

func (o UserPasswordPolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) UserPasswordPolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserPasswordPolicyAttachment {
		return vs[0].(map[string]*UserPasswordPolicyAttachment)[vs[1].(string)]
	}).(UserPasswordPolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserPasswordPolicyAttachmentInput)(nil)).Elem(), &UserPasswordPolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPasswordPolicyAttachmentArrayInput)(nil)).Elem(), UserPasswordPolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPasswordPolicyAttachmentMapInput)(nil)).Elem(), UserPasswordPolicyAttachmentMap{})
	pulumi.RegisterOutputType(UserPasswordPolicyAttachmentOutput{})
	pulumi.RegisterOutputType(UserPasswordPolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(UserPasswordPolicyAttachmentMapOutput{})
}
