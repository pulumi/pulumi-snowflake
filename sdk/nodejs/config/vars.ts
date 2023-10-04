// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("snowflake");

/**
 * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
 * using profile.
 */
export declare const account: string | undefined;
Object.defineProperty(exports, "account", {
    get() {
        return __config.get("account") ?? utilities.getEnv("SNOWFLAKE_ACCOUNT");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
 */
export declare const browserAuth: boolean | undefined;
Object.defineProperty(exports, "browserAuth", {
    get() {
        return __config.getObject<boolean>("browserAuth") ?? utilities.getEnvBoolean("SNOWFLAKE_USE_BROWSER_AUTH");
    },
    enumerable: true,
});

/**
 * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
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
 * default value for testing or emergency situations only.
 */
export declare const insecureMode: boolean | undefined;
Object.defineProperty(exports, "insecureMode", {
    get() {
        return __config.getObject<boolean>("insecureMode");
    },
    enumerable: true,
});

/**
 * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
 * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
 * variable.
 */
export declare const oauthAccessToken: string | undefined;
Object.defineProperty(exports, "oauthAccessToken", {
    get() {
        return __config.get("oauthAccessToken") ?? utilities.getEnv("SNOWFLAKE_OAUTH_ACCESS_TOKEN");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
 */
export declare const oauthClientId: string | undefined;
Object.defineProperty(exports, "oauthClientId", {
    get() {
        return __config.get("oauthClientId") ?? utilities.getEnv("SNOWFLAKE_OAUTH_CLIENT_ID");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
 */
export declare const oauthClientSecret: string | undefined;
Object.defineProperty(exports, "oauthClientSecret", {
    get() {
        return __config.get("oauthClientSecret") ?? utilities.getEnv("SNOWFLAKE_OAUTH_CLIENT_SECRET");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
 */
export declare const oauthEndpoint: string | undefined;
Object.defineProperty(exports, "oauthEndpoint", {
    get() {
        return __config.get("oauthEndpoint") ?? utilities.getEnv("SNOWFLAKE_OAUTH_ENDPOINT");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
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
 * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
 * variable.
 */
export declare const oauthRefreshToken: string | undefined;
Object.defineProperty(exports, "oauthRefreshToken", {
    get() {
        return __config.get("oauthRefreshToken") ?? utilities.getEnv("SNOWFLAKE_OAUTH_REFRESH_TOKEN");
    },
    enumerable: true,
});

/**
 * Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login.
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
 * of the password.
 */
export declare const passcodeInPassword: boolean | undefined;
Object.defineProperty(exports, "passcodeInPassword", {
    get() {
        return __config.getObject<boolean>("passcodeInPassword");
    },
    enumerable: true,
});

/**
 * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
 * `SNOWFLAKE_PASSWORD` environment variable.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password") ?? utilities.getEnv("SNOWFLAKE_PASSWORD");
    },
    enumerable: true,
});

/**
 * Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
 * environment variable.
 */
export declare const port: number | undefined;
Object.defineProperty(exports, "port", {
    get() {
        return __config.getObject<number>("port") ?? utilities.getEnvNumber("SNOWFLAKE_PORT");
    },
    enumerable: true,
});

/**
 * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
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
 * des-ede3-cbc
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
 * `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
 */
export declare const privateKeyPath: string | undefined;
Object.defineProperty(exports, "privateKeyPath", {
    get() {
        return __config.get("privateKeyPath") ?? utilities.getEnv("SNOWFLAKE_PRIVATE_KEY_PATH");
    },
    enumerable: true,
});

/**
 * Sets the profile to read from ~/.snowflake/config file.
 */
export declare const profile: string | undefined;
Object.defineProperty(exports, "profile", {
    get() {
        return __config.get("profile");
    },
    enumerable: true,
});

/**
 * Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
 */
export declare const protocol: string | undefined;
Object.defineProperty(exports, "protocol", {
    get() {
        return __config.get("protocol") ?? utilities.getEnv("SNOWFLAKE_PROTOCOL");
    },
    enumerable: true,
});

/**
 * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
 * format for the `account`
 * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
 * in the form of `<cloud_region_id>.<cloud>`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
 */
export declare const region: string | undefined;
Object.defineProperty(exports, "region", {
    get() {
        return __config.get("region") ?? utilities.getEnv("SNOWFLAKE_REGION");
    },
    enumerable: true,
});

/**
 * Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
 * `SNOWFLAKE_ROLE` environment variable.
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
 * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
 * using profile.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username") ?? utilities.getEnv("SNOWFLAKE_USER");
    },
    enumerable: true,
});

/**
 * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
 */
export declare const warehouse: string | undefined;
Object.defineProperty(exports, "warehouse", {
    get() {
        return __config.get("warehouse") ?? utilities.getEnv("SNOWFLAKE_WAREHOUSE");
    },
    enumerable: true,
});

