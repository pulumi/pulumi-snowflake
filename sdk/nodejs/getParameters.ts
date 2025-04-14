// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const d = new snowflake.Database("d", {name: "TEST_DB"});
 * // read all object parameters in database TEST_DB
 * const p = snowflake.getParametersOutput({
 *     parameterType: "OBJECT",
 *     objectType: "DATABASE",
 *     objectName: d.name,
 * });
 * // read all account parameters with the pattern '%TIMESTAMP%'
 * const p2 = snowflake.getParameters({
 *     parameterType: "ACCOUNT",
 *     pattern: "%TIMESTAMP%",
 * });
 * // read the exact session parameter ROWS_PER_RESULTSET
 * const p3 = snowflake.getParameters({
 *     parameterType: "SESSION",
 *     pattern: "ROWS_PER_RESULTSET",
 *     user: "TEST_USER",
 * });
 * ```
 *
 * > **Note** If a field has a default value, it is shown next to the type in the schema.
 */
export function getParameters(args?: GetParametersArgs, opts?: pulumi.InvokeOptions): Promise<GetParametersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getParameters:getParameters", {
        "objectName": args.objectName,
        "objectType": args.objectType,
        "parameterType": args.parameterType,
        "pattern": args.pattern,
        "user": args.user,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameters.
 */
export interface GetParametersArgs {
    /**
     * If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
     */
    objectName?: string;
    /**
     * If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
     */
    objectType?: string;
    /**
     * (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
     */
    parameterType?: string;
    /**
     * Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
     */
    pattern?: string;
    /**
     * If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
     */
    user?: string;
}

/**
 * A collection of values returned by getParameters.
 */
export interface GetParametersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
     */
    readonly objectName?: string;
    /**
     * If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
     */
    readonly objectType?: string;
    /**
     * (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
     */
    readonly parameterType?: string;
    /**
     * The pipes in the schema
     */
    readonly parameters: outputs.GetParametersParameter[];
    /**
     * Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
     */
    readonly pattern?: string;
    /**
     * If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
     */
    readonly user?: string;
}
/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const d = new snowflake.Database("d", {name: "TEST_DB"});
 * // read all object parameters in database TEST_DB
 * const p = snowflake.getParametersOutput({
 *     parameterType: "OBJECT",
 *     objectType: "DATABASE",
 *     objectName: d.name,
 * });
 * // read all account parameters with the pattern '%TIMESTAMP%'
 * const p2 = snowflake.getParameters({
 *     parameterType: "ACCOUNT",
 *     pattern: "%TIMESTAMP%",
 * });
 * // read the exact session parameter ROWS_PER_RESULTSET
 * const p3 = snowflake.getParameters({
 *     parameterType: "SESSION",
 *     pattern: "ROWS_PER_RESULTSET",
 *     user: "TEST_USER",
 * });
 * ```
 *
 * > **Note** If a field has a default value, it is shown next to the type in the schema.
 */
export function getParametersOutput(args?: GetParametersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetParametersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getParameters:getParameters", {
        "objectName": args.objectName,
        "objectType": args.objectType,
        "parameterType": args.parameterType,
        "pattern": args.pattern,
        "user": args.user,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameters.
 */
export interface GetParametersOutputArgs {
    /**
     * If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
     */
    objectName?: pulumi.Input<string>;
    /**
     * If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
     */
    objectType?: pulumi.Input<string>;
    /**
     * (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
     */
    parameterType?: pulumi.Input<string>;
    /**
     * Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
     */
    pattern?: pulumi.Input<string>;
    /**
     * If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
     */
    user?: pulumi.Input<string>;
}
