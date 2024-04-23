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
 * const schema = new snowflake.Schema("schema", {
 *     database: "database",
 *     name: "schema",
 *     dataRetentionDays: 1,
 * });
 * const sequence = new snowflake.Sequence("sequence", {
 *     database: schema.database,
 *     schema: schema.name,
 *     name: "sequence",
 * });
 * const table = new snowflake.Table("table", {
 *     database: schema.database,
 *     schema: schema.name,
 *     name: "table",
 *     comment: "A table.",
 *     clusterBies: ["to_date(DATE)"],
 *     dataRetentionTimeInDays: schema.dataRetentionTimeInDays,
 *     changeTracking: false,
 *     columns: [
 *         {
 *             name: "id",
 *             type: "int",
 *             nullable: true,
 *             "default": {
 *                 sequence: sequence.fullyQualifiedName,
 *             },
 *         },
 *         {
 *             name: "identity",
 *             type: "NUMBER(38,0)",
 *             nullable: true,
 *             identity: {
 *                 startNum: 1,
 *                 stepNum: 3,
 *             },
 *         },
 *         {
 *             name: "data",
 *             type: "text",
 *             nullable: false,
 *             collate: "en-ci",
 *         },
 *         {
 *             name: "DATE",
 *             type: "TIMESTAMP_NTZ(9)",
 *         },
 *         {
 *             name: "extra",
 *             type: "VARIANT",
 *             comment: "extra data",
 *         },
 *     ],
 *     primaryKey: {
 *         name: "my_key",
 *         keys: ["data"],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | table name
 *
 * ```sh
 * $ pulumi import snowflake:index/table:Table example 'databaseName|schemaName|tableName'
 * ```
 */
export class Table extends pulumi.CustomResource {
    /**
     * Get an existing Table resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableState, opts?: pulumi.CustomResourceOptions): Table {
        return new Table(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/table:Table';

    /**
     * Returns true if the given object is an instance of Table.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Table {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Table.__pulumiType;
    }

    /**
     * Specifies whether to enable change tracking on the table. Default false.
     */
    public readonly changeTracking!: pulumi.Output<boolean | undefined>;
    /**
     * A list of one or more table columns/expressions to be used as clustering key(s) for the table
     */
    public readonly clusterBies!: pulumi.Output<string[] | undefined>;
    /**
     * Definitions of a column to create in the table. Minimum one required.
     */
    public readonly columns!: pulumi.Output<outputs.TableColumn[]>;
    /**
     * Specifies a comment for the table.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     */
    public readonly dataRetentionTimeInDays!: pulumi.Output<number | undefined>;
    /**
     * The database in which to create the table.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of the role that owns the table.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * Definitions of primary key constraint to create on table
     *
     * @deprecated Use snowflake.TableConstraint instead
     */
    public readonly primaryKey!: pulumi.Output<outputs.TablePrimaryKey | undefined>;
    /**
     * Qualified name of the table.
     */
    public /*out*/ readonly qualifiedName!: pulumi.Output<string>;
    /**
     * The schema in which to create the table.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    public readonly tags!: pulumi.Output<outputs.TableTag[] | undefined>;

    /**
     * Create a Table resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TableArgs | TableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TableState | undefined;
            resourceInputs["changeTracking"] = state ? state.changeTracking : undefined;
            resourceInputs["clusterBies"] = state ? state.clusterBies : undefined;
            resourceInputs["columns"] = state ? state.columns : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = state ? state.dataRetentionTimeInDays : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["primaryKey"] = state ? state.primaryKey : undefined;
            resourceInputs["qualifiedName"] = state ? state.qualifiedName : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as TableArgs | undefined;
            if ((!args || args.columns === undefined) && !opts.urn) {
                throw new Error("Missing required property 'columns'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["changeTracking"] = args ? args.changeTracking : undefined;
            resourceInputs["clusterBies"] = args ? args.clusterBies : undefined;
            resourceInputs["columns"] = args ? args.columns : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = args ? args.dataRetentionTimeInDays : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["primaryKey"] = args ? args.primaryKey : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["owner"] = undefined /*out*/;
            resourceInputs["qualifiedName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Table.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Table resources.
 */
export interface TableState {
    /**
     * Specifies whether to enable change tracking on the table. Default false.
     */
    changeTracking?: pulumi.Input<boolean>;
    /**
     * A list of one or more table columns/expressions to be used as clustering key(s) for the table
     */
    clusterBies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Definitions of a column to create in the table. Minimum one required.
     */
    columns?: pulumi.Input<pulumi.Input<inputs.TableColumn>[]>;
    /**
     * Specifies a comment for the table.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     */
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * The database in which to create the table.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the role that owns the table.
     */
    owner?: pulumi.Input<string>;
    /**
     * Definitions of primary key constraint to create on table
     *
     * @deprecated Use snowflake.TableConstraint instead
     */
    primaryKey?: pulumi.Input<inputs.TablePrimaryKey>;
    /**
     * Qualified name of the table.
     */
    qualifiedName?: pulumi.Input<string>;
    /**
     * The schema in which to create the table.
     */
    schema?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.TableTag>[]>;
}

/**
 * The set of arguments for constructing a Table resource.
 */
export interface TableArgs {
    /**
     * Specifies whether to enable change tracking on the table. Default false.
     */
    changeTracking?: pulumi.Input<boolean>;
    /**
     * A list of one or more table columns/expressions to be used as clustering key(s) for the table
     */
    clusterBies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Definitions of a column to create in the table. Minimum one required.
     */
    columns: pulumi.Input<pulumi.Input<inputs.TableColumn>[]>;
    /**
     * Specifies a comment for the table.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     */
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * The database in which to create the table.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Definitions of primary key constraint to create on table
     *
     * @deprecated Use snowflake.TableConstraint instead
     */
    primaryKey?: pulumi.Input<inputs.TablePrimaryKey>;
    /**
     * The schema in which to create the table.
     */
    schema: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.TableTag>[]>;
}
