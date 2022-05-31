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
 * const scim = pulumi.output(snowflake.getSystemGenerateScimAccessToken({
 *     integrationName: "AAD_PROVISIONING",
 * }));
 * ```
 */
export function getSystemGenerateScimAccessToken(args: GetSystemGenerateScimAccessTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemGenerateScimAccessTokenResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", {
        "integrationName": args.integrationName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystemGenerateScimAccessToken.
 */
export interface GetSystemGenerateScimAccessTokenArgs {
    integrationName: string;
}

/**
 * A collection of values returned by getSystemGenerateScimAccessToken.
 */
export interface GetSystemGenerateScimAccessTokenResult {
    readonly accessToken: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly integrationName: string;
}

export function getSystemGenerateScimAccessTokenOutput(args: GetSystemGenerateScimAccessTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemGenerateScimAccessTokenResult> {
    return pulumi.output(args).apply(a => getSystemGenerateScimAccessToken(a, opts))
}

/**
 * A collection of arguments for invoking getSystemGenerateScimAccessToken.
 */
export interface GetSystemGenerateScimAccessTokenOutputArgs {
    integrationName: pulumi.Input<string>;
}
