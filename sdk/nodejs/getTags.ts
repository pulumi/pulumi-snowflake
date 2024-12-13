// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered tags. Filtering is aligned with the current possibilities for [SHOW TAGS](https://docs.snowflake.com/en/sql-reference/sql/show-tags) query. The results of SHOW are encapsulated in one output collection `tags`.
 */
export function getTags(args?: GetTagsArgs, opts?: pulumi.InvokeOptions): Promise<GetTagsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getTags:getTags", {
        "in": args.in,
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getTags.
 */
export interface GetTagsArgs {
    /**
     * IN clause to filter the list of objects
     */
    in?: inputs.GetTagsIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
}

/**
 * A collection of values returned by getTags.
 */
export interface GetTagsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of objects
     */
    readonly in?: outputs.GetTagsIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Holds the aggregated output of all tags details queries.
     */
    readonly tags: outputs.GetTagsTag[];
}
/**
 * Data source used to get details of filtered tags. Filtering is aligned with the current possibilities for [SHOW TAGS](https://docs.snowflake.com/en/sql-reference/sql/show-tags) query. The results of SHOW are encapsulated in one output collection `tags`.
 */
export function getTagsOutput(args?: GetTagsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTagsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getTags:getTags", {
        "in": args.in,
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getTags.
 */
export interface GetTagsOutputArgs {
    /**
     * IN clause to filter the list of objects
     */
    in?: pulumi.Input<inputs.GetTagsInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
}
