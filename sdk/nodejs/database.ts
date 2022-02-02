// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const test = new snowflake.Database("test", {
 *     comment: "test comment",
 *     dataRetentionTimeInDays: 3,
 * });
 * const test2 = new snowflake.Database("test2", {
 *     comment: "test comment 2",
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
    public readonly dataRetentionTimeInDays!: pulumi.Output<number>;
    /**
     * Specify a database to create a clone from.
     */
    public readonly fromDatabase!: pulumi.Output<string | undefined>;
    /**
     * Specify a provider and a share in this map to create a database from a share.
     */
    public readonly fromShare!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * Definitions of a tag to associate with the resource.
     */
    public readonly tags!: pulumi.Output<outputs.DatabaseTag[] | undefined>;

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
            resourceInputs["fromShare"] = state ? state.fromShare : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DatabaseArgs | undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = args ? args.dataRetentionTimeInDays : undefined;
            resourceInputs["fromDatabase"] = args ? args.fromDatabase : undefined;
            resourceInputs["fromShare"] = args ? args.fromShare : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
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
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * Specify a database to create a clone from.
     */
    fromDatabase?: pulumi.Input<string>;
    /**
     * Specify a provider and a share in this map to create a database from a share.
     */
    fromShare?: pulumi.Input<{[key: string]: any}>;
    name?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.DatabaseTag>[]>;
}

/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    comment?: pulumi.Input<string>;
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * Specify a database to create a clone from.
     */
    fromDatabase?: pulumi.Input<string>;
    /**
     * Specify a provider and a share in this map to create a database from a share.
     */
    fromShare?: pulumi.Input<{[key: string]: any}>;
    name?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.DatabaseTag>[]>;
}
