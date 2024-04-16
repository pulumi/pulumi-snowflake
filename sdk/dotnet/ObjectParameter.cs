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
    ///     var d = new Snowflake.Database("d", new()
    ///     {
    ///         Name = "TEST_DB",
    ///     });
    /// 
    ///     var o = new Snowflake.ObjectParameter("o", new()
    ///     {
    ///         Key = "SUSPEND_TASK_AFTER_NUM_FAILURES",
    ///         Value = "33",
    ///         ObjectType = "DATABASE",
    ///         ObjectIdentifiers = new[]
    ///         {
    ///             new Snowflake.Inputs.ObjectParameterObjectIdentifierArgs
    ///             {
    ///                 Name = d.Name,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var s = new Snowflake.Schema("s", new()
    ///     {
    ///         Name = "TEST_SCHEMA",
    ///         Database = d.Name,
    ///     });
    /// 
    ///     var o2 = new Snowflake.ObjectParameter("o2", new()
    ///     {
    ///         Key = "USER_TASK_TIMEOUT_MS",
    ///         Value = "500",
    ///         ObjectType = "SCHEMA",
    ///         ObjectIdentifiers = new[]
    ///         {
    ///             new Snowflake.Inputs.ObjectParameterObjectIdentifierArgs
    ///             {
    ///                 Database = d.Name,
    ///                 Name = s.Name,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var t = new Snowflake.Table("t", new()
    ///     {
    ///         Name = "TEST_TABLE",
    ///         Database = d.Name,
    ///         Schema = s.Name,
    ///         Columns = new[]
    ///         {
    ///             new Snowflake.Inputs.TableColumnArgs
    ///             {
    ///                 Name = "id",
    ///                 Type = "NUMBER",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var o3 = new Snowflake.ObjectParameter("o3", new()
    ///     {
    ///         Key = "DATA_RETENTION_TIME_IN_DAYS",
    ///         Value = "89",
    ///         ObjectType = "TABLE",
    ///         ObjectIdentifiers = new[]
    ///         {
    ///             new Snowflake.Inputs.ObjectParameterObjectIdentifierArgs
    ///             {
    ///                 Database = d.Name,
    ///                 Schema = s.Name,
    ///                 Name = t.Name,
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Setting object parameter at account level
    ///     var o4 = new Snowflake.ObjectParameter("o4", new()
    ///     {
    ///         Key = "DATA_RETENTION_TIME_IN_DAYS",
    ///         Value = "89",
    ///         OnAccount = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/objectParameter:ObjectParameter s &lt;key&gt;❄️&lt;object_type&gt;❄️&lt;object_identifier&gt;
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/objectParameter:ObjectParameter")]
    public partial class ObjectParameter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        /// </summary>
        [Output("objectIdentifiers")]
        public Output<ImmutableArray<Outputs.ObjectParameterObjectIdentifier>> ObjectIdentifiers { get; private set; } = null!;

        /// <summary>
        /// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        /// </summary>
        [Output("objectType")]
        public Output<string?> ObjectType { get; private set; } = null!;

        /// <summary>
        /// If true, the object parameter will be set on the account level.
        /// </summary>
        [Output("onAccount")]
        public Output<bool?> OnAccount { get; private set; } = null!;

        /// <summary>
        /// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a ObjectParameter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ObjectParameter(string name, ObjectParameterArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/objectParameter:ObjectParameter", name, args ?? new ObjectParameterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ObjectParameter(string name, Input<string> id, ObjectParameterState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/objectParameter:ObjectParameter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ObjectParameter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ObjectParameter Get(string name, Input<string> id, ObjectParameterState? state = null, CustomResourceOptions? options = null)
        {
            return new ObjectParameter(name, id, state, options);
        }
    }

    public sealed class ObjectParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("objectIdentifiers")]
        private InputList<Inputs.ObjectParameterObjectIdentifierArgs>? _objectIdentifiers;

        /// <summary>
        /// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        /// </summary>
        public InputList<Inputs.ObjectParameterObjectIdentifierArgs> ObjectIdentifiers
        {
            get => _objectIdentifiers ?? (_objectIdentifiers = new InputList<Inputs.ObjectParameterObjectIdentifierArgs>());
            set => _objectIdentifiers = value;
        }

        /// <summary>
        /// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// If true, the object parameter will be set on the account level.
        /// </summary>
        [Input("onAccount")]
        public Input<bool>? OnAccount { get; set; }

        /// <summary>
        /// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ObjectParameterArgs()
        {
        }
        public static new ObjectParameterArgs Empty => new ObjectParameterArgs();
    }

    public sealed class ObjectParameterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("objectIdentifiers")]
        private InputList<Inputs.ObjectParameterObjectIdentifierGetArgs>? _objectIdentifiers;

        /// <summary>
        /// Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        /// </summary>
        public InputList<Inputs.ObjectParameterObjectIdentifierGetArgs> ObjectIdentifiers
        {
            get => _objectIdentifiers ?? (_objectIdentifiers = new InputList<Inputs.ObjectParameterObjectIdentifierGetArgs>());
            set => _objectIdentifiers = value;
        }

        /// <summary>
        /// Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// If true, the object parameter will be set on the account level.
        /// </summary>
        [Input("onAccount")]
        public Input<bool>? OnAccount { get; set; }

        /// <summary>
        /// Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ObjectParameterState()
        {
        }
        public static new ObjectParameterState Empty => new ObjectParameterState();
    }
}
