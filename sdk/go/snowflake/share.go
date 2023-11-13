// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

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
//			_, err := snowflake.NewShare(ctx, "test", &snowflake.ShareArgs{
//				Accounts: pulumi.StringArray{
//					pulumi.String("organizationName.accountName"),
//				},
//				Comment: pulumi.String("cool comment"),
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
// ```sh
//
//	$ pulumi import snowflake:index/share:Share example name
//
// ```
type Share struct {
	pulumi.CustomResourceState

	// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
	Accounts pulumi.StringArrayOutput `pulumi:"accounts"`
	// Specifies a comment for the managed account.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the identifier for the share; must be unique for the account in which the share is created.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewShare registers a new resource with the given unique name, arguments, and options.
func NewShare(ctx *pulumi.Context,
	name string, args *ShareArgs, opts ...pulumi.ResourceOption) (*Share, error) {
	if args == nil {
		args = &ShareArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Share
	err := ctx.RegisterResource("snowflake:index/share:Share", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetShare gets an existing Share resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetShare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ShareState, opts ...pulumi.ResourceOption) (*Share, error) {
	var resource Share
	err := ctx.ReadResource("snowflake:index/share:Share", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Share resources.
type shareState struct {
	// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
	Accounts []string `pulumi:"accounts"`
	// Specifies a comment for the managed account.
	Comment *string `pulumi:"comment"`
	// Specifies the identifier for the share; must be unique for the account in which the share is created.
	Name *string `pulumi:"name"`
}

type ShareState struct {
	// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
	Accounts pulumi.StringArrayInput
	// Specifies a comment for the managed account.
	Comment pulumi.StringPtrInput
	// Specifies the identifier for the share; must be unique for the account in which the share is created.
	Name pulumi.StringPtrInput
}

func (ShareState) ElementType() reflect.Type {
	return reflect.TypeOf((*shareState)(nil)).Elem()
}

type shareArgs struct {
	// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
	Accounts []string `pulumi:"accounts"`
	// Specifies a comment for the managed account.
	Comment *string `pulumi:"comment"`
	// Specifies the identifier for the share; must be unique for the account in which the share is created.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Share resource.
type ShareArgs struct {
	// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
	Accounts pulumi.StringArrayInput
	// Specifies a comment for the managed account.
	Comment pulumi.StringPtrInput
	// Specifies the identifier for the share; must be unique for the account in which the share is created.
	Name pulumi.StringPtrInput
}

func (ShareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*shareArgs)(nil)).Elem()
}

type ShareInput interface {
	pulumi.Input

	ToShareOutput() ShareOutput
	ToShareOutputWithContext(ctx context.Context) ShareOutput
}

func (*Share) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (i *Share) ToShareOutput() ShareOutput {
	return i.ToShareOutputWithContext(context.Background())
}

func (i *Share) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareOutput)
}

// ShareArrayInput is an input type that accepts ShareArray and ShareArrayOutput values.
// You can construct a concrete instance of `ShareArrayInput` via:
//
//	ShareArray{ ShareArgs{...} }
type ShareArrayInput interface {
	pulumi.Input

	ToShareArrayOutput() ShareArrayOutput
	ToShareArrayOutputWithContext(context.Context) ShareArrayOutput
}

type ShareArray []ShareInput

func (ShareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (i ShareArray) ToShareArrayOutput() ShareArrayOutput {
	return i.ToShareArrayOutputWithContext(context.Background())
}

func (i ShareArray) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareArrayOutput)
}

// ShareMapInput is an input type that accepts ShareMap and ShareMapOutput values.
// You can construct a concrete instance of `ShareMapInput` via:
//
//	ShareMap{ "key": ShareArgs{...} }
type ShareMapInput interface {
	pulumi.Input

	ToShareMapOutput() ShareMapOutput
	ToShareMapOutputWithContext(context.Context) ShareMapOutput
}

type ShareMap map[string]ShareInput

func (ShareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (i ShareMap) ToShareMapOutput() ShareMapOutput {
	return i.ToShareMapOutputWithContext(context.Background())
}

func (i ShareMap) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareMapOutput)
}

type ShareOutput struct{ *pulumi.OutputState }

func (ShareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (o ShareOutput) ToShareOutput() ShareOutput {
	return o
}

func (o ShareOutput) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return o
}

// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
func (o ShareOutput) Accounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Share) pulumi.StringArrayOutput { return v.Accounts }).(pulumi.StringArrayOutput)
}

// Specifies a comment for the managed account.
func (o ShareOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Share) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the share; must be unique for the account in which the share is created.
func (o ShareOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ShareArrayOutput struct{ *pulumi.OutputState }

func (ShareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (o ShareArrayOutput) ToShareArrayOutput() ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) Index(i pulumi.IntInput) ShareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Share {
		return vs[0].([]*Share)[vs[1].(int)]
	}).(ShareOutput)
}

type ShareMapOutput struct{ *pulumi.OutputState }

func (ShareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (o ShareMapOutput) ToShareMapOutput() ShareMapOutput {
	return o
}

func (o ShareMapOutput) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return o
}

func (o ShareMapOutput) MapIndex(k pulumi.StringInput) ShareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Share {
		return vs[0].(map[string]*Share)[vs[1].(string)]
	}).(ShareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ShareInput)(nil)).Elem(), &Share{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareArrayInput)(nil)).Elem(), ShareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareMapInput)(nil)).Elem(), ShareMap{})
	pulumi.RegisterOutputType(ShareOutput{})
	pulumi.RegisterOutputType(ShareArrayOutput{})
	pulumi.RegisterOutputType(ShareMapOutput{})
}
