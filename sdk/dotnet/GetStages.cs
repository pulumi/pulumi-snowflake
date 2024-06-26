// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetStages
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
        ///     var current = Snowflake.GetStages.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetStagesResult> InvokeAsync(GetStagesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStagesResult>("snowflake:index/getStages:getStages", args ?? new GetStagesArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetStages.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStagesResult> Invoke(GetStagesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStagesResult>("snowflake:index/getStages:getStages", args ?? new GetStagesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStagesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the stages from.
        /// </summary>
        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetStagesArgs()
        {
        }
        public static new GetStagesArgs Empty => new GetStagesArgs();
    }

    public sealed class GetStagesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the stages from.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetStagesInvokeArgs()
        {
        }
        public static new GetStagesInvokeArgs Empty => new GetStagesInvokeArgs();
    }


    [OutputType]
    public sealed class GetStagesResult
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
        /// The schema from which to return the stages from.
        /// </summary>
        public readonly string Schema;
        /// <summary>
        /// The stages in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStagesStageResult> Stages;

        [OutputConstructor]
        private GetStagesResult(
            string database,

            string id,

            string schema,

            ImmutableArray<Outputs.GetStagesStageResult> stages)
        {
            Database = database;
            Id = id;
            Schema = schema;
            Stages = stages;
        }
    }
}
