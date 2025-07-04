// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * <!-- TODO(SNOW-1844996): Remove this note.-->
 * > **Note** Field `WITH PRIVILEGES` is currently missing. It will be added in the future.
 *
 * Data source used to get details of filtered schemas. Filtering is aligned with the current possibilities for [SHOW SCHEMAS](https://docs.snowflake.com/en/sql-reference/sql/show-schemas) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
 */
export function getSchemas(args?: GetSchemasArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemasResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getSchemas:getSchemas", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "startsWith": args.startsWith,
        "withDescribe": args.withDescribe,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemas.
 */
export interface GetSchemasArgs {
    /**
     * IN clause to filter the list of streamlits
     */
    in?: inputs.GetSchemasIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: inputs.GetSchemasLimit;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: string;
    /**
     * (Default: `true`) Runs DESC SCHEMA for each schema returned by SHOW SCHEMAS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
    /**
     * (Default: `true`) Runs SHOW PARAMETERS FOR SCHEMA for each schema returned by SHOW SCHEMAS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: boolean;
}

/**
 * A collection of values returned by getSchemas.
 */
export interface GetSchemasResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of streamlits
     */
    readonly in?: outputs.GetSchemasIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    readonly limit?: outputs.GetSchemasLimit;
    /**
     * Holds the aggregated output of all SCHEMA details queries.
     */
    readonly schemas: outputs.GetSchemasSchema[];
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    readonly startsWith?: string;
    /**
     * (Default: `true`) Runs DESC SCHEMA for each schema returned by SHOW SCHEMAS. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
    /**
     * (Default: `true`) Runs SHOW PARAMETERS FOR SCHEMA for each schema returned by SHOW SCHEMAS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    readonly withParameters?: boolean;
}
/**
 * <!-- TODO(SNOW-1844996): Remove this note.-->
 * > **Note** Field `WITH PRIVILEGES` is currently missing. It will be added in the future.
 *
 * Data source used to get details of filtered schemas. Filtering is aligned with the current possibilities for [SHOW SCHEMAS](https://docs.snowflake.com/en/sql-reference/sql/show-schemas) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
 */
export function getSchemasOutput(args?: GetSchemasOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSchemasResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getSchemas:getSchemas", {
        "in": args.in,
        "like": args.like,
        "limit": args.limit,
        "startsWith": args.startsWith,
        "withDescribe": args.withDescribe,
        "withParameters": args.withParameters,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemas.
 */
export interface GetSchemasOutputArgs {
    /**
     * IN clause to filter the list of streamlits
     */
    in?: pulumi.Input<inputs.GetSchemasInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
     */
    limit?: pulumi.Input<inputs.GetSchemasLimitArgs>;
    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     */
    startsWith?: pulumi.Input<string>;
    /**
     * (Default: `true`) Runs DESC SCHEMA for each schema returned by SHOW SCHEMAS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
    /**
     * (Default: `true`) Runs SHOW PARAMETERS FOR SCHEMA for each schema returned by SHOW SCHEMAS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     */
    withParameters?: pulumi.Input<boolean>;
}
