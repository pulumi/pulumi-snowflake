// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Sensitive values** This data source's `show_output.config` and `show_output.definition` fields are not marked as sensitive in the provider. Ensure that no personal data, sensitive data, export-controlled data, or other regulated data is entered as metadata when using the provider. For more information, see Sensitive values limitations and [Metadata fields in Snowflake](https://docs.snowflake.com/en/sql-reference/metadata).
 *
 * Data source used to get details of filtered tasks. Filtering is aligned with the current possibilities for [SHOW TASKS](https://docs.snowflake.com/en/sql-reference/sql/show-tasks) query. The results of SHOW and SHOW PARAMETERS IN are encapsulated in one output collection `tasks`.
 */
export function getTasks(args?: GetTasksArgs, opts?: pulumi.InvokeOptions): Promise<GetTasksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getTasks:getTasks", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "rootOnly": args.rootOnly,
        "startsWith": args.startsWith,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getTasks.
 */
export interface GetTasksArgs {
    /**
     * IN clause to filter the list of objects
     */
    in?: inputs.GetTasksIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetTasksLimit;
    /**
     * Filters the command output to return only root tasks (tasks with no predecessors).
     */
    rootOnly?: boolean;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: string;
    /**
     * (Default: `true`) Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: boolean;
}

/**
 * A collection of values returned by getTasks.
 */
export interface GetTasksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of objects
     */
    readonly in?: outputs.GetTasksIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetTasksLimit;
    /**
     * Filters the command output to return only root tasks (tasks with no predecessors).
     */
    readonly rootOnly?: boolean;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    readonly startsWith?: string;
    /**
     * Holds the aggregated output of all task details queries.
     */
    readonly tasks: outputs.GetTasksTask[];
    /**
     * (Default: `true`) Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     */
    readonly withParameters?: boolean;
}
/**
 * !> **Sensitive values** This data source's `show_output.config` and `show_output.definition` fields are not marked as sensitive in the provider. Ensure that no personal data, sensitive data, export-controlled data, or other regulated data is entered as metadata when using the provider. For more information, see Sensitive values limitations and [Metadata fields in Snowflake](https://docs.snowflake.com/en/sql-reference/metadata).
 *
 * Data source used to get details of filtered tasks. Filtering is aligned with the current possibilities for [SHOW TASKS](https://docs.snowflake.com/en/sql-reference/sql/show-tasks) query. The results of SHOW and SHOW PARAMETERS IN are encapsulated in one output collection `tasks`.
 */
export function getTasksOutput(args?: GetTasksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTasksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getTasks:getTasks", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "rootOnly": args.rootOnly,
        "startsWith": args.startsWith,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getTasks.
 */
export interface GetTasksOutputArgs {
    /**
     * IN clause to filter the list of objects
     */
    in?: pulumi.Input<inputs.GetTasksInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetTasksLimitArgs>;
    /**
     * Filters the command output to return only root tasks (tasks with no predecessors).
     */
    rootOnly?: pulumi.Input<boolean>;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: pulumi.Input<string>;
    /**
     * (Default: `true`) Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: pulumi.Input<boolean>;
}
