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
//			_, err := snowflake.NewNetworkPolicy(ctx, "policy", &snowflake.NetworkPolicyArgs{
//				AllowedIpLists: pulumi.StringArray{
//					pulumi.String("192.168.0.100/24"),
//				},
//				BlockedIpLists: pulumi.StringArray{
//					pulumi.String("192.168.0.101"),
//				},
//				Comment: pulumi.String("A policy."),
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
// $ pulumi import snowflake:index/networkPolicy:NetworkPolicy example policyname
// ```
type NetworkPolicy struct {
	pulumi.CustomResourceState

	// Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
	AllowedIpLists pulumi.StringArrayOutput `pulumi:"allowedIpLists"`
	// Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
	BlockedIpLists pulumi.StringArrayOutput `pulumi:"blockedIpLists"`
	// Specifies a comment for the network policy.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewNetworkPolicy registers a new resource with the given unique name, arguments, and options.
func NewNetworkPolicy(ctx *pulumi.Context,
	name string, args *NetworkPolicyArgs, opts ...pulumi.ResourceOption) (*NetworkPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AllowedIpLists == nil {
		return nil, errors.New("invalid value for required argument 'AllowedIpLists'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetworkPolicy
	err := ctx.RegisterResource("snowflake:index/networkPolicy:NetworkPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkPolicy gets an existing NetworkPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkPolicyState, opts ...pulumi.ResourceOption) (*NetworkPolicy, error) {
	var resource NetworkPolicy
	err := ctx.ReadResource("snowflake:index/networkPolicy:NetworkPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkPolicy resources.
type networkPolicyState struct {
	// Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
	AllowedIpLists []string `pulumi:"allowedIpLists"`
	// Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
	BlockedIpLists []string `pulumi:"blockedIpLists"`
	// Specifies a comment for the network policy.
	Comment *string `pulumi:"comment"`
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	Name *string `pulumi:"name"`
}

type NetworkPolicyState struct {
	// Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
	AllowedIpLists pulumi.StringArrayInput
	// Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
	BlockedIpLists pulumi.StringArrayInput
	// Specifies a comment for the network policy.
	Comment pulumi.StringPtrInput
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	Name pulumi.StringPtrInput
}

func (NetworkPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPolicyState)(nil)).Elem()
}

type networkPolicyArgs struct {
	// Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
	AllowedIpLists []string `pulumi:"allowedIpLists"`
	// Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
	BlockedIpLists []string `pulumi:"blockedIpLists"`
	// Specifies a comment for the network policy.
	Comment *string `pulumi:"comment"`
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a NetworkPolicy resource.
type NetworkPolicyArgs struct {
	// Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
	AllowedIpLists pulumi.StringArrayInput
	// Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
	BlockedIpLists pulumi.StringArrayInput
	// Specifies a comment for the network policy.
	Comment pulumi.StringPtrInput
	// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
	Name pulumi.StringPtrInput
}

func (NetworkPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPolicyArgs)(nil)).Elem()
}

type NetworkPolicyInput interface {
	pulumi.Input

	ToNetworkPolicyOutput() NetworkPolicyOutput
	ToNetworkPolicyOutputWithContext(ctx context.Context) NetworkPolicyOutput
}

func (*NetworkPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPolicy)(nil)).Elem()
}

func (i *NetworkPolicy) ToNetworkPolicyOutput() NetworkPolicyOutput {
	return i.ToNetworkPolicyOutputWithContext(context.Background())
}

func (i *NetworkPolicy) ToNetworkPolicyOutputWithContext(ctx context.Context) NetworkPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPolicyOutput)
}

// NetworkPolicyArrayInput is an input type that accepts NetworkPolicyArray and NetworkPolicyArrayOutput values.
// You can construct a concrete instance of `NetworkPolicyArrayInput` via:
//
//	NetworkPolicyArray{ NetworkPolicyArgs{...} }
type NetworkPolicyArrayInput interface {
	pulumi.Input

	ToNetworkPolicyArrayOutput() NetworkPolicyArrayOutput
	ToNetworkPolicyArrayOutputWithContext(context.Context) NetworkPolicyArrayOutput
}

type NetworkPolicyArray []NetworkPolicyInput

func (NetworkPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPolicy)(nil)).Elem()
}

func (i NetworkPolicyArray) ToNetworkPolicyArrayOutput() NetworkPolicyArrayOutput {
	return i.ToNetworkPolicyArrayOutputWithContext(context.Background())
}

func (i NetworkPolicyArray) ToNetworkPolicyArrayOutputWithContext(ctx context.Context) NetworkPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPolicyArrayOutput)
}

// NetworkPolicyMapInput is an input type that accepts NetworkPolicyMap and NetworkPolicyMapOutput values.
// You can construct a concrete instance of `NetworkPolicyMapInput` via:
//
//	NetworkPolicyMap{ "key": NetworkPolicyArgs{...} }
type NetworkPolicyMapInput interface {
	pulumi.Input

	ToNetworkPolicyMapOutput() NetworkPolicyMapOutput
	ToNetworkPolicyMapOutputWithContext(context.Context) NetworkPolicyMapOutput
}

type NetworkPolicyMap map[string]NetworkPolicyInput

func (NetworkPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPolicy)(nil)).Elem()
}

func (i NetworkPolicyMap) ToNetworkPolicyMapOutput() NetworkPolicyMapOutput {
	return i.ToNetworkPolicyMapOutputWithContext(context.Background())
}

func (i NetworkPolicyMap) ToNetworkPolicyMapOutputWithContext(ctx context.Context) NetworkPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPolicyMapOutput)
}

type NetworkPolicyOutput struct{ *pulumi.OutputState }

func (NetworkPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPolicy)(nil)).Elem()
}

func (o NetworkPolicyOutput) ToNetworkPolicyOutput() NetworkPolicyOutput {
	return o
}

func (o NetworkPolicyOutput) ToNetworkPolicyOutputWithContext(ctx context.Context) NetworkPolicyOutput {
	return o
}

// Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
func (o NetworkPolicyOutput) AllowedIpLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NetworkPolicy) pulumi.StringArrayOutput { return v.AllowedIpLists }).(pulumi.StringArrayOutput)
}

// Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
func (o NetworkPolicyOutput) BlockedIpLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NetworkPolicy) pulumi.StringArrayOutput { return v.BlockedIpLists }).(pulumi.StringArrayOutput)
}

// Specifies a comment for the network policy.
func (o NetworkPolicyOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPolicy) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
func (o NetworkPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type NetworkPolicyArrayOutput struct{ *pulumi.OutputState }

func (NetworkPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPolicy)(nil)).Elem()
}

func (o NetworkPolicyArrayOutput) ToNetworkPolicyArrayOutput() NetworkPolicyArrayOutput {
	return o
}

func (o NetworkPolicyArrayOutput) ToNetworkPolicyArrayOutputWithContext(ctx context.Context) NetworkPolicyArrayOutput {
	return o
}

func (o NetworkPolicyArrayOutput) Index(i pulumi.IntInput) NetworkPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkPolicy {
		return vs[0].([]*NetworkPolicy)[vs[1].(int)]
	}).(NetworkPolicyOutput)
}

type NetworkPolicyMapOutput struct{ *pulumi.OutputState }

func (NetworkPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPolicy)(nil)).Elem()
}

func (o NetworkPolicyMapOutput) ToNetworkPolicyMapOutput() NetworkPolicyMapOutput {
	return o
}

func (o NetworkPolicyMapOutput) ToNetworkPolicyMapOutputWithContext(ctx context.Context) NetworkPolicyMapOutput {
	return o
}

func (o NetworkPolicyMapOutput) MapIndex(k pulumi.StringInput) NetworkPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkPolicy {
		return vs[0].(map[string]*NetworkPolicy)[vs[1].(string)]
	}).(NetworkPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPolicyInput)(nil)).Elem(), &NetworkPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPolicyArrayInput)(nil)).Elem(), NetworkPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPolicyMapInput)(nil)).Elem(), NetworkPolicyMap{})
	pulumi.RegisterOutputType(NetworkPolicyOutput{})
	pulumi.RegisterOutputType(NetworkPolicyArrayOutput{})
	pulumi.RegisterOutputType(NetworkPolicyMapOutput{})
}
