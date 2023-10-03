// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const db = new snowflake.Database("db", {});
 * const sourceFailoverGroup = new snowflake.FailoverGroup("sourceFailoverGroup", {
 *     objectTypes: [
 *         "WAREHOUSES",
 *         "DATABASES",
 *         "INTEGRATIONS",
 *         "ROLES",
 *     ],
 *     allowedAccounts: [
 *         "<org_name>.<target_account_name1>",
 *         "<org_name>.<target_account_name2>",
 *     ],
 *     allowedDatabases: [db.name],
 *     allowedIntegrationTypes: ["SECURITY INTEGRATIONS"],
 *     replicationSchedule: {
 *         cron: {
 *             expression: "0 0 10-20 * TUE,THU",
 *             timeZone: "UTC",
 *         },
 *     },
 * });
 * const account2 = new snowflake.Provider("account2", {});
 * const targetFailoverGroup = new snowflake.FailoverGroup("targetFailoverGroup", {fromReplica: {
 *     organizationName: "...",
 *     sourceAccountName: "...",
 *     name: snowflake_failover_group.fg.name,
 * }}, {
 *     provider: snowflake.account2,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/failoverGroup:FailoverGroup example 'fg1'
 * ```
 */
export class FailoverGroup extends pulumi.CustomResource {
    /**
     * Get an existing FailoverGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FailoverGroupState, opts?: pulumi.CustomResourceOptions): FailoverGroup {
        return new FailoverGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/failoverGroup:FailoverGroup';

    /**
     * Returns true if the given object is an instance of FailoverGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FailoverGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FailoverGroup.__pulumiType;
    }

    /**
     * Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
     */
    public readonly allowedAccounts!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
     */
    public readonly allowedDatabases!: pulumi.Output<string[] | undefined>;
    /**
     * Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
     */
    public readonly allowedIntegrationTypes!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
     */
    public readonly allowedShares!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the name of the replica to use as the source for the failover group.
     */
    public readonly fromReplica!: pulumi.Output<outputs.FailoverGroupFromReplica | undefined>;
    /**
     * Allows replicating objects to accounts on lower editions.
     */
    public readonly ignoreEditionCheck!: pulumi.Output<boolean | undefined>;
    /**
     * Identifier for the primary failover group in the source account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
     */
    public readonly objectTypes!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the schedule for refreshing secondary failover groups.
     */
    public readonly replicationSchedule!: pulumi.Output<outputs.FailoverGroupReplicationSchedule | undefined>;

    /**
     * Create a FailoverGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FailoverGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FailoverGroupArgs | FailoverGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FailoverGroupState | undefined;
            resourceInputs["allowedAccounts"] = state ? state.allowedAccounts : undefined;
            resourceInputs["allowedDatabases"] = state ? state.allowedDatabases : undefined;
            resourceInputs["allowedIntegrationTypes"] = state ? state.allowedIntegrationTypes : undefined;
            resourceInputs["allowedShares"] = state ? state.allowedShares : undefined;
            resourceInputs["fromReplica"] = state ? state.fromReplica : undefined;
            resourceInputs["ignoreEditionCheck"] = state ? state.ignoreEditionCheck : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["objectTypes"] = state ? state.objectTypes : undefined;
            resourceInputs["replicationSchedule"] = state ? state.replicationSchedule : undefined;
        } else {
            const args = argsOrState as FailoverGroupArgs | undefined;
            resourceInputs["allowedAccounts"] = args ? args.allowedAccounts : undefined;
            resourceInputs["allowedDatabases"] = args ? args.allowedDatabases : undefined;
            resourceInputs["allowedIntegrationTypes"] = args ? args.allowedIntegrationTypes : undefined;
            resourceInputs["allowedShares"] = args ? args.allowedShares : undefined;
            resourceInputs["fromReplica"] = args ? args.fromReplica : undefined;
            resourceInputs["ignoreEditionCheck"] = args ? args.ignoreEditionCheck : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["objectTypes"] = args ? args.objectTypes : undefined;
            resourceInputs["replicationSchedule"] = args ? args.replicationSchedule : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FailoverGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FailoverGroup resources.
 */
export interface FailoverGroupState {
    /**
     * Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
     */
    allowedAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
     */
    allowedDatabases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
     */
    allowedIntegrationTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
     */
    allowedShares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the replica to use as the source for the failover group.
     */
    fromReplica?: pulumi.Input<inputs.FailoverGroupFromReplica>;
    /**
     * Allows replicating objects to accounts on lower editions.
     */
    ignoreEditionCheck?: pulumi.Input<boolean>;
    /**
     * Identifier for the primary failover group in the source account.
     */
    name?: pulumi.Input<string>;
    /**
     * Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
     */
    objectTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the schedule for refreshing secondary failover groups.
     */
    replicationSchedule?: pulumi.Input<inputs.FailoverGroupReplicationSchedule>;
}

/**
 * The set of arguments for constructing a FailoverGroup resource.
 */
export interface FailoverGroupArgs {
    /**
     * Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
     */
    allowedAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
     */
    allowedDatabases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
     */
    allowedIntegrationTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
     */
    allowedShares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the replica to use as the source for the failover group.
     */
    fromReplica?: pulumi.Input<inputs.FailoverGroupFromReplica>;
    /**
     * Allows replicating objects to accounts on lower editions.
     */
    ignoreEditionCheck?: pulumi.Input<boolean>;
    /**
     * Identifier for the primary failover group in the source account.
     */
    name?: pulumi.Input<string>;
    /**
     * Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
     */
    objectTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the schedule for refreshing secondary failover groups.
     */
    replicationSchedule?: pulumi.Input<inputs.FailoverGroupReplicationSchedule>;
}
