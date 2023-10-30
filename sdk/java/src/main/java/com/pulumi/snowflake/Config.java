// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.config.inputs.TokenAccessor;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("snowflake");
/**
 * Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
 * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
 * from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
 * 
 */
    public Optional<String> account() {
        return Codegen.stringProp("account").config(config).env("SNOWFLAKE_ACCOUNT").get();
    }
/**
 * Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
 * connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
 * UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
 * 
 */
    public Optional<String> authenticator() {
        return Codegen.stringProp("authenticator").config(config).get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
 * 
 */
    public Optional<Boolean> browserAuth() {
        return Codegen.booleanProp("browserAuth").config(config).env("SNOWFLAKE_USE_BROWSER_AUTH").get();
    }
/**
 * IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
 * 
 */
    public Optional<String> clientIp() {
        return Codegen.stringProp("clientIp").config(config).get();
    }
/**
 * When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
 * be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
 * 
 */
    public Optional<Boolean> clientRequestMfaToken() {
        return Codegen.booleanProp("clientRequestMfaToken").config(config).get();
    }
/**
 * When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
 * sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
 * 
 */
    public Optional<Boolean> clientStoreTemporaryCredential() {
        return Codegen.booleanProp("clientStoreTemporaryCredential").config(config).get();
    }
/**
 * The timeout in seconds for the client to complete the authentication. Default is 900 seconds. Can also be sourced from
 * the `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> clientTimeout() {
        return Codegen.integerProp("clientTimeout").config(config).get();
    }
/**
 * Should HTAP query context cache be disabled. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
 * environment variable.
 * 
 */
    public Optional<Boolean> disableQueryContextCache() {
        return Codegen.booleanProp("disableQueryContextCache").config(config).get();
    }
/**
 * Indicates whether to disable telemetry. Can also be sourced from the `SNOWFLAKE_DISABLE_TELEMETRY` environment variable.
 * 
 */
    public Optional<Boolean> disableTelemetry() {
        return Codegen.booleanProp("disableTelemetry").config(config).get();
    }
/**
 * The timeout in seconds for the external browser to complete the authentication. Default is 120 seconds. Can also be
 * sourced from the `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> externalBrowserTimeout() {
        return Codegen.integerProp("externalBrowserTimeout").config(config).get();
    }
/**
 * Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
 * the `SNOWFLAKE_HOST` environment variable.
 * 
 */
    public Optional<String> host() {
        return Codegen.stringProp("host").config(config).env("SNOWFLAKE_HOST").get();
    }
/**
 * If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
 * default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
 * environment variable.
 * 
 */
    public Optional<Boolean> insecureMode() {
        return Codegen.booleanProp("insecureMode").config(config).get();
    }
/**
 * The timeout in seconds for the JWT client to complete the authentication. Default is 10 seconds. Can also be sourced
 * from the `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> jwtClientTimeout() {
        return Codegen.integerProp("jwtClientTimeout").config(config).get();
    }
/**
 * JWT expire after timeout in seconds. Can also be sourced from the `SNOWFLAKE_JWT_EXPIRE_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> jwtExpireTimeout() {
        return Codegen.integerProp("jwtExpireTimeout").config(config).get();
    }
/**
 * Enables the session to persist even after the connection is closed. Can also be sourced from the
 * `SNOWFLAKE_KEEP_SESSION_ALIVE` environment variable.
 * 
 */
    public Optional<Boolean> keepSessionAlive() {
        return Codegen.booleanProp("keepSessionAlive").config(config).get();
    }
/**
 * Login retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
 * `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> loginTimeout() {
        return Codegen.integerProp("loginTimeout").config(config).get();
    }
/**
 * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
 * environment variable.
 * 
 */
    public Optional<String> oauthAccessToken() {
        return Codegen.stringProp("oauthAccessToken").config(config).env("SNOWFLAKE_OAUTH_ACCESS_TOKEN").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
 * 
 */
    public Optional<String> oauthClientId() {
        return Codegen.stringProp("oauthClientId").config(config).env("SNOWFLAKE_OAUTH_CLIENT_ID").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
 * variable.
 * 
 */
    public Optional<String> oauthClientSecret() {
        return Codegen.stringProp("oauthClientSecret").config(config).env("SNOWFLAKE_OAUTH_CLIENT_SECRET").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
 * 
 */
    public Optional<String> oauthEndpoint() {
        return Codegen.stringProp("oauthEndpoint").config(config).env("SNOWFLAKE_OAUTH_ENDPOINT").get();
    }
/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
 * variable.
 * 
 */
    public Optional<String> oauthRedirectUrl() {
        return Codegen.stringProp("oauthRedirectUrl").config(config).env("SNOWFLAKE_OAUTH_REDIRECT_URL").get();
    }
/**
 * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
 * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
 * environment variable.
 * 
 */
    public Optional<String> oauthRefreshToken() {
        return Codegen.stringProp("oauthRefreshToken").config(config).env("SNOWFLAKE_OAUTH_REFRESH_TOKEN").get();
    }
/**
 * The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
 * variable.
 * 
 */
    public Optional<String> oktaUrl() {
        return Codegen.stringProp("oktaUrl").config(config).get();
    }
/**
 * True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
 * sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
 * 
 */
    public Optional<Boolean> oscpFailOpen() {
        return Codegen.booleanProp("oscpFailOpen").config(config).get();
    }
/**
 * Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
 * 
 */
    public Optional<Map<String,Object>> params() {
        return Codegen.objectProp("params", TypeShape.<Map<String,Object>>builder(Map.class).addParameter(String.class).addParameter(Object.class).build()).config(config).get();
    }
/**
 * Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
 * the `SNOWFLAKE_PASSCODE` environment variable.
 * 
 */
    public Optional<String> passcode() {
        return Codegen.stringProp("passcode").config(config).get();
    }
/**
 * False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
 * of the password. Can also be sourced from the `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
 * 
 */
    public Optional<Boolean> passcodeInPassword() {
        return Codegen.booleanProp("passcodeInPassword").config(config).get();
    }
/**
 * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
 * the `SNOWFLAKE_PASSWORD` environment variable.
 * 
 */
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).env("SNOWFLAKE_PASSWORD").get();
    }
/**
 * Support custom port values to snowflake go driver for use with privatelink. Can also be sourced from the
 * `SNOWFLAKE_PORT` environment variable.
 * 
 */
    public Optional<Integer> port() {
        return Codegen.integerProp("port").config(config).env("SNOWFLAKE_PORT").get();
    }
/**
 * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
 * `SNOWFLAKE_PRIVATE_KEY` environment variable.
 * 
 */
    public Optional<String> privateKey() {
        return Codegen.stringProp("privateKey").config(config).get();
    }
/**
 * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
 * des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
 * 
 */
    public Optional<String> privateKeyPassphrase() {
        return Codegen.stringProp("privateKeyPassphrase").config(config).env("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE").get();
    }
/**
 * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
 * `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
 * 
 */
    public Optional<String> privateKeyPath() {
        return Codegen.stringProp("privateKeyPath").config(config).env("SNOWFLAKE_PRIVATE_KEY_PATH").get();
    }
/**
 * Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
 * variable.
 * 
 */
    public Optional<String> profile() {
        return Codegen.stringProp("profile").config(config).get();
    }
/**
 * Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
 * 
 */
    public Optional<String> protocol() {
        return Codegen.stringProp("protocol").config(config).env("SNOWFLAKE_PROTOCOL").get();
    }
/**
 * Snowflake region, such as &#34;eu-central-1&#34;, with this parameter. However, since this parameter is deprecated, it is best
 * to specify the region as part of the account parameter. For details, see the description of the account parameter.
 * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
 * format for the `account`
 * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
 * in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
 * 
 */
    public Optional<String> region() {
        return Codegen.stringProp("region").config(config).env("SNOWFLAKE_REGION").get();
    }
/**
 * request retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
 * `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> requestTimeout() {
        return Codegen.integerProp("requestTimeout").config(config).get();
    }
/**
 * Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
 * `SNOWFLAKE_ROLE` environment variable. .
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
 * Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
 * variable.
 * 
 */
    public Optional<String> token() {
        return Codegen.stringProp("token").config(config).get();
    }
    public Optional<TokenAccessor> tokenAccessor() {
        return Codegen.objectProp("tokenAccessor", TokenAccessor.class).config(config).get();
    }
/**
 * Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
 * 
 */
    public Optional<String> user() {
        return Codegen.stringProp("user").config(config).get();
    }
/**
 * Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USERNAME` environment variable.
 * Required unless using `profile`.
 * 
 */
    public Optional<String> username() {
        return Codegen.stringProp("username").config(config).env("SNOWFLAKE_USER").get();
    }
/**
 * If true, disables the validation checks for Database, Schema, Warehouse and Role at the time a connection is
 * established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
 * 
 */
    public Optional<Boolean> validateDefaultParameters() {
        return Codegen.booleanProp("validateDefaultParameters").config(config).get();
    }
/**
 * Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
 * from the `SNOWFLAKE_WAREHOUSE` environment variable.
 * 
 */
    public Optional<String> warehouse() {
        return Codegen.stringProp("warehouse").config(config).env("SNOWFLAKE_WAREHOUSE").get();
    }
}
