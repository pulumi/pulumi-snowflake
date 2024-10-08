// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const scim = snowflake.getSystemGenerateScimAccessToken({
 *     integrationName: "AAD_PROVISIONING",
 * });
 * ```
 */
export function getSystemGenerateScimAccessToken(args: GetSystemGenerateScimAccessTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemGenerateScimAccessTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", {
        "integrationName": args.integrationName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemGenerateScimAccessToken.
 */
export interface GetSystemGenerateScimAccessTokenArgs {
    /**
     * SCIM Integration Name
     */
    integrationName: string;
}

/**
 * A collection of values returned by getSystemGenerateScimAccessToken.
 */
export interface GetSystemGenerateScimAccessTokenResult {
    /**
     * SCIM Access Token
     */
    readonly accessToken: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * SCIM Integration Name
     */
    readonly integrationName: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const scim = snowflake.getSystemGenerateScimAccessToken({
 *     integrationName: "AAD_PROVISIONING",
 * });
 * ```
 */
export function getSystemGenerateScimAccessTokenOutput(args: GetSystemGenerateScimAccessTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemGenerateScimAccessTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", {
        "integrationName": args.integrationName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemGenerateScimAccessToken.
 */
export interface GetSystemGenerateScimAccessTokenOutputArgs {
    /**
     * SCIM Integration Name
     */
    integrationName: pulumi.Input<string>;
}
