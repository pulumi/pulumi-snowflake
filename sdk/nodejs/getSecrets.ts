// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered secrets. Filtering is aligned with the current possibilities for [SHOW SECRETS](https://docs.snowflake.com/en/sql-reference/sql/show-secrets) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `secrets`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * // Simple usage
 * const simple = snowflake.getSecrets({});
 * export const simpleOutput = simple.then(simple => simple.secrets);
 * // Filtering (like)
 * const like = snowflake.getSecrets({
 *     like: "secret-name",
 * });
 * export const likeOutput = like.then(like => like.secrets);
 * // Filtering by prefix (like)
 * const likePrefix = snowflake.getSecrets({
 *     like: "prefix%",
 * });
 * export const likePrefixOutput = likePrefix.then(likePrefix => likePrefix.secrets);
 * // Filtering (in)
 * const _in = snowflake.getSecrets({
 *     "in": {
 *         schema: test.fullyQualifiedName,
 *     },
 * });
 * export const inOutput = _in.then(_in => _in.secrets);
 * // Without additional data (to limit the number of calls make for every found secret)
 * const onlyShow = snowflake.getSecrets({
 *     withDescribe: false,
 * });
 * export const onlyShowOutput = onlyShow.then(onlyShow => onlyShow.secrets);
 * ```
 *
 * > **Note** If a field has a default value, it is shown next to the type in the schema.
 */
export function getSecrets(args?: GetSecretsArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getSecrets:getSecrets", {
        "in": args.in,
        "like": args.like,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecrets.
 */
export interface GetSecretsArgs {
    /**
     * IN clause to filter the list of secrets
     */
    in?: inputs.GetSecretsIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * (Default: `true`) Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
}

/**
 * A collection of values returned by getSecrets.
 */
export interface GetSecretsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IN clause to filter the list of secrets
     */
    readonly in?: outputs.GetSecretsIn;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Holds the aggregated output of all secrets details queries.
     */
    readonly secrets: outputs.GetSecretsSecret[];
    /**
     * (Default: `true`) Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
}
/**
 * Data source used to get details of filtered secrets. Filtering is aligned with the current possibilities for [SHOW SECRETS](https://docs.snowflake.com/en/sql-reference/sql/show-secrets) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `secrets`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * // Simple usage
 * const simple = snowflake.getSecrets({});
 * export const simpleOutput = simple.then(simple => simple.secrets);
 * // Filtering (like)
 * const like = snowflake.getSecrets({
 *     like: "secret-name",
 * });
 * export const likeOutput = like.then(like => like.secrets);
 * // Filtering by prefix (like)
 * const likePrefix = snowflake.getSecrets({
 *     like: "prefix%",
 * });
 * export const likePrefixOutput = likePrefix.then(likePrefix => likePrefix.secrets);
 * // Filtering (in)
 * const _in = snowflake.getSecrets({
 *     "in": {
 *         schema: test.fullyQualifiedName,
 *     },
 * });
 * export const inOutput = _in.then(_in => _in.secrets);
 * // Without additional data (to limit the number of calls make for every found secret)
 * const onlyShow = snowflake.getSecrets({
 *     withDescribe: false,
 * });
 * export const onlyShowOutput = onlyShow.then(onlyShow => onlyShow.secrets);
 * ```
 *
 * > **Note** If a field has a default value, it is shown next to the type in the schema.
 */
export function getSecretsOutput(args?: GetSecretsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSecretsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getSecrets:getSecrets", {
        "in": args.in,
        "like": args.like,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecrets.
 */
export interface GetSecretsOutputArgs {
    /**
     * IN clause to filter the list of secrets
     */
    in?: pulumi.Input<inputs.GetSecretsInArgs>;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * (Default: `true`) Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
}
