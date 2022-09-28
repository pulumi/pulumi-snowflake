// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the snowflake package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'snowflake';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Provider.__pulumiType;
    }

    /**
     * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
     */
    public readonly account!: pulumi.Output<string>;
    /**
     * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
     */
    public readonly host!: pulumi.Output<string | undefined>;
    /**
     * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
     * variable.
     */
    public readonly oauthAccessToken!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     */
    public readonly oauthClientId!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
     */
    public readonly oauthClientSecret!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     */
    public readonly oauthEndpoint!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
     */
    public readonly oauthRedirectUrl!: pulumi.Output<string | undefined>;
    /**
     * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
     * variable.
     */
    public readonly oauthRefreshToken!: pulumi.Output<string | undefined>;
    /**
     * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
     * `SNOWFLAKE_PASSWORD` environment variable.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     */
    public readonly privateKey!: pulumi.Output<string | undefined>;
    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc
     */
    public readonly privateKeyPassphrase!: pulumi.Output<string | undefined>;
    /**
     * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     */
    public readonly privateKeyPath!: pulumi.Output<string | undefined>;
    /**
     * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
     * `SNOWFLAKE_REGION` environment variable.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
     * `SNOWFLAKE_ROLE` environment variable.
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
     */
    public readonly username!: pulumi.Output<string>;
    /**
     * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE enviornment variable.
     */
    public readonly warehouse!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            if ((!args || args.account === undefined) && !opts.urn) {
                throw new Error("Missing required property 'account'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["account"] = args ? args.account : undefined;
            resourceInputs["browserAuth"] = pulumi.output(args ? args.browserAuth : undefined).apply(JSON.stringify);
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["oauthAccessToken"] = args?.oauthAccessToken ? pulumi.secret(args.oauthAccessToken) : undefined;
            resourceInputs["oauthClientId"] = args?.oauthClientId ? pulumi.secret(args.oauthClientId) : undefined;
            resourceInputs["oauthClientSecret"] = args?.oauthClientSecret ? pulumi.secret(args.oauthClientSecret) : undefined;
            resourceInputs["oauthEndpoint"] = args?.oauthEndpoint ? pulumi.secret(args.oauthEndpoint) : undefined;
            resourceInputs["oauthRedirectUrl"] = args?.oauthRedirectUrl ? pulumi.secret(args.oauthRedirectUrl) : undefined;
            resourceInputs["oauthRefreshToken"] = args?.oauthRefreshToken ? pulumi.secret(args.oauthRefreshToken) : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["privateKey"] = args?.privateKey ? pulumi.secret(args.privateKey) : undefined;
            resourceInputs["privateKeyPassphrase"] = args?.privateKeyPassphrase ? pulumi.secret(args.privateKeyPassphrase) : undefined;
            resourceInputs["privateKeyPath"] = args?.privateKeyPath ? pulumi.secret(args.privateKeyPath) : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["warehouse"] = args ? args.warehouse : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["oauthAccessToken", "oauthClientId", "oauthClientSecret", "oauthEndpoint", "oauthRedirectUrl", "oauthRefreshToken", "password", "privateKey", "privateKeyPassphrase", "privateKeyPath"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
     */
    account: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
     */
    browserAuth?: pulumi.Input<boolean>;
    /**
     * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
     */
    host?: pulumi.Input<string>;
    /**
     * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
     * variable.
     */
    oauthAccessToken?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     */
    oauthClientId?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
     */
    oauthClientSecret?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     */
    oauthEndpoint?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
     */
    oauthRedirectUrl?: pulumi.Input<string>;
    /**
     * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
     * variable.
     */
    oauthRefreshToken?: pulumi.Input<string>;
    /**
     * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
     * `SNOWFLAKE_PASSWORD` environment variable.
     */
    password?: pulumi.Input<string>;
    /**
     * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     */
    privateKey?: pulumi.Input<string>;
    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc
     */
    privateKeyPassphrase?: pulumi.Input<string>;
    /**
     * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     */
    privateKeyPath?: pulumi.Input<string>;
    /**
     * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
     * `SNOWFLAKE_REGION` environment variable.
     */
    region: pulumi.Input<string>;
    /**
     * Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
     * `SNOWFLAKE_ROLE` environment variable.
     */
    role?: pulumi.Input<string>;
    /**
     * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
     */
    username: pulumi.Input<string>;
    /**
     * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE enviornment variable.
     */
    warehouse?: pulumi.Input<string>;
}
