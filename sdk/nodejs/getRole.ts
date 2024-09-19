// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.getRoles instead. <deprecation>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getRole({
 *     name: "role1",
 * });
 * ```
 */
export function getRole(args: GetRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getRole:getRole", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRole.
 */
export interface GetRoleArgs {
    /**
     * The role for which to return metadata.
     */
    name: string;
}

/**
 * A collection of values returned by getRole.
 */
export interface GetRoleResult {
    /**
     * The comment on the role
     */
    readonly comment: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The role for which to return metadata.
     */
    readonly name: string;
}
/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.getRoles instead. <deprecation>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getRole({
 *     name: "role1",
 * });
 * ```
 */
export function getRoleOutput(args: GetRoleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getRole:getRole", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRole.
 */
export interface GetRoleOutputArgs {
    /**
     * The role for which to return metadata.
     */
    name: pulumi.Input<string>;
}
