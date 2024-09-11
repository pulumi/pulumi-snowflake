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
    /// format is database name | schema name | view name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/materializedView:MaterializedView example 'dbName|schemaName|viewName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/materializedView:MaterializedView")]
    public partial class MaterializedView : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the view.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the view. Don't use the | character.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies that the view is secure.
        /// </summary>
        [Output("isSecure")]
        public Output<bool?> IsSecure { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the view; must be unique for the schema in which the view is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Overwrites the View if it exists.
        /// </summary>
        [Output("orReplace")]
        public Output<bool?> OrReplace { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the view. Don't use the | character.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Output("statement")]
        public Output<string> Statement { get; private set; } = null!;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.MaterializedViewTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The warehouse name.
        /// </summary>
        [Output("warehouse")]
        public Output<string> Warehouse { get; private set; } = null!;


        /// <summary>
        /// Create a MaterializedView resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MaterializedView(string name, MaterializedViewArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/materializedView:MaterializedView", name, args ?? new MaterializedViewArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MaterializedView(string name, Input<string> id, MaterializedViewState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/materializedView:MaterializedView", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MaterializedView resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MaterializedView Get(string name, Input<string> id, MaterializedViewState? state = null, CustomResourceOptions? options = null)
        {
            return new MaterializedView(name, id, state, options);
        }
    }

    public sealed class MaterializedViewArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the view.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the view. Don't use the | character.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies that the view is secure.
        /// </summary>
        [Input("isSecure")]
        public Input<bool>? IsSecure { get; set; }

        /// <summary>
        /// Specifies the identifier for the view; must be unique for the schema in which the view is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Overwrites the View if it exists.
        /// </summary>
        [Input("orReplace")]
        public Input<bool>? OrReplace { get; set; }

        /// <summary>
        /// The schema in which to create the view. Don't use the | character.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.MaterializedViewTagArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.MaterializedViewTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.MaterializedViewTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The warehouse name.
        /// </summary>
        [Input("warehouse", required: true)]
        public Input<string> Warehouse { get; set; } = null!;

        public MaterializedViewArgs()
        {
        }
        public static new MaterializedViewArgs Empty => new MaterializedViewArgs();
    }

    public sealed class MaterializedViewState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the view.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the view. Don't use the | character.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies that the view is secure.
        /// </summary>
        [Input("isSecure")]
        public Input<bool>? IsSecure { get; set; }

        /// <summary>
        /// Specifies the identifier for the view; must be unique for the schema in which the view is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Overwrites the View if it exists.
        /// </summary>
        [Input("orReplace")]
        public Input<bool>? OrReplace { get; set; }

        /// <summary>
        /// The schema in which to create the view. Don't use the | character.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        [Input("tags")]
        private InputList<Inputs.MaterializedViewTagGetArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.MaterializedViewTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.MaterializedViewTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The warehouse name.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public MaterializedViewState()
        {
        }
        public static new MaterializedViewState Empty => new MaterializedViewState();
    }
}
