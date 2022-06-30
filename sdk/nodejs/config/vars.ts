// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("snowflake");

/**
 * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
 */
export declare const account: string | undefined;
Object.defineProperty(exports, "account", {
    get() {
        return __config.get("account");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
 */
export declare const browserAuth: boolean | undefined;
Object.defineProperty(exports, "browserAuth", {
    get() {
        return __config.getObject<boolean>("browserAuth");
    },
    enumerable: true,
});

/**
 * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
 */
export declare const host: string | undefined;
Object.defineProperty(exports, "host", {
    get() {
        return __config.get("host");
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
        return __config.get("oauthAccessToken");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
 */
export declare const oauthClientId: string | undefined;
Object.defineProperty(exports, "oauthClientId", {
    get() {
        return __config.get("oauthClientId");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
 */
export declare const oauthClientSecret: string | undefined;
Object.defineProperty(exports, "oauthClientSecret", {
    get() {
        return __config.get("oauthClientSecret");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
 */
export declare const oauthEndpoint: string | undefined;
Object.defineProperty(exports, "oauthEndpoint", {
    get() {
        return __config.get("oauthEndpoint");
    },
    enumerable: true,
});

/**
 * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
 */
export declare const oauthRedirectUrl: string | undefined;
Object.defineProperty(exports, "oauthRedirectUrl", {
    get() {
        return __config.get("oauthRedirectUrl");
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
        return __config.get("oauthRefreshToken");
    },
    enumerable: true,
});

/**
 * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
 * `SNOWFLAKE_PASSWORD` environment variable.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password");
    },
    enumerable: true,
});

/**
 * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
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
        return __config.get("privateKeyPassphrase");
    },
    enumerable: true,
});

/**
 * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
 * `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
 */
export declare const privateKeyPath: string | undefined;
Object.defineProperty(exports, "privateKeyPath", {
    get() {
        return __config.get("privateKeyPath");
    },
    enumerable: true,
});

/**
 * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
 * `SNOWFLAKE_REGION` environment variable.
 */
export declare const region: string | undefined;
Object.defineProperty(exports, "region", {
    get() {
        return __config.get("region");
    },
    enumerable: true,
});

/**
 * Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
 * `SNOWFLAKE_ROLE` environment variable.
 */
export declare const role: string | undefined;
Object.defineProperty(exports, "role", {
    get() {
        return __config.get("role");
    },
    enumerable: true,
});

/**
 * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username");
    },
    enumerable: true,
});

/**
 * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE enviornment variable.
 */
export declare const warehouse: string | undefined;
Object.defineProperty(exports, "warehouse", {
    get() {
        return __config.get("warehouse");
    },
    enumerable: true,
});

