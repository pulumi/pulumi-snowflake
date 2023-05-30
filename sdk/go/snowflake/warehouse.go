// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

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
//			_, err := snowflake.NewWarehouse(ctx, "warehouse", &snowflake.WarehouseArgs{
//				Comment:       pulumi.String("foo"),
//				WarehouseSize: pulumi.String("small"),
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
// ```sh
//
//	$ pulumi import snowflake:index/warehouse:Warehouse example warehouseName
//
// ```
type Warehouse struct {
	pulumi.CustomResourceState

	// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
	AutoResume pulumi.BoolOutput `pulumi:"autoResume"`
	// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend pulumi.IntOutput       `pulumi:"autoSuspend"`
	Comment     pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
	EnableQueryAcceleration pulumi.BoolPtrOutput `pulumi:"enableQueryAcceleration"`
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended pulumi.BoolPtrOutput `pulumi:"initiallySuspended"`
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount pulumi.IntOutput `pulumi:"maxClusterCount"`
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel pulumi.IntPtrOutput `pulumi:"maxConcurrencyLevel"`
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount pulumi.IntOutput `pulumi:"minClusterCount"`
	// Identifier for the virtual warehouse; must be unique for your account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor pulumi.IntPtrOutput `pulumi:"queryAccelerationMaxScaleFactor"`
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
	ResourceMonitor pulumi.StringOutput `pulumi:"resourceMonitor"`
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
	ScalingPolicy pulumi.StringOutput `pulumi:"scalingPolicy"`
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds pulumi.IntPtrOutput `pulumi:"statementQueuedTimeoutInSeconds"`
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds pulumi.IntPtrOutput `pulumi:"statementTimeoutInSeconds"`
	// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
	//
	// Deprecated: This field is deprecated and will be removed in the next major version of the provider. It doesn't do anything and should be removed from your configuration.
	WaitForProvisioning pulumi.BoolPtrOutput `pulumi:"waitForProvisioning"`
	// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
	WarehouseSize pulumi.StringOutput `pulumi:"warehouseSize"`
	// Specifies a STANDARD or SNOWPARK-OPTIMIZED warehouse
	WarehouseType pulumi.StringPtrOutput `pulumi:"warehouseType"`
}

// NewWarehouse registers a new resource with the given unique name, arguments, and options.
func NewWarehouse(ctx *pulumi.Context,
	name string, args *WarehouseArgs, opts ...pulumi.ResourceOption) (*Warehouse, error) {
	if args == nil {
		args = &WarehouseArgs{}
	}

	var resource Warehouse
	err := ctx.RegisterResource("snowflake:index/warehouse:Warehouse", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWarehouse gets an existing Warehouse resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWarehouse(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WarehouseState, opts ...pulumi.ResourceOption) (*Warehouse, error) {
	var resource Warehouse
	err := ctx.ReadResource("snowflake:index/warehouse:Warehouse", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Warehouse resources.
type warehouseState struct {
	// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
	AutoResume *bool `pulumi:"autoResume"`
	// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend *int    `pulumi:"autoSuspend"`
	Comment     *string `pulumi:"comment"`
	// Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
	EnableQueryAcceleration *bool `pulumi:"enableQueryAcceleration"`
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended *bool `pulumi:"initiallySuspended"`
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount *int `pulumi:"maxClusterCount"`
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel *int `pulumi:"maxConcurrencyLevel"`
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount *int `pulumi:"minClusterCount"`
	// Identifier for the virtual warehouse; must be unique for your account.
	Name *string `pulumi:"name"`
	// Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor *int `pulumi:"queryAccelerationMaxScaleFactor"`
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
	ResourceMonitor *string `pulumi:"resourceMonitor"`
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
	ScalingPolicy *string `pulumi:"scalingPolicy"`
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds *int `pulumi:"statementQueuedTimeoutInSeconds"`
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds *int `pulumi:"statementTimeoutInSeconds"`
	// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
	//
	// Deprecated: This field is deprecated and will be removed in the next major version of the provider. It doesn't do anything and should be removed from your configuration.
	WaitForProvisioning *bool `pulumi:"waitForProvisioning"`
	// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
	WarehouseSize *string `pulumi:"warehouseSize"`
	// Specifies a STANDARD or SNOWPARK-OPTIMIZED warehouse
	WarehouseType *string `pulumi:"warehouseType"`
}

type WarehouseState struct {
	// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
	AutoResume pulumi.BoolPtrInput
	// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend pulumi.IntPtrInput
	Comment     pulumi.StringPtrInput
	// Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
	EnableQueryAcceleration pulumi.BoolPtrInput
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended pulumi.BoolPtrInput
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount pulumi.IntPtrInput
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel pulumi.IntPtrInput
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount pulumi.IntPtrInput
	// Identifier for the virtual warehouse; must be unique for your account.
	Name pulumi.StringPtrInput
	// Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor pulumi.IntPtrInput
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
	ResourceMonitor pulumi.StringPtrInput
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
	ScalingPolicy pulumi.StringPtrInput
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds pulumi.IntPtrInput
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds pulumi.IntPtrInput
	// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
	//
	// Deprecated: This field is deprecated and will be removed in the next major version of the provider. It doesn't do anything and should be removed from your configuration.
	WaitForProvisioning pulumi.BoolPtrInput
	// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
	WarehouseSize pulumi.StringPtrInput
	// Specifies a STANDARD or SNOWPARK-OPTIMIZED warehouse
	WarehouseType pulumi.StringPtrInput
}

func (WarehouseState) ElementType() reflect.Type {
	return reflect.TypeOf((*warehouseState)(nil)).Elem()
}

type warehouseArgs struct {
	// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
	AutoResume *bool `pulumi:"autoResume"`
	// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend *int    `pulumi:"autoSuspend"`
	Comment     *string `pulumi:"comment"`
	// Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
	EnableQueryAcceleration *bool `pulumi:"enableQueryAcceleration"`
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended *bool `pulumi:"initiallySuspended"`
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount *int `pulumi:"maxClusterCount"`
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel *int `pulumi:"maxConcurrencyLevel"`
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount *int `pulumi:"minClusterCount"`
	// Identifier for the virtual warehouse; must be unique for your account.
	Name *string `pulumi:"name"`
	// Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor *int `pulumi:"queryAccelerationMaxScaleFactor"`
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
	ResourceMonitor *string `pulumi:"resourceMonitor"`
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
	ScalingPolicy *string `pulumi:"scalingPolicy"`
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds *int `pulumi:"statementQueuedTimeoutInSeconds"`
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds *int `pulumi:"statementTimeoutInSeconds"`
	// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
	//
	// Deprecated: This field is deprecated and will be removed in the next major version of the provider. It doesn't do anything and should be removed from your configuration.
	WaitForProvisioning *bool `pulumi:"waitForProvisioning"`
	// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
	WarehouseSize *string `pulumi:"warehouseSize"`
	// Specifies a STANDARD or SNOWPARK-OPTIMIZED warehouse
	WarehouseType *string `pulumi:"warehouseType"`
}

// The set of arguments for constructing a Warehouse resource.
type WarehouseArgs struct {
	// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
	AutoResume pulumi.BoolPtrInput
	// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend pulumi.IntPtrInput
	Comment     pulumi.StringPtrInput
	// Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
	EnableQueryAcceleration pulumi.BoolPtrInput
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended pulumi.BoolPtrInput
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount pulumi.IntPtrInput
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel pulumi.IntPtrInput
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount pulumi.IntPtrInput
	// Identifier for the virtual warehouse; must be unique for your account.
	Name pulumi.StringPtrInput
	// Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor pulumi.IntPtrInput
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
	ResourceMonitor pulumi.StringPtrInput
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
	ScalingPolicy pulumi.StringPtrInput
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds pulumi.IntPtrInput
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds pulumi.IntPtrInput
	// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
	//
	// Deprecated: This field is deprecated and will be removed in the next major version of the provider. It doesn't do anything and should be removed from your configuration.
	WaitForProvisioning pulumi.BoolPtrInput
	// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
	WarehouseSize pulumi.StringPtrInput
	// Specifies a STANDARD or SNOWPARK-OPTIMIZED warehouse
	WarehouseType pulumi.StringPtrInput
}

func (WarehouseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*warehouseArgs)(nil)).Elem()
}

type WarehouseInput interface {
	pulumi.Input

	ToWarehouseOutput() WarehouseOutput
	ToWarehouseOutputWithContext(ctx context.Context) WarehouseOutput
}

func (*Warehouse) ElementType() reflect.Type {
	return reflect.TypeOf((**Warehouse)(nil)).Elem()
}

func (i *Warehouse) ToWarehouseOutput() WarehouseOutput {
	return i.ToWarehouseOutputWithContext(context.Background())
}

func (i *Warehouse) ToWarehouseOutputWithContext(ctx context.Context) WarehouseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WarehouseOutput)
}

// WarehouseArrayInput is an input type that accepts WarehouseArray and WarehouseArrayOutput values.
// You can construct a concrete instance of `WarehouseArrayInput` via:
//
//	WarehouseArray{ WarehouseArgs{...} }
type WarehouseArrayInput interface {
	pulumi.Input

	ToWarehouseArrayOutput() WarehouseArrayOutput
	ToWarehouseArrayOutputWithContext(context.Context) WarehouseArrayOutput
}

type WarehouseArray []WarehouseInput

func (WarehouseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Warehouse)(nil)).Elem()
}

func (i WarehouseArray) ToWarehouseArrayOutput() WarehouseArrayOutput {
	return i.ToWarehouseArrayOutputWithContext(context.Background())
}

func (i WarehouseArray) ToWarehouseArrayOutputWithContext(ctx context.Context) WarehouseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WarehouseArrayOutput)
}

// WarehouseMapInput is an input type that accepts WarehouseMap and WarehouseMapOutput values.
// You can construct a concrete instance of `WarehouseMapInput` via:
//
//	WarehouseMap{ "key": WarehouseArgs{...} }
type WarehouseMapInput interface {
	pulumi.Input

	ToWarehouseMapOutput() WarehouseMapOutput
	ToWarehouseMapOutputWithContext(context.Context) WarehouseMapOutput
}

type WarehouseMap map[string]WarehouseInput

func (WarehouseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Warehouse)(nil)).Elem()
}

func (i WarehouseMap) ToWarehouseMapOutput() WarehouseMapOutput {
	return i.ToWarehouseMapOutputWithContext(context.Background())
}

func (i WarehouseMap) ToWarehouseMapOutputWithContext(ctx context.Context) WarehouseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WarehouseMapOutput)
}

type WarehouseOutput struct{ *pulumi.OutputState }

func (WarehouseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Warehouse)(nil)).Elem()
}

func (o WarehouseOutput) ToWarehouseOutput() WarehouseOutput {
	return o
}

func (o WarehouseOutput) ToWarehouseOutputWithContext(ctx context.Context) WarehouseOutput {
	return o
}

// Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
func (o WarehouseOutput) AutoResume() pulumi.BoolOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.BoolOutput { return v.AutoResume }).(pulumi.BoolOutput)
}

// Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
func (o WarehouseOutput) AutoSuspend() pulumi.IntOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntOutput { return v.AutoSuspend }).(pulumi.IntOutput)
}

func (o WarehouseOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
func (o WarehouseOutput) EnableQueryAcceleration() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.BoolPtrOutput { return v.EnableQueryAcceleration }).(pulumi.BoolPtrOutput)
}

// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
func (o WarehouseOutput) InitiallySuspended() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.BoolPtrOutput { return v.InitiallySuspended }).(pulumi.BoolPtrOutput)
}

// Specifies the maximum number of server clusters for the warehouse.
func (o WarehouseOutput) MaxClusterCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntOutput { return v.MaxClusterCount }).(pulumi.IntOutput)
}

// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
func (o WarehouseOutput) MaxConcurrencyLevel() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.MaxConcurrencyLevel }).(pulumi.IntPtrOutput)
}

// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
func (o WarehouseOutput) MinClusterCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntOutput { return v.MinClusterCount }).(pulumi.IntOutput)
}

// Identifier for the virtual warehouse; must be unique for your account.
func (o WarehouseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
func (o WarehouseOutput) QueryAccelerationMaxScaleFactor() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.QueryAccelerationMaxScaleFactor }).(pulumi.IntPtrOutput)
}

// Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
func (o WarehouseOutput) ResourceMonitor() pulumi.StringOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringOutput { return v.ResourceMonitor }).(pulumi.StringOutput)
}

// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
func (o WarehouseOutput) ScalingPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringOutput { return v.ScalingPolicy }).(pulumi.StringOutput)
}

// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
func (o WarehouseOutput) StatementQueuedTimeoutInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.StatementQueuedTimeoutInSeconds }).(pulumi.IntPtrOutput)
}

// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
func (o WarehouseOutput) StatementTimeoutInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.StatementTimeoutInSeconds }).(pulumi.IntPtrOutput)
}

// Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
//
// Deprecated: This field is deprecated and will be removed in the next major version of the provider. It doesn't do anything and should be removed from your configuration.
func (o WarehouseOutput) WaitForProvisioning() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.BoolPtrOutput { return v.WaitForProvisioning }).(pulumi.BoolPtrOutput)
}

// Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
func (o WarehouseOutput) WarehouseSize() pulumi.StringOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringOutput { return v.WarehouseSize }).(pulumi.StringOutput)
}

// Specifies a STANDARD or SNOWPARK-OPTIMIZED warehouse
func (o WarehouseOutput) WarehouseType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.WarehouseType }).(pulumi.StringPtrOutput)
}

type WarehouseArrayOutput struct{ *pulumi.OutputState }

func (WarehouseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Warehouse)(nil)).Elem()
}

func (o WarehouseArrayOutput) ToWarehouseArrayOutput() WarehouseArrayOutput {
	return o
}

func (o WarehouseArrayOutput) ToWarehouseArrayOutputWithContext(ctx context.Context) WarehouseArrayOutput {
	return o
}

func (o WarehouseArrayOutput) Index(i pulumi.IntInput) WarehouseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Warehouse {
		return vs[0].([]*Warehouse)[vs[1].(int)]
	}).(WarehouseOutput)
}

type WarehouseMapOutput struct{ *pulumi.OutputState }

func (WarehouseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Warehouse)(nil)).Elem()
}

func (o WarehouseMapOutput) ToWarehouseMapOutput() WarehouseMapOutput {
	return o
}

func (o WarehouseMapOutput) ToWarehouseMapOutputWithContext(ctx context.Context) WarehouseMapOutput {
	return o
}

func (o WarehouseMapOutput) MapIndex(k pulumi.StringInput) WarehouseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Warehouse {
		return vs[0].(map[string]*Warehouse)[vs[1].(string)]
	}).(WarehouseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WarehouseInput)(nil)).Elem(), &Warehouse{})
	pulumi.RegisterInputType(reflect.TypeOf((*WarehouseArrayInput)(nil)).Elem(), WarehouseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WarehouseMapInput)(nil)).Elem(), WarehouseMap{})
	pulumi.RegisterOutputType(WarehouseOutput{})
	pulumi.RegisterOutputType(WarehouseArrayOutput{})
	pulumi.RegisterOutputType(WarehouseMapOutput{})
}
