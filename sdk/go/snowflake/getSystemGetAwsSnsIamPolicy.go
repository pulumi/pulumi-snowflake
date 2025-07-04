// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.GetSystemGetAwsSnsIamPolicy(ctx, &snowflake.GetSystemGetAwsSnsIamPolicyArgs{
//				AwsSnsTopicArn: "<aws_sns_topic_arn>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **Note** If a field has a default value, it is shown next to the type in the schema.
func GetSystemGetAwsSnsIamPolicy(ctx *pulumi.Context, args *GetSystemGetAwsSnsIamPolicyArgs, opts ...pulumi.InvokeOption) (*GetSystemGetAwsSnsIamPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSystemGetAwsSnsIamPolicyResult
	err := ctx.Invoke("snowflake:index/getSystemGetAwsSnsIamPolicy:getSystemGetAwsSnsIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSystemGetAwsSnsIamPolicy.
type GetSystemGetAwsSnsIamPolicyArgs struct {
	// Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
	AwsSnsTopicArn string `pulumi:"awsSnsTopicArn"`
}

// A collection of values returned by getSystemGetAwsSnsIamPolicy.
type GetSystemGetAwsSnsIamPolicyResult struct {
	// Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
	AwsSnsTopicArn string `pulumi:"awsSnsTopicArn"`
	// IAM policy for Snowflake’s SQS queue to subscribe to this topic
	AwsSnsTopicPolicyJson string `pulumi:"awsSnsTopicPolicyJson"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetSystemGetAwsSnsIamPolicyOutput(ctx *pulumi.Context, args GetSystemGetAwsSnsIamPolicyOutputArgs, opts ...pulumi.InvokeOption) GetSystemGetAwsSnsIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSystemGetAwsSnsIamPolicyResultOutput, error) {
			args := v.(GetSystemGetAwsSnsIamPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getSystemGetAwsSnsIamPolicy:getSystemGetAwsSnsIamPolicy", args, GetSystemGetAwsSnsIamPolicyResultOutput{}, options).(GetSystemGetAwsSnsIamPolicyResultOutput), nil
		}).(GetSystemGetAwsSnsIamPolicyResultOutput)
}

// A collection of arguments for invoking getSystemGetAwsSnsIamPolicy.
type GetSystemGetAwsSnsIamPolicyOutputArgs struct {
	// Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
	AwsSnsTopicArn pulumi.StringInput `pulumi:"awsSnsTopicArn"`
}

func (GetSystemGetAwsSnsIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGetAwsSnsIamPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getSystemGetAwsSnsIamPolicy.
type GetSystemGetAwsSnsIamPolicyResultOutput struct{ *pulumi.OutputState }

func (GetSystemGetAwsSnsIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGetAwsSnsIamPolicyResult)(nil)).Elem()
}

func (o GetSystemGetAwsSnsIamPolicyResultOutput) ToGetSystemGetAwsSnsIamPolicyResultOutput() GetSystemGetAwsSnsIamPolicyResultOutput {
	return o
}

func (o GetSystemGetAwsSnsIamPolicyResultOutput) ToGetSystemGetAwsSnsIamPolicyResultOutputWithContext(ctx context.Context) GetSystemGetAwsSnsIamPolicyResultOutput {
	return o
}

// Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
func (o GetSystemGetAwsSnsIamPolicyResultOutput) AwsSnsTopicArn() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetAwsSnsIamPolicyResult) string { return v.AwsSnsTopicArn }).(pulumi.StringOutput)
}

// IAM policy for Snowflake’s SQS queue to subscribe to this topic
func (o GetSystemGetAwsSnsIamPolicyResultOutput) AwsSnsTopicPolicyJson() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetAwsSnsIamPolicyResult) string { return v.AwsSnsTopicPolicyJson }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSystemGetAwsSnsIamPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGetAwsSnsIamPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSystemGetAwsSnsIamPolicyResultOutput{})
}
