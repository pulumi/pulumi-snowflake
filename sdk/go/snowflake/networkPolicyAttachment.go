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
//
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.NewNetworkPolicyAttachment(ctx, "attach", &snowflake.NetworkPolicyAttachmentArgs{
//				NetworkPolicyName: pulumi.String("policy"),
//				SetForAccount:     pulumi.Bool(false),
//				Users: pulumi.StringArray{
//					pulumi.String("user1"),
//					pulumi.String("user2"),
//				},
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
//	$ pulumi import snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment example attachment_policyname
//
// ```
type NetworkPolicyAttachment struct {
	pulumi.CustomResourceState

	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	NetworkPolicyName pulumi.StringOutput `pulumi:"networkPolicyName"`
	// Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
	// user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
	// Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
	// time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
	// multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
	// non-deterministic.
	SetForAccount pulumi.BoolPtrOutput `pulumi:"setForAccount"`
	// Specifies which users the network policy should be attached to
	Users pulumi.StringArrayOutput `pulumi:"users"`
}

// NewNetworkPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewNetworkPolicyAttachment(ctx *pulumi.Context,
	name string, args *NetworkPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*NetworkPolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'NetworkPolicyName'")
	}
	var resource NetworkPolicyAttachment
	err := ctx.RegisterResource("snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkPolicyAttachment gets an existing NetworkPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkPolicyAttachmentState, opts ...pulumi.ResourceOption) (*NetworkPolicyAttachment, error) {
	var resource NetworkPolicyAttachment
	err := ctx.ReadResource("snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkPolicyAttachment resources.
type networkPolicyAttachmentState struct {
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	NetworkPolicyName *string `pulumi:"networkPolicyName"`
	// Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
	// user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
	// Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
	// time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
	// multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
	// non-deterministic.
	SetForAccount *bool `pulumi:"setForAccount"`
	// Specifies which users the network policy should be attached to
	Users []string `pulumi:"users"`
}

type NetworkPolicyAttachmentState struct {
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	NetworkPolicyName pulumi.StringPtrInput
	// Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
	// user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
	// Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
	// time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
	// multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
	// non-deterministic.
	SetForAccount pulumi.BoolPtrInput
	// Specifies which users the network policy should be attached to
	Users pulumi.StringArrayInput
}

func (NetworkPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPolicyAttachmentState)(nil)).Elem()
}

type networkPolicyAttachmentArgs struct {
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	NetworkPolicyName string `pulumi:"networkPolicyName"`
	// Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
	// user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
	// Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
	// time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
	// multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
	// non-deterministic.
	SetForAccount *bool `pulumi:"setForAccount"`
	// Specifies which users the network policy should be attached to
	Users []string `pulumi:"users"`
}

// The set of arguments for constructing a NetworkPolicyAttachment resource.
type NetworkPolicyAttachmentArgs struct {
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	NetworkPolicyName pulumi.StringInput
	// Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
	// user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
	// Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
	// time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
	// multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
	// non-deterministic.
	SetForAccount pulumi.BoolPtrInput
	// Specifies which users the network policy should be attached to
	Users pulumi.StringArrayInput
}

func (NetworkPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPolicyAttachmentArgs)(nil)).Elem()
}

type NetworkPolicyAttachmentInput interface {
	pulumi.Input

	ToNetworkPolicyAttachmentOutput() NetworkPolicyAttachmentOutput
	ToNetworkPolicyAttachmentOutputWithContext(ctx context.Context) NetworkPolicyAttachmentOutput
}

func (*NetworkPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPolicyAttachment)(nil)).Elem()
}

func (i *NetworkPolicyAttachment) ToNetworkPolicyAttachmentOutput() NetworkPolicyAttachmentOutput {
	return i.ToNetworkPolicyAttachmentOutputWithContext(context.Background())
}

func (i *NetworkPolicyAttachment) ToNetworkPolicyAttachmentOutputWithContext(ctx context.Context) NetworkPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPolicyAttachmentOutput)
}

// NetworkPolicyAttachmentArrayInput is an input type that accepts NetworkPolicyAttachmentArray and NetworkPolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `NetworkPolicyAttachmentArrayInput` via:
//
//	NetworkPolicyAttachmentArray{ NetworkPolicyAttachmentArgs{...} }
type NetworkPolicyAttachmentArrayInput interface {
	pulumi.Input

	ToNetworkPolicyAttachmentArrayOutput() NetworkPolicyAttachmentArrayOutput
	ToNetworkPolicyAttachmentArrayOutputWithContext(context.Context) NetworkPolicyAttachmentArrayOutput
}

type NetworkPolicyAttachmentArray []NetworkPolicyAttachmentInput

func (NetworkPolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPolicyAttachment)(nil)).Elem()
}

func (i NetworkPolicyAttachmentArray) ToNetworkPolicyAttachmentArrayOutput() NetworkPolicyAttachmentArrayOutput {
	return i.ToNetworkPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i NetworkPolicyAttachmentArray) ToNetworkPolicyAttachmentArrayOutputWithContext(ctx context.Context) NetworkPolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPolicyAttachmentArrayOutput)
}

// NetworkPolicyAttachmentMapInput is an input type that accepts NetworkPolicyAttachmentMap and NetworkPolicyAttachmentMapOutput values.
// You can construct a concrete instance of `NetworkPolicyAttachmentMapInput` via:
//
//	NetworkPolicyAttachmentMap{ "key": NetworkPolicyAttachmentArgs{...} }
type NetworkPolicyAttachmentMapInput interface {
	pulumi.Input

	ToNetworkPolicyAttachmentMapOutput() NetworkPolicyAttachmentMapOutput
	ToNetworkPolicyAttachmentMapOutputWithContext(context.Context) NetworkPolicyAttachmentMapOutput
}

type NetworkPolicyAttachmentMap map[string]NetworkPolicyAttachmentInput

func (NetworkPolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPolicyAttachment)(nil)).Elem()
}

func (i NetworkPolicyAttachmentMap) ToNetworkPolicyAttachmentMapOutput() NetworkPolicyAttachmentMapOutput {
	return i.ToNetworkPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i NetworkPolicyAttachmentMap) ToNetworkPolicyAttachmentMapOutputWithContext(ctx context.Context) NetworkPolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPolicyAttachmentMapOutput)
}

type NetworkPolicyAttachmentOutput struct{ *pulumi.OutputState }

func (NetworkPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPolicyAttachment)(nil)).Elem()
}

func (o NetworkPolicyAttachmentOutput) ToNetworkPolicyAttachmentOutput() NetworkPolicyAttachmentOutput {
	return o
}

func (o NetworkPolicyAttachmentOutput) ToNetworkPolicyAttachmentOutputWithContext(ctx context.Context) NetworkPolicyAttachmentOutput {
	return o
}

// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
func (o NetworkPolicyAttachmentOutput) NetworkPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPolicyAttachment) pulumi.StringOutput { return v.NetworkPolicyName }).(pulumi.StringOutput)
}

// Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
// user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
// Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
// time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
// multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
// non-deterministic.
func (o NetworkPolicyAttachmentOutput) SetForAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NetworkPolicyAttachment) pulumi.BoolPtrOutput { return v.SetForAccount }).(pulumi.BoolPtrOutput)
}

// Specifies which users the network policy should be attached to
func (o NetworkPolicyAttachmentOutput) Users() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NetworkPolicyAttachment) pulumi.StringArrayOutput { return v.Users }).(pulumi.StringArrayOutput)
}

type NetworkPolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (NetworkPolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPolicyAttachment)(nil)).Elem()
}

func (o NetworkPolicyAttachmentArrayOutput) ToNetworkPolicyAttachmentArrayOutput() NetworkPolicyAttachmentArrayOutput {
	return o
}

func (o NetworkPolicyAttachmentArrayOutput) ToNetworkPolicyAttachmentArrayOutputWithContext(ctx context.Context) NetworkPolicyAttachmentArrayOutput {
	return o
}

func (o NetworkPolicyAttachmentArrayOutput) Index(i pulumi.IntInput) NetworkPolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkPolicyAttachment {
		return vs[0].([]*NetworkPolicyAttachment)[vs[1].(int)]
	}).(NetworkPolicyAttachmentOutput)
}

type NetworkPolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (NetworkPolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPolicyAttachment)(nil)).Elem()
}

func (o NetworkPolicyAttachmentMapOutput) ToNetworkPolicyAttachmentMapOutput() NetworkPolicyAttachmentMapOutput {
	return o
}

func (o NetworkPolicyAttachmentMapOutput) ToNetworkPolicyAttachmentMapOutputWithContext(ctx context.Context) NetworkPolicyAttachmentMapOutput {
	return o
}

func (o NetworkPolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) NetworkPolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkPolicyAttachment {
		return vs[0].(map[string]*NetworkPolicyAttachment)[vs[1].(string)]
	}).(NetworkPolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPolicyAttachmentInput)(nil)).Elem(), &NetworkPolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPolicyAttachmentArrayInput)(nil)).Elem(), NetworkPolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPolicyAttachmentMapInput)(nil)).Elem(), NetworkPolicyAttachmentMap{})
	pulumi.RegisterOutputType(NetworkPolicyAttachmentOutput{})
	pulumi.RegisterOutputType(NetworkPolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(NetworkPolicyAttachmentMapOutput{})
}
