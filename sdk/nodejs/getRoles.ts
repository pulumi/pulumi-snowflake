// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getRoles({});
 * const ad = snowflake.getRoles({
 *     pattern: "SYSADMIN",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRoles(args?: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getRoles:getRoles", {
        "pattern": args.pattern,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    /**
     * Filters the command output by object name.
     */
    pattern?: string;
}

/**
 * A collection of values returned by getRoles.
 */
export interface GetRolesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the command output by object name.
     */
    readonly pattern?: string;
    /**
     * List of all the roles which you can view across your entire account, including the system-defined roles and any custom roles that exist.
     */
    readonly roles: outputs.GetRolesRole[];
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getRoles({});
 * const ad = snowflake.getRoles({
 *     pattern: "SYSADMIN",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRolesOutput(args?: GetRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRolesResult> {
    return pulumi.output(args).apply((a: any) => getRoles(a, opts))
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesOutputArgs {
    /**
     * Filters the command output by object name.
     */
    pattern?: pulumi.Input<string>;
}
