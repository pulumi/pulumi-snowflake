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
    /// $ pulumi import snowflake:index/functionPython:FunctionPython example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;function_name&gt;"(varchar, varchar, varchar)'
    /// ```
    /// 
    /// Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
    /// 
    /// Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
    /// </summary>
    [SnowflakeResourceType("snowflake:index/functionPython:FunctionPython")]
    public partial class FunctionPython : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.FunctionPythonArgument>> Arguments { get; private set; } = null!;

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
        /// The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this function’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
        /// </summary>
        [Output("externalAccessIntegrations")]
        public Output<ImmutableArray<string>> ExternalAccessIntegrations { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `function_definition` value must be Python source code. For more information, see [Introduction to Python UDFs](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Output("functionDefinition")]
        public Output<string?> FunctionDefinition { get; private set; } = null!;

        /// <summary>
        /// Specifies language for the user. Used to detect external changes.
        /// </summary>
        [Output("functionLanguage")]
        public Output<string> FunctionLanguage { get; private set; } = null!;

        /// <summary>
        /// The name of the handler function or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a function name. If the handler code is in-line with the CREATE FUNCTION statement, you can use the function name alone. When the handler code is referenced at a stage, this value should be qualified with the module name, as in the following form: `my_module.my_function`. If the handler is for a tabular UDF, the HANDLER value should be the name of a handler class.
        /// </summary>
        [Output("handler")]
        public Output<string> Handler { get; private set; } = null!;

        /// <summary>
        /// The location (stage), path, and name of the file(s) to import. A file can be a `.py` file or another type of file. Python UDFs can also read non-Python files, such as text files. For an example, see [Reading a file](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-examples.html#label-udf-python-read-files). Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#python).
        /// </summary>
        [Output("imports")]
        public Output<ImmutableArray<Outputs.FunctionPythonImport>> Imports { get; private set; } = null!;

        /// <summary>
        /// Specifies that the function is an aggregate function. For more information about user-defined aggregate functions, see [Python user-defined aggregate functions](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-aggregate-functions). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("isAggregate")]
        public Output<string?> IsAggregate { get; private set; } = null!;

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
        /// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
        /// </summary>
        [Output("nullInputBehavior")]
        public Output<string?> NullInputBehavior { get; private set; } = null!;

        /// <summary>
        /// The name and version number of packages required as dependencies. The value should be of the form `package_name==version_number`.
        /// </summary>
        [Output("packages")]
        public Output<ImmutableArray<string>> Packages { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.FunctionPythonParameter>> Parameters { get; private set; } = null!;

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
        /// Specifies the Python version to use. The supported versions of Python are: 3.9, 3.10, and 3.11.
        /// </summary>
        [Output("runtimeVersion")]
        public Output<string> RuntimeVersion { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableArray<Outputs.FunctionPythonSecret>> Secrets { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW FUNCTION` for the given function.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.FunctionPythonShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Output("traceLevel")]
        public Output<string> TraceLevel { get; private set; } = null!;


        /// <summary>
        /// Create a FunctionPython resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FunctionPython(string name, FunctionPythonArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/functionPython:FunctionPython", name, args ?? new FunctionPythonArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FunctionPython(string name, Input<string> id, FunctionPythonState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/functionPython:FunctionPython", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FunctionPython resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FunctionPython Get(string name, Input<string> id, FunctionPythonState? state = null, CustomResourceOptions? options = null)
        {
            return new FunctionPython(name, id, state, options);
        }
    }

    public sealed class FunctionPythonArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.FunctionPythonArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.FunctionPythonArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionPythonArgumentArgs>());
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

        [Input("externalAccessIntegrations")]
        private InputList<string>? _externalAccessIntegrations;

        /// <summary>
        /// The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this function’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
        /// </summary>
        public InputList<string> ExternalAccessIntegrations
        {
            get => _externalAccessIntegrations ?? (_externalAccessIntegrations = new InputList<string>());
            set => _externalAccessIntegrations = value;
        }

        /// <summary>
        /// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `function_definition` value must be Python source code. For more information, see [Introduction to Python UDFs](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("functionDefinition")]
        public Input<string>? FunctionDefinition { get; set; }

        /// <summary>
        /// The name of the handler function or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a function name. If the handler code is in-line with the CREATE FUNCTION statement, you can use the function name alone. When the handler code is referenced at a stage, this value should be qualified with the module name, as in the following form: `my_module.my_function`. If the handler is for a tabular UDF, the HANDLER value should be the name of a handler class.
        /// </summary>
        [Input("handler", required: true)]
        public Input<string> Handler { get; set; } = null!;

        [Input("imports")]
        private InputList<Inputs.FunctionPythonImportArgs>? _imports;

        /// <summary>
        /// The location (stage), path, and name of the file(s) to import. A file can be a `.py` file or another type of file. Python UDFs can also read non-Python files, such as text files. For an example, see [Reading a file](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-examples.html#label-udf-python-read-files). Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#python).
        /// </summary>
        public InputList<Inputs.FunctionPythonImportArgs> Imports
        {
            get => _imports ?? (_imports = new InputList<Inputs.FunctionPythonImportArgs>());
            set => _imports = value;
        }

        /// <summary>
        /// Specifies that the function is an aggregate function. For more information about user-defined aggregate functions, see [Python user-defined aggregate functions](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-aggregate-functions). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("isAggregate")]
        public Input<string>? IsAggregate { get; set; }

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
        /// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// The name and version number of packages required as dependencies. The value should be of the form `package_name==version_number`.
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

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
        /// Specifies the Python version to use. The supported versions of Python are: 3.9, 3.10, and 3.11.
        /// </summary>
        [Input("runtimeVersion", required: true)]
        public Input<string> RuntimeVersion { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("secrets")]
        private InputList<Inputs.FunctionPythonSecretArgs>? _secrets;

        /// <summary>
        /// Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        public InputList<Inputs.FunctionPythonSecretArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.FunctionPythonSecretArgs>());
            set => _secrets = value;
        }

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public FunctionPythonArgs()
        {
        }
        public static new FunctionPythonArgs Empty => new FunctionPythonArgs();
    }

    public sealed class FunctionPythonState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.FunctionPythonArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.FunctionPythonArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionPythonArgumentGetArgs>());
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

        [Input("externalAccessIntegrations")]
        private InputList<string>? _externalAccessIntegrations;

        /// <summary>
        /// The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this function’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
        /// </summary>
        public InputList<string> ExternalAccessIntegrations
        {
            get => _externalAccessIntegrations ?? (_externalAccessIntegrations = new InputList<string>());
            set => _externalAccessIntegrations = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `function_definition` value must be Python source code. For more information, see [Introduction to Python UDFs](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("functionDefinition")]
        public Input<string>? FunctionDefinition { get; set; }

        /// <summary>
        /// Specifies language for the user. Used to detect external changes.
        /// </summary>
        [Input("functionLanguage")]
        public Input<string>? FunctionLanguage { get; set; }

        /// <summary>
        /// The name of the handler function or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a function name. If the handler code is in-line with the CREATE FUNCTION statement, you can use the function name alone. When the handler code is referenced at a stage, this value should be qualified with the module name, as in the following form: `my_module.my_function`. If the handler is for a tabular UDF, the HANDLER value should be the name of a handler class.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        [Input("imports")]
        private InputList<Inputs.FunctionPythonImportGetArgs>? _imports;

        /// <summary>
        /// The location (stage), path, and name of the file(s) to import. A file can be a `.py` file or another type of file. Python UDFs can also read non-Python files, such as text files. For an example, see [Reading a file](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-examples.html#label-udf-python-read-files). Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#python).
        /// </summary>
        public InputList<Inputs.FunctionPythonImportGetArgs> Imports
        {
            get => _imports ?? (_imports = new InputList<Inputs.FunctionPythonImportGetArgs>());
            set => _imports = value;
        }

        /// <summary>
        /// Specifies that the function is an aggregate function. For more information about user-defined aggregate functions, see [Python user-defined aggregate functions](https://docs.snowflake.com/en/developer-guide/udf/python/udf-python-aggregate-functions). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("isAggregate")]
        public Input<string>? IsAggregate { get; set; }

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
        /// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// The name and version number of packages required as dependencies. The value should be of the form `package_name==version_number`.
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        [Input("parameters")]
        private InputList<Inputs.FunctionPythonParameterGetArgs>? _parameters;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
        /// </summary>
        public InputList<Inputs.FunctionPythonParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.FunctionPythonParameterGetArgs>());
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
        /// Specifies the Python version to use. The supported versions of Python are: 3.9, 3.10, and 3.11.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("secrets")]
        private InputList<Inputs.FunctionPythonSecretGetArgs>? _secrets;

        /// <summary>
        /// Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        public InputList<Inputs.FunctionPythonSecretGetArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.FunctionPythonSecretGetArgs>());
            set => _secrets = value;
        }

        [Input("showOutputs")]
        private InputList<Inputs.FunctionPythonShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW FUNCTION` for the given function.
        /// </summary>
        public InputList<Inputs.FunctionPythonShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.FunctionPythonShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public FunctionPythonState()
        {
        }
        public static new FunctionPythonState Empty => new FunctionPythonState();
    }
}