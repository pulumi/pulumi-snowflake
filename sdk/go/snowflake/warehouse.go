// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ```sh
// $ pulumi import snowflake:index/warehouse:Warehouse example '"<warehouse_name>"'
// ```
type Warehouse struct {
	pulumi.CustomResourceState

	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AutoResume pulumi.StringPtrOutput `pulumi:"autoResume"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend pulumi.IntPtrOutput `pulumi:"autoSuspend"`
	// Specifies a comment for the warehouse.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	EnableQueryAcceleration pulumi.StringPtrOutput `pulumi:"enableQueryAcceleration"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended pulumi.BoolPtrOutput `pulumi:"initiallySuspended"`
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount pulumi.IntPtrOutput `pulumi:"maxClusterCount"`
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel pulumi.IntOutput `pulumi:"maxConcurrencyLevel"`
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount pulumi.IntPtrOutput `pulumi:"minClusterCount"`
	// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
	Parameters WarehouseParameterArrayOutput `pulumi:"parameters"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor pulumi.IntPtrOutput `pulumi:"queryAccelerationMaxScaleFactor"`
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
	ResourceMonitor pulumi.StringPtrOutput `pulumi:"resourceMonitor"`
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
	ScalingPolicy pulumi.StringPtrOutput `pulumi:"scalingPolicy"`
	// Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
	ShowOutputs WarehouseShowOutputArrayOutput `pulumi:"showOutputs"`
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds pulumi.IntOutput `pulumi:"statementQueuedTimeoutInSeconds"`
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds pulumi.IntOutput `pulumi:"statementTimeoutInSeconds"`
	// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
	WarehouseSize pulumi.StringPtrOutput `pulumi:"warehouseSize"`
	// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
	WarehouseType pulumi.StringPtrOutput `pulumi:"warehouseType"`
}

// NewWarehouse registers a new resource with the given unique name, arguments, and options.
func NewWarehouse(ctx *pulumi.Context,
	name string, args *WarehouseArgs, opts ...pulumi.ResourceOption) (*Warehouse, error) {
	if args == nil {
		args = &WarehouseArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
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
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AutoResume *string `pulumi:"autoResume"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend *int `pulumi:"autoSuspend"`
	// Specifies a comment for the warehouse.
	Comment *string `pulumi:"comment"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	EnableQueryAcceleration *string `pulumi:"enableQueryAcceleration"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended *bool `pulumi:"initiallySuspended"`
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount *int `pulumi:"maxClusterCount"`
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel *int `pulumi:"maxConcurrencyLevel"`
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount *int `pulumi:"minClusterCount"`
	// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
	Parameters []WarehouseParameter `pulumi:"parameters"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor *int `pulumi:"queryAccelerationMaxScaleFactor"`
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
	ResourceMonitor *string `pulumi:"resourceMonitor"`
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
	ScalingPolicy *string `pulumi:"scalingPolicy"`
	// Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
	ShowOutputs []WarehouseShowOutput `pulumi:"showOutputs"`
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds *int `pulumi:"statementQueuedTimeoutInSeconds"`
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds *int `pulumi:"statementTimeoutInSeconds"`
	// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
	WarehouseSize *string `pulumi:"warehouseSize"`
	// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
	WarehouseType *string `pulumi:"warehouseType"`
}

type WarehouseState struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AutoResume pulumi.StringPtrInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend pulumi.IntPtrInput
	// Specifies a comment for the warehouse.
	Comment pulumi.StringPtrInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	EnableQueryAcceleration pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended pulumi.BoolPtrInput
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount pulumi.IntPtrInput
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel pulumi.IntPtrInput
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount pulumi.IntPtrInput
	// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
	Parameters WarehouseParameterArrayInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor pulumi.IntPtrInput
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
	ResourceMonitor pulumi.StringPtrInput
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
	ScalingPolicy pulumi.StringPtrInput
	// Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
	ShowOutputs WarehouseShowOutputArrayInput
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds pulumi.IntPtrInput
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds pulumi.IntPtrInput
	// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
	WarehouseSize pulumi.StringPtrInput
	// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
	WarehouseType pulumi.StringPtrInput
}

func (WarehouseState) ElementType() reflect.Type {
	return reflect.TypeOf((*warehouseState)(nil)).Elem()
}

type warehouseArgs struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AutoResume *string `pulumi:"autoResume"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend *int `pulumi:"autoSuspend"`
	// Specifies a comment for the warehouse.
	Comment *string `pulumi:"comment"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	EnableQueryAcceleration *string `pulumi:"enableQueryAcceleration"`
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended *bool `pulumi:"initiallySuspended"`
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount *int `pulumi:"maxClusterCount"`
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel *int `pulumi:"maxConcurrencyLevel"`
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount *int `pulumi:"minClusterCount"`
	// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor *int `pulumi:"queryAccelerationMaxScaleFactor"`
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
	ResourceMonitor *string `pulumi:"resourceMonitor"`
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
	ScalingPolicy *string `pulumi:"scalingPolicy"`
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds *int `pulumi:"statementQueuedTimeoutInSeconds"`
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds *int `pulumi:"statementTimeoutInSeconds"`
	// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
	WarehouseSize *string `pulumi:"warehouseSize"`
	// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
	WarehouseType *string `pulumi:"warehouseType"`
}

// The set of arguments for constructing a Warehouse resource.
type WarehouseArgs struct {
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	AutoResume pulumi.StringPtrInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
	AutoSuspend pulumi.IntPtrInput
	// Specifies a comment for the warehouse.
	Comment pulumi.StringPtrInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	EnableQueryAcceleration pulumi.StringPtrInput
	// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
	InitiallySuspended pulumi.BoolPtrInput
	// Specifies the maximum number of server clusters for the warehouse.
	MaxClusterCount pulumi.IntPtrInput
	// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
	MaxConcurrencyLevel pulumi.IntPtrInput
	// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
	MinClusterCount pulumi.IntPtrInput
	// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
	QueryAccelerationMaxScaleFactor pulumi.IntPtrInput
	// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
	ResourceMonitor pulumi.StringPtrInput
	// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
	ScalingPolicy pulumi.StringPtrInput
	// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
	StatementQueuedTimeoutInSeconds pulumi.IntPtrInput
	// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
	StatementTimeoutInSeconds pulumi.IntPtrInput
	// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
	WarehouseSize pulumi.StringPtrInput
	// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
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

// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
func (o WarehouseOutput) AutoResume() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.AutoResume }).(pulumi.StringPtrOutput)
}

// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
func (o WarehouseOutput) AutoSuspend() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.AutoSuspend }).(pulumi.IntPtrOutput)
}

// Specifies a comment for the warehouse.
func (o WarehouseOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
func (o WarehouseOutput) EnableQueryAcceleration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.EnableQueryAcceleration }).(pulumi.StringPtrOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o WarehouseOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies whether the warehouse is created initially in the ‘Suspended’ state.
func (o WarehouseOutput) InitiallySuspended() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.BoolPtrOutput { return v.InitiallySuspended }).(pulumi.BoolPtrOutput)
}

// Specifies the maximum number of server clusters for the warehouse.
func (o WarehouseOutput) MaxClusterCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.MaxClusterCount }).(pulumi.IntPtrOutput)
}

// Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
func (o WarehouseOutput) MaxConcurrencyLevel() pulumi.IntOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntOutput { return v.MaxConcurrencyLevel }).(pulumi.IntOutput)
}

// Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
func (o WarehouseOutput) MinClusterCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.MinClusterCount }).(pulumi.IntPtrOutput)
}

// Identifier for the virtual warehouse; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o WarehouseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW PARAMETERS IN WAREHOUSE` for the given warehouse.
func (o WarehouseOutput) Parameters() WarehouseParameterArrayOutput {
	return o.ApplyT(func(v *Warehouse) WarehouseParameterArrayOutput { return v.Parameters }).(WarehouseParameterArrayOutput)
}

// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
func (o WarehouseOutput) QueryAccelerationMaxScaleFactor() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntPtrOutput { return v.QueryAccelerationMaxScaleFactor }).(pulumi.IntPtrOutput)
}

// Specifies the name of a resource monitor that is explicitly assigned to the warehouse. For more information about this resource, see docs.
func (o WarehouseOutput) ResourceMonitor() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.ResourceMonitor }).(pulumi.StringPtrOutput)
}

// Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode. Valid values are (case-insensitive): `STANDARD` | `ECONOMY`.
func (o WarehouseOutput) ScalingPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.ScalingPolicy }).(pulumi.StringPtrOutput)
}

// Outputs the result of `SHOW WAREHOUSES` for the given warehouse.
func (o WarehouseOutput) ShowOutputs() WarehouseShowOutputArrayOutput {
	return o.ApplyT(func(v *Warehouse) WarehouseShowOutputArrayOutput { return v.ShowOutputs }).(WarehouseShowOutputArrayOutput)
}

// Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
func (o WarehouseOutput) StatementQueuedTimeoutInSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntOutput { return v.StatementQueuedTimeoutInSeconds }).(pulumi.IntOutput)
}

// Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
func (o WarehouseOutput) StatementTimeoutInSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.IntOutput { return v.StatementTimeoutInSeconds }).(pulumi.IntOutput)
}

// Specifies the size of the virtual warehouse. Valid values are (case-insensitive): `XSMALL` | `X-SMALL` | `SMALL` | `MEDIUM` | `LARGE` | `XLARGE` | `X-LARGE` | `XXLARGE` | `X2LARGE` | `2X-LARGE` | `XXXLARGE` | `X3LARGE` | `3X-LARGE` | `X4LARGE` | `4X-LARGE` | `X5LARGE` | `5X-LARGE` | `X6LARGE` | `6X-LARGE`. Consult [warehouse documentation](https://docs.snowflake.com/en/sql-reference/sql/create-warehouse#optional-properties-objectproperties) for the details. Note: removing the size from config will result in the resource recreation.
func (o WarehouseOutput) WarehouseSize() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Warehouse) pulumi.StringPtrOutput { return v.WarehouseSize }).(pulumi.StringPtrOutput)
}

// Specifies warehouse type. Valid values are (case-insensitive): `STANDARD` | `SNOWPARK-OPTIMIZED`. Warehouse needs to be suspended to change its type. Provider will handle automatic suspension and resumption if needed.
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
