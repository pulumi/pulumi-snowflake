// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskState extends com.pulumi.resources.ResourceArgs {

    public static final TaskState Empty = new TaskState();

    /**
     * Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
     * 
     */
    @Import(name="afters")
    private @Nullable Output<List<String>> afters;

    /**
     * @return Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
     * 
     */
    public Optional<Output<List<String>>> afters() {
        return Optional.ofNullable(this.afters);
    }

    /**
     * By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
     * 
     */
    @Import(name="allowOverlappingExecution")
    private @Nullable Output<Boolean> allowOverlappingExecution;

    /**
     * @return By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
     * 
     */
    public Optional<Output<Boolean>> allowOverlappingExecution() {
        return Optional.ofNullable(this.allowOverlappingExecution);
    }

    /**
     * Specifies a comment for the task.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the task.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the task.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the task.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Specifies if the task should be started (enabled) after creation or should remain suspended (default).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies if the task should be started (enabled) after creation or should remain suspended (default).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the notification integration used for error notifications.
     * 
     */
    @Import(name="errorIntegration")
    private @Nullable Output<String> errorIntegration;

    /**
     * @return Specifies the name of the notification integration used for error notifications.
     * 
     */
    public Optional<Output<String>> errorIntegration() {
        return Optional.ofNullable(this.errorIntegration);
    }

    /**
     * Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The schema in which to create the task.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the task.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
     * 
     */
    @Import(name="sessionParameters")
    private @Nullable Output<Map<String,String>> sessionParameters;

    /**
     * @return Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
     * 
     */
    public Optional<Output<Map<String,String>>> sessionParameters() {
        return Optional.ofNullable(this.sessionParameters);
    }

    /**
     * Any single SQL statement, or a call to a stored procedure, executed when the task runs.
     * 
     */
    @Import(name="sqlStatement")
    private @Nullable Output<String> sqlStatement;

    /**
     * @return Any single SQL statement, or a call to a stored procedure, executed when the task runs.
     * 
     */
    public Optional<Output<String>> sqlStatement() {
        return Optional.ofNullable(this.sqlStatement);
    }

    /**
     * Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
     * 
     */
    @Import(name="suspendTaskAfterNumFailures")
    private @Nullable Output<Integer> suspendTaskAfterNumFailures;

    /**
     * @return Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
     * 
     */
    public Optional<Output<Integer>> suspendTaskAfterNumFailures() {
        return Optional.ofNullable(this.suspendTaskAfterNumFailures);
    }

    /**
     * Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
     * 
     */
    @Import(name="userTaskManagedInitialWarehouseSize")
    private @Nullable Output<String> userTaskManagedInitialWarehouseSize;

    /**
     * @return Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
     * 
     */
    public Optional<Output<String>> userTaskManagedInitialWarehouseSize() {
        return Optional.ofNullable(this.userTaskManagedInitialWarehouseSize);
    }

    /**
     * Specifies the time limit on a single run of the task before it times out (in milliseconds).
     * 
     */
    @Import(name="userTaskTimeoutMs")
    private @Nullable Output<Integer> userTaskTimeoutMs;

    /**
     * @return Specifies the time limit on a single run of the task before it times out (in milliseconds).
     * 
     */
    public Optional<Output<Integer>> userTaskTimeoutMs() {
        return Optional.ofNullable(this.userTaskTimeoutMs);
    }

    /**
     * The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
     * 
     */
    @Import(name="warehouse")
    private @Nullable Output<String> warehouse;

    /**
     * @return The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
     * 
     */
    public Optional<Output<String>> warehouse() {
        return Optional.ofNullable(this.warehouse);
    }

    /**
     * Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
     * 
     */
    @Import(name="when")
    private @Nullable Output<String> when;

    /**
     * @return Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
     * 
     */
    public Optional<Output<String>> when() {
        return Optional.ofNullable(this.when);
    }

    private TaskState() {}

    private TaskState(TaskState $) {
        this.afters = $.afters;
        this.allowOverlappingExecution = $.allowOverlappingExecution;
        this.comment = $.comment;
        this.database = $.database;
        this.enabled = $.enabled;
        this.errorIntegration = $.errorIntegration;
        this.name = $.name;
        this.schedule = $.schedule;
        this.schema = $.schema;
        this.sessionParameters = $.sessionParameters;
        this.sqlStatement = $.sqlStatement;
        this.suspendTaskAfterNumFailures = $.suspendTaskAfterNumFailures;
        this.userTaskManagedInitialWarehouseSize = $.userTaskManagedInitialWarehouseSize;
        this.userTaskTimeoutMs = $.userTaskTimeoutMs;
        this.warehouse = $.warehouse;
        this.when = $.when;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskState $;

        public Builder() {
            $ = new TaskState();
        }

        public Builder(TaskState defaults) {
            $ = new TaskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param afters Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
         * 
         * @return builder
         * 
         */
        public Builder afters(@Nullable Output<List<String>> afters) {
            $.afters = afters;
            return this;
        }

        /**
         * @param afters Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
         * 
         * @return builder
         * 
         */
        public Builder afters(List<String> afters) {
            return afters(Output.of(afters));
        }

        /**
         * @param afters Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
         * 
         * @return builder
         * 
         */
        public Builder afters(String... afters) {
            return afters(List.of(afters));
        }

        /**
         * @param allowOverlappingExecution By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
         * 
         * @return builder
         * 
         */
        public Builder allowOverlappingExecution(@Nullable Output<Boolean> allowOverlappingExecution) {
            $.allowOverlappingExecution = allowOverlappingExecution;
            return this;
        }

        /**
         * @param allowOverlappingExecution By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
         * 
         * @return builder
         * 
         */
        public Builder allowOverlappingExecution(Boolean allowOverlappingExecution) {
            return allowOverlappingExecution(Output.of(allowOverlappingExecution));
        }

        /**
         * @param comment Specifies a comment for the task.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the task.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the task.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the task.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param enabled Specifies if the task should be started (enabled) after creation or should remain suspended (default).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies if the task should be started (enabled) after creation or should remain suspended (default).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param errorIntegration Specifies the name of the notification integration used for error notifications.
         * 
         * @return builder
         * 
         */
        public Builder errorIntegration(@Nullable Output<String> errorIntegration) {
            $.errorIntegration = errorIntegration;
            return this;
        }

        /**
         * @param errorIntegration Specifies the name of the notification integration used for error notifications.
         * 
         * @return builder
         * 
         */
        public Builder errorIntegration(String errorIntegration) {
            return errorIntegration(Output.of(errorIntegration));
        }

        /**
         * @param name Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param schema The schema in which to create the task.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the task.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param sessionParameters Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
         * 
         * @return builder
         * 
         */
        public Builder sessionParameters(@Nullable Output<Map<String,String>> sessionParameters) {
            $.sessionParameters = sessionParameters;
            return this;
        }

        /**
         * @param sessionParameters Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
         * 
         * @return builder
         * 
         */
        public Builder sessionParameters(Map<String,String> sessionParameters) {
            return sessionParameters(Output.of(sessionParameters));
        }

        /**
         * @param sqlStatement Any single SQL statement, or a call to a stored procedure, executed when the task runs.
         * 
         * @return builder
         * 
         */
        public Builder sqlStatement(@Nullable Output<String> sqlStatement) {
            $.sqlStatement = sqlStatement;
            return this;
        }

        /**
         * @param sqlStatement Any single SQL statement, or a call to a stored procedure, executed when the task runs.
         * 
         * @return builder
         * 
         */
        public Builder sqlStatement(String sqlStatement) {
            return sqlStatement(Output.of(sqlStatement));
        }

        /**
         * @param suspendTaskAfterNumFailures Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
         * 
         * @return builder
         * 
         */
        public Builder suspendTaskAfterNumFailures(@Nullable Output<Integer> suspendTaskAfterNumFailures) {
            $.suspendTaskAfterNumFailures = suspendTaskAfterNumFailures;
            return this;
        }

        /**
         * @param suspendTaskAfterNumFailures Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
         * 
         * @return builder
         * 
         */
        public Builder suspendTaskAfterNumFailures(Integer suspendTaskAfterNumFailures) {
            return suspendTaskAfterNumFailures(Output.of(suspendTaskAfterNumFailures));
        }

        /**
         * @param userTaskManagedInitialWarehouseSize Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
         * 
         * @return builder
         * 
         */
        public Builder userTaskManagedInitialWarehouseSize(@Nullable Output<String> userTaskManagedInitialWarehouseSize) {
            $.userTaskManagedInitialWarehouseSize = userTaskManagedInitialWarehouseSize;
            return this;
        }

        /**
         * @param userTaskManagedInitialWarehouseSize Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
         * 
         * @return builder
         * 
         */
        public Builder userTaskManagedInitialWarehouseSize(String userTaskManagedInitialWarehouseSize) {
            return userTaskManagedInitialWarehouseSize(Output.of(userTaskManagedInitialWarehouseSize));
        }

        /**
         * @param userTaskTimeoutMs Specifies the time limit on a single run of the task before it times out (in milliseconds).
         * 
         * @return builder
         * 
         */
        public Builder userTaskTimeoutMs(@Nullable Output<Integer> userTaskTimeoutMs) {
            $.userTaskTimeoutMs = userTaskTimeoutMs;
            return this;
        }

        /**
         * @param userTaskTimeoutMs Specifies the time limit on a single run of the task before it times out (in milliseconds).
         * 
         * @return builder
         * 
         */
        public Builder userTaskTimeoutMs(Integer userTaskTimeoutMs) {
            return userTaskTimeoutMs(Output.of(userTaskTimeoutMs));
        }

        /**
         * @param warehouse The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
         * 
         * @return builder
         * 
         */
        public Builder warehouse(@Nullable Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        /**
         * @param when Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
         * 
         * @return builder
         * 
         */
        public Builder when(@Nullable Output<String> when) {
            $.when = when;
            return this;
        }

        /**
         * @param when Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
         * 
         * @return builder
         * 
         */
        public Builder when(String when) {
            return when(Output.of(when));
        }

        public TaskState build() {
            return $;
        }
    }

}
