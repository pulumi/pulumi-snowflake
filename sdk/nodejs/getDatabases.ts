// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `startsWith`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
 */
export function getDatabases(args?: GetDatabasesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabasesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getDatabases:getDatabases", {
        "like": args.like,
        "limit": args.limit,
        "startsWith": args.startsWith,
        "withDescribe": args.withDescribe,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetDatabasesLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: string;
    /**
     * Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
    /**
     * Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: boolean;
}

/**
 * A collection of values returned by getDatabases.
 */
export interface GetDatabasesResult {
    /**
     * Holds the aggregated output of all database details queries.
     */
    readonly databases: outputs.GetDatabasesDatabase[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetDatabasesLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    readonly startsWith?: string;
    /**
     * Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
    /**
     * Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    readonly withParameters?: boolean;
}
/**
 * !> **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `startsWith`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
 */
export function getDatabasesOutput(args?: GetDatabasesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabasesResult> {
    return pulumi.output(args).apply((a: any) => getDatabases(a, opts))
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetDatabasesLimitArgs>;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: pulumi.Input<string>;
    /**
     * Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
    /**
     * Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: pulumi.Input<boolean>;
}
