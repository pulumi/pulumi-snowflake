// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered accounts. Filtering is aligned with the current possibilities for [SHOW ACCOUNTS](https://docs.snowflake.com/en/sql-reference/sql/show-accounts) query. The results of SHOW are encapsulated in one output collection `accounts`.
 */
export function getAccounts(args?: GetAccountsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getAccounts:getAccounts", {
        "like": args.like,
        "withHistory": args.withHistory,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccounts.
 */
export interface GetAccountsArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Includes dropped accounts that have not yet been deleted.
     */
    withHistory?: boolean;
}

/**
 * A collection of values returned by getAccounts.
 */
export interface GetAccountsResult {
    /**
     * Holds the aggregated output of all accounts details queries.
     */
    readonly accounts: outputs.GetAccountsAccount[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Includes dropped accounts that have not yet been deleted.
     */
    readonly withHistory?: boolean;
}
/**
 * Data source used to get details of filtered accounts. Filtering is aligned with the current possibilities for [SHOW ACCOUNTS](https://docs.snowflake.com/en/sql-reference/sql/show-accounts) query. The results of SHOW are encapsulated in one output collection `accounts`.
 */
export function getAccountsOutput(args?: GetAccountsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getAccounts:getAccounts", {
        "like": args.like,
        "withHistory": args.withHistory,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccounts.
 */
export interface GetAccountsOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Includes dropped accounts that have not yet been deleted.
     */
    withHistory?: pulumi.Input<boolean>;
}
