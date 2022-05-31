// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetTables
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
        ///         var current = Output.Create(Snowflake.GetTables.InvokeAsync(new Snowflake.GetTablesArgs
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
        public static Task<GetTablesResult> InvokeAsync(GetTablesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTablesResult>("snowflake:index/getTables:getTables", args ?? new GetTablesArgs(), options.WithDefaults());

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
        ///         var current = Output.Create(Snowflake.GetTables.InvokeAsync(new Snowflake.GetTablesArgs
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
        public static Output<GetTablesResult> Invoke(GetTablesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTablesResult>("snowflake:index/getTables:getTables", args ?? new GetTablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTablesArgs : Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetTablesArgs()
        {
        }
    }

    public sealed class GetTablesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetTablesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTablesResult
    {
        public readonly string Database;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Schema;
        public readonly ImmutableArray<Outputs.GetTablesTableResult> Tables;

        [OutputConstructor]
        private GetTablesResult(
            string database,

            string id,

            string schema,

            ImmutableArray<Outputs.GetTablesTableResult> tables)
        {
            Database = database;
            Id = id;
            Schema = schema;
            Tables = tables;
        }
    }
}
