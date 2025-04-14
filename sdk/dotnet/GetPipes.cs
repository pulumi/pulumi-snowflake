// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetPipes
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
        ///     var current = Snowflake.GetPipes.Invoke(new()
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
        public static Task<GetPipesResult> InvokeAsync(GetPipesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPipesResult>("snowflake:index/getPipes:getPipes", args ?? new GetPipesArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetPipes.Invoke(new()
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
        public static Output<GetPipesResult> Invoke(GetPipesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPipesResult>("snowflake:index/getPipes:getPipes", args ?? new GetPipesInvokeArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetPipes.Invoke(new()
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
        public static Output<GetPipesResult> Invoke(GetPipesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPipesResult>("snowflake:index/getPipes:getPipes", args ?? new GetPipesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPipesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the pipes from.
        /// </summary>
        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetPipesArgs()
        {
        }
        public static new GetPipesArgs Empty => new GetPipesArgs();
    }

    public sealed class GetPipesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the pipes from.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetPipesInvokeArgs()
        {
        }
        public static new GetPipesInvokeArgs Empty => new GetPipesInvokeArgs();
    }


    [OutputType]
    public sealed class GetPipesResult
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
        /// The pipes in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPipesPipeResult> Pipes;
        /// <summary>
        /// The schema from which to return the pipes from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetPipesResult(
            string database,

            string id,

            ImmutableArray<Outputs.GetPipesPipeResult> pipes,

            string schema)
        {
            Database = database;
            Id = id;
            Pipes = pipes;
            Schema = schema;
        }
    }
}
