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
    /// $ pulumi import snowflake:index/functionSql:FunctionSql example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;function_name&gt;"(varchar, varchar, varchar)'
    /// ```
    /// 
    /// Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
    /// 
    /// Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
    /// </summary>
    [SnowflakeResourceType("snowflake:index/functionSql:FunctionSql")]
    public partial class FunctionSql : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.FunctionSqlArgument>> Arguments { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the function.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
        /// </summary>
        [Output("enableConsoleOutput")]
        public Output<bool> EnableConsoleOutput { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `function_definition` value must be SQL source code. For more information, see [Introduction to SQL UDFs](https://docs.snowflake.com/en/developer-guide/udf/sql/udf-sql-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Output("functionDefinition")]
        public Output<string> FunctionDefinition { get; private set; } = null!;

        /// <summary>
        /// Specifies language for the user. Used to detect external changes.
        /// </summary>
        [Output("functionLanguage")]
        public Output<string> FunctionLanguage { get; private set; } = null!;

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
        /// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.FunctionSqlParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
        /// </summary>
        [Output("returnResultsBehavior")]
        public Output<string?> ReturnResultsBehavior { get; private set; } = null!;

        /// <summary>
        /// Specifies the results returned by the UDF, which determines the UDF type. Use `&lt;result_data_type&gt;` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
        /// </summary>
        [Output("returnType")]
        public Output<string> ReturnType { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW FUNCTION` for the given function.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.FunctionSqlShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Output("traceLevel")]
        public Output<string> TraceLevel { get; private set; } = null!;


        /// <summary>
        /// Create a FunctionSql resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FunctionSql(string name, FunctionSqlArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/functionSql:FunctionSql", name, args ?? new FunctionSqlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FunctionSql(string name, Input<string> id, FunctionSqlState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/functionSql:FunctionSql", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FunctionSql resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FunctionSql Get(string name, Input<string> id, FunctionSqlState? state = null, CustomResourceOptions? options = null)
        {
            return new FunctionSql(name, id, state, options);
        }
    }

    public sealed class FunctionSqlArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.FunctionSqlArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.FunctionSqlArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionSqlArgumentArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the function.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
        /// </summary>
        [Input("enableConsoleOutput")]
        public Input<bool>? EnableConsoleOutput { get; set; }

        /// <summary>
        /// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `function_definition` value must be SQL source code. For more information, see [Introduction to SQL UDFs](https://docs.snowflake.com/en/developer-guide/udf/sql/udf-sql-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("functionDefinition", required: true)]
        public Input<string> FunctionDefinition { get; set; } = null!;

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
        /// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
        /// </summary>
        [Input("returnResultsBehavior")]
        public Input<string>? ReturnResultsBehavior { get; set; }

        /// <summary>
        /// Specifies the results returned by the UDF, which determines the UDF type. Use `&lt;result_data_type&gt;` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
        /// </summary>
        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public FunctionSqlArgs()
        {
        }
        public static new FunctionSqlArgs Empty => new FunctionSqlArgs();
    }

    public sealed class FunctionSqlState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.FunctionSqlArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.FunctionSqlArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionSqlArgumentGetArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the function.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
        /// </summary>
        [Input("enableConsoleOutput")]
        public Input<bool>? EnableConsoleOutput { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `function_definition` value must be SQL source code. For more information, see [Introduction to SQL UDFs](https://docs.snowflake.com/en/developer-guide/udf/sql/udf-sql-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("functionDefinition")]
        public Input<string>? FunctionDefinition { get; set; }

        /// <summary>
        /// Specifies language for the user. Used to detect external changes.
        /// </summary>
        [Input("functionLanguage")]
        public Input<string>? FunctionLanguage { get; set; }

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
        /// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputList<Inputs.FunctionSqlParameterGetArgs>? _parameters;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
        /// </summary>
        public InputList<Inputs.FunctionSqlParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.FunctionSqlParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
        /// </summary>
        [Input("returnResultsBehavior")]
        public Input<string>? ReturnResultsBehavior { get; set; }

        /// <summary>
        /// Specifies the results returned by the UDF, which determines the UDF type. Use `&lt;result_data_type&gt;` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        /// <summary>
        /// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.FunctionSqlShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW FUNCTION` for the given function.
        /// </summary>
        public InputList<Inputs.FunctionSqlShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.FunctionSqlShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public FunctionSqlState()
        {
        }
        public static new FunctionSqlState Empty => new FunctionSqlState();
    }
}