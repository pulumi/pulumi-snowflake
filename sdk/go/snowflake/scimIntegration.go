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
//			_, err := snowflake.NewScimIntegration(ctx, "aad", &snowflake.ScimIntegrationArgs{
//				Name:            pulumi.String("AAD_PROVISIONING"),
//				NetworkPolicy:   pulumi.String("AAD_NETWORK_POLICY"),
//				ProvisionerRole: pulumi.String("AAD_PROVISIONER"),
//				ScimClient:      pulumi.String("AZURE"),
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
// $ pulumi import snowflake:index/scimIntegration:ScimIntegration example name
// ```
type ScimIntegration struct {
	pulumi.CustomResourceState

	// Date and time when the SCIM integration was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
	NetworkPolicy pulumi.StringPtrOutput `pulumi:"networkPolicy"`
	// Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
	ProvisionerRole pulumi.StringOutput `pulumi:"provisionerRole"`
	// Specifies the client type for the scim integration
	ScimClient pulumi.StringOutput `pulumi:"scimClient"`
}

// NewScimIntegration registers a new resource with the given unique name, arguments, and options.
func NewScimIntegration(ctx *pulumi.Context,
	name string, args *ScimIntegrationArgs, opts ...pulumi.ResourceOption) (*ScimIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProvisionerRole == nil {
		return nil, errors.New("invalid value for required argument 'ProvisionerRole'")
	}
	if args.ScimClient == nil {
		return nil, errors.New("invalid value for required argument 'ScimClient'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ScimIntegration
	err := ctx.RegisterResource("snowflake:index/scimIntegration:ScimIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScimIntegration gets an existing ScimIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScimIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScimIntegrationState, opts ...pulumi.ResourceOption) (*ScimIntegration, error) {
	var resource ScimIntegration
	err := ctx.ReadResource("snowflake:index/scimIntegration:ScimIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScimIntegration resources.
type scimIntegrationState struct {
	// Date and time when the SCIM integration was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name *string `pulumi:"name"`
	// Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
	NetworkPolicy *string `pulumi:"networkPolicy"`
	// Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
	ProvisionerRole *string `pulumi:"provisionerRole"`
	// Specifies the client type for the scim integration
	ScimClient *string `pulumi:"scimClient"`
}

type ScimIntegrationState struct {
	// Date and time when the SCIM integration was created.
	CreatedOn pulumi.StringPtrInput
	// Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name pulumi.StringPtrInput
	// Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
	NetworkPolicy pulumi.StringPtrInput
	// Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
	ProvisionerRole pulumi.StringPtrInput
	// Specifies the client type for the scim integration
	ScimClient pulumi.StringPtrInput
}

func (ScimIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*scimIntegrationState)(nil)).Elem()
}

type scimIntegrationArgs struct {
	// Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name *string `pulumi:"name"`
	// Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
	NetworkPolicy *string `pulumi:"networkPolicy"`
	// Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
	ProvisionerRole string `pulumi:"provisionerRole"`
	// Specifies the client type for the scim integration
	ScimClient string `pulumi:"scimClient"`
}

// The set of arguments for constructing a ScimIntegration resource.
type ScimIntegrationArgs struct {
	// Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name pulumi.StringPtrInput
	// Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
	NetworkPolicy pulumi.StringPtrInput
	// Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
	ProvisionerRole pulumi.StringInput
	// Specifies the client type for the scim integration
	ScimClient pulumi.StringInput
}

func (ScimIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scimIntegrationArgs)(nil)).Elem()
}

type ScimIntegrationInput interface {
	pulumi.Input

	ToScimIntegrationOutput() ScimIntegrationOutput
	ToScimIntegrationOutputWithContext(ctx context.Context) ScimIntegrationOutput
}

func (*ScimIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**ScimIntegration)(nil)).Elem()
}

func (i *ScimIntegration) ToScimIntegrationOutput() ScimIntegrationOutput {
	return i.ToScimIntegrationOutputWithContext(context.Background())
}

func (i *ScimIntegration) ToScimIntegrationOutputWithContext(ctx context.Context) ScimIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScimIntegrationOutput)
}

// ScimIntegrationArrayInput is an input type that accepts ScimIntegrationArray and ScimIntegrationArrayOutput values.
// You can construct a concrete instance of `ScimIntegrationArrayInput` via:
//
//	ScimIntegrationArray{ ScimIntegrationArgs{...} }
type ScimIntegrationArrayInput interface {
	pulumi.Input

	ToScimIntegrationArrayOutput() ScimIntegrationArrayOutput
	ToScimIntegrationArrayOutputWithContext(context.Context) ScimIntegrationArrayOutput
}

type ScimIntegrationArray []ScimIntegrationInput

func (ScimIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScimIntegration)(nil)).Elem()
}

func (i ScimIntegrationArray) ToScimIntegrationArrayOutput() ScimIntegrationArrayOutput {
	return i.ToScimIntegrationArrayOutputWithContext(context.Background())
}

func (i ScimIntegrationArray) ToScimIntegrationArrayOutputWithContext(ctx context.Context) ScimIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScimIntegrationArrayOutput)
}

// ScimIntegrationMapInput is an input type that accepts ScimIntegrationMap and ScimIntegrationMapOutput values.
// You can construct a concrete instance of `ScimIntegrationMapInput` via:
//
//	ScimIntegrationMap{ "key": ScimIntegrationArgs{...} }
type ScimIntegrationMapInput interface {
	pulumi.Input

	ToScimIntegrationMapOutput() ScimIntegrationMapOutput
	ToScimIntegrationMapOutputWithContext(context.Context) ScimIntegrationMapOutput
}

type ScimIntegrationMap map[string]ScimIntegrationInput

func (ScimIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScimIntegration)(nil)).Elem()
}

func (i ScimIntegrationMap) ToScimIntegrationMapOutput() ScimIntegrationMapOutput {
	return i.ToScimIntegrationMapOutputWithContext(context.Background())
}

func (i ScimIntegrationMap) ToScimIntegrationMapOutputWithContext(ctx context.Context) ScimIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScimIntegrationMapOutput)
}

type ScimIntegrationOutput struct{ *pulumi.OutputState }

func (ScimIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScimIntegration)(nil)).Elem()
}

func (o ScimIntegrationOutput) ToScimIntegrationOutput() ScimIntegrationOutput {
	return o
}

func (o ScimIntegrationOutput) ToScimIntegrationOutputWithContext(ctx context.Context) ScimIntegrationOutput {
	return o
}

// Date and time when the SCIM integration was created.
func (o ScimIntegrationOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *ScimIntegration) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
func (o ScimIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ScimIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
func (o ScimIntegrationOutput) NetworkPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScimIntegration) pulumi.StringPtrOutput { return v.NetworkPolicy }).(pulumi.StringPtrOutput)
}

// Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
func (o ScimIntegrationOutput) ProvisionerRole() pulumi.StringOutput {
	return o.ApplyT(func(v *ScimIntegration) pulumi.StringOutput { return v.ProvisionerRole }).(pulumi.StringOutput)
}

// Specifies the client type for the scim integration
func (o ScimIntegrationOutput) ScimClient() pulumi.StringOutput {
	return o.ApplyT(func(v *ScimIntegration) pulumi.StringOutput { return v.ScimClient }).(pulumi.StringOutput)
}

type ScimIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ScimIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScimIntegration)(nil)).Elem()
}

func (o ScimIntegrationArrayOutput) ToScimIntegrationArrayOutput() ScimIntegrationArrayOutput {
	return o
}

func (o ScimIntegrationArrayOutput) ToScimIntegrationArrayOutputWithContext(ctx context.Context) ScimIntegrationArrayOutput {
	return o
}

func (o ScimIntegrationArrayOutput) Index(i pulumi.IntInput) ScimIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScimIntegration {
		return vs[0].([]*ScimIntegration)[vs[1].(int)]
	}).(ScimIntegrationOutput)
}

type ScimIntegrationMapOutput struct{ *pulumi.OutputState }

func (ScimIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScimIntegration)(nil)).Elem()
}

func (o ScimIntegrationMapOutput) ToScimIntegrationMapOutput() ScimIntegrationMapOutput {
	return o
}

func (o ScimIntegrationMapOutput) ToScimIntegrationMapOutputWithContext(ctx context.Context) ScimIntegrationMapOutput {
	return o
}

func (o ScimIntegrationMapOutput) MapIndex(k pulumi.StringInput) ScimIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScimIntegration {
		return vs[0].(map[string]*ScimIntegration)[vs[1].(string)]
	}).(ScimIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScimIntegrationInput)(nil)).Elem(), &ScimIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScimIntegrationArrayInput)(nil)).Elem(), ScimIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScimIntegrationMapInput)(nil)).Elem(), ScimIntegrationMap{})
	pulumi.RegisterOutputType(ScimIntegrationOutput{})
	pulumi.RegisterOutputType(ScimIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ScimIntegrationMapOutput{})
}
