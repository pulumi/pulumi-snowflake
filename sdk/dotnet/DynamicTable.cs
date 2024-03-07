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
    ///     // https://docs.snowflake.com/en/sql-reference/sql/create-dynamic-table#examples
    ///     var dt = new Snowflake.DynamicTable("dt", new()
    ///     {
    ///         Comment = "example comment",
    ///         Database = "mydb",
    ///         Query = "SELECT product_id, product_name FROM \"mydb\".\"myschema\".\"staging_table\"",
    ///         Schema = "myschema",
    ///         TargetLag = new Snowflake.Inputs.DynamicTableTargetLagArgs
    ///         {
    ///             MaximumDuration = "20 minutes",
    ///         },
    ///         Warehouse = "mywh",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/dynamicTable:DynamicTable dt "mydb|myschema|product"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/dynamicTable:DynamicTable")]
    public partial class DynamicTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
        /// </summary>
        [Output("automaticClustering")]
        public Output<bool> AutomaticClustering { get; private set; } = null!;

        /// <summary>
        /// Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
        /// </summary>
        [Output("bytes")]
        public Output<int> Bytes { get; private set; } = null!;

        /// <summary>
        /// The clustering key for the dynamic table.
        /// </summary>
        [Output("clusterBy")]
        public Output<string> ClusterBy { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the dynamic table.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Time when this dynamic table was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Timestamp of the data in the base object(s) that is included in the dynamic table.
        /// </summary>
        [Output("dataTimestamp")]
        public Output<string> DataTimestamp { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the dynamic table.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
        /// </summary>
        [Output("initialize")]
        public Output<string?> Initialize { get; private set; } = null!;

        /// <summary>
        /// TRUE if the dynamic table has been cloned, else FALSE.
        /// </summary>
        [Output("isClone")]
        public Output<bool> IsClone { get; private set; } = null!;

        /// <summary>
        /// TRUE if the dynamic table is a replica. else FALSE.
        /// </summary>
        [Output("isReplica")]
        public Output<bool> IsReplica { get; private set; } = null!;

        /// <summary>
        /// Timestamp of last suspension.
        /// </summary>
        [Output("lastSuspendedOn")]
        public Output<string> LastSuspendedOn { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to replace the dynamic table if it already exists.
        /// </summary>
        [Output("orReplace")]
        public Output<bool?> OrReplace { get; private set; } = null!;

        /// <summary>
        /// Role that owns the dynamic table.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Specifies the query to use to populate the dynamic table.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        /// <summary>
        /// INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
        /// </summary>
        [Output("refreshMode")]
        public Output<string?> RefreshMode { get; private set; } = null!;

        /// <summary>
        /// Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
        /// </summary>
        [Output("refreshModeReason")]
        public Output<string> RefreshModeReason { get; private set; } = null!;

        /// <summary>
        /// Number of rows in the table.
        /// </summary>
        [Output("rows")]
        public Output<int> Rows { get; private set; } = null!;

        /// <summary>
        /// Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
        /// </summary>
        [Output("schedulingState")]
        public Output<string> SchedulingState { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the dynamic table.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies the target lag time for the dynamic table.
        /// </summary>
        [Output("targetLag")]
        public Output<Outputs.DynamicTableTargetLag> TargetLag { get; private set; } = null!;

        /// <summary>
        /// The warehouse in which to create the dynamic table.
        /// </summary>
        [Output("warehouse")]
        public Output<string> Warehouse { get; private set; } = null!;


        /// <summary>
        /// Create a DynamicTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DynamicTable(string name, DynamicTableArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/dynamicTable:DynamicTable", name, args ?? new DynamicTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DynamicTable(string name, Input<string> id, DynamicTableState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/dynamicTable:DynamicTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DynamicTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DynamicTable Get(string name, Input<string> id, DynamicTableState? state = null, CustomResourceOptions? options = null)
        {
            return new DynamicTable(name, id, state, options);
        }
    }

    public sealed class DynamicTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the dynamic table.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the dynamic table.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
        /// </summary>
        [Input("initialize")]
        public Input<string>? Initialize { get; set; }

        /// <summary>
        /// Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies whether to replace the dynamic table if it already exists.
        /// </summary>
        [Input("orReplace")]
        public Input<bool>? OrReplace { get; set; }

        /// <summary>
        /// Specifies the query to use to populate the dynamic table.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
        /// </summary>
        [Input("refreshMode")]
        public Input<string>? RefreshMode { get; set; }

        /// <summary>
        /// The schema in which to create the dynamic table.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies the target lag time for the dynamic table.
        /// </summary>
        [Input("targetLag", required: true)]
        public Input<Inputs.DynamicTableTargetLagArgs> TargetLag { get; set; } = null!;

        /// <summary>
        /// The warehouse in which to create the dynamic table.
        /// </summary>
        [Input("warehouse", required: true)]
        public Input<string> Warehouse { get; set; } = null!;

        public DynamicTableArgs()
        {
        }
        public static new DynamicTableArgs Empty => new DynamicTableArgs();
    }

    public sealed class DynamicTableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
        /// </summary>
        [Input("automaticClustering")]
        public Input<bool>? AutomaticClustering { get; set; }

        /// <summary>
        /// Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
        /// </summary>
        [Input("bytes")]
        public Input<int>? Bytes { get; set; }

        /// <summary>
        /// The clustering key for the dynamic table.
        /// </summary>
        [Input("clusterBy")]
        public Input<string>? ClusterBy { get; set; }

        /// <summary>
        /// Specifies a comment for the dynamic table.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Time when this dynamic table was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Timestamp of the data in the base object(s) that is included in the dynamic table.
        /// </summary>
        [Input("dataTimestamp")]
        public Input<string>? DataTimestamp { get; set; }

        /// <summary>
        /// The database in which to create the dynamic table.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
        /// </summary>
        [Input("initialize")]
        public Input<string>? Initialize { get; set; }

        /// <summary>
        /// TRUE if the dynamic table has been cloned, else FALSE.
        /// </summary>
        [Input("isClone")]
        public Input<bool>? IsClone { get; set; }

        /// <summary>
        /// TRUE if the dynamic table is a replica. else FALSE.
        /// </summary>
        [Input("isReplica")]
        public Input<bool>? IsReplica { get; set; }

        /// <summary>
        /// Timestamp of last suspension.
        /// </summary>
        [Input("lastSuspendedOn")]
        public Input<string>? LastSuspendedOn { get; set; }

        /// <summary>
        /// Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies whether to replace the dynamic table if it already exists.
        /// </summary>
        [Input("orReplace")]
        public Input<bool>? OrReplace { get; set; }

        /// <summary>
        /// Role that owns the dynamic table.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Specifies the query to use to populate the dynamic table.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
        /// </summary>
        [Input("refreshMode")]
        public Input<string>? RefreshMode { get; set; }

        /// <summary>
        /// Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
        /// </summary>
        [Input("refreshModeReason")]
        public Input<string>? RefreshModeReason { get; set; }

        /// <summary>
        /// Number of rows in the table.
        /// </summary>
        [Input("rows")]
        public Input<int>? Rows { get; set; }

        /// <summary>
        /// Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
        /// </summary>
        [Input("schedulingState")]
        public Input<string>? SchedulingState { get; set; }

        /// <summary>
        /// The schema in which to create the dynamic table.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies the target lag time for the dynamic table.
        /// </summary>
        [Input("targetLag")]
        public Input<Inputs.DynamicTableTargetLagGetArgs>? TargetLag { get; set; }

        /// <summary>
        /// The warehouse in which to create the dynamic table.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public DynamicTableState()
        {
        }
        public static new DynamicTableState Empty => new DynamicTableState();
    }
}
