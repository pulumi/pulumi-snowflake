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
//			_, err := snowflake.GetStages(ctx, &snowflake.GetStagesArgs{
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
func GetStages(ctx *pulumi.Context, args *GetStagesArgs, opts ...pulumi.InvokeOption) (*GetStagesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStagesResult
	err := ctx.Invoke("snowflake:index/getStages:getStages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStages.
type GetStagesArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the stages from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getStages.
type GetStagesResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the stages from.
	Schema string `pulumi:"schema"`
	// The stages in the schema
	Stages []GetStagesStage `pulumi:"stages"`
}

func GetStagesOutput(ctx *pulumi.Context, args GetStagesOutputArgs, opts ...pulumi.InvokeOption) GetStagesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetStagesResultOutput, error) {
			args := v.(GetStagesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getStages:getStages", args, GetStagesResultOutput{}, options).(GetStagesResultOutput), nil
		}).(GetStagesResultOutput)
}

// A collection of arguments for invoking getStages.
type GetStagesOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the stages from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetStagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStagesArgs)(nil)).Elem()
}

// A collection of values returned by getStages.
type GetStagesResultOutput struct{ *pulumi.OutputState }

func (GetStagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStagesResult)(nil)).Elem()
}

func (o GetStagesResultOutput) ToGetStagesResultOutput() GetStagesResultOutput {
	return o
}

func (o GetStagesResultOutput) ToGetStagesResultOutputWithContext(ctx context.Context) GetStagesResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetStagesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetStagesResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetStagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStagesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the stages from.
func (o GetStagesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetStagesResult) string { return v.Schema }).(pulumi.StringOutput)
}

// The stages in the schema
func (o GetStagesResultOutput) Stages() GetStagesStageArrayOutput {
	return o.ApplyT(func(v GetStagesResult) []GetStagesStage { return v.Stages }).(GetStagesStageArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStagesResultOutput{})
}
