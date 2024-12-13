// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **V1 release candidate** This data source is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
//
// Datasource used to get details of filtered connections. Filtering is aligned with the current possibilities for [SHOW CONNECTIONS](https://docs.snowflake.com/en/sql-reference/sql/show-connections) query. The results of SHOW is encapsulated in one output collection `connections`.
//
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
//			// Simple usage
//			simple, err := snowflake.GetConnections(ctx, &snowflake.GetConnectionsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("simpleOutput", simple.Connections)
//			// Filtering (like)
//			like, err := snowflake.GetConnections(ctx, &snowflake.GetConnectionsArgs{
//				Like: pulumi.StringRef("connection-name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("likeOutput", like.Connections)
//			// Filtering by prefix (like)
//			likePrefix, err := snowflake.GetConnections(ctx, &snowflake.GetConnectionsArgs{
//				Like: pulumi.StringRef("prefix%"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("likePrefixOutput", likePrefix.Connections)
//			return nil
//		})
//	}
//
// ```
func GetConnections(ctx *pulumi.Context, args *GetConnectionsArgs, opts ...pulumi.InvokeOption) (*GetConnectionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConnectionsResult
	err := ctx.Invoke("snowflake:index/getConnections:getConnections", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnections.
type GetConnectionsArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
}

// A collection of values returned by getConnections.
type GetConnectionsResult struct {
	// Holds the aggregated output of all connections details queries.
	Connections []GetConnectionsConnection `pulumi:"connections"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
}

func GetConnectionsOutput(ctx *pulumi.Context, args GetConnectionsOutputArgs, opts ...pulumi.InvokeOption) GetConnectionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetConnectionsResultOutput, error) {
			args := v.(GetConnectionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getConnections:getConnections", args, GetConnectionsResultOutput{}, options).(GetConnectionsResultOutput), nil
		}).(GetConnectionsResultOutput)
}

// A collection of arguments for invoking getConnections.
type GetConnectionsOutputArgs struct {
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
}

func (GetConnectionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConnectionsArgs)(nil)).Elem()
}

// A collection of values returned by getConnections.
type GetConnectionsResultOutput struct{ *pulumi.OutputState }

func (GetConnectionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConnectionsResult)(nil)).Elem()
}

func (o GetConnectionsResultOutput) ToGetConnectionsResultOutput() GetConnectionsResultOutput {
	return o
}

func (o GetConnectionsResultOutput) ToGetConnectionsResultOutputWithContext(ctx context.Context) GetConnectionsResultOutput {
	return o
}

// Holds the aggregated output of all connections details queries.
func (o GetConnectionsResultOutput) Connections() GetConnectionsConnectionArrayOutput {
	return o.ApplyT(func(v GetConnectionsResult) []GetConnectionsConnection { return v.Connections }).(GetConnectionsConnectionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConnectionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConnectionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetConnectionsResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConnectionsResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConnectionsResultOutput{})
}
