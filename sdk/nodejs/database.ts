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
 * const simple = new snowflake.Database("simple", {
 *     comment: "test comment",
 *     dataRetentionTimeInDays: 3,
 * });
 * const withReplication = new snowflake.Database("withReplication", {
 *     comment: "test comment 2",
 *     replicationConfiguration: {
 *         accounts: [
 *             "test_account1",
 *             "test_account_2",
 *         ],
 *         ignoreEditionCheck: true,
 *     },
 * });
 * const fromReplica = new snowflake.Database("fromReplica", {
 *     comment: "test comment",
 *     dataRetentionTimeInDays: 3,
 *     fromReplica: "org1\".\"account1\".\"primary_db_name",
 * });
 * const fromShare = new snowflake.Database("fromShare", {
 *     comment: "test comment",
 *     fromShare: {
 *         provider: "org1.account1",
 *         share: "share1",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/database:Database example name
 * ```
 */
export class Database extends pulumi.CustomResource {
    /**
     * Get an existing Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseState, opts?: pulumi.CustomResourceOptions): Database {
        return new Database(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/database:Database';

    /**
     * Returns true if the given object is an instance of Database.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Database {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Database.__pulumiType;
    }

    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database, schema, or table. For more information, see Understanding & Using Time Travel.
     */
    public readonly dataRetentionTimeInDays!: pulumi.Output<number | undefined>;
    /**
     * Specify a database to create a clone from.
     */
    public readonly fromDatabase!: pulumi.Output<string | undefined>;
    /**
     * Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
     */
    public readonly fromReplica!: pulumi.Output<string | undefined>;
    /**
     * Specify a provider and a share in this map to create a database from a share.
     */
    public readonly fromShare!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    public readonly isTransient!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * When set, specifies the configurations for database replication.
     */
    public readonly replicationConfiguration!: pulumi.Output<outputs.DatabaseReplicationConfiguration | undefined>;

    /**
     * Create a Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseArgs | DatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = state ? state.dataRetentionTimeInDays : undefined;
            resourceInputs["fromDatabase"] = state ? state.fromDatabase : undefined;
            resourceInputs["fromReplica"] = state ? state.fromReplica : undefined;
            resourceInputs["fromShare"] = state ? state.fromShare : undefined;
            resourceInputs["isTransient"] = state ? state.isTransient : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["replicationConfiguration"] = state ? state.replicationConfiguration : undefined;
        } else {
            const args = argsOrState as DatabaseArgs | undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = args ? args.dataRetentionTimeInDays : undefined;
            resourceInputs["fromDatabase"] = args ? args.fromDatabase : undefined;
            resourceInputs["fromReplica"] = args ? args.fromReplica : undefined;
            resourceInputs["fromShare"] = args ? args.fromShare : undefined;
            resourceInputs["isTransient"] = args ? args.isTransient : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["replicationConfiguration"] = args ? args.replicationConfiguration : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Database.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Database resources.
 */
export interface DatabaseState {
    comment?: pulumi.Input<string>;
    /**
     * Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database, schema, or table. For more information, see Understanding & Using Time Travel.
     */
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * Specify a database to create a clone from.
     */
    fromDatabase?: pulumi.Input<string>;
    /**
     * Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
     */
    fromReplica?: pulumi.Input<string>;
    /**
     * Specify a provider and a share in this map to create a database from a share.
     */
    fromShare?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    isTransient?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    /**
     * When set, specifies the configurations for database replication.
     */
    replicationConfiguration?: pulumi.Input<inputs.DatabaseReplicationConfiguration>;
}

/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    comment?: pulumi.Input<string>;
    /**
     * Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database, schema, or table. For more information, see Understanding & Using Time Travel.
     */
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * Specify a database to create a clone from.
     */
    fromDatabase?: pulumi.Input<string>;
    /**
     * Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
     */
    fromReplica?: pulumi.Input<string>;
    /**
     * Specify a provider and a share in this map to create a database from a share.
     */
    fromShare?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    isTransient?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    /**
     * When set, specifies the configurations for database replication.
     */
    replicationConfiguration?: pulumi.Input<inputs.DatabaseReplicationConfiguration>;
}
