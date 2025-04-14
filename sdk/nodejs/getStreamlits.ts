// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered streamlits. Filtering is aligned with the current possibilities for [SHOW STREAMLITS](https://docs.snowflake.com/en/sql-reference/sql/show-streamlits) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `streamlits`.
 */
export function getStreamlits(args?: GetStreamlitsArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamlitsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getStreamlits:getStreamlits", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamlits.
 */
export interface GetStreamlitsArgs {
    /**
     * IN clause to filter the list of streamlits
     */
    in?: inputs.GetStreamlitsIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetStreamlitsLimit;
    /**
     * (Default: `true`) Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
}

/**
 * A collection of values returned by getStreamlits.
 */
export interface GetStreamlitsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of streamlits
     */
    readonly in?: outputs.GetStreamlitsIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetStreamlitsLimit;
    /**
     * Holds the aggregated output of all streamlits details queries.
     */
    readonly streamlits: outputs.GetStreamlitsStreamlit[];
    /**
     * (Default: `true`) Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
}
/**
 * Data source used to get details of filtered streamlits. Filtering is aligned with the current possibilities for [SHOW STREAMLITS](https://docs.snowflake.com/en/sql-reference/sql/show-streamlits) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `streamlits`.
 */
export function getStreamlitsOutput(args?: GetStreamlitsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStreamlitsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getStreamlits:getStreamlits", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamlits.
 */
export interface GetStreamlitsOutputArgs {
    /**
     * IN clause to filter the list of streamlits
     */
    in?: pulumi.Input<inputs.GetStreamlitsInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetStreamlitsLimitArgs>;
    /**
     * (Default: `true`) Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
}
