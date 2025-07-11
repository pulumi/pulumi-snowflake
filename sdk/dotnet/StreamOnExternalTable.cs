// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/streamOnExternalTable:StreamOnExternalTable example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;stream_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/streamOnExternalTable:StreamOnExternalTable")]
    public partial class StreamOnExternalTable : global::Pulumi.CustomResource
    {
        [Output("at")]
        public Output<Outputs.StreamOnExternalTableAt?> At { get; private set; } = null!;

        [Output("before")]
        public Output<Outputs.StreamOnExternalTableBefore?> Before { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("copyGrants")]
        public Output<bool?> CopyGrants { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE STREAM` for the given stream.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.StreamOnExternalTableDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
        /// </summary>
        [Output("externalTable")]
        public Output<string> ExternalTable { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an insert-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("insertOnly")]
        public Output<string?> InsertOnly { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW STREAMS` for the given stream.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.StreamOnExternalTableShowOutput>> ShowOutputs { get; private set; } = null!;

        [Output("stale")]
        public Output<bool> Stale { get; private set; } = null!;

        /// <summary>
        /// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Output("streamType")]
        public Output<string> StreamType { get; private set; } = null!;


        /// <summary>
        /// Create a StreamOnExternalTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StreamOnExternalTable(string name, StreamOnExternalTableArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/streamOnExternalTable:StreamOnExternalTable", name, args ?? new StreamOnExternalTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StreamOnExternalTable(string name, Input<string> id, StreamOnExternalTableState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/streamOnExternalTable:StreamOnExternalTable", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing StreamOnExternalTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StreamOnExternalTable Get(string name, Input<string> id, StreamOnExternalTableState? state = null, CustomResourceOptions? options = null)
        {
            return new StreamOnExternalTable(name, id, state, options);
        }
    }

    public sealed class StreamOnExternalTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("at")]
        public Input<Inputs.StreamOnExternalTableAtArgs>? At { get; set; }

        [Input("before")]
        public Input<Inputs.StreamOnExternalTableBeforeArgs>? Before { get; set; }

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("copyGrants")]
        public Input<bool>? CopyGrants { get; set; }

        /// <summary>
        /// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
        /// </summary>
        [Input("externalTable", required: true)]
        public Input<string> ExternalTable { get; set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an insert-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("insertOnly")]
        public Input<string>? InsertOnly { get; set; }

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public StreamOnExternalTableArgs()
        {
        }
        public static new StreamOnExternalTableArgs Empty => new StreamOnExternalTableArgs();
    }

    public sealed class StreamOnExternalTableState : global::Pulumi.ResourceArgs
    {
        [Input("at")]
        public Input<Inputs.StreamOnExternalTableAtGetArgs>? At { get; set; }

        [Input("before")]
        public Input<Inputs.StreamOnExternalTableBeforeGetArgs>? Before { get; set; }

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("copyGrants")]
        public Input<bool>? CopyGrants { get; set; }

        /// <summary>
        /// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.StreamOnExternalTableDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE STREAM` for the given stream.
        /// </summary>
        public InputList<Inputs.StreamOnExternalTableDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.StreamOnExternalTableDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`. For more information about this resource, see docs.
        /// </summary>
        [Input("externalTable")]
        public Input<string>? ExternalTable { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an insert-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("insertOnly")]
        public Input<string>? InsertOnly { get; set; }

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.StreamOnExternalTableShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW STREAMS` for the given stream.
        /// </summary>
        public InputList<Inputs.StreamOnExternalTableShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.StreamOnExternalTableShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        [Input("stale")]
        public Input<bool>? Stale { get; set; }

        /// <summary>
        /// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Input("streamType")]
        public Input<string>? StreamType { get; set; }

        public StreamOnExternalTableState()
        {
        }
        public static new StreamOnExternalTableState Empty => new StreamOnExternalTableState();
    }
}
