// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
     * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
     * from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
     */
    public readonly account!: pulumi.Output<string | undefined>;
    /**
     * Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
     * connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
     * UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
     */
    public readonly authenticator!: pulumi.Output<string | undefined>;
    /**
     * IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
     */
    public readonly clientIp!: pulumi.Output<string | undefined>;
    /**
     * Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
     * the `SNOWFLAKE_HOST` environment variable.
     */
    public readonly host!: pulumi.Output<string | undefined>;
    /**
     * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
     * environment variable.
     *
     * @deprecated Use `token` instead
     */
    public readonly oauthAccessToken!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     *
     * @deprecated Use `token_accessor.0.client_id` instead
     */
    public readonly oauthClientId!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
     * variable.
     *
     * @deprecated Use `token_accessor.0.client_secret` instead
     */
    public readonly oauthClientSecret!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     *
     * @deprecated Use `token_accessor.0.token_endpoint` instead
     */
    public readonly oauthEndpoint!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
     * variable.
     *
     * @deprecated Use `token_accessor.0.redirect_uri` instead
     */
    public readonly oauthRedirectUrl!: pulumi.Output<string | undefined>;
    /**
     * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
     * environment variable.
     *
     * @deprecated Use `token_accessor.0.refresh_token` instead
     */
    public readonly oauthRefreshToken!: pulumi.Output<string | undefined>;
    /**
     * The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
     * variable.
     */
    public readonly oktaUrl!: pulumi.Output<string | undefined>;
    /**
     * Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
     * the `SNOWFLAKE_PASSCODE` environment variable.
     */
    public readonly passcode!: pulumi.Output<string | undefined>;
    /**
     * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
     * the `SNOWFLAKE_PASSWORD` environment variable.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     */
    public readonly privateKey!: pulumi.Output<string | undefined>;
    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
     */
    public readonly privateKeyPassphrase!: pulumi.Output<string | undefined>;
    /**
     * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     *
     * @deprecated use the [file Function](https://developer.hashicorp.com/terraform/language/functions/file) instead
     */
    public readonly privateKeyPath!: pulumi.Output<string | undefined>;
    /**
     * Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
     * variable.
     */
    public readonly profile!: pulumi.Output<string | undefined>;
    /**
     * Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
     * to specify the region as part of the account parameter. For details, see the description of the account parameter.
     * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
     * format for the `account`
     * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
     * in the form of `<cloud_region_id>.<cloud>`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
     *
     * @deprecated Specify the region as part of the account parameter
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
     * `SNOWFLAKE_ROLE` environment variable. .
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
     * variable.
     */
    public readonly token!: pulumi.Output<string | undefined>;
    /**
     * Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
     */
    public readonly user!: pulumi.Output<string | undefined>;
    /**
     * Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
     * Required unless using `profile`.
     *
     * @deprecated Use `user` instead
     */
    public readonly username!: pulumi.Output<string | undefined>;
    /**
     * Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
     * from the `SNOWFLAKE_WAREHOUSE` environment variable.
     */
    public readonly warehouse!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["account"] = (args ? args.account : undefined) ?? utilities.getEnv("SNOWFLAKE_ACCOUNT");
            resourceInputs["authenticator"] = args ? args.authenticator : undefined;
            resourceInputs["browserAuth"] = pulumi.output((args ? args.browserAuth : undefined) ?? utilities.getEnvBoolean("SNOWFLAKE_USE_BROWSER_AUTH")).apply(JSON.stringify);
            resourceInputs["clientIp"] = args ? args.clientIp : undefined;
            resourceInputs["clientRequestMfaToken"] = pulumi.output(args ? args.clientRequestMfaToken : undefined).apply(JSON.stringify);
            resourceInputs["clientStoreTemporaryCredential"] = pulumi.output(args ? args.clientStoreTemporaryCredential : undefined).apply(JSON.stringify);
            resourceInputs["clientTimeout"] = pulumi.output(args ? args.clientTimeout : undefined).apply(JSON.stringify);
            resourceInputs["disableQueryContextCache"] = pulumi.output(args ? args.disableQueryContextCache : undefined).apply(JSON.stringify);
            resourceInputs["disableTelemetry"] = pulumi.output(args ? args.disableTelemetry : undefined).apply(JSON.stringify);
            resourceInputs["externalBrowserTimeout"] = pulumi.output(args ? args.externalBrowserTimeout : undefined).apply(JSON.stringify);
            resourceInputs["host"] = (args ? args.host : undefined) ?? utilities.getEnv("SNOWFLAKE_HOST");
            resourceInputs["insecureMode"] = pulumi.output(args ? args.insecureMode : undefined).apply(JSON.stringify);
            resourceInputs["jwtClientTimeout"] = pulumi.output(args ? args.jwtClientTimeout : undefined).apply(JSON.stringify);
            resourceInputs["jwtExpireTimeout"] = pulumi.output(args ? args.jwtExpireTimeout : undefined).apply(JSON.stringify);
            resourceInputs["keepSessionAlive"] = pulumi.output(args ? args.keepSessionAlive : undefined).apply(JSON.stringify);
            resourceInputs["loginTimeout"] = pulumi.output(args ? args.loginTimeout : undefined).apply(JSON.stringify);
            resourceInputs["oauthAccessToken"] = (args?.oauthAccessToken ? pulumi.secret(args.oauthAccessToken) : undefined) ?? utilities.getEnv("SNOWFLAKE_OAUTH_ACCESS_TOKEN");
            resourceInputs["oauthClientId"] = (args?.oauthClientId ? pulumi.secret(args.oauthClientId) : undefined) ?? utilities.getEnv("SNOWFLAKE_OAUTH_CLIENT_ID");
            resourceInputs["oauthClientSecret"] = (args?.oauthClientSecret ? pulumi.secret(args.oauthClientSecret) : undefined) ?? utilities.getEnv("SNOWFLAKE_OAUTH_CLIENT_SECRET");
            resourceInputs["oauthEndpoint"] = (args?.oauthEndpoint ? pulumi.secret(args.oauthEndpoint) : undefined) ?? utilities.getEnv("SNOWFLAKE_OAUTH_ENDPOINT");
            resourceInputs["oauthRedirectUrl"] = (args?.oauthRedirectUrl ? pulumi.secret(args.oauthRedirectUrl) : undefined) ?? utilities.getEnv("SNOWFLAKE_OAUTH_REDIRECT_URL");
            resourceInputs["oauthRefreshToken"] = (args?.oauthRefreshToken ? pulumi.secret(args.oauthRefreshToken) : undefined) ?? utilities.getEnv("SNOWFLAKE_OAUTH_REFRESH_TOKEN");
            resourceInputs["oktaUrl"] = args ? args.oktaUrl : undefined;
            resourceInputs["oscpFailOpen"] = pulumi.output(args ? args.oscpFailOpen : undefined).apply(JSON.stringify);
            resourceInputs["params"] = pulumi.output(args ? args.params : undefined).apply(JSON.stringify);
            resourceInputs["passcode"] = args ? args.passcode : undefined;
            resourceInputs["passcodeInPassword"] = pulumi.output(args ? args.passcodeInPassword : undefined).apply(JSON.stringify);
            resourceInputs["password"] = (args?.password ? pulumi.secret(args.password) : undefined) ?? utilities.getEnv("SNOWFLAKE_PASSWORD");
            resourceInputs["port"] = pulumi.output((args ? args.port : undefined) ?? utilities.getEnvNumber("SNOWFLAKE_PORT")).apply(JSON.stringify);
            resourceInputs["privateKey"] = args?.privateKey ? pulumi.secret(args.privateKey) : undefined;
            resourceInputs["privateKeyPassphrase"] = (args?.privateKeyPassphrase ? pulumi.secret(args.privateKeyPassphrase) : undefined) ?? utilities.getEnv("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE");
            resourceInputs["privateKeyPath"] = (args?.privateKeyPath ? pulumi.secret(args.privateKeyPath) : undefined) ?? utilities.getEnv("SNOWFLAKE_PRIVATE_KEY_PATH");
            resourceInputs["profile"] = args ? args.profile : undefined;
            resourceInputs["protocol"] = (args ? args.protocol : undefined) ?? utilities.getEnv("SNOWFLAKE_PROTOCOL");
            resourceInputs["region"] = (args ? args.region : undefined) ?? utilities.getEnv("SNOWFLAKE_REGION");
            resourceInputs["requestTimeout"] = pulumi.output(args ? args.requestTimeout : undefined).apply(JSON.stringify);
            resourceInputs["role"] = (args ? args.role : undefined) ?? utilities.getEnv("SNOWFLAKE_ROLE");
            resourceInputs["sessionParams"] = pulumi.output(args ? args.sessionParams : undefined).apply(JSON.stringify);
            resourceInputs["token"] = args?.token ? pulumi.secret(args.token) : undefined;
            resourceInputs["tokenAccessor"] = pulumi.output(args ? args.tokenAccessor : undefined).apply(JSON.stringify);
            resourceInputs["user"] = args ? args.user : undefined;
            resourceInputs["username"] = (args ? args.username : undefined) ?? utilities.getEnv("SNOWFLAKE_USER");
            resourceInputs["validateDefaultParameters"] = pulumi.output(args ? args.validateDefaultParameters : undefined).apply(JSON.stringify);
            resourceInputs["warehouse"] = (args ? args.warehouse : undefined) ?? utilities.getEnv("SNOWFLAKE_WAREHOUSE");
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["oauthAccessToken", "oauthClientId", "oauthClientSecret", "oauthEndpoint", "oauthRedirectUrl", "oauthRefreshToken", "password", "privateKey", "privateKeyPassphrase", "privateKeyPath", "token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
     * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
     * from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
     */
    account?: pulumi.Input<string>;
    /**
     * Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
     * connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
     * UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
     */
    authenticator?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
     *
     * @deprecated Use `authenticator` instead
     */
    browserAuth?: pulumi.Input<boolean>;
    /**
     * IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
     */
    clientIp?: pulumi.Input<string>;
    /**
     * When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
     * be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
     */
    clientRequestMfaToken?: pulumi.Input<boolean>;
    /**
     * When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
     * sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
     */
    clientStoreTemporaryCredential?: pulumi.Input<boolean>;
    /**
     * The timeout in seconds for the client to complete the authentication. Default is 900 seconds. Can also be sourced from
     * the `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
     */
    clientTimeout?: pulumi.Input<number>;
    /**
     * Should HTAP query context cache be disabled. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
     * environment variable.
     */
    disableQueryContextCache?: pulumi.Input<boolean>;
    /**
     * Indicates whether to disable telemetry. Can also be sourced from the `SNOWFLAKE_DISABLE_TELEMETRY` environment variable.
     */
    disableTelemetry?: pulumi.Input<boolean>;
    /**
     * The timeout in seconds for the external browser to complete the authentication. Default is 120 seconds. Can also be
     * sourced from the `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
     */
    externalBrowserTimeout?: pulumi.Input<number>;
    /**
     * Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
     * the `SNOWFLAKE_HOST` environment variable.
     */
    host?: pulumi.Input<string>;
    /**
     * If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
     * default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
     * environment variable.
     */
    insecureMode?: pulumi.Input<boolean>;
    /**
     * The timeout in seconds for the JWT client to complete the authentication. Default is 10 seconds. Can also be sourced
     * from the `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
     */
    jwtClientTimeout?: pulumi.Input<number>;
    /**
     * JWT expire after timeout in seconds. Can also be sourced from the `SNOWFLAKE_JWT_EXPIRE_TIMEOUT` environment variable.
     */
    jwtExpireTimeout?: pulumi.Input<number>;
    /**
     * Enables the session to persist even after the connection is closed. Can also be sourced from the
     * `SNOWFLAKE_KEEP_SESSION_ALIVE` environment variable.
     */
    keepSessionAlive?: pulumi.Input<boolean>;
    /**
     * Login retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
     * `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
     */
    loginTimeout?: pulumi.Input<number>;
    /**
     * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
     * environment variable.
     *
     * @deprecated Use `token` instead
     */
    oauthAccessToken?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     *
     * @deprecated Use `token_accessor.0.client_id` instead
     */
    oauthClientId?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
     * variable.
     *
     * @deprecated Use `token_accessor.0.client_secret` instead
     */
    oauthClientSecret?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     *
     * @deprecated Use `token_accessor.0.token_endpoint` instead
     */
    oauthEndpoint?: pulumi.Input<string>;
    /**
     * Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
     * variable.
     *
     * @deprecated Use `token_accessor.0.redirect_uri` instead
     */
    oauthRedirectUrl?: pulumi.Input<string>;
    /**
     * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
     * environment variable.
     *
     * @deprecated Use `token_accessor.0.refresh_token` instead
     */
    oauthRefreshToken?: pulumi.Input<string>;
    /**
     * The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
     * variable.
     */
    oktaUrl?: pulumi.Input<string>;
    /**
     * True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
     * sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
     */
    oscpFailOpen?: pulumi.Input<boolean>;
    /**
     * Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
     */
    params?: pulumi.Input<{[key: string]: any}>;
    /**
     * Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
     * the `SNOWFLAKE_PASSCODE` environment variable.
     */
    passcode?: pulumi.Input<string>;
    /**
     * False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
     * of the password. Can also be sourced from the `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
     */
    passcodeInPassword?: pulumi.Input<boolean>;
    /**
     * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
     * the `SNOWFLAKE_PASSWORD` environment variable.
     */
    password?: pulumi.Input<string>;
    /**
     * Support custom port values to snowflake go driver for use with privatelink. Can also be sourced from the
     * `SNOWFLAKE_PORT` environment variable.
     */
    port?: pulumi.Input<number>;
    /**
     * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     */
    privateKey?: pulumi.Input<string>;
    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
     */
    privateKeyPassphrase?: pulumi.Input<string>;
    /**
     * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     *
     * @deprecated use the [file Function](https://developer.hashicorp.com/terraform/language/functions/file) instead
     */
    privateKeyPath?: pulumi.Input<string>;
    /**
     * Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
     * variable.
     */
    profile?: pulumi.Input<string>;
    /**
     * Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
     * to specify the region as part of the account parameter. For details, see the description of the account parameter.
     * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
     * format for the `account`
     * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
     * in the form of `<cloud_region_id>.<cloud>`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
     *
     * @deprecated Specify the region as part of the account parameter
     */
    region?: pulumi.Input<string>;
    /**
     * request retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
     * `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
     */
    requestTimeout?: pulumi.Input<number>;
    /**
     * Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
     * `SNOWFLAKE_ROLE` environment variable. .
     */
    role?: pulumi.Input<string>;
    /**
     * Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
     *
     * @deprecated Use `params` instead
     */
    sessionParams?: pulumi.Input<{[key: string]: any}>;
    /**
     * Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
     * variable.
     */
    token?: pulumi.Input<string>;
    tokenAccessor?: pulumi.Input<inputs.ProviderTokenAccessor>;
    /**
     * Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
     */
    user?: pulumi.Input<string>;
    /**
     * Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
     * Required unless using `profile`.
     *
     * @deprecated Use `user` instead
     */
    username?: pulumi.Input<string>;
    /**
     * If true, disables the validation checks for Database, Schema, Warehouse and Role at the time a connection is
     * established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
     */
    validateDefaultParameters?: pulumi.Input<boolean>;
    /**
     * Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
     * from the `SNOWFLAKE_WAREHOUSE` environment variable.
     */
    warehouse?: pulumi.Input<string>;
}
