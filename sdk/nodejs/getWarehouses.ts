// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered warehouses. Filtering is aligned with the current possibilities for [SHOW WAREHOUSES](https://docs.snowflake.com/en/sql-reference/sql/show-warehouses) query (only `like` is supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
 */
export function getWarehouses(args?: GetWarehousesArgs, opts?: pulumi.InvokeOptions): Promise<GetWarehousesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getWarehouses:getWarehouses", {
        "like": args.like,
        "withDescribe": args.withDescribe,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getWarehouses.
 */
export interface GetWarehousesArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
    /**
     * Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: boolean;
}

/**
 * A collection of values returned by getWarehouses.
 */
export interface GetWarehousesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Holds the aggregated output of all warehouse details queries.
     */
    readonly warehouses: outputs.GetWarehousesWarehouse[];
    /**
     * Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
    /**
     * Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    readonly withParameters?: boolean;
}
/**
 * !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered warehouses. Filtering is aligned with the current possibilities for [SHOW WAREHOUSES](https://docs.snowflake.com/en/sql-reference/sql/show-warehouses) query (only `like` is supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
 */
export function getWarehousesOutput(args?: GetWarehousesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWarehousesResult> {
    return pulumi.output(args).apply((a: any) => getWarehouses(a, opts))
}

/**
 * A collection of arguments for invoking getWarehouses.
 */
export interface GetWarehousesOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
    /**
     * Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: pulumi.Input<boolean>;
}
