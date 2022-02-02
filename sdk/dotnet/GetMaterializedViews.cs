// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetMaterializedViews
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
        ///         var current = Output.Create(Snowflake.GetMaterializedViews.InvokeAsync(new Snowflake.GetMaterializedViewsArgs
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
        public static Task<GetMaterializedViewsResult> InvokeAsync(GetMaterializedViewsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMaterializedViewsResult>("snowflake:index/getMaterializedViews:getMaterializedViews", args ?? new GetMaterializedViewsArgs(), options.WithDefaults());

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
        ///         var current = Output.Create(Snowflake.GetMaterializedViews.InvokeAsync(new Snowflake.GetMaterializedViewsArgs
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
        public static Output<GetMaterializedViewsResult> Invoke(GetMaterializedViewsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetMaterializedViewsResult>("snowflake:index/getMaterializedViews:getMaterializedViews", args ?? new GetMaterializedViewsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMaterializedViewsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the views from.
        /// </summary>
        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetMaterializedViewsArgs()
        {
        }
    }

    public sealed class GetMaterializedViewsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the views from.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetMaterializedViewsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetMaterializedViewsResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The views in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMaterializedViewsMaterializedViewResult> MaterializedViews;
        /// <summary>
        /// The schema from which to return the views from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetMaterializedViewsResult(
            string database,

            string id,

            ImmutableArray<Outputs.GetMaterializedViewsMaterializedViewResult> materializedViews,

            string schema)
        {
            Database = database;
            Id = id;
            MaterializedViews = materializedViews;
            Schema = schema;
        }
    }
}
