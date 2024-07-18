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
    /// !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
    /// 
    /// A shared database creates a database from a share provided by another Snowflake account. For more information about shares, see [Introduction to Secure Data Sharing](https://docs.snowflake.com/en/user-guide/data-sharing-intro).
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/sharedDatabase:SharedDatabase example 'shared_database_name'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/sharedDatabase:SharedDatabase")]
    public partial class SharedDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The database parameter that specifies the default catalog to use for Iceberg tables.
        /// </summary>
        [Output("catalog")]
        public Output<string> Catalog { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
        /// </summary>
        [Output("defaultDdlCollation")]
        public Output<string> DefaultDdlCollation { get; private set; } = null!;

        /// <summary>
        /// If true, enables stdout/stderr fast path logging for anonymous stored procedures.
        /// </summary>
        [Output("enableConsoleOutput")]
        public Output<bool> EnableConsoleOutput { get; private set; } = null!;

        /// <summary>
        /// The database parameter that specifies the default external volume to use for Iceberg tables.
        /// </summary>
        [Output("externalVolume")]
        public Output<string> ExternalVolume { get; private set; } = null!;

        /// <summary>
        /// A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;share_name&gt;"`.
        /// </summary>
        [Output("fromShare")]
        public Output<string> FromShare { get; private set; } = null!;

        /// <summary>
        /// Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
        /// </summary>
        [Output("logLevel")]
        public Output<string> LogLevel { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// If true, the case of quoted identifiers is ignored.
        /// </summary>
        [Output("quotedIdentifiersIgnoreCase")]
        public Output<bool> QuotedIdentifiersIgnoreCase { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog.
        /// </summary>
        [Output("replaceInvalidCharacters")]
        public Output<bool> ReplaceInvalidCharacters { get; private set; } = null!;

        /// <summary>
        /// The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake.
        /// </summary>
        [Output("storageSerializationPolicy")]
        public Output<string> StorageSerializationPolicy { get; private set; } = null!;

        /// <summary>
        /// How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending.
        /// </summary>
        [Output("suspendTaskAfterNumFailures")]
        public Output<int> SuspendTaskAfterNumFailures { get; private set; } = null!;

        /// <summary>
        /// Maximum automatic retries allowed for a user task.
        /// </summary>
        [Output("taskAutoRetryAttempts")]
        public Output<int> TaskAutoRetryAttempts { get; private set; } = null!;

        /// <summary>
        /// Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
        /// </summary>
        [Output("traceLevel")]
        public Output<string> TraceLevel { get; private set; } = null!;

        /// <summary>
        /// The initial size of warehouse to use for managed warehouses in the absence of history.
        /// </summary>
        [Output("userTaskManagedInitialWarehouseSize")]
        public Output<string> UserTaskManagedInitialWarehouseSize { get; private set; } = null!;

        /// <summary>
        /// Minimum amount of time between Triggered Task executions in seconds.
        /// </summary>
        [Output("userTaskMinimumTriggerIntervalInSeconds")]
        public Output<int> UserTaskMinimumTriggerIntervalInSeconds { get; private set; } = null!;

        /// <summary>
        /// User task execution timeout in milliseconds.
        /// </summary>
        [Output("userTaskTimeoutMs")]
        public Output<int> UserTaskTimeoutMs { get; private set; } = null!;


        /// <summary>
        /// Create a SharedDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SharedDatabase(string name, SharedDatabaseArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/sharedDatabase:SharedDatabase", name, args ?? new SharedDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SharedDatabase(string name, Input<string> id, SharedDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/sharedDatabase:SharedDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SharedDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SharedDatabase Get(string name, Input<string> id, SharedDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new SharedDatabase(name, id, state, options);
        }
    }

    public sealed class SharedDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The database parameter that specifies the default catalog to use for Iceberg tables.
        /// </summary>
        [Input("catalog")]
        public Input<string>? Catalog { get; set; }

        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
        /// </summary>
        [Input("defaultDdlCollation")]
        public Input<string>? DefaultDdlCollation { get; set; }

        /// <summary>
        /// If true, enables stdout/stderr fast path logging for anonymous stored procedures.
        /// </summary>
        [Input("enableConsoleOutput")]
        public Input<bool>? EnableConsoleOutput { get; set; }

        /// <summary>
        /// The database parameter that specifies the default external volume to use for Iceberg tables.
        /// </summary>
        [Input("externalVolume")]
        public Input<string>? ExternalVolume { get; set; }

        /// <summary>
        /// A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;share_name&gt;"`.
        /// </summary>
        [Input("fromShare", required: true)]
        public Input<string> FromShare { get; set; } = null!;

        /// <summary>
        /// Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If true, the case of quoted identifiers is ignored.
        /// </summary>
        [Input("quotedIdentifiersIgnoreCase")]
        public Input<bool>? QuotedIdentifiersIgnoreCase { get; set; }

        /// <summary>
        /// Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog.
        /// </summary>
        [Input("replaceInvalidCharacters")]
        public Input<bool>? ReplaceInvalidCharacters { get; set; }

        /// <summary>
        /// The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake.
        /// </summary>
        [Input("storageSerializationPolicy")]
        public Input<string>? StorageSerializationPolicy { get; set; }

        /// <summary>
        /// How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending.
        /// </summary>
        [Input("suspendTaskAfterNumFailures")]
        public Input<int>? SuspendTaskAfterNumFailures { get; set; }

        /// <summary>
        /// Maximum automatic retries allowed for a user task.
        /// </summary>
        [Input("taskAutoRetryAttempts")]
        public Input<int>? TaskAutoRetryAttempts { get; set; }

        /// <summary>
        /// Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        /// <summary>
        /// The initial size of warehouse to use for managed warehouses in the absence of history.
        /// </summary>
        [Input("userTaskManagedInitialWarehouseSize")]
        public Input<string>? UserTaskManagedInitialWarehouseSize { get; set; }

        /// <summary>
        /// Minimum amount of time between Triggered Task executions in seconds.
        /// </summary>
        [Input("userTaskMinimumTriggerIntervalInSeconds")]
        public Input<int>? UserTaskMinimumTriggerIntervalInSeconds { get; set; }

        /// <summary>
        /// User task execution timeout in milliseconds.
        /// </summary>
        [Input("userTaskTimeoutMs")]
        public Input<int>? UserTaskTimeoutMs { get; set; }

        public SharedDatabaseArgs()
        {
        }
        public static new SharedDatabaseArgs Empty => new SharedDatabaseArgs();
    }

    public sealed class SharedDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The database parameter that specifies the default catalog to use for Iceberg tables.
        /// </summary>
        [Input("catalog")]
        public Input<string>? Catalog { get; set; }

        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
        /// </summary>
        [Input("defaultDdlCollation")]
        public Input<string>? DefaultDdlCollation { get; set; }

        /// <summary>
        /// If true, enables stdout/stderr fast path logging for anonymous stored procedures.
        /// </summary>
        [Input("enableConsoleOutput")]
        public Input<bool>? EnableConsoleOutput { get; set; }

        /// <summary>
        /// The database parameter that specifies the default external volume to use for Iceberg tables.
        /// </summary>
        [Input("externalVolume")]
        public Input<string>? ExternalVolume { get; set; }

        /// <summary>
        /// A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;share_name&gt;"`.
        /// </summary>
        [Input("fromShare")]
        public Input<string>? FromShare { get; set; }

        /// <summary>
        /// Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If true, the case of quoted identifiers is ignored.
        /// </summary>
        [Input("quotedIdentifiersIgnoreCase")]
        public Input<bool>? QuotedIdentifiersIgnoreCase { get; set; }

        /// <summary>
        /// Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog.
        /// </summary>
        [Input("replaceInvalidCharacters")]
        public Input<bool>? ReplaceInvalidCharacters { get; set; }

        /// <summary>
        /// The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake.
        /// </summary>
        [Input("storageSerializationPolicy")]
        public Input<string>? StorageSerializationPolicy { get; set; }

        /// <summary>
        /// How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending.
        /// </summary>
        [Input("suspendTaskAfterNumFailures")]
        public Input<int>? SuspendTaskAfterNumFailures { get; set; }

        /// <summary>
        /// Maximum automatic retries allowed for a user task.
        /// </summary>
        [Input("taskAutoRetryAttempts")]
        public Input<int>? TaskAutoRetryAttempts { get; set; }

        /// <summary>
        /// Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        /// <summary>
        /// The initial size of warehouse to use for managed warehouses in the absence of history.
        /// </summary>
        [Input("userTaskManagedInitialWarehouseSize")]
        public Input<string>? UserTaskManagedInitialWarehouseSize { get; set; }

        /// <summary>
        /// Minimum amount of time between Triggered Task executions in seconds.
        /// </summary>
        [Input("userTaskMinimumTriggerIntervalInSeconds")]
        public Input<int>? UserTaskMinimumTriggerIntervalInSeconds { get; set; }

        /// <summary>
        /// User task execution timeout in milliseconds.
        /// </summary>
        [Input("userTaskTimeoutMs")]
        public Input<int>? UserTaskTimeoutMs { get; set; }

        public SharedDatabaseState()
        {
        }
        public static new SharedDatabaseState Empty => new SharedDatabaseState();
    }
}
