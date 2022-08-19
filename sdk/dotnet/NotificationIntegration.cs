// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var integration = new Snowflake.NotificationIntegration("integration", new()
    ///     {
    ///         AwsSnsRoleArn = "...",
    ///         AwsSnsTopicArn = "...",
    ///         AwsSqsArn = "...",
    ///         AwsSqsRoleArn = "...",
    ///         AzureStorageQueuePrimaryUri = "...",
    ///         AzureTenantId = "...",
    ///         Comment = "A notification integration.",
    ///         Direction = "OUTBOUND",
    ///         Enabled = true,
    ///         NotificationProvider = "AWS_SNS",
    ///         Type = "QUEUE",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/notificationIntegration:NotificationIntegration example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/notificationIntegration:NotificationIntegration")]
    public partial class NotificationIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The external ID that Snowflake will use when assuming the AWS role
        /// </summary>
        [Output("awsSnsExternalId")]
        public Output<string> AwsSnsExternalId { get; private set; } = null!;

        /// <summary>
        /// The Snowflake user that will attempt to assume the AWS role.
        /// </summary>
        [Output("awsSnsIamUserArn")]
        public Output<string> AwsSnsIamUserArn { get; private set; } = null!;

        /// <summary>
        /// AWS IAM role ARN for notification integration to assume
        /// </summary>
        [Output("awsSnsRoleArn")]
        public Output<string?> AwsSnsRoleArn { get; private set; } = null!;

        /// <summary>
        /// AWS SNS Topic ARN for notification integration to connect to
        /// </summary>
        [Output("awsSnsTopicArn")]
        public Output<string?> AwsSnsTopicArn { get; private set; } = null!;

        /// <summary>
        /// AWS SQS queue ARN for notification integration to connect to
        /// </summary>
        [Output("awsSqsArn")]
        public Output<string?> AwsSqsArn { get; private set; } = null!;

        /// <summary>
        /// The external ID that Snowflake will use when assuming the AWS role
        /// </summary>
        [Output("awsSqsExternalId")]
        public Output<string> AwsSqsExternalId { get; private set; } = null!;

        /// <summary>
        /// The Snowflake user that will attempt to assume the AWS role.
        /// </summary>
        [Output("awsSqsIamUserArn")]
        public Output<string> AwsSqsIamUserArn { get; private set; } = null!;

        /// <summary>
        /// AWS IAM role ARN for notification integration to assume
        /// </summary>
        [Output("awsSqsRoleArn")]
        public Output<string?> AwsSqsRoleArn { get; private set; } = null!;

        /// <summary>
        /// The queue ID for the Azure Queue Storage queue created for Event Grid notifications
        /// </summary>
        [Output("azureStorageQueuePrimaryUri")]
        public Output<string?> AzureStorageQueuePrimaryUri { get; private set; } = null!;

        /// <summary>
        /// The ID of the Azure Active Directory tenant used for identity management
        /// </summary>
        [Output("azureTenantId")]
        public Output<string?> AzureTenantId { get; private set; } = null!;

        /// <summary>
        /// A comment for the integration
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Date and time when the notification integration was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
        /// </summary>
        [Output("direction")]
        public Output<string?> Direction { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The GCP service account identifier that Snowflake will use when assuming the GCP role
        /// </summary>
        [Output("gcpPubsubServiceAccount")]
        public Output<string> GcpPubsubServiceAccount { get; private set; } = null!;

        /// <summary>
        /// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
        /// </summary>
        [Output("gcpPubsubSubscriptionName")]
        public Output<string?> GcpPubsubSubscriptionName { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
        /// </summary>
        [Output("notificationProvider")]
        public Output<string?> NotificationProvider { get; private set; } = null!;

        /// <summary>
        /// A type of integration
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationIntegration(string name, NotificationIntegrationArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/notificationIntegration:NotificationIntegration", name, args ?? new NotificationIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationIntegration(string name, Input<string> id, NotificationIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/notificationIntegration:NotificationIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NotificationIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationIntegration Get(string name, Input<string> id, NotificationIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationIntegration(name, id, state, options);
        }
    }

    public sealed class NotificationIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS IAM role ARN for notification integration to assume
        /// </summary>
        [Input("awsSnsRoleArn")]
        public Input<string>? AwsSnsRoleArn { get; set; }

        /// <summary>
        /// AWS SNS Topic ARN for notification integration to connect to
        /// </summary>
        [Input("awsSnsTopicArn")]
        public Input<string>? AwsSnsTopicArn { get; set; }

        /// <summary>
        /// AWS SQS queue ARN for notification integration to connect to
        /// </summary>
        [Input("awsSqsArn")]
        public Input<string>? AwsSqsArn { get; set; }

        /// <summary>
        /// AWS IAM role ARN for notification integration to assume
        /// </summary>
        [Input("awsSqsRoleArn")]
        public Input<string>? AwsSqsRoleArn { get; set; }

        /// <summary>
        /// The queue ID for the Azure Queue Storage queue created for Event Grid notifications
        /// </summary>
        [Input("azureStorageQueuePrimaryUri")]
        public Input<string>? AzureStorageQueuePrimaryUri { get; set; }

        /// <summary>
        /// The ID of the Azure Active Directory tenant used for identity management
        /// </summary>
        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        /// <summary>
        /// A comment for the integration
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
        /// </summary>
        [Input("gcpPubsubSubscriptionName")]
        public Input<string>? GcpPubsubSubscriptionName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
        /// </summary>
        [Input("notificationProvider")]
        public Input<string>? NotificationProvider { get; set; }

        /// <summary>
        /// A type of integration
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NotificationIntegrationArgs()
        {
        }
        public static new NotificationIntegrationArgs Empty => new NotificationIntegrationArgs();
    }

    public sealed class NotificationIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The external ID that Snowflake will use when assuming the AWS role
        /// </summary>
        [Input("awsSnsExternalId")]
        public Input<string>? AwsSnsExternalId { get; set; }

        /// <summary>
        /// The Snowflake user that will attempt to assume the AWS role.
        /// </summary>
        [Input("awsSnsIamUserArn")]
        public Input<string>? AwsSnsIamUserArn { get; set; }

        /// <summary>
        /// AWS IAM role ARN for notification integration to assume
        /// </summary>
        [Input("awsSnsRoleArn")]
        public Input<string>? AwsSnsRoleArn { get; set; }

        /// <summary>
        /// AWS SNS Topic ARN for notification integration to connect to
        /// </summary>
        [Input("awsSnsTopicArn")]
        public Input<string>? AwsSnsTopicArn { get; set; }

        /// <summary>
        /// AWS SQS queue ARN for notification integration to connect to
        /// </summary>
        [Input("awsSqsArn")]
        public Input<string>? AwsSqsArn { get; set; }

        /// <summary>
        /// The external ID that Snowflake will use when assuming the AWS role
        /// </summary>
        [Input("awsSqsExternalId")]
        public Input<string>? AwsSqsExternalId { get; set; }

        /// <summary>
        /// The Snowflake user that will attempt to assume the AWS role.
        /// </summary>
        [Input("awsSqsIamUserArn")]
        public Input<string>? AwsSqsIamUserArn { get; set; }

        /// <summary>
        /// AWS IAM role ARN for notification integration to assume
        /// </summary>
        [Input("awsSqsRoleArn")]
        public Input<string>? AwsSqsRoleArn { get; set; }

        /// <summary>
        /// The queue ID for the Azure Queue Storage queue created for Event Grid notifications
        /// </summary>
        [Input("azureStorageQueuePrimaryUri")]
        public Input<string>? AzureStorageQueuePrimaryUri { get; set; }

        /// <summary>
        /// The ID of the Azure Active Directory tenant used for identity management
        /// </summary>
        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        /// <summary>
        /// A comment for the integration
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Date and time when the notification integration was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The GCP service account identifier that Snowflake will use when assuming the GCP role
        /// </summary>
        [Input("gcpPubsubServiceAccount")]
        public Input<string>? GcpPubsubServiceAccount { get; set; }

        /// <summary>
        /// The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
        /// </summary>
        [Input("gcpPubsubSubscriptionName")]
        public Input<string>? GcpPubsubSubscriptionName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The third-party cloud message queuing service (e.g. AZURE*STORAGE*QUEUE, AWS*SQS, AWS*SNS)
        /// </summary>
        [Input("notificationProvider")]
        public Input<string>? NotificationProvider { get; set; }

        /// <summary>
        /// A type of integration
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NotificationIntegrationState()
        {
        }
        public static new NotificationIntegrationState Empty => new NotificationIntegrationState();
    }
}
