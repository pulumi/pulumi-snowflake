// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("snowflake");
/**
 * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
 * using profile.
 * 
 */
    public Optional<String> account() {
        return Codegen.stringProp("account").config(config).env("SNOWFLAKE_ACCOUNT").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
 * 
 */
    public Optional<Boolean> browserAuth() {
        return Codegen.booleanProp("browserAuth").config(config).env("SNOWFLAKE_USE_BROWSER_AUTH").get();
    }
/**
 * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
 * 
 */
    public Optional<String> host() {
        return Codegen.stringProp("host").config(config).env("SNOWFLAKE_HOST").get();
    }
/**
 * If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
 * default value for testing or emergency situations only.
 * 
 */
    public Optional<Boolean> insecureMode() {
        return Codegen.booleanProp("insecureMode").config(config).get();
    }
/**
 * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
 * variable.
 * 
 */
    public Optional<String> oauthAccessToken() {
        return Codegen.stringProp("oauthAccessToken").config(config).env("SNOWFLAKE_OAUTH_ACCESS_TOKEN").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
 * 
 */
    public Optional<String> oauthClientId() {
        return Codegen.stringProp("oauthClientId").config(config).env("SNOWFLAKE_OAUTH_CLIENT_ID").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
 * 
 */
    public Optional<String> oauthClientSecret() {
        return Codegen.stringProp("oauthClientSecret").config(config).env("SNOWFLAKE_OAUTH_CLIENT_SECRET").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
 * 
 */
    public Optional<String> oauthEndpoint() {
        return Codegen.stringProp("oauthEndpoint").config(config).env("SNOWFLAKE_OAUTH_ENDPOINT").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
 * 
 */
    public Optional<String> oauthRedirectUrl() {
        return Codegen.stringProp("oauthRedirectUrl").config(config).env("SNOWFLAKE_OAUTH_REDIRECT_URL").get();
    }
/**
 * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
 * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
 * variable.
 * 
 */
    public Optional<String> oauthRefreshToken() {
        return Codegen.stringProp("oauthRefreshToken").config(config).env("SNOWFLAKE_OAUTH_REFRESH_TOKEN").get();
    }
/**
 * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
 * `SNOWFLAKE_PASSWORD` environment variable.
 * 
 */
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).env("SNOWFLAKE_PASSWORD").get();
    }
/**
 * Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
 * environment variable.
 * 
 */
    public Optional<Integer> port() {
        return Codegen.integerProp("port").config(config).env("SNOWFLAKE_PORT").get();
    }
/**
 * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
 * `SNOWFLAKE_PRIVATE_KEY` environment variable.
 * 
 */
    public Optional<String> privateKey() {
        return Codegen.stringProp("privateKey").config(config).get();
    }
/**
 * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
 * des-ede3-cbc
 * 
 */
    public Optional<String> privateKeyPassphrase() {
        return Codegen.stringProp("privateKeyPassphrase").config(config).env("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE").get();
    }
/**
 * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
 * `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
 * 
 */
    public Optional<String> privateKeyPath() {
        return Codegen.stringProp("privateKeyPath").config(config).env("SNOWFLAKE_PRIVATE_KEY_PATH").get();
    }
/**
 * Sets the profile to read from ~/.snowflake/config file.
 * 
 */
    public Optional<String> profile() {
        return Codegen.stringProp("profile").config(config).get();
    }
/**
 * Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
 * 
 */
    public Optional<String> protocol() {
        return Codegen.stringProp("protocol").config(config).env("SNOWFLAKE_PROTOCOL").get();
    }
/**
 * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
 * format for the `account`
 * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
 * in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
 * 
 */
    public String region() {
        return Codegen.stringProp("region").config(config).env("SNOWFLAKE_REGION").require();
    }
/**
 * Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
 * `SNOWFLAKE_ROLE` environment variable.
 * 
 */
    public Optional<String> role() {
        return Codegen.stringProp("role").config(config).env("SNOWFLAKE_ROLE").get();
    }
/**
 * Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
 * 
 */
    public Optional<Map<String,Object>> sessionParams() {
        return Codegen.objectProp("sessionParams", TypeShape.<Map<String,Object>>builder(Map.class).addParameter(String.class).addParameter(Object.class).build()).config(config).get();
    }
/**
 * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
 * using profile.
 * 
 */
    public Optional<String> username() {
        return Codegen.stringProp("username").config(config).env("SNOWFLAKE_USER").get();
    }
/**
 * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
 * 
 */
    public Optional<String> warehouse() {
        return Codegen.stringProp("warehouse").config(config).env("SNOWFLAKE_WAREHOUSE").get();
    }
}
