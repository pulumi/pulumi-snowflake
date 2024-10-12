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
 * $ pulumi import snowflake:index/streamOnTable:StreamOnTable example '"<database_name>"."<schema_name>"."<stream_name>"'
 * ```
 */
export class StreamOnTable extends pulumi.CustomResource {
    /**
     * Get an existing StreamOnTable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamOnTableState, opts?: pulumi.CustomResourceOptions): StreamOnTable {
        return new StreamOnTable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/streamOnTable:StreamOnTable';

    /**
     * Returns true if the given object is an instance of StreamOnTable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamOnTable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamOnTable.__pulumiType;
    }

    /**
     * Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly appendOnly!: pulumi.Output<string | undefined>;
    public readonly at!: pulumi.Output<outputs.StreamOnTableAt | undefined>;
    public readonly before!: pulumi.Output<outputs.StreamOnTableBefore | undefined>;
    /**
     * Specifies a comment for the stream.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     */
    public readonly copyGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.StreamOnTableDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly schema!: pulumi.Output<string>;
    public readonly showInitialRows!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.StreamOnTableShowOutput[]>;
    /**
     * Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly table!: pulumi.Output<string>;

    /**
     * Create a StreamOnTable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamOnTableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamOnTableArgs | StreamOnTableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamOnTableState | undefined;
            resourceInputs["appendOnly"] = state ? state.appendOnly : undefined;
            resourceInputs["at"] = state ? state.at : undefined;
            resourceInputs["before"] = state ? state.before : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["copyGrants"] = state ? state.copyGrants : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["showInitialRows"] = state ? state.showInitialRows : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["table"] = state ? state.table : undefined;
        } else {
            const args = argsOrState as StreamOnTableArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.table === undefined) && !opts.urn) {
                throw new Error("Missing required property 'table'");
            }
            resourceInputs["appendOnly"] = args ? args.appendOnly : undefined;
            resourceInputs["at"] = args ? args.at : undefined;
            resourceInputs["before"] = args ? args.before : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["copyGrants"] = args ? args.copyGrants : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["showInitialRows"] = args ? args.showInitialRows : undefined;
            resourceInputs["table"] = args ? args.table : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StreamOnTable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamOnTable resources.
 */
export interface StreamOnTableState {
    /**
     * Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    appendOnly?: pulumi.Input<string>;
    at?: pulumi.Input<inputs.StreamOnTableAt>;
    before?: pulumi.Input<inputs.StreamOnTableBefore>;
    /**
     * Specifies a comment for the stream.
     */
    comment?: pulumi.Input<string>;
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.StreamOnTableDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    schema?: pulumi.Input<string>;
    showInitialRows?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.StreamOnTableShowOutput>[]>;
    /**
     * Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    table?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamOnTable resource.
 */
export interface StreamOnTableArgs {
    /**
     * Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    appendOnly?: pulumi.Input<string>;
    at?: pulumi.Input<inputs.StreamOnTableAt>;
    before?: pulumi.Input<inputs.StreamOnTableBefore>;
    /**
     * Specifies a comment for the stream.
     */
    comment?: pulumi.Input<string>;
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    schema: pulumi.Input<string>;
    showInitialRows?: pulumi.Input<string>;
    /**
     * Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    table: pulumi.Input<string>;
}
