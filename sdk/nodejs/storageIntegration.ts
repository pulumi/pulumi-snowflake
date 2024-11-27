// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/storageIntegration:StorageIntegration example name
 * ```
 */
export class StorageIntegration extends pulumi.CustomResource {
    /**
     * Get an existing StorageIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageIntegrationState, opts?: pulumi.CustomResourceOptions): StorageIntegration {
        return new StorageIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/storageIntegration:StorageIntegration';

    /**
     * Returns true if the given object is an instance of StorageIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageIntegration.__pulumiType;
    }

    /**
     * The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
     */
    public /*out*/ readonly azureConsentUrl!: pulumi.Output<string>;
    /**
     * This is the name of the Snowflake client application created for your account.
     */
    public /*out*/ readonly azureMultiTenantAppName!: pulumi.Output<string>;
    public readonly azureTenantId!: pulumi.Output<string | undefined>;
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Date and time when the storage integration was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;
    /**
     * Explicitly limits external stages that use the integration to reference one or more storage locations.
     */
    public readonly storageAllowedLocations!: pulumi.Output<string[]>;
    /**
     * The external ID that Snowflake will use when assuming the AWS role.
     */
    public /*out*/ readonly storageAwsExternalId!: pulumi.Output<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     */
    public /*out*/ readonly storageAwsIamUserArn!: pulumi.Output<string>;
    /**
     * "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
     */
    public readonly storageAwsObjectAcl!: pulumi.Output<string | undefined>;
    public readonly storageAwsRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
     */
    public readonly storageBlockedLocations!: pulumi.Output<string[] | undefined>;
    /**
     * This is the name of the Snowflake Google Service Account created for your account.
     */
    public /*out*/ readonly storageGcpServiceAccount!: pulumi.Output<string>;
    /**
     * Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
     */
    public readonly storageProvider!: pulumi.Output<string>;
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a StorageIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StorageIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageIntegrationArgs | StorageIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageIntegrationState | undefined;
            resourceInputs["azureConsentUrl"] = state ? state.azureConsentUrl : undefined;
            resourceInputs["azureMultiTenantAppName"] = state ? state.azureMultiTenantAppName : undefined;
            resourceInputs["azureTenantId"] = state ? state.azureTenantId : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["storageAllowedLocations"] = state ? state.storageAllowedLocations : undefined;
            resourceInputs["storageAwsExternalId"] = state ? state.storageAwsExternalId : undefined;
            resourceInputs["storageAwsIamUserArn"] = state ? state.storageAwsIamUserArn : undefined;
            resourceInputs["storageAwsObjectAcl"] = state ? state.storageAwsObjectAcl : undefined;
            resourceInputs["storageAwsRoleArn"] = state ? state.storageAwsRoleArn : undefined;
            resourceInputs["storageBlockedLocations"] = state ? state.storageBlockedLocations : undefined;
            resourceInputs["storageGcpServiceAccount"] = state ? state.storageGcpServiceAccount : undefined;
            resourceInputs["storageProvider"] = state ? state.storageProvider : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as StorageIntegrationArgs | undefined;
            if ((!args || args.storageAllowedLocations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAllowedLocations'");
            }
            if ((!args || args.storageProvider === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageProvider'");
            }
            resourceInputs["azureTenantId"] = args ? args.azureTenantId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["storageAllowedLocations"] = args ? args.storageAllowedLocations : undefined;
            resourceInputs["storageAwsObjectAcl"] = args ? args.storageAwsObjectAcl : undefined;
            resourceInputs["storageAwsRoleArn"] = args ? args.storageAwsRoleArn : undefined;
            resourceInputs["storageBlockedLocations"] = args ? args.storageBlockedLocations : undefined;
            resourceInputs["storageProvider"] = args ? args.storageProvider : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["azureConsentUrl"] = undefined /*out*/;
            resourceInputs["azureMultiTenantAppName"] = undefined /*out*/;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["storageAwsExternalId"] = undefined /*out*/;
            resourceInputs["storageAwsIamUserArn"] = undefined /*out*/;
            resourceInputs["storageGcpServiceAccount"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageIntegration resources.
 */
export interface StorageIntegrationState {
    /**
     * The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
     */
    azureConsentUrl?: pulumi.Input<string>;
    /**
     * This is the name of the Snowflake client application created for your account.
     */
    azureMultiTenantAppName?: pulumi.Input<string>;
    azureTenantId?: pulumi.Input<string>;
    comment?: pulumi.Input<string>;
    /**
     * Date and time when the storage integration was created.
     */
    createdOn?: pulumi.Input<string>;
    enabled?: pulumi.Input<boolean>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * Explicitly limits external stages that use the integration to reference one or more storage locations.
     */
    storageAllowedLocations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The external ID that Snowflake will use when assuming the AWS role.
     */
    storageAwsExternalId?: pulumi.Input<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     */
    storageAwsIamUserArn?: pulumi.Input<string>;
    /**
     * "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
     */
    storageAwsObjectAcl?: pulumi.Input<string>;
    storageAwsRoleArn?: pulumi.Input<string>;
    /**
     * Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
     */
    storageBlockedLocations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This is the name of the Snowflake Google Service Account created for your account.
     */
    storageGcpServiceAccount?: pulumi.Input<string>;
    /**
     * Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
     */
    storageProvider?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageIntegration resource.
 */
export interface StorageIntegrationArgs {
    azureTenantId?: pulumi.Input<string>;
    comment?: pulumi.Input<string>;
    enabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    /**
     * Explicitly limits external stages that use the integration to reference one or more storage locations.
     */
    storageAllowedLocations: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
     */
    storageAwsObjectAcl?: pulumi.Input<string>;
    storageAwsRoleArn?: pulumi.Input<string>;
    /**
     * Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
     */
    storageBlockedLocations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
     */
    storageProvider: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
