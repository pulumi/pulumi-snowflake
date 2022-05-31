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
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var current = Output.Create(Snowflake.GetExternalFunctions.InvokeAsync(new Snowflake.GetExternalFunctionsArgs
        ///         {
        ///             Database = "MYDB",
        ///             Schema = "MYSCHEMA",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetExternalFunctionsResult> InvokeAsync(GetExternalFunctionsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetExternalFunctionsResult>("snowflake:index/getExternalFunctions:getExternalFunctions", args ?? new GetExternalFunctionsArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var current = Output.Create(Snowflake.GetExternalFunctions.InvokeAsync(new Snowflake.GetExternalFunctionsArgs
        ///         {
        ///             Database = "MYDB",
        ///             Schema = "MYSCHEMA",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetExternalFunctionsResult> Invoke(GetExternalFunctionsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetExternalFunctionsResult>("snowflake:index/getExternalFunctions:getExternalFunctions", args ?? new GetExternalFunctionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExternalFunctionsArgs : Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetExternalFunctionsArgs()
        {
        }
    }

    public sealed class GetExternalFunctionsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetExternalFunctionsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetExternalFunctionsResult
    {
        public readonly string Database;
        public readonly ImmutableArray<Outputs.GetExternalFunctionsExternalFunctionResult> ExternalFunctions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Schema;

        [OutputConstructor]
        private GetExternalFunctionsResult(
            string database,

            ImmutableArray<Outputs.GetExternalFunctionsExternalFunctionResult> externalFunctions,

            string id,

            string schema)
        {
            Database = database;
            ExternalFunctions = externalFunctions;
            Id = id;
            Schema = schema;
        }
    }
}
