// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const _this = snowflake.getShares({});
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
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const _this = snowflake.getShares({});
 * const ad = snowflake.getShares({
 *     pattern: "usage",
 * });
 * ```
 */
export function getSharesOutput(args?: GetSharesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSharesResult> {
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
