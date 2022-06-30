// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
func GetAccount(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:account")
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
func GetBrowserAuth(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "snowflake:browserAuth")
}

// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
func GetHost(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:host")
}

// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
// variable.
func GetOauthAccessToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:oauthAccessToken")
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
func GetOauthClientId(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:oauthClientId")
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
func GetOauthClientSecret(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:oauthClientSecret")
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
func GetOauthEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:oauthEndpoint")
}

// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
func GetOauthRedirectUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:oauthRedirectUrl")
}

// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
// variable.
func GetOauthRefreshToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:oauthRefreshToken")
}

// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
// `SNOWFLAKE_PASSWORD` environment variable.
func GetPassword(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:password")
}

// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
// `SNOWFLAKE_PRIVATE_KEY` environment variable.
func GetPrivateKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:privateKey")
}

// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
// des-ede3-cbc
func GetPrivateKeyPassphrase(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:privateKeyPassphrase")
}

// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
// `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
func GetPrivateKeyPath(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:privateKeyPath")
}

// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
// `SNOWFLAKE_REGION` environment variable.
func GetRegion(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:region")
}

// Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
// `SNOWFLAKE_ROLE` environment variable.
func GetRole(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:role")
}

// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
func GetUsername(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:username")
}

// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE enviornment variable.
func GetWarehouse(ctx *pulumi.Context) string {
	return config.Get(ctx, "snowflake:warehouse")
}
