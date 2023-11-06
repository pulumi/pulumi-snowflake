// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type UserPublicKeys struct {
	pulumi.CustomResourceState

	// Name of the user.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey pulumi.StringPtrOutput `pulumi:"rsaPublicKey"`
	// Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 pulumi.StringPtrOutput `pulumi:"rsaPublicKey2"`
}

// NewUserPublicKeys registers a new resource with the given unique name, arguments, and options.
func NewUserPublicKeys(ctx *pulumi.Context,
	name string, args *UserPublicKeysArgs, opts ...pulumi.ResourceOption) (*UserPublicKeys, error) {
	if args == nil {
		args = &UserPublicKeysArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserPublicKeys
	err := ctx.RegisterResource("snowflake:index/userPublicKeys:UserPublicKeys", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserPublicKeys gets an existing UserPublicKeys resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserPublicKeys(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserPublicKeysState, opts ...pulumi.ResourceOption) (*UserPublicKeys, error) {
	var resource UserPublicKeys
	err := ctx.ReadResource("snowflake:index/userPublicKeys:UserPublicKeys", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserPublicKeys resources.
type userPublicKeysState struct {
	// Name of the user.
	Name *string `pulumi:"name"`
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey *string `pulumi:"rsaPublicKey"`
	// Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 *string `pulumi:"rsaPublicKey2"`
}

type UserPublicKeysState struct {
	// Name of the user.
	Name pulumi.StringPtrInput
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey pulumi.StringPtrInput
	// Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 pulumi.StringPtrInput
}

func (UserPublicKeysState) ElementType() reflect.Type {
	return reflect.TypeOf((*userPublicKeysState)(nil)).Elem()
}

type userPublicKeysArgs struct {
	// Name of the user.
	Name *string `pulumi:"name"`
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey *string `pulumi:"rsaPublicKey"`
	// Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 *string `pulumi:"rsaPublicKey2"`
}

// The set of arguments for constructing a UserPublicKeys resource.
type UserPublicKeysArgs struct {
	// Name of the user.
	Name pulumi.StringPtrInput
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey pulumi.StringPtrInput
	// Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 pulumi.StringPtrInput
}

func (UserPublicKeysArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userPublicKeysArgs)(nil)).Elem()
}

type UserPublicKeysInput interface {
	pulumi.Input

	ToUserPublicKeysOutput() UserPublicKeysOutput
	ToUserPublicKeysOutputWithContext(ctx context.Context) UserPublicKeysOutput
}

func (*UserPublicKeys) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPublicKeys)(nil)).Elem()
}

func (i *UserPublicKeys) ToUserPublicKeysOutput() UserPublicKeysOutput {
	return i.ToUserPublicKeysOutputWithContext(context.Background())
}

func (i *UserPublicKeys) ToUserPublicKeysOutputWithContext(ctx context.Context) UserPublicKeysOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPublicKeysOutput)
}

// UserPublicKeysArrayInput is an input type that accepts UserPublicKeysArray and UserPublicKeysArrayOutput values.
// You can construct a concrete instance of `UserPublicKeysArrayInput` via:
//
//	UserPublicKeysArray{ UserPublicKeysArgs{...} }
type UserPublicKeysArrayInput interface {
	pulumi.Input

	ToUserPublicKeysArrayOutput() UserPublicKeysArrayOutput
	ToUserPublicKeysArrayOutputWithContext(context.Context) UserPublicKeysArrayOutput
}

type UserPublicKeysArray []UserPublicKeysInput

func (UserPublicKeysArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPublicKeys)(nil)).Elem()
}

func (i UserPublicKeysArray) ToUserPublicKeysArrayOutput() UserPublicKeysArrayOutput {
	return i.ToUserPublicKeysArrayOutputWithContext(context.Background())
}

func (i UserPublicKeysArray) ToUserPublicKeysArrayOutputWithContext(ctx context.Context) UserPublicKeysArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPublicKeysArrayOutput)
}

// UserPublicKeysMapInput is an input type that accepts UserPublicKeysMap and UserPublicKeysMapOutput values.
// You can construct a concrete instance of `UserPublicKeysMapInput` via:
//
//	UserPublicKeysMap{ "key": UserPublicKeysArgs{...} }
type UserPublicKeysMapInput interface {
	pulumi.Input

	ToUserPublicKeysMapOutput() UserPublicKeysMapOutput
	ToUserPublicKeysMapOutputWithContext(context.Context) UserPublicKeysMapOutput
}

type UserPublicKeysMap map[string]UserPublicKeysInput

func (UserPublicKeysMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPublicKeys)(nil)).Elem()
}

func (i UserPublicKeysMap) ToUserPublicKeysMapOutput() UserPublicKeysMapOutput {
	return i.ToUserPublicKeysMapOutputWithContext(context.Background())
}

func (i UserPublicKeysMap) ToUserPublicKeysMapOutputWithContext(ctx context.Context) UserPublicKeysMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPublicKeysMapOutput)
}

type UserPublicKeysOutput struct{ *pulumi.OutputState }

func (UserPublicKeysOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPublicKeys)(nil)).Elem()
}

func (o UserPublicKeysOutput) ToUserPublicKeysOutput() UserPublicKeysOutput {
	return o
}

func (o UserPublicKeysOutput) ToUserPublicKeysOutputWithContext(ctx context.Context) UserPublicKeysOutput {
	return o
}

// Name of the user.
func (o UserPublicKeysOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPublicKeys) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
func (o UserPublicKeysOutput) RsaPublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserPublicKeys) pulumi.StringPtrOutput { return v.RsaPublicKey }).(pulumi.StringPtrOutput)
}

// Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
func (o UserPublicKeysOutput) RsaPublicKey2() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserPublicKeys) pulumi.StringPtrOutput { return v.RsaPublicKey2 }).(pulumi.StringPtrOutput)
}

type UserPublicKeysArrayOutput struct{ *pulumi.OutputState }

func (UserPublicKeysArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPublicKeys)(nil)).Elem()
}

func (o UserPublicKeysArrayOutput) ToUserPublicKeysArrayOutput() UserPublicKeysArrayOutput {
	return o
}

func (o UserPublicKeysArrayOutput) ToUserPublicKeysArrayOutputWithContext(ctx context.Context) UserPublicKeysArrayOutput {
	return o
}

func (o UserPublicKeysArrayOutput) Index(i pulumi.IntInput) UserPublicKeysOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserPublicKeys {
		return vs[0].([]*UserPublicKeys)[vs[1].(int)]
	}).(UserPublicKeysOutput)
}

type UserPublicKeysMapOutput struct{ *pulumi.OutputState }

func (UserPublicKeysMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPublicKeys)(nil)).Elem()
}

func (o UserPublicKeysMapOutput) ToUserPublicKeysMapOutput() UserPublicKeysMapOutput {
	return o
}

func (o UserPublicKeysMapOutput) ToUserPublicKeysMapOutputWithContext(ctx context.Context) UserPublicKeysMapOutput {
	return o
}

func (o UserPublicKeysMapOutput) MapIndex(k pulumi.StringInput) UserPublicKeysOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserPublicKeys {
		return vs[0].(map[string]*UserPublicKeys)[vs[1].(string)]
	}).(UserPublicKeysOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserPublicKeysInput)(nil)).Elem(), &UserPublicKeys{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPublicKeysArrayInput)(nil)).Elem(), UserPublicKeysArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPublicKeysMapInput)(nil)).Elem(), UserPublicKeysMap{})
	pulumi.RegisterOutputType(UserPublicKeysOutput{})
	pulumi.RegisterOutputType(UserPublicKeysArrayOutput{})
	pulumi.RegisterOutputType(UserPublicKeysMapOutput{})
}
