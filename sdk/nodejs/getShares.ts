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
 * const this = snowflake.getShares({});
 * const ad = snowflake.getShares({
 *     pattern: "usage",
 * });
 * ```
 */
export function getShares(args?: GetSharesArgs, opts?: pulumi.InvokeOptions): Promise<GetSharesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getShares:getShares", {
        "pattern": args.pattern,
    }, opts);
}

/**
 * A collection of arguments for invoking getShares.
 */
export interface GetSharesArgs {
    /**
     * Filters the command output by object name.
     */
    pattern?: string;
}

/**
 * A collection of values returned by getShares.
 */
export interface GetSharesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the command output by object name.
     */
    readonly pattern?: string;
    /**
     * List of all the shares available in the system.
     */
    readonly shares: outputs.GetSharesShare[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getShares({});
 * const ad = snowflake.getShares({
 *     pattern: "usage",
 * });
 * ```
 */
export function getSharesOutput(args?: GetSharesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSharesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getShares:getShares", {
        "pattern": args.pattern,
    }, opts);
}

/**
 * A collection of arguments for invoking getShares.
 */
export interface GetSharesOutputArgs {
    /**
     * Filters the command output by object name.
     */
    pattern?: pulumi.Input<string>;
}
