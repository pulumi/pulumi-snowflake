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
    ///     var dbAssociation = new Snowflake.TagAssociation("dbAssociation", new()
    ///     {
    ///         ObjectIdentifiers = new[]
    ///         {
    ///             new Snowflake.Inputs.TagAssociationObjectIdentifierArgs
    ///             {
    ///                 Name = database.Name,
    ///             },
    ///         },
    ///         ObjectType = "DATABASE",
    ///         TagId = tag.Id,
    ///         TagValue = "finance",
    ///     });
    /// 
    ///     var test = new Snowflake.Table("test", new()
    ///     {
    ///         Database = snowflake_database.Test.Name,
    ///         Schema = snowflake_schema.Test.Name,
    ///         Comment = "Terraform example table",
    ///         Columns = new[]
    ///         {
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "column1",
    ///                 Type = "VARIANT",
    ///             },
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "column2",
    ///                 Type = "VARCHAR(16)",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var tableAssociation = new Snowflake.TagAssociation("tableAssociation", new()
    ///     {
    ///         ObjectIdentifiers = new[]
    ///         {
    ///             new Snowflake.Inputs.TagAssociationObjectIdentifierArgs
    ///             {
    ///                 Name = test.Name,
    ///                 Database = snowflake_database.Test.Name,
    ///                 Schema = snowflake_schema.Test.Name,
    ///             },
    ///         },
    ///         ObjectType = "TABLE",
    ///         TagId = snowflake_tag.Test.Id,
    ///         TagValue = "engineering",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is dbName.schemaName.tagName or dbName.schemaName.tagName
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/tagAssociation:TagAssociation example 'dbName.schemaName.tagName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/tagAssociation:TagAssociation")]
    public partial class TagAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the object identifier for the tag association.
        /// </summary>
        [Output("objectIdentifiers")]
        public Output<ImmutableArray<Outputs.TagAssociationObjectIdentifier>> ObjectIdentifiers { get; private set; } = null!;

        /// <summary>
        /// Specifies the object identifier for the tag association.
        /// </summary>
        [Output("objectName")]
        public Output<string?> ObjectName { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of object to add a tag to. ex: 'ACCOUNT', 'COLUMN', 'DATABASE', etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
        /// </summary>
        [Output("objectType")]
        public Output<string> ObjectType { get; private set; } = null!;

        /// <summary>
        /// If true, skips validation of the tag association.
        /// </summary>
        [Output("skipValidation")]
        public Output<bool?> SkipValidation { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        /// </summary>
        [Output("tagId")]
        public Output<string> TagId { get; private set; } = null!;

        /// <summary>
        /// Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        /// </summary>
        [Output("tagValue")]
        public Output<string> TagValue { get; private set; } = null!;


        /// <summary>
        /// Create a TagAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagAssociation(string name, TagAssociationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/tagAssociation:TagAssociation", name, args ?? new TagAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TagAssociation(string name, Input<string> id, TagAssociationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/tagAssociation:TagAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TagAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagAssociation Get(string name, Input<string> id, TagAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new TagAssociation(name, id, state, options);
        }
    }

    public sealed class TagAssociationArgs : global::Pulumi.ResourceArgs
    {
        [Input("objectIdentifiers", required: true)]
        private InputList<Inputs.TagAssociationObjectIdentifierArgs>? _objectIdentifiers;

        /// <summary>
        /// Specifies the object identifier for the tag association.
        /// </summary>
        public InputList<Inputs.TagAssociationObjectIdentifierArgs> ObjectIdentifiers
        {
            get => _objectIdentifiers ?? (_objectIdentifiers = new InputList<Inputs.TagAssociationObjectIdentifierArgs>());
            set => _objectIdentifiers = value;
        }

        /// <summary>
        /// Specifies the object identifier for the tag association.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        /// <summary>
        /// Specifies the type of object to add a tag to. ex: 'ACCOUNT', 'COLUMN', 'DATABASE', etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
        /// </summary>
        [Input("objectType", required: true)]
        public Input<string> ObjectType { get; set; } = null!;

        /// <summary>
        /// If true, skips validation of the tag association.
        /// </summary>
        [Input("skipValidation")]
        public Input<bool>? SkipValidation { get; set; }

        /// <summary>
        /// Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        /// </summary>
        [Input("tagId", required: true)]
        public Input<string> TagId { get; set; } = null!;

        /// <summary>
        /// Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        /// </summary>
        [Input("tagValue", required: true)]
        public Input<string> TagValue { get; set; } = null!;

        public TagAssociationArgs()
        {
        }
        public static new TagAssociationArgs Empty => new TagAssociationArgs();
    }

    public sealed class TagAssociationState : global::Pulumi.ResourceArgs
    {
        [Input("objectIdentifiers")]
        private InputList<Inputs.TagAssociationObjectIdentifierGetArgs>? _objectIdentifiers;

        /// <summary>
        /// Specifies the object identifier for the tag association.
        /// </summary>
        public InputList<Inputs.TagAssociationObjectIdentifierGetArgs> ObjectIdentifiers
        {
            get => _objectIdentifiers ?? (_objectIdentifiers = new InputList<Inputs.TagAssociationObjectIdentifierGetArgs>());
            set => _objectIdentifiers = value;
        }

        /// <summary>
        /// Specifies the object identifier for the tag association.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        /// <summary>
        /// Specifies the type of object to add a tag to. ex: 'ACCOUNT', 'COLUMN', 'DATABASE', etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// If true, skips validation of the tag association.
        /// </summary>
        [Input("skipValidation")]
        public Input<bool>? SkipValidation { get; set; }

        /// <summary>
        /// Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        /// </summary>
        [Input("tagId")]
        public Input<string>? TagId { get; set; }

        /// <summary>
        /// Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public TagAssociationState()
        {
        }
        public static new TagAssociationState Empty => new TagAssociationState();
    }
}
