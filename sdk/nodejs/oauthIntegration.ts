// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/oauthIntegration:OauthIntegration example name
 * ```
 */
export class OauthIntegration extends pulumi.CustomResource {
    /**
     * Get an existing OauthIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OauthIntegrationState, opts?: pulumi.CustomResourceOptions): OauthIntegration {
        return new OauthIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/oauthIntegration:OauthIntegration';

    /**
     * Returns true if the given object is an instance of OauthIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OauthIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OauthIntegration.__pulumiType;
    }

    /**
     * List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     */
    public readonly blockedRolesLists!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the OAuth integration.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Date and time when the OAuth integration was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Specifies whether this OAuth integration is enabled or disabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the OAuth client type.
     */
    public readonly oauthClient!: pulumi.Output<string>;
    /**
     * Specifies the type of client being registered. Snowflake supports both confidential and public clients.
     */
    public readonly oauthClientType!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     */
    public readonly oauthIssueRefreshTokens!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     */
    public readonly oauthRedirectUri!: pulumi.Output<string | undefined>;
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     */
    public readonly oauthRefreshTokenValidity!: pulumi.Output<number | undefined>;
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     */
    public readonly oauthUseSecondaryRoles!: pulumi.Output<string | undefined>;

    /**
     * Create a OauthIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OauthIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OauthIntegrationArgs | OauthIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OauthIntegrationState | undefined;
            resourceInputs["blockedRolesLists"] = state ? state.blockedRolesLists : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthClient"] = state ? state.oauthClient : undefined;
            resourceInputs["oauthClientType"] = state ? state.oauthClientType : undefined;
            resourceInputs["oauthIssueRefreshTokens"] = state ? state.oauthIssueRefreshTokens : undefined;
            resourceInputs["oauthRedirectUri"] = state ? state.oauthRedirectUri : undefined;
            resourceInputs["oauthRefreshTokenValidity"] = state ? state.oauthRefreshTokenValidity : undefined;
            resourceInputs["oauthUseSecondaryRoles"] = state ? state.oauthUseSecondaryRoles : undefined;
        } else {
            const args = argsOrState as OauthIntegrationArgs | undefined;
            if ((!args || args.oauthClient === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthClient'");
            }
            resourceInputs["blockedRolesLists"] = args ? args.blockedRolesLists : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthClient"] = args ? args.oauthClient : undefined;
            resourceInputs["oauthClientType"] = args ? args.oauthClientType : undefined;
            resourceInputs["oauthIssueRefreshTokens"] = args ? args.oauthIssueRefreshTokens : undefined;
            resourceInputs["oauthRedirectUri"] = args ? args.oauthRedirectUri : undefined;
            resourceInputs["oauthRefreshTokenValidity"] = args ? args.oauthRefreshTokenValidity : undefined;
            resourceInputs["oauthUseSecondaryRoles"] = args ? args.oauthUseSecondaryRoles : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OauthIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OauthIntegration resources.
 */
export interface OauthIntegrationState {
    /**
     * List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     */
    blockedRolesLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the OAuth integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Date and time when the OAuth integration was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Specifies whether this OAuth integration is enabled or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the OAuth client type.
     */
    oauthClient?: pulumi.Input<string>;
    /**
     * Specifies the type of client being registered. Snowflake supports both confidential and public clients.
     */
    oauthClientType?: pulumi.Input<string>;
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     */
    oauthIssueRefreshTokens?: pulumi.Input<boolean>;
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     */
    oauthRedirectUri?: pulumi.Input<string>;
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     */
    oauthRefreshTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     */
    oauthUseSecondaryRoles?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OauthIntegration resource.
 */
export interface OauthIntegrationArgs {
    /**
     * List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     */
    blockedRolesLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the OAuth integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether this OAuth integration is enabled or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the OAuth client type.
     */
    oauthClient: pulumi.Input<string>;
    /**
     * Specifies the type of client being registered. Snowflake supports both confidential and public clients.
     */
    oauthClientType?: pulumi.Input<string>;
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     */
    oauthIssueRefreshTokens?: pulumi.Input<boolean>;
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     */
    oauthRedirectUri?: pulumi.Input<string>;
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     */
    oauthRefreshTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     */
    oauthUseSecondaryRoles?: pulumi.Input<string>;
}
