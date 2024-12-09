// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered resource monitors. Filtering is aligned with the current possibilities for [SHOW RESOURCE MONITORS](https://docs.snowflake.com/en/sql-reference/sql/show-resource-monitors) query (`like` is supported). The results of SHOW is encapsulated in showOutput collection.
 */
export function getResourceMonitors(args?: GetResourceMonitorsArgs, opts?: pulumi.InvokeOptions): Promise<GetResourceMonitorsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getResourceMonitors:getResourceMonitors", {
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourceMonitors.
 */
export interface GetResourceMonitorsArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
}

/**
 * A collection of values returned by getResourceMonitors.
 */
export interface GetResourceMonitorsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Holds the aggregated output of all resource monitor details queries.
     */
    readonly resourceMonitors: outputs.GetResourceMonitorsResourceMonitor[];
}
/**
 * !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered resource monitors. Filtering is aligned with the current possibilities for [SHOW RESOURCE MONITORS](https://docs.snowflake.com/en/sql-reference/sql/show-resource-monitors) query (`like` is supported). The results of SHOW is encapsulated in showOutput collection.
 */
export function getResourceMonitorsOutput(args?: GetResourceMonitorsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetResourceMonitorsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getResourceMonitors:getResourceMonitors", {
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourceMonitors.
 */
export interface GetResourceMonitorsOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
}
