// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetProcedures
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetProcedures.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetProceduresResult> InvokeAsync(GetProceduresArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProceduresResult>("snowflake:index/getProcedures:getProcedures", args ?? new GetProceduresArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetProcedures.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetProceduresResult> Invoke(GetProceduresInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProceduresResult>("snowflake:index/getProcedures:getProcedures", args ?? new GetProceduresInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProceduresArgs : global::Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetProceduresArgs()
        {
        }
        public static new GetProceduresArgs Empty => new GetProceduresArgs();
    }

    public sealed class GetProceduresInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetProceduresInvokeArgs()
        {
        }
        public static new GetProceduresInvokeArgs Empty => new GetProceduresInvokeArgs();
    }


    [OutputType]
    public sealed class GetProceduresResult
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
        /// The procedures in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProceduresProcedureResult> Procedures;
        /// <summary>
        /// The schema from which to return the procedures from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetProceduresResult(
            string database,

            string id,

            ImmutableArray<Outputs.GetProceduresProcedureResult> procedures,

            string schema)
        {
            Database = database;
            Id = id;
            Procedures = procedures;
            Schema = schema;
        }
    }
}
