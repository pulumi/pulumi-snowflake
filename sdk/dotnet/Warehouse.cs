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
    /// $ pulumi import snowflake:index/warehouse:Warehouse example '"&lt;warehouse_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/warehouse:Warehouse")]
    public partial class Warehouse : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("autoResume")]
        public Output<string?> AutoResume { get; private set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
        /// </summary>
        [Output("autoSuspend")]
        public Output<int?> AutoSuspend { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the warehouse.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("enableQueryAcceleration")]
        public Output<string?> EnableQueryAcceleration { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
        /// </summary>
        [Output("initiallySuspended")]
        public Output<bool?> InitiallySuspended { get; private set; } = null!;

        /// <summary>
        /// Specifies the maximum number of server clusters for the warehouse.
        /// </summary>
        [Output("maxClusterCount")]
        public Output<int?> MaxClusterCount { get; private set; } = null!;

        /// <summary>
        /// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
        /// </summary>
        [Output("maxConcurrencyLevel")]
        public Output<int> MaxConcurrencyLevel { get; private set; } = null!;

        /// <summary>
        /// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
        /// </summary>
        [Output("minClusterCount")]
        public Output<int?> MinClusterCount { get; private set; } = null!;

        /// <summary>
        /// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.WarehouseParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
        /// </summary>
        [Output("queryAccelerationMaxScaleFactor")]
        public Output<int?> QueryAccelerationMaxScaleFactor { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
        /// </summary>
        [Output("resourceMonitor")]
        public Output<string?> ResourceMonitor { get; private set; } = null!;

        /// <summary>
        /// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
        /// </summary>
        [Output("scalingPolicy")]
        public Output<string?> ScalingPolicy { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.WarehouseShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
        /// </summary>
        [Output("statementQueuedTimeoutInSeconds")]
        public Output<int> StatementQueuedTimeoutInSeconds { get; private set; } = null!;

        /// <summary>
        /// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
        /// </summary>
        [Output("statementTimeoutInSeconds")]
        public Output<int> StatementTimeoutInSeconds { get; private set; } = null!;

        /// <summary>
        /// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
        /// </summary>
        [Output("warehouseSize")]
        public Output<string?> WarehouseSize { get; private set; } = null!;

        /// <summary>
        /// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
        /// </summary>
        [Output("warehouseType")]
        public Output<string?> WarehouseType { get; private set; } = null!;


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

    public sealed class WarehouseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("autoResume")]
        public Input<string>? AutoResume { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
        /// </summary>
        [Input("autoSuspend")]
        public Input<int>? AutoSuspend { get; set; }

        /// <summary>
        /// Specifies a comment for the warehouse.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("enableQueryAcceleration")]
        public Input<string>? EnableQueryAcceleration { get; set; }

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
        /// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
        /// </summary>
        [Input("queryAccelerationMaxScaleFactor")]
        public Input<int>? QueryAccelerationMaxScaleFactor { get; set; }

        /// <summary>
        /// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
        /// </summary>
        [Input("resourceMonitor")]
        public Input<string>? ResourceMonitor { get; set; }

        /// <summary>
        /// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
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

        /// <summary>
        /// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
        /// </summary>
        [Input("warehouseSize")]
        public Input<string>? WarehouseSize { get; set; }

        /// <summary>
        /// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
        /// </summary>
        [Input("warehouseType")]
        public Input<string>? WarehouseType { get; set; }

        public WarehouseArgs()
        {
        }
        public static new WarehouseArgs Empty => new WarehouseArgs();
    }

    public sealed class WarehouseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("autoResume")]
        public Input<string>? AutoResume { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
        /// </summary>
        [Input("autoSuspend")]
        public Input<int>? AutoSuspend { get; set; }

        /// <summary>
        /// Specifies a comment for the warehouse.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("enableQueryAcceleration")]
        public Input<string>? EnableQueryAcceleration { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

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
        /// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputList<Inputs.WarehouseParameterGetArgs>? _parameters;

        /// <summary>
        /// Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
        /// </summary>
        public InputList<Inputs.WarehouseParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.WarehouseParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
        /// </summary>
        [Input("queryAccelerationMaxScaleFactor")]
        public Input<int>? QueryAccelerationMaxScaleFactor { get; set; }

        /// <summary>
        /// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
        /// </summary>
        [Input("resourceMonitor")]
        public Input<string>? ResourceMonitor { get; set; }

        /// <summary>
        /// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
        /// </summary>
        [Input("scalingPolicy")]
        public Input<string>? ScalingPolicy { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.WarehouseShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
        /// </summary>
        public InputList<Inputs.WarehouseShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.WarehouseShowOutputGetArgs>());
            set => _showOutputs = value;
        }

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

        /// <summary>
        /// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
        /// </summary>
        [Input("warehouseSize")]
        public Input<string>? WarehouseSize { get; set; }

        /// <summary>
        /// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
        /// </summary>
        [Input("warehouseType")]
        public Input<string>? WarehouseType { get; set; }

        public WarehouseState()
        {
        }
        public static new WarehouseState Empty => new WarehouseState();
    }
}
