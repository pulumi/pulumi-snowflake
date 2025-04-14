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
 * $ pulumi import snowflake:index/warehouse:Warehouse example '"<warehouse_name>"'
 * ```
 */
export class Warehouse extends pulumi.CustomResource {
    /**
     * Get an existing Warehouse resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WarehouseState, opts?: pulumi.CustomResourceOptions): Warehouse {
        return new Warehouse(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/warehouse:Warehouse';

    /**
     * Returns true if the given object is an instance of Warehouse.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Warehouse {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Warehouse.__pulumiType;
    }

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly autoResume!: pulumi.Output<string | undefined>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     */
    public readonly autoSuspend!: pulumi.Output<number | undefined>;
    /**
     * Specifies a comment for the warehouse.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly enableQueryAcceleration!: pulumi.Output<string | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     */
    public readonly initiallySuspended!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     */
    public readonly maxClusterCount!: pulumi.Output<number | undefined>;
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     */
    public readonly maxConcurrencyLevel!: pulumi.Output<number>;
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     */
    public readonly minClusterCount!: pulumi.Output<number | undefined>;
    /**
     * Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
     */
    public /*out*/ readonly parameters!: pulumi.Output<outputs.WarehouseParameter[]>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
     */
    public readonly queryAccelerationMaxScaleFactor!: pulumi.Output<number | undefined>;
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
     */
    public readonly resourceMonitor!: pulumi.Output<string | undefined>;
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
     */
    public readonly scalingPolicy!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.WarehouseShowOutput[]>;
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     */
    public readonly statementQueuedTimeoutInSeconds!: pulumi.Output<number>;
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     */
    public readonly statementTimeoutInSeconds!: pulumi.Output<number>;
    /**
     * Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
     */
    public readonly warehouseSize!: pulumi.Output<string | undefined>;
    /**
     * Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
     */
    public readonly warehouseType!: pulumi.Output<string | undefined>;

    /**
     * Create a Warehouse resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: WarehouseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WarehouseArgs | WarehouseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WarehouseState | undefined;
            resourceInputs["autoResume"] = state ? state.autoResume : undefined;
            resourceInputs["autoSuspend"] = state ? state.autoSuspend : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["enableQueryAcceleration"] = state ? state.enableQueryAcceleration : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["initiallySuspended"] = state ? state.initiallySuspended : undefined;
            resourceInputs["maxClusterCount"] = state ? state.maxClusterCount : undefined;
            resourceInputs["maxConcurrencyLevel"] = state ? state.maxConcurrencyLevel : undefined;
            resourceInputs["minClusterCount"] = state ? state.minClusterCount : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["queryAccelerationMaxScaleFactor"] = state ? state.queryAccelerationMaxScaleFactor : undefined;
            resourceInputs["resourceMonitor"] = state ? state.resourceMonitor : undefined;
            resourceInputs["scalingPolicy"] = state ? state.scalingPolicy : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["statementQueuedTimeoutInSeconds"] = state ? state.statementQueuedTimeoutInSeconds : undefined;
            resourceInputs["statementTimeoutInSeconds"] = state ? state.statementTimeoutInSeconds : undefined;
            resourceInputs["warehouseSize"] = state ? state.warehouseSize : undefined;
            resourceInputs["warehouseType"] = state ? state.warehouseType : undefined;
        } else {
            const args = argsOrState as WarehouseArgs | undefined;
            resourceInputs["autoResume"] = args ? args.autoResume : undefined;
            resourceInputs["autoSuspend"] = args ? args.autoSuspend : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enableQueryAcceleration"] = args ? args.enableQueryAcceleration : undefined;
            resourceInputs["initiallySuspended"] = args ? args.initiallySuspended : undefined;
            resourceInputs["maxClusterCount"] = args ? args.maxClusterCount : undefined;
            resourceInputs["maxConcurrencyLevel"] = args ? args.maxConcurrencyLevel : undefined;
            resourceInputs["minClusterCount"] = args ? args.minClusterCount : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["queryAccelerationMaxScaleFactor"] = args ? args.queryAccelerationMaxScaleFactor : undefined;
            resourceInputs["resourceMonitor"] = args ? args.resourceMonitor : undefined;
            resourceInputs["scalingPolicy"] = args ? args.scalingPolicy : undefined;
            resourceInputs["statementQueuedTimeoutInSeconds"] = args ? args.statementQueuedTimeoutInSeconds : undefined;
            resourceInputs["statementTimeoutInSeconds"] = args ? args.statementTimeoutInSeconds : undefined;
            resourceInputs["warehouseSize"] = args ? args.warehouseSize : undefined;
            resourceInputs["warehouseType"] = args ? args.warehouseType : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["parameters"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Warehouse.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Warehouse resources.
 */
export interface WarehouseState {
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    autoResume?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     */
    autoSuspend?: pulumi.Input<number>;
    /**
     * Specifies a comment for the warehouse.
     */
    comment?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    enableQueryAcceleration?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     */
    initiallySuspended?: pulumi.Input<boolean>;
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     */
    maxClusterCount?: pulumi.Input<number>;
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     */
    maxConcurrencyLevel?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     */
    minClusterCount?: pulumi.Input<number>;
    /**
     * Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.WarehouseParameter>[]>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
     */
    queryAccelerationMaxScaleFactor?: pulumi.Input<number>;
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
     */
    resourceMonitor?: pulumi.Input<string>;
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
     */
    scalingPolicy?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.WarehouseShowOutput>[]>;
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     */
    statementQueuedTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     */
    statementTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
     */
    warehouseSize?: pulumi.Input<string>;
    /**
     * Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
     */
    warehouseType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Warehouse resource.
 */
export interface WarehouseArgs {
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    autoResume?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     */
    autoSuspend?: pulumi.Input<number>;
    /**
     * Specifies a comment for the warehouse.
     */
    comment?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    enableQueryAcceleration?: pulumi.Input<string>;
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     */
    initiallySuspended?: pulumi.Input<boolean>;
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     */
    maxClusterCount?: pulumi.Input<number>;
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     */
    maxConcurrencyLevel?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     */
    minClusterCount?: pulumi.Input<number>;
    /**
     * Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
     */
    queryAccelerationMaxScaleFactor?: pulumi.Input<number>;
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
     */
    resourceMonitor?: pulumi.Input<string>;
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
     */
    scalingPolicy?: pulumi.Input<string>;
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     */
    statementQueuedTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     */
    statementTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
     */
    warehouseSize?: pulumi.Input<string>;
    /**
     * Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
     */
    warehouseType?: pulumi.Input<string>;
}
