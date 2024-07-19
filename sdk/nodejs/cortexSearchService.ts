// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/cortexSearchService:CortexSearchService example 'dbName|schemaName|fileFormatName'
 * ```
 */
export class CortexSearchService extends pulumi.CustomResource {
    /**
     * Get an existing CortexSearchService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CortexSearchServiceState, opts?: pulumi.CustomResourceOptions): CortexSearchService {
        return new CortexSearchService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/cortexSearchService:CortexSearchService';

    /**
     * Returns true if the given object is an instance of CortexSearchService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CortexSearchService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CortexSearchService.__pulumiType;
    }

    /**
     * Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
     */
    public readonly attributes!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the Cortex search service.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Creation date for the given Cortex search service.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * The database in which to create the Cortex search service.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the column to use as the search column for the Cortex search service; must be a text value.
     */
    public readonly on!: pulumi.Output<string>;
    /**
     * Specifies the query to use to populate the Cortex search service.
     */
    public readonly query!: pulumi.Output<string>;
    /**
     * The schema in which to create the Cortex search service.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies the maximum target lag time for the Cortex search service.
     */
    public readonly targetLag!: pulumi.Output<string>;
    /**
     * The warehouse in which to create the Cortex search service.
     */
    public readonly warehouse!: pulumi.Output<string>;

    /**
     * Create a CortexSearchService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CortexSearchServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CortexSearchServiceArgs | CortexSearchServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CortexSearchServiceState | undefined;
            resourceInputs["attributes"] = state ? state.attributes : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["on"] = state ? state.on : undefined;
            resourceInputs["query"] = state ? state.query : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["targetLag"] = state ? state.targetLag : undefined;
            resourceInputs["warehouse"] = state ? state.warehouse : undefined;
        } else {
            const args = argsOrState as CortexSearchServiceArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.on === undefined) && !opts.urn) {
                throw new Error("Missing required property 'on'");
            }
            if ((!args || args.query === undefined) && !opts.urn) {
                throw new Error("Missing required property 'query'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.targetLag === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetLag'");
            }
            if ((!args || args.warehouse === undefined) && !opts.urn) {
                throw new Error("Missing required property 'warehouse'");
            }
            resourceInputs["attributes"] = args ? args.attributes : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["on"] = args ? args.on : undefined;
            resourceInputs["query"] = args ? args.query : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["targetLag"] = args ? args.targetLag : undefined;
            resourceInputs["warehouse"] = args ? args.warehouse : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CortexSearchService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CortexSearchService resources.
 */
export interface CortexSearchServiceState {
    /**
     * Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
     */
    attributes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the Cortex search service.
     */
    comment?: pulumi.Input<string>;
    /**
     * Creation date for the given Cortex search service.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * The database in which to create the Cortex search service.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the column to use as the search column for the Cortex search service; must be a text value.
     */
    on?: pulumi.Input<string>;
    /**
     * Specifies the query to use to populate the Cortex search service.
     */
    query?: pulumi.Input<string>;
    /**
     * The schema in which to create the Cortex search service.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies the maximum target lag time for the Cortex search service.
     */
    targetLag?: pulumi.Input<string>;
    /**
     * The warehouse in which to create the Cortex search service.
     */
    warehouse?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CortexSearchService resource.
 */
export interface CortexSearchServiceArgs {
    /**
     * Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
     */
    attributes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the Cortex search service.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the Cortex search service.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the column to use as the search column for the Cortex search service; must be a text value.
     */
    on: pulumi.Input<string>;
    /**
     * Specifies the query to use to populate the Cortex search service.
     */
    query: pulumi.Input<string>;
    /**
     * The schema in which to create the Cortex search service.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies the maximum target lag time for the Cortex search service.
     */
    targetLag: pulumi.Input<string>;
    /**
     * The warehouse in which to create the Cortex search service.
     */
    warehouse: pulumi.Input<string>;
}