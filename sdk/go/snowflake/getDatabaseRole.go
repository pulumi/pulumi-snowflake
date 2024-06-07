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
//			_, err := snowflake.LookupDatabaseRole(ctx, &snowflake.LookupDatabaseRoleArgs{
//				Database: "MYDB",
//				Name:     "DBROLE",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDatabaseRole(ctx *pulumi.Context, args *LookupDatabaseRoleArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseRoleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseRoleResult
	err := ctx.Invoke("snowflake:index/getDatabaseRole:getDatabaseRole", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseRole.
type LookupDatabaseRoleArgs struct {
	// The database from which to return the database role from.
	Database string `pulumi:"database"`
	// Database role name.
	Name string `pulumi:"name"`
}

// A collection of values returned by getDatabaseRole.
type LookupDatabaseRoleResult struct {
	// The comment on the role
	Comment string `pulumi:"comment"`
	// The database from which to return the database role from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Database role name.
	Name string `pulumi:"name"`
	// The owner of the role
	Owner string `pulumi:"owner"`
}

func LookupDatabaseRoleOutput(ctx *pulumi.Context, args LookupDatabaseRoleOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseRoleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseRoleResult, error) {
			args := v.(LookupDatabaseRoleArgs)
			r, err := LookupDatabaseRole(ctx, &args, opts...)
			var s LookupDatabaseRoleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseRoleResultOutput)
}

// A collection of arguments for invoking getDatabaseRole.
type LookupDatabaseRoleOutputArgs struct {
	// The database from which to return the database role from.
	Database pulumi.StringInput `pulumi:"database"`
	// Database role name.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupDatabaseRoleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseRoleArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseRole.
type LookupDatabaseRoleResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseRoleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseRoleResult)(nil)).Elem()
}

func (o LookupDatabaseRoleResultOutput) ToLookupDatabaseRoleResultOutput() LookupDatabaseRoleResultOutput {
	return o
}

func (o LookupDatabaseRoleResultOutput) ToLookupDatabaseRoleResultOutputWithContext(ctx context.Context) LookupDatabaseRoleResultOutput {
	return o
}

// The comment on the role
func (o LookupDatabaseRoleResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseRoleResult) string { return v.Comment }).(pulumi.StringOutput)
}

// The database from which to return the database role from.
func (o LookupDatabaseRoleResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseRoleResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseRoleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseRoleResult) string { return v.Id }).(pulumi.StringOutput)
}

// Database role name.
func (o LookupDatabaseRoleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseRoleResult) string { return v.Name }).(pulumi.StringOutput)
}

// The owner of the role
func (o LookupDatabaseRoleResultOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseRoleResult) string { return v.Owner }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseRoleResultOutput{})
}
