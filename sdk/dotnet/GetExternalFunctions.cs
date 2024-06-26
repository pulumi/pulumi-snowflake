// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetExternalFunctions
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
        ///     var current = Snowflake.GetExternalFunctions.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetExternalFunctionsResult> InvokeAsync(GetExternalFunctionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetExternalFunctionsResult>("snowflake:index/getExternalFunctions:getExternalFunctions", args ?? new GetExternalFunctionsArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetExternalFunctions.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetExternalFunctionsResult> Invoke(GetExternalFunctionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetExternalFunctionsResult>("snowflake:index/getExternalFunctions:getExternalFunctions", args ?? new GetExternalFunctionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExternalFunctionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database")]
        public string? Database { get; set; }

        /// <summary>
        /// The schema from which to return the external functions from.
        /// </summary>
        [Input("schema")]
        public string? Schema { get; set; }

        public GetExternalFunctionsArgs()
        {
        }
        public static new GetExternalFunctionsArgs Empty => new GetExternalFunctionsArgs();
    }

    public sealed class GetExternalFunctionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// The schema from which to return the external functions from.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public GetExternalFunctionsInvokeArgs()
        {
        }
        public static new GetExternalFunctionsInvokeArgs Empty => new GetExternalFunctionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetExternalFunctionsResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string? Database;
        /// <summary>
        /// The external functions in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetExternalFunctionsExternalFunctionResult> ExternalFunctions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The schema from which to return the external functions from.
        /// </summary>
        public readonly string? Schema;

        [OutputConstructor]
        private GetExternalFunctionsResult(
            string? database,

            ImmutableArray<Outputs.GetExternalFunctionsExternalFunctionResult> externalFunctions,

            string id,

            string? schema)
        {
            Database = database;
            ExternalFunctions = externalFunctions;
            Id = id;
            Schema = schema;
        }
    }
}
