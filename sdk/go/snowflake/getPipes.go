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
//			_, err := snowflake.GetPipes(ctx, &snowflake.GetPipesArgs{
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
func GetPipes(ctx *pulumi.Context, args *GetPipesArgs, opts ...pulumi.InvokeOption) (*GetPipesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPipesResult
	err := ctx.Invoke("snowflake:index/getPipes:getPipes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPipes.
type GetPipesArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the pipes from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getPipes.
type GetPipesResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The pipes in the schema
	Pipes []GetPipesPipe `pulumi:"pipes"`
	// The schema from which to return the pipes from.
	Schema string `pulumi:"schema"`
}

func GetPipesOutput(ctx *pulumi.Context, args GetPipesOutputArgs, opts ...pulumi.InvokeOption) GetPipesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPipesResultOutput, error) {
			args := v.(GetPipesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetPipesResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getPipes:getPipes", args, &rv, "", opts...)
			if err != nil {
				return GetPipesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetPipesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetPipesResultOutput), nil
			}
			return output, nil
		}).(GetPipesResultOutput)
}

// A collection of arguments for invoking getPipes.
type GetPipesOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the pipes from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetPipesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPipesArgs)(nil)).Elem()
}

// A collection of values returned by getPipes.
type GetPipesResultOutput struct{ *pulumi.OutputState }

func (GetPipesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPipesResult)(nil)).Elem()
}

func (o GetPipesResultOutput) ToGetPipesResultOutput() GetPipesResultOutput {
	return o
}

func (o GetPipesResultOutput) ToGetPipesResultOutputWithContext(ctx context.Context) GetPipesResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetPipesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipesResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPipesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The pipes in the schema
func (o GetPipesResultOutput) Pipes() GetPipesPipeArrayOutput {
	return o.ApplyT(func(v GetPipesResult) []GetPipesPipe { return v.Pipes }).(GetPipesPipeArrayOutput)
}

// The schema from which to return the pipes from.
func (o GetPipesResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipesResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPipesResultOutput{})
}
