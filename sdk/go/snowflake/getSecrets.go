// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source used to get details of filtered secrets. Filtering is aligned with the current possibilities for [SHOW SECRETS](https://docs.snowflake.com/en/sql-reference/sql/show-secrets) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `secrets`.
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
//			simple, err := snowflake.GetSecrets(ctx, &snowflake.GetSecretsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("simpleOutput", simple.Secrets)
//			// Filtering (like)
//			like, err := snowflake.GetSecrets(ctx, &snowflake.GetSecretsArgs{
//				Like: pulumi.StringRef("secret-name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("likeOutput", like.Secrets)
//			// Filtering by prefix (like)
//			likePrefix, err := snowflake.GetSecrets(ctx, &snowflake.GetSecretsArgs{
//				Like: pulumi.StringRef("prefix%"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("likePrefixOutput", likePrefix.Secrets)
//			// Filtering (in)
//			in, err := snowflake.GetSecrets(ctx, &snowflake.GetSecretsArgs{
//				In: snowflake.GetSecretsIn{
//					Schema: pulumi.StringRef(test.FullyQualifiedName),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("inOutput", in.Secrets)
//			// Without additional data (to limit the number of calls make for every found secret)
//			onlyShow, err := snowflake.GetSecrets(ctx, &snowflake.GetSecretsArgs{
//				WithDescribe: pulumi.BoolRef(false),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("onlyShowOutput", onlyShow.Secrets)
//			return nil
//		})
//	}
//
// ```
func GetSecrets(ctx *pulumi.Context, args *GetSecretsArgs, opts ...pulumi.InvokeOption) (*GetSecretsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecretsResult
	err := ctx.Invoke("snowflake:index/getSecrets:getSecrets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecrets.
type GetSecretsArgs struct {
	// IN clause to filter the list of secrets
	In *GetSecretsIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

// A collection of values returned by getSecrets.
type GetSecretsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IN clause to filter the list of secrets
	In *GetSecretsIn `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like *string `pulumi:"like"`
	// Holds the aggregated output of all secrets details queries.
	Secrets []GetSecretsSecret `pulumi:"secrets"`
	// Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe *bool `pulumi:"withDescribe"`
}

func GetSecretsOutput(ctx *pulumi.Context, args GetSecretsOutputArgs, opts ...pulumi.InvokeOption) GetSecretsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSecretsResultOutput, error) {
			args := v.(GetSecretsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getSecrets:getSecrets", args, GetSecretsResultOutput{}, options).(GetSecretsResultOutput), nil
		}).(GetSecretsResultOutput)
}

// A collection of arguments for invoking getSecrets.
type GetSecretsOutputArgs struct {
	// IN clause to filter the list of secrets
	In GetSecretsInPtrInput `pulumi:"in"`
	// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
	Like pulumi.StringPtrInput `pulumi:"like"`
	// Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
	WithDescribe pulumi.BoolPtrInput `pulumi:"withDescribe"`
}

func (GetSecretsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsArgs)(nil)).Elem()
}

// A collection of values returned by getSecrets.
type GetSecretsResultOutput struct{ *pulumi.OutputState }

func (GetSecretsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsResult)(nil)).Elem()
}

func (o GetSecretsResultOutput) ToGetSecretsResultOutput() GetSecretsResultOutput {
	return o
}

func (o GetSecretsResultOutput) ToGetSecretsResultOutputWithContext(ctx context.Context) GetSecretsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecretsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretsResult) string { return v.Id }).(pulumi.StringOutput)
}

// IN clause to filter the list of secrets
func (o GetSecretsResultOutput) In() GetSecretsInPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *GetSecretsIn { return v.In }).(GetSecretsInPtrOutput)
}

// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
func (o GetSecretsResultOutput) Like() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *string { return v.Like }).(pulumi.StringPtrOutput)
}

// Holds the aggregated output of all secrets details queries.
func (o GetSecretsResultOutput) Secrets() GetSecretsSecretArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []GetSecretsSecret { return v.Secrets }).(GetSecretsSecretArrayOutput)
}

// Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
func (o GetSecretsResultOutput) WithDescribe() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSecretsResult) *bool { return v.WithDescribe }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecretsResultOutput{})
}
