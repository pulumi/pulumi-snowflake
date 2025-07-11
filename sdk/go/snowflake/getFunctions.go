// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.GetFunctions(ctx, &snowflake.GetFunctionsArgs{
//				Database: "MYDB",
//				Schema:   "MYSCHEMA",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **Note** If a field has a default value, it is shown next to the type in the schema.
func GetFunctions(ctx *pulumi.Context, args *GetFunctionsArgs, opts ...pulumi.InvokeOption) (*GetFunctionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFunctionsResult
	err := ctx.Invoke("snowflake:index/getFunctions:getFunctions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFunctions.
type GetFunctionsArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the functions from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getFunctions.
type GetFunctionsResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The functions in the schema
	Functions []GetFunctionsFunction `pulumi:"functions"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the functions from.
	Schema string `pulumi:"schema"`
}

func GetFunctionsOutput(ctx *pulumi.Context, args GetFunctionsOutputArgs, opts ...pulumi.InvokeOption) GetFunctionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetFunctionsResultOutput, error) {
			args := v.(GetFunctionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getFunctions:getFunctions", args, GetFunctionsResultOutput{}, options).(GetFunctionsResultOutput), nil
		}).(GetFunctionsResultOutput)
}

// A collection of arguments for invoking getFunctions.
type GetFunctionsOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the functions from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetFunctionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFunctionsArgs)(nil)).Elem()
}

// A collection of values returned by getFunctions.
type GetFunctionsResultOutput struct{ *pulumi.OutputState }

func (GetFunctionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFunctionsResult)(nil)).Elem()
}

func (o GetFunctionsResultOutput) ToGetFunctionsResultOutput() GetFunctionsResultOutput {
	return o
}

func (o GetFunctionsResultOutput) ToGetFunctionsResultOutputWithContext(ctx context.Context) GetFunctionsResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetFunctionsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetFunctionsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The functions in the schema
func (o GetFunctionsResultOutput) Functions() GetFunctionsFunctionArrayOutput {
	return o.ApplyT(func(v GetFunctionsResult) []GetFunctionsFunction { return v.Functions }).(GetFunctionsFunctionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFunctionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFunctionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the functions from.
func (o GetFunctionsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetFunctionsResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFunctionsResultOutput{})
}
