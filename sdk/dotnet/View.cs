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
    ///     var view = new Snowflake.View("view", new()
    ///     {
    ///         Database = "database",
    ///         Schema = "schema",
    ///         Comment = "comment",
    ///         Statement = @"select * from foo;
    /// ",
    ///         OrReplace = false,
    ///         IsSecure = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is database name | schema name | view name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/view:View example 'dbName|schemaName|viewName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/view:View")]
    public partial class View : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the view.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
        /// </summary>
        [Output("copyGrants")]
        public Output<bool?> CopyGrants { get; private set; } = null!;

        /// <summary>
        /// The timestamp at which the view was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies that the view is secure.
        /// </summary>
        [Output("isSecure")]
        public Output<bool?> IsSecure { get; private set; } = null!;

        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Overwrites the View if it exists.
        /// </summary>
        [Output("orReplace")]
        public Output<bool?> OrReplace { get; private set; } = null!;

        /// <summary>
        /// Name of the schema that the tag was created in.
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
        public Output<ImmutableArray<Outputs.ViewTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a View resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public View(string name, ViewArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/view:View", name, args ?? new ViewArgs(), MakeResourceOptions(options, ""))
        {
        }

        private View(string name, Input<string> id, ViewState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/view:View", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing View resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static View Get(string name, Input<string> id, ViewState? state = null, CustomResourceOptions? options = null)
        {
            return new View(name, id, state, options);
        }
    }

    public sealed class ViewArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the view.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
        /// </summary>
        [Input("copyGrants")]
        public Input<bool>? CopyGrants { get; set; }

        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies that the view is secure.
        /// </summary>
        [Input("isSecure")]
        public Input<bool>? IsSecure { get; set; }

        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Overwrites the View if it exists.
        /// </summary>
        [Input("orReplace")]
        public Input<bool>? OrReplace { get; set; }

        /// <summary>
        /// Name of the schema that the tag was created in.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.ViewTagArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.ViewTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ViewTagArgs>());
            set => _tags = value;
        }

        public ViewArgs()
        {
        }
        public static new ViewArgs Empty => new ViewArgs();
    }

    public sealed class ViewState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the view.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
        /// </summary>
        [Input("copyGrants")]
        public Input<bool>? CopyGrants { get; set; }

        /// <summary>
        /// The timestamp at which the view was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies that the view is secure.
        /// </summary>
        [Input("isSecure")]
        public Input<bool>? IsSecure { get; set; }

        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Overwrites the View if it exists.
        /// </summary>
        [Input("orReplace")]
        public Input<bool>? OrReplace { get; set; }

        /// <summary>
        /// Name of the schema that the tag was created in.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        [Input("tags")]
        private InputList<Inputs.ViewTagGetArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.ViewTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ViewTagGetArgs>());
            set => _tags = value;
        }

        public ViewState()
        {
        }
        public static new ViewState Empty => new ViewState();
    }
}
