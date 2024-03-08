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
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// format is database name | schema name | stream name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/stream:Stream example 'dbName|schemaName|streamName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/stream:Stream")]
    public partial class Stream : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Type of the stream that will be created.
        /// </summary>
        [Output("appendOnly")]
        public Output<bool?> AppendOnly { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the stream.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Create an insert only stream type.
        /// </summary>
        [Output("insertOnly")]
        public Output<bool?> InsertOnly { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies an identifier for the stage the stream will monitor.
        /// </summary>
        [Output("onStage")]
        public Output<string?> OnStage { get; private set; } = null!;

        /// <summary>
        /// Specifies an identifier for the table the stream will monitor.
        /// </summary>
        [Output("onTable")]
        public Output<string?> OnTable { get; private set; } = null!;

        /// <summary>
        /// Specifies an identifier for the view the stream will monitor.
        /// </summary>
        [Output("onView")]
        public Output<string?> OnView { get; private set; } = null!;

        /// <summary>
        /// Name of the role that owns the stream.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the stream.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
        /// </summary>
        [Output("showInitialRows")]
        public Output<bool?> ShowInitialRows { get; private set; } = null!;


        /// <summary>
        /// Create a Stream resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Stream(string name, StreamArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/stream:Stream", name, args ?? new StreamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Stream(string name, Input<string> id, StreamState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/stream:Stream", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Stream resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Stream Get(string name, Input<string> id, StreamState? state = null, CustomResourceOptions? options = null)
        {
            return new Stream(name, id, state, options);
        }
    }

    public sealed class StreamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the stream that will be created.
        /// </summary>
        [Input("appendOnly")]
        public Input<bool>? AppendOnly { get; set; }

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the stream.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Create an insert only stream type.
        /// </summary>
        [Input("insertOnly")]
        public Input<bool>? InsertOnly { get; set; }

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies an identifier for the stage the stream will monitor.
        /// </summary>
        [Input("onStage")]
        public Input<string>? OnStage { get; set; }

        /// <summary>
        /// Specifies an identifier for the table the stream will monitor.
        /// </summary>
        [Input("onTable")]
        public Input<string>? OnTable { get; set; }

        /// <summary>
        /// Specifies an identifier for the view the stream will monitor.
        /// </summary>
        [Input("onView")]
        public Input<string>? OnView { get; set; }

        /// <summary>
        /// The schema in which to create the stream.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
        /// </summary>
        [Input("showInitialRows")]
        public Input<bool>? ShowInitialRows { get; set; }

        public StreamArgs()
        {
        }
        public static new StreamArgs Empty => new StreamArgs();
    }

    public sealed class StreamState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the stream that will be created.
        /// </summary>
        [Input("appendOnly")]
        public Input<bool>? AppendOnly { get; set; }

        /// <summary>
        /// Specifies a comment for the stream.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the stream.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Create an insert only stream type.
        /// </summary>
        [Input("insertOnly")]
        public Input<bool>? InsertOnly { get; set; }

        /// <summary>
        /// Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies an identifier for the stage the stream will monitor.
        /// </summary>
        [Input("onStage")]
        public Input<string>? OnStage { get; set; }

        /// <summary>
        /// Specifies an identifier for the table the stream will monitor.
        /// </summary>
        [Input("onTable")]
        public Input<string>? OnTable { get; set; }

        /// <summary>
        /// Specifies an identifier for the view the stream will monitor.
        /// </summary>
        [Input("onView")]
        public Input<string>? OnView { get; set; }

        /// <summary>
        /// Name of the role that owns the stream.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The schema in which to create the stream.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
        /// </summary>
        [Input("showInitialRows")]
        public Input<bool>? ShowInitialRows { get; set; }

        public StreamState()
        {
        }
        public static new StreamState Empty => new StreamState();
    }
}
