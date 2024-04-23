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

// Specifies the password policy to use for the current account. To set the password policy of a different account, use a provider alias.
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
//			_, err := snowflake.NewPasswordPolicy(ctx, "default", &snowflake.PasswordPolicyArgs{
//				Database: pulumi.String("prod"),
//				Schema:   pulumi.String("security"),
//				Name:     pulumi.String("default_policy"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewAccountPasswordPolicyAttachment(ctx, "attachment", &snowflake.AccountPasswordPolicyAttachmentArgs{
//				PasswordPolicy: _default.QualifiedName,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AccountPasswordPolicyAttachment struct {
	pulumi.CustomResourceState

	// Qualified name (`"db"."schema"."policyName"`) of the password policy to apply to the current account.
	PasswordPolicy pulumi.StringOutput `pulumi:"passwordPolicy"`
}

// NewAccountPasswordPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewAccountPasswordPolicyAttachment(ctx *pulumi.Context,
	name string, args *AccountPasswordPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*AccountPasswordPolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PasswordPolicy == nil {
		return nil, errors.New("invalid value for required argument 'PasswordPolicy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccountPasswordPolicyAttachment
	err := ctx.RegisterResource("snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountPasswordPolicyAttachment gets an existing AccountPasswordPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountPasswordPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountPasswordPolicyAttachmentState, opts ...pulumi.ResourceOption) (*AccountPasswordPolicyAttachment, error) {
	var resource AccountPasswordPolicyAttachment
	err := ctx.ReadResource("snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountPasswordPolicyAttachment resources.
type accountPasswordPolicyAttachmentState struct {
	// Qualified name (`"db"."schema"."policyName"`) of the password policy to apply to the current account.
	PasswordPolicy *string `pulumi:"passwordPolicy"`
}

type AccountPasswordPolicyAttachmentState struct {
	// Qualified name (`"db"."schema"."policyName"`) of the password policy to apply to the current account.
	PasswordPolicy pulumi.StringPtrInput
}

func (AccountPasswordPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountPasswordPolicyAttachmentState)(nil)).Elem()
}

type accountPasswordPolicyAttachmentArgs struct {
	// Qualified name (`"db"."schema"."policyName"`) of the password policy to apply to the current account.
	PasswordPolicy string `pulumi:"passwordPolicy"`
}

// The set of arguments for constructing a AccountPasswordPolicyAttachment resource.
type AccountPasswordPolicyAttachmentArgs struct {
	// Qualified name (`"db"."schema"."policyName"`) of the password policy to apply to the current account.
	PasswordPolicy pulumi.StringInput
}

func (AccountPasswordPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountPasswordPolicyAttachmentArgs)(nil)).Elem()
}

type AccountPasswordPolicyAttachmentInput interface {
	pulumi.Input

	ToAccountPasswordPolicyAttachmentOutput() AccountPasswordPolicyAttachmentOutput
	ToAccountPasswordPolicyAttachmentOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentOutput
}

func (*AccountPasswordPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountPasswordPolicyAttachment)(nil)).Elem()
}

func (i *AccountPasswordPolicyAttachment) ToAccountPasswordPolicyAttachmentOutput() AccountPasswordPolicyAttachmentOutput {
	return i.ToAccountPasswordPolicyAttachmentOutputWithContext(context.Background())
}

func (i *AccountPasswordPolicyAttachment) ToAccountPasswordPolicyAttachmentOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountPasswordPolicyAttachmentOutput)
}

// AccountPasswordPolicyAttachmentArrayInput is an input type that accepts AccountPasswordPolicyAttachmentArray and AccountPasswordPolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `AccountPasswordPolicyAttachmentArrayInput` via:
//
//	AccountPasswordPolicyAttachmentArray{ AccountPasswordPolicyAttachmentArgs{...} }
type AccountPasswordPolicyAttachmentArrayInput interface {
	pulumi.Input

	ToAccountPasswordPolicyAttachmentArrayOutput() AccountPasswordPolicyAttachmentArrayOutput
	ToAccountPasswordPolicyAttachmentArrayOutputWithContext(context.Context) AccountPasswordPolicyAttachmentArrayOutput
}

type AccountPasswordPolicyAttachmentArray []AccountPasswordPolicyAttachmentInput

func (AccountPasswordPolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountPasswordPolicyAttachment)(nil)).Elem()
}

func (i AccountPasswordPolicyAttachmentArray) ToAccountPasswordPolicyAttachmentArrayOutput() AccountPasswordPolicyAttachmentArrayOutput {
	return i.ToAccountPasswordPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i AccountPasswordPolicyAttachmentArray) ToAccountPasswordPolicyAttachmentArrayOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountPasswordPolicyAttachmentArrayOutput)
}

// AccountPasswordPolicyAttachmentMapInput is an input type that accepts AccountPasswordPolicyAttachmentMap and AccountPasswordPolicyAttachmentMapOutput values.
// You can construct a concrete instance of `AccountPasswordPolicyAttachmentMapInput` via:
//
//	AccountPasswordPolicyAttachmentMap{ "key": AccountPasswordPolicyAttachmentArgs{...} }
type AccountPasswordPolicyAttachmentMapInput interface {
	pulumi.Input

	ToAccountPasswordPolicyAttachmentMapOutput() AccountPasswordPolicyAttachmentMapOutput
	ToAccountPasswordPolicyAttachmentMapOutputWithContext(context.Context) AccountPasswordPolicyAttachmentMapOutput
}

type AccountPasswordPolicyAttachmentMap map[string]AccountPasswordPolicyAttachmentInput

func (AccountPasswordPolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountPasswordPolicyAttachment)(nil)).Elem()
}

func (i AccountPasswordPolicyAttachmentMap) ToAccountPasswordPolicyAttachmentMapOutput() AccountPasswordPolicyAttachmentMapOutput {
	return i.ToAccountPasswordPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i AccountPasswordPolicyAttachmentMap) ToAccountPasswordPolicyAttachmentMapOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountPasswordPolicyAttachmentMapOutput)
}

type AccountPasswordPolicyAttachmentOutput struct{ *pulumi.OutputState }

func (AccountPasswordPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountPasswordPolicyAttachment)(nil)).Elem()
}

func (o AccountPasswordPolicyAttachmentOutput) ToAccountPasswordPolicyAttachmentOutput() AccountPasswordPolicyAttachmentOutput {
	return o
}

func (o AccountPasswordPolicyAttachmentOutput) ToAccountPasswordPolicyAttachmentOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentOutput {
	return o
}

// Qualified name (`"db"."schema"."policyName"`) of the password policy to apply to the current account.
func (o AccountPasswordPolicyAttachmentOutput) PasswordPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountPasswordPolicyAttachment) pulumi.StringOutput { return v.PasswordPolicy }).(pulumi.StringOutput)
}

type AccountPasswordPolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (AccountPasswordPolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountPasswordPolicyAttachment)(nil)).Elem()
}

func (o AccountPasswordPolicyAttachmentArrayOutput) ToAccountPasswordPolicyAttachmentArrayOutput() AccountPasswordPolicyAttachmentArrayOutput {
	return o
}

func (o AccountPasswordPolicyAttachmentArrayOutput) ToAccountPasswordPolicyAttachmentArrayOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentArrayOutput {
	return o
}

func (o AccountPasswordPolicyAttachmentArrayOutput) Index(i pulumi.IntInput) AccountPasswordPolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccountPasswordPolicyAttachment {
		return vs[0].([]*AccountPasswordPolicyAttachment)[vs[1].(int)]
	}).(AccountPasswordPolicyAttachmentOutput)
}

type AccountPasswordPolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (AccountPasswordPolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountPasswordPolicyAttachment)(nil)).Elem()
}

func (o AccountPasswordPolicyAttachmentMapOutput) ToAccountPasswordPolicyAttachmentMapOutput() AccountPasswordPolicyAttachmentMapOutput {
	return o
}

func (o AccountPasswordPolicyAttachmentMapOutput) ToAccountPasswordPolicyAttachmentMapOutputWithContext(ctx context.Context) AccountPasswordPolicyAttachmentMapOutput {
	return o
}

func (o AccountPasswordPolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) AccountPasswordPolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccountPasswordPolicyAttachment {
		return vs[0].(map[string]*AccountPasswordPolicyAttachment)[vs[1].(string)]
	}).(AccountPasswordPolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountPasswordPolicyAttachmentInput)(nil)).Elem(), &AccountPasswordPolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountPasswordPolicyAttachmentArrayInput)(nil)).Elem(), AccountPasswordPolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountPasswordPolicyAttachmentMapInput)(nil)).Elem(), AccountPasswordPolicyAttachmentMap{})
	pulumi.RegisterOutputType(AccountPasswordPolicyAttachmentOutput{})
	pulumi.RegisterOutputType(AccountPasswordPolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(AccountPasswordPolicyAttachmentMapOutput{})
}
