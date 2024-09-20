// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered database roles. Filtering is aligned with the current possibilities for [SHOW DATABASE ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-database-roles) query (`like` and `limit` are supported). The results of SHOW is encapsulated in showOutput collection.
 */
export function getDatabaseRoles(args: GetDatabaseRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseRolesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getDatabaseRoles:getDatabaseRoles", {
        "inDatabase": args.inDatabase,
        "like": args.like,
        "limit": args.limit,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseRoles.
 */
export interface GetDatabaseRolesArgs {
    /**
     * The database from which to return the database roles from.
     */
    inDatabase: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetDatabaseRolesLimit;
}

/**
 * A collection of values returned by getDatabaseRoles.
 */
export interface GetDatabaseRolesResult {
    /**
     * Holds the aggregated output of all database role details queries.
     */
    readonly databaseRoles: outputs.GetDatabaseRolesDatabaseRole[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The database from which to return the database roles from.
     */
    readonly inDatabase: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetDatabaseRolesLimit;
}
/**
 * !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
 *
 * Datasource used to get details of filtered database roles. Filtering is aligned with the current possibilities for [SHOW DATABASE ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-database-roles) query (`like` and `limit` are supported). The results of SHOW is encapsulated in showOutput collection.
 */
export function getDatabaseRolesOutput(args: GetDatabaseRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseRolesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getDatabaseRoles:getDatabaseRoles", {
        "inDatabase": args.inDatabase,
        "like": args.like,
        "limit": args.limit,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseRoles.
 */
export interface GetDatabaseRolesOutputArgs {
    /**
     * The database from which to return the database roles from.
     */
    inDatabase: pulumi.Input<string>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetDatabaseRolesLimitArgs>;
}
