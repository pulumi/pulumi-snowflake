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
 * $ pulumi import snowflake:index/procedureSql:ProcedureSql example '"<database_name>"."<schema_name>"."<function_name>"(varchar, varchar, varchar)'
 * ```
 *
 * Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
 *
 * Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
 */
export class ProcedureSql extends pulumi.CustomResource {
    /**
     * Get an existing ProcedureSql resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProcedureSqlState, opts?: pulumi.CustomResourceOptions): ProcedureSql {
        return new ProcedureSql(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/procedureSql:ProcedureSql';

    /**
     * Returns true if the given object is an instance of ProcedureSql.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProcedureSql {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProcedureSql.__pulumiType;
    }

    /**
     * List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
     */
    public readonly arguments!: pulumi.Output<outputs.ProcedureSqlArgument[] | undefined>;
    /**
     * (Default: `user-defined procedure`) Specifies a comment for the procedure.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    public readonly enableConsoleOutput!: pulumi.Output<boolean>;
    /**
     * Specifies whether the stored procedure executes with the privileges of the owner (an “owner’s rights” stored procedure) or with the privileges of the caller (a “caller’s rights” stored procedure). If you execute the statement CREATE PROCEDURE … EXECUTE AS CALLER, then in the future the procedure will execute as a caller’s rights procedure. If you execute CREATE PROCEDURE … EXECUTE AS OWNER, then the procedure will execute as an owner’s rights procedure. For more information, see [Understanding caller’s rights and owner’s rights stored procedures](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights). Valid values are (case-insensitive): `CALLER` | `OWNER`.
     */
    public readonly executeAs!: pulumi.Output<string | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies that the procedure is secure. For more information about secure procedures, see [Protecting Sensitive Information with Secure UDFs and Stored Procedures](https://docs.snowflake.com/en/developer-guide/secure-udf-procedure). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
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
     * The name of the procedure; the identifier does not need to be unique for the schema in which the procedure is created because stored procedures are [identified and resolved by the combination of the name and argument types](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-naming-conventions.html#label-procedure-function-name-overloading). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the behavior of the procedure when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
     */
    public readonly nullInputBehavior!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN PROCEDURE` for the given procedure.
     */
    public /*out*/ readonly parameters!: pulumi.Output<outputs.ProcedureSqlParameter[]>;
    /**
     * Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedureDefinition` value must be SQL source code. For more information, see [Snowflake Scripting](https://docs.snowflake.com/en/developer-guide/snowflake-scripting/index). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    public readonly procedureDefinition!: pulumi.Output<string>;
    /**
     * Specifies language for the procedure. Used to detect external changes.
     */
    public /*out*/ readonly procedureLanguage!: pulumi.Output<string>;
    /**
     * Specifies the type of the result returned by the stored procedure. For `<result_data_type>`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL data type](https://docs.snowflake.com/en/sql-reference-data-types)). For `RETURNS TABLE ( [ colName col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
     */
    public readonly returnType!: pulumi.Output<string>;
    /**
     * The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW PROCEDURE` for the given procedure.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.ProcedureSqlShowOutput[]>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    public readonly traceLevel!: pulumi.Output<string>;

    /**
     * Create a ProcedureSql resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProcedureSqlArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProcedureSqlArgs | ProcedureSqlState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProcedureSqlState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["enableConsoleOutput"] = state ? state.enableConsoleOutput : undefined;
            resourceInputs["executeAs"] = state ? state.executeAs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["isSecure"] = state ? state.isSecure : undefined;
            resourceInputs["logLevel"] = state ? state.logLevel : undefined;
            resourceInputs["metricLevel"] = state ? state.metricLevel : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nullInputBehavior"] = state ? state.nullInputBehavior : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["procedureDefinition"] = state ? state.procedureDefinition : undefined;
            resourceInputs["procedureLanguage"] = state ? state.procedureLanguage : undefined;
            resourceInputs["returnType"] = state ? state.returnType : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["traceLevel"] = state ? state.traceLevel : undefined;
        } else {
            const args = argsOrState as ProcedureSqlArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.procedureDefinition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'procedureDefinition'");
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
            resourceInputs["executeAs"] = args ? args.executeAs : undefined;
            resourceInputs["isSecure"] = args ? args.isSecure : undefined;
            resourceInputs["logLevel"] = args ? args.logLevel : undefined;
            resourceInputs["metricLevel"] = args ? args.metricLevel : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nullInputBehavior"] = args ? args.nullInputBehavior : undefined;
            resourceInputs["procedureDefinition"] = args ? args.procedureDefinition : undefined;
            resourceInputs["returnType"] = args ? args.returnType : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["traceLevel"] = args ? args.traceLevel : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["parameters"] = undefined /*out*/;
            resourceInputs["procedureLanguage"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProcedureSql.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProcedureSql resources.
 */
export interface ProcedureSqlState {
    /**
     * List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.ProcedureSqlArgument>[]>;
    /**
     * (Default: `user-defined procedure`) Specifies a comment for the procedure.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database?: pulumi.Input<string>;
    /**
     * Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * Specifies whether the stored procedure executes with the privileges of the owner (an “owner’s rights” stored procedure) or with the privileges of the caller (a “caller’s rights” stored procedure). If you execute the statement CREATE PROCEDURE … EXECUTE AS CALLER, then in the future the procedure will execute as a caller’s rights procedure. If you execute CREATE PROCEDURE … EXECUTE AS OWNER, then the procedure will execute as an owner’s rights procedure. For more information, see [Understanding caller’s rights and owner’s rights stored procedures](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights). Valid values are (case-insensitive): `CALLER` | `OWNER`.
     */
    executeAs?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies that the procedure is secure. For more information about secure procedures, see [Protecting Sensitive Information with Secure UDFs and Stored Procedures](https://docs.snowflake.com/en/developer-guide/secure-udf-procedure). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
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
     * The name of the procedure; the identifier does not need to be unique for the schema in which the procedure is created because stored procedures are [identified and resolved by the combination of the name and argument types](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-naming-conventions.html#label-procedure-function-name-overloading). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the procedure when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN PROCEDURE` for the given procedure.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.ProcedureSqlParameter>[]>;
    /**
     * Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedureDefinition` value must be SQL source code. For more information, see [Snowflake Scripting](https://docs.snowflake.com/en/developer-guide/snowflake-scripting/index). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    procedureDefinition?: pulumi.Input<string>;
    /**
     * Specifies language for the procedure. Used to detect external changes.
     */
    procedureLanguage?: pulumi.Input<string>;
    /**
     * Specifies the type of the result returned by the stored procedure. For `<result_data_type>`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL data type](https://docs.snowflake.com/en/sql-reference-data-types)). For `RETURNS TABLE ( [ colName col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
     */
    returnType?: pulumi.Input<string>;
    /**
     * The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW PROCEDURE` for the given procedure.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.ProcedureSqlShowOutput>[]>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    traceLevel?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProcedureSql resource.
 */
export interface ProcedureSqlArgs {
    /**
     * List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.ProcedureSqlArgument>[]>;
    /**
     * (Default: `user-defined procedure`) Specifies a comment for the procedure.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database: pulumi.Input<string>;
    /**
     * Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * Specifies whether the stored procedure executes with the privileges of the owner (an “owner’s rights” stored procedure) or with the privileges of the caller (a “caller’s rights” stored procedure). If you execute the statement CREATE PROCEDURE … EXECUTE AS CALLER, then in the future the procedure will execute as a caller’s rights procedure. If you execute CREATE PROCEDURE … EXECUTE AS OWNER, then the procedure will execute as an owner’s rights procedure. For more information, see [Understanding caller’s rights and owner’s rights stored procedures](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights). Valid values are (case-insensitive): `CALLER` | `OWNER`.
     */
    executeAs?: pulumi.Input<string>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies that the procedure is secure. For more information about secure procedures, see [Protecting Sensitive Information with Secure UDFs and Stored Procedures](https://docs.snowflake.com/en/developer-guide/secure-udf-procedure). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
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
     * The name of the procedure; the identifier does not need to be unique for the schema in which the procedure is created because stored procedures are [identified and resolved by the combination of the name and argument types](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-naming-conventions.html#label-procedure-function-name-overloading). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the procedure when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedureDefinition` value must be SQL source code. For more information, see [Snowflake Scripting](https://docs.snowflake.com/en/developer-guide/snowflake-scripting/index). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    procedureDefinition: pulumi.Input<string>;
    /**
     * Specifies the type of the result returned by the stored procedure. For `<result_data_type>`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL data type](https://docs.snowflake.com/en/sql-reference-data-types)). For `RETURNS TABLE ( [ colName col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
     */
    returnType: pulumi.Input<string>;
    /**
     * The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema: pulumi.Input<string>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    traceLevel?: pulumi.Input<string>;
}
