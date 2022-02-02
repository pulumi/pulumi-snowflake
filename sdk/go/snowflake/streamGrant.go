// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := snowflake.NewStreamGrant(ctx, "grant", &snowflake.StreamGrantArgs{
// 			DatabaseName: pulumi.String("db"),
// 			OnFuture:     pulumi.Bool(false),
// 			Privilege:    pulumi.String("select"),
// 			Roles: pulumi.StringArray{
// 				pulumi.String("role1"),
// 				pulumi.String("role2"),
// 			},
// 			SchemaName:      pulumi.String("schema"),
// 			StreamName:      pulumi.String("view"),
// 			WithGrantOption: pulumi.Bool(false),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// # format is database name | schema name | stream name | privilege | true/false for with_grant_option
//
// ```sh
//  $ pulumi import snowflake:index/streamGrant:StreamGrant example 'dbName|schemaName|streamName|SELECT|false'
// ```
type StreamGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future streams on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future streams in the given schema. When this is true and no schema*name is provided apply this grant on all future streams in the given database. The stream*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future stream.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future streams on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// The name of the stream on which to grant privileges immediately (only valid if onFuture is false).
	StreamName pulumi.StringPtrOutput `pulumi:"streamName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewStreamGrant registers a new resource with the given unique name, arguments, and options.
func NewStreamGrant(ctx *pulumi.Context,
	name string, args *StreamGrantArgs, opts ...pulumi.ResourceOption) (*StreamGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	var resource StreamGrant
	err := ctx.RegisterResource("snowflake:index/streamGrant:StreamGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamGrant gets an existing StreamGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamGrantState, opts ...pulumi.ResourceOption) (*StreamGrant, error) {
	var resource StreamGrant
	err := ctx.ReadResource("snowflake:index/streamGrant:StreamGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamGrant resources.
type streamGrantState struct {
	// The name of the database containing the current or future streams on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future streams in the given schema. When this is true and no schema*name is provided apply this grant on all future streams in the given database. The stream*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future stream.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future streams on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// The name of the stream on which to grant privileges immediately (only valid if onFuture is false).
	StreamName *string `pulumi:"streamName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type StreamGrantState struct {
	// The name of the database containing the current or future streams on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future streams in the given schema. When this is true and no schema*name is provided apply this grant on all future streams in the given database. The stream*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future stream.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future streams on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// The name of the stream on which to grant privileges immediately (only valid if onFuture is false).
	StreamName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (StreamGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamGrantState)(nil)).Elem()
}

type streamGrantArgs struct {
	// The name of the database containing the current or future streams on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future streams in the given schema. When this is true and no schema*name is provided apply this grant on all future streams in the given database. The stream*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future stream.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future streams on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// The name of the stream on which to grant privileges immediately (only valid if onFuture is false).
	StreamName *string `pulumi:"streamName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a StreamGrant resource.
type StreamGrantArgs struct {
	// The name of the database containing the current or future streams on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true and a schema*name is provided, apply this grant on all future streams in the given schema. When this is true and no schema*name is provided apply this grant on all future streams in the given database. The stream*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future stream.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future streams on which to grant privileges.
	SchemaName pulumi.StringInput
	// The name of the stream on which to grant privileges immediately (only valid if onFuture is false).
	StreamName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (StreamGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamGrantArgs)(nil)).Elem()
}

type StreamGrantInput interface {
	pulumi.Input

	ToStreamGrantOutput() StreamGrantOutput
	ToStreamGrantOutputWithContext(ctx context.Context) StreamGrantOutput
}

func (*StreamGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamGrant)(nil)).Elem()
}

func (i *StreamGrant) ToStreamGrantOutput() StreamGrantOutput {
	return i.ToStreamGrantOutputWithContext(context.Background())
}

func (i *StreamGrant) ToStreamGrantOutputWithContext(ctx context.Context) StreamGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamGrantOutput)
}

// StreamGrantArrayInput is an input type that accepts StreamGrantArray and StreamGrantArrayOutput values.
// You can construct a concrete instance of `StreamGrantArrayInput` via:
//
//          StreamGrantArray{ StreamGrantArgs{...} }
type StreamGrantArrayInput interface {
	pulumi.Input

	ToStreamGrantArrayOutput() StreamGrantArrayOutput
	ToStreamGrantArrayOutputWithContext(context.Context) StreamGrantArrayOutput
}

type StreamGrantArray []StreamGrantInput

func (StreamGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamGrant)(nil)).Elem()
}

func (i StreamGrantArray) ToStreamGrantArrayOutput() StreamGrantArrayOutput {
	return i.ToStreamGrantArrayOutputWithContext(context.Background())
}

func (i StreamGrantArray) ToStreamGrantArrayOutputWithContext(ctx context.Context) StreamGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamGrantArrayOutput)
}

// StreamGrantMapInput is an input type that accepts StreamGrantMap and StreamGrantMapOutput values.
// You can construct a concrete instance of `StreamGrantMapInput` via:
//
//          StreamGrantMap{ "key": StreamGrantArgs{...} }
type StreamGrantMapInput interface {
	pulumi.Input

	ToStreamGrantMapOutput() StreamGrantMapOutput
	ToStreamGrantMapOutputWithContext(context.Context) StreamGrantMapOutput
}

type StreamGrantMap map[string]StreamGrantInput

func (StreamGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamGrant)(nil)).Elem()
}

func (i StreamGrantMap) ToStreamGrantMapOutput() StreamGrantMapOutput {
	return i.ToStreamGrantMapOutputWithContext(context.Background())
}

func (i StreamGrantMap) ToStreamGrantMapOutputWithContext(ctx context.Context) StreamGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamGrantMapOutput)
}

type StreamGrantOutput struct{ *pulumi.OutputState }

func (StreamGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamGrant)(nil)).Elem()
}

func (o StreamGrantOutput) ToStreamGrantOutput() StreamGrantOutput {
	return o
}

func (o StreamGrantOutput) ToStreamGrantOutputWithContext(ctx context.Context) StreamGrantOutput {
	return o
}

type StreamGrantArrayOutput struct{ *pulumi.OutputState }

func (StreamGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamGrant)(nil)).Elem()
}

func (o StreamGrantArrayOutput) ToStreamGrantArrayOutput() StreamGrantArrayOutput {
	return o
}

func (o StreamGrantArrayOutput) ToStreamGrantArrayOutputWithContext(ctx context.Context) StreamGrantArrayOutput {
	return o
}

func (o StreamGrantArrayOutput) Index(i pulumi.IntInput) StreamGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamGrant {
		return vs[0].([]*StreamGrant)[vs[1].(int)]
	}).(StreamGrantOutput)
}

type StreamGrantMapOutput struct{ *pulumi.OutputState }

func (StreamGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamGrant)(nil)).Elem()
}

func (o StreamGrantMapOutput) ToStreamGrantMapOutput() StreamGrantMapOutput {
	return o
}

func (o StreamGrantMapOutput) ToStreamGrantMapOutputWithContext(ctx context.Context) StreamGrantMapOutput {
	return o
}

func (o StreamGrantMapOutput) MapIndex(k pulumi.StringInput) StreamGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamGrant {
		return vs[0].(map[string]*StreamGrant)[vs[1].(string)]
	}).(StreamGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamGrantInput)(nil)).Elem(), &StreamGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamGrantArrayInput)(nil)).Elem(), StreamGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamGrantMapInput)(nil)).Elem(), StreamGrantMap{})
	pulumi.RegisterOutputType(StreamGrantOutput{})
	pulumi.RegisterOutputType(StreamGrantArrayOutput{})
	pulumi.RegisterOutputType(StreamGrantMapOutput{})
}
