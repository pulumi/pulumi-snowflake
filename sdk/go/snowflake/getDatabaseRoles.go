// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source used to get details of filtered database roles. Filtering is aligned with the current possibilities for [SHOW DATABASE ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-database-roles) query (`like` and `limit` are supported). The results of SHOW is encapsulated in showOutput collection.
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
	InDatabase string `pulumi:"inDatabase"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetDatabaseRolesLimit `pulumi:"limit"`
}

// A collection of values returned by getDatabaseRoles.
type GetDatabaseRolesResult struct {
	// Holds the aggregated output of all database role details queries.
	DatabaseRoles []GetDatabaseRolesDatabaseRole `pulumi:"databaseRoles"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The database from which to return the database roles from.
	InDatabase string `pulumi:"inDatabase"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit *GetDatabaseRolesLimit `pulumi:"limit"`
}

func GetDatabaseRolesOutput(ctx *pulumi.Context, args GetDatabaseRolesOutputArgs, opts ...pulumi.InvokeOption) GetDatabaseRolesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDatabaseRolesResultOutput, error) {
			args := v.(GetDatabaseRolesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getDatabaseRoles:getDatabaseRoles", args, GetDatabaseRolesResultOutput{}, options).(GetDatabaseRolesResultOutput), nil
		}).(GetDatabaseRolesResultOutput)
}

// A collection of arguments for invoking getDatabaseRoles.
type GetDatabaseRolesOutputArgs struct {
	// The database from which to return the database roles from.
	InDatabase pulumi.StringInput `pulumi:"inDatabase"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
	Limit GetDatabaseRolesLimitPtrInput `pulumi:"limit"`
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

// Holds the aggregated output of all database role details queries.
func (o GetDatabaseRolesResultOutput) DatabaseRoles() GetDatabaseRolesDatabaseRoleArrayOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) []GetDatabaseRolesDatabaseRole { return v.DatabaseRoles }).(GetDatabaseRolesDatabaseRoleArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatabaseRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The database from which to return the database roles from.
func (o GetDatabaseRolesResultOutput) InDatabase() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) string { return v.InDatabase }).(pulumi.StringOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetDatabaseRolesResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `startsWith` or `like`.
func (o GetDatabaseRolesResultOutput) Limit() GetDatabaseRolesLimitPtrOutput {
	return o.ApplyT(func(v GetDatabaseRolesResult) *GetDatabaseRolesLimit { return v.Limit }).(GetDatabaseRolesLimitPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatabaseRolesResultOutput{})
}
