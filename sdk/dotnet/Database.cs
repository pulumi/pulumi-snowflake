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
    /// Represents a standard database. If replication configuration is specified, the database is promoted to serve as a primary database for replication.
    /// 
    /// ## Minimal
    /// 
    /// resource "snowflake.Database" "primary" {
    ///   name = "database_name"
    /// }
    /// 
    /// ## Complete (with every optional set)
    /// 
    /// resource "snowflake.Database" "primary" {
    ///   name         = "database_name"
    ///   is_transient = false
    ///   comment      = "my standard database"
    /// 
    ///   data_retention_time_in_days                   = 10
    ///   data_retention_time_in_days_save              = 10
    ///   max_data_extension_time_in_days               = 20
    ///   external_volume                               = "&lt;external_volume_name&gt;"
    ///   catalog                                       = "&lt;catalog_name&gt;"
    ///   replace_invalid_characters                    = false
    ///   default_ddl_collation                         = "en_US"
    ///   storage_serialization_policy                  = "COMPATIBLE"
    ///   log_level                                     = "INFO"
    ///   trace_level                                   = "ALWAYS"
    ///   suspend_task_after_num_failures               = 10
    ///   task_auto_retry_attempts                      = 10
    ///   user_task_managed_initial_warehouse_size      = "LARGE"
    ///   user_task_timeout_ms                          = 3600000
    ///   user_task_minimum_trigger_interval_in_seconds = 120
    ///   quoted_identifiers_ignore_case                = false
    ///   enable_console_output                         = false
    /// 
    ///   replication {
    ///     enable_to_account {
    ///       account_identifier = "&lt;secondary_account_organization_name&gt;.&lt;secondary_account_name&gt;"
    ///       with_failover      = true
    ///     }
    ///     ignore_edition_check = true
    ///   }
    /// }
    /// 
    /// ## Replication with for_each
    /// 
    /// locals {
    ///   replication_configs = [
    ///     {
    ///       account_identifier = "&lt;secondary_account_organization_name&gt;.&lt;secondary_account_name&gt;"
    ///       with_failover      = true
    ///     },
    ///     {
    ///       account_identifier = "&lt;secondary_account_organization_name&gt;.&lt;secondary_account_name&gt;"
    ///       with_failover      = true
    ///     },
    ///   ]
    /// }
    /// 
    /// resource "snowflake.Database" "primary" {
    ///   name     = "database_name"
    ///   for_each = local.replication_configs
    /// 
    ///   replication {
    ///     enable_to_account    = each.value
    ///     ignore_edition_check = true
    ///   }
    /// }
    /// </summary>
    [SnowflakeResourceType("snowflake:index/database:Database")]
    public partial class Database : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
        /// </summary>
        [Output("catalog")]
        public Output<string> Catalog { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
        /// </summary>
        [Output("dataRetentionTimeInDays")]
        public Output<int> DataRetentionTimeInDays { get; private set; } = null!;

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
        /// The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
        /// </summary>
        [Output("externalVolume")]
        public Output<string> ExternalVolume { get; private set; } = null!;

        /// <summary>
        /// Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Output("isTransient")]
        public Output<bool?> IsTransient { get; private set; } = null!;

        /// <summary>
        /// Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
        /// </summary>
        [Output("logLevel")]
        public Output<string> LogLevel { get; private set; } = null!;

        /// <summary>
        /// Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
        /// </summary>
        [Output("maxDataExtensionTimeInDays")]
        public Output<int> MaxDataExtensionTimeInDays { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. '\n\n.\n\n.\n\n') by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
        /// </summary>
        [Output("quotedIdentifiersIgnoreCase")]
        public Output<bool> QuotedIdentifiersIgnoreCase { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
        /// </summary>
        [Output("replaceInvalidCharacters")]
        public Output<bool> ReplaceInvalidCharacters { get; private set; } = null!;

        /// <summary>
        /// Configures replication for a given database. When specified, this database will be promoted to serve as a primary database for replication. A primary database can be replicated in one or more accounts, allowing users in those accounts to query objects in each secondary (i.e. replica) database.
        /// </summary>
        [Output("replication")]
        public Output<Outputs.DatabaseReplication?> Replication { get; private set; } = null!;

        /// <summary>
        /// The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
        /// </summary>
        [Output("storageSerializationPolicy")]
        public Output<string> StorageSerializationPolicy { get; private set; } = null!;

        /// <summary>
        /// How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
        /// </summary>
        [Output("suspendTaskAfterNumFailures")]
        public Output<int> SuspendTaskAfterNumFailures { get; private set; } = null!;

        /// <summary>
        /// Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
        /// </summary>
        [Output("taskAutoRetryAttempts")]
        public Output<int> TaskAutoRetryAttempts { get; private set; } = null!;

        /// <summary>
        /// Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
        /// </summary>
        [Output("traceLevel")]
        public Output<string> TraceLevel { get; private set; } = null!;

        /// <summary>
        /// The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
        /// </summary>
        [Output("userTaskManagedInitialWarehouseSize")]
        public Output<string> UserTaskManagedInitialWarehouseSize { get; private set; } = null!;

        /// <summary>
        /// Minimum amount of time between Triggered Task executions in seconds.
        /// </summary>
        [Output("userTaskMinimumTriggerIntervalInSeconds")]
        public Output<int> UserTaskMinimumTriggerIntervalInSeconds { get; private set; } = null!;

        /// <summary>
        /// User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
        /// </summary>
        [Output("userTaskTimeoutMs")]
        public Output<int> UserTaskTimeoutMs { get; private set; } = null!;


        /// <summary>
        /// Create a Database resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Database(string name, DatabaseArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/database:Database", name, args ?? new DatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Database(string name, Input<string> id, DatabaseState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/database:Database", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Database resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Database Get(string name, Input<string> id, DatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new Database(name, id, state, options);
        }
    }

    public sealed class DatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
        /// </summary>
        [Input("catalog")]
        public Input<string>? Catalog { get; set; }

        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
        /// </summary>
        [Input("dataRetentionTimeInDays")]
        public Input<int>? DataRetentionTimeInDays { get; set; }

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
        /// The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
        /// </summary>
        [Input("externalVolume")]
        public Input<string>? ExternalVolume { get; set; }

        /// <summary>
        /// Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
        /// </summary>
        [Input("maxDataExtensionTimeInDays")]
        public Input<int>? MaxDataExtensionTimeInDays { get; set; }

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. '\n\n.\n\n.\n\n') by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
        /// </summary>
        [Input("quotedIdentifiersIgnoreCase")]
        public Input<bool>? QuotedIdentifiersIgnoreCase { get; set; }

        /// <summary>
        /// Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
        /// </summary>
        [Input("replaceInvalidCharacters")]
        public Input<bool>? ReplaceInvalidCharacters { get; set; }

        /// <summary>
        /// Configures replication for a given database. When specified, this database will be promoted to serve as a primary database for replication. A primary database can be replicated in one or more accounts, allowing users in those accounts to query objects in each secondary (i.e. replica) database.
        /// </summary>
        [Input("replication")]
        public Input<Inputs.DatabaseReplicationArgs>? Replication { get; set; }

        /// <summary>
        /// The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
        /// </summary>
        [Input("storageSerializationPolicy")]
        public Input<string>? StorageSerializationPolicy { get; set; }

        /// <summary>
        /// How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
        /// </summary>
        [Input("suspendTaskAfterNumFailures")]
        public Input<int>? SuspendTaskAfterNumFailures { get; set; }

        /// <summary>
        /// Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
        /// </summary>
        [Input("taskAutoRetryAttempts")]
        public Input<int>? TaskAutoRetryAttempts { get; set; }

        /// <summary>
        /// Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        /// <summary>
        /// The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
        /// </summary>
        [Input("userTaskManagedInitialWarehouseSize")]
        public Input<string>? UserTaskManagedInitialWarehouseSize { get; set; }

        /// <summary>
        /// Minimum amount of time between Triggered Task executions in seconds.
        /// </summary>
        [Input("userTaskMinimumTriggerIntervalInSeconds")]
        public Input<int>? UserTaskMinimumTriggerIntervalInSeconds { get; set; }

        /// <summary>
        /// User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
        /// </summary>
        [Input("userTaskTimeoutMs")]
        public Input<int>? UserTaskTimeoutMs { get; set; }

        public DatabaseArgs()
        {
        }
        public static new DatabaseArgs Empty => new DatabaseArgs();
    }

    public sealed class DatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
        /// </summary>
        [Input("catalog")]
        public Input<string>? Catalog { get; set; }

        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
        /// </summary>
        [Input("dataRetentionTimeInDays")]
        public Input<int>? DataRetentionTimeInDays { get; set; }

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
        /// The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
        /// </summary>
        [Input("externalVolume")]
        public Input<string>? ExternalVolume { get; set; }

        /// <summary>
        /// Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
        /// </summary>
        [Input("maxDataExtensionTimeInDays")]
        public Input<int>? MaxDataExtensionTimeInDays { get; set; }

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. '\n\n.\n\n.\n\n') by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
        /// </summary>
        [Input("quotedIdentifiersIgnoreCase")]
        public Input<bool>? QuotedIdentifiersIgnoreCase { get; set; }

        /// <summary>
        /// Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
        /// </summary>
        [Input("replaceInvalidCharacters")]
        public Input<bool>? ReplaceInvalidCharacters { get; set; }

        /// <summary>
        /// Configures replication for a given database. When specified, this database will be promoted to serve as a primary database for replication. A primary database can be replicated in one or more accounts, allowing users in those accounts to query objects in each secondary (i.e. replica) database.
        /// </summary>
        [Input("replication")]
        public Input<Inputs.DatabaseReplicationGetArgs>? Replication { get; set; }

        /// <summary>
        /// The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
        /// </summary>
        [Input("storageSerializationPolicy")]
        public Input<string>? StorageSerializationPolicy { get; set; }

        /// <summary>
        /// How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
        /// </summary>
        [Input("suspendTaskAfterNumFailures")]
        public Input<int>? SuspendTaskAfterNumFailures { get; set; }

        /// <summary>
        /// Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
        /// </summary>
        [Input("taskAutoRetryAttempts")]
        public Input<int>? TaskAutoRetryAttempts { get; set; }

        /// <summary>
        /// Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
        /// </summary>
        [Input("traceLevel")]
        public Input<string>? TraceLevel { get; set; }

        /// <summary>
        /// The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
        /// </summary>
        [Input("userTaskManagedInitialWarehouseSize")]
        public Input<string>? UserTaskManagedInitialWarehouseSize { get; set; }

        /// <summary>
        /// Minimum amount of time between Triggered Task executions in seconds.
        /// </summary>
        [Input("userTaskMinimumTriggerIntervalInSeconds")]
        public Input<int>? UserTaskMinimumTriggerIntervalInSeconds { get; set; }

        /// <summary>
        /// User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
        /// </summary>
        [Input("userTaskTimeoutMs")]
        public Input<int>? UserTaskTimeoutMs { get; set; }

        public DatabaseState()
        {
        }
        public static new DatabaseState Empty => new DatabaseState();
    }
}
