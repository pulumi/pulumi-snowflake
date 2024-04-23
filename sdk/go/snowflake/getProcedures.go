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
//			_, err := snowflake.GetProcedures(ctx, &snowflake.GetProceduresArgs{
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
func GetProcedures(ctx *pulumi.Context, args *GetProceduresArgs, opts ...pulumi.InvokeOption) (*GetProceduresResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProceduresResult
	err := ctx.Invoke("snowflake:index/getProcedures:getProcedures", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProcedures.
type GetProceduresArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the procedures from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getProcedures.
type GetProceduresResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The procedures in the schema
	Procedures []GetProceduresProcedure `pulumi:"procedures"`
	// The schema from which to return the procedures from.
	Schema string `pulumi:"schema"`
}

func GetProceduresOutput(ctx *pulumi.Context, args GetProceduresOutputArgs, opts ...pulumi.InvokeOption) GetProceduresResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProceduresResult, error) {
			args := v.(GetProceduresArgs)
			r, err := GetProcedures(ctx, &args, opts...)
			var s GetProceduresResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProceduresResultOutput)
}

// A collection of arguments for invoking getProcedures.
type GetProceduresOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the procedures from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetProceduresOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProceduresArgs)(nil)).Elem()
}

// A collection of values returned by getProcedures.
type GetProceduresResultOutput struct{ *pulumi.OutputState }

func (GetProceduresResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProceduresResult)(nil)).Elem()
}

func (o GetProceduresResultOutput) ToGetProceduresResultOutput() GetProceduresResultOutput {
	return o
}

func (o GetProceduresResultOutput) ToGetProceduresResultOutputWithContext(ctx context.Context) GetProceduresResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetProceduresResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetProceduresResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetProceduresResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProceduresResult) string { return v.Id }).(pulumi.StringOutput)
}

// The procedures in the schema
func (o GetProceduresResultOutput) Procedures() GetProceduresProcedureArrayOutput {
	return o.ApplyT(func(v GetProceduresResult) []GetProceduresProcedure { return v.Procedures }).(GetProceduresProcedureArrayOutput)
}

// The schema from which to return the procedures from.
func (o GetProceduresResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetProceduresResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProceduresResultOutput{})
}
