// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
    /// $ pulumi import snowflake:index/streamOnView:StreamOnView example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;stream_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/streamOnView:StreamOnView")]
    public partial class StreamOnView : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("appendOnly")]
        public Output<string?> AppendOnly { get; private set; } = null!;

        [Output("at")]
        public Output<Outputs.StreamOnViewAt?> At { get; private set; } = null!;

        [Output("before")]
        public Output<Outputs.StreamOnViewBefore?> Before { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
        /// </summary>
        [Output("copyGrants")]
        public Output<bool?> CopyGrants { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE STREAM` for the given stream.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.StreamOnViewDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        [Output("showInitialRows")]
        public Output<string?> ShowInitialRows { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW STREAMS` for the given stream.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.StreamOnViewShowOutput>> ShowOutputs { get; private set; } = null!;

        [Output("stale")]
        public Output<bool> Stale { get; private set; } = null!;

        /// <summary>
        /// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Output("streamType")]
        public Output<string> StreamType { get; private set; } = null!;

        /// <summary>
        /// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("view")]
        public Output<string> View { get; private set; } = null!;


        /// <summary>
        /// Create a StreamOnView resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StreamOnView(string name, StreamOnViewArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/streamOnView:StreamOnView", name, args ?? new StreamOnViewArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StreamOnView(string name, Input<string> id, StreamOnViewState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/streamOnView:StreamOnView", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StreamOnView resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StreamOnView Get(string name, Input<string> id, StreamOnViewState? state = null, CustomResourceOptions? options = null)
        {
            return new StreamOnView(name, id, state, options);
        }
    }

    public sealed class StreamOnViewArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("appendOnly")]
        public Input<string>? AppendOnly { get; set; }

        [Input("at")]
        public Input<Inputs.StreamOnViewAtArgs>? At { get; set; }

        [Input("before")]
        public Input<Inputs.StreamOnViewBeforeArgs>? Before { get; set; }

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
        /// </summary>
        [Input("copyGrants")]
        public Input<bool>? CopyGrants { get; set; }

        /// <summary>
        /// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("showInitialRows")]
        public Input<string>? ShowInitialRows { get; set; }

        /// <summary>
        /// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("view", required: true)]
        public Input<string> View { get; set; } = null!;

        public StreamOnViewArgs()
        {
        }
        public static new StreamOnViewArgs Empty => new StreamOnViewArgs();
    }

    public sealed class StreamOnViewState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether this is an append-only stream. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("appendOnly")]
        public Input<string>? AppendOnly { get; set; }

        [Input("at")]
        public Input<Inputs.StreamOnViewAtGetArgs>? At { get; set; }

        [Input("before")]
        public Input<Inputs.StreamOnViewBeforeGetArgs>? Before { get; set; }

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
        /// </summary>
        [Input("copyGrants")]
        public Input<bool>? CopyGrants { get; set; }

        /// <summary>
        /// The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.StreamOnViewDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE STREAM` for the given stream.
        /// </summary>
        public InputList<Inputs.StreamOnViewDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.StreamOnViewDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("showInitialRows")]
        public Input<string>? ShowInitialRows { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.StreamOnViewShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW STREAMS` for the given stream.
        /// </summary>
        public InputList<Inputs.StreamOnViewShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.StreamOnViewShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        [Input("stale")]
        public Input<bool>? Stale { get; set; }

        /// <summary>
        /// Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Input("streamType")]
        public Input<string>? StreamType { get; set; }

        /// <summary>
        /// Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("view")]
        public Input<string>? View { get; set; }

        public StreamOnViewState()
        {
        }
        public static new StreamOnViewState Empty => new StreamOnViewState();
    }
}
