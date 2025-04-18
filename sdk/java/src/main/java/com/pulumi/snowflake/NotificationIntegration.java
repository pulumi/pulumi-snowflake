// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.NotificationIntegrationArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.NotificationIntegrationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/notificationIntegration:NotificationIntegration example name
 * ```
 * 
 */
@ResourceType(type="snowflake:index/notificationIntegration:NotificationIntegration")
public class NotificationIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The external ID that Snowflake will use when assuming the AWS role
     * 
     */
    @Export(name="awsSnsExternalId", refs={String.class}, tree="[0]")
    private Output<String> awsSnsExternalId;

    /**
     * @return The external ID that Snowflake will use when assuming the AWS role
     * 
     */
    public Output<String> awsSnsExternalId() {
        return this.awsSnsExternalId;
    }
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    @Export(name="awsSnsIamUserArn", refs={String.class}, tree="[0]")
    private Output<String> awsSnsIamUserArn;

    /**
     * @return The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    public Output<String> awsSnsIamUserArn() {
        return this.awsSnsIamUserArn;
    }
    /**
     * AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
     * 
     */
    @Export(name="awsSnsRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSnsRoleArn;

    /**
     * @return AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
     * 
     */
    public Output<Optional<String>> awsSnsRoleArn() {
        return Codegen.optional(this.awsSnsRoleArn);
    }
    /**
     * AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
     * 
     */
    @Export(name="awsSnsTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSnsTopicArn;

    /**
     * @return AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
     * 
     */
    public Output<Optional<String>> awsSnsTopicArn() {
        return Codegen.optional(this.awsSnsTopicArn);
    }
    /**
     * AWS SQS queue ARN for notification integration to connect to
     * 
     * @deprecated
     * No longer supported notification method
     * 
     */
    @Deprecated /* No longer supported notification method */
    @Export(name="awsSqsArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSqsArn;

    /**
     * @return AWS SQS queue ARN for notification integration to connect to
     * 
     */
    public Output<Optional<String>> awsSqsArn() {
        return Codegen.optional(this.awsSqsArn);
    }
    /**
     * The external ID that Snowflake will use when assuming the AWS role
     * 
     * @deprecated
     * No longer supported notification method
     * 
     */
    @Deprecated /* No longer supported notification method */
    @Export(name="awsSqsExternalId", refs={String.class}, tree="[0]")
    private Output<String> awsSqsExternalId;

    /**
     * @return The external ID that Snowflake will use when assuming the AWS role
     * 
     */
    public Output<String> awsSqsExternalId() {
        return this.awsSqsExternalId;
    }
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     * 
     * @deprecated
     * No longer supported notification method
     * 
     */
    @Deprecated /* No longer supported notification method */
    @Export(name="awsSqsIamUserArn", refs={String.class}, tree="[0]")
    private Output<String> awsSqsIamUserArn;

    /**
     * @return The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    public Output<String> awsSqsIamUserArn() {
        return this.awsSqsIamUserArn;
    }
    /**
     * AWS IAM role ARN for notification integration to assume
     * 
     * @deprecated
     * No longer supported notification method
     * 
     */
    @Deprecated /* No longer supported notification method */
    @Export(name="awsSqsRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSqsRoleArn;

    /**
     * @return AWS IAM role ARN for notification integration to assume
     * 
     */
    public Output<Optional<String>> awsSqsRoleArn() {
        return Codegen.optional(this.awsSqsRoleArn);
    }
    /**
     * The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
     * 
     */
    @Export(name="azureStorageQueuePrimaryUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> azureStorageQueuePrimaryUri;

    /**
     * @return The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
     * 
     */
    public Output<Optional<String>> azureStorageQueuePrimaryUri() {
        return Codegen.optional(this.azureStorageQueuePrimaryUri);
    }
    /**
     * The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
     * 
     */
    @Export(name="azureTenantId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> azureTenantId;

    /**
     * @return The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
     * 
     */
    public Output<Optional<String>> azureTenantId() {
        return Codegen.optional(this.azureTenantId);
    }
    /**
     * A comment for the integration
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return A comment for the integration
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Date and time when the notification integration was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Date and time when the notification integration was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     * 
     * @deprecated
     * Will be removed - it is added automatically on the SDK level.
     * 
     */
    @Deprecated /* Will be removed - it is added automatically on the SDK level. */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> direction;

    /**
     * @return Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     * 
     */
    public Output<Optional<String>> direction() {
        return Codegen.optional(this.direction);
    }
    /**
     * (Default: `true`)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return (Default: `true`)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Export(name="fullyQualifiedName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * The GCP service account identifier that Snowflake will use when assuming the GCP role
     * 
     */
    @Export(name="gcpPubsubServiceAccount", refs={String.class}, tree="[0]")
    private Output<String> gcpPubsubServiceAccount;

    /**
     * @return The GCP service account identifier that Snowflake will use when assuming the GCP role
     * 
     */
    public Output<String> gcpPubsubServiceAccount() {
        return this.gcpPubsubServiceAccount;
    }
    /**
     * The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     * 
     */
    @Export(name="gcpPubsubSubscriptionName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gcpPubsubSubscriptionName;

    /**
     * @return The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     * 
     */
    public Output<Optional<String>> gcpPubsubSubscriptionName() {
        return Codegen.optional(this.gcpPubsubSubscriptionName);
    }
    /**
     * The topic id that Snowflake will use to push notifications.
     * 
     */
    @Export(name="gcpPubsubTopicName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gcpPubsubTopicName;

    /**
     * @return The topic id that Snowflake will use to push notifications.
     * 
     */
    public Output<Optional<String>> gcpPubsubTopicName() {
        return Codegen.optional(this.gcpPubsubTopicName);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
     * 
     */
    @Export(name="notificationProvider", refs={String.class}, tree="[0]")
    private Output<String> notificationProvider;

    /**
     * @return The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
     * 
     */
    public Output<String> notificationProvider() {
        return this.notificationProvider;
    }
    /**
     * (Default: `QUEUE`) A type of integration
     * 
     * @deprecated
     * Will be removed - it is added automatically on the SDK level.
     * 
     */
    @Deprecated /* Will be removed - it is added automatically on the SDK level. */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return (Default: `QUEUE`) A type of integration
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationIntegration(java.lang.String name) {
        this(name, NotificationIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationIntegration(java.lang.String name, NotificationIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationIntegration(java.lang.String name, NotificationIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/notificationIntegration:NotificationIntegration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NotificationIntegration(java.lang.String name, Output<java.lang.String> id, @Nullable NotificationIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/notificationIntegration:NotificationIntegration", name, state, makeResourceOptions(options, id), false);
    }

    private static NotificationIntegrationArgs makeArgs(NotificationIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NotificationIntegrationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotificationIntegration get(java.lang.String name, Output<java.lang.String> id, @Nullable NotificationIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationIntegration(name, id, state, options);
    }
}
