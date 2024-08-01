// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 *
 * Resource used to manage scim security integration objects. For more information, check [security integrations documentation](https://docs.snowflake.com/en/sql-reference/sql/create-security-integration-scim).
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/scimIntegration:ScimIntegration example "name"
 * ```
 */
export class ScimIntegration extends pulumi.CustomResource {
    /**
     * Get an existing ScimIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScimIntegrationState, opts?: pulumi.CustomResourceOptions): ScimIntegration {
        return new ScimIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/scimIntegration:ScimIntegration';

    /**
     * Returns true if the given object is an instance of ScimIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScimIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScimIntegration.__pulumiType;
    }

    /**
     * Specifies a comment for the integration.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.ScimIntegrationDescribeOutput[]>;
    /**
     * Specify whether the security integration is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * String that specifies the identifier (i.e. name) for the integration; must be unique in your account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies an existing network policy that controls SCIM network traffic.
     */
    public readonly networkPolicy!: pulumi.Output<string | undefined>;
    /**
     * Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM. Provider assumes that the specified role is already provided. Valid options are: `OKTA_PROVISIONER` | `AAD_PROVISIONER` | `GENERIC_SCIM_PROVISIONER`.
     */
    public readonly runAsRole!: pulumi.Output<string>;
    /**
     * Specifies the client type for the scim integration. Valid options are: `OKTA` | `AZURE` | `GENERIC`.
     */
    public readonly scimClient!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.ScimIntegrationShowOutput[]>;
    /**
     * Specifies whether to enable or disable the synchronization of a user password from an Okta SCIM client as part of the API request to Snowflake. This property is not supported for Azure SCIM. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly syncPassword!: pulumi.Output<string | undefined>;

    /**
     * Create a ScimIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScimIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScimIntegrationArgs | ScimIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScimIntegrationState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkPolicy"] = state ? state.networkPolicy : undefined;
            resourceInputs["runAsRole"] = state ? state.runAsRole : undefined;
            resourceInputs["scimClient"] = state ? state.scimClient : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["syncPassword"] = state ? state.syncPassword : undefined;
        } else {
            const args = argsOrState as ScimIntegrationArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.runAsRole === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runAsRole'");
            }
            if ((!args || args.scimClient === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scimClient'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkPolicy"] = args ? args.networkPolicy : undefined;
            resourceInputs["runAsRole"] = args ? args.runAsRole : undefined;
            resourceInputs["scimClient"] = args ? args.scimClient : undefined;
            resourceInputs["syncPassword"] = args ? args.syncPassword : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ScimIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScimIntegration resources.
 */
export interface ScimIntegrationState {
    /**
     * Specifies a comment for the integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.ScimIntegrationDescribeOutput>[]>;
    /**
     * Specify whether the security integration is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * String that specifies the identifier (i.e. name) for the integration; must be unique in your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies an existing network policy that controls SCIM network traffic.
     */
    networkPolicy?: pulumi.Input<string>;
    /**
     * Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM. Provider assumes that the specified role is already provided. Valid options are: `OKTA_PROVISIONER` | `AAD_PROVISIONER` | `GENERIC_SCIM_PROVISIONER`.
     */
    runAsRole?: pulumi.Input<string>;
    /**
     * Specifies the client type for the scim integration. Valid options are: `OKTA` | `AZURE` | `GENERIC`.
     */
    scimClient?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.ScimIntegrationShowOutput>[]>;
    /**
     * Specifies whether to enable or disable the synchronization of a user password from an Okta SCIM client as part of the API request to Snowflake. This property is not supported for Azure SCIM. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    syncPassword?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ScimIntegration resource.
 */
export interface ScimIntegrationArgs {
    /**
     * Specifies a comment for the integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specify whether the security integration is enabled.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * String that specifies the identifier (i.e. name) for the integration; must be unique in your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies an existing network policy that controls SCIM network traffic.
     */
    networkPolicy?: pulumi.Input<string>;
    /**
     * Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM. Provider assumes that the specified role is already provided. Valid options are: `OKTA_PROVISIONER` | `AAD_PROVISIONER` | `GENERIC_SCIM_PROVISIONER`.
     */
    runAsRole: pulumi.Input<string>;
    /**
     * Specifies the client type for the scim integration. Valid options are: `OKTA` | `AZURE` | `GENERIC`.
     */
    scimClient: pulumi.Input<string>;
    /**
     * Specifies whether to enable or disable the synchronization of a user password from an Okta SCIM client as part of the API request to Snowflake. This property is not supported for Azure SCIM. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    syncPassword?: pulumi.Input<string>;
}
