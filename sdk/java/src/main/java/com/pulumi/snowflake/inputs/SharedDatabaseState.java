// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedDatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final SharedDatabaseState Empty = new SharedDatabaseState();

    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     * 
     */
    @Import(name="catalog")
    private @Nullable Output<String> catalog;

    /**
     * @return The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     * 
     */
    public Optional<Output<String>> catalog() {
        return Optional.ofNullable(this.catalog);
    }

    /**
     * Specifies a comment for the database.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the database.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     * 
     */
    @Import(name="defaultDdlCollation")
    private @Nullable Output<String> defaultDdlCollation;

    /**
     * @return Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     * 
     */
    public Optional<Output<String>> defaultDdlCollation() {
        return Optional.ofNullable(this.defaultDdlCollation);
    }

    /**
     * If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     * 
     */
    @Import(name="enableConsoleOutput")
    private @Nullable Output<Boolean> enableConsoleOutput;

    /**
     * @return If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     * 
     */
    public Optional<Output<Boolean>> enableConsoleOutput() {
        return Optional.ofNullable(this.enableConsoleOutput);
    }

    /**
     * The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     * 
     */
    @Import(name="externalVolume")
    private @Nullable Output<String> externalVolume;

    /**
     * @return The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     * 
     */
    public Optional<Output<String>> externalVolume() {
        return Optional.ofNullable(this.externalVolume);
    }

    /**
     * A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;.&#34;&lt;share_name&gt;&#34;`.
     * 
     */
    @Import(name="fromShare")
    private @Nullable Output<String> fromShare;

    /**
     * @return A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;.&#34;&lt;share_name&gt;&#34;`.
     * 
     */
    public Optional<Output<String>> fromShare() {
        return Optional.ofNullable(this.fromShare);
    }

    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     * 
     */
    @Import(name="quotedIdentifiersIgnoreCase")
    private @Nullable Output<Boolean> quotedIdentifiersIgnoreCase;

    /**
     * @return If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     * 
     */
    public Optional<Output<Boolean>> quotedIdentifiersIgnoreCase() {
        return Optional.ofNullable(this.quotedIdentifiersIgnoreCase);
    }

    /**
     * Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     * 
     */
    @Import(name="replaceInvalidCharacters")
    private @Nullable Output<Boolean> replaceInvalidCharacters;

    /**
     * @return Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     * 
     */
    public Optional<Output<Boolean>> replaceInvalidCharacters() {
        return Optional.ofNullable(this.replaceInvalidCharacters);
    }

    /**
     * The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     * 
     */
    @Import(name="storageSerializationPolicy")
    private @Nullable Output<String> storageSerializationPolicy;

    /**
     * @return The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     * 
     */
    public Optional<Output<String>> storageSerializationPolicy() {
        return Optional.ofNullable(this.storageSerializationPolicy);
    }

    /**
     * How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     * 
     */
    @Import(name="suspendTaskAfterNumFailures")
    private @Nullable Output<Integer> suspendTaskAfterNumFailures;

    /**
     * @return How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     * 
     */
    public Optional<Output<Integer>> suspendTaskAfterNumFailures() {
        return Optional.ofNullable(this.suspendTaskAfterNumFailures);
    }

    /**
     * Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     * 
     */
    @Import(name="taskAutoRetryAttempts")
    private @Nullable Output<Integer> taskAutoRetryAttempts;

    /**
     * @return Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     * 
     */
    public Optional<Output<Integer>> taskAutoRetryAttempts() {
        return Optional.ofNullable(this.taskAutoRetryAttempts);
    }

    /**
     * Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     * 
     */
    @Import(name="traceLevel")
    private @Nullable Output<String> traceLevel;

    /**
     * @return Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     * 
     */
    public Optional<Output<String>> traceLevel() {
        return Optional.ofNullable(this.traceLevel);
    }

    /**
     * The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     * 
     */
    @Import(name="userTaskManagedInitialWarehouseSize")
    private @Nullable Output<String> userTaskManagedInitialWarehouseSize;

    /**
     * @return The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     * 
     */
    public Optional<Output<String>> userTaskManagedInitialWarehouseSize() {
        return Optional.ofNullable(this.userTaskManagedInitialWarehouseSize);
    }

    /**
     * Minimum amount of time between Triggered Task executions in seconds.
     * 
     */
    @Import(name="userTaskMinimumTriggerIntervalInSeconds")
    private @Nullable Output<Integer> userTaskMinimumTriggerIntervalInSeconds;

    /**
     * @return Minimum amount of time between Triggered Task executions in seconds.
     * 
     */
    public Optional<Output<Integer>> userTaskMinimumTriggerIntervalInSeconds() {
        return Optional.ofNullable(this.userTaskMinimumTriggerIntervalInSeconds);
    }

    /**
     * User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     * 
     */
    @Import(name="userTaskTimeoutMs")
    private @Nullable Output<Integer> userTaskTimeoutMs;

    /**
     * @return User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     * 
     */
    public Optional<Output<Integer>> userTaskTimeoutMs() {
        return Optional.ofNullable(this.userTaskTimeoutMs);
    }

    private SharedDatabaseState() {}

    private SharedDatabaseState(SharedDatabaseState $) {
        this.catalog = $.catalog;
        this.comment = $.comment;
        this.defaultDdlCollation = $.defaultDdlCollation;
        this.enableConsoleOutput = $.enableConsoleOutput;
        this.externalVolume = $.externalVolume;
        this.fromShare = $.fromShare;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.logLevel = $.logLevel;
        this.name = $.name;
        this.quotedIdentifiersIgnoreCase = $.quotedIdentifiersIgnoreCase;
        this.replaceInvalidCharacters = $.replaceInvalidCharacters;
        this.storageSerializationPolicy = $.storageSerializationPolicy;
        this.suspendTaskAfterNumFailures = $.suspendTaskAfterNumFailures;
        this.taskAutoRetryAttempts = $.taskAutoRetryAttempts;
        this.traceLevel = $.traceLevel;
        this.userTaskManagedInitialWarehouseSize = $.userTaskManagedInitialWarehouseSize;
        this.userTaskMinimumTriggerIntervalInSeconds = $.userTaskMinimumTriggerIntervalInSeconds;
        this.userTaskTimeoutMs = $.userTaskTimeoutMs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedDatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedDatabaseState $;

        public Builder() {
            $ = new SharedDatabaseState();
        }

        public Builder(SharedDatabaseState defaults) {
            $ = new SharedDatabaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalog The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
         * 
         * @return builder
         * 
         */
        public Builder catalog(@Nullable Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        /**
         * @param catalog The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
         * 
         * @return builder
         * 
         */
        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
        }

        /**
         * @param comment Specifies a comment for the database.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the database.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param defaultDdlCollation Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
         * 
         * @return builder
         * 
         */
        public Builder defaultDdlCollation(@Nullable Output<String> defaultDdlCollation) {
            $.defaultDdlCollation = defaultDdlCollation;
            return this;
        }

        /**
         * @param defaultDdlCollation Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
         * 
         * @return builder
         * 
         */
        public Builder defaultDdlCollation(String defaultDdlCollation) {
            return defaultDdlCollation(Output.of(defaultDdlCollation));
        }

        /**
         * @param enableConsoleOutput If true, enables stdout/stderr fast path logging for anonymous stored procedures.
         * 
         * @return builder
         * 
         */
        public Builder enableConsoleOutput(@Nullable Output<Boolean> enableConsoleOutput) {
            $.enableConsoleOutput = enableConsoleOutput;
            return this;
        }

        /**
         * @param enableConsoleOutput If true, enables stdout/stderr fast path logging for anonymous stored procedures.
         * 
         * @return builder
         * 
         */
        public Builder enableConsoleOutput(Boolean enableConsoleOutput) {
            return enableConsoleOutput(Output.of(enableConsoleOutput));
        }

        /**
         * @param externalVolume The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
         * 
         * @return builder
         * 
         */
        public Builder externalVolume(@Nullable Output<String> externalVolume) {
            $.externalVolume = externalVolume;
            return this;
        }

        /**
         * @param externalVolume The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
         * 
         * @return builder
         * 
         */
        public Builder externalVolume(String externalVolume) {
            return externalVolume(Output.of(externalVolume));
        }

        /**
         * @param fromShare A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;.&#34;&lt;share_name&gt;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder fromShare(@Nullable Output<String> fromShare) {
            $.fromShare = fromShare;
            return this;
        }

        /**
         * @param fromShare A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;.&#34;&lt;share_name&gt;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder fromShare(String fromShare) {
            return fromShare(Output.of(fromShare));
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param logLevel Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param name Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param quotedIdentifiersIgnoreCase If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
         * 
         * @return builder
         * 
         */
        public Builder quotedIdentifiersIgnoreCase(@Nullable Output<Boolean> quotedIdentifiersIgnoreCase) {
            $.quotedIdentifiersIgnoreCase = quotedIdentifiersIgnoreCase;
            return this;
        }

        /**
         * @param quotedIdentifiersIgnoreCase If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
         * 
         * @return builder
         * 
         */
        public Builder quotedIdentifiersIgnoreCase(Boolean quotedIdentifiersIgnoreCase) {
            return quotedIdentifiersIgnoreCase(Output.of(quotedIdentifiersIgnoreCase));
        }

        /**
         * @param replaceInvalidCharacters Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
         * 
         * @return builder
         * 
         */
        public Builder replaceInvalidCharacters(@Nullable Output<Boolean> replaceInvalidCharacters) {
            $.replaceInvalidCharacters = replaceInvalidCharacters;
            return this;
        }

        /**
         * @param replaceInvalidCharacters Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
         * 
         * @return builder
         * 
         */
        public Builder replaceInvalidCharacters(Boolean replaceInvalidCharacters) {
            return replaceInvalidCharacters(Output.of(replaceInvalidCharacters));
        }

        /**
         * @param storageSerializationPolicy The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
         * 
         * @return builder
         * 
         */
        public Builder storageSerializationPolicy(@Nullable Output<String> storageSerializationPolicy) {
            $.storageSerializationPolicy = storageSerializationPolicy;
            return this;
        }

        /**
         * @param storageSerializationPolicy The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
         * 
         * @return builder
         * 
         */
        public Builder storageSerializationPolicy(String storageSerializationPolicy) {
            return storageSerializationPolicy(Output.of(storageSerializationPolicy));
        }

        /**
         * @param suspendTaskAfterNumFailures How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
         * 
         * @return builder
         * 
         */
        public Builder suspendTaskAfterNumFailures(@Nullable Output<Integer> suspendTaskAfterNumFailures) {
            $.suspendTaskAfterNumFailures = suspendTaskAfterNumFailures;
            return this;
        }

        /**
         * @param suspendTaskAfterNumFailures How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
         * 
         * @return builder
         * 
         */
        public Builder suspendTaskAfterNumFailures(Integer suspendTaskAfterNumFailures) {
            return suspendTaskAfterNumFailures(Output.of(suspendTaskAfterNumFailures));
        }

        /**
         * @param taskAutoRetryAttempts Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
         * 
         * @return builder
         * 
         */
        public Builder taskAutoRetryAttempts(@Nullable Output<Integer> taskAutoRetryAttempts) {
            $.taskAutoRetryAttempts = taskAutoRetryAttempts;
            return this;
        }

        /**
         * @param taskAutoRetryAttempts Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
         * 
         * @return builder
         * 
         */
        public Builder taskAutoRetryAttempts(Integer taskAutoRetryAttempts) {
            return taskAutoRetryAttempts(Output.of(taskAutoRetryAttempts));
        }

        /**
         * @param traceLevel Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
         * 
         * @return builder
         * 
         */
        public Builder traceLevel(@Nullable Output<String> traceLevel) {
            $.traceLevel = traceLevel;
            return this;
        }

        /**
         * @param traceLevel Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
         * 
         * @return builder
         * 
         */
        public Builder traceLevel(String traceLevel) {
            return traceLevel(Output.of(traceLevel));
        }

        /**
         * @param userTaskManagedInitialWarehouseSize The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
         * 
         * @return builder
         * 
         */
        public Builder userTaskManagedInitialWarehouseSize(@Nullable Output<String> userTaskManagedInitialWarehouseSize) {
            $.userTaskManagedInitialWarehouseSize = userTaskManagedInitialWarehouseSize;
            return this;
        }

        /**
         * @param userTaskManagedInitialWarehouseSize The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
         * 
         * @return builder
         * 
         */
        public Builder userTaskManagedInitialWarehouseSize(String userTaskManagedInitialWarehouseSize) {
            return userTaskManagedInitialWarehouseSize(Output.of(userTaskManagedInitialWarehouseSize));
        }

        /**
         * @param userTaskMinimumTriggerIntervalInSeconds Minimum amount of time between Triggered Task executions in seconds.
         * 
         * @return builder
         * 
         */
        public Builder userTaskMinimumTriggerIntervalInSeconds(@Nullable Output<Integer> userTaskMinimumTriggerIntervalInSeconds) {
            $.userTaskMinimumTriggerIntervalInSeconds = userTaskMinimumTriggerIntervalInSeconds;
            return this;
        }

        /**
         * @param userTaskMinimumTriggerIntervalInSeconds Minimum amount of time between Triggered Task executions in seconds.
         * 
         * @return builder
         * 
         */
        public Builder userTaskMinimumTriggerIntervalInSeconds(Integer userTaskMinimumTriggerIntervalInSeconds) {
            return userTaskMinimumTriggerIntervalInSeconds(Output.of(userTaskMinimumTriggerIntervalInSeconds));
        }

        /**
         * @param userTaskTimeoutMs User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
         * 
         * @return builder
         * 
         */
        public Builder userTaskTimeoutMs(@Nullable Output<Integer> userTaskTimeoutMs) {
            $.userTaskTimeoutMs = userTaskTimeoutMs;
            return this;
        }

        /**
         * @param userTaskTimeoutMs User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
         * 
         * @return builder
         * 
         */
        public Builder userTaskTimeoutMs(Integer userTaskTimeoutMs) {
            return userTaskTimeoutMs(Output.of(userTaskTimeoutMs));
        }

        public SharedDatabaseState build() {
            return $;
        }
    }

}
