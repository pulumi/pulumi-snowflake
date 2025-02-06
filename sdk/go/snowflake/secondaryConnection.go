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

// ## Import
//
// ```sh
// $ pulumi import snowflake:index/secondaryConnection:SecondaryConnection example '"<secondary_connection_name>"'
// ```
type SecondaryConnection struct {
	pulumi.CustomResourceState

	// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
	AsReplicaOf pulumi.StringOutput `pulumi:"asReplicaOf"`
	// Specifies a comment for the secondary connection.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
	IsPrimary pulumi.BoolOutput `pulumi:"isPrimary"`
	// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Outputs the result of `SHOW CONNECTIONS` for the given connection.
	ShowOutputs SecondaryConnectionShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewSecondaryConnection registers a new resource with the given unique name, arguments, and options.
func NewSecondaryConnection(ctx *pulumi.Context,
	name string, args *SecondaryConnectionArgs, opts ...pulumi.ResourceOption) (*SecondaryConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AsReplicaOf == nil {
		return nil, errors.New("invalid value for required argument 'AsReplicaOf'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecondaryConnection
	err := ctx.RegisterResource("snowflake:index/secondaryConnection:SecondaryConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecondaryConnection gets an existing SecondaryConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecondaryConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecondaryConnectionState, opts ...pulumi.ResourceOption) (*SecondaryConnection, error) {
	var resource SecondaryConnection
	err := ctx.ReadResource("snowflake:index/secondaryConnection:SecondaryConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecondaryConnection resources.
type secondaryConnectionState struct {
	// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
	AsReplicaOf *string `pulumi:"asReplicaOf"`
	// Specifies a comment for the secondary connection.
	Comment *string `pulumi:"comment"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
	IsPrimary *bool `pulumi:"isPrimary"`
	// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Outputs the result of `SHOW CONNECTIONS` for the given connection.
	ShowOutputs []SecondaryConnectionShowOutput `pulumi:"showOutputs"`
}

type SecondaryConnectionState struct {
	// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
	AsReplicaOf pulumi.StringPtrInput
	// Specifies a comment for the secondary connection.
	Comment pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
	IsPrimary pulumi.BoolPtrInput
	// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Outputs the result of `SHOW CONNECTIONS` for the given connection.
	ShowOutputs SecondaryConnectionShowOutputArrayInput
}

func (SecondaryConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*secondaryConnectionState)(nil)).Elem()
}

type secondaryConnectionArgs struct {
	// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
	AsReplicaOf string `pulumi:"asReplicaOf"`
	// Specifies a comment for the secondary connection.
	Comment *string `pulumi:"comment"`
	// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a SecondaryConnection resource.
type SecondaryConnectionArgs struct {
	// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
	AsReplicaOf pulumi.StringInput
	// Specifies a comment for the secondary connection.
	Comment pulumi.StringPtrInput
	// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
}

func (SecondaryConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secondaryConnectionArgs)(nil)).Elem()
}

type SecondaryConnectionInput interface {
	pulumi.Input

	ToSecondaryConnectionOutput() SecondaryConnectionOutput
	ToSecondaryConnectionOutputWithContext(ctx context.Context) SecondaryConnectionOutput
}

func (*SecondaryConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**SecondaryConnection)(nil)).Elem()
}

func (i *SecondaryConnection) ToSecondaryConnectionOutput() SecondaryConnectionOutput {
	return i.ToSecondaryConnectionOutputWithContext(context.Background())
}

func (i *SecondaryConnection) ToSecondaryConnectionOutputWithContext(ctx context.Context) SecondaryConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecondaryConnectionOutput)
}

// SecondaryConnectionArrayInput is an input type that accepts SecondaryConnectionArray and SecondaryConnectionArrayOutput values.
// You can construct a concrete instance of `SecondaryConnectionArrayInput` via:
//
//	SecondaryConnectionArray{ SecondaryConnectionArgs{...} }
type SecondaryConnectionArrayInput interface {
	pulumi.Input

	ToSecondaryConnectionArrayOutput() SecondaryConnectionArrayOutput
	ToSecondaryConnectionArrayOutputWithContext(context.Context) SecondaryConnectionArrayOutput
}

type SecondaryConnectionArray []SecondaryConnectionInput

func (SecondaryConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecondaryConnection)(nil)).Elem()
}

func (i SecondaryConnectionArray) ToSecondaryConnectionArrayOutput() SecondaryConnectionArrayOutput {
	return i.ToSecondaryConnectionArrayOutputWithContext(context.Background())
}

func (i SecondaryConnectionArray) ToSecondaryConnectionArrayOutputWithContext(ctx context.Context) SecondaryConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecondaryConnectionArrayOutput)
}

// SecondaryConnectionMapInput is an input type that accepts SecondaryConnectionMap and SecondaryConnectionMapOutput values.
// You can construct a concrete instance of `SecondaryConnectionMapInput` via:
//
//	SecondaryConnectionMap{ "key": SecondaryConnectionArgs{...} }
type SecondaryConnectionMapInput interface {
	pulumi.Input

	ToSecondaryConnectionMapOutput() SecondaryConnectionMapOutput
	ToSecondaryConnectionMapOutputWithContext(context.Context) SecondaryConnectionMapOutput
}

type SecondaryConnectionMap map[string]SecondaryConnectionInput

func (SecondaryConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecondaryConnection)(nil)).Elem()
}

func (i SecondaryConnectionMap) ToSecondaryConnectionMapOutput() SecondaryConnectionMapOutput {
	return i.ToSecondaryConnectionMapOutputWithContext(context.Background())
}

func (i SecondaryConnectionMap) ToSecondaryConnectionMapOutputWithContext(ctx context.Context) SecondaryConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecondaryConnectionMapOutput)
}

type SecondaryConnectionOutput struct{ *pulumi.OutputState }

func (SecondaryConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecondaryConnection)(nil)).Elem()
}

func (o SecondaryConnectionOutput) ToSecondaryConnectionOutput() SecondaryConnectionOutput {
	return o
}

func (o SecondaryConnectionOutput) ToSecondaryConnectionOutputWithContext(ctx context.Context) SecondaryConnectionOutput {
	return o
}

// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
func (o SecondaryConnectionOutput) AsReplicaOf() pulumi.StringOutput {
	return o.ApplyT(func(v *SecondaryConnection) pulumi.StringOutput { return v.AsReplicaOf }).(pulumi.StringOutput)
}

// Specifies a comment for the secondary connection.
func (o SecondaryConnectionOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecondaryConnection) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o SecondaryConnectionOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *SecondaryConnection) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
func (o SecondaryConnectionOutput) IsPrimary() pulumi.BoolOutput {
	return o.ApplyT(func(v *SecondaryConnection) pulumi.BoolOutput { return v.IsPrimary }).(pulumi.BoolOutput)
}

// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecondaryConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecondaryConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW CONNECTIONS` for the given connection.
func (o SecondaryConnectionOutput) ShowOutputs() SecondaryConnectionShowOutputArrayOutput {
	return o.ApplyT(func(v *SecondaryConnection) SecondaryConnectionShowOutputArrayOutput { return v.ShowOutputs }).(SecondaryConnectionShowOutputArrayOutput)
}

type SecondaryConnectionArrayOutput struct{ *pulumi.OutputState }

func (SecondaryConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecondaryConnection)(nil)).Elem()
}

func (o SecondaryConnectionArrayOutput) ToSecondaryConnectionArrayOutput() SecondaryConnectionArrayOutput {
	return o
}

func (o SecondaryConnectionArrayOutput) ToSecondaryConnectionArrayOutputWithContext(ctx context.Context) SecondaryConnectionArrayOutput {
	return o
}

func (o SecondaryConnectionArrayOutput) Index(i pulumi.IntInput) SecondaryConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecondaryConnection {
		return vs[0].([]*SecondaryConnection)[vs[1].(int)]
	}).(SecondaryConnectionOutput)
}

type SecondaryConnectionMapOutput struct{ *pulumi.OutputState }

func (SecondaryConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecondaryConnection)(nil)).Elem()
}

func (o SecondaryConnectionMapOutput) ToSecondaryConnectionMapOutput() SecondaryConnectionMapOutput {
	return o
}

func (o SecondaryConnectionMapOutput) ToSecondaryConnectionMapOutputWithContext(ctx context.Context) SecondaryConnectionMapOutput {
	return o
}

func (o SecondaryConnectionMapOutput) MapIndex(k pulumi.StringInput) SecondaryConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecondaryConnection {
		return vs[0].(map[string]*SecondaryConnection)[vs[1].(string)]
	}).(SecondaryConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecondaryConnectionInput)(nil)).Elem(), &SecondaryConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecondaryConnectionArrayInput)(nil)).Elem(), SecondaryConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecondaryConnectionMapInput)(nil)).Elem(), SecondaryConnectionMap{})
	pulumi.RegisterOutputType(SecondaryConnectionOutput{})
	pulumi.RegisterOutputType(SecondaryConnectionArrayOutput{})
	pulumi.RegisterOutputType(SecondaryConnectionMapOutput{})
}
