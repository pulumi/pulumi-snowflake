// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.SchemaArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.SchemaState;
import com.pulumi.snowflake.outputs.SchemaDescribeOutput;
import com.pulumi.snowflake.outputs.SchemaParameter;
import com.pulumi.snowflake.outputs.SchemaShowOutput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is &lt;database_name&gt;.&lt;schema_name&gt;
 * 
 * ```sh
 * $ pulumi import snowflake:index/schema:Schema example &#39;&#34;&lt;database_name&gt;&#34;.&#34;&lt;schema_name&gt;&#34;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/schema:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
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
     * Specifies a comment for the schema.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the schema.
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
     * The database in which to create the schema.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the schema.
     * 
     */
    public Output<String> database() {
        return this.database;
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
     * Outputs the result of `DESCRIBE SCHEMA` for the given object. In order to handle this output, one must grant sufficient privileges, e.g. grant*ownership on all objects in the schema.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,SchemaDescribeOutput.class}, tree="[0,1]")
    private Output<List<SchemaDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SCHEMA` for the given object. In order to handle this output, one must grant sufficient privileges, e.g. grant*ownership on all objects in the schema.
     * 
     */
    public Output<List<SchemaDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
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
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Export(name="fullyQualifiedName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * Specifies the schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="isTransient", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> isTransient;

    /**
     * @return Specifies the schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> isTransient() {
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
     * Specifies the identifier for the schema; must be unique for the database in which the schema is created. When the name is `PUBLIC`, during creation the provider checks if this schema has already been created and, in such case, `ALTER` is used to match the desired state.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the schema; must be unique for the database in which the schema is created. When the name is `PUBLIC`, during creation the provider checks if this schema has already been created and, in such case, `ALTER` is used to match the desired state.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Outputs the result of `SHOW PARAMETERS IN SCHEMA` for the given object.
     * 
     */
    @Export(name="parameters", refs={List.class,SchemaParameter.class}, tree="[0,1]")
    private Output<List<SchemaParameter>> parameters;

    /**
     * @return Outputs the result of `SHOW PARAMETERS IN SCHEMA` for the given object.
     * 
     */
    public Output<List<SchemaParameter>> parameters() {
        return this.parameters;
    }
    /**
     * Specifies whether to pause a running pipe, primarily in preparation for transferring ownership of the pipe to a different role. For more information, check [PIPE*EXECUTION*PAUSED docs](https://docs.snowflake.com/en/sql-reference/parameters#pipe-execution-paused).
     * 
     */
    @Export(name="pipeExecutionPaused", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> pipeExecutionPaused;

    /**
     * @return Specifies whether to pause a running pipe, primarily in preparation for transferring ownership of the pipe to a different role. For more information, check [PIPE*EXECUTION*PAUSED docs](https://docs.snowflake.com/en/sql-reference/parameters#pipe-execution-paused).
     * 
     */
    public Output<Boolean> pipeExecutionPaused() {
        return this.pipeExecutionPaused;
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
     * Outputs the result of `SHOW SCHEMA` for the given object.
     * 
     */
    @Export(name="showOutputs", refs={List.class,SchemaShowOutput.class}, tree="[0,1]")
    private Output<List<SchemaShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SCHEMA` for the given object.
     * 
     */
    public Output<List<SchemaShowOutput>> showOutputs() {
        return this.showOutputs;
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
     * Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="withManagedAccess", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> withManagedAccess;

    /**
     * @return Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> withManagedAccess() {
        return Codegen.optional(this.withManagedAccess);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(java.lang.String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(java.lang.String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(java.lang.String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/schema:Schema", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Schema(java.lang.String name, Output<java.lang.String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/schema:Schema", name, state, makeResourceOptions(options, id), false);
    }

    private static SchemaArgs makeArgs(SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SchemaArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Schema get(java.lang.String name, Output<java.lang.String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, state, options);
    }
}
