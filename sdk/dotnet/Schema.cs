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
    ///     var schema = new Snowflake.Schema("schema", new()
    ///     {
    ///         Comment = "A schema.",
    ///         DataRetentionDays = 1,
    ///         Database = "database",
    ///         IsManaged = false,
    ///         IsTransient = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is dbName | schemaName
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/schema:Schema example 'dbName|schemaName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/schema:Schema")]
    public partial class Schema : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the schema.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
        /// </summary>
        [Output("dataRetentionDays")]
        public Output<int?> DataRetentionDays { get; private set; } = null!;

        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
        /// </summary>
        [Output("isManaged")]
        public Output<bool?> IsManaged { get; private set; } = null!;

        /// <summary>
        /// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Output("isTransient")]
        public Output<bool?> IsTransient { get; private set; } = null!;

        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.SchemaTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Schema resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Schema(string name, SchemaArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/schema:Schema", name, args ?? new SchemaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Schema(string name, Input<string> id, SchemaState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/schema:Schema", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Schema resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Schema Get(string name, Input<string> id, SchemaState? state = null, CustomResourceOptions? options = null)
        {
            return new Schema(name, id, state, options);
        }
    }

    public sealed class SchemaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the schema.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
        /// </summary>
        [Input("dataRetentionDays")]
        public Input<int>? DataRetentionDays { get; set; }

        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
        /// </summary>
        [Input("isManaged")]
        public Input<bool>? IsManaged { get; set; }

        /// <summary>
        /// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<Inputs.SchemaTagArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.SchemaTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SchemaTagArgs>());
            set => _tags = value;
        }

        public SchemaArgs()
        {
        }
        public static new SchemaArgs Empty => new SchemaArgs();
    }

    public sealed class SchemaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the schema.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
        /// </summary>
        [Input("dataRetentionDays")]
        public Input<int>? DataRetentionDays { get; set; }

        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
        /// </summary>
        [Input("isManaged")]
        public Input<bool>? IsManaged { get; set; }

        /// <summary>
        /// Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<Inputs.SchemaTagGetArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.SchemaTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SchemaTagGetArgs>());
            set => _tags = value;
        }

        public SchemaState()
        {
        }
        public static new SchemaState Empty => new SchemaState();
    }
}
