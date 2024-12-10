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
 * $ pulumi import snowflake:index/streamOnDirectoryTable:StreamOnDirectoryTable example '"<database_name>"."<schema_name>"."<stream_name>"'
 * ```
 */
export class StreamOnDirectoryTable extends pulumi.CustomResource {
    /**
     * Get an existing StreamOnDirectoryTable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamOnDirectoryTableState, opts?: pulumi.CustomResourceOptions): StreamOnDirectoryTable {
        return new StreamOnDirectoryTable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/streamOnDirectoryTable:StreamOnDirectoryTable';

    /**
     * Returns true if the given object is an instance of StreamOnDirectoryTable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamOnDirectoryTable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamOnDirectoryTable.__pulumiType;
    }

    /**
     * Specifies a comment for the stream.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     */
    public readonly copyGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.StreamOnDirectoryTableDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.StreamOnDirectoryTableShowOutput[]>;
    /**
     * Specifies an identifier for the stage the stream will monitor. Due to Snowflake limitations, the provider can not read the stage's database and schema. For stages, Snowflake returns only partially qualified name instead of fully qualified name. Please use stages located in the same schema as the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly stage!: pulumi.Output<string>;
    public /*out*/ readonly stale!: pulumi.Output<boolean>;
    /**
     * Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
     */
    public /*out*/ readonly streamType!: pulumi.Output<string>;

    /**
     * Create a StreamOnDirectoryTable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamOnDirectoryTableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamOnDirectoryTableArgs | StreamOnDirectoryTableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamOnDirectoryTableState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["copyGrants"] = state ? state.copyGrants : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["stage"] = state ? state.stage : undefined;
            resourceInputs["stale"] = state ? state.stale : undefined;
            resourceInputs["streamType"] = state ? state.streamType : undefined;
        } else {
            const args = argsOrState as StreamOnDirectoryTableArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.stage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stage'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["copyGrants"] = args ? args.copyGrants : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["stage"] = args ? args.stage : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
            resourceInputs["stale"] = undefined /*out*/;
            resourceInputs["streamType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StreamOnDirectoryTable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamOnDirectoryTable resources.
 */
export interface StreamOnDirectoryTableState {
    /**
     * Specifies a comment for the stream.
     */
    comment?: pulumi.Input<string>;
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.StreamOnDirectoryTableDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    schema?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.StreamOnDirectoryTableShowOutput>[]>;
    /**
     * Specifies an identifier for the stage the stream will monitor. Due to Snowflake limitations, the provider can not read the stage's database and schema. For stages, Snowflake returns only partially qualified name instead of fully qualified name. Please use stages located in the same schema as the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    stage?: pulumi.Input<string>;
    stale?: pulumi.Input<boolean>;
    /**
     * Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
     */
    streamType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamOnDirectoryTable resource.
 */
export interface StreamOnDirectoryTableArgs {
    /**
     * Specifies a comment for the stream.
     */
    comment?: pulumi.Input<string>;
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies an identifier for the stage the stream will monitor. Due to Snowflake limitations, the provider can not read the stage's database and schema. For stages, Snowflake returns only partially qualified name instead of fully qualified name. Please use stages located in the same schema as the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    stage: pulumi.Input<string>;
}