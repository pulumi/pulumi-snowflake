// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
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
//			_, err := snowflake.NewNotificationIntegration(ctx, "integration", &snowflake.NotificationIntegrationArgs{
//				Name:                        pulumi.String("notification"),
//				Comment:                     pulumi.String("A notification integration."),
//				Enabled:                     pulumi.Bool(true),
//				Type:                        pulumi.String("QUEUE"),
//				Direction:                   pulumi.String("OUTBOUND"),
//				NotificationProvider:        pulumi.String("AZURE_STORAGE_QUEUE"),
//				AzureStorageQueuePrimaryUri: pulumi.String("..."),
//				AzureTenantId:               pulumi.String("..."),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import snowflake:index/notificationIntegration:NotificationIntegration example name
// ```
type NotificationIntegration struct {
	pulumi.CustomResourceState

	// The external ID that Snowflake will use when assuming the AWS role
	AwsSnsExternalId pulumi.StringOutput `pulumi:"awsSnsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	AwsSnsIamUserArn pulumi.StringOutput `pulumi:"awsSnsIamUserArn"`
	// AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
	AwsSnsRoleArn pulumi.StringPtrOutput `pulumi:"awsSnsRoleArn"`
	// AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
	AwsSnsTopicArn pulumi.StringPtrOutput `pulumi:"awsSnsTopicArn"`
	// AWS SQS queue ARN for notification integration to connect to
	//
	// Deprecated: No longer supported notification method
	AwsSqsArn pulumi.StringPtrOutput `pulumi:"awsSqsArn"`
	// The external ID that Snowflake will use when assuming the AWS role
	//
	// Deprecated: No longer supported notification method
	AwsSqsExternalId pulumi.StringOutput `pulumi:"awsSqsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	//
	// Deprecated: No longer supported notification method
	AwsSqsIamUserArn pulumi.StringOutput `pulumi:"awsSqsIamUserArn"`
	// AWS IAM role ARN for notification integration to assume
	//
	// Deprecated: No longer supported notification method
	AwsSqsRoleArn pulumi.StringPtrOutput `pulumi:"awsSqsRoleArn"`
	// The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
	AzureStorageQueuePrimaryUri pulumi.StringPtrOutput `pulumi:"azureStorageQueuePrimaryUri"`
	// The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
	AzureTenantId pulumi.StringPtrOutput `pulumi:"azureTenantId"`
	// A comment for the integration
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Date and time when the notification integration was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Direction pulumi.StringPtrOutput `pulumi:"direction"`
	Enabled   pulumi.BoolPtrOutput   `pulumi:"enabled"`
	// The GCP service account identifier that Snowflake will use when assuming the GCP role
	GcpPubsubServiceAccount pulumi.StringOutput `pulumi:"gcpPubsubServiceAccount"`
	// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
	GcpPubsubSubscriptionName pulumi.StringPtrOutput `pulumi:"gcpPubsubSubscriptionName"`
	// The topic id that Snowflake will use to push notifications.
	GcpPubsubTopicName pulumi.StringPtrOutput `pulumi:"gcpPubsubTopicName"`
	Name               pulumi.StringOutput    `pulumi:"name"`
	// The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
	NotificationProvider pulumi.StringOutput `pulumi:"notificationProvider"`
	// A type of integration
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewNotificationIntegration registers a new resource with the given unique name, arguments, and options.
func NewNotificationIntegration(ctx *pulumi.Context,
	name string, args *NotificationIntegrationArgs, opts ...pulumi.ResourceOption) (*NotificationIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NotificationProvider == nil {
		return nil, errors.New("invalid value for required argument 'NotificationProvider'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NotificationIntegration
	err := ctx.RegisterResource("snowflake:index/notificationIntegration:NotificationIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationIntegration gets an existing NotificationIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationIntegrationState, opts ...pulumi.ResourceOption) (*NotificationIntegration, error) {
	var resource NotificationIntegration
	err := ctx.ReadResource("snowflake:index/notificationIntegration:NotificationIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationIntegration resources.
type notificationIntegrationState struct {
	// The external ID that Snowflake will use when assuming the AWS role
	AwsSnsExternalId *string `pulumi:"awsSnsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	AwsSnsIamUserArn *string `pulumi:"awsSnsIamUserArn"`
	// AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
	AwsSnsRoleArn *string `pulumi:"awsSnsRoleArn"`
	// AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
	AwsSnsTopicArn *string `pulumi:"awsSnsTopicArn"`
	// AWS SQS queue ARN for notification integration to connect to
	//
	// Deprecated: No longer supported notification method
	AwsSqsArn *string `pulumi:"awsSqsArn"`
	// The external ID that Snowflake will use when assuming the AWS role
	//
	// Deprecated: No longer supported notification method
	AwsSqsExternalId *string `pulumi:"awsSqsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	//
	// Deprecated: No longer supported notification method
	AwsSqsIamUserArn *string `pulumi:"awsSqsIamUserArn"`
	// AWS IAM role ARN for notification integration to assume
	//
	// Deprecated: No longer supported notification method
	AwsSqsRoleArn *string `pulumi:"awsSqsRoleArn"`
	// The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
	AzureStorageQueuePrimaryUri *string `pulumi:"azureStorageQueuePrimaryUri"`
	// The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
	AzureTenantId *string `pulumi:"azureTenantId"`
	// A comment for the integration
	Comment *string `pulumi:"comment"`
	// Date and time when the notification integration was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Direction *string `pulumi:"direction"`
	Enabled   *bool   `pulumi:"enabled"`
	// The GCP service account identifier that Snowflake will use when assuming the GCP role
	GcpPubsubServiceAccount *string `pulumi:"gcpPubsubServiceAccount"`
	// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
	GcpPubsubSubscriptionName *string `pulumi:"gcpPubsubSubscriptionName"`
	// The topic id that Snowflake will use to push notifications.
	GcpPubsubTopicName *string `pulumi:"gcpPubsubTopicName"`
	Name               *string `pulumi:"name"`
	// The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
	NotificationProvider *string `pulumi:"notificationProvider"`
	// A type of integration
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Type *string `pulumi:"type"`
}

type NotificationIntegrationState struct {
	// The external ID that Snowflake will use when assuming the AWS role
	AwsSnsExternalId pulumi.StringPtrInput
	// The Snowflake user that will attempt to assume the AWS role.
	AwsSnsIamUserArn pulumi.StringPtrInput
	// AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
	AwsSnsRoleArn pulumi.StringPtrInput
	// AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
	AwsSnsTopicArn pulumi.StringPtrInput
	// AWS SQS queue ARN for notification integration to connect to
	//
	// Deprecated: No longer supported notification method
	AwsSqsArn pulumi.StringPtrInput
	// The external ID that Snowflake will use when assuming the AWS role
	//
	// Deprecated: No longer supported notification method
	AwsSqsExternalId pulumi.StringPtrInput
	// The Snowflake user that will attempt to assume the AWS role.
	//
	// Deprecated: No longer supported notification method
	AwsSqsIamUserArn pulumi.StringPtrInput
	// AWS IAM role ARN for notification integration to assume
	//
	// Deprecated: No longer supported notification method
	AwsSqsRoleArn pulumi.StringPtrInput
	// The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
	AzureStorageQueuePrimaryUri pulumi.StringPtrInput
	// The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
	AzureTenantId pulumi.StringPtrInput
	// A comment for the integration
	Comment pulumi.StringPtrInput
	// Date and time when the notification integration was created.
	CreatedOn pulumi.StringPtrInput
	// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Direction pulumi.StringPtrInput
	Enabled   pulumi.BoolPtrInput
	// The GCP service account identifier that Snowflake will use when assuming the GCP role
	GcpPubsubServiceAccount pulumi.StringPtrInput
	// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
	GcpPubsubSubscriptionName pulumi.StringPtrInput
	// The topic id that Snowflake will use to push notifications.
	GcpPubsubTopicName pulumi.StringPtrInput
	Name               pulumi.StringPtrInput
	// The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
	NotificationProvider pulumi.StringPtrInput
	// A type of integration
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Type pulumi.StringPtrInput
}

func (NotificationIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationIntegrationState)(nil)).Elem()
}

type notificationIntegrationArgs struct {
	// AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
	AwsSnsRoleArn *string `pulumi:"awsSnsRoleArn"`
	// AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
	AwsSnsTopicArn *string `pulumi:"awsSnsTopicArn"`
	// AWS SQS queue ARN for notification integration to connect to
	//
	// Deprecated: No longer supported notification method
	AwsSqsArn *string `pulumi:"awsSqsArn"`
	// AWS IAM role ARN for notification integration to assume
	//
	// Deprecated: No longer supported notification method
	AwsSqsRoleArn *string `pulumi:"awsSqsRoleArn"`
	// The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
	AzureStorageQueuePrimaryUri *string `pulumi:"azureStorageQueuePrimaryUri"`
	// The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
	AzureTenantId *string `pulumi:"azureTenantId"`
	// A comment for the integration
	Comment *string `pulumi:"comment"`
	// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Direction *string `pulumi:"direction"`
	Enabled   *bool   `pulumi:"enabled"`
	// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
	GcpPubsubSubscriptionName *string `pulumi:"gcpPubsubSubscriptionName"`
	// The topic id that Snowflake will use to push notifications.
	GcpPubsubTopicName *string `pulumi:"gcpPubsubTopicName"`
	Name               *string `pulumi:"name"`
	// The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
	NotificationProvider string `pulumi:"notificationProvider"`
	// A type of integration
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a NotificationIntegration resource.
type NotificationIntegrationArgs struct {
	// AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
	AwsSnsRoleArn pulumi.StringPtrInput
	// AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
	AwsSnsTopicArn pulumi.StringPtrInput
	// AWS SQS queue ARN for notification integration to connect to
	//
	// Deprecated: No longer supported notification method
	AwsSqsArn pulumi.StringPtrInput
	// AWS IAM role ARN for notification integration to assume
	//
	// Deprecated: No longer supported notification method
	AwsSqsRoleArn pulumi.StringPtrInput
	// The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
	AzureStorageQueuePrimaryUri pulumi.StringPtrInput
	// The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
	AzureTenantId pulumi.StringPtrInput
	// A comment for the integration
	Comment pulumi.StringPtrInput
	// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Direction pulumi.StringPtrInput
	Enabled   pulumi.BoolPtrInput
	// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
	GcpPubsubSubscriptionName pulumi.StringPtrInput
	// The topic id that Snowflake will use to push notifications.
	GcpPubsubTopicName pulumi.StringPtrInput
	Name               pulumi.StringPtrInput
	// The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
	NotificationProvider pulumi.StringInput
	// A type of integration
	//
	// Deprecated: Will be removed - it is added automatically on the SDK level.
	Type pulumi.StringPtrInput
}

func (NotificationIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationIntegrationArgs)(nil)).Elem()
}

type NotificationIntegrationInput interface {
	pulumi.Input

	ToNotificationIntegrationOutput() NotificationIntegrationOutput
	ToNotificationIntegrationOutputWithContext(ctx context.Context) NotificationIntegrationOutput
}

func (*NotificationIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationIntegration)(nil)).Elem()
}

func (i *NotificationIntegration) ToNotificationIntegrationOutput() NotificationIntegrationOutput {
	return i.ToNotificationIntegrationOutputWithContext(context.Background())
}

func (i *NotificationIntegration) ToNotificationIntegrationOutputWithContext(ctx context.Context) NotificationIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationIntegrationOutput)
}

// NotificationIntegrationArrayInput is an input type that accepts NotificationIntegrationArray and NotificationIntegrationArrayOutput values.
// You can construct a concrete instance of `NotificationIntegrationArrayInput` via:
//
//	NotificationIntegrationArray{ NotificationIntegrationArgs{...} }
type NotificationIntegrationArrayInput interface {
	pulumi.Input

	ToNotificationIntegrationArrayOutput() NotificationIntegrationArrayOutput
	ToNotificationIntegrationArrayOutputWithContext(context.Context) NotificationIntegrationArrayOutput
}

type NotificationIntegrationArray []NotificationIntegrationInput

func (NotificationIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationIntegration)(nil)).Elem()
}

func (i NotificationIntegrationArray) ToNotificationIntegrationArrayOutput() NotificationIntegrationArrayOutput {
	return i.ToNotificationIntegrationArrayOutputWithContext(context.Background())
}

func (i NotificationIntegrationArray) ToNotificationIntegrationArrayOutputWithContext(ctx context.Context) NotificationIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationIntegrationArrayOutput)
}

// NotificationIntegrationMapInput is an input type that accepts NotificationIntegrationMap and NotificationIntegrationMapOutput values.
// You can construct a concrete instance of `NotificationIntegrationMapInput` via:
//
//	NotificationIntegrationMap{ "key": NotificationIntegrationArgs{...} }
type NotificationIntegrationMapInput interface {
	pulumi.Input

	ToNotificationIntegrationMapOutput() NotificationIntegrationMapOutput
	ToNotificationIntegrationMapOutputWithContext(context.Context) NotificationIntegrationMapOutput
}

type NotificationIntegrationMap map[string]NotificationIntegrationInput

func (NotificationIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationIntegration)(nil)).Elem()
}

func (i NotificationIntegrationMap) ToNotificationIntegrationMapOutput() NotificationIntegrationMapOutput {
	return i.ToNotificationIntegrationMapOutputWithContext(context.Background())
}

func (i NotificationIntegrationMap) ToNotificationIntegrationMapOutputWithContext(ctx context.Context) NotificationIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationIntegrationMapOutput)
}

type NotificationIntegrationOutput struct{ *pulumi.OutputState }

func (NotificationIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationIntegration)(nil)).Elem()
}

func (o NotificationIntegrationOutput) ToNotificationIntegrationOutput() NotificationIntegrationOutput {
	return o
}

func (o NotificationIntegrationOutput) ToNotificationIntegrationOutputWithContext(ctx context.Context) NotificationIntegrationOutput {
	return o
}

// The external ID that Snowflake will use when assuming the AWS role
func (o NotificationIntegrationOutput) AwsSnsExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.AwsSnsExternalId }).(pulumi.StringOutput)
}

// The Snowflake user that will attempt to assume the AWS role.
func (o NotificationIntegrationOutput) AwsSnsIamUserArn() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.AwsSnsIamUserArn }).(pulumi.StringOutput)
}

// AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
func (o NotificationIntegrationOutput) AwsSnsRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.AwsSnsRoleArn }).(pulumi.StringPtrOutput)
}

// AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
func (o NotificationIntegrationOutput) AwsSnsTopicArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.AwsSnsTopicArn }).(pulumi.StringPtrOutput)
}

// AWS SQS queue ARN for notification integration to connect to
//
// Deprecated: No longer supported notification method
func (o NotificationIntegrationOutput) AwsSqsArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.AwsSqsArn }).(pulumi.StringPtrOutput)
}

// The external ID that Snowflake will use when assuming the AWS role
//
// Deprecated: No longer supported notification method
func (o NotificationIntegrationOutput) AwsSqsExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.AwsSqsExternalId }).(pulumi.StringOutput)
}

// The Snowflake user that will attempt to assume the AWS role.
//
// Deprecated: No longer supported notification method
func (o NotificationIntegrationOutput) AwsSqsIamUserArn() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.AwsSqsIamUserArn }).(pulumi.StringOutput)
}

// AWS IAM role ARN for notification integration to assume
//
// Deprecated: No longer supported notification method
func (o NotificationIntegrationOutput) AwsSqsRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.AwsSqsRoleArn }).(pulumi.StringPtrOutput)
}

// The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
func (o NotificationIntegrationOutput) AzureStorageQueuePrimaryUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.AzureStorageQueuePrimaryUri }).(pulumi.StringPtrOutput)
}

// The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
func (o NotificationIntegrationOutput) AzureTenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.AzureTenantId }).(pulumi.StringPtrOutput)
}

// A comment for the integration
func (o NotificationIntegrationOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Date and time when the notification integration was created.
func (o NotificationIntegrationOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
//
// Deprecated: Will be removed - it is added automatically on the SDK level.
func (o NotificationIntegrationOutput) Direction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.Direction }).(pulumi.StringPtrOutput)
}

func (o NotificationIntegrationOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The GCP service account identifier that Snowflake will use when assuming the GCP role
func (o NotificationIntegrationOutput) GcpPubsubServiceAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.GcpPubsubServiceAccount }).(pulumi.StringOutput)
}

// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
func (o NotificationIntegrationOutput) GcpPubsubSubscriptionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.GcpPubsubSubscriptionName }).(pulumi.StringPtrOutput)
}

// The topic id that Snowflake will use to push notifications.
func (o NotificationIntegrationOutput) GcpPubsubTopicName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.GcpPubsubTopicName }).(pulumi.StringPtrOutput)
}

func (o NotificationIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
func (o NotificationIntegrationOutput) NotificationProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringOutput { return v.NotificationProvider }).(pulumi.StringOutput)
}

// A type of integration
//
// Deprecated: Will be removed - it is added automatically on the SDK level.
func (o NotificationIntegrationOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationIntegration) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type NotificationIntegrationArrayOutput struct{ *pulumi.OutputState }

func (NotificationIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationIntegration)(nil)).Elem()
}

func (o NotificationIntegrationArrayOutput) ToNotificationIntegrationArrayOutput() NotificationIntegrationArrayOutput {
	return o
}

func (o NotificationIntegrationArrayOutput) ToNotificationIntegrationArrayOutputWithContext(ctx context.Context) NotificationIntegrationArrayOutput {
	return o
}

func (o NotificationIntegrationArrayOutput) Index(i pulumi.IntInput) NotificationIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationIntegration {
		return vs[0].([]*NotificationIntegration)[vs[1].(int)]
	}).(NotificationIntegrationOutput)
}

type NotificationIntegrationMapOutput struct{ *pulumi.OutputState }

func (NotificationIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationIntegration)(nil)).Elem()
}

func (o NotificationIntegrationMapOutput) ToNotificationIntegrationMapOutput() NotificationIntegrationMapOutput {
	return o
}

func (o NotificationIntegrationMapOutput) ToNotificationIntegrationMapOutputWithContext(ctx context.Context) NotificationIntegrationMapOutput {
	return o
}

func (o NotificationIntegrationMapOutput) MapIndex(k pulumi.StringInput) NotificationIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationIntegration {
		return vs[0].(map[string]*NotificationIntegration)[vs[1].(string)]
	}).(NotificationIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationIntegrationInput)(nil)).Elem(), &NotificationIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationIntegrationArrayInput)(nil)).Elem(), NotificationIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationIntegrationMapInput)(nil)).Elem(), NotificationIntegrationMap{})
	pulumi.RegisterOutputType(NotificationIntegrationOutput{})
	pulumi.RegisterOutputType(NotificationIntegrationArrayOutput{})
	pulumi.RegisterOutputType(NotificationIntegrationMapOutput{})
}
