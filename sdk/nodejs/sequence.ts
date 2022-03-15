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
 * const database = new snowflake.Database("database", {});
 * const testSchema = new snowflake.Schema("testSchema", {database: snowflake_database.test_database.name});
 * const testSequence = new snowflake.Sequence("testSequence", {
 *     database: snowflake_database.test_database.name,
 *     schema: testSchema.name,
 * });
 * ```
 *
 * ## Import
 *
 * # format is database name | schema name | sequence name
 *
 * ```sh
 *  $ pulumi import snowflake:index/sequence:Sequence example 'dbName|schemaName|sequenceName'
 * ```
 */
export class Sequence extends pulumi.CustomResource {
    /**
     * Get an existing Sequence resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SequenceState, opts?: pulumi.CustomResourceOptions): Sequence {
        return new Sequence(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/sequence:Sequence';

    /**
     * Returns true if the given object is an instance of Sequence.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Sequence {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Sequence.__pulumiType;
    }

    /**
     * Specifies a comment for the sequence.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the sequence. Don't use the | character.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * The fully qualified name of the sequence.
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * The amount the sequence will increase by each time it is used
     */
    public readonly increment!: pulumi.Output<number | undefined>;
    /**
     * Specifies the name for the sequence.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The next value the sequence will provide.
     */
    public /*out*/ readonly nextValue!: pulumi.Output<number>;
    /**
     * The schema in which to create the sequence. Don't use the | character.
     */
    public readonly schema!: pulumi.Output<string>;

    /**
     * Create a Sequence resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SequenceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SequenceArgs | SequenceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SequenceState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["increment"] = state ? state.increment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nextValue"] = state ? state.nextValue : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
        } else {
            const args = argsOrState as SequenceArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["increment"] = args ? args.increment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["nextValue"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Sequence.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Sequence resources.
 */
export interface SequenceState {
    /**
     * Specifies a comment for the sequence.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the sequence. Don't use the | character.
     */
    database?: pulumi.Input<string>;
    /**
     * The fully qualified name of the sequence.
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * The amount the sequence will increase by each time it is used
     */
    increment?: pulumi.Input<number>;
    /**
     * Specifies the name for the sequence.
     */
    name?: pulumi.Input<string>;
    /**
     * The next value the sequence will provide.
     */
    nextValue?: pulumi.Input<number>;
    /**
     * The schema in which to create the sequence. Don't use the | character.
     */
    schema?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Sequence resource.
 */
export interface SequenceArgs {
    /**
     * Specifies a comment for the sequence.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the sequence. Don't use the | character.
     */
    database: pulumi.Input<string>;
    /**
     * The amount the sequence will increase by each time it is used
     */
    increment?: pulumi.Input<number>;
    /**
     * Specifies the name for the sequence.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the sequence. Don't use the | character.
     */
    schema: pulumi.Input<string>;
}
