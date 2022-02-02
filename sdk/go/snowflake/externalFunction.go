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
// 		_, err := snowflake.NewExternalFunction(ctx, "testExtFunc", &snowflake.ExternalFunctionArgs{
// 			ApiIntegration: pulumi.String("api_integration_name"),
// 			Args: ExternalFunctionArgArray{
// 				&ExternalFunctionArgArgs{
// 					Name: pulumi.String("arg1"),
// 					Type: pulumi.String("varchar"),
// 				},
// 				&ExternalFunctionArgArgs{
// 					Name: pulumi.String("arg2"),
// 					Type: pulumi.String("varchar"),
// 				},
// 			},
// 			Database:              pulumi.String("my_test_db"),
// 			ReturnBehavior:        pulumi.String("IMMUTABLE"),
// 			ReturnType:            pulumi.String("varchar"),
// 			Schema:                pulumi.String("my_test_schema"),
// 			UrlOfProxyAndResource: pulumi.String("https://123456.execute-api.us-west-2.amazonaws.com/prod/test_func"),
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
// # format is database name | schema name | external function name | <list of function arg types, separated with '-'>
//
// ```sh
//  $ pulumi import snowflake:index/externalFunction:ExternalFunction example 'dbName|schemaName|externalFunctionName|varchar-varchar-varchar'
// ```
type ExternalFunction struct {
	pulumi.CustomResourceState

	// The name of the API integration object that should be used to authenticate the call to the proxy service.
	ApiIntegration pulumi.StringOutput `pulumi:"apiIntegration"`
	// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
	Args ExternalFunctionArgArrayOutput `pulumi:"args"`
	// A description of the external function.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
	Compression pulumi.StringPtrOutput `pulumi:"compression"`
	// Binds Snowflake context function results to HTTP headers.
	ContextHeaders pulumi.StringArrayOutput `pulumi:"contextHeaders"`
	// Date and time when the external function was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// The database in which to create the external function.
	Database pulumi.StringOutput `pulumi:"database"`
	// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
	Headers ExternalFunctionHeaderArrayOutput `pulumi:"headers"`
	// This specifies the maximum number of rows in each batch sent to the proxy service.
	MaxBatchRows pulumi.IntPtrOutput `pulumi:"maxBatchRows"`
	// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the behavior of the external function when called with null inputs.
	NullInputBehavior pulumi.StringPtrOutput `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringOutput `pulumi:"returnBehavior"`
	// Indicates whether the function can return NULL values or must return only NON-NULL values.
	ReturnNullAllowed pulumi.BoolPtrOutput `pulumi:"returnNullAllowed"`
	// Specifies the data type returned by the external function.
	ReturnType pulumi.StringOutput `pulumi:"returnType"`
	// The schema in which to create the external function.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
	UrlOfProxyAndResource pulumi.StringOutput `pulumi:"urlOfProxyAndResource"`
}

// NewExternalFunction registers a new resource with the given unique name, arguments, and options.
func NewExternalFunction(ctx *pulumi.Context,
	name string, args *ExternalFunctionArgs, opts ...pulumi.ResourceOption) (*ExternalFunction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiIntegration == nil {
		return nil, errors.New("invalid value for required argument 'ApiIntegration'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.ReturnBehavior == nil {
		return nil, errors.New("invalid value for required argument 'ReturnBehavior'")
	}
	if args.ReturnType == nil {
		return nil, errors.New("invalid value for required argument 'ReturnType'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.UrlOfProxyAndResource == nil {
		return nil, errors.New("invalid value for required argument 'UrlOfProxyAndResource'")
	}
	var resource ExternalFunction
	err := ctx.RegisterResource("snowflake:index/externalFunction:ExternalFunction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExternalFunction gets an existing ExternalFunction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExternalFunction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExternalFunctionState, opts ...pulumi.ResourceOption) (*ExternalFunction, error) {
	var resource ExternalFunction
	err := ctx.ReadResource("snowflake:index/externalFunction:ExternalFunction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExternalFunction resources.
type externalFunctionState struct {
	// The name of the API integration object that should be used to authenticate the call to the proxy service.
	ApiIntegration *string `pulumi:"apiIntegration"`
	// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
	Args []ExternalFunctionArg `pulumi:"args"`
	// A description of the external function.
	Comment *string `pulumi:"comment"`
	// If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
	Compression *string `pulumi:"compression"`
	// Binds Snowflake context function results to HTTP headers.
	ContextHeaders []string `pulumi:"contextHeaders"`
	// Date and time when the external function was created.
	CreatedOn *string `pulumi:"createdOn"`
	// The database in which to create the external function.
	Database *string `pulumi:"database"`
	// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
	Headers []ExternalFunctionHeader `pulumi:"headers"`
	// This specifies the maximum number of rows in each batch sent to the proxy service.
	MaxBatchRows *int `pulumi:"maxBatchRows"`
	// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the external function when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior *string `pulumi:"returnBehavior"`
	// Indicates whether the function can return NULL values or must return only NON-NULL values.
	ReturnNullAllowed *bool `pulumi:"returnNullAllowed"`
	// Specifies the data type returned by the external function.
	ReturnType *string `pulumi:"returnType"`
	// The schema in which to create the external function.
	Schema *string `pulumi:"schema"`
	// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
	UrlOfProxyAndResource *string `pulumi:"urlOfProxyAndResource"`
}

type ExternalFunctionState struct {
	// The name of the API integration object that should be used to authenticate the call to the proxy service.
	ApiIntegration pulumi.StringPtrInput
	// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
	Args ExternalFunctionArgArrayInput
	// A description of the external function.
	Comment pulumi.StringPtrInput
	// If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
	Compression pulumi.StringPtrInput
	// Binds Snowflake context function results to HTTP headers.
	ContextHeaders pulumi.StringArrayInput
	// Date and time when the external function was created.
	CreatedOn pulumi.StringPtrInput
	// The database in which to create the external function.
	Database pulumi.StringPtrInput
	// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
	Headers ExternalFunctionHeaderArrayInput
	// This specifies the maximum number of rows in each batch sent to the proxy service.
	MaxBatchRows pulumi.IntPtrInput
	// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the external function when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringPtrInput
	// Indicates whether the function can return NULL values or must return only NON-NULL values.
	ReturnNullAllowed pulumi.BoolPtrInput
	// Specifies the data type returned by the external function.
	ReturnType pulumi.StringPtrInput
	// The schema in which to create the external function.
	Schema pulumi.StringPtrInput
	// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
	UrlOfProxyAndResource pulumi.StringPtrInput
}

func (ExternalFunctionState) ElementType() reflect.Type {
	return reflect.TypeOf((*externalFunctionState)(nil)).Elem()
}

type externalFunctionArgs struct {
	// The name of the API integration object that should be used to authenticate the call to the proxy service.
	ApiIntegration string `pulumi:"apiIntegration"`
	// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
	Args []ExternalFunctionArg `pulumi:"args"`
	// A description of the external function.
	Comment *string `pulumi:"comment"`
	// If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
	Compression *string `pulumi:"compression"`
	// Binds Snowflake context function results to HTTP headers.
	ContextHeaders []string `pulumi:"contextHeaders"`
	// The database in which to create the external function.
	Database string `pulumi:"database"`
	// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
	Headers []ExternalFunctionHeader `pulumi:"headers"`
	// This specifies the maximum number of rows in each batch sent to the proxy service.
	MaxBatchRows *int `pulumi:"maxBatchRows"`
	// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the external function when called with null inputs.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results
	ReturnBehavior string `pulumi:"returnBehavior"`
	// Indicates whether the function can return NULL values or must return only NON-NULL values.
	ReturnNullAllowed *bool `pulumi:"returnNullAllowed"`
	// Specifies the data type returned by the external function.
	ReturnType string `pulumi:"returnType"`
	// The schema in which to create the external function.
	Schema string `pulumi:"schema"`
	// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
	UrlOfProxyAndResource string `pulumi:"urlOfProxyAndResource"`
}

// The set of arguments for constructing a ExternalFunction resource.
type ExternalFunctionArgs struct {
	// The name of the API integration object that should be used to authenticate the call to the proxy service.
	ApiIntegration pulumi.StringInput
	// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
	Args ExternalFunctionArgArrayInput
	// A description of the external function.
	Comment pulumi.StringPtrInput
	// If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
	Compression pulumi.StringPtrInput
	// Binds Snowflake context function results to HTTP headers.
	ContextHeaders pulumi.StringArrayInput
	// The database in which to create the external function.
	Database pulumi.StringInput
	// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
	Headers ExternalFunctionHeaderArrayInput
	// This specifies the maximum number of rows in each batch sent to the proxy service.
	MaxBatchRows pulumi.IntPtrInput
	// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the external function when called with null inputs.
	NullInputBehavior pulumi.StringPtrInput
	// Specifies the behavior of the function when returning results
	ReturnBehavior pulumi.StringInput
	// Indicates whether the function can return NULL values or must return only NON-NULL values.
	ReturnNullAllowed pulumi.BoolPtrInput
	// Specifies the data type returned by the external function.
	ReturnType pulumi.StringInput
	// The schema in which to create the external function.
	Schema pulumi.StringInput
	// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
	UrlOfProxyAndResource pulumi.StringInput
}

func (ExternalFunctionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*externalFunctionArgs)(nil)).Elem()
}

type ExternalFunctionInput interface {
	pulumi.Input

	ToExternalFunctionOutput() ExternalFunctionOutput
	ToExternalFunctionOutputWithContext(ctx context.Context) ExternalFunctionOutput
}

func (*ExternalFunction) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalFunction)(nil)).Elem()
}

func (i *ExternalFunction) ToExternalFunctionOutput() ExternalFunctionOutput {
	return i.ToExternalFunctionOutputWithContext(context.Background())
}

func (i *ExternalFunction) ToExternalFunctionOutputWithContext(ctx context.Context) ExternalFunctionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalFunctionOutput)
}

// ExternalFunctionArrayInput is an input type that accepts ExternalFunctionArray and ExternalFunctionArrayOutput values.
// You can construct a concrete instance of `ExternalFunctionArrayInput` via:
//
//          ExternalFunctionArray{ ExternalFunctionArgs{...} }
type ExternalFunctionArrayInput interface {
	pulumi.Input

	ToExternalFunctionArrayOutput() ExternalFunctionArrayOutput
	ToExternalFunctionArrayOutputWithContext(context.Context) ExternalFunctionArrayOutput
}

type ExternalFunctionArray []ExternalFunctionInput

func (ExternalFunctionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalFunction)(nil)).Elem()
}

func (i ExternalFunctionArray) ToExternalFunctionArrayOutput() ExternalFunctionArrayOutput {
	return i.ToExternalFunctionArrayOutputWithContext(context.Background())
}

func (i ExternalFunctionArray) ToExternalFunctionArrayOutputWithContext(ctx context.Context) ExternalFunctionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalFunctionArrayOutput)
}

// ExternalFunctionMapInput is an input type that accepts ExternalFunctionMap and ExternalFunctionMapOutput values.
// You can construct a concrete instance of `ExternalFunctionMapInput` via:
//
//          ExternalFunctionMap{ "key": ExternalFunctionArgs{...} }
type ExternalFunctionMapInput interface {
	pulumi.Input

	ToExternalFunctionMapOutput() ExternalFunctionMapOutput
	ToExternalFunctionMapOutputWithContext(context.Context) ExternalFunctionMapOutput
}

type ExternalFunctionMap map[string]ExternalFunctionInput

func (ExternalFunctionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalFunction)(nil)).Elem()
}

func (i ExternalFunctionMap) ToExternalFunctionMapOutput() ExternalFunctionMapOutput {
	return i.ToExternalFunctionMapOutputWithContext(context.Background())
}

func (i ExternalFunctionMap) ToExternalFunctionMapOutputWithContext(ctx context.Context) ExternalFunctionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalFunctionMapOutput)
}

type ExternalFunctionOutput struct{ *pulumi.OutputState }

func (ExternalFunctionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalFunction)(nil)).Elem()
}

func (o ExternalFunctionOutput) ToExternalFunctionOutput() ExternalFunctionOutput {
	return o
}

func (o ExternalFunctionOutput) ToExternalFunctionOutputWithContext(ctx context.Context) ExternalFunctionOutput {
	return o
}

type ExternalFunctionArrayOutput struct{ *pulumi.OutputState }

func (ExternalFunctionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalFunction)(nil)).Elem()
}

func (o ExternalFunctionArrayOutput) ToExternalFunctionArrayOutput() ExternalFunctionArrayOutput {
	return o
}

func (o ExternalFunctionArrayOutput) ToExternalFunctionArrayOutputWithContext(ctx context.Context) ExternalFunctionArrayOutput {
	return o
}

func (o ExternalFunctionArrayOutput) Index(i pulumi.IntInput) ExternalFunctionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExternalFunction {
		return vs[0].([]*ExternalFunction)[vs[1].(int)]
	}).(ExternalFunctionOutput)
}

type ExternalFunctionMapOutput struct{ *pulumi.OutputState }

func (ExternalFunctionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalFunction)(nil)).Elem()
}

func (o ExternalFunctionMapOutput) ToExternalFunctionMapOutput() ExternalFunctionMapOutput {
	return o
}

func (o ExternalFunctionMapOutput) ToExternalFunctionMapOutputWithContext(ctx context.Context) ExternalFunctionMapOutput {
	return o
}

func (o ExternalFunctionMapOutput) MapIndex(k pulumi.StringInput) ExternalFunctionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExternalFunction {
		return vs[0].(map[string]*ExternalFunction)[vs[1].(string)]
	}).(ExternalFunctionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalFunctionInput)(nil)).Elem(), &ExternalFunction{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalFunctionArrayInput)(nil)).Elem(), ExternalFunctionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalFunctionMapInput)(nil)).Elem(), ExternalFunctionMap{})
	pulumi.RegisterOutputType(ExternalFunctionOutput{})
	pulumi.RegisterOutputType(ExternalFunctionArrayOutput{})
	pulumi.RegisterOutputType(ExternalFunctionMapOutput{})
}
