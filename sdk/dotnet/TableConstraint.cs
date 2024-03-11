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
    /// &lt;!--Start PulumiCodeChooser --&gt;
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
    ///     var table = new Snowflake.Table("table", new()
    ///     {
    ///         Database = database.Name,
    ///         Schema = schema.Name,
    ///         Columns = new[]
    ///         {
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "col1",
    ///                 Type = "text",
    ///                 Nullable = false,
    ///             },
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "col2",
    ///                 Type = "text",
    ///                 Nullable = false,
    ///             },
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "col3",
    ///                 Type = "text",
    ///                 Nullable = false,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var fkT = new Snowflake.Table("fkT", new()
    ///     {
    ///         Database = database.Name,
    ///         Schema = schema.Name,
    ///         Columns = new[]
    ///         {
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "fk_col1",
    ///                 Type = "text",
    ///                 Nullable = false,
    ///             },
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "fk_col2",
    ///                 Type = "text",
    ///                 Nullable = false,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var primaryKey = new Snowflake.TableConstraint("primaryKey", new()
    ///     {
    ///         Type = "PRIMARY KEY",
    ///         TableId = table.QualifiedName,
    ///         Columns = new[]
    ///         {
    ///             "col1",
    ///         },
    ///         Comment = "hello world",
    ///     });
    /// 
    ///     var foreignKey = new Snowflake.TableConstraint("foreignKey", new()
    ///     {
    ///         Type = "FOREIGN KEY",
    ///         TableId = table.QualifiedName,
    ///         Columns = new[]
    ///         {
    ///             "col2",
    ///         },
    ///         ForeignKeyProperties = new Snowflake.Inputs.TableConstraintForeignKeyPropertiesArgs
    ///         {
    ///             References = new Snowflake.Inputs.TableConstraintForeignKeyPropertiesReferencesArgs
    ///             {
    ///                 TableId = fkT.QualifiedName,
    ///                 Columns = new[]
    ///                 {
    ///                     "fk_col1",
    ///                 },
    ///             },
    ///         },
    ///         Enforced = false,
    ///         Deferrable = false,
    ///         Initially = "IMMEDIATE",
    ///         Comment = "hello fk",
    ///     });
    /// 
    ///     var unique = new Snowflake.TableConstraint("unique", new()
    ///     {
    ///         Type = "UNIQUE",
    ///         TableId = table.QualifiedName,
    ///         Columns = new[]
    ///         {
    ///             "col3",
    ///         },
    ///         Comment = "hello unique",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/tableConstraint:TableConstraint example 'myconstraintfk❄️FOREIGN KEY❄️test|test|table'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/tableConstraint:TableConstraint")]
    public partial class TableConstraint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Columns to use in foreign key reference
        /// </summary>
        [Output("columns")]
        public Output<ImmutableArray<string>> Columns { get; private set; } = null!;

        /// <summary>
        /// Comment for the table constraint
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Whether the constraint is deferrable
        /// </summary>
        [Output("deferrable")]
        public Output<bool?> Deferrable { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        /// </summary>
        [Output("enable")]
        public Output<bool?> Enable { get; private set; } = null!;

        /// <summary>
        /// Whether the constraint is enforced
        /// </summary>
        [Output("enforced")]
        public Output<bool?> Enforced { get; private set; } = null!;

        /// <summary>
        /// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        /// </summary>
        [Output("foreignKeyProperties")]
        public Output<Outputs.TableConstraintForeignKeyProperties?> ForeignKeyProperties { get; private set; } = null!;

        /// <summary>
        /// Whether the constraint is initially deferred or immediate
        /// </summary>
        [Output("initially")]
        public Output<string?> Initially { get; private set; } = null!;

        /// <summary>
        /// Name of constraint
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        /// </summary>
        [Output("rely")]
        public Output<bool?> Rely { get; private set; } = null!;

        /// <summary>
        /// Name of constraint
        /// </summary>
        [Output("tableId")]
        public Output<string> TableId { get; private set; } = null!;

        /// <summary>
        /// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        /// </summary>
        [Output("validate")]
        public Output<bool?> Validate { get; private set; } = null!;


        /// <summary>
        /// Create a TableConstraint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TableConstraint(string name, TableConstraintArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/tableConstraint:TableConstraint", name, args ?? new TableConstraintArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TableConstraint(string name, Input<string> id, TableConstraintState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/tableConstraint:TableConstraint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TableConstraint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TableConstraint Get(string name, Input<string> id, TableConstraintState? state = null, CustomResourceOptions? options = null)
        {
            return new TableConstraint(name, id, state, options);
        }
    }

    public sealed class TableConstraintArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns", required: true)]
        private InputList<string>? _columns;

        /// <summary>
        /// Columns to use in foreign key reference
        /// </summary>
        public InputList<string> Columns
        {
            get => _columns ?? (_columns = new InputList<string>());
            set => _columns = value;
        }

        /// <summary>
        /// Comment for the table constraint
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Whether the constraint is deferrable
        /// </summary>
        [Input("deferrable")]
        public Input<bool>? Deferrable { get; set; }

        /// <summary>
        /// Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Whether the constraint is enforced
        /// </summary>
        [Input("enforced")]
        public Input<bool>? Enforced { get; set; }

        /// <summary>
        /// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        /// </summary>
        [Input("foreignKeyProperties")]
        public Input<Inputs.TableConstraintForeignKeyPropertiesArgs>? ForeignKeyProperties { get; set; }

        /// <summary>
        /// Whether the constraint is initially deferred or immediate
        /// </summary>
        [Input("initially")]
        public Input<string>? Initially { get; set; }

        /// <summary>
        /// Name of constraint
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        /// </summary>
        [Input("rely")]
        public Input<bool>? Rely { get; set; }

        /// <summary>
        /// Name of constraint
        /// </summary>
        [Input("tableId", required: true)]
        public Input<string> TableId { get; set; } = null!;

        /// <summary>
        /// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public TableConstraintArgs()
        {
        }
        public static new TableConstraintArgs Empty => new TableConstraintArgs();
    }

    public sealed class TableConstraintState : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<string>? _columns;

        /// <summary>
        /// Columns to use in foreign key reference
        /// </summary>
        public InputList<string> Columns
        {
            get => _columns ?? (_columns = new InputList<string>());
            set => _columns = value;
        }

        /// <summary>
        /// Comment for the table constraint
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Whether the constraint is deferrable
        /// </summary>
        [Input("deferrable")]
        public Input<bool>? Deferrable { get; set; }

        /// <summary>
        /// Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Whether the constraint is enforced
        /// </summary>
        [Input("enforced")]
        public Input<bool>? Enforced { get; set; }

        /// <summary>
        /// Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        /// </summary>
        [Input("foreignKeyProperties")]
        public Input<Inputs.TableConstraintForeignKeyPropertiesGetArgs>? ForeignKeyProperties { get; set; }

        /// <summary>
        /// Whether the constraint is initially deferred or immediate
        /// </summary>
        [Input("initially")]
        public Input<string>? Initially { get; set; }

        /// <summary>
        /// Name of constraint
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        /// </summary>
        [Input("rely")]
        public Input<bool>? Rely { get; set; }

        /// <summary>
        /// Name of constraint
        /// </summary>
        [Input("tableId")]
        public Input<string>? TableId { get; set; }

        /// <summary>
        /// Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public TableConstraintState()
        {
        }
        public static new TableConstraintState Empty => new TableConstraintState();
    }
}
