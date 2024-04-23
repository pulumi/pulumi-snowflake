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
 * const current = snowflake.getStorageIntegrations({});
 * ```
 */
export function getStorageIntegrations(opts?: pulumi.InvokeOptions): Promise<GetStorageIntegrationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getStorageIntegrations:getStorageIntegrations", {
    }, opts);
}

/**
 * A collection of values returned by getStorageIntegrations.
 */
export interface GetStorageIntegrationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The storage integrations in the database
     */
    readonly storageIntegrations: outputs.GetStorageIntegrationsStorageIntegration[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getStorageIntegrations({});
 * ```
 */
export function getStorageIntegrationsOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetStorageIntegrationsResult> {
    return pulumi.output(getStorageIntegrations(opts))
}
