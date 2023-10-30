// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("snowflake");

/**
 * Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
 * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
 * from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
 */
export declare const account: string | undefined;
Object.defineProperty(exports, "account", {
    get() {
        return __config.get("account") ?? utilities.getEnv("SNOWFLAKE_ACCOUNT");
    },
    enumerable: true,
});

/**
 * Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
 * connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
 * UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
 */
export declare const authenticator: string | undefined;
Object.defineProperty(exports, "authenticator", {
    get() {
        return __config.get("authenticator");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
 */
export declare const browserAuth: boolean | undefined;
Object.defineProperty(exports, "browserAuth", {
    get() {
        return __config.getObject<boolean>("browserAuth") ?? utilities.getEnvBoolean("SNOWFLAKE_USE_BROWSER_AUTH");
    },
    enumerable: true,
});

/**
 * IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
 */
export declare const clientIp: string | undefined;
Object.defineProperty(exports, "clientIp", {
    get() {
        return __config.get("clientIp");
    },
    enumerable: true,
});

/**
 * When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
 * be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
 */
export declare const clientRequestMfaToken: boolean | undefined;
Object.defineProperty(exports, "clientRequestMfaToken", {
    get() {
        return __config.getObject<boolean>("clientRequestMfaToken");
    },
    enumerable: true,
});

/**
 * When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
 * sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
 */
export declare const clientStoreTemporaryCredential: boolean | undefined;
Object.defineProperty(exports, "clientStoreTemporaryCredential", {
    get() {
        return __config.getObject<boolean>("clientStoreTemporaryCredential");
    },
    enumerable: true,
});

/**
 * The timeout in seconds for the client to complete the authentication. Default is 900 seconds. Can also be sourced from
 * the `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
 */
export declare const clientTimeout: number | undefined;
Object.defineProperty(exports, "clientTimeout", {
    get() {
        return __config.getObject<number>("clientTimeout");
    },
    enumerable: true,
});

/**
 * Should HTAP query context cache be disabled. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
 * environment variable.
 */
export declare const disableQueryContextCache: boolean | undefined;
Object.defineProperty(exports, "disableQueryContextCache", {
    get() {
        return __config.getObject<boolean>("disableQueryContextCache");
    },
    enumerable: true,
});

/**
 * Indicates whether to disable telemetry. Can also be sourced from the `SNOWFLAKE_DISABLE_TELEMETRY` environment variable.
 */
export declare const disableTelemetry: boolean | undefined;
Object.defineProperty(exports, "disableTelemetry", {
    get() {
        return __config.getObject<boolean>("disableTelemetry");
    },
    enumerable: true,
});

/**
 * The timeout in seconds for the external browser to complete the authentication. Default is 120 seconds. Can also be
 * sourced from the `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
 */
export declare const externalBrowserTimeout: number | undefined;
Object.defineProperty(exports, "externalBrowserTimeout", {
    get() {
        return __config.getObject<number>("externalBrowserTimeout");
    },
    enumerable: true,
});

/**
 * Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
 * the `SNOWFLAKE_HOST` environment variable.
 */
export declare const host: string | undefined;
Object.defineProperty(exports, "host", {
    get() {
        return __config.get("host") ?? utilities.getEnv("SNOWFLAKE_HOST");
    },
    enumerable: true,
});

/**
 * If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
 * default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
 * environment variable.
 */
export declare const insecureMode: boolean | undefined;
Object.defineProperty(exports, "insecureMode", {
    get() {
        return __config.getObject<boolean>("insecureMode");
    },
    enumerable: true,
});

/**
 * The timeout in seconds for the JWT client to complete the authentication. Default is 10 seconds. Can also be sourced
 * from the `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
 */
export declare const jwtClientTimeout: number | undefined;
Object.defineProperty(exports, "jwtClientTimeout", {
    get() {
        return __config.getObject<number>("jwtClientTimeout");
    },
    enumerable: true,
});

/**
 * JWT expire after timeout in seconds. Can also be sourced from the `SNOWFLAKE_JWT_EXPIRE_TIMEOUT` environment variable.
 */
export declare const jwtExpireTimeout: number | undefined;
Object.defineProperty(exports, "jwtExpireTimeout", {
    get() {
        return __config.getObject<number>("jwtExpireTimeout");
    },
    enumerable: true,
});

/**
 * Enables the session to persist even after the connection is closed. Can also be sourced from the
 * `SNOWFLAKE_KEEP_SESSION_ALIVE` environment variable.
 */
export declare const keepSessionAlive: boolean | undefined;
Object.defineProperty(exports, "keepSessionAlive", {
    get() {
        return __config.getObject<boolean>("keepSessionAlive");
    },
    enumerable: true,
});

/**
 * Login retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
 * `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
 */
export declare const loginTimeout: number | undefined;
Object.defineProperty(exports, "loginTimeout", {
    get() {
        return __config.getObject<number>("loginTimeout");
    },
    enumerable: true,
});

/**
 * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
 * environment variable.
 */
export declare const oauthAccessToken: string | undefined;
Object.defineProperty(exports, "oauthAccessToken", {
    get() {
        return __config.get("oauthAccessToken") ?? utilities.getEnv("SNOWFLAKE_OAUTH_ACCESS_TOKEN");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
 */
export declare const oauthClientId: string | undefined;
Object.defineProperty(exports, "oauthClientId", {
    get() {
        return __config.get("oauthClientId") ?? utilities.getEnv("SNOWFLAKE_OAUTH_CLIENT_ID");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
 * variable.
 */
export declare const oauthClientSecret: string | undefined;
Object.defineProperty(exports, "oauthClientSecret", {
    get() {
        return __config.get("oauthClientSecret") ?? utilities.getEnv("SNOWFLAKE_OAUTH_CLIENT_SECRET");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
 */
export declare const oauthEndpoint: string | undefined;
Object.defineProperty(exports, "oauthEndpoint", {
    get() {
        return __config.get("oauthEndpoint") ?? utilities.getEnv("SNOWFLAKE_OAUTH_ENDPOINT");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
 * variable.
 */
export declare const oauthRedirectUrl: string | undefined;
Object.defineProperty(exports, "oauthRedirectUrl", {
    get() {
        return __config.get("oauthRedirectUrl") ?? utilities.getEnv("SNOWFLAKE_OAUTH_REDIRECT_URL");
    },
    enumerable: true,
});

/**
 * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
 * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
 * environment variable.
 */
export declare const oauthRefreshToken: string | undefined;
Object.defineProperty(exports, "oauthRefreshToken", {
    get() {
        return __config.get("oauthRefreshToken") ?? utilities.getEnv("SNOWFLAKE_OAUTH_REFRESH_TOKEN");
    },
    enumerable: true,
});

/**
 * The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
 * variable.
 */
export declare const oktaUrl: string | undefined;
Object.defineProperty(exports, "oktaUrl", {
    get() {
        return __config.get("oktaUrl");
    },
    enumerable: true,
});

/**
 * True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
 * sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
 */
export declare const oscpFailOpen: boolean | undefined;
Object.defineProperty(exports, "oscpFailOpen", {
    get() {
        return __config.getObject<boolean>("oscpFailOpen");
    },
    enumerable: true,
});

/**
 * Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
 */
export declare const params: {[key: string]: any} | undefined;
Object.defineProperty(exports, "params", {
    get() {
        return __config.getObject<{[key: string]: any}>("params");
    },
    enumerable: true,
});

/**
 * Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
 * the `SNOWFLAKE_PASSCODE` environment variable.
 */
export declare const passcode: string | undefined;
Object.defineProperty(exports, "passcode", {
    get() {
        return __config.get("passcode");
    },
    enumerable: true,
});

/**
 * False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
 * of the password. Can also be sourced from the `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
 */
export declare const passcodeInPassword: boolean | undefined;
Object.defineProperty(exports, "passcodeInPassword", {
    get() {
        return __config.getObject<boolean>("passcodeInPassword");
    },
    enumerable: true,
});

/**
 * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
 * the `SNOWFLAKE_PASSWORD` environment variable.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password") ?? utilities.getEnv("SNOWFLAKE_PASSWORD");
    },
    enumerable: true,
});

/**
 * Support custom port values to snowflake go driver for use with privatelink. Can also be sourced from the
 * `SNOWFLAKE_PORT` environment variable.
 */
export declare const port: number | undefined;
Object.defineProperty(exports, "port", {
    get() {
        return __config.getObject<number>("port") ?? utilities.getEnvNumber("SNOWFLAKE_PORT");
    },
    enumerable: true,
});

/**
 * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
 * `SNOWFLAKE_PRIVATE_KEY` environment variable.
 */
export declare const privateKey: string | undefined;
Object.defineProperty(exports, "privateKey", {
    get() {
        return __config.get("privateKey");
    },
    enumerable: true,
});

/**
 * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
 * des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
 */
export declare const privateKeyPassphrase: string | undefined;
Object.defineProperty(exports, "privateKeyPassphrase", {
    get() {
        return __config.get("privateKeyPassphrase") ?? utilities.getEnv("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE");
    },
    enumerable: true,
});

/**
 * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
 * `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
 */
export declare const privateKeyPath: string | undefined;
Object.defineProperty(exports, "privateKeyPath", {
    get() {
        return __config.get("privateKeyPath") ?? utilities.getEnv("SNOWFLAKE_PRIVATE_KEY_PATH");
    },
    enumerable: true,
});

/**
 * Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
 * variable.
 */
export declare const profile: string | undefined;
Object.defineProperty(exports, "profile", {
    get() {
        return __config.get("profile");
    },
    enumerable: true,
});

/**
 * Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
 */
export declare const protocol: string | undefined;
Object.defineProperty(exports, "protocol", {
    get() {
        return __config.get("protocol") ?? utilities.getEnv("SNOWFLAKE_PROTOCOL");
    },
    enumerable: true,
});

/**
 * Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
 * to specify the region as part of the account parameter. For details, see the description of the account parameter.
 * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
 * format for the `account`
 * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
 * in the form of `<cloud_region_id>.<cloud>`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
 */
export declare const region: string | undefined;
Object.defineProperty(exports, "region", {
    get() {
        return __config.get("region") ?? utilities.getEnv("SNOWFLAKE_REGION");
    },
    enumerable: true,
});

/**
 * request retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
 * `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
 */
export declare const requestTimeout: number | undefined;
Object.defineProperty(exports, "requestTimeout", {
    get() {
        return __config.getObject<number>("requestTimeout");
    },
    enumerable: true,
});

/**
 * Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
 * `SNOWFLAKE_ROLE` environment variable. .
 */
export declare const role: string | undefined;
Object.defineProperty(exports, "role", {
    get() {
        return __config.get("role") ?? utilities.getEnv("SNOWFLAKE_ROLE");
    },
    enumerable: true,
});

/**
 * Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
 */
export declare const sessionParams: {[key: string]: any} | undefined;
Object.defineProperty(exports, "sessionParams", {
    get() {
        return __config.getObject<{[key: string]: any}>("sessionParams");
    },
    enumerable: true,
});

/**
 * Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
 * variable.
 */
export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});

export declare const tokenAccessor: outputs.config.TokenAccessor | undefined;
Object.defineProperty(exports, "tokenAccessor", {
    get() {
        return __config.getObject<outputs.config.TokenAccessor>("tokenAccessor");
    },
    enumerable: true,
});

/**
 * Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
 */
export declare const user: string | undefined;
Object.defineProperty(exports, "user", {
    get() {
        return __config.get("user");
    },
    enumerable: true,
});

/**
 * Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USERNAME` environment variable.
 * Required unless using `profile`.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username") ?? utilities.getEnv("SNOWFLAKE_USER");
    },
    enumerable: true,
});

/**
 * If true, disables the validation checks for Database, Schema, Warehouse and Role at the time a connection is
 * established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
 */
export declare const validateDefaultParameters: boolean | undefined;
Object.defineProperty(exports, "validateDefaultParameters", {
    get() {
        return __config.getObject<boolean>("validateDefaultParameters");
    },
    enumerable: true,
});

/**
 * Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
 * from the `SNOWFLAKE_WAREHOUSE` environment variable.
 */
export declare const warehouse: string | undefined;
Object.defineProperty(exports, "warehouse", {
    get() {
        return __config.get("warehouse") ?? utilities.getEnv("SNOWFLAKE_WAREHOUSE");
    },
    enumerable: true,
});

