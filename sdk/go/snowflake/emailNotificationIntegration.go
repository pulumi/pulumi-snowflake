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
// $ pulumi import snowflake:index/emailNotificationIntegration:EmailNotificationIntegration example name
// ```
type EmailNotificationIntegration struct {
	pulumi.CustomResourceState

	// List of email addresses that should receive notifications.
	AllowedRecipients pulumi.StringArrayOutput `pulumi:"allowedRecipients"`
	// A comment for the email integration.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	Enabled pulumi.BoolOutput      `pulumi:"enabled"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	Name               pulumi.StringOutput `pulumi:"name"`
}

// NewEmailNotificationIntegration registers a new resource with the given unique name, arguments, and options.
func NewEmailNotificationIntegration(ctx *pulumi.Context,
	name string, args *EmailNotificationIntegrationArgs, opts ...pulumi.ResourceOption) (*EmailNotificationIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EmailNotificationIntegration
	err := ctx.RegisterResource("snowflake:index/emailNotificationIntegration:EmailNotificationIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailNotificationIntegration gets an existing EmailNotificationIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailNotificationIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailNotificationIntegrationState, opts ...pulumi.ResourceOption) (*EmailNotificationIntegration, error) {
	var resource EmailNotificationIntegration
	err := ctx.ReadResource("snowflake:index/emailNotificationIntegration:EmailNotificationIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailNotificationIntegration resources.
type emailNotificationIntegrationState struct {
	// List of email addresses that should receive notifications.
	AllowedRecipients []string `pulumi:"allowedRecipients"`
	// A comment for the email integration.
	Comment *string `pulumi:"comment"`
	Enabled *bool   `pulumi:"enabled"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	Name               *string `pulumi:"name"`
}

type EmailNotificationIntegrationState struct {
	// List of email addresses that should receive notifications.
	AllowedRecipients pulumi.StringArrayInput
	// A comment for the email integration.
	Comment pulumi.StringPtrInput
	Enabled pulumi.BoolPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	Name               pulumi.StringPtrInput
}

func (EmailNotificationIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailNotificationIntegrationState)(nil)).Elem()
}

type emailNotificationIntegrationArgs struct {
	// List of email addresses that should receive notifications.
	AllowedRecipients []string `pulumi:"allowedRecipients"`
	// A comment for the email integration.
	Comment *string `pulumi:"comment"`
	Enabled bool    `pulumi:"enabled"`
	Name    *string `pulumi:"name"`
}

// The set of arguments for constructing a EmailNotificationIntegration resource.
type EmailNotificationIntegrationArgs struct {
	// List of email addresses that should receive notifications.
	AllowedRecipients pulumi.StringArrayInput
	// A comment for the email integration.
	Comment pulumi.StringPtrInput
	Enabled pulumi.BoolInput
	Name    pulumi.StringPtrInput
}

func (EmailNotificationIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailNotificationIntegrationArgs)(nil)).Elem()
}

type EmailNotificationIntegrationInput interface {
	pulumi.Input

	ToEmailNotificationIntegrationOutput() EmailNotificationIntegrationOutput
	ToEmailNotificationIntegrationOutputWithContext(ctx context.Context) EmailNotificationIntegrationOutput
}

func (*EmailNotificationIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailNotificationIntegration)(nil)).Elem()
}

func (i *EmailNotificationIntegration) ToEmailNotificationIntegrationOutput() EmailNotificationIntegrationOutput {
	return i.ToEmailNotificationIntegrationOutputWithContext(context.Background())
}

func (i *EmailNotificationIntegration) ToEmailNotificationIntegrationOutputWithContext(ctx context.Context) EmailNotificationIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailNotificationIntegrationOutput)
}

// EmailNotificationIntegrationArrayInput is an input type that accepts EmailNotificationIntegrationArray and EmailNotificationIntegrationArrayOutput values.
// You can construct a concrete instance of `EmailNotificationIntegrationArrayInput` via:
//
//	EmailNotificationIntegrationArray{ EmailNotificationIntegrationArgs{...} }
type EmailNotificationIntegrationArrayInput interface {
	pulumi.Input

	ToEmailNotificationIntegrationArrayOutput() EmailNotificationIntegrationArrayOutput
	ToEmailNotificationIntegrationArrayOutputWithContext(context.Context) EmailNotificationIntegrationArrayOutput
}

type EmailNotificationIntegrationArray []EmailNotificationIntegrationInput

func (EmailNotificationIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailNotificationIntegration)(nil)).Elem()
}

func (i EmailNotificationIntegrationArray) ToEmailNotificationIntegrationArrayOutput() EmailNotificationIntegrationArrayOutput {
	return i.ToEmailNotificationIntegrationArrayOutputWithContext(context.Background())
}

func (i EmailNotificationIntegrationArray) ToEmailNotificationIntegrationArrayOutputWithContext(ctx context.Context) EmailNotificationIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailNotificationIntegrationArrayOutput)
}

// EmailNotificationIntegrationMapInput is an input type that accepts EmailNotificationIntegrationMap and EmailNotificationIntegrationMapOutput values.
// You can construct a concrete instance of `EmailNotificationIntegrationMapInput` via:
//
//	EmailNotificationIntegrationMap{ "key": EmailNotificationIntegrationArgs{...} }
type EmailNotificationIntegrationMapInput interface {
	pulumi.Input

	ToEmailNotificationIntegrationMapOutput() EmailNotificationIntegrationMapOutput
	ToEmailNotificationIntegrationMapOutputWithContext(context.Context) EmailNotificationIntegrationMapOutput
}

type EmailNotificationIntegrationMap map[string]EmailNotificationIntegrationInput

func (EmailNotificationIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailNotificationIntegration)(nil)).Elem()
}

func (i EmailNotificationIntegrationMap) ToEmailNotificationIntegrationMapOutput() EmailNotificationIntegrationMapOutput {
	return i.ToEmailNotificationIntegrationMapOutputWithContext(context.Background())
}

func (i EmailNotificationIntegrationMap) ToEmailNotificationIntegrationMapOutputWithContext(ctx context.Context) EmailNotificationIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailNotificationIntegrationMapOutput)
}

type EmailNotificationIntegrationOutput struct{ *pulumi.OutputState }

func (EmailNotificationIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailNotificationIntegration)(nil)).Elem()
}

func (o EmailNotificationIntegrationOutput) ToEmailNotificationIntegrationOutput() EmailNotificationIntegrationOutput {
	return o
}

func (o EmailNotificationIntegrationOutput) ToEmailNotificationIntegrationOutputWithContext(ctx context.Context) EmailNotificationIntegrationOutput {
	return o
}

// List of email addresses that should receive notifications.
func (o EmailNotificationIntegrationOutput) AllowedRecipients() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EmailNotificationIntegration) pulumi.StringArrayOutput { return v.AllowedRecipients }).(pulumi.StringArrayOutput)
}

// A comment for the email integration.
func (o EmailNotificationIntegrationOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EmailNotificationIntegration) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o EmailNotificationIntegrationOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *EmailNotificationIntegration) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o EmailNotificationIntegrationOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailNotificationIntegration) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

func (o EmailNotificationIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailNotificationIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type EmailNotificationIntegrationArrayOutput struct{ *pulumi.OutputState }

func (EmailNotificationIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailNotificationIntegration)(nil)).Elem()
}

func (o EmailNotificationIntegrationArrayOutput) ToEmailNotificationIntegrationArrayOutput() EmailNotificationIntegrationArrayOutput {
	return o
}

func (o EmailNotificationIntegrationArrayOutput) ToEmailNotificationIntegrationArrayOutputWithContext(ctx context.Context) EmailNotificationIntegrationArrayOutput {
	return o
}

func (o EmailNotificationIntegrationArrayOutput) Index(i pulumi.IntInput) EmailNotificationIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailNotificationIntegration {
		return vs[0].([]*EmailNotificationIntegration)[vs[1].(int)]
	}).(EmailNotificationIntegrationOutput)
}

type EmailNotificationIntegrationMapOutput struct{ *pulumi.OutputState }

func (EmailNotificationIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailNotificationIntegration)(nil)).Elem()
}

func (o EmailNotificationIntegrationMapOutput) ToEmailNotificationIntegrationMapOutput() EmailNotificationIntegrationMapOutput {
	return o
}

func (o EmailNotificationIntegrationMapOutput) ToEmailNotificationIntegrationMapOutputWithContext(ctx context.Context) EmailNotificationIntegrationMapOutput {
	return o
}

func (o EmailNotificationIntegrationMapOutput) MapIndex(k pulumi.StringInput) EmailNotificationIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailNotificationIntegration {
		return vs[0].(map[string]*EmailNotificationIntegration)[vs[1].(string)]
	}).(EmailNotificationIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailNotificationIntegrationInput)(nil)).Elem(), &EmailNotificationIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailNotificationIntegrationArrayInput)(nil)).Elem(), EmailNotificationIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailNotificationIntegrationMapInput)(nil)).Elem(), EmailNotificationIntegrationMap{})
	pulumi.RegisterOutputType(EmailNotificationIntegrationOutput{})
	pulumi.RegisterOutputType(EmailNotificationIntegrationArrayOutput{})
	pulumi.RegisterOutputType(EmailNotificationIntegrationMapOutput{})
}
