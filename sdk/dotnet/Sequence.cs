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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Snowflake.Database("database");
    /// 
    ///     var testSchema = new Snowflake.Schema("testSchema", new()
    ///     {
    ///         Database = snowflake_database.Test_database.Name,
    ///     });
    /// 
    ///     var testSequence = new Snowflake.Sequence("testSequence", new()
    ///     {
    ///         Database = snowflake_database.Test_database.Name,
    ///         Schema = testSchema.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is database name | schema name | sequence name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/sequence:Sequence example 'dbName|schemaName|sequenceName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/sequence:Sequence")]
    public partial class Sequence : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the sequence.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the sequence. Don't use the | character.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the sequence.
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// The amount the sequence will increase by each time it is used
        /// </summary>
        [Output("increment")]
        public Output<int?> Increment { get; private set; } = null!;

        /// <summary>
        /// Specifies the name for the sequence.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The increment sequence interval.
        /// </summary>
        [Output("nextValue")]
        public Output<int> NextValue { get; private set; } = null!;

        /// <summary>
        /// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        /// </summary>
        [Output("ordering")]
        public Output<string?> Ordering { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the sequence. Don't use the | character.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;


        /// <summary>
        /// Create a Sequence resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Sequence(string name, SequenceArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/sequence:Sequence", name, args ?? new SequenceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Sequence(string name, Input<string> id, SequenceState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/sequence:Sequence", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Sequence resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Sequence Get(string name, Input<string> id, SequenceState? state = null, CustomResourceOptions? options = null)
        {
            return new Sequence(name, id, state, options);
        }
    }

    public sealed class SequenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the sequence.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the sequence. Don't use the | character.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The amount the sequence will increase by each time it is used
        /// </summary>
        [Input("increment")]
        public Input<int>? Increment { get; set; }

        /// <summary>
        /// Specifies the name for the sequence.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        /// </summary>
        [Input("ordering")]
        public Input<string>? Ordering { get; set; }

        /// <summary>
        /// The schema in which to create the sequence. Don't use the | character.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public SequenceArgs()
        {
        }
        public static new SequenceArgs Empty => new SequenceArgs();
    }

    public sealed class SequenceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the sequence.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the sequence. Don't use the | character.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// The fully qualified name of the sequence.
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// The amount the sequence will increase by each time it is used
        /// </summary>
        [Input("increment")]
        public Input<int>? Increment { get; set; }

        /// <summary>
        /// Specifies the name for the sequence.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The increment sequence interval.
        /// </summary>
        [Input("nextValue")]
        public Input<int>? NextValue { get; set; }

        /// <summary>
        /// The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        /// </summary>
        [Input("ordering")]
        public Input<string>? Ordering { get; set; }

        /// <summary>
        /// The schema in which to create the sequence. Don't use the | character.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public SequenceState()
        {
        }
        public static new SequenceState Empty => new SequenceState();
    }
}
