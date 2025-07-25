// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Sensitive values** This data source's `describe_output.body` field is not marked as sensitive in the provider. Ensure that no personal data, sensitive data, export-controlled data, or other regulated data is entered as metadata when using the provider. If you use one of these fields, they may be present in logs, so ensure that the provider logs are properly restricted. For more information, see Sensitive values limitations and [Metadata fields in Snowflake](https://docs.snowflake.com/en/sql-reference/metadata).
 *
 * Data source used to get details of filtered row access policies. Filtering is aligned with the current possibilities for [SHOW ROW ACCESS POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-row-access-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `rowAccessPolicies`.
 */
export function getRowAccessPolicies(args?: GetRowAccessPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetRowAccessPoliciesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesArgs {
    /**
     * IN clause to filter the list of row access policies
     */
    in?: inputs.GetRowAccessPoliciesIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetRowAccessPoliciesLimit;
    /**
     * (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
}

/**
 * A collection of values returned by getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of row access policies
     */
    readonly in?: outputs.GetRowAccessPoliciesIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetRowAccessPoliciesLimit;
    /**
     * Holds the aggregated output of all views details queries.
     */
    readonly rowAccessPolicies: outputs.GetRowAccessPoliciesRowAccessPolicy[];
    /**
     * (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
}
/**
 * !> **Sensitive values** This data source's `describe_output.body` field is not marked as sensitive in the provider. Ensure that no personal data, sensitive data, export-controlled data, or other regulated data is entered as metadata when using the provider. If you use one of these fields, they may be present in logs, so ensure that the provider logs are properly restricted. For more information, see Sensitive values limitations and [Metadata fields in Snowflake](https://docs.snowflake.com/en/sql-reference/metadata).
 *
 * Data source used to get details of filtered row access policies. Filtering is aligned with the current possibilities for [SHOW ROW ACCESS POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-row-access-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `rowAccessPolicies`.
 */
export function getRowAccessPoliciesOutput(args?: GetRowAccessPoliciesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRowAccessPoliciesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesOutputArgs {
    /**
     * IN clause to filter the list of row access policies
     */
    in?: pulumi.Input<inputs.GetRowAccessPoliciesInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetRowAccessPoliciesLimitArgs>;
    /**
     * (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
}
