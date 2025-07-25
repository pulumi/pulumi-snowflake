// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/functionSql:FunctionSql example '"<database_name>"."<schema_name>"."<function_name>"(varchar, varchar, varchar)'
 * ```
 *
 * Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
 *
 * Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
 */
export class FunctionSql extends pulumi.CustomResource {
    /**
     * Get an existing FunctionSql resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionSqlState, opts?: pulumi.CustomResourceOptions): FunctionSql {
        return new FunctionSql(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/functionSql:FunctionSql';

    /**
     * Returns true if the given object is an instance of FunctionSql.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FunctionSql {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FunctionSql.__pulumiType;
    }

    /**
     * List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
     */
    public readonly arguments!: pulumi.Output<outputs.FunctionSqlArgument[] | undefined>;
    /**
     * (Default: `user-defined function`) Specifies a comment for the function.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    public readonly enableConsoleOutput!: pulumi.Output<boolean>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be SQL source code. For more information, see [Introduction to SQL UDFs](https://docs.snowflake.com/en/developer-guide/udf/sql/udf-sql-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    public readonly functionDefinition!: pulumi.Output<string>;
    /**
     * Specifies language for the user. Used to detect external changes.
     */
    public /*out*/ readonly functionLanguage!: pulumi.Output<string>;
    public readonly isSecure!: pulumi.Output<string | undefined>;
    /**
     * LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
     */
    public readonly logLevel!: pulumi.Output<string>;
    /**
     * METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
     */
    public readonly metricLevel!: pulumi.Output<string>;
    /**
     * The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
     */
    public /*out*/ readonly parameters!: pulumi.Output<outputs.FunctionSqlParameter[]>;
    /**
     * Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
     */
    public readonly returnResultsBehavior!: pulumi.Output<string | undefined>;
    /**
     * Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
     */
    public readonly returnType!: pulumi.Output<string>;
    /**
     * The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW FUNCTION` for the given function.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.FunctionSqlShowOutput[]>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    public readonly traceLevel!: pulumi.Output<string>;

    /**
     * Create a FunctionSql resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionSqlArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionSqlArgs | FunctionSqlState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionSqlState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["enableConsoleOutput"] = state ? state.enableConsoleOutput : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["functionDefinition"] = state ? state.functionDefinition : undefined;
            resourceInputs["functionLanguage"] = state ? state.functionLanguage : undefined;
            resourceInputs["isSecure"] = state ? state.isSecure : undefined;
            resourceInputs["logLevel"] = state ? state.logLevel : undefined;
            resourceInputs["metricLevel"] = state ? state.metricLevel : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["returnResultsBehavior"] = state ? state.returnResultsBehavior : undefined;
            resourceInputs["returnType"] = state ? state.returnType : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["traceLevel"] = state ? state.traceLevel : undefined;
        } else {
            const args = argsOrState as FunctionSqlArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.functionDefinition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionDefinition'");
            }
            if ((!args || args.returnType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'returnType'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["arguments"] = args ? args.arguments : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["enableConsoleOutput"] = args ? args.enableConsoleOutput : undefined;
            resourceInputs["functionDefinition"] = args ? args.functionDefinition : undefined;
            resourceInputs["isSecure"] = args ? args.isSecure : undefined;
            resourceInputs["logLevel"] = args ? args.logLevel : undefined;
            resourceInputs["metricLevel"] = args ? args.metricLevel : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["returnResultsBehavior"] = args ? args.returnResultsBehavior : undefined;
            resourceInputs["returnType"] = args ? args.returnType : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["traceLevel"] = args ? args.traceLevel : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["functionLanguage"] = undefined /*out*/;
            resourceInputs["parameters"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FunctionSql.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FunctionSql resources.
 */
export interface FunctionSqlState {
    /**
     * List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.FunctionSqlArgument>[]>;
    /**
     * (Default: `user-defined function`) Specifies a comment for the function.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database?: pulumi.Input<string>;
    /**
     * Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be SQL source code. For more information, see [Introduction to SQL UDFs](https://docs.snowflake.com/en/developer-guide/udf/sql/udf-sql-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    functionDefinition?: pulumi.Input<string>;
    /**
     * Specifies language for the user. Used to detect external changes.
     */
    functionLanguage?: pulumi.Input<string>;
    isSecure?: pulumi.Input<string>;
    /**
     * LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
     */
    metricLevel?: pulumi.Input<string>;
    /**
     * The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.FunctionSqlParameter>[]>;
    /**
     * Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
     */
    returnResultsBehavior?: pulumi.Input<string>;
    /**
     * Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
     */
    returnType?: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW FUNCTION` for the given function.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.FunctionSqlShowOutput>[]>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    traceLevel?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FunctionSql resource.
 */
export interface FunctionSqlArgs {
    /**
     * List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.FunctionSqlArgument>[]>;
    /**
     * (Default: `user-defined function`) Specifies a comment for the function.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database: pulumi.Input<string>;
    /**
     * Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be SQL source code. For more information, see [Introduction to SQL UDFs](https://docs.snowflake.com/en/developer-guide/udf/sql/udf-sql-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    functionDefinition: pulumi.Input<string>;
    isSecure?: pulumi.Input<string>;
    /**
     * LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
     */
    metricLevel?: pulumi.Input<string>;
    /**
     * The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
     */
    returnResultsBehavior?: pulumi.Input<string>;
    /**
     * Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
     */
    returnType: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema: pulumi.Input<string>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    traceLevel?: pulumi.Input<string>;
}
