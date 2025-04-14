// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/notificationIntegration:NotificationIntegration example name
 * ```
 */
export class NotificationIntegration extends pulumi.CustomResource {
    /**
     * Get an existing NotificationIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationIntegrationState, opts?: pulumi.CustomResourceOptions): NotificationIntegration {
        return new NotificationIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/notificationIntegration:NotificationIntegration';

    /**
     * Returns true if the given object is an instance of NotificationIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationIntegration.__pulumiType;
    }

    /**
     * The external ID that Snowflake will use when assuming the AWS role
     */
    public /*out*/ readonly awsSnsExternalId!: pulumi.Output<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     */
    public /*out*/ readonly awsSnsIamUserArn!: pulumi.Output<string>;
    /**
     * AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
     */
    public readonly awsSnsRoleArn!: pulumi.Output<string | undefined>;
    /**
     * AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
     */
    public readonly awsSnsTopicArn!: pulumi.Output<string | undefined>;
    /**
     * AWS SQS queue ARN for notification integration to connect to
     *
     * @deprecated No longer supported notification method
     */
    public readonly awsSqsArn!: pulumi.Output<string | undefined>;
    /**
     * The external ID that Snowflake will use when assuming the AWS role
     *
     * @deprecated No longer supported notification method
     */
    public /*out*/ readonly awsSqsExternalId!: pulumi.Output<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     *
     * @deprecated No longer supported notification method
     */
    public /*out*/ readonly awsSqsIamUserArn!: pulumi.Output<string>;
    /**
     * AWS IAM role ARN for notification integration to assume
     *
     * @deprecated No longer supported notification method
     */
    public readonly awsSqsRoleArn!: pulumi.Output<string | undefined>;
    /**
     * The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
     */
    public readonly azureStorageQueuePrimaryUri!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
     */
    public readonly azureTenantId!: pulumi.Output<string | undefined>;
    /**
     * A comment for the integration
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Date and time when the notification integration was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     *
     * @deprecated Will be removed - it is added automatically on the SDK level.
     */
    public readonly direction!: pulumi.Output<string | undefined>;
    /**
     * (Default: `true`)
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * The GCP service account identifier that Snowflake will use when assuming the GCP role
     */
    public /*out*/ readonly gcpPubsubServiceAccount!: pulumi.Output<string>;
    /**
     * The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     */
    public readonly gcpPubsubSubscriptionName!: pulumi.Output<string | undefined>;
    /**
     * The topic id that Snowflake will use to push notifications.
     */
    public readonly gcpPubsubTopicName!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
     */
    public readonly notificationProvider!: pulumi.Output<string>;
    /**
     * (Default: `QUEUE`) A type of integration
     *
     * @deprecated Will be removed - it is added automatically on the SDK level.
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a NotificationIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationIntegrationArgs | NotificationIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationIntegrationState | undefined;
            resourceInputs["awsSnsExternalId"] = state ? state.awsSnsExternalId : undefined;
            resourceInputs["awsSnsIamUserArn"] = state ? state.awsSnsIamUserArn : undefined;
            resourceInputs["awsSnsRoleArn"] = state ? state.awsSnsRoleArn : undefined;
            resourceInputs["awsSnsTopicArn"] = state ? state.awsSnsTopicArn : undefined;
            resourceInputs["awsSqsArn"] = state ? state.awsSqsArn : undefined;
            resourceInputs["awsSqsExternalId"] = state ? state.awsSqsExternalId : undefined;
            resourceInputs["awsSqsIamUserArn"] = state ? state.awsSqsIamUserArn : undefined;
            resourceInputs["awsSqsRoleArn"] = state ? state.awsSqsRoleArn : undefined;
            resourceInputs["azureStorageQueuePrimaryUri"] = state ? state.azureStorageQueuePrimaryUri : undefined;
            resourceInputs["azureTenantId"] = state ? state.azureTenantId : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["direction"] = state ? state.direction : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["gcpPubsubServiceAccount"] = state ? state.gcpPubsubServiceAccount : undefined;
            resourceInputs["gcpPubsubSubscriptionName"] = state ? state.gcpPubsubSubscriptionName : undefined;
            resourceInputs["gcpPubsubTopicName"] = state ? state.gcpPubsubTopicName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationProvider"] = state ? state.notificationProvider : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as NotificationIntegrationArgs | undefined;
            if ((!args || args.notificationProvider === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notificationProvider'");
            }
            resourceInputs["awsSnsRoleArn"] = args ? args.awsSnsRoleArn : undefined;
            resourceInputs["awsSnsTopicArn"] = args ? args.awsSnsTopicArn : undefined;
            resourceInputs["awsSqsArn"] = args ? args.awsSqsArn : undefined;
            resourceInputs["awsSqsRoleArn"] = args ? args.awsSqsRoleArn : undefined;
            resourceInputs["azureStorageQueuePrimaryUri"] = args ? args.azureStorageQueuePrimaryUri : undefined;
            resourceInputs["azureTenantId"] = args ? args.azureTenantId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["direction"] = args ? args.direction : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["gcpPubsubSubscriptionName"] = args ? args.gcpPubsubSubscriptionName : undefined;
            resourceInputs["gcpPubsubTopicName"] = args ? args.gcpPubsubTopicName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationProvider"] = args ? args.notificationProvider : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["awsSnsExternalId"] = undefined /*out*/;
            resourceInputs["awsSnsIamUserArn"] = undefined /*out*/;
            resourceInputs["awsSqsExternalId"] = undefined /*out*/;
            resourceInputs["awsSqsIamUserArn"] = undefined /*out*/;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["gcpPubsubServiceAccount"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NotificationIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationIntegration resources.
 */
export interface NotificationIntegrationState {
    /**
     * The external ID that Snowflake will use when assuming the AWS role
     */
    awsSnsExternalId?: pulumi.Input<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     */
    awsSnsIamUserArn?: pulumi.Input<string>;
    /**
     * AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
     */
    awsSnsRoleArn?: pulumi.Input<string>;
    /**
     * AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
     */
    awsSnsTopicArn?: pulumi.Input<string>;
    /**
     * AWS SQS queue ARN for notification integration to connect to
     *
     * @deprecated No longer supported notification method
     */
    awsSqsArn?: pulumi.Input<string>;
    /**
     * The external ID that Snowflake will use when assuming the AWS role
     *
     * @deprecated No longer supported notification method
     */
    awsSqsExternalId?: pulumi.Input<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     *
     * @deprecated No longer supported notification method
     */
    awsSqsIamUserArn?: pulumi.Input<string>;
    /**
     * AWS IAM role ARN for notification integration to assume
     *
     * @deprecated No longer supported notification method
     */
    awsSqsRoleArn?: pulumi.Input<string>;
    /**
     * The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
     */
    azureStorageQueuePrimaryUri?: pulumi.Input<string>;
    /**
     * The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
     */
    azureTenantId?: pulumi.Input<string>;
    /**
     * A comment for the integration
     */
    comment?: pulumi.Input<string>;
    /**
     * Date and time when the notification integration was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     *
     * @deprecated Will be removed - it is added automatically on the SDK level.
     */
    direction?: pulumi.Input<string>;
    /**
     * (Default: `true`)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * The GCP service account identifier that Snowflake will use when assuming the GCP role
     */
    gcpPubsubServiceAccount?: pulumi.Input<string>;
    /**
     * The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     */
    gcpPubsubSubscriptionName?: pulumi.Input<string>;
    /**
     * The topic id that Snowflake will use to push notifications.
     */
    gcpPubsubTopicName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
     */
    notificationProvider?: pulumi.Input<string>;
    /**
     * (Default: `QUEUE`) A type of integration
     *
     * @deprecated Will be removed - it is added automatically on the SDK level.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NotificationIntegration resource.
 */
export interface NotificationIntegrationArgs {
    /**
     * AWS IAM role ARN for notification integration to assume. Required for AWS_SNS provider
     */
    awsSnsRoleArn?: pulumi.Input<string>;
    /**
     * AWS SNS Topic ARN for notification integration to connect to. Required for AWS_SNS provider.
     */
    awsSnsTopicArn?: pulumi.Input<string>;
    /**
     * AWS SQS queue ARN for notification integration to connect to
     *
     * @deprecated No longer supported notification method
     */
    awsSqsArn?: pulumi.Input<string>;
    /**
     * AWS IAM role ARN for notification integration to assume
     *
     * @deprecated No longer supported notification method
     */
    awsSqsRoleArn?: pulumi.Input<string>;
    /**
     * The queue ID for the Azure Queue Storage queue created for Event Grid notifications. Required for AZURE*STORAGE*QUEUE provider
     */
    azureStorageQueuePrimaryUri?: pulumi.Input<string>;
    /**
     * The ID of the Azure Active Directory tenant used for identity management. Required for AZURE*STORAGE*QUEUE provider
     */
    azureTenantId?: pulumi.Input<string>;
    /**
     * A comment for the integration
     */
    comment?: pulumi.Input<string>;
    /**
     * Direction of the cloud messaging with respect to Snowflake (required only for error notifications)
     *
     * @deprecated Will be removed - it is added automatically on the SDK level.
     */
    direction?: pulumi.Input<string>;
    /**
     * (Default: `true`)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The subscription id that Snowflake will listen to when using the GCP_PUBSUB provider.
     */
    gcpPubsubSubscriptionName?: pulumi.Input<string>;
    /**
     * The topic id that Snowflake will use to push notifications.
     */
    gcpPubsubTopicName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * The third-party cloud message queuing service (supported values: AZURE*STORAGE*QUEUE, AWS*SNS, GCP*PUBSUB; AWS_SQS is deprecated and will be removed in the future provider versions)
     */
    notificationProvider: pulumi.Input<string>;
    /**
     * (Default: `QUEUE`) A type of integration
     *
     * @deprecated Will be removed - it is added automatically on the SDK level.
     */
    type?: pulumi.Input<string>;
}
