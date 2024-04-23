// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
//			_, err := snowflake.NewAlert(ctx, "alert", &snowflake.AlertArgs{
//				Database:  pulumi.String("database"),
//				Schema:    pulumi.String("schema"),
//				Name:      pulumi.String("alert"),
//				Warehouse: pulumi.String("warehouse"),
//				AlertSchedule: &snowflake.AlertAlertScheduleArgs{
//					Interval: pulumi.Int(10),
//				},
//				Condition: pulumi.String("select 1 as c"),
//				Action:    pulumi.String("select 1 as c"),
//				Enabled:   pulumi.Bool(true),
//				Comment:   pulumi.String("my alert"),
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
// format is database name | schema name | alert name
//
// ```sh
// $ pulumi import snowflake:index/alert:Alert example 'dbName|schemaName|alertName'
// ```
type Alert struct {
	pulumi.CustomResourceState

	// The SQL statement that should be executed if the condition returns one or more rows.
	Action pulumi.StringOutput `pulumi:"action"`
	// The schedule for periodically running an alert.
	AlertSchedule AlertAlertSchedulePtrOutput `pulumi:"alertSchedule"`
	// Specifies a comment for the alert.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
	Condition pulumi.StringOutput `pulumi:"condition"`
	// The database in which to create the alert.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema in which to create the alert.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// The warehouse the alert will use.
	Warehouse pulumi.StringOutput `pulumi:"warehouse"`
}

// NewAlert registers a new resource with the given unique name, arguments, and options.
func NewAlert(ctx *pulumi.Context,
	name string, args *AlertArgs, opts ...pulumi.ResourceOption) (*Alert, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Condition == nil {
		return nil, errors.New("invalid value for required argument 'Condition'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Warehouse == nil {
		return nil, errors.New("invalid value for required argument 'Warehouse'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Alert
	err := ctx.RegisterResource("snowflake:index/alert:Alert", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlert gets an existing Alert resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlert(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertState, opts ...pulumi.ResourceOption) (*Alert, error) {
	var resource Alert
	err := ctx.ReadResource("snowflake:index/alert:Alert", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Alert resources.
type alertState struct {
	// The SQL statement that should be executed if the condition returns one or more rows.
	Action *string `pulumi:"action"`
	// The schedule for periodically running an alert.
	AlertSchedule *AlertAlertSchedule `pulumi:"alertSchedule"`
	// Specifies a comment for the alert.
	Comment *string `pulumi:"comment"`
	// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
	Condition *string `pulumi:"condition"`
	// The database in which to create the alert.
	Database *string `pulumi:"database"`
	// Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
	Enabled *bool `pulumi:"enabled"`
	// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
	Name *string `pulumi:"name"`
	// The schema in which to create the alert.
	Schema *string `pulumi:"schema"`
	// The warehouse the alert will use.
	Warehouse *string `pulumi:"warehouse"`
}

type AlertState struct {
	// The SQL statement that should be executed if the condition returns one or more rows.
	Action pulumi.StringPtrInput
	// The schedule for periodically running an alert.
	AlertSchedule AlertAlertSchedulePtrInput
	// Specifies a comment for the alert.
	Comment pulumi.StringPtrInput
	// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
	Condition pulumi.StringPtrInput
	// The database in which to create the alert.
	Database pulumi.StringPtrInput
	// Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
	Enabled pulumi.BoolPtrInput
	// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
	Name pulumi.StringPtrInput
	// The schema in which to create the alert.
	Schema pulumi.StringPtrInput
	// The warehouse the alert will use.
	Warehouse pulumi.StringPtrInput
}

func (AlertState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertState)(nil)).Elem()
}

type alertArgs struct {
	// The SQL statement that should be executed if the condition returns one or more rows.
	Action string `pulumi:"action"`
	// The schedule for periodically running an alert.
	AlertSchedule *AlertAlertSchedule `pulumi:"alertSchedule"`
	// Specifies a comment for the alert.
	Comment *string `pulumi:"comment"`
	// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
	Condition string `pulumi:"condition"`
	// The database in which to create the alert.
	Database string `pulumi:"database"`
	// Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
	Enabled *bool `pulumi:"enabled"`
	// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
	Name *string `pulumi:"name"`
	// The schema in which to create the alert.
	Schema string `pulumi:"schema"`
	// The warehouse the alert will use.
	Warehouse string `pulumi:"warehouse"`
}

// The set of arguments for constructing a Alert resource.
type AlertArgs struct {
	// The SQL statement that should be executed if the condition returns one or more rows.
	Action pulumi.StringInput
	// The schedule for periodically running an alert.
	AlertSchedule AlertAlertSchedulePtrInput
	// Specifies a comment for the alert.
	Comment pulumi.StringPtrInput
	// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
	Condition pulumi.StringInput
	// The database in which to create the alert.
	Database pulumi.StringInput
	// Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
	Enabled pulumi.BoolPtrInput
	// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
	Name pulumi.StringPtrInput
	// The schema in which to create the alert.
	Schema pulumi.StringInput
	// The warehouse the alert will use.
	Warehouse pulumi.StringInput
}

func (AlertArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertArgs)(nil)).Elem()
}

type AlertInput interface {
	pulumi.Input

	ToAlertOutput() AlertOutput
	ToAlertOutputWithContext(ctx context.Context) AlertOutput
}

func (*Alert) ElementType() reflect.Type {
	return reflect.TypeOf((**Alert)(nil)).Elem()
}

func (i *Alert) ToAlertOutput() AlertOutput {
	return i.ToAlertOutputWithContext(context.Background())
}

func (i *Alert) ToAlertOutputWithContext(ctx context.Context) AlertOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertOutput)
}

// AlertArrayInput is an input type that accepts AlertArray and AlertArrayOutput values.
// You can construct a concrete instance of `AlertArrayInput` via:
//
//	AlertArray{ AlertArgs{...} }
type AlertArrayInput interface {
	pulumi.Input

	ToAlertArrayOutput() AlertArrayOutput
	ToAlertArrayOutputWithContext(context.Context) AlertArrayOutput
}

type AlertArray []AlertInput

func (AlertArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Alert)(nil)).Elem()
}

func (i AlertArray) ToAlertArrayOutput() AlertArrayOutput {
	return i.ToAlertArrayOutputWithContext(context.Background())
}

func (i AlertArray) ToAlertArrayOutputWithContext(ctx context.Context) AlertArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertArrayOutput)
}

// AlertMapInput is an input type that accepts AlertMap and AlertMapOutput values.
// You can construct a concrete instance of `AlertMapInput` via:
//
//	AlertMap{ "key": AlertArgs{...} }
type AlertMapInput interface {
	pulumi.Input

	ToAlertMapOutput() AlertMapOutput
	ToAlertMapOutputWithContext(context.Context) AlertMapOutput
}

type AlertMap map[string]AlertInput

func (AlertMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Alert)(nil)).Elem()
}

func (i AlertMap) ToAlertMapOutput() AlertMapOutput {
	return i.ToAlertMapOutputWithContext(context.Background())
}

func (i AlertMap) ToAlertMapOutputWithContext(ctx context.Context) AlertMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertMapOutput)
}

type AlertOutput struct{ *pulumi.OutputState }

func (AlertOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Alert)(nil)).Elem()
}

func (o AlertOutput) ToAlertOutput() AlertOutput {
	return o
}

func (o AlertOutput) ToAlertOutputWithContext(ctx context.Context) AlertOutput {
	return o
}

// The SQL statement that should be executed if the condition returns one or more rows.
func (o AlertOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// The schedule for periodically running an alert.
func (o AlertOutput) AlertSchedule() AlertAlertSchedulePtrOutput {
	return o.ApplyT(func(v *Alert) AlertAlertSchedulePtrOutput { return v.AlertSchedule }).(AlertAlertSchedulePtrOutput)
}

// Specifies a comment for the alert.
func (o AlertOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
func (o AlertOutput) Condition() pulumi.StringOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringOutput { return v.Condition }).(pulumi.StringOutput)
}

// The database in which to create the alert.
func (o AlertOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
func (o AlertOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Alert) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
func (o AlertOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schema in which to create the alert.
func (o AlertOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// The warehouse the alert will use.
func (o AlertOutput) Warehouse() pulumi.StringOutput {
	return o.ApplyT(func(v *Alert) pulumi.StringOutput { return v.Warehouse }).(pulumi.StringOutput)
}

type AlertArrayOutput struct{ *pulumi.OutputState }

func (AlertArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Alert)(nil)).Elem()
}

func (o AlertArrayOutput) ToAlertArrayOutput() AlertArrayOutput {
	return o
}

func (o AlertArrayOutput) ToAlertArrayOutputWithContext(ctx context.Context) AlertArrayOutput {
	return o
}

func (o AlertArrayOutput) Index(i pulumi.IntInput) AlertOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Alert {
		return vs[0].([]*Alert)[vs[1].(int)]
	}).(AlertOutput)
}

type AlertMapOutput struct{ *pulumi.OutputState }

func (AlertMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Alert)(nil)).Elem()
}

func (o AlertMapOutput) ToAlertMapOutput() AlertMapOutput {
	return o
}

func (o AlertMapOutput) ToAlertMapOutputWithContext(ctx context.Context) AlertMapOutput {
	return o
}

func (o AlertMapOutput) MapIndex(k pulumi.StringInput) AlertOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Alert {
		return vs[0].(map[string]*Alert)[vs[1].(string)]
	}).(AlertOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertInput)(nil)).Elem(), &Alert{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertArrayInput)(nil)).Elem(), AlertArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertMapInput)(nil)).Elem(), AlertMap{})
	pulumi.RegisterOutputType(AlertOutput{})
	pulumi.RegisterOutputType(AlertArrayOutput{})
	pulumi.RegisterOutputType(AlertMapOutput{})
}
