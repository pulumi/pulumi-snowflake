// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAccounts(ctx *pulumi.Context, args *GetAccountsArgs, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountsResult
	err := ctx.Invoke("snowflake:index/getAccounts:getAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccounts.
type GetAccountsArgs struct {
	// Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
	Pattern *string `pulumi:"pattern"`
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	// List of all the accounts available in the organization.
	Accounts []GetAccountsAccount `pulumi:"accounts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
	Pattern *string `pulumi:"pattern"`
}

func GetAccountsOutput(ctx *pulumi.Context, args GetAccountsOutputArgs, opts ...pulumi.InvokeOption) GetAccountsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAccountsResultOutput, error) {
			args := v.(GetAccountsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetAccountsResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getAccounts:getAccounts", args, &rv, "", opts...)
			if err != nil {
				return GetAccountsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetAccountsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetAccountsResultOutput), nil
			}
			return output, nil
		}).(GetAccountsResultOutput)
}

// A collection of arguments for invoking getAccounts.
type GetAccountsOutputArgs struct {
	// Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
	Pattern pulumi.StringPtrInput `pulumi:"pattern"`
}

func (GetAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getAccounts.
type GetAccountsResultOutput struct{ *pulumi.OutputState }

func (GetAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsResult)(nil)).Elem()
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutput() GetAccountsResultOutput {
	return o
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutputWithContext(ctx context.Context) GetAccountsResultOutput {
	return o
}

// List of all the accounts available in the organization.
func (o GetAccountsResultOutput) Accounts() GetAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []GetAccountsAccount { return v.Accounts }).(GetAccountsAccountArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
func (o GetAccountsResultOutput) Pattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountsResult) *string { return v.Pattern }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountsResultOutput{})
}
