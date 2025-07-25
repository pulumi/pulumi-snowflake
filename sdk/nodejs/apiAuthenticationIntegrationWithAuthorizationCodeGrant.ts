// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/apiAuthenticationIntegrationWithAuthorizationCodeGrant:ApiAuthenticationIntegrationWithAuthorizationCodeGrant example '"<integration_name>"'
 * ```
 */
export class ApiAuthenticationIntegrationWithAuthorizationCodeGrant extends pulumi.CustomResource {
    /**
     * Get an existing ApiAuthenticationIntegrationWithAuthorizationCodeGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiAuthenticationIntegrationWithAuthorizationCodeGrantState, opts?: pulumi.CustomResourceOptions): ApiAuthenticationIntegrationWithAuthorizationCodeGrant {
        return new ApiAuthenticationIntegrationWithAuthorizationCodeGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/apiAuthenticationIntegrationWithAuthorizationCodeGrant:ApiAuthenticationIntegrationWithAuthorizationCodeGrant';

    /**
     * Returns true if the given object is an instance of ApiAuthenticationIntegrationWithAuthorizationCodeGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiAuthenticationIntegrationWithAuthorizationCodeGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiAuthenticationIntegrationWithAuthorizationCodeGrant.__pulumiType;
    }

    /**
     * Specifies a comment for the integration.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutput[]>;
    /**
     * Specifies whether this security integration is enabled or disabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     */
    public readonly oauthAccessTokenValidity!: pulumi.Output<number | undefined>;
    /**
     * Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     */
    public readonly oauthAllowedScopes!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the URL for authenticating to the external service. If removed from the config, the resource is recreated.
     */
    public readonly oauthAuthorizationEndpoint!: pulumi.Output<string | undefined>;
    /**
     * Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     */
    public readonly oauthClientAuthMethod!: pulumi.Output<string | undefined>;
    /**
     * Specifies the client ID for the OAuth application in the external service.
     */
    public readonly oauthClientId!: pulumi.Output<string>;
    public readonly oauthClientSecret!: pulumi.Output<string>;
    /**
     * Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     */
    public readonly oauthRefreshTokenValidity!: pulumi.Output<number | undefined>;
    /**
     * Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     */
    public readonly oauthTokenEndpoint!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantShowOutput[]>;

    /**
     * Create a ApiAuthenticationIntegrationWithAuthorizationCodeGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs | ApiAuthenticationIntegrationWithAuthorizationCodeGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiAuthenticationIntegrationWithAuthorizationCodeGrantState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthAccessTokenValidity"] = state ? state.oauthAccessTokenValidity : undefined;
            resourceInputs["oauthAllowedScopes"] = state ? state.oauthAllowedScopes : undefined;
            resourceInputs["oauthAuthorizationEndpoint"] = state ? state.oauthAuthorizationEndpoint : undefined;
            resourceInputs["oauthClientAuthMethod"] = state ? state.oauthClientAuthMethod : undefined;
            resourceInputs["oauthClientId"] = state ? state.oauthClientId : undefined;
            resourceInputs["oauthClientSecret"] = state ? state.oauthClientSecret : undefined;
            resourceInputs["oauthRefreshTokenValidity"] = state ? state.oauthRefreshTokenValidity : undefined;
            resourceInputs["oauthTokenEndpoint"] = state ? state.oauthTokenEndpoint : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.oauthClientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthClientId'");
            }
            if ((!args || args.oauthClientSecret === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthClientSecret'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthAccessTokenValidity"] = args ? args.oauthAccessTokenValidity : undefined;
            resourceInputs["oauthAllowedScopes"] = args ? args.oauthAllowedScopes : undefined;
            resourceInputs["oauthAuthorizationEndpoint"] = args ? args.oauthAuthorizationEndpoint : undefined;
            resourceInputs["oauthClientAuthMethod"] = args ? args.oauthClientAuthMethod : undefined;
            resourceInputs["oauthClientId"] = args?.oauthClientId ? pulumi.secret(args.oauthClientId) : undefined;
            resourceInputs["oauthClientSecret"] = args?.oauthClientSecret ? pulumi.secret(args.oauthClientSecret) : undefined;
            resourceInputs["oauthRefreshTokenValidity"] = args ? args.oauthRefreshTokenValidity : undefined;
            resourceInputs["oauthTokenEndpoint"] = args ? args.oauthTokenEndpoint : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["oauthClientId", "oauthClientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApiAuthenticationIntegrationWithAuthorizationCodeGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiAuthenticationIntegrationWithAuthorizationCodeGrant resources.
 */
export interface ApiAuthenticationIntegrationWithAuthorizationCodeGrantState {
    /**
     * Specifies a comment for the integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutput>[]>;
    /**
     * Specifies whether this security integration is enabled or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     */
    oauthAccessTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     */
    oauthAllowedScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the URL for authenticating to the external service. If removed from the config, the resource is recreated.
     */
    oauthAuthorizationEndpoint?: pulumi.Input<string>;
    /**
     * Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     */
    oauthClientAuthMethod?: pulumi.Input<string>;
    /**
     * Specifies the client ID for the OAuth application in the external service.
     */
    oauthClientId?: pulumi.Input<string>;
    oauthClientSecret?: pulumi.Input<string>;
    /**
     * Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     */
    oauthRefreshTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     */
    oauthTokenEndpoint?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantShowOutput>[]>;
}

/**
 * The set of arguments for constructing a ApiAuthenticationIntegrationWithAuthorizationCodeGrant resource.
 */
export interface ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs {
    /**
     * Specifies a comment for the integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether this security integration is enabled or disabled.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     */
    oauthAccessTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     */
    oauthAllowedScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the URL for authenticating to the external service. If removed from the config, the resource is recreated.
     */
    oauthAuthorizationEndpoint?: pulumi.Input<string>;
    /**
     * Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     */
    oauthClientAuthMethod?: pulumi.Input<string>;
    /**
     * Specifies the client ID for the OAuth application in the external service.
     */
    oauthClientId: pulumi.Input<string>;
    oauthClientSecret: pulumi.Input<string>;
    /**
     * Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     */
    oauthRefreshTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     */
    oauthTokenEndpoint?: pulumi.Input<string>;
}
