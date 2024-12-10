// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This data source is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered connections. Filtering is aligned with the current possibilities for [SHOW CONNECTIONS](https://docs.snowflake.com/en/sql-reference/sql/show-connections) query. The results of SHOW is encapsulated in one output collection `connections`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * // Simple usage
 * const simple = snowflake.getConnections({});
 * export const simpleOutput = simple.then(simple => simple.connections);
 * // Filtering (like)
 * const like = snowflake.getConnections({
 *     like: "connection-name",
 * });
 * export const likeOutput = like.then(like => like.connections);
 * // Filtering by prefix (like)
 * const likePrefix = snowflake.getConnections({
 *     like: "prefix%",
 * });
 * export const likePrefixOutput = likePrefix.then(likePrefix => likePrefix.connections);
 * ```
 */
export function getConnections(args?: GetConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getConnections:getConnections", {
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnections.
 */
export interface GetConnectionsArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
}

/**
 * A collection of values returned by getConnections.
 */
export interface GetConnectionsResult {
    /**
     * Holds the aggregated output of all connections details queries.
     */
    readonly connections: outputs.GetConnectionsConnection[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
}
/**
 * !> **V1 release candidate** This data source is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered connections. Filtering is aligned with the current possibilities for [SHOW CONNECTIONS](https://docs.snowflake.com/en/sql-reference/sql/show-connections) query. The results of SHOW is encapsulated in one output collection `connections`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * // Simple usage
 * const simple = snowflake.getConnections({});
 * export const simpleOutput = simple.then(simple => simple.connections);
 * // Filtering (like)
 * const like = snowflake.getConnections({
 *     like: "connection-name",
 * });
 * export const likeOutput = like.then(like => like.connections);
 * // Filtering by prefix (like)
 * const likePrefix = snowflake.getConnections({
 *     like: "prefix%",
 * });
 * export const likePrefixOutput = likePrefix.then(likePrefix => likePrefix.connections);
 * ```
 */
export function getConnectionsOutput(args?: GetConnectionsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConnectionsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getConnections:getConnections", {
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnections.
 */
export interface GetConnectionsOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
}