// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the snowflake package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	Account pulumi.StringOutput `pulumi:"account"`
	// Supports passing in a custom host value to the snowflake go driver for use with privatelink
	Host              pulumi.StringPtrOutput `pulumi:"host"`
	OauthAccessToken  pulumi.StringPtrOutput `pulumi:"oauthAccessToken"`
	OauthClientId     pulumi.StringPtrOutput `pulumi:"oauthClientId"`
	OauthClientSecret pulumi.StringPtrOutput `pulumi:"oauthClientSecret"`
	OauthEndpoint     pulumi.StringPtrOutput `pulumi:"oauthEndpoint"`
	OauthRedirectUrl  pulumi.StringPtrOutput `pulumi:"oauthRedirectUrl"`
	OauthRefreshToken pulumi.StringPtrOutput `pulumi:"oauthRefreshToken"`
	Password          pulumi.StringPtrOutput `pulumi:"password"`
	PrivateKey        pulumi.StringPtrOutput `pulumi:"privateKey"`
	// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
	// des-ede3-cbc
	PrivateKeyPassphrase pulumi.StringPtrOutput `pulumi:"privateKeyPassphrase"`
	PrivateKeyPath       pulumi.StringPtrOutput `pulumi:"privateKeyPath"`
	Region               pulumi.StringOutput    `pulumi:"region"`
	Role                 pulumi.StringPtrOutput `pulumi:"role"`
	Username             pulumi.StringOutput    `pulumi:"username"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Account == nil {
		return nil, errors.New("invalid value for required argument 'Account'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:snowflake", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	Account     string `pulumi:"account"`
	BrowserAuth *bool  `pulumi:"browserAuth"`
	// Supports passing in a custom host value to the snowflake go driver for use with privatelink
	Host              *string `pulumi:"host"`
	OauthAccessToken  *string `pulumi:"oauthAccessToken"`
	OauthClientId     *string `pulumi:"oauthClientId"`
	OauthClientSecret *string `pulumi:"oauthClientSecret"`
	OauthEndpoint     *string `pulumi:"oauthEndpoint"`
	OauthRedirectUrl  *string `pulumi:"oauthRedirectUrl"`
	OauthRefreshToken *string `pulumi:"oauthRefreshToken"`
	Password          *string `pulumi:"password"`
	PrivateKey        *string `pulumi:"privateKey"`
	// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
	// des-ede3-cbc
	PrivateKeyPassphrase *string `pulumi:"privateKeyPassphrase"`
	PrivateKeyPath       *string `pulumi:"privateKeyPath"`
	Region               string  `pulumi:"region"`
	Role                 *string `pulumi:"role"`
	Username             string  `pulumi:"username"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	Account     pulumi.StringInput
	BrowserAuth pulumi.BoolPtrInput
	// Supports passing in a custom host value to the snowflake go driver for use with privatelink
	Host              pulumi.StringPtrInput
	OauthAccessToken  pulumi.StringPtrInput
	OauthClientId     pulumi.StringPtrInput
	OauthClientSecret pulumi.StringPtrInput
	OauthEndpoint     pulumi.StringPtrInput
	OauthRedirectUrl  pulumi.StringPtrInput
	OauthRefreshToken pulumi.StringPtrInput
	Password          pulumi.StringPtrInput
	PrivateKey        pulumi.StringPtrInput
	// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
	// des-ede3-cbc
	PrivateKeyPassphrase pulumi.StringPtrInput
	PrivateKeyPath       pulumi.StringPtrInput
	Region               pulumi.StringInput
	Role                 pulumi.StringPtrInput
	Username             pulumi.StringInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
