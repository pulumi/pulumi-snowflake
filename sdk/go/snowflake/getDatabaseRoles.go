// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
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
//			_, err := snowflake.GetDatabaseRoles(ctx, &snowflake.GetDatabaseRolesArgs{
//				Database: "MYDB",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDatabaseRoles(ctx *pulumi.Context, args *GetDatabaseRolesArgs, opts ...pulumi.InvokeOption) (*GetDatabaseRolesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDatabaseRolesResult
	err := ctx.Invoke("snowflake:index/getDatabaseRoles:getDatabaseRoles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseRoles.
type GetDatabaseRolesArgs struct {
	// The database from which to return the database roles from.
	Database string `pulumi:"database"`
}

// A collection of values returned by getDatabaseRoles.
type GetDatabaseRolesResult struct {
	// The database from which to return the database roles from.
	Database string `pulumi:"database"`
	// Lists all the database roles in a specified database.
	DatabaseRoles []GetDatabaseRolesDatabaseRole `pulumi:"databaseRoles"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetDatabaseRolesOutput(ctx *pulumi.Context, args GetDatabaseRolesOutputArgs, opts ...pulumi.InvokeOption) GetDatabaseRolesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDatabaseRolesResult, error) {
			args := v.(GetDatabaseRolesArgs)
			r, err := GetDatabaseRoles(ctx, &args, opts...)
			var s GetDatabaseRolesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDatabaseRolesResultOutput)
}

// A collection of arguments for invoking getDatabaseRoles.
type GetDatabaseRolesOutputArgs struct {
	// The database from which to return the database roles from.
	Database pulumi.StringInput `pulumi:"database"`
}

func (GetDatabaseRolesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseRolesArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseRoles.
type GetDatabaseRolesResultOutput struct{ *pulumi.OutputState }

func (GetDatabaseRolesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseRolesResult)(nil)).Elem()
}

func (o GetDatabaseRolesResultOutput) ToGetDatabaseRolesResultOutput() GetDatabaseRolesResultOutput {
	return o
}

func (o GetDatabaseRolesResultOutput) ToGetDatabaseRolesResultOutputWithContext(ctx context.Context) GetDatabaseRolesResultOutput {
	return o
}

func (o GetDatabaseRolesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDatabaseRolesResult] {
	return pulumix.Output[GetDatabaseRolesResult]{
		OutputState: o.OutputState,
	}
}

// The database from which to return the database roles from.
func (o GetDatabaseRolesResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) string { return v.Database }).(pulumi.StringOutput)
}

// Lists all the database roles in a specified database.
func (o GetDatabaseRolesResultOutput) DatabaseRoles() GetDatabaseRolesDatabaseRoleArrayOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) []GetDatabaseRolesDatabaseRole { return v.DatabaseRoles }).(GetDatabaseRolesDatabaseRoleArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatabaseRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatabaseRolesResultOutput{})
}
