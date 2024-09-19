// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getCurrentAccount({});
 * const snowflakeAccountUrl = new aws.index.SsmParameter("snowflake_account_url", {
 *     name: "/snowflake/account_url",
 *     type: "String",
 *     value: _this.url,
 * });
 * ```
 */
export function getCurrentAccount(opts?: pulumi.InvokeOptions): Promise<GetCurrentAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getCurrentAccount:getCurrentAccount", {
    }, opts);
}

/**
 * A collection of values returned by getCurrentAccount.
 */
export interface GetCurrentAccountResult {
    /**
     * The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
     */
    readonly account: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Snowflake Region; as returned by CURRENT_REGION()
     */
    readonly region: string;
    /**
     * The Snowflake URL.
     */
    readonly url: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getCurrentAccount({});
 * const snowflakeAccountUrl = new aws.index.SsmParameter("snowflake_account_url", {
 *     name: "/snowflake/account_url",
 *     type: "String",
 *     value: _this.url,
 * });
 * ```
 */
export function getCurrentAccountOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetCurrentAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getCurrentAccount:getCurrentAccount", {
    }, opts);
}
