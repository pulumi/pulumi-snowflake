// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetFunctions
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
        ///         var current = Output.Create(Snowflake.GetFunctions.InvokeAsync(new Snowflake.GetFunctionsArgs
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
        public static Task<GetFunctionsResult> InvokeAsync(GetFunctionsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFunctionsResult>("snowflake:index/getFunctions:getFunctions", args ?? new GetFunctionsArgs(), options.WithDefaults());

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
        ///         var current = Output.Create(Snowflake.GetFunctions.InvokeAsync(new Snowflake.GetFunctionsArgs
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
        public static Output<GetFunctionsResult> Invoke(GetFunctionsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetFunctionsResult>("snowflake:index/getFunctions:getFunctions", args ?? new GetFunctionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFunctionsArgs : Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetFunctionsArgs()
        {
        }
    }

    public sealed class GetFunctionsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetFunctionsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetFunctionsResult
    {
        public readonly string Database;
        public readonly ImmutableArray<Outputs.GetFunctionsFunctionResult> Functions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Schema;

        [OutputConstructor]
        private GetFunctionsResult(
            string database,

            ImmutableArray<Outputs.GetFunctionsFunctionResult> functions,

            string id,

            string schema)
        {
            Database = database;
            Functions = functions;
            Id = id;
            Schema = schema;
        }
    }
}
