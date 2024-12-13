// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

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
//			_, err := snowflake.GetSequences(ctx, &snowflake.GetSequencesArgs{
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
func GetSequences(ctx *pulumi.Context, args *GetSequencesArgs, opts ...pulumi.InvokeOption) (*GetSequencesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSequencesResult
	err := ctx.Invoke("snowflake:index/getSequences:getSequences", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSequences.
type GetSequencesArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the sequences from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getSequences.
type GetSequencesResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the sequences from.
	Schema string `pulumi:"schema"`
	// The sequences in the schema
	Sequences []GetSequencesSequence `pulumi:"sequences"`
}

func GetSequencesOutput(ctx *pulumi.Context, args GetSequencesOutputArgs, opts ...pulumi.InvokeOption) GetSequencesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSequencesResultOutput, error) {
			args := v.(GetSequencesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getSequences:getSequences", args, GetSequencesResultOutput{}, options).(GetSequencesResultOutput), nil
		}).(GetSequencesResultOutput)
}

// A collection of arguments for invoking getSequences.
type GetSequencesOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the sequences from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetSequencesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSequencesArgs)(nil)).Elem()
}

// A collection of values returned by getSequences.
type GetSequencesResultOutput struct{ *pulumi.OutputState }

func (GetSequencesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSequencesResult)(nil)).Elem()
}

func (o GetSequencesResultOutput) ToGetSequencesResultOutput() GetSequencesResultOutput {
	return o
}

func (o GetSequencesResultOutput) ToGetSequencesResultOutputWithContext(ctx context.Context) GetSequencesResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetSequencesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetSequencesResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSequencesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSequencesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the sequences from.
func (o GetSequencesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetSequencesResult) string { return v.Schema }).(pulumi.StringOutput)
}

// The sequences in the schema
func (o GetSequencesResultOutput) Sequences() GetSequencesSequenceArrayOutput {
	return o.ApplyT(func(v GetSequencesResult) []GetSequencesSequence { return v.Sequences }).(GetSequencesSequenceArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSequencesResultOutput{})
}
