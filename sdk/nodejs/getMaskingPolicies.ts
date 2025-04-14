// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `maskingPolicies`.
 */
export function getMaskingPolicies(args?: GetMaskingPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetMaskingPoliciesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getMaskingPolicies:getMaskingPolicies", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getMaskingPolicies.
 */
export interface GetMaskingPoliciesArgs {
    /**
     * IN clause to filter the list of masking policies
     */
    in?: inputs.GetMaskingPoliciesIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetMaskingPoliciesLimit;
    /**
     * (Default: `true`) Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
}

/**
 * A collection of values returned by getMaskingPolicies.
 */
export interface GetMaskingPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of masking policies
     */
    readonly in?: outputs.GetMaskingPoliciesIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetMaskingPoliciesLimit;
    /**
     * Holds the aggregated output of all views details queries.
     */
    readonly maskingPolicies: outputs.GetMaskingPoliciesMaskingPolicy[];
    /**
     * (Default: `true`) Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
}
/**
 * Data source used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `maskingPolicies`.
 */
export function getMaskingPoliciesOutput(args?: GetMaskingPoliciesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMaskingPoliciesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getMaskingPolicies:getMaskingPolicies", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getMaskingPolicies.
 */
export interface GetMaskingPoliciesOutputArgs {
    /**
     * IN clause to filter the list of masking policies
     */
    in?: pulumi.Input<inputs.GetMaskingPoliciesInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetMaskingPoliciesLimitArgs>;
    /**
     * (Default: `true`) Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
}
