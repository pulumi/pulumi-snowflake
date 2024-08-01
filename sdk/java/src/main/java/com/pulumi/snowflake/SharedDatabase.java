// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.SharedDatabaseArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.SharedDatabaseState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 * 
 * A shared database creates a database from a share provided by another Snowflake account. For more information about shares, see [Introduction to Secure Data Sharing](https://docs.snowflake.com/en/user-guide/data-sharing-intro).
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/sharedDatabase:SharedDatabase example &#39;shared_database_name&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/sharedDatabase:SharedDatabase")
public class SharedDatabase extends com.pulumi.resources.CustomResource {
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
     * A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;.&#34;&lt;share_name&gt;&#34;`.
     * 
     */
    @Export(name="fromShare", refs={String.class}, tree="[0]")
    private Output<String> fromShare;

    /**
     * @return A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;.&#34;&lt;share_name&gt;&#34;`.
     * 
     */
    public Output<String> fromShare() {
        return this.fromShare;
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
     * Specifies the identifier for the database; must be unique for your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the database; must be unique for your account.
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
    public SharedDatabase(String name) {
        this(name, SharedDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedDatabase(String name, SharedDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedDatabase(String name, SharedDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/sharedDatabase:SharedDatabase", name, args == null ? SharedDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedDatabase(String name, Output<String> id, @Nullable SharedDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/sharedDatabase:SharedDatabase", name, state, makeResourceOptions(options, id));
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
    public static SharedDatabase get(String name, Output<String> id, @Nullable SharedDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedDatabase(name, id, state, options);
    }
}
