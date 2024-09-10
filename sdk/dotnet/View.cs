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
    /// $ pulumi import snowflake:index/view:View example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;view_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/view:View")]
    public partial class View : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the aggregation policy to set on a view.
        /// </summary>
        [Output("aggregationPolicy")]
        public Output<Outputs.ViewAggregationPolicy?> AggregationPolicy { get; private set; } = null!;

        /// <summary>
        /// Specifies to enable or disable change tracking on the table. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("changeTracking")]
        public Output<string?> ChangeTracking { get; private set; } = null!;

        /// <summary>
        /// If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. (You do not need to specify the data types of the columns.)
        /// </summary>
        [Output("columns")]
        public Output<ImmutableArray<Outputs.ViewColumn>> Columns { get; private set; } = null!;

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
        /// Data metric functions used for the view.
        /// </summary>
        [Output("dataMetricFunctions")]
        public Output<ImmutableArray<Outputs.ViewDataMetricFunction>> DataMetricFunctions { get; private set; } = null!;

        /// <summary>
        /// Specifies the schedule to run the data metric functions periodically.
        /// </summary>
        [Output("dataMetricSchedule")]
        public Output<Outputs.ViewDataMetricSchedule?> DataMetricSchedule { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE VIEW` for the given view.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.ViewDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("isRecursive")]
        public Output<string?> IsRecursive { get; private set; } = null!;

        [Output("isSecure")]
        public Output<string?> IsSecure { get; private set; } = null!;

        [Output("isTemporary")]
        public Output<string?> IsTemporary { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the row access policy to set on a view.
        /// </summary>
        [Output("rowAccessPolicy")]
        public Output<Outputs.ViewRowAccessPolicy?> RowAccessPolicy { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW VIEW` for the given view.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.ViewShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Output("statement")]
        public Output<string> Statement { get; private set; } = null!;


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
        /// Specifies the aggregation policy to set on a view.
        /// </summary>
        [Input("aggregationPolicy")]
        public Input<Inputs.ViewAggregationPolicyArgs>? AggregationPolicy { get; set; }

        /// <summary>
        /// Specifies to enable or disable change tracking on the table. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("changeTracking")]
        public Input<string>? ChangeTracking { get; set; }

        [Input("columns")]
        private InputList<Inputs.ViewColumnArgs>? _columns;

        /// <summary>
        /// If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. (You do not need to specify the data types of the columns.)
        /// </summary>
        public InputList<Inputs.ViewColumnArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.ViewColumnArgs>());
            set => _columns = value;
        }

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

        [Input("dataMetricFunctions")]
        private InputList<Inputs.ViewDataMetricFunctionArgs>? _dataMetricFunctions;

        /// <summary>
        /// Data metric functions used for the view.
        /// </summary>
        public InputList<Inputs.ViewDataMetricFunctionArgs> DataMetricFunctions
        {
            get => _dataMetricFunctions ?? (_dataMetricFunctions = new InputList<Inputs.ViewDataMetricFunctionArgs>());
            set => _dataMetricFunctions = value;
        }

        /// <summary>
        /// Specifies the schedule to run the data metric functions periodically.
        /// </summary>
        [Input("dataMetricSchedule")]
        public Input<Inputs.ViewDataMetricScheduleArgs>? DataMetricSchedule { get; set; }

        /// <summary>
        /// The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("isRecursive")]
        public Input<string>? IsRecursive { get; set; }

        [Input("isSecure")]
        public Input<string>? IsSecure { get; set; }

        [Input("isTemporary")]
        public Input<string>? IsTemporary { get; set; }

        /// <summary>
        /// Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the row access policy to set on a view.
        /// </summary>
        [Input("rowAccessPolicy")]
        public Input<Inputs.ViewRowAccessPolicyArgs>? RowAccessPolicy { get; set; }

        /// <summary>
        /// The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        public ViewArgs()
        {
        }
        public static new ViewArgs Empty => new ViewArgs();
    }

    public sealed class ViewState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the aggregation policy to set on a view.
        /// </summary>
        [Input("aggregationPolicy")]
        public Input<Inputs.ViewAggregationPolicyGetArgs>? AggregationPolicy { get; set; }

        /// <summary>
        /// Specifies to enable or disable change tracking on the table. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("changeTracking")]
        public Input<string>? ChangeTracking { get; set; }

        [Input("columns")]
        private InputList<Inputs.ViewColumnGetArgs>? _columns;

        /// <summary>
        /// If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. (You do not need to specify the data types of the columns.)
        /// </summary>
        public InputList<Inputs.ViewColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.ViewColumnGetArgs>());
            set => _columns = value;
        }

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

        [Input("dataMetricFunctions")]
        private InputList<Inputs.ViewDataMetricFunctionGetArgs>? _dataMetricFunctions;

        /// <summary>
        /// Data metric functions used for the view.
        /// </summary>
        public InputList<Inputs.ViewDataMetricFunctionGetArgs> DataMetricFunctions
        {
            get => _dataMetricFunctions ?? (_dataMetricFunctions = new InputList<Inputs.ViewDataMetricFunctionGetArgs>());
            set => _dataMetricFunctions = value;
        }

        /// <summary>
        /// Specifies the schedule to run the data metric functions periodically.
        /// </summary>
        [Input("dataMetricSchedule")]
        public Input<Inputs.ViewDataMetricScheduleGetArgs>? DataMetricSchedule { get; set; }

        /// <summary>
        /// The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.ViewDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE VIEW` for the given view.
        /// </summary>
        public InputList<Inputs.ViewDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.ViewDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("isRecursive")]
        public Input<string>? IsRecursive { get; set; }

        [Input("isSecure")]
        public Input<string>? IsSecure { get; set; }

        [Input("isTemporary")]
        public Input<string>? IsTemporary { get; set; }

        /// <summary>
        /// Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the row access policy to set on a view.
        /// </summary>
        [Input("rowAccessPolicy")]
        public Input<Inputs.ViewRowAccessPolicyGetArgs>? RowAccessPolicy { get; set; }

        /// <summary>
        /// The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.ViewShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW VIEW` for the given view.
        /// </summary>
        public InputList<Inputs.ViewShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.ViewShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        /// <summary>
        /// Specifies the query used to create the view.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        public ViewState()
        {
        }
        public static new ViewState Empty => new ViewState();
    }
}
