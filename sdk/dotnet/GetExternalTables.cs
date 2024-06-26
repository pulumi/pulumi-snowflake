// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetExternalTables
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
        ///     var current = Snowflake.GetExternalTables.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetExternalTablesResult> InvokeAsync(GetExternalTablesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetExternalTablesResult>("snowflake:index/getExternalTables:getExternalTables", args ?? new GetExternalTablesArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetExternalTables.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetExternalTablesResult> Invoke(GetExternalTablesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetExternalTablesResult>("snowflake:index/getExternalTables:getExternalTables", args ?? new GetExternalTablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExternalTablesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the external tables from.
        /// </summary>
        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetExternalTablesArgs()
        {
        }
        public static new GetExternalTablesArgs Empty => new GetExternalTablesArgs();
    }

    public sealed class GetExternalTablesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the external tables from.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetExternalTablesInvokeArgs()
        {
        }
        public static new GetExternalTablesInvokeArgs Empty => new GetExternalTablesInvokeArgs();
    }


    [OutputType]
    public sealed class GetExternalTablesResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The external tables in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetExternalTablesExternalTableResult> ExternalTables;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The schema from which to return the external tables from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetExternalTablesResult(
            string database,

            ImmutableArray<Outputs.GetExternalTablesExternalTableResult> externalTables,

            string id,

            string schema)
        {
            Database = database;
            ExternalTables = externalTables;
            Id = id;
            Schema = schema;
        }
    }
}
