// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.DatabaseArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.DatabaseState;
import com.pulumi.snowflake.outputs.DatabaseReplication;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 * 
 * Represents a standard database. If replication configuration is specified, the database is promoted to serve as a primary database for replication.
 * 
 * ## Minimal
 * 
 * resource &#34;snowflake.Database&#34; &#34;primary&#34; {
 *   name = &#34;database_name&#34;
 * }
 * 
 * ## Complete (with every optional set)
 * 
 * resource &#34;snowflake.Database&#34; &#34;primary&#34; {
 *   name         = &#34;database_name&#34;
 *   is_transient = false
 *   comment      = &#34;my standard database&#34;
 * 
 *   data_retention_time_in_days                   = 10
 *   data_retention_time_in_days_save              = 10
 *   max_data_extension_time_in_days               = 20
 *   external_volume                               = &#34;&lt;external_volume_name&gt;&#34;
 *   catalog                                       = &#34;&lt;catalog_name&gt;&#34;
 *   replace_invalid_characters                    = false
 *   default_ddl_collation                         = &#34;en_US&#34;
 *   storage_serialization_policy                  = &#34;COMPATIBLE&#34;
 *   log_level                                     = &#34;INFO&#34;
 *   trace_level                                   = &#34;ALWAYS&#34;
 *   suspend_task_after_num_failures               = 10
 *   task_auto_retry_attempts                      = 10
 *   user_task_managed_initial_warehouse_size      = &#34;LARGE&#34;
 *   user_task_timeout_ms                          = 3600000
 *   user_task_minimum_trigger_interval_in_seconds = 120
 *   quoted_identifiers_ignore_case                = false
 *   enable_console_output                         = false
 * 
 *   replication {
 *     enable_to_account {
 *       account_identifier = &#34;&lt;secondary_account_organization_name&gt;.&lt;secondary_account_name&gt;&#34;
 *       with_failover      = true
 *     }
 *     ignore_edition_check = true
 *   }
 * }
 * 
 * ## Replication with for_each
 * 
 * locals {
 *   replication_configs = [
 *     {
 *       account_identifier = &#34;&lt;secondary_account_organization_name&gt;.&lt;secondary_account_name&gt;&#34;
 *       with_failover      = true
 *     },
 *     {
 *       account_identifier = &#34;&lt;secondary_account_organization_name&gt;.&lt;secondary_account_name&gt;&#34;
 *       with_failover      = true
 *     },
 *   ]
 * }
 * 
 * resource &#34;snowflake.Database&#34; &#34;primary&#34; {
 *   name     = &#34;database_name&#34;
 *   for_each = local.replication_configs
 * 
 *   replication {
 *     enable_to_account    = each.value
 *     ignore_edition_check = true
 *   }
 * }
 * 
 */
@ResourceType(type="snowflake:index/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     * 
     */
    @Export(name="catalog", refs={String.class}, tree="[0]")
    private Output<String> catalog;

    /**
     * @return The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     * 
     */
    public Output<String> catalog() {
        return this.catalog;
    }
    /**
     * Specifies a comment for the database.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the database.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
     * 
     */
    @Export(name="dataRetentionTimeInDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> dataRetentionTimeInDays;

    /**
     * @return Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
     * 
     */
    public Output<Integer> dataRetentionTimeInDays() {
        return this.dataRetentionTimeInDays;
    }
    /**
     * Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     * 
     */
    @Export(name="defaultDdlCollation", refs={String.class}, tree="[0]")
    private Output<String> defaultDdlCollation;

    /**
     * @return Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     * 
     */
    public Output<String> defaultDdlCollation() {
        return this.defaultDdlCollation;
    }
    /**
     * If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     * 
     */
    @Export(name="enableConsoleOutput", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableConsoleOutput;

    /**
     * @return If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     * 
     */
    public Output<Boolean> enableConsoleOutput() {
        return this.enableConsoleOutput;
    }
    /**
     * The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     * 
     */
    @Export(name="externalVolume", refs={String.class}, tree="[0]")
    private Output<String> externalVolume;

    /**
     * @return The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     * 
     */
    public Output<String> externalVolume() {
        return this.externalVolume;
    }
    /**
     * Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    @Export(name="isTransient", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isTransient;

    /**
     * @return Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    public Output<Optional<Boolean>> isTransient() {
        return Codegen.optional(this.isTransient);
    }
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     * 
     */
    @Export(name="logLevel", refs={String.class}, tree="[0]")
    private Output<String> logLevel;

    /**
     * @return Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     * 
     */
    public Output<String> logLevel() {
        return this.logLevel;
    }
    /**
     * Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
     * 
     */
    @Export(name="maxDataExtensionTimeInDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxDataExtensionTimeInDays;

    /**
     * @return Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
     * 
     */
    public Output<Integer> maxDataExtensionTimeInDays() {
        return this.maxDataExtensionTimeInDays;
    }
    /**
     * Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. &#39;\n\n.\n\n.\n\n&#39;) by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. &#39;\n\n.\n\n.\n\n&#39;) by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     * 
     */
    @Export(name="quotedIdentifiersIgnoreCase", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> quotedIdentifiersIgnoreCase;

    /**
     * @return If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     * 
     */
    public Output<Boolean> quotedIdentifiersIgnoreCase() {
        return this.quotedIdentifiersIgnoreCase;
    }
    /**
     * Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     * 
     */
    @Export(name="replaceInvalidCharacters", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> replaceInvalidCharacters;

    /**
     * @return Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     * 
     */
    public Output<Boolean> replaceInvalidCharacters() {
        return this.replaceInvalidCharacters;
    }
    /**
     * Configures replication for a given database. When specified, this database will be promoted to serve as a primary database for replication. A primary database can be replicated in one or more accounts, allowing users in those accounts to query objects in each secondary (i.e. replica) database.
     * 
     */
    @Export(name="replication", refs={DatabaseReplication.class}, tree="[0]")
    private Output</* @Nullable */ DatabaseReplication> replication;

    /**
     * @return Configures replication for a given database. When specified, this database will be promoted to serve as a primary database for replication. A primary database can be replicated in one or more accounts, allowing users in those accounts to query objects in each secondary (i.e. replica) database.
     * 
     */
    public Output<Optional<DatabaseReplication>> replication() {
        return Codegen.optional(this.replication);
    }
    /**
     * The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     * 
     */
    @Export(name="storageSerializationPolicy", refs={String.class}, tree="[0]")
    private Output<String> storageSerializationPolicy;

    /**
     * @return The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     * 
     */
    public Output<String> storageSerializationPolicy() {
        return this.storageSerializationPolicy;
    }
    /**
     * How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     * 
     */
    @Export(name="suspendTaskAfterNumFailures", refs={Integer.class}, tree="[0]")
    private Output<Integer> suspendTaskAfterNumFailures;

    /**
     * @return How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     * 
     */
    public Output<Integer> suspendTaskAfterNumFailures() {
        return this.suspendTaskAfterNumFailures;
    }
    /**
     * Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     * 
     */
    @Export(name="taskAutoRetryAttempts", refs={Integer.class}, tree="[0]")
    private Output<Integer> taskAutoRetryAttempts;

    /**
     * @return Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     * 
     */
    public Output<Integer> taskAutoRetryAttempts() {
        return this.taskAutoRetryAttempts;
    }
    /**
     * Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     * 
     */
    @Export(name="traceLevel", refs={String.class}, tree="[0]")
    private Output<String> traceLevel;

    /**
     * @return Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     * 
     */
    public Output<String> traceLevel() {
        return this.traceLevel;
    }
    /**
     * The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     * 
     */
    @Export(name="userTaskManagedInitialWarehouseSize", refs={String.class}, tree="[0]")
    private Output<String> userTaskManagedInitialWarehouseSize;

    /**
     * @return The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     * 
     */
    public Output<String> userTaskManagedInitialWarehouseSize() {
        return this.userTaskManagedInitialWarehouseSize;
    }
    /**
     * Minimum amount of time between Triggered Task executions in seconds.
     * 
     */
    @Export(name="userTaskMinimumTriggerIntervalInSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> userTaskMinimumTriggerIntervalInSeconds;

    /**
     * @return Minimum amount of time between Triggered Task executions in seconds.
     * 
     */
    public Output<Integer> userTaskMinimumTriggerIntervalInSeconds() {
        return this.userTaskMinimumTriggerIntervalInSeconds;
    }
    /**
     * User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     * 
     */
    @Export(name="userTaskTimeoutMs", refs={Integer.class}, tree="[0]")
    private Output<Integer> userTaskTimeoutMs;

    /**
     * @return User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     * 
     */
    public Output<Integer> userTaskTimeoutMs() {
        return this.userTaskTimeoutMs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, @Nullable DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, @Nullable DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/database:Database", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/database:Database", name, state, makeResourceOptions(options, id));
    }

    private static DatabaseArgs makeArgs(@Nullable DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
