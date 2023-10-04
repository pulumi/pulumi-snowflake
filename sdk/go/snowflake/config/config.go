// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
// using profile.
func GetAccount(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:account")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_ACCOUNT"); d != nil {
		value = d.(string)
	}
	return value
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
func GetBrowserAuth(ctx *pulumi.Context) bool {
	v, err := config.TryBool(ctx, "snowflake:browserAuth")
	if err == nil {
		return v
	}
	var value bool
	if d := internal.GetEnvOrDefault(nil, internal.ParseEnvBool, "SNOWFLAKE_USE_BROWSER_AUTH"); d != nil {
		value = d.(bool)
	}
	return value
}

// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
func GetHost(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:host")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_HOST"); d != nil {
		value = d.(string)
	}
	return value
}

// If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
// default value for testing or emergency situations only.
func GetInsecureMode(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "snowflake:insecureMode")
}

// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
// variable.
func GetOauthAccessToken(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:oauthAccessToken")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_ACCESS_TOKEN"); d != nil {
		value = d.(string)
	}
	return value
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
func GetOauthClientId(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:oauthClientId")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_CLIENT_ID"); d != nil {
		value = d.(string)
	}
	return value
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
func GetOauthClientSecret(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:oauthClientSecret")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_CLIENT_SECRET"); d != nil {
		value = d.(string)
	}
	return value
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
func GetOauthEndpoint(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:oauthEndpoint")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_ENDPOINT"); d != nil {
		value = d.(string)
	}
	return value
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
func GetOauthRedirectUrl(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:oauthRedirectUrl")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_REDIRECT_URL"); d != nil {
		value = d.(string)
	}
	return value
}

// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
// variable.
func GetOauthRefreshToken(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:oauthRefreshToken")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_OAUTH_REFRESH_TOKEN"); d != nil {
		value = d.(string)
	}
	return value
}

// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login.
func GetPasscode(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:passcode")
}

// False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
// of the password.
func GetPasscodeInPassword(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "snowflake:passcodeInPassword")
}

// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
// `SNOWFLAKE_PASSWORD` environment variable.
func GetPassword(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:password")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PASSWORD"); d != nil {
		value = d.(string)
	}
	return value
}

// Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
// environment variable.
func GetPort(ctx *pulumi.Context) int {
	v, err := config.TryInt(ctx, "snowflake:port")
	if err == nil {
		return v
	}
	var value int
	if d := internal.GetEnvOrDefault(nil, internal.ParseEnvInt, "SNOWFLAKE_PORT"); d != nil {
		value = d.(int)
	}
	return value
}

// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
// `SNOWFLAKE_PRIVATE_KEY` environment variable.
func GetPrivateKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:privateKey")
}

// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
// des-ede3-cbc
func GetPrivateKeyPassphrase(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:privateKeyPassphrase")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PRIVATE_KEY_PASSPHRASE"); d != nil {
		value = d.(string)
	}
	return value
}

// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
// `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
func GetPrivateKeyPath(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:privateKeyPath")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PRIVATE_KEY_PATH"); d != nil {
		value = d.(string)
	}
	return value
}

// Sets the profile to read from ~/.snowflake/config file.
func GetProfile(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:profile")
}

// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
func GetProtocol(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:protocol")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_PROTOCOL"); d != nil {
		value = d.(string)
	}
	return value
}

// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
// format for the `account`
// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
// in the form of `<cloud_region_id>.<cloud>`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
func GetRegion(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:region")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_REGION"); d != nil {
		value = d.(string)
	}
	return value
}

// Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
// `SNOWFLAKE_ROLE` environment variable.
func GetRole(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:role")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_ROLE"); d != nil {
		value = d.(string)
	}
	return value
}

// Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
func GetSessionParams(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:sessionParams")
}

// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
// using profile.
func GetUsername(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:username")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_USER"); d != nil {
		value = d.(string)
	}
	return value
}

// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
func GetWarehouse(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "snowflake:warehouse")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SNOWFLAKE_WAREHOUSE"); d != nil {
		value = d.(string)
	}
	return value
}
