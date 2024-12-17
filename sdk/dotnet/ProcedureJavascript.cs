// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/procedureJavascript:ProcedureJavascript example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;function_name&gt;"(varchar, varchar, varchar)'
    /// ```
    /// 
    /// Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
    /// 
    /// Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
    /// </summary>
    [SnowflakeResourceType("snowflake:index/procedureJavascript:ProcedureJavascript")]
    public partial class ProcedureJavascript : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.ProcedureJavascriptArgument>> Arguments { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the procedure.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
        /// </summary>
        [Output("enableConsoleOutput")]
        public Output<bool> EnableConsoleOutput { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the stored procedure executes with the privileges of the owner (an “owner’s rights” stored procedure) or with the privileges of the caller (a “caller’s rights” stored procedure). If you execute the statement CREATE PROCEDURE … EXECUTE AS CALLER, then in the future the procedure will execute as a caller’s rights procedure. If you execute CREATE PROCEDURE … EXECUTE AS OWNER, then the procedure will execute as an owner’s rights procedure. For more information, see [Understanding caller’s rights and owner’s rights stored procedures](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights). Valid values are (case-insensitive): `CALLER` | `OWNER`.
        /// </summary>
        [Output("executeAs")]
        public Output<string?> ExecuteAs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies that the procedure is secure. For more information about secure procedures, see [Protecting Sensitive Information with Secure UDFs and Stored Procedures](https://docs.snowflake.com/en/developer-guide/secure-udf-procedure). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("isSecure")]
        public Output<string?> IsSecure { get; private set; } = null!;

        /// <summary>
        /// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
        /// </summary>
        [Output("logLevel")]
        public Output<string> LogLevel { get; private set; } = null!;

        /// <summary>
        /// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
        /// </summary>
        [Output("metricLevel")]
        public Output<string> MetricLevel { get; private set; } = null!;

        /// <summary>
        /// The name of the procedure; the identifier does not need to be unique for the schema in which the procedure is created because stored procedures are [identified and resolved by the combination of the name and argument types](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-naming-conventions.html#label-procedure-function-name-overloading). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the procedure when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
        /// </summary>
        [Output("nullInputBehavior")]
        public Output<string?> NullInputBehavior { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN PROCEDURE` for the given procedure.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.ProcedureJavascriptParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedure_definition` value must be JavaScript source code. For more information, see [JavaScript](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-javascript). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Output("procedureDefinition")]
        public Output<string> ProcedureDefinition { get; private set; } = null!;

        /// <summary>
        /// Specifies language for the procedure. Used to detect external changes.
        /// </summary>
        [Output("procedureLanguage")]
        public Output<string> ProcedureLanguage { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of the result returned by the stored procedure. For `&lt;result_data_type&gt;`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL and JavaScript data type mapping](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-javascript.html#label-stored-procedure-data-type-mapping)). For `RETURNS TABLE ( [ col_name col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
        /// </summary>
        [Output("returnType")]
        public Output<string> ReturnType { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PROCEDURE` for the given procedure.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.ProcedureJavascriptShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Output("traceLevel")]
        public Output<string> TraceLevel { get; private set; } = null!;


        /// <summary>
        /// Create a ProcedureJavascript resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProcedureJavascript(string name, ProcedureJavascriptArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/procedureJavascript:ProcedureJavascript", name, args ?? new ProcedureJavascriptArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProcedureJavascript(string name, Input<string> id, ProcedureJavascriptState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/procedureJavascript:ProcedureJavascript", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProcedureJavascript resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProcedureJavascript Get(string name, Input<string> id, ProcedureJavascriptState? state = null, CustomResourceOptions? options = null)
        {
            return new ProcedureJavascript(name, id, state, options);
        }
    }

    public sealed class ProcedureJavascriptArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.ProcedureJavascriptArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.ProcedureJavascriptArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.ProcedureJavascriptArgumentArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the procedure.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
        /// </summary>
        [Input("enableConsoleOutput")]
        public Input<bool>? EnableConsoleOutput { get; set; }

        /// <summary>
        /// Specifies whether the stored procedure executes with the privileges of the owner (an “owner’s rights” stored procedure) or with the privileges of the caller (a “caller’s rights” stored procedure). If you execute the statement CREATE PROCEDURE … EXECUTE AS CALLER, then in the future the procedure will execute as a caller’s rights procedure. If you execute CREATE PROCEDURE … EXECUTE AS OWNER, then the procedure will execute as an owner’s rights procedure. For more information, see [Understanding caller’s rights and owner’s rights stored procedures](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights). Valid values are (case-insensitive): `CALLER` | `OWNER`.
        /// </summary>
        [Input("executeAs")]
        public Input<string>? ExecuteAs { get; set; }

        /// <summary>
        /// Specifies that the procedure is secure. For more information about secure procedures, see [Protecting Sensitive Information with Secure UDFs and Stored Procedures](https://docs.snowflake.com/en/developer-guide/secure-udf-procedure). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("isSecure")]
        public Input<string>? IsSecure { get; set; }

        /// <summary>
        /// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
        /// </summary>
        [Input("metricLevel")]
        public Input<string>? MetricLevel { get; set; }

        /// <summary>
        /// The name of the procedure; the identifier does not need to be unique for the schema in which the procedure is created because stored procedures are [identified and resolved by the combination of the name and argument types](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-naming-conventions.html#label-procedure-function-name-overloading). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the procedure when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        /// <summary>
        /// Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedure_definition` value must be JavaScript source code. For more information, see [JavaScript](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-javascript). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("procedureDefinition", required: true)]
        public Input<string> ProcedureDefinition { get; set; } = null!;

        /// <summary>
        /// Specifies the type of the result returned by the stored procedure. For `&lt;result_data_type&gt;`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL and JavaScript data type mapping](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-javascript.html#label-stored-procedure-data-type-mapping)). For `RETURNS TABLE ( [ col_name col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
        /// </summary>
        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public ProcedureJavascriptArgs()
        {
        }
        public static new ProcedureJavascriptArgs Empty => new ProcedureJavascriptArgs();
    }

    public sealed class ProcedureJavascriptState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.ProcedureJavascriptArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.ProcedureJavascriptArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.ProcedureJavascriptArgumentGetArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the procedure.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
        /// </summary>
        [Input("enableConsoleOutput")]
        public Input<bool>? EnableConsoleOutput { get; set; }

        /// <summary>
        /// Specifies whether the stored procedure executes with the privileges of the owner (an “owner’s rights” stored procedure) or with the privileges of the caller (a “caller’s rights” stored procedure). If you execute the statement CREATE PROCEDURE … EXECUTE AS CALLER, then in the future the procedure will execute as a caller’s rights procedure. If you execute CREATE PROCEDURE … EXECUTE AS OWNER, then the procedure will execute as an owner’s rights procedure. For more information, see [Understanding caller’s rights and owner’s rights stored procedures](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights). Valid values are (case-insensitive): `CALLER` | `OWNER`.
        /// </summary>
        [Input("executeAs")]
        public Input<string>? ExecuteAs { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies that the procedure is secure. For more information about secure procedures, see [Protecting Sensitive Information with Secure UDFs and Stored Procedures](https://docs.snowflake.com/en/developer-guide/secure-udf-procedure). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("isSecure")]
        public Input<string>? IsSecure { get; set; }

        /// <summary>
        /// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
        /// </summary>
        [Input("metricLevel")]
        public Input<string>? MetricLevel { get; set; }

        /// <summary>
        /// The name of the procedure; the identifier does not need to be unique for the schema in which the procedure is created because stored procedures are [identified and resolved by the combination of the name and argument types](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-naming-conventions.html#label-procedure-function-name-overloading). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the procedure when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ProcedureJavascriptParameterGetArgs>? _parameters;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN PROCEDURE` for the given procedure.
        /// </summary>
        public InputList<Inputs.ProcedureJavascriptParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ProcedureJavascriptParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedure_definition` value must be JavaScript source code. For more information, see [JavaScript](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-javascript). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("procedureDefinition")]
        public Input<string>? ProcedureDefinition { get; set; }

        /// <summary>
        /// Specifies language for the procedure. Used to detect external changes.
        /// </summary>
        [Input("procedureLanguage")]
        public Input<string>? ProcedureLanguage { get; set; }

        /// <summary>
        /// Specifies the type of the result returned by the stored procedure. For `&lt;result_data_type&gt;`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL and JavaScript data type mapping](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-javascript.html#label-stored-procedure-data-type-mapping)). For `RETURNS TABLE ( [ col_name col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        /// <summary>
        /// The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.ProcedureJavascriptShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW PROCEDURE` for the given procedure.
        /// </summary>
        public InputList<Inputs.ProcedureJavascriptShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.ProcedureJavascriptShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public ProcedureJavascriptState()
        {
        }
        public static new ProcedureJavascriptState Empty => new ProcedureJavascriptState();
    }
}
