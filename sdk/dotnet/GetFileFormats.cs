// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetFileFormats
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
        ///     var current = Snowflake.GetFileFormats.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFileFormatsResult> InvokeAsync(GetFileFormatsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFileFormatsResult>("snowflake:index/getFileFormats:getFileFormats", args ?? new GetFileFormatsArgs(), options.WithDefaults());

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
        ///     var current = Snowflake.GetFileFormats.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFileFormatsResult> Invoke(GetFileFormatsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFileFormatsResult>("snowflake:index/getFileFormats:getFileFormats", args ?? new GetFileFormatsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFileFormatsArgs : global::Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetFileFormatsArgs()
        {
        }
        public static new GetFileFormatsArgs Empty => new GetFileFormatsArgs();
    }

    public sealed class GetFileFormatsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetFileFormatsInvokeArgs()
        {
        }
        public static new GetFileFormatsInvokeArgs Empty => new GetFileFormatsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFileFormatsResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The file formats in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFileFormatsFileFormatResult> FileFormats;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The schema from which to return the file formats from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetFileFormatsResult(
            string database,

            ImmutableArray<Outputs.GetFileFormatsFileFormatResult> fileFormats,

            string id,

            string schema)
        {
            Database = database;
            FileFormats = fileFormats;
            Id = id;
            Schema = schema;
        }
    }
}
