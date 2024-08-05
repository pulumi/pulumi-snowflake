// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This datasource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `inClass` are all supported). The results of SHOW are encapsulated in one output collection.
 */
export function getRoles(args?: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getRoles:getRoles", {
        "inClass": args.inClass,
        "like": args.like,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    /**
     * Filters the SHOW GRANTS output by class name.
     */
    inClass?: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
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
     * Filters the SHOW GRANTS output by class name.
     */
    readonly inClass?: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Holds the aggregated output of all role details queries.
     */
    readonly roles: outputs.GetRolesRole[];
}
/**
 * !> **V1 release candidate** This datasource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `inClass` are all supported). The results of SHOW are encapsulated in one output collection.
 */
export function getRolesOutput(args?: GetRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRolesResult> {
    return pulumi.output(args).apply((a: any) => getRoles(a, opts))
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesOutputArgs {
    /**
     * Filters the SHOW GRANTS output by class name.
     */
    inClass?: pulumi.Input<string>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
}
