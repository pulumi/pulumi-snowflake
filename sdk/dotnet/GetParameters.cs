// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetParameters
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var d = new Snowflake.Database("d", new()
        ///     {
        ///         Name = "TEST_DB",
        ///     });
        /// 
        ///     // read all object parameters in database TEST_DB
        ///     var p = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "OBJECT",
        ///         ObjectType = "DATABASE",
        ///         ObjectName = d.Name,
        ///     });
        /// 
        ///     // read all account parameters with the pattern '%TIMESTAMP%'
        ///     var p2 = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "ACCOUNT",
        ///         Pattern = "%TIMESTAMP%",
        ///     });
        /// 
        ///     // read the exact session parameter ROWS_PER_RESULTSET
        ///     var p3 = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "SESSION",
        ///         Pattern = "ROWS_PER_RESULTSET",
        ///         User = "TEST_USER",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetParametersResult> InvokeAsync(GetParametersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetParametersResult>("snowflake:index/getParameters:getParameters", args ?? new GetParametersArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var d = new Snowflake.Database("d", new()
        ///     {
        ///         Name = "TEST_DB",
        ///     });
        /// 
        ///     // read all object parameters in database TEST_DB
        ///     var p = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "OBJECT",
        ///         ObjectType = "DATABASE",
        ///         ObjectName = d.Name,
        ///     });
        /// 
        ///     // read all account parameters with the pattern '%TIMESTAMP%'
        ///     var p2 = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "ACCOUNT",
        ///         Pattern = "%TIMESTAMP%",
        ///     });
        /// 
        ///     // read the exact session parameter ROWS_PER_RESULTSET
        ///     var p3 = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "SESSION",
        ///         Pattern = "ROWS_PER_RESULTSET",
        ///         User = "TEST_USER",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetParametersResult> Invoke(GetParametersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetParametersResult>("snowflake:index/getParameters:getParameters", args ?? new GetParametersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var d = new Snowflake.Database("d", new()
        ///     {
        ///         Name = "TEST_DB",
        ///     });
        /// 
        ///     // read all object parameters in database TEST_DB
        ///     var p = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "OBJECT",
        ///         ObjectType = "DATABASE",
        ///         ObjectName = d.Name,
        ///     });
        /// 
        ///     // read all account parameters with the pattern '%TIMESTAMP%'
        ///     var p2 = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "ACCOUNT",
        ///         Pattern = "%TIMESTAMP%",
        ///     });
        /// 
        ///     // read the exact session parameter ROWS_PER_RESULTSET
        ///     var p3 = Snowflake.GetParameters.Invoke(new()
        ///     {
        ///         ParameterType = "SESSION",
        ///         Pattern = "ROWS_PER_RESULTSET",
        ///         User = "TEST_USER",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetParametersResult> Invoke(GetParametersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetParametersResult>("snowflake:index/getParameters:getParameters", args ?? new GetParametersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetParametersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
        /// </summary>
        [Input("objectName")]
        public string? ObjectName { get; set; }

        /// <summary>
        /// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
        /// </summary>
        [Input("objectType")]
        public string? ObjectType { get; set; }

        /// <summary>
        /// The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
        /// </summary>
        [Input("parameterType")]
        public string? ParameterType { get; set; }

        /// <summary>
        /// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
        /// </summary>
        [Input("pattern")]
        public string? Pattern { get; set; }

        /// <summary>
        /// If parameter_type is set to "SESSION" then user is the name of the user to display session parameters for.
        /// </summary>
        [Input("user")]
        public string? User { get; set; }

        public GetParametersArgs()
        {
        }
        public static new GetParametersArgs Empty => new GetParametersArgs();
    }

    public sealed class GetParametersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        /// <summary>
        /// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
        /// </summary>
        [Input("parameterType")]
        public Input<string>? ParameterType { get; set; }

        /// <summary>
        /// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// If parameter_type is set to "SESSION" then user is the name of the user to display session parameters for.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public GetParametersInvokeArgs()
        {
        }
        public static new GetParametersInvokeArgs Empty => new GetParametersInvokeArgs();
    }


    [OutputType]
    public sealed class GetParametersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
        /// </summary>
        public readonly string? ObjectName;
        /// <summary>
        /// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
        /// </summary>
        public readonly string? ObjectType;
        /// <summary>
        /// The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
        /// </summary>
        public readonly string? ParameterType;
        /// <summary>
        /// The pipes in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetParametersParameterResult> Parameters;
        /// <summary>
        /// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
        /// </summary>
        public readonly string? Pattern;
        /// <summary>
        /// If parameter_type is set to "SESSION" then user is the name of the user to display session parameters for.
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private GetParametersResult(
            string id,

            string? objectName,

            string? objectType,

            string? parameterType,

            ImmutableArray<Outputs.GetParametersParameterResult> parameters,

            string? pattern,

            string? user)
        {
            Id = id;
            ObjectName = objectName;
            ObjectType = objectType;
            ParameterType = parameterType;
            Parameters = parameters;
            Pattern = pattern;
            User = user;
        }
    }
}
