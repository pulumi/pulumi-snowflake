// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.config.inputs.TokenAccessor;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("snowflake");
/**
 * Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
 * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
 * unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
 * 
 */
    public Optional<String> accountName() {
        return Codegen.stringProp("accountName").config(config).get();
    }
/**
 * Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
 * connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` |
 * `TOKENACCESSOR` | `USERNAMEPASSWORDMFA`. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
 * 
 */
    public Optional<String> authenticator() {
        return Codegen.stringProp("authenticator").config(config).get();
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
    public Optional<String> clientRequestMfaToken() {
        return Codegen.stringProp("clientRequestMfaToken").config(config).get();
    }
/**
 * When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
 * sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
 * 
 */
    public Optional<String> clientStoreTemporaryCredential() {
        return Codegen.stringProp("clientStoreTemporaryCredential").config(config).get();
    }
/**
 * The timeout in seconds for the client to complete the authentication. Can also be sourced from the
 * `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> clientTimeout() {
        return Codegen.integerProp("clientTimeout").config(config).get();
    }
/**
 * Indicates whether console login should be disabled in the driver. Can also be sourced from the
 * `SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
 * 
 */
    public Optional<String> disableConsoleLogin() {
        return Codegen.stringProp("disableConsoleLogin").config(config).get();
    }
/**
 * Disables HTAP query context cache in the driver. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
 * environment variable.
 * 
 */
    public Optional<Boolean> disableQueryContextCache() {
        return Codegen.booleanProp("disableQueryContextCache").config(config).get();
    }
/**
 * Disables telemetry in the driver. Can also be sourced from the `DISABLE_TELEMETRY` environment variable.
 * 
 */
    public Optional<Boolean> disableTelemetry() {
        return Codegen.booleanProp("disableTelemetry").config(config).get();
    }
/**
 * Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
 * `warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
 * 
 */
    public Optional<String> driverTracing() {
        return Codegen.stringProp("driverTracing").config(config).get();
    }
/**
 * The timeout in seconds for the external browser to complete the authentication. Can also be sourced from the
 * `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> externalBrowserTimeout() {
        return Codegen.integerProp("externalBrowserTimeout").config(config).get();
    }
/**
 * Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
 * `SNOWFLAKE_HOST` environment variable.
 * 
 */
    public Optional<String> host() {
        return Codegen.stringProp("host").config(config).env("SNOWFLAKE_HOST").get();
    }
/**
 * Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
 * variable.
 * 
 */
    public Optional<String> includeRetryReason() {
        return Codegen.stringProp("includeRetryReason").config(config).get();
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
 * The timeout in seconds for the JWT client to complete the authentication. Can also be sourced from the
 * `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
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
 * Login retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
 * `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> loginTimeout() {
        return Codegen.integerProp("loginTimeout").config(config).get();
    }
/**
 * Specifies how many times non-periodic HTTP request can be retried by the driver. Can also be sourced from the
 * `SNOWFLAKE_MAX_RETRY_COUNT` environment variable.
 * 
 */
    public Optional<Integer> maxRetryCount() {
        return Codegen.integerProp("maxRetryCount").config(config).get();
    }
/**
 * True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
 * sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
 * 
 */
    public Optional<String> ocspFailOpen() {
        return Codegen.stringProp("ocspFailOpen").config(config).get();
    }
/**
 * The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
 * in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
 * `SNOWFLAKE_OKTA_URL` environment variable.
 * 
 */
    public Optional<String> oktaUrl() {
        return Codegen.stringProp("oktaUrl").config(config).get();
    }
/**
 * Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
 * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
 * unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
 * 
 */
    public Optional<String> organizationName() {
        return Codegen.stringProp("organizationName").config(config).get();
    }
/**
 * Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters).
 * This field can not be set with environmental variables.
 * 
 */
    public Optional<Map<String,String>> params() {
        return Codegen.objectProp("params", TypeShape.<Map<String,String>>builder(Map.class).addParameter(String.class).addParameter(String.class).build()).config(config).get();
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
 * False by default. Set to true if the MFA passcode is embedded to the configured password. Can also be sourced from the
 * `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
 * 
 */
    public Optional<Boolean> passcodeInPassword() {
        return Codegen.booleanProp("passcodeInPassword").config(config).get();
    }
/**
 * Password for user + password auth. Cannot be used with `private_key` and `private_key_passphrase`. Can also be sourced
 * from the `SNOWFLAKE_PASSWORD` environment variable.
 * 
 */
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).env("SNOWFLAKE_PASSWORD").get();
    }
/**
 * Specifies a custom port value used by the driver for privatelink connections. Can also be sourced from the
 * `SNOWFLAKE_PORT` environment variable.
 * 
 */
    public Optional<Integer> port() {
        return Codegen.integerProp("port").config(config).env("SNOWFLAKE_PORT").get();
    }
    public Optional<List<String>> previewFeaturesEnabled() {
        return Codegen.objectProp("previewFeaturesEnabled", TypeShape.<List<String>>builder(List.class).addParameter(String.class).build()).config(config).get();
    }
/**
 * Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the
 * `SNOWFLAKE_PRIVATE_KEY` environment variable.
 * 
 */
    public Optional<String> privateKey() {
        return Codegen.stringProp("privateKey").config(config).get();
    }
/**
 * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
 * des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
 * 
 */
    public Optional<String> privateKeyPassphrase() {
        return Codegen.stringProp("privateKeyPassphrase").config(config).env("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE").get();
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
 * A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
 * `SNOWFLAKE_PROTOCOL` environment variable.
 * 
 */
    public Optional<String> protocol() {
        return Codegen.stringProp("protocol").config(config).env("SNOWFLAKE_PROTOCOL").get();
    }
/**
 * request retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
 * `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
 * 
 */
    public Optional<Integer> requestTimeout() {
        return Codegen.integerProp("requestTimeout").config(config).get();
    }
/**
 * Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
 * `SNOWFLAKE_ROLE` environment variable.
 * 
 */
    public Optional<String> role() {
        return Codegen.stringProp("role").config(config).env("SNOWFLAKE_ROLE").get();
    }
/**
 * True by default. Skips TOML configuration file permission verification. This flag has no effect on Windows systems, as
 * the permissions are not checked on this platform. We recommend setting this to `false` and setting the proper privileges
 * - see the section below. Can also be sourced from the `SNOWFLAKE_SKIP_TOML_FILE_PERMISSION_VERIFICATION` environment
 *   variable.
 * 
 */
    public Optional<Boolean> skipTomlFilePermissionVerification() {
        return Codegen.booleanProp("skipTomlFilePermissionVerification").config(config).get();
    }
/**
 * Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
 * the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
 * 
 */
    public Optional<String> tmpDirectoryPath() {
        return Codegen.stringProp("tmpDirectoryPath").config(config).get();
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
 * Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
 * 
 */
    public Optional<String> user() {
        return Codegen.stringProp("user").config(config).get();
    }
/**
 * True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
 * connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
 * 
 */
    public Optional<String> validateDefaultParameters() {
        return Codegen.stringProp("validateDefaultParameters").config(config).get();
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
