// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationIntegrationArgs Empty = new NotificationIntegrationArgs();

    /**
     * AWS IAM role ARN for notification integration to assume
     * 
     */
    @Import(name="awsSnsRoleArn")
    private @Nullable Output<String> awsSnsRoleArn;

    /**
     * @return AWS IAM role ARN for notification integration to assume
     * 
     */
    public Optional<Output<String>> awsSnsRoleArn() {
        return Optional.ofNullable(this.awsSnsRoleArn);
    }

    /**
     * AWS SNS Topic ARN for notification integration to connect to
     * 
     */
    @Import(name="awsSnsTopicArn")
    private @Nullable Output<String> awsSnsTopicArn;

    /**
     * @return AWS SNS Topic ARN for notification integration to connect to
     * 
     */
    public Optional<Output<String>> awsSnsTopicArn() {
        return Optional.ofNullable(this.awsSnsTopicArn);
    }

    /**
     * AWS SQS queue ARN for notification integration to connect to
     * 
     */
    @Import(name="awsSqsArn")
    private @Nullable Output<String> awsSqsArn;

    /**
     * @return AWS SQS queue ARN for notification integration to connect to
     * 
     */
    public Optional<Output<String>> awsSqsArn() {
        return Optional.ofNullable(this.awsSqsArn);
    }

    /**
     * AWS IAM role ARN for notification integration to assume
     * 
     */
    @Import(name="awsSqsRoleArn")
    private @Nullable Output<String> awsSqsRoleArn;

    /**
     * @return AWS IAM role ARN for notification integration to assume
     * 
     */
    public Optional<Output<String>> awsSqsRoleArn() {
        return Optional.ofNullable(this.awsSqsRoleArn);
    }

    /**
     * The queue ID for the Azure Queue Storage queue created for Event Grid notifications
     * 
     */
    @Import(name="azureStorageQueuePrimaryUri")
    private @Nullable Output<String> azureStorageQueuePrimaryUri;

    /**
     * @return The queue ID for the Azure Queue Storage queue created for Event Grid notifications
     * 
     */
    public Optional<Output<String>> azureStorageQueuePrimaryUri() {
        return Optional.ofNullable(this.azureStorageQueuePrimaryUri);
    }

    /**
     * The ID of the Azure Active Directory tenant used for identity management
     * 
     */
    @Import(name="azureTenantId")
    private @Nullable Output<String> azureTenantId;

    /**
     * @return The ID of the Azure Active Directory tenant used for identity management
     * 
     */
    public Optional<Output<String>> azureTenantId() {
        return Optional.ofNullable(this.azureTenantId);
    }

    /**
     * A comment for the integration
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return A comment for the integration
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     * 
     */
    @Import(name="gcpPubsubSubscriptionName")
    private @Nullable Output<String> gcpPubsubSubscriptionName;

    /**
     * @return The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     * 
     */
    public Optional<Output<String>> gcpPubsubSubscriptionName() {
        return Optional.ofNullable(this.gcpPubsubSubscriptionName);
    }

    /**
     * The topic id that Snowflake will use to push notifications.
     * 
     */
    @Import(name="gcpPubsubTopicName")
    private @Nullable Output<String> gcpPubsubTopicName;

    /**
     * @return The topic id that Snowflake will use to push notifications.
     * 
     */
    public Optional<Output<String>> gcpPubsubTopicName() {
        return Optional.ofNullable(this.gcpPubsubTopicName);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
     * 
     */
    @Import(name="notificationProvider")
    private @Nullable Output<String> notificationProvider;

    /**
     * @return The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
     * 
     */
    public Optional<Output<String>> notificationProvider() {
        return Optional.ofNullable(this.notificationProvider);
    }

    /**
     * A type of integration
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return A type of integration
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NotificationIntegrationArgs() {}

    private NotificationIntegrationArgs(NotificationIntegrationArgs $) {
        this.awsSnsRoleArn = $.awsSnsRoleArn;
        this.awsSnsTopicArn = $.awsSnsTopicArn;
        this.awsSqsArn = $.awsSqsArn;
        this.awsSqsRoleArn = $.awsSqsRoleArn;
        this.azureStorageQueuePrimaryUri = $.azureStorageQueuePrimaryUri;
        this.azureTenantId = $.azureTenantId;
        this.comment = $.comment;
        this.direction = $.direction;
        this.enabled = $.enabled;
        this.gcpPubsubSubscriptionName = $.gcpPubsubSubscriptionName;
        this.gcpPubsubTopicName = $.gcpPubsubTopicName;
        this.name = $.name;
        this.notificationProvider = $.notificationProvider;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationIntegrationArgs $;

        public Builder() {
            $ = new NotificationIntegrationArgs();
        }

        public Builder(NotificationIntegrationArgs defaults) {
            $ = new NotificationIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsSnsRoleArn AWS IAM role ARN for notification integration to assume
         * 
         * @return builder
         * 
         */
        public Builder awsSnsRoleArn(@Nullable Output<String> awsSnsRoleArn) {
            $.awsSnsRoleArn = awsSnsRoleArn;
            return this;
        }

        /**
         * @param awsSnsRoleArn AWS IAM role ARN for notification integration to assume
         * 
         * @return builder
         * 
         */
        public Builder awsSnsRoleArn(String awsSnsRoleArn) {
            return awsSnsRoleArn(Output.of(awsSnsRoleArn));
        }

        /**
         * @param awsSnsTopicArn AWS SNS Topic ARN for notification integration to connect to
         * 
         * @return builder
         * 
         */
        public Builder awsSnsTopicArn(@Nullable Output<String> awsSnsTopicArn) {
            $.awsSnsTopicArn = awsSnsTopicArn;
            return this;
        }

        /**
         * @param awsSnsTopicArn AWS SNS Topic ARN for notification integration to connect to
         * 
         * @return builder
         * 
         */
        public Builder awsSnsTopicArn(String awsSnsTopicArn) {
            return awsSnsTopicArn(Output.of(awsSnsTopicArn));
        }

        /**
         * @param awsSqsArn AWS SQS queue ARN for notification integration to connect to
         * 
         * @return builder
         * 
         */
        public Builder awsSqsArn(@Nullable Output<String> awsSqsArn) {
            $.awsSqsArn = awsSqsArn;
            return this;
        }

        /**
         * @param awsSqsArn AWS SQS queue ARN for notification integration to connect to
         * 
         * @return builder
         * 
         */
        public Builder awsSqsArn(String awsSqsArn) {
            return awsSqsArn(Output.of(awsSqsArn));
        }

        /**
         * @param awsSqsRoleArn AWS IAM role ARN for notification integration to assume
         * 
         * @return builder
         * 
         */
        public Builder awsSqsRoleArn(@Nullable Output<String> awsSqsRoleArn) {
            $.awsSqsRoleArn = awsSqsRoleArn;
            return this;
        }

        /**
         * @param awsSqsRoleArn AWS IAM role ARN for notification integration to assume
         * 
         * @return builder
         * 
         */
        public Builder awsSqsRoleArn(String awsSqsRoleArn) {
            return awsSqsRoleArn(Output.of(awsSqsRoleArn));
        }

        /**
         * @param azureStorageQueuePrimaryUri The queue ID for the Azure Queue Storage queue created for Event Grid notifications
         * 
         * @return builder
         * 
         */
        public Builder azureStorageQueuePrimaryUri(@Nullable Output<String> azureStorageQueuePrimaryUri) {
            $.azureStorageQueuePrimaryUri = azureStorageQueuePrimaryUri;
            return this;
        }

        /**
         * @param azureStorageQueuePrimaryUri The queue ID for the Azure Queue Storage queue created for Event Grid notifications
         * 
         * @return builder
         * 
         */
        public Builder azureStorageQueuePrimaryUri(String azureStorageQueuePrimaryUri) {
            return azureStorageQueuePrimaryUri(Output.of(azureStorageQueuePrimaryUri));
        }

        /**
         * @param azureTenantId The ID of the Azure Active Directory tenant used for identity management
         * 
         * @return builder
         * 
         */
        public Builder azureTenantId(@Nullable Output<String> azureTenantId) {
            $.azureTenantId = azureTenantId;
            return this;
        }

        /**
         * @param azureTenantId The ID of the Azure Active Directory tenant used for identity management
         * 
         * @return builder
         * 
         */
        public Builder azureTenantId(String azureTenantId) {
            return azureTenantId(Output.of(azureTenantId));
        }

        /**
         * @param comment A comment for the integration
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment A comment for the integration
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param direction Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param gcpPubsubSubscriptionName The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
         * 
         * @return builder
         * 
         */
        public Builder gcpPubsubSubscriptionName(@Nullable Output<String> gcpPubsubSubscriptionName) {
            $.gcpPubsubSubscriptionName = gcpPubsubSubscriptionName;
            return this;
        }

        /**
         * @param gcpPubsubSubscriptionName The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
         * 
         * @return builder
         * 
         */
        public Builder gcpPubsubSubscriptionName(String gcpPubsubSubscriptionName) {
            return gcpPubsubSubscriptionName(Output.of(gcpPubsubSubscriptionName));
        }

        /**
         * @param gcpPubsubTopicName The topic id that Snowflake will use to push notifications.
         * 
         * @return builder
         * 
         */
        public Builder gcpPubsubTopicName(@Nullable Output<String> gcpPubsubTopicName) {
            $.gcpPubsubTopicName = gcpPubsubTopicName;
            return this;
        }

        /**
         * @param gcpPubsubTopicName The topic id that Snowflake will use to push notifications.
         * 
         * @return builder
         * 
         */
        public Builder gcpPubsubTopicName(String gcpPubsubTopicName) {
            return gcpPubsubTopicName(Output.of(gcpPubsubTopicName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationProvider The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
         * 
         * @return builder
         * 
         */
        public Builder notificationProvider(@Nullable Output<String> notificationProvider) {
            $.notificationProvider = notificationProvider;
            return this;
        }

        /**
         * @param notificationProvider The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
         * 
         * @return builder
         * 
         */
        public Builder notificationProvider(String notificationProvider) {
            return notificationProvider(Output.of(notificationProvider));
        }

        /**
         * @param type A type of integration
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type A type of integration
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationIntegrationArgs build() {
            return $;
        }
    }

}
