// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("snowflake");

export declare const account: string | undefined;
Object.defineProperty(exports, "account", {
    get() {
        return __config.get("account");
    },
    enumerable: true,
});

export declare const browserAuth: boolean | undefined;
Object.defineProperty(exports, "browserAuth", {
    get() {
        return __config.getObject<boolean>("browserAuth");
    },
    enumerable: true,
});

/**
 * Supports passing in a custom host value to the snowflake go driver for use with privatelink
 */
export declare const host: string | undefined;
Object.defineProperty(exports, "host", {
    get() {
        return __config.get("host");
    },
    enumerable: true,
});

export declare const oauthAccessToken: string | undefined;
Object.defineProperty(exports, "oauthAccessToken", {
    get() {
        return __config.get("oauthAccessToken");
    },
    enumerable: true,
});

export declare const oauthClientId: string | undefined;
Object.defineProperty(exports, "oauthClientId", {
    get() {
        return __config.get("oauthClientId");
    },
    enumerable: true,
});

export declare const oauthClientSecret: string | undefined;
Object.defineProperty(exports, "oauthClientSecret", {
    get() {
        return __config.get("oauthClientSecret");
    },
    enumerable: true,
});

export declare const oauthEndpoint: string | undefined;
Object.defineProperty(exports, "oauthEndpoint", {
    get() {
        return __config.get("oauthEndpoint");
    },
    enumerable: true,
});

export declare const oauthRedirectUrl: string | undefined;
Object.defineProperty(exports, "oauthRedirectUrl", {
    get() {
        return __config.get("oauthRedirectUrl");
    },
    enumerable: true,
});

export declare const oauthRefreshToken: string | undefined;
Object.defineProperty(exports, "oauthRefreshToken", {
    get() {
        return __config.get("oauthRefreshToken");
    },
    enumerable: true,
});

export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password");
    },
    enumerable: true,
});

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

export declare const privateKeyPath: string | undefined;
Object.defineProperty(exports, "privateKeyPath", {
    get() {
        return __config.get("privateKeyPath");
    },
    enumerable: true,
});

export declare const region: string | undefined;
Object.defineProperty(exports, "region", {
    get() {
        return __config.get("region");
    },
    enumerable: true,
});

export declare const role: string | undefined;
Object.defineProperty(exports, "role", {
    get() {
        return __config.get("role");
    },
    enumerable: true,
});

export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username");
    },
    enumerable: true,
});

