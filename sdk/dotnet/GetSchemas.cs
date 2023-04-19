// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetSchemas
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetSchemas.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSchemasResult> InvokeAsync(GetSchemasArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemasResult>("snowflake:index/getSchemas:getSchemas", args ?? new GetSchemasArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetSchemas.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSchemasResult> Invoke(GetSchemasInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemasResult>("snowflake:index/getSchemas:getSchemas", args ?? new GetSchemasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemasArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        public GetSchemasArgs()
        {
        }
        public static new GetSchemasArgs Empty => new GetSchemasArgs();
    }

    public sealed class GetSchemasInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        public GetSchemasInvokeArgs()
        {
        }
        public static new GetSchemasInvokeArgs Empty => new GetSchemasInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemasResult
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
        /// The schemas in the database
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSchemasSchemaResult> Schemas;

        [OutputConstructor]
        private GetSchemasResult(
            string database,

            string id,

            ImmutableArray<Outputs.GetSchemasSchemaResult> schemas)
        {
            Database = database;
            Id = id;
            Schemas = schemas;
        }
    }
}
