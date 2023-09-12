// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			task, err := snowflake.NewTask(ctx, "task", &snowflake.TaskArgs{
//				Comment:      pulumi.String("my task"),
//				Database:     pulumi.String("database"),
//				Schema:       pulumi.String("schema"),
//				Warehouse:    pulumi.String("warehouse"),
//				Schedule:     pulumi.String("10 MINUTE"),
//				SqlStatement: pulumi.String("select * from foo;"),
//				SessionParameters: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				UserTaskTimeoutMs: pulumi.Int(10000),
//				Afters:            pulumi.StringArray("preceding_task"),
//				When:              pulumi.String("foo AND bar"),
//				Enabled:           pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewTask(ctx, "serverlessTask", &snowflake.TaskArgs{
//				Comment:      pulumi.String("my serverless task"),
//				Database:     pulumi.String("db"),
//				Schema:       pulumi.String("schema"),
//				Schedule:     pulumi.String("10 MINUTE"),
//				SqlStatement: pulumi.String("select * from foo;"),
//				SessionParameters: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				UserTaskTimeoutMs:                   pulumi.Int(10000),
//				UserTaskManagedInitialWarehouseSize: pulumi.String("XSMALL"),
//				Afters: pulumi.StringArray{
//					task.Name,
//				},
//				When:    pulumi.String("foo AND bar"),
//				Enabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewTask(ctx, "testTask", &snowflake.TaskArgs{
//				Comment:                   pulumi.String("task with allow_overlapping_execution"),
//				Database:                  pulumi.String("database"),
//				Schema:                    pulumi.String("schema"),
//				SqlStatement:              pulumi.String("select 1 as c;"),
//				AllowOverlappingExecution: pulumi.Bool(true),
//				Enabled:                   pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// format is database name | schema name | task name
//
// ```sh
//
//	$ pulumi import snowflake:index/task:Task example 'dbName|schemaName|taskName'
//
// ```
type Task struct {
	pulumi.CustomResourceState

	// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
	Afters pulumi.StringArrayOutput `pulumi:"afters"`
	// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
	AllowOverlappingExecution pulumi.BoolPtrOutput `pulumi:"allowOverlappingExecution"`
	// Specifies a comment for the task.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the task.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Specifies the name of the notification integration used for error notifications.
	ErrorIntegration pulumi.StringPtrOutput `pulumi:"errorIntegration"`
	// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
	Schedule pulumi.StringPtrOutput `pulumi:"schedule"`
	// The schema in which to create the task.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
	SessionParameters pulumi.StringMapOutput `pulumi:"sessionParameters"`
	// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
	SqlStatement pulumi.StringOutput `pulumi:"sqlStatement"`
	// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
	UserTaskManagedInitialWarehouseSize pulumi.StringPtrOutput `pulumi:"userTaskManagedInitialWarehouseSize"`
	// Specifies the time limit on a single run of the task before it times out (in milliseconds).
	UserTaskTimeoutMs pulumi.IntPtrOutput `pulumi:"userTaskTimeoutMs"`
	// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
	Warehouse pulumi.StringPtrOutput `pulumi:"warehouse"`
	// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
	When pulumi.StringPtrOutput `pulumi:"when"`
}

// NewTask registers a new resource with the given unique name, arguments, and options.
func NewTask(ctx *pulumi.Context,
	name string, args *TaskArgs, opts ...pulumi.ResourceOption) (*Task, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.SqlStatement == nil {
		return nil, errors.New("invalid value for required argument 'SqlStatement'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Task
	err := ctx.RegisterResource("snowflake:index/task:Task", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTask gets an existing Task resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTask(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TaskState, opts ...pulumi.ResourceOption) (*Task, error) {
	var resource Task
	err := ctx.ReadResource("snowflake:index/task:Task", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Task resources.
type taskState struct {
	// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
	Afters []string `pulumi:"afters"`
	// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
	AllowOverlappingExecution *bool `pulumi:"allowOverlappingExecution"`
	// Specifies a comment for the task.
	Comment *string `pulumi:"comment"`
	// The database in which to create the task.
	Database *string `pulumi:"database"`
	// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
	Enabled *bool `pulumi:"enabled"`
	// Specifies the name of the notification integration used for error notifications.
	ErrorIntegration *string `pulumi:"errorIntegration"`
	// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
	Name *string `pulumi:"name"`
	// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
	Schedule *string `pulumi:"schedule"`
	// The schema in which to create the task.
	Schema *string `pulumi:"schema"`
	// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
	SessionParameters map[string]string `pulumi:"sessionParameters"`
	// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
	SqlStatement *string `pulumi:"sqlStatement"`
	// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
	UserTaskManagedInitialWarehouseSize *string `pulumi:"userTaskManagedInitialWarehouseSize"`
	// Specifies the time limit on a single run of the task before it times out (in milliseconds).
	UserTaskTimeoutMs *int `pulumi:"userTaskTimeoutMs"`
	// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
	Warehouse *string `pulumi:"warehouse"`
	// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
	When *string `pulumi:"when"`
}

type TaskState struct {
	// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
	Afters pulumi.StringArrayInput
	// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
	AllowOverlappingExecution pulumi.BoolPtrInput
	// Specifies a comment for the task.
	Comment pulumi.StringPtrInput
	// The database in which to create the task.
	Database pulumi.StringPtrInput
	// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
	Enabled pulumi.BoolPtrInput
	// Specifies the name of the notification integration used for error notifications.
	ErrorIntegration pulumi.StringPtrInput
	// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
	Name pulumi.StringPtrInput
	// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
	Schedule pulumi.StringPtrInput
	// The schema in which to create the task.
	Schema pulumi.StringPtrInput
	// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
	SessionParameters pulumi.StringMapInput
	// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
	SqlStatement pulumi.StringPtrInput
	// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
	UserTaskManagedInitialWarehouseSize pulumi.StringPtrInput
	// Specifies the time limit on a single run of the task before it times out (in milliseconds).
	UserTaskTimeoutMs pulumi.IntPtrInput
	// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
	Warehouse pulumi.StringPtrInput
	// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
	When pulumi.StringPtrInput
}

func (TaskState) ElementType() reflect.Type {
	return reflect.TypeOf((*taskState)(nil)).Elem()
}

type taskArgs struct {
	// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
	Afters []string `pulumi:"afters"`
	// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
	AllowOverlappingExecution *bool `pulumi:"allowOverlappingExecution"`
	// Specifies a comment for the task.
	Comment *string `pulumi:"comment"`
	// The database in which to create the task.
	Database string `pulumi:"database"`
	// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
	Enabled *bool `pulumi:"enabled"`
	// Specifies the name of the notification integration used for error notifications.
	ErrorIntegration *string `pulumi:"errorIntegration"`
	// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
	Name *string `pulumi:"name"`
	// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
	Schedule *string `pulumi:"schedule"`
	// The schema in which to create the task.
	Schema string `pulumi:"schema"`
	// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
	SessionParameters map[string]string `pulumi:"sessionParameters"`
	// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
	SqlStatement string `pulumi:"sqlStatement"`
	// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
	UserTaskManagedInitialWarehouseSize *string `pulumi:"userTaskManagedInitialWarehouseSize"`
	// Specifies the time limit on a single run of the task before it times out (in milliseconds).
	UserTaskTimeoutMs *int `pulumi:"userTaskTimeoutMs"`
	// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
	Warehouse *string `pulumi:"warehouse"`
	// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
	When *string `pulumi:"when"`
}

// The set of arguments for constructing a Task resource.
type TaskArgs struct {
	// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
	Afters pulumi.StringArrayInput
	// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
	AllowOverlappingExecution pulumi.BoolPtrInput
	// Specifies a comment for the task.
	Comment pulumi.StringPtrInput
	// The database in which to create the task.
	Database pulumi.StringInput
	// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
	Enabled pulumi.BoolPtrInput
	// Specifies the name of the notification integration used for error notifications.
	ErrorIntegration pulumi.StringPtrInput
	// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
	Name pulumi.StringPtrInput
	// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
	Schedule pulumi.StringPtrInput
	// The schema in which to create the task.
	Schema pulumi.StringInput
	// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
	SessionParameters pulumi.StringMapInput
	// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
	SqlStatement pulumi.StringInput
	// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
	UserTaskManagedInitialWarehouseSize pulumi.StringPtrInput
	// Specifies the time limit on a single run of the task before it times out (in milliseconds).
	UserTaskTimeoutMs pulumi.IntPtrInput
	// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
	Warehouse pulumi.StringPtrInput
	// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
	When pulumi.StringPtrInput
}

func (TaskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*taskArgs)(nil)).Elem()
}

type TaskInput interface {
	pulumi.Input

	ToTaskOutput() TaskOutput
	ToTaskOutputWithContext(ctx context.Context) TaskOutput
}

func (*Task) ElementType() reflect.Type {
	return reflect.TypeOf((**Task)(nil)).Elem()
}

func (i *Task) ToTaskOutput() TaskOutput {
	return i.ToTaskOutputWithContext(context.Background())
}

func (i *Task) ToTaskOutputWithContext(ctx context.Context) TaskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskOutput)
}

func (i *Task) ToOutput(ctx context.Context) pulumix.Output[*Task] {
	return pulumix.Output[*Task]{
		OutputState: i.ToTaskOutputWithContext(ctx).OutputState,
	}
}

// TaskArrayInput is an input type that accepts TaskArray and TaskArrayOutput values.
// You can construct a concrete instance of `TaskArrayInput` via:
//
//	TaskArray{ TaskArgs{...} }
type TaskArrayInput interface {
	pulumi.Input

	ToTaskArrayOutput() TaskArrayOutput
	ToTaskArrayOutputWithContext(context.Context) TaskArrayOutput
}

type TaskArray []TaskInput

func (TaskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Task)(nil)).Elem()
}

func (i TaskArray) ToTaskArrayOutput() TaskArrayOutput {
	return i.ToTaskArrayOutputWithContext(context.Background())
}

func (i TaskArray) ToTaskArrayOutputWithContext(ctx context.Context) TaskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskArrayOutput)
}

func (i TaskArray) ToOutput(ctx context.Context) pulumix.Output[[]*Task] {
	return pulumix.Output[[]*Task]{
		OutputState: i.ToTaskArrayOutputWithContext(ctx).OutputState,
	}
}

// TaskMapInput is an input type that accepts TaskMap and TaskMapOutput values.
// You can construct a concrete instance of `TaskMapInput` via:
//
//	TaskMap{ "key": TaskArgs{...} }
type TaskMapInput interface {
	pulumi.Input

	ToTaskMapOutput() TaskMapOutput
	ToTaskMapOutputWithContext(context.Context) TaskMapOutput
}

type TaskMap map[string]TaskInput

func (TaskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Task)(nil)).Elem()
}

func (i TaskMap) ToTaskMapOutput() TaskMapOutput {
	return i.ToTaskMapOutputWithContext(context.Background())
}

func (i TaskMap) ToTaskMapOutputWithContext(ctx context.Context) TaskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskMapOutput)
}

func (i TaskMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Task] {
	return pulumix.Output[map[string]*Task]{
		OutputState: i.ToTaskMapOutputWithContext(ctx).OutputState,
	}
}

type TaskOutput struct{ *pulumi.OutputState }

func (TaskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Task)(nil)).Elem()
}

func (o TaskOutput) ToTaskOutput() TaskOutput {
	return o
}

func (o TaskOutput) ToTaskOutputWithContext(ctx context.Context) TaskOutput {
	return o
}

func (o TaskOutput) ToOutput(ctx context.Context) pulumix.Output[*Task] {
	return pulumix.Output[*Task]{
		OutputState: o.OutputState,
	}
}

// Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
func (o TaskOutput) Afters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Task) pulumi.StringArrayOutput { return v.Afters }).(pulumi.StringArrayOutput)
}

// By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
func (o TaskOutput) AllowOverlappingExecution() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.BoolPtrOutput { return v.AllowOverlappingExecution }).(pulumi.BoolPtrOutput)
}

// Specifies a comment for the task.
func (o TaskOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the task.
func (o TaskOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Task) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies if the task should be started (enabled) after creation or should remain suspended (default).
func (o TaskOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the notification integration used for error notifications.
func (o TaskOutput) ErrorIntegration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.StringPtrOutput { return v.ErrorIntegration }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
func (o TaskOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Task) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
func (o TaskOutput) Schedule() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.StringPtrOutput { return v.Schedule }).(pulumi.StringPtrOutput)
}

// The schema in which to create the task.
func (o TaskOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Task) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
func (o TaskOutput) SessionParameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Task) pulumi.StringMapOutput { return v.SessionParameters }).(pulumi.StringMapOutput)
}

// Any single SQL statement, or a call to a stored procedure, executed when the task runs.
func (o TaskOutput) SqlStatement() pulumi.StringOutput {
	return o.ApplyT(func(v *Task) pulumi.StringOutput { return v.SqlStatement }).(pulumi.StringOutput)
}

// Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
func (o TaskOutput) UserTaskManagedInitialWarehouseSize() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.StringPtrOutput { return v.UserTaskManagedInitialWarehouseSize }).(pulumi.StringPtrOutput)
}

// Specifies the time limit on a single run of the task before it times out (in milliseconds).
func (o TaskOutput) UserTaskTimeoutMs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.IntPtrOutput { return v.UserTaskTimeoutMs }).(pulumi.IntPtrOutput)
}

// The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
func (o TaskOutput) Warehouse() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.StringPtrOutput { return v.Warehouse }).(pulumi.StringPtrOutput)
}

// Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
func (o TaskOutput) When() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Task) pulumi.StringPtrOutput { return v.When }).(pulumi.StringPtrOutput)
}

type TaskArrayOutput struct{ *pulumi.OutputState }

func (TaskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Task)(nil)).Elem()
}

func (o TaskArrayOutput) ToTaskArrayOutput() TaskArrayOutput {
	return o
}

func (o TaskArrayOutput) ToTaskArrayOutputWithContext(ctx context.Context) TaskArrayOutput {
	return o
}

func (o TaskArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Task] {
	return pulumix.Output[[]*Task]{
		OutputState: o.OutputState,
	}
}

func (o TaskArrayOutput) Index(i pulumi.IntInput) TaskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Task {
		return vs[0].([]*Task)[vs[1].(int)]
	}).(TaskOutput)
}

type TaskMapOutput struct{ *pulumi.OutputState }

func (TaskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Task)(nil)).Elem()
}

func (o TaskMapOutput) ToTaskMapOutput() TaskMapOutput {
	return o
}

func (o TaskMapOutput) ToTaskMapOutputWithContext(ctx context.Context) TaskMapOutput {
	return o
}

func (o TaskMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Task] {
	return pulumix.Output[map[string]*Task]{
		OutputState: o.OutputState,
	}
}

func (o TaskMapOutput) MapIndex(k pulumi.StringInput) TaskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Task {
		return vs[0].(map[string]*Task)[vs[1].(string)]
	}).(TaskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TaskInput)(nil)).Elem(), &Task{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskArrayInput)(nil)).Elem(), TaskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskMapInput)(nil)).Elem(), TaskMap{})
	pulumi.RegisterOutputType(TaskOutput{})
	pulumi.RegisterOutputType(TaskArrayOutput{})
	pulumi.RegisterOutputType(TaskMapOutput{})
}
