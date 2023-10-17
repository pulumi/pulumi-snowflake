// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// The provider type for the snowflake package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
	// using profile.
	Account pulumi.StringPtrOutput `pulumi:"account"`
	// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
	// connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
	// UsernamePasswordMFA
	Authenticator pulumi.StringPtrOutput `pulumi:"authenticator"`
	// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
	Host pulumi.StringPtrOutput `pulumi:"host"`
	// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
	// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
	// variable.
	OauthAccessToken pulumi.StringPtrOutput `pulumi:"oauthAccessToken"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
	OauthClientId pulumi.StringPtrOutput `pulumi:"oauthClientId"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
	OauthClientSecret pulumi.StringPtrOutput `pulumi:"oauthClientSecret"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
	OauthEndpoint pulumi.StringPtrOutput `pulumi:"oauthEndpoint"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
	OauthRedirectUrl pulumi.StringPtrOutput `pulumi:"oauthRedirectUrl"`
	// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
	// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
	// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
	// variable.
	OauthRefreshToken pulumi.StringPtrOutput `pulumi:"oauthRefreshToken"`
	// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login.
	Passcode pulumi.StringPtrOutput `pulumi:"passcode"`
	// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
	// `SNOWFLAKE_PASSWORD` environment variable.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
	// `SNOWFLAKE_PRIVATE_KEY` environment variable.
	PrivateKey pulumi.StringPtrOutput `pulumi:"privateKey"`
	// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
	// des-ede3-cbc
	PrivateKeyPassphrase pulumi.StringPtrOutput `pulumi:"privateKeyPassphrase"`
	// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
	// `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
	PrivateKeyPath pulumi.StringPtrOutput `pulumi:"privateKeyPath"`
	// Sets the profile to read from ~/.snowflake/config file.
	Profile pulumi.StringPtrOutput `pulumi:"profile"`
	// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
	Protocol pulumi.StringPtrOutput `pulumi:"protocol"`
	// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
	// format for the `account`
	// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
	// in the form of `<cloud_region_id>.<cloud>`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
	// `SNOWFLAKE_ROLE` environment variable.
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
	// using profile.
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
	Warehouse pulumi.StringPtrOutput `pulumi:"warehouse"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.Account == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_ACCOUNT"); d != nil {
			args.Account = pulumi.StringPtr(d.(string))
		}
	}
	if args.BrowserAuth == nil {
		if d := internal.GetEnvOrDefault(nil, internal.ParseEnvBool, "SNOWFLAKE_USE_BROWSER_AUTH"); d != nil {
			args.BrowserAuth = pulumi.BoolPtr(d.(bool))
		}
	}
	if args.Host == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_HOST"); d != nil {
			args.Host = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthAccessToken == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_ACCESS_TOKEN"); d != nil {
			args.OauthAccessToken = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthClientId == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_CLIENT_ID"); d != nil {
			args.OauthClientId = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthClientSecret == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_CLIENT_SECRET"); d != nil {
			args.OauthClientSecret = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthEndpoint == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_ENDPOINT"); d != nil {
			args.OauthEndpoint = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthRedirectUrl == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_REDIRECT_URL"); d != nil {
			args.OauthRedirectUrl = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthRefreshToken == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_REFRESH_TOKEN"); d != nil {
			args.OauthRefreshToken = pulumi.StringPtr(d.(string))
		}
	}
	if args.Password == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PASSWORD"); d != nil {
			args.Password = pulumi.StringPtr(d.(string))
		}
	}
	if args.Port == nil {
		if d := internal.GetEnvOrDefault(nil, internal.ParseEnvInt, "SNOWFLAKE_PORT"); d != nil {
			args.Port = pulumi.IntPtr(d.(int))
		}
	}
	if args.PrivateKeyPassphrase == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PRIVATE_KEY_PASSPHRASE"); d != nil {
			args.PrivateKeyPassphrase = pulumi.StringPtr(d.(string))
		}
	}
	if args.PrivateKeyPath == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PRIVATE_KEY_PATH"); d != nil {
			args.PrivateKeyPath = pulumi.StringPtr(d.(string))
		}
	}
	if args.Protocol == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PROTOCOL"); d != nil {
			args.Protocol = pulumi.StringPtr(d.(string))
		}
	}
	if args.Region == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_REGION"); d != nil {
			args.Region = pulumi.StringPtr(d.(string))
		}
	}
	if args.Role == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_ROLE"); d != nil {
			args.Role = pulumi.StringPtr(d.(string))
		}
	}
	if args.Username == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_USER"); d != nil {
			args.Username = pulumi.StringPtr(d.(string))
		}
	}
	if args.Warehouse == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_WAREHOUSE"); d != nil {
			args.Warehouse = pulumi.StringPtr(d.(string))
		}
	}
	if args.OauthAccessToken != nil {
		args.OauthAccessToken = pulumi.ToSecret(args.OauthAccessToken).(pulumi.StringPtrInput)
	}
	if args.OauthClientId != nil {
		args.OauthClientId = pulumi.ToSecret(args.OauthClientId).(pulumi.StringPtrInput)
	}
	if args.OauthClientSecret != nil {
		args.OauthClientSecret = pulumi.ToSecret(args.OauthClientSecret).(pulumi.StringPtrInput)
	}
	if args.OauthEndpoint != nil {
		args.OauthEndpoint = pulumi.ToSecret(args.OauthEndpoint).(pulumi.StringPtrInput)
	}
	if args.OauthRedirectUrl != nil {
		args.OauthRedirectUrl = pulumi.ToSecret(args.OauthRedirectUrl).(pulumi.StringPtrInput)
	}
	if args.OauthRefreshToken != nil {
		args.OauthRefreshToken = pulumi.ToSecret(args.OauthRefreshToken).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringPtrInput)
	}
	if args.PrivateKeyPassphrase != nil {
		args.PrivateKeyPassphrase = pulumi.ToSecret(args.PrivateKeyPassphrase).(pulumi.StringPtrInput)
	}
	if args.PrivateKeyPath != nil {
		args.PrivateKeyPath = pulumi.ToSecret(args.PrivateKeyPath).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"oauthAccessToken",
		"oauthClientId",
		"oauthClientSecret",
		"oauthEndpoint",
		"oauthRedirectUrl",
		"oauthRefreshToken",
		"password",
		"privateKey",
		"privateKeyPassphrase",
		"privateKeyPath",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:snowflake", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
	// using profile.
	Account *string `pulumi:"account"`
	// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
	// connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
	// UsernamePasswordMFA
	Authenticator *string `pulumi:"authenticator"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
	//
	// Deprecated: Use `authenticator` instead
	BrowserAuth *bool `pulumi:"browserAuth"`
	// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
	Host *string `pulumi:"host"`
	// If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
	// default value for testing or emergency situations only.
	InsecureMode *bool `pulumi:"insecureMode"`
	// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
	// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
	// variable.
	OauthAccessToken *string `pulumi:"oauthAccessToken"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
	OauthClientId *string `pulumi:"oauthClientId"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
	OauthClientSecret *string `pulumi:"oauthClientSecret"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
	OauthEndpoint *string `pulumi:"oauthEndpoint"`
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
	OauthRedirectUrl *string `pulumi:"oauthRedirectUrl"`
	// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
	// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
	// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
	// variable.
	OauthRefreshToken *string `pulumi:"oauthRefreshToken"`
	// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login.
	Passcode *string `pulumi:"passcode"`
	// False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
	// of the password.
	PasscodeInPassword *bool `pulumi:"passcodeInPassword"`
	// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
	// `SNOWFLAKE_PASSWORD` environment variable.
	Password *string `pulumi:"password"`
	// Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
	// environment variable.
	Port *int `pulumi:"port"`
	// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
	// `SNOWFLAKE_PRIVATE_KEY` environment variable.
	PrivateKey *string `pulumi:"privateKey"`
	// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
	// des-ede3-cbc
	PrivateKeyPassphrase *string `pulumi:"privateKeyPassphrase"`
	// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
	// `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
	PrivateKeyPath *string `pulumi:"privateKeyPath"`
	// Sets the profile to read from ~/.snowflake/config file.
	Profile *string `pulumi:"profile"`
	// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
	Protocol *string `pulumi:"protocol"`
	// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
	// format for the `account`
	// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
	// in the form of `<cloud_region_id>.<cloud>`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
	Region *string `pulumi:"region"`
	// Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
	// `SNOWFLAKE_ROLE` environment variable.
	Role *string `pulumi:"role"`
	// Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
	SessionParams map[string]interface{} `pulumi:"sessionParams"`
	// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
	// using profile.
	Username *string `pulumi:"username"`
	// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
	Warehouse *string `pulumi:"warehouse"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
	// using profile.
	Account pulumi.StringPtrInput
	// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
	// connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
	// UsernamePasswordMFA
	Authenticator pulumi.StringPtrInput
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
	//
	// Deprecated: Use `authenticator` instead
	BrowserAuth pulumi.BoolPtrInput
	// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
	Host pulumi.StringPtrInput
	// If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
	// default value for testing or emergency situations only.
	InsecureMode pulumi.BoolPtrInput
	// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
	// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
	// variable.
	OauthAccessToken pulumi.StringPtrInput
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
	OauthClientId pulumi.StringPtrInput
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
	OauthClientSecret pulumi.StringPtrInput
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
	OauthEndpoint pulumi.StringPtrInput
	// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
	OauthRedirectUrl pulumi.StringPtrInput
	// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
	// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
	// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
	// variable.
	OauthRefreshToken pulumi.StringPtrInput
	// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login.
	Passcode pulumi.StringPtrInput
	// False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
	// of the password.
	PasscodeInPassword pulumi.BoolPtrInput
	// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
	// `SNOWFLAKE_PASSWORD` environment variable.
	Password pulumi.StringPtrInput
	// Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
	// environment variable.
	Port pulumi.IntPtrInput
	// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
	// `SNOWFLAKE_PRIVATE_KEY` environment variable.
	PrivateKey pulumi.StringPtrInput
	// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
	// des-ede3-cbc
	PrivateKeyPassphrase pulumi.StringPtrInput
	// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
	// `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
	PrivateKeyPath pulumi.StringPtrInput
	// Sets the profile to read from ~/.snowflake/config file.
	Profile pulumi.StringPtrInput
	// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
	Protocol pulumi.StringPtrInput
	// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
	// format for the `account`
	// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
	// in the form of `<cloud_region_id>.<cloud>`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
	Region pulumi.StringPtrInput
	// Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
	// `SNOWFLAKE_ROLE` environment variable.
	Role pulumi.StringPtrInput
	// Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
	SessionParams pulumi.MapInput
	// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
	// using profile.
	Username pulumi.StringPtrInput
	// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
	Warehouse pulumi.StringPtrInput
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

func (i *Provider) ToOutput(ctx context.Context) pulumix.Output[*Provider] {
	return pulumix.Output[*Provider]{
		OutputState: i.ToProviderOutputWithContext(ctx).OutputState,
	}
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

func (o ProviderOutput) ToOutput(ctx context.Context) pulumix.Output[*Provider] {
	return pulumix.Output[*Provider]{
		OutputState: o.OutputState,
	}
}

// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
// using profile.
func (o ProviderOutput) Account() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Account }).(pulumi.StringPtrOutput)
}

// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
// connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
// UsernamePasswordMFA
func (o ProviderOutput) Authenticator() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Authenticator }).(pulumi.StringPtrOutput)
}

// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
func (o ProviderOutput) Host() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Host }).(pulumi.StringPtrOutput)
}

// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
// variable.
func (o ProviderOutput) OauthAccessToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.OauthAccessToken }).(pulumi.StringPtrOutput)
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
func (o ProviderOutput) OauthClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.OauthClientId }).(pulumi.StringPtrOutput)
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
func (o ProviderOutput) OauthClientSecret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.OauthClientSecret }).(pulumi.StringPtrOutput)
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
func (o ProviderOutput) OauthEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.OauthEndpoint }).(pulumi.StringPtrOutput)
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
func (o ProviderOutput) OauthRedirectUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.OauthRedirectUrl }).(pulumi.StringPtrOutput)
}

// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
// variable.
func (o ProviderOutput) OauthRefreshToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.OauthRefreshToken }).(pulumi.StringPtrOutput)
}

// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login.
func (o ProviderOutput) Passcode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Passcode }).(pulumi.StringPtrOutput)
}

// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
// `SNOWFLAKE_PASSWORD` environment variable.
func (o ProviderOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
// `SNOWFLAKE_PRIVATE_KEY` environment variable.
func (o ProviderOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
// des-ede3-cbc
func (o ProviderOutput) PrivateKeyPassphrase() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.PrivateKeyPassphrase }).(pulumi.StringPtrOutput)
}

// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
// `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
func (o ProviderOutput) PrivateKeyPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.PrivateKeyPath }).(pulumi.StringPtrOutput)
}

// Sets the profile to read from ~/.snowflake/config file.
func (o ProviderOutput) Profile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Profile }).(pulumi.StringPtrOutput)
}

// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
func (o ProviderOutput) Protocol() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Protocol }).(pulumi.StringPtrOutput)
}

// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
// format for the `account`
// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
// in the form of `<cloud_region_id>.<cloud>`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
func (o ProviderOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
// `SNOWFLAKE_ROLE` environment variable.
func (o ProviderOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Role }).(pulumi.StringPtrOutput)
}

// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
// using profile.
func (o ProviderOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
func (o ProviderOutput) Warehouse() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Warehouse }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
