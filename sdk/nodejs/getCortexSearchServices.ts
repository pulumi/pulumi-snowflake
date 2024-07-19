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
 * // Simple usage
 * const simple = snowflake.getCortexSearchServices({});
 * export const simpleOutput = simple.then(simple => simple.cortexSearchServices);
 * // Filtering (like)
 * const like = snowflake.getCortexSearchServices({
 *     like: "some-name",
 * });
 * export const likeOutput = like.then(like => like.cortexSearchServices);
 * // Filtering (starts_with)
 * const startsWith = snowflake.getCortexSearchServices({
 *     startsWith: "prefix-",
 * });
 * export const startsWithOutput = startsWith.then(startsWith => startsWith.cortexSearchServices);
 * // Filtering (limit)
 * const limit = snowflake.getCortexSearchServices({
 *     limit: {
 *         rows: 10,
 *         from: "prefix-",
 *     },
 * });
 * export const limitOutput = limit.then(limit => limit.cortexSearchServices);
 * ```
 */
export function getCortexSearchServices(args?: GetCortexSearchServicesArgs, opts?: pulumi.InvokeOptions): Promise<GetCortexSearchServicesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getCortexSearchServices:getCortexSearchServices", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "startsWith": args.startsWith,
    }, opts);
}

/**
 * A collection of arguments for invoking getCortexSearchServices.
 */
export interface GetCortexSearchServicesArgs {
    /**
     * IN clause to filter the list of cortex search services.
     */
    in?: inputs.GetCortexSearchServicesIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetCortexSearchServicesLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: string;
}

/**
 * A collection of values returned by getCortexSearchServices.
 */
export interface GetCortexSearchServicesResult {
    /**
     * Holds the output of SHOW CORTEX SEARCH SERVICES.
     */
    readonly cortexSearchServices: outputs.GetCortexSearchServicesCortexSearchService[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of cortex search services.
     */
    readonly in?: outputs.GetCortexSearchServicesIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetCortexSearchServicesLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    readonly startsWith?: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * // Simple usage
 * const simple = snowflake.getCortexSearchServices({});
 * export const simpleOutput = simple.then(simple => simple.cortexSearchServices);
 * // Filtering (like)
 * const like = snowflake.getCortexSearchServices({
 *     like: "some-name",
 * });
 * export const likeOutput = like.then(like => like.cortexSearchServices);
 * // Filtering (starts_with)
 * const startsWith = snowflake.getCortexSearchServices({
 *     startsWith: "prefix-",
 * });
 * export const startsWithOutput = startsWith.then(startsWith => startsWith.cortexSearchServices);
 * // Filtering (limit)
 * const limit = snowflake.getCortexSearchServices({
 *     limit: {
 *         rows: 10,
 *         from: "prefix-",
 *     },
 * });
 * export const limitOutput = limit.then(limit => limit.cortexSearchServices);
 * ```
 */
export function getCortexSearchServicesOutput(args?: GetCortexSearchServicesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCortexSearchServicesResult> {
    return pulumi.output(args).apply((a: any) => getCortexSearchServices(a, opts))
}

/**
 * A collection of arguments for invoking getCortexSearchServices.
 */
export interface GetCortexSearchServicesOutputArgs {
    /**
     * IN clause to filter the list of cortex search services.
     */
    in?: pulumi.Input<inputs.GetCortexSearchServicesInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetCortexSearchServicesLimitArgs>;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: pulumi.Input<string>;
}