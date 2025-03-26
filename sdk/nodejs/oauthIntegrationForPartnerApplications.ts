// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications example "name"
 * ```
 */
export class OauthIntegrationForPartnerApplications extends pulumi.CustomResource {
    /**
     * Get an existing OauthIntegrationForPartnerApplications resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OauthIntegrationForPartnerApplicationsState, opts?: pulumi.CustomResourceOptions): OauthIntegrationForPartnerApplications {
        return new OauthIntegrationForPartnerApplications(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications';

    /**
     * Returns true if the given object is an instance of OauthIntegrationForPartnerApplications.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OauthIntegrationForPartnerApplications {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OauthIntegrationForPartnerApplications.__pulumiType;
    }

    /**
     * A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
     */
    public readonly blockedRolesLists!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the OAuth integration.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.OauthIntegrationForPartnerApplicationsDescribeOutput[]>;
    /**
     * Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly enabled!: pulumi.Output<string | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     */
    public readonly oauthClient!: pulumi.Output<string>;
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly oauthIssueRefreshTokens!: pulumi.Output<string | undefined>;
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
     */
    public readonly oauthRedirectUri!: pulumi.Output<string | undefined>;
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     */
    public readonly oauthRefreshTokenValidity!: pulumi.Output<number | undefined>;
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     */
    public readonly oauthUseSecondaryRoles!: pulumi.Output<string | undefined>;
    /**
     * Parameters related to this security integration.
     */
    public /*out*/ readonly relatedParameters!: pulumi.Output<outputs.OauthIntegrationForPartnerApplicationsRelatedParameter[]>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.OauthIntegrationForPartnerApplicationsShowOutput[]>;

    /**
     * Create a OauthIntegrationForPartnerApplications resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OauthIntegrationForPartnerApplicationsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OauthIntegrationForPartnerApplicationsArgs | OauthIntegrationForPartnerApplicationsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OauthIntegrationForPartnerApplicationsState | undefined;
            resourceInputs["blockedRolesLists"] = state ? state.blockedRolesLists : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthClient"] = state ? state.oauthClient : undefined;
            resourceInputs["oauthIssueRefreshTokens"] = state ? state.oauthIssueRefreshTokens : undefined;
            resourceInputs["oauthRedirectUri"] = state ? state.oauthRedirectUri : undefined;
            resourceInputs["oauthRefreshTokenValidity"] = state ? state.oauthRefreshTokenValidity : undefined;
            resourceInputs["oauthUseSecondaryRoles"] = state ? state.oauthUseSecondaryRoles : undefined;
            resourceInputs["relatedParameters"] = state ? state.relatedParameters : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as OauthIntegrationForPartnerApplicationsArgs | undefined;
            if ((!args || args.oauthClient === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthClient'");
            }
            resourceInputs["blockedRolesLists"] = args ? args.blockedRolesLists : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthClient"] = args ? args.oauthClient : undefined;
            resourceInputs["oauthIssueRefreshTokens"] = args ? args.oauthIssueRefreshTokens : undefined;
            resourceInputs["oauthRedirectUri"] = args ? args.oauthRedirectUri : undefined;
            resourceInputs["oauthRefreshTokenValidity"] = args ? args.oauthRefreshTokenValidity : undefined;
            resourceInputs["oauthUseSecondaryRoles"] = args ? args.oauthUseSecondaryRoles : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["relatedParameters"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OauthIntegrationForPartnerApplications.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OauthIntegrationForPartnerApplications resources.
 */
export interface OauthIntegrationForPartnerApplicationsState {
    /**
     * A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
     */
    blockedRolesLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the OAuth integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.OauthIntegrationForPartnerApplicationsDescribeOutput>[]>;
    /**
     * Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    enabled?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     */
    oauthClient?: pulumi.Input<string>;
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    oauthIssueRefreshTokens?: pulumi.Input<string>;
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
     */
    oauthRedirectUri?: pulumi.Input<string>;
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     */
    oauthRefreshTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     */
    oauthUseSecondaryRoles?: pulumi.Input<string>;
    /**
     * Parameters related to this security integration.
     */
    relatedParameters?: pulumi.Input<pulumi.Input<inputs.OauthIntegrationForPartnerApplicationsRelatedParameter>[]>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.OauthIntegrationForPartnerApplicationsShowOutput>[]>;
}

/**
 * The set of arguments for constructing a OauthIntegrationForPartnerApplications resource.
 */
export interface OauthIntegrationForPartnerApplicationsArgs {
    /**
     * A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
     */
    blockedRolesLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the OAuth integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    enabled?: pulumi.Input<string>;
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     */
    oauthClient: pulumi.Input<string>;
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    oauthIssueRefreshTokens?: pulumi.Input<string>;
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
     */
    oauthRedirectUri?: pulumi.Input<string>;
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     */
    oauthRefreshTokenValidity?: pulumi.Input<number>;
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     */
    oauthUseSecondaryRoles?: pulumi.Input<string>;
}
