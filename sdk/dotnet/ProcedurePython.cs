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
    /// $ pulumi import snowflake:index/procedurePython:ProcedurePython example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;function_name&gt;"(varchar, varchar, varchar)'
    /// ```
    /// 
    /// Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
    /// 
    /// Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
    /// </summary>
    [SnowflakeResourceType("snowflake:index/procedurePython:ProcedurePython")]
    public partial class ProcedurePython : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.ProcedurePythonArgument>> Arguments { get; private set; } = null!;

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
        /// The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this procedure’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
        /// </summary>
        [Output("externalAccessIntegrations")]
        public Output<ImmutableArray<string>> ExternalAccessIntegrations { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Use the name of the stored procedure’s function or method. This can differ depending on whether the code is in-line or referenced at a stage. When the code is in-line, you can specify just the function name. When the code is imported from a stage, specify the fully-qualified handler function name as `&lt;module_name&gt;.&lt;function_name&gt;`.
        /// </summary>
        [Output("handler")]
        public Output<string> Handler { get; private set; } = null!;

        /// <summary>
        /// The location (stage), path, and name of the file(s) to import. You must set the IMPORTS clause to include any files that your stored procedure depends on. If you are writing an in-line stored procedure, you can omit this clause, unless your code depends on classes defined outside the stored procedure or resource files. If your stored procedure’s code will be on a stage, you must also include a path to the module file your code is in. The IMPORTS definition cannot reference variables from arguments that are passed into the stored procedure. Each file in the IMPORTS clause must have a unique name, even if the files are in different subdirectories or different stages.
        /// </summary>
        [Output("imports")]
        public Output<ImmutableArray<Outputs.ProcedurePythonImport>> Imports { get; private set; } = null!;

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
        /// List of the names of packages deployed in Snowflake that should be included in the handler code’s execution environment. The Snowpark package is required for stored procedures, but is specified in the `snowpark_package` attribute. For more information about Snowpark, see [Snowpark API](https://docs.snowflake.com/en/developer-guide/snowpark/index).
        /// </summary>
        [Output("packages")]
        public Output<ImmutableArray<string>> Packages { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN PROCEDURE` for the given procedure.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.ProcedurePythonParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedure_definition` value must be Python source code. For more information, see [Python (using Snowpark)](https://docs.snowflake.com/en/developer-guide/stored-procedure/python/procedure-python-overview). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Output("procedureDefinition")]
        public Output<string?> ProcedureDefinition { get; private set; } = null!;

        /// <summary>
        /// Specifies language for the procedure. Used to detect external changes.
        /// </summary>
        [Output("procedureLanguage")]
        public Output<string> ProcedureLanguage { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of the result returned by the stored procedure. For `&lt;result_data_type&gt;`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL-Python Data Type Mappings](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-data-type-mapping.html#label-sql-python-data-type-mappings)). For `RETURNS TABLE ( [ col_name col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
        /// </summary>
        [Output("returnType")]
        public Output<string> ReturnType { get; private set; } = null!;

        /// <summary>
        /// The language runtime version to use. Currently, the supported versions are: 3.9, 3.10, and 3.11.
        /// </summary>
        [Output("runtimeVersion")]
        public Output<string> RuntimeVersion { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableArray<Outputs.ProcedurePythonSecret>> Secrets { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PROCEDURE` for the given procedure.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.ProcedurePythonShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// The Snowpark package is required for stored procedures, so it must always be present. For more information about Snowpark, see [Snowpark API](https://docs.snowflake.com/en/developer-guide/snowpark/index).
        /// </summary>
        [Output("snowparkPackage")]
        public Output<string> SnowparkPackage { get; private set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Output("traceLevel")]
        public Output<string> TraceLevel { get; private set; } = null!;


        /// <summary>
        /// Create a ProcedurePython resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProcedurePython(string name, ProcedurePythonArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/procedurePython:ProcedurePython", name, args ?? new ProcedurePythonArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProcedurePython(string name, Input<string> id, ProcedurePythonState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/procedurePython:ProcedurePython", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProcedurePython resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProcedurePython Get(string name, Input<string> id, ProcedurePythonState? state = null, CustomResourceOptions? options = null)
        {
            return new ProcedurePython(name, id, state, options);
        }
    }

    public sealed class ProcedurePythonArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.ProcedurePythonArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.ProcedurePythonArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.ProcedurePythonArgumentArgs>());
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

        [Input("externalAccessIntegrations")]
        private InputList<string>? _externalAccessIntegrations;

        /// <summary>
        /// The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this procedure’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
        /// </summary>
        public InputList<string> ExternalAccessIntegrations
        {
            get => _externalAccessIntegrations ?? (_externalAccessIntegrations = new InputList<string>());
            set => _externalAccessIntegrations = value;
        }

        /// <summary>
        /// Use the name of the stored procedure’s function or method. This can differ depending on whether the code is in-line or referenced at a stage. When the code is in-line, you can specify just the function name. When the code is imported from a stage, specify the fully-qualified handler function name as `&lt;module_name&gt;.&lt;function_name&gt;`.
        /// </summary>
        [Input("handler", required: true)]
        public Input<string> Handler { get; set; } = null!;

        [Input("imports")]
        private InputList<Inputs.ProcedurePythonImportArgs>? _imports;

        /// <summary>
        /// The location (stage), path, and name of the file(s) to import. You must set the IMPORTS clause to include any files that your stored procedure depends on. If you are writing an in-line stored procedure, you can omit this clause, unless your code depends on classes defined outside the stored procedure or resource files. If your stored procedure’s code will be on a stage, you must also include a path to the module file your code is in. The IMPORTS definition cannot reference variables from arguments that are passed into the stored procedure. Each file in the IMPORTS clause must have a unique name, even if the files are in different subdirectories or different stages.
        /// </summary>
        public InputList<Inputs.ProcedurePythonImportArgs> Imports
        {
            get => _imports ?? (_imports = new InputList<Inputs.ProcedurePythonImportArgs>());
            set => _imports = value;
        }

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

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of the names of packages deployed in Snowflake that should be included in the handler code’s execution environment. The Snowpark package is required for stored procedures, but is specified in the `snowpark_package` attribute. For more information about Snowpark, see [Snowpark API](https://docs.snowflake.com/en/developer-guide/snowpark/index).
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        /// <summary>
        /// Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedure_definition` value must be Python source code. For more information, see [Python (using Snowpark)](https://docs.snowflake.com/en/developer-guide/stored-procedure/python/procedure-python-overview). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("procedureDefinition")]
        public Input<string>? ProcedureDefinition { get; set; }

        /// <summary>
        /// Specifies the type of the result returned by the stored procedure. For `&lt;result_data_type&gt;`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL-Python Data Type Mappings](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-data-type-mapping.html#label-sql-python-data-type-mappings)). For `RETURNS TABLE ( [ col_name col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
        /// </summary>
        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// The language runtime version to use. Currently, the supported versions are: 3.9, 3.10, and 3.11.
        /// </summary>
        [Input("runtimeVersion", required: true)]
        public Input<string> RuntimeVersion { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("secrets")]
        private InputList<Inputs.ProcedurePythonSecretArgs>? _secrets;

        /// <summary>
        /// Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        public InputList<Inputs.ProcedurePythonSecretArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.ProcedurePythonSecretArgs>());
            set => _secrets = value;
        }

        /// <summary>
        /// The Snowpark package is required for stored procedures, so it must always be present. For more information about Snowpark, see [Snowpark API](https://docs.snowflake.com/en/developer-guide/snowpark/index).
        /// </summary>
        [Input("snowparkPackage", required: true)]
        public Input<string> SnowparkPackage { get; set; } = null!;

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public ProcedurePythonArgs()
        {
        }
        public static new ProcedurePythonArgs Empty => new ProcedurePythonArgs();
    }

    public sealed class ProcedurePythonState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.ProcedurePythonArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the procedure. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#all-languages) for more details.
        /// </summary>
        public InputList<Inputs.ProcedurePythonArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.ProcedurePythonArgumentGetArgs>());
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

        [Input("externalAccessIntegrations")]
        private InputList<string>? _externalAccessIntegrations;

        /// <summary>
        /// The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this procedure’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
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
        /// Use the name of the stored procedure’s function or method. This can differ depending on whether the code is in-line or referenced at a stage. When the code is in-line, you can specify just the function name. When the code is imported from a stage, specify the fully-qualified handler function name as `&lt;module_name&gt;.&lt;function_name&gt;`.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        [Input("imports")]
        private InputList<Inputs.ProcedurePythonImportGetArgs>? _imports;

        /// <summary>
        /// The location (stage), path, and name of the file(s) to import. You must set the IMPORTS clause to include any files that your stored procedure depends on. If you are writing an in-line stored procedure, you can omit this clause, unless your code depends on classes defined outside the stored procedure or resource files. If your stored procedure’s code will be on a stage, you must also include a path to the module file your code is in. The IMPORTS definition cannot reference variables from arguments that are passed into the stored procedure. Each file in the IMPORTS clause must have a unique name, even if the files are in different subdirectories or different stages.
        /// </summary>
        public InputList<Inputs.ProcedurePythonImportGetArgs> Imports
        {
            get => _imports ?? (_imports = new InputList<Inputs.ProcedurePythonImportGetArgs>());
            set => _imports = value;
        }

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

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of the names of packages deployed in Snowflake that should be included in the handler code’s execution environment. The Snowpark package is required for stored procedures, but is specified in the `snowpark_package` attribute. For more information about Snowpark, see [Snowpark API](https://docs.snowflake.com/en/developer-guide/snowpark/index).
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        [Input("parameters")]
        private InputList<Inputs.ProcedurePythonParameterGetArgs>? _parameters;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN PROCEDURE` for the given procedure.
        /// </summary>
        public InputList<Inputs.ProcedurePythonParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ProcedurePythonParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Defines the code executed by the stored procedure. The definition can consist of any valid code. Wrapping `$$` signs are added by the provider automatically; do not include them. The `procedure_definition` value must be Python source code. For more information, see [Python (using Snowpark)](https://docs.snowflake.com/en/developer-guide/stored-procedure/python/procedure-python-overview). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("procedureDefinition")]
        public Input<string>? ProcedureDefinition { get; set; }

        /// <summary>
        /// Specifies language for the procedure. Used to detect external changes.
        /// </summary>
        [Input("procedureLanguage")]
        public Input<string>? ProcedureLanguage { get; set; }

        /// <summary>
        /// Specifies the type of the result returned by the stored procedure. For `&lt;result_data_type&gt;`, use the Snowflake data type that corresponds to the type of the language that you are using (see [SQL-Python Data Type Mappings](https://docs.snowflake.com/en/developer-guide/udf-stored-procedure-data-type-mapping.html#label-sql-python-data-type-mappings)). For `RETURNS TABLE ( [ col_name col_data_type [ , ... ] ] )`, if you know the Snowflake data types of the columns in the returned table, specify the column names and types. Otherwise (e.g. if you are determining the column types during run time), you can omit the column names and types (i.e. `TABLE ()`).
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        /// <summary>
        /// The language runtime version to use. Currently, the supported versions are: 3.9, 3.10, and 3.11.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The schema in which to create the procedure. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("secrets")]
        private InputList<Inputs.ProcedurePythonSecretGetArgs>? _secrets;

        /// <summary>
        /// Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        public InputList<Inputs.ProcedurePythonSecretGetArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.ProcedurePythonSecretGetArgs>());
            set => _secrets = value;
        }

        [Input("showOutputs")]
        private InputList<Inputs.ProcedurePythonShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW PROCEDURE` for the given procedure.
        /// </summary>
        public InputList<Inputs.ProcedurePythonShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.ProcedurePythonShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        /// <summary>
        /// The Snowpark package is required for stored procedures, so it must always be present. For more information about Snowpark, see [Snowpark API](https://docs.snowflake.com/en/developer-guide/snowpark/index).
        /// </summary>
        [Input("snowparkPackage")]
        public Input<string>? SnowparkPackage { get; set; }

        /// <summary>
        /// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        public ProcedurePythonState()
        {
        }
        public static new ProcedurePythonState Empty => new ProcedurePythonState();
    }
}
