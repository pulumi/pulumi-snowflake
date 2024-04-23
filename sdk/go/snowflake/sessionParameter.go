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
//			_, err := snowflake.NewSessionParameter(ctx, "s", &snowflake.SessionParameterArgs{
//				Key:   pulumi.String("AUTOCOMMIT"),
//				Value: pulumi.String("false"),
//				User:  pulumi.String("TEST_USER"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewSessionParameter(ctx, "s2", &snowflake.SessionParameterArgs{
//				Key:       pulumi.String("BINARY_OUTPUT_FORMAT"),
//				Value:     pulumi.String("BASE64"),
//				OnAccount: pulumi.Bool(true),
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
// $ pulumi import snowflake:index/sessionParameter:SessionParameter s <parameter_name>
// ```
type SessionParameter struct {
	pulumi.CustomResourceState

	// Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
	Key pulumi.StringOutput `pulumi:"key"`
	// If true, the session parameter will be set on the account level.
	OnAccount pulumi.BoolPtrOutput `pulumi:"onAccount"`
	// The user to set the session parameter for. Required if onAccount is false
	User pulumi.StringPtrOutput `pulumi:"user"`
	// Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewSessionParameter registers a new resource with the given unique name, arguments, and options.
func NewSessionParameter(ctx *pulumi.Context,
	name string, args *SessionParameterArgs, opts ...pulumi.ResourceOption) (*SessionParameter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SessionParameter
	err := ctx.RegisterResource("snowflake:index/sessionParameter:SessionParameter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSessionParameter gets an existing SessionParameter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSessionParameter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SessionParameterState, opts ...pulumi.ResourceOption) (*SessionParameter, error) {
	var resource SessionParameter
	err := ctx.ReadResource("snowflake:index/sessionParameter:SessionParameter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SessionParameter resources.
type sessionParameterState struct {
	// Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
	Key *string `pulumi:"key"`
	// If true, the session parameter will be set on the account level.
	OnAccount *bool `pulumi:"onAccount"`
	// The user to set the session parameter for. Required if onAccount is false
	User *string `pulumi:"user"`
	// Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value *string `pulumi:"value"`
}

type SessionParameterState struct {
	// Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
	Key pulumi.StringPtrInput
	// If true, the session parameter will be set on the account level.
	OnAccount pulumi.BoolPtrInput
	// The user to set the session parameter for. Required if onAccount is false
	User pulumi.StringPtrInput
	// Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value pulumi.StringPtrInput
}

func (SessionParameterState) ElementType() reflect.Type {
	return reflect.TypeOf((*sessionParameterState)(nil)).Elem()
}

type sessionParameterArgs struct {
	// Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
	Key string `pulumi:"key"`
	// If true, the session parameter will be set on the account level.
	OnAccount *bool `pulumi:"onAccount"`
	// The user to set the session parameter for. Required if onAccount is false
	User *string `pulumi:"user"`
	// Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a SessionParameter resource.
type SessionParameterArgs struct {
	// Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
	Key pulumi.StringInput
	// If true, the session parameter will be set on the account level.
	OnAccount pulumi.BoolPtrInput
	// The user to set the session parameter for. Required if onAccount is false
	User pulumi.StringPtrInput
	// Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
	Value pulumi.StringInput
}

func (SessionParameterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sessionParameterArgs)(nil)).Elem()
}

type SessionParameterInput interface {
	pulumi.Input

	ToSessionParameterOutput() SessionParameterOutput
	ToSessionParameterOutputWithContext(ctx context.Context) SessionParameterOutput
}

func (*SessionParameter) ElementType() reflect.Type {
	return reflect.TypeOf((**SessionParameter)(nil)).Elem()
}

func (i *SessionParameter) ToSessionParameterOutput() SessionParameterOutput {
	return i.ToSessionParameterOutputWithContext(context.Background())
}

func (i *SessionParameter) ToSessionParameterOutputWithContext(ctx context.Context) SessionParameterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SessionParameterOutput)
}

// SessionParameterArrayInput is an input type that accepts SessionParameterArray and SessionParameterArrayOutput values.
// You can construct a concrete instance of `SessionParameterArrayInput` via:
//
//	SessionParameterArray{ SessionParameterArgs{...} }
type SessionParameterArrayInput interface {
	pulumi.Input

	ToSessionParameterArrayOutput() SessionParameterArrayOutput
	ToSessionParameterArrayOutputWithContext(context.Context) SessionParameterArrayOutput
}

type SessionParameterArray []SessionParameterInput

func (SessionParameterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SessionParameter)(nil)).Elem()
}

func (i SessionParameterArray) ToSessionParameterArrayOutput() SessionParameterArrayOutput {
	return i.ToSessionParameterArrayOutputWithContext(context.Background())
}

func (i SessionParameterArray) ToSessionParameterArrayOutputWithContext(ctx context.Context) SessionParameterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SessionParameterArrayOutput)
}

// SessionParameterMapInput is an input type that accepts SessionParameterMap and SessionParameterMapOutput values.
// You can construct a concrete instance of `SessionParameterMapInput` via:
//
//	SessionParameterMap{ "key": SessionParameterArgs{...} }
type SessionParameterMapInput interface {
	pulumi.Input

	ToSessionParameterMapOutput() SessionParameterMapOutput
	ToSessionParameterMapOutputWithContext(context.Context) SessionParameterMapOutput
}

type SessionParameterMap map[string]SessionParameterInput

func (SessionParameterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SessionParameter)(nil)).Elem()
}

func (i SessionParameterMap) ToSessionParameterMapOutput() SessionParameterMapOutput {
	return i.ToSessionParameterMapOutputWithContext(context.Background())
}

func (i SessionParameterMap) ToSessionParameterMapOutputWithContext(ctx context.Context) SessionParameterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SessionParameterMapOutput)
}

type SessionParameterOutput struct{ *pulumi.OutputState }

func (SessionParameterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SessionParameter)(nil)).Elem()
}

func (o SessionParameterOutput) ToSessionParameterOutput() SessionParameterOutput {
	return o
}

func (o SessionParameterOutput) ToSessionParameterOutputWithContext(ctx context.Context) SessionParameterOutput {
	return o
}

// Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
func (o SessionParameterOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *SessionParameter) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// If true, the session parameter will be set on the account level.
func (o SessionParameterOutput) OnAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SessionParameter) pulumi.BoolPtrOutput { return v.OnAccount }).(pulumi.BoolPtrOutput)
}

// The user to set the session parameter for. Required if onAccount is false
func (o SessionParameterOutput) User() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SessionParameter) pulumi.StringPtrOutput { return v.User }).(pulumi.StringPtrOutput)
}

// Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
func (o SessionParameterOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *SessionParameter) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type SessionParameterArrayOutput struct{ *pulumi.OutputState }

func (SessionParameterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SessionParameter)(nil)).Elem()
}

func (o SessionParameterArrayOutput) ToSessionParameterArrayOutput() SessionParameterArrayOutput {
	return o
}

func (o SessionParameterArrayOutput) ToSessionParameterArrayOutputWithContext(ctx context.Context) SessionParameterArrayOutput {
	return o
}

func (o SessionParameterArrayOutput) Index(i pulumi.IntInput) SessionParameterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SessionParameter {
		return vs[0].([]*SessionParameter)[vs[1].(int)]
	}).(SessionParameterOutput)
}

type SessionParameterMapOutput struct{ *pulumi.OutputState }

func (SessionParameterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SessionParameter)(nil)).Elem()
}

func (o SessionParameterMapOutput) ToSessionParameterMapOutput() SessionParameterMapOutput {
	return o
}

func (o SessionParameterMapOutput) ToSessionParameterMapOutputWithContext(ctx context.Context) SessionParameterMapOutput {
	return o
}

func (o SessionParameterMapOutput) MapIndex(k pulumi.StringInput) SessionParameterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SessionParameter {
		return vs[0].(map[string]*SessionParameter)[vs[1].(string)]
	}).(SessionParameterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SessionParameterInput)(nil)).Elem(), &SessionParameter{})
	pulumi.RegisterInputType(reflect.TypeOf((*SessionParameterArrayInput)(nil)).Elem(), SessionParameterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SessionParameterMapInput)(nil)).Elem(), SessionParameterMap{})
	pulumi.RegisterOutputType(SessionParameterOutput{})
	pulumi.RegisterOutputType(SessionParameterArrayOutput{})
	pulumi.RegisterOutputType(SessionParameterMapOutput{})
}
