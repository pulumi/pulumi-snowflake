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
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var task = new Snowflake.Task("task", new()
    ///     {
    ///         Comment = "my task",
    ///         Database = "database",
    ///         Schema = "schema",
    ///         Warehouse = "warehouse",
    ///         Name = "task",
    ///         Schedule = "10 MINUTE",
    ///         SqlStatement = "select * from foo;",
    ///         SessionParameters = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         UserTaskTimeoutMs = 10000,
    ///         Afters = "preceding_task",
    ///         When = "foo AND bar",
    ///         Enabled = true,
    ///     });
    /// 
    ///     var serverlessTask = new Snowflake.Task("serverless_task", new()
    ///     {
    ///         Comment = "my serverless task",
    ///         Database = "db",
    ///         Schema = "schema",
    ///         Name = "serverless_task",
    ///         Schedule = "10 MINUTE",
    ///         SqlStatement = "select * from foo;",
    ///         SessionParameters = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         UserTaskTimeoutMs = 10000,
    ///         UserTaskManagedInitialWarehouseSize = "XSMALL",
    ///         Afters = new[]
    ///         {
    ///             task.Name,
    ///         },
    ///         When = "foo AND bar",
    ///         Enabled = true,
    ///     });
    /// 
    ///     var testTask = new Snowflake.Task("test_task", new()
    ///     {
    ///         Comment = "task with allow_overlapping_execution",
    ///         Database = "database",
    ///         Schema = "schema",
    ///         Name = "test_task",
    ///         SqlStatement = "select 1 as c;",
    ///         AllowOverlappingExecution = true,
    ///         Enabled = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// format is database name | schema name | task name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/task:Task example 'dbName|schemaName|taskName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/task:Task")]
    public partial class Task : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
        /// </summary>
        [Output("afters")]
        public Output<ImmutableArray<string>> Afters { get; private set; } = null!;

        /// <summary>
        /// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
        /// </summary>
        [Output("allowOverlappingExecution")]
        public Output<bool?> AllowOverlappingExecution { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the task.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the task.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the notification integration used for error notifications.
        /// </summary>
        [Output("errorIntegration")]
        public Output<string?> ErrorIntegration { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
        /// </summary>
        [Output("schedule")]
        public Output<string?> Schedule { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the task.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
        /// </summary>
        [Output("sessionParameters")]
        public Output<ImmutableDictionary<string, string>?> SessionParameters { get; private set; } = null!;

        /// <summary>
        /// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
        /// </summary>
        [Output("sqlStatement")]
        public Output<string> SqlStatement { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
        /// </summary>
        [Output("suspendTaskAfterNumFailures")]
        public Output<int?> SuspendTaskAfterNumFailures { get; private set; } = null!;

        /// <summary>
        /// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
        /// </summary>
        [Output("userTaskManagedInitialWarehouseSize")]
        public Output<string?> UserTaskManagedInitialWarehouseSize { get; private set; } = null!;

        /// <summary>
        /// Specifies the time limit on a single run of the task before it times out (in milliseconds).
        /// </summary>
        [Output("userTaskTimeoutMs")]
        public Output<int?> UserTaskTimeoutMs { get; private set; } = null!;

        /// <summary>
        /// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
        /// </summary>
        [Output("warehouse")]
        public Output<string?> Warehouse { get; private set; } = null!;

        /// <summary>
        /// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
        /// </summary>
        [Output("when")]
        public Output<string?> When { get; private set; } = null!;


        /// <summary>
        /// Create a Task resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Task(string name, TaskArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/task:Task", name, args ?? new TaskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Task(string name, Input<string> id, TaskState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/task:Task", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Task resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Task Get(string name, Input<string> id, TaskState? state = null, CustomResourceOptions? options = null)
        {
            return new Task(name, id, state, options);
        }
    }

    public sealed class TaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("afters")]
        private InputList<string>? _afters;

        /// <summary>
        /// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
        /// </summary>
        public InputList<string> Afters
        {
            get => _afters ?? (_afters = new InputList<string>());
            set => _afters = value;
        }

        /// <summary>
        /// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
        /// </summary>
        [Input("allowOverlappingExecution")]
        public Input<bool>? AllowOverlappingExecution { get; set; }

        /// <summary>
        /// Specifies a comment for the task.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the task.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the notification integration used for error notifications.
        /// </summary>
        [Input("errorIntegration")]
        public Input<string>? ErrorIntegration { get; set; }

        /// <summary>
        /// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The schema in which to create the task.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("sessionParameters")]
        private InputMap<string>? _sessionParameters;

        /// <summary>
        /// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
        /// </summary>
        public InputMap<string> SessionParameters
        {
            get => _sessionParameters ?? (_sessionParameters = new InputMap<string>());
            set => _sessionParameters = value;
        }

        /// <summary>
        /// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
        /// </summary>
        [Input("sqlStatement", required: true)]
        public Input<string> SqlStatement { get; set; } = null!;

        /// <summary>
        /// Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
        /// </summary>
        [Input("suspendTaskAfterNumFailures")]
        public Input<int>? SuspendTaskAfterNumFailures { get; set; }

        /// <summary>
        /// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
        /// </summary>
        [Input("userTaskManagedInitialWarehouseSize")]
        public Input<string>? UserTaskManagedInitialWarehouseSize { get; set; }

        /// <summary>
        /// Specifies the time limit on a single run of the task before it times out (in milliseconds).
        /// </summary>
        [Input("userTaskTimeoutMs")]
        public Input<int>? UserTaskTimeoutMs { get; set; }

        /// <summary>
        /// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        /// <summary>
        /// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
        /// </summary>
        [Input("when")]
        public Input<string>? When { get; set; }

        public TaskArgs()
        {
        }
        public static new TaskArgs Empty => new TaskArgs();
    }

    public sealed class TaskState : global::Pulumi.ResourceArgs
    {
        [Input("afters")]
        private InputList<string>? _afters;

        /// <summary>
        /// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
        /// </summary>
        public InputList<string> Afters
        {
            get => _afters ?? (_afters = new InputList<string>());
            set => _afters = value;
        }

        /// <summary>
        /// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
        /// </summary>
        [Input("allowOverlappingExecution")]
        public Input<bool>? AllowOverlappingExecution { get; set; }

        /// <summary>
        /// Specifies a comment for the task.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the task.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the notification integration used for error notifications.
        /// </summary>
        [Input("errorIntegration")]
        public Input<string>? ErrorIntegration { get; set; }

        /// <summary>
        /// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The schema in which to create the task.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("sessionParameters")]
        private InputMap<string>? _sessionParameters;

        /// <summary>
        /// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
        /// </summary>
        public InputMap<string> SessionParameters
        {
            get => _sessionParameters ?? (_sessionParameters = new InputMap<string>());
            set => _sessionParameters = value;
        }

        /// <summary>
        /// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
        /// </summary>
        [Input("sqlStatement")]
        public Input<string>? SqlStatement { get; set; }

        /// <summary>
        /// Specifies the number of consecutive failed task runs after which the current task is suspended automatically. The default is 0 (no automatic suspension).
        /// </summary>
        [Input("suspendTaskAfterNumFailures")]
        public Input<int>? SuspendTaskAfterNumFailures { get; set; }

        /// <summary>
        /// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
        /// </summary>
        [Input("userTaskManagedInitialWarehouseSize")]
        public Input<string>? UserTaskManagedInitialWarehouseSize { get; set; }

        /// <summary>
        /// Specifies the time limit on a single run of the task before it times out (in milliseconds).
        /// </summary>
        [Input("userTaskTimeoutMs")]
        public Input<int>? UserTaskTimeoutMs { get; set; }

        /// <summary>
        /// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        /// <summary>
        /// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
        /// </summary>
        [Input("when")]
        public Input<string>? When { get; set; }

        public TaskState()
        {
        }
        public static new TaskState Empty => new TaskState();
    }
}
