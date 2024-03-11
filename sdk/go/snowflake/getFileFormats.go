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
// <!--Start PulumiCodeChooser -->
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
//			_, err := snowflake.GetFileFormats(ctx, &snowflake.GetFileFormatsArgs{
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
// <!--End PulumiCodeChooser -->
func GetFileFormats(ctx *pulumi.Context, args *GetFileFormatsArgs, opts ...pulumi.InvokeOption) (*GetFileFormatsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFileFormatsResult
	err := ctx.Invoke("snowflake:index/getFileFormats:getFileFormats", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFileFormats.
type GetFileFormatsArgs struct {
	Database string `pulumi:"database"`
	Schema   string `pulumi:"schema"`
}

// A collection of values returned by getFileFormats.
type GetFileFormatsResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The file formats in the schema
	FileFormats []GetFileFormatsFileFormat `pulumi:"fileFormats"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the file formats from.
	Schema string `pulumi:"schema"`
}

func GetFileFormatsOutput(ctx *pulumi.Context, args GetFileFormatsOutputArgs, opts ...pulumi.InvokeOption) GetFileFormatsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFileFormatsResult, error) {
			args := v.(GetFileFormatsArgs)
			r, err := GetFileFormats(ctx, &args, opts...)
			var s GetFileFormatsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFileFormatsResultOutput)
}

// A collection of arguments for invoking getFileFormats.
type GetFileFormatsOutputArgs struct {
	Database pulumi.StringInput `pulumi:"database"`
	Schema   pulumi.StringInput `pulumi:"schema"`
}

func (GetFileFormatsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileFormatsArgs)(nil)).Elem()
}

// A collection of values returned by getFileFormats.
type GetFileFormatsResultOutput struct{ *pulumi.OutputState }

func (GetFileFormatsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileFormatsResult)(nil)).Elem()
}

func (o GetFileFormatsResultOutput) ToGetFileFormatsResultOutput() GetFileFormatsResultOutput {
	return o
}

func (o GetFileFormatsResultOutput) ToGetFileFormatsResultOutputWithContext(ctx context.Context) GetFileFormatsResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetFileFormatsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileFormatsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The file formats in the schema
func (o GetFileFormatsResultOutput) FileFormats() GetFileFormatsFileFormatArrayOutput {
	return o.ApplyT(func(v GetFileFormatsResult) []GetFileFormatsFileFormat { return v.FileFormats }).(GetFileFormatsFileFormatArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFileFormatsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileFormatsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the file formats from.
func (o GetFileFormatsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileFormatsResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFileFormatsResultOutput{})
}
