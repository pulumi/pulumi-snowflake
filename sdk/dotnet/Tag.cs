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
    ///     var schema = new Snowflake.Schema("schema", new()
    ///     {
    ///         Database = database.Name,
    ///     });
    /// 
    ///     var tag = new Snowflake.Tag("tag", new()
    ///     {
    ///         Database = database.Name,
    ///         Schema = schema.Name,
    ///         AllowedValues = new[]
    ///         {
    ///             "finance",
    ///             "engineering",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is database name | schema name | tag name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/tag:Tag example 'dbName|schemaName|tagName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/tag:Tag")]
    public partial class Tag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of allowed values for the tag.
        /// </summary>
        [Output("allowedValues")]
        public Output<ImmutableArray<string>> AllowedValues { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the tag.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the tag.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the tag; must be unique for the database in which the tag is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the tag.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;


        /// <summary>
        /// Create a Tag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tag(string name, TagArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/tag:Tag", name, args ?? new TagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tag(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/tag:Tag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Tag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tag Get(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
        {
            return new Tag(name, id, state, options);
        }
    }

    public sealed class TagArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedValues")]
        private InputList<string>? _allowedValues;

        /// <summary>
        /// List of allowed values for the tag.
        /// </summary>
        public InputList<string> AllowedValues
        {
            get => _allowedValues ?? (_allowedValues = new InputList<string>());
            set => _allowedValues = value;
        }

        /// <summary>
        /// Specifies a comment for the tag.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the tag.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier for the tag; must be unique for the database in which the tag is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the tag.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public TagArgs()
        {
        }
        public static new TagArgs Empty => new TagArgs();
    }

    public sealed class TagState : global::Pulumi.ResourceArgs
    {
        [Input("allowedValues")]
        private InputList<string>? _allowedValues;

        /// <summary>
        /// List of allowed values for the tag.
        /// </summary>
        public InputList<string> AllowedValues
        {
            get => _allowedValues ?? (_allowedValues = new InputList<string>());
            set => _allowedValues = value;
        }

        /// <summary>
        /// Specifies a comment for the tag.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the tag.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies the identifier for the tag; must be unique for the database in which the tag is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the tag.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public TagState()
        {
        }
        public static new TagState Empty => new TagState();
    }
}
