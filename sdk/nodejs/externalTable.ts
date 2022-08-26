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
 * const externalTable = new snowflake.ExternalTable("external_table", {
 *     columns: [
 *         {
 *             name: "id",
 *             type: "int",
 *         },
 *         {
 *             name: "data",
 *             type: "text",
 *         },
 *     ],
 *     comment: "External table",
 *     database: "db",
 *     schema: "schema",
 * });
 * ```
 *
 * ## Import
 *
 * # format is database name | schema name | external table name
 *
 * ```sh
 *  $ pulumi import snowflake:index/externalTable:ExternalTable example 'dbName|schemaName|externalTableName'
 * ```
 */
export class ExternalTable extends pulumi.CustomResource {
    /**
     * Get an existing ExternalTable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExternalTableState, opts?: pulumi.CustomResourceOptions): ExternalTable {
        return new ExternalTable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/externalTable:ExternalTable';

    /**
     * Returns true if the given object is an instance of ExternalTable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExternalTable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExternalTable.__pulumiType;
    }

    /**
     * Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     */
    public readonly autoRefresh!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the aws sns topic for the external table.
     */
    public readonly awsSnsTopic!: pulumi.Output<string | undefined>;
    /**
     * Definitions of a column to create in the external table. Minimum one required.
     */
    public readonly columns!: pulumi.Output<outputs.ExternalTableColumn[]>;
    /**
     * Specifies a comment for the external table.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     */
    public readonly copyGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The database in which to create the external table.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the file format for the external table.
     */
    public readonly fileFormat!: pulumi.Output<string>;
    /**
     * Specifies a location for the external table.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of the role that owns the external table.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * Specifies any partition columns to evaluate for the external table.
     */
    public readonly partitionBies!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the file names and/or paths on the external stage to match.
     */
    public readonly pattern!: pulumi.Output<string | undefined>;
    /**
     * Specifies weather to refresh when an external table is created.
     */
    public readonly refreshOnCreate!: pulumi.Output<boolean | undefined>;
    /**
     * The schema in which to create the external table.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    public readonly tags!: pulumi.Output<outputs.ExternalTableTag[] | undefined>;

    /**
     * Create a ExternalTable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExternalTableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExternalTableArgs | ExternalTableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExternalTableState | undefined;
            resourceInputs["autoRefresh"] = state ? state.autoRefresh : undefined;
            resourceInputs["awsSnsTopic"] = state ? state.awsSnsTopic : undefined;
            resourceInputs["columns"] = state ? state.columns : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["copyGrants"] = state ? state.copyGrants : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["fileFormat"] = state ? state.fileFormat : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["partitionBies"] = state ? state.partitionBies : undefined;
            resourceInputs["pattern"] = state ? state.pattern : undefined;
            resourceInputs["refreshOnCreate"] = state ? state.refreshOnCreate : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ExternalTableArgs | undefined;
            if ((!args || args.columns === undefined) && !opts.urn) {
                throw new Error("Missing required property 'columns'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.fileFormat === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileFormat'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["autoRefresh"] = args ? args.autoRefresh : undefined;
            resourceInputs["awsSnsTopic"] = args ? args.awsSnsTopic : undefined;
            resourceInputs["columns"] = args ? args.columns : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["copyGrants"] = args ? args.copyGrants : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["fileFormat"] = args ? args.fileFormat : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partitionBies"] = args ? args.partitionBies : undefined;
            resourceInputs["pattern"] = args ? args.pattern : undefined;
            resourceInputs["refreshOnCreate"] = args ? args.refreshOnCreate : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["owner"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ExternalTable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExternalTable resources.
 */
export interface ExternalTableState {
    /**
     * Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     */
    autoRefresh?: pulumi.Input<boolean>;
    /**
     * Specifies the aws sns topic for the external table.
     */
    awsSnsTopic?: pulumi.Input<string>;
    /**
     * Definitions of a column to create in the external table. Minimum one required.
     */
    columns?: pulumi.Input<pulumi.Input<inputs.ExternalTableColumn>[]>;
    /**
     * Specifies a comment for the external table.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The database in which to create the external table.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the file format for the external table.
     */
    fileFormat?: pulumi.Input<string>;
    /**
     * Specifies a location for the external table.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the role that owns the external table.
     */
    owner?: pulumi.Input<string>;
    /**
     * Specifies any partition columns to evaluate for the external table.
     */
    partitionBies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the file names and/or paths on the external stage to match.
     */
    pattern?: pulumi.Input<string>;
    /**
     * Specifies weather to refresh when an external table is created.
     */
    refreshOnCreate?: pulumi.Input<boolean>;
    /**
     * The schema in which to create the external table.
     */
    schema?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ExternalTableTag>[]>;
}

/**
 * The set of arguments for constructing a ExternalTable resource.
 */
export interface ExternalTableArgs {
    /**
     * Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     */
    autoRefresh?: pulumi.Input<boolean>;
    /**
     * Specifies the aws sns topic for the external table.
     */
    awsSnsTopic?: pulumi.Input<string>;
    /**
     * Definitions of a column to create in the external table. Minimum one required.
     */
    columns: pulumi.Input<pulumi.Input<inputs.ExternalTableColumn>[]>;
    /**
     * Specifies a comment for the external table.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The database in which to create the external table.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the file format for the external table.
     */
    fileFormat: pulumi.Input<string>;
    /**
     * Specifies a location for the external table.
     */
    location: pulumi.Input<string>;
    /**
     * Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies any partition columns to evaluate for the external table.
     */
    partitionBies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the file names and/or paths on the external stage to match.
     */
    pattern?: pulumi.Input<string>;
    /**
     * Specifies weather to refresh when an external table is created.
     */
    refreshOnCreate?: pulumi.Input<boolean>;
    /**
     * The schema in which to create the external table.
     */
    schema: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ExternalTableTag>[]>;
}
