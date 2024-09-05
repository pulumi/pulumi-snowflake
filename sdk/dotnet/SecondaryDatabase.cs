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
    /// $ pulumi import snowflake:index/secondaryDatabase:SecondaryDatabase example 'secondary_database_name'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/secondaryDatabase:SecondaryDatabase")]
    public partial class SecondaryDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A fully qualified path to a database to create a replica from. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;database_name&gt;"`.
        /// </summary>
        [Output("asReplicaOf")]
        public Output<string> AsReplicaOf { get; private set; } = null!;

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
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

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
        /// Specifies the identifier for the database; must be unique for your account. As a best practice for Database Replication and Failover), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
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
        /// Create a SecondaryDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecondaryDatabase(string name, SecondaryDatabaseArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/secondaryDatabase:SecondaryDatabase", name, args ?? new SecondaryDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecondaryDatabase(string name, Input<string> id, SecondaryDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/secondaryDatabase:SecondaryDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecondaryDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecondaryDatabase Get(string name, Input<string> id, SecondaryDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new SecondaryDatabase(name, id, state, options);
        }
    }

    public sealed class SecondaryDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A fully qualified path to a database to create a replica from. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;database_name&gt;"`.
        /// </summary>
        [Input("asReplicaOf", required: true)]
        public Input<string> AsReplicaOf { get; set; } = null!;

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
        /// Specifies the identifier for the database; must be unique for your account. As a best practice for Database Replication and Failover), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
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

        public SecondaryDatabaseArgs()
        {
        }
        public static new SecondaryDatabaseArgs Empty => new SecondaryDatabaseArgs();
    }

    public sealed class SecondaryDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A fully qualified path to a database to create a replica from. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;database_name&gt;"`.
        /// </summary>
        [Input("asReplicaOf")]
        public Input<string>? AsReplicaOf { get; set; }

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
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

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
        /// Specifies the identifier for the database; must be unique for your account. As a best practice for Database Replication and Failover), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
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

        public SecondaryDatabaseState()
        {
        }
        public static new SecondaryDatabaseState Empty => new SecondaryDatabaseState();
    }
}
