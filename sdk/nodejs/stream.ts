// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const stream = new snowflake.Stream("stream", {
 *     appendOnly: false,
 *     comment: "A stream.",
 *     database: "db",
 *     insertOnly: false,
 *     onTable: "table",
 *     owner: "role1",
 *     schema: "schema",
 * });
 * ```
 *
 * ## Import
 *
 * # format is database name | schema name | on table name
 *
 * ```sh
 *  $ pulumi import snowflake:index/stream:Stream example 'dbName|schemaName|tableName'
 * ```
 */
export class Stream extends pulumi.CustomResource {
    /**
     * Get an existing Stream resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamState, opts?: pulumi.CustomResourceOptions): Stream {
        return new Stream(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/stream:Stream';

    /**
     * Returns true if the given object is an instance of Stream.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Stream {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Stream.__pulumiType;
    }

    /**
     * Type of the stream that will be created.
     */
    public readonly appendOnly!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies a comment for the stream.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the stream.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Create an insert only stream type.
     */
    public readonly insertOnly!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of the table the stream will monitor.
     */
    public readonly onTable!: pulumi.Output<string | undefined>;
    /**
     * Name of the role that owns the stream.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * The schema in which to create the stream.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     */
    public readonly showInitialRows!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Stream resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamArgs | StreamState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamState | undefined;
            inputs["appendOnly"] = state ? state.appendOnly : undefined;
            inputs["comment"] = state ? state.comment : undefined;
            inputs["database"] = state ? state.database : undefined;
            inputs["insertOnly"] = state ? state.insertOnly : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["onTable"] = state ? state.onTable : undefined;
            inputs["owner"] = state ? state.owner : undefined;
            inputs["schema"] = state ? state.schema : undefined;
            inputs["showInitialRows"] = state ? state.showInitialRows : undefined;
        } else {
            const args = argsOrState as StreamArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            inputs["appendOnly"] = args ? args.appendOnly : undefined;
            inputs["comment"] = args ? args.comment : undefined;
            inputs["database"] = args ? args.database : undefined;
            inputs["insertOnly"] = args ? args.insertOnly : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["onTable"] = args ? args.onTable : undefined;
            inputs["schema"] = args ? args.schema : undefined;
            inputs["showInitialRows"] = args ? args.showInitialRows : undefined;
            inputs["owner"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Stream.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Stream resources.
 */
export interface StreamState {
    /**
     * Type of the stream that will be created.
     */
    appendOnly?: pulumi.Input<boolean>;
    /**
     * Specifies a comment for the stream.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the stream.
     */
    database?: pulumi.Input<string>;
    /**
     * Create an insert only stream type.
     */
    insertOnly?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the table the stream will monitor.
     */
    onTable?: pulumi.Input<string>;
    /**
     * Name of the role that owns the stream.
     */
    owner?: pulumi.Input<string>;
    /**
     * The schema in which to create the stream.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     */
    showInitialRows?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Stream resource.
 */
export interface StreamArgs {
    /**
     * Type of the stream that will be created.
     */
    appendOnly?: pulumi.Input<boolean>;
    /**
     * Specifies a comment for the stream.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the stream.
     */
    database: pulumi.Input<string>;
    /**
     * Create an insert only stream type.
     */
    insertOnly?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the table the stream will monitor.
     */
    onTable?: pulumi.Input<string>;
    /**
     * The schema in which to create the stream.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     */
    showInitialRows?: pulumi.Input<boolean>;
}
