// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        ///     var current = Snowflake.GetFunctions.Invoke(new()
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
        public static Task<GetFunctionsResult> InvokeAsync(GetFunctionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFunctionsResult>("snowflake:index/getFunctions:getFunctions", args ?? new GetFunctionsArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetFunctions.Invoke(new()
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
        public static Output<GetFunctionsResult> Invoke(GetFunctionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFunctionsResult>("snowflake:index/getFunctions:getFunctions", args ?? new GetFunctionsInvokeArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetFunctions.Invoke(new()
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
        public static Output<GetFunctionsResult> Invoke(GetFunctionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFunctionsResult>("snowflake:index/getFunctions:getFunctions", args ?? new GetFunctionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFunctionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the functions from.
        /// </summary>
        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetFunctionsArgs()
        {
        }
        public static new GetFunctionsArgs Empty => new GetFunctionsArgs();
    }

    public sealed class GetFunctionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the functions from.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetFunctionsInvokeArgs()
        {
        }
        public static new GetFunctionsInvokeArgs Empty => new GetFunctionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFunctionsResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The functions in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFunctionsFunctionResult> Functions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The schema from which to return the functions from.
        /// </summary>
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
