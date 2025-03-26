// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered users. Filtering is aligned with the current possibilities for [SHOW USERS](https://docs.snowflake.com/en/sql-reference/sql/show-users) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection. Important note is that when querying users you don't have permissions to, the querying options are limited. You won't get almost any field in `showOutput` (only empty or default values), the DESCRIBE command will return error when called, so you have to set `withDescribe = false`; the SHOW PARAMETERS command will return error when called too, so you have to set `withParameters = false`.
 */
export function getUsers(args?: GetUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getUsers:getUsers", {
        "like": args.like,
        "limit": args.limit,
        "startsWith": args.startsWith,
        "withDescribe": args.withDescribe,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetUsersLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: string;
    /**
     * Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
    /**
     * Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: boolean;
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
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
    readonly limit?: outputs.GetUsersLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    readonly startsWith?: string;
    /**
     * Holds the aggregated output of all user details queries.
     */
    readonly users: outputs.GetUsersUser[];
    /**
     * Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
    /**
     * Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    readonly withParameters?: boolean;
}
/**
 * Data source used to get details of filtered users. Filtering is aligned with the current possibilities for [SHOW USERS](https://docs.snowflake.com/en/sql-reference/sql/show-users) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection. Important note is that when querying users you don't have permissions to, the querying options are limited. You won't get almost any field in `showOutput` (only empty or default values), the DESCRIBE command will return error when called, so you have to set `withDescribe = false`; the SHOW PARAMETERS command will return error when called too, so you have to set `withParameters = false`.
 */
export function getUsersOutput(args?: GetUsersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUsersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getUsers:getUsers", {
        "like": args.like,
        "limit": args.limit,
        "startsWith": args.startsWith,
        "withDescribe": args.withDescribe,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetUsersLimitArgs>;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: pulumi.Input<string>;
    /**
     * Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
    /**
     * Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: pulumi.Input<boolean>;
}
