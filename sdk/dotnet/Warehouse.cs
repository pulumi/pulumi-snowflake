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
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var warehouse = new Snowflake.Warehouse("warehouse", new Snowflake.WarehouseArgs
    ///         {
    ///             Comment = "foo",
    ///             WarehouseSize = "small",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/warehouse:Warehouse example warehouseName
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/warehouse:Warehouse")]
    public partial class Warehouse : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
        /// </summary>
        [Output("autoResume")]
        public Output<bool> AutoResume { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
        /// </summary>
        [Output("autoSuspend")]
        public Output<int> AutoSuspend { get; private set; } = null!;

        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
        /// </summary>
        [Output("initiallySuspended")]
        public Output<bool?> InitiallySuspended { get; private set; } = null!;

        /// <summary>
        /// Specifies the maximum number of server clusters for the warehouse.
        /// </summary>
        [Output("maxClusterCount")]
        public Output<int> MaxClusterCount { get; private set; } = null!;

        /// <summary>
        /// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
        /// </summary>
        [Output("maxConcurrencyLevel")]
        public Output<int?> MaxConcurrencyLevel { get; private set; } = null!;

        /// <summary>
        /// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
        /// </summary>
        [Output("minClusterCount")]
        public Output<int> MinClusterCount { get; private set; } = null!;

        /// <summary>
        /// Identifier for the virtual warehouse; must be unique for your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
        /// </summary>
        [Output("resourceMonitor")]
        public Output<string> ResourceMonitor { get; private set; } = null!;

        /// <summary>
        /// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
        /// </summary>
        [Output("scalingPolicy")]
        public Output<string> ScalingPolicy { get; private set; } = null!;

        /// <summary>
        /// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
        /// </summary>
        [Output("statementQueuedTimeoutInSeconds")]
        public Output<int?> StatementQueuedTimeoutInSeconds { get; private set; } = null!;

        /// <summary>
        /// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
        /// </summary>
        [Output("statementTimeoutInSeconds")]
        public Output<int?> StatementTimeoutInSeconds { get; private set; } = null!;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.WarehouseTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
        /// </summary>
        [Output("waitForProvisioning")]
        public Output<bool?> WaitForProvisioning { get; private set; } = null!;

        /// <summary>
        /// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
        /// </summary>
        [Output("warehouseSize")]
        public Output<string> WarehouseSize { get; private set; } = null!;


        /// <summary>
        /// Create a Warehouse resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Warehouse(string name, WarehouseArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/warehouse:Warehouse", name, args ?? new WarehouseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Warehouse(string name, Input<string> id, WarehouseState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/warehouse:Warehouse", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Warehouse resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Warehouse Get(string name, Input<string> id, WarehouseState? state = null, CustomResourceOptions? options = null)
        {
            return new Warehouse(name, id, state, options);
        }
    }

    public sealed class WarehouseArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
        /// </summary>
        [Input("autoResume")]
        public Input<bool>? AutoResume { get; set; }

        /// <summary>
        /// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
        /// </summary>
        [Input("autoSuspend")]
        public Input<int>? AutoSuspend { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
        /// </summary>
        [Input("initiallySuspended")]
        public Input<bool>? InitiallySuspended { get; set; }

        /// <summary>
        /// Specifies the maximum number of server clusters for the warehouse.
        /// </summary>
        [Input("maxClusterCount")]
        public Input<int>? MaxClusterCount { get; set; }

        /// <summary>
        /// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
        /// </summary>
        [Input("maxConcurrencyLevel")]
        public Input<int>? MaxConcurrencyLevel { get; set; }

        /// <summary>
        /// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
        /// </summary>
        [Input("minClusterCount")]
        public Input<int>? MinClusterCount { get; set; }

        /// <summary>
        /// Identifier for the virtual warehouse; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
        /// </summary>
        [Input("resourceMonitor")]
        public Input<string>? ResourceMonitor { get; set; }

        /// <summary>
        /// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
        /// </summary>
        [Input("scalingPolicy")]
        public Input<string>? ScalingPolicy { get; set; }

        /// <summary>
        /// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
        /// </summary>
        [Input("statementQueuedTimeoutInSeconds")]
        public Input<int>? StatementQueuedTimeoutInSeconds { get; set; }

        /// <summary>
        /// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
        /// </summary>
        [Input("statementTimeoutInSeconds")]
        public Input<int>? StatementTimeoutInSeconds { get; set; }

        [Input("tags")]
        private InputList<Inputs.WarehouseTagArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        public InputList<Inputs.WarehouseTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.WarehouseTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
        /// </summary>
        [Input("waitForProvisioning")]
        public Input<bool>? WaitForProvisioning { get; set; }

        /// <summary>
        /// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
        /// </summary>
        [Input("warehouseSize")]
        public Input<string>? WarehouseSize { get; set; }

        public WarehouseArgs()
        {
        }
    }

    public sealed class WarehouseState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
        /// </summary>
        [Input("autoResume")]
        public Input<bool>? AutoResume { get; set; }

        /// <summary>
        /// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
        /// </summary>
        [Input("autoSuspend")]
        public Input<int>? AutoSuspend { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
        /// </summary>
        [Input("initiallySuspended")]
        public Input<bool>? InitiallySuspended { get; set; }

        /// <summary>
        /// Specifies the maximum number of server clusters for the warehouse.
        /// </summary>
        [Input("maxClusterCount")]
        public Input<int>? MaxClusterCount { get; set; }

        /// <summary>
        /// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
        /// </summary>
        [Input("maxConcurrencyLevel")]
        public Input<int>? MaxConcurrencyLevel { get; set; }

        /// <summary>
        /// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
        /// </summary>
        [Input("minClusterCount")]
        public Input<int>? MinClusterCount { get; set; }

        /// <summary>
        /// Identifier for the virtual warehouse; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
        /// </summary>
        [Input("resourceMonitor")]
        public Input<string>? ResourceMonitor { get; set; }

        /// <summary>
        /// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
        /// </summary>
        [Input("scalingPolicy")]
        public Input<string>? ScalingPolicy { get; set; }

        /// <summary>
        /// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
        /// </summary>
        [Input("statementQueuedTimeoutInSeconds")]
        public Input<int>? StatementQueuedTimeoutInSeconds { get; set; }

        /// <summary>
        /// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
        /// </summary>
        [Input("statementTimeoutInSeconds")]
        public Input<int>? StatementTimeoutInSeconds { get; set; }

        [Input("tags")]
        private InputList<Inputs.WarehouseTagGetArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        public InputList<Inputs.WarehouseTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.WarehouseTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
        /// </summary>
        [Input("waitForProvisioning")]
        public Input<bool>? WaitForProvisioning { get; set; }

        /// <summary>
        /// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
        /// </summary>
        [Input("warehouseSize")]
        public Input<string>? WarehouseSize { get; set; }

        public WarehouseState()
        {
        }
    }
}
