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
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
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
        ///     var current = Snowflake.GetMaterializedViews.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Task<GetMaterializedViewsResult> InvokeAsync(GetMaterializedViewsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMaterializedViewsResult>("snowflake:index/getMaterializedViews:getMaterializedViews", args ?? new GetMaterializedViewsArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
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
        ///     var current = Snowflake.GetMaterializedViews.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Output<GetMaterializedViewsResult> Invoke(GetMaterializedViewsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaterializedViewsResult>("snowflake:index/getMaterializedViews:getMaterializedViews", args ?? new GetMaterializedViewsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
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
        ///     var current = Snowflake.GetMaterializedViews.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Output<GetMaterializedViewsResult> Invoke(GetMaterializedViewsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaterializedViewsResult>("snowflake:index/getMaterializedViews:getMaterializedViews", args ?? new GetMaterializedViewsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMaterializedViewsArgs : global::Pulumi.InvokeArgs
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
        public static new GetMaterializedViewsArgs Empty => new GetMaterializedViewsArgs();
    }

    public sealed class GetMaterializedViewsInvokeArgs : global::Pulumi.InvokeArgs
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
        public static new GetMaterializedViewsInvokeArgs Empty => new GetMaterializedViewsInvokeArgs();
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
