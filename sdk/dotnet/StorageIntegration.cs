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
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/storageIntegration:StorageIntegration example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/storageIntegration:StorageIntegration")]
    public partial class StorageIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
        /// </summary>
        [Output("azureConsentUrl")]
        public Output<string> AzureConsentUrl { get; private set; } = null!;

        /// <summary>
        /// This is the name of the Snowflake client application created for your account.
        /// </summary>
        [Output("azureMultiTenantAppName")]
        public Output<string> AzureMultiTenantAppName { get; private set; } = null!;

        [Output("azureTenantId")]
        public Output<string?> AzureTenantId { get; private set; } = null!;

        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Date and time when the storage integration was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Explicitly limits external stages that use the integration to reference one or more storage locations.
        /// </summary>
        [Output("storageAllowedLocations")]
        public Output<ImmutableArray<string>> StorageAllowedLocations { get; private set; } = null!;

        /// <summary>
        /// The external ID that Snowflake will use when assuming the AWS role.
        /// </summary>
        [Output("storageAwsExternalId")]
        public Output<string> StorageAwsExternalId { get; private set; } = null!;

        /// <summary>
        /// The Snowflake user that will attempt to assume the AWS role.
        /// </summary>
        [Output("storageAwsIamUserArn")]
        public Output<string> StorageAwsIamUserArn { get; private set; } = null!;

        /// <summary>
        /// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        /// </summary>
        [Output("storageAwsObjectAcl")]
        public Output<string?> StorageAwsObjectAcl { get; private set; } = null!;

        [Output("storageAwsRoleArn")]
        public Output<string?> StorageAwsRoleArn { get; private set; } = null!;

        /// <summary>
        /// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        /// </summary>
        [Output("storageBlockedLocations")]
        public Output<ImmutableArray<string>> StorageBlockedLocations { get; private set; } = null!;

        /// <summary>
        /// This is the name of the Snowflake Google Service Account created for your account.
        /// </summary>
        [Output("storageGcpServiceAccount")]
        public Output<string> StorageGcpServiceAccount { get; private set; } = null!;

        /// <summary>
        /// Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        /// </summary>
        [Output("storageProvider")]
        public Output<string> StorageProvider { get; private set; } = null!;

        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a StorageIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StorageIntegration(string name, StorageIntegrationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/storageIntegration:StorageIntegration", name, args ?? new StorageIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StorageIntegration(string name, Input<string> id, StorageIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/storageIntegration:StorageIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StorageIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StorageIntegration Get(string name, Input<string> id, StorageIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new StorageIntegration(name, id, state, options);
        }
    }

    public sealed class StorageIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("storageAllowedLocations", required: true)]
        private InputList<string>? _storageAllowedLocations;

        /// <summary>
        /// Explicitly limits external stages that use the integration to reference one or more storage locations.
        /// </summary>
        public InputList<string> StorageAllowedLocations
        {
            get => _storageAllowedLocations ?? (_storageAllowedLocations = new InputList<string>());
            set => _storageAllowedLocations = value;
        }

        /// <summary>
        /// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        /// </summary>
        [Input("storageAwsObjectAcl")]
        public Input<string>? StorageAwsObjectAcl { get; set; }

        [Input("storageAwsRoleArn")]
        public Input<string>? StorageAwsRoleArn { get; set; }

        [Input("storageBlockedLocations")]
        private InputList<string>? _storageBlockedLocations;

        /// <summary>
        /// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        /// </summary>
        public InputList<string> StorageBlockedLocations
        {
            get => _storageBlockedLocations ?? (_storageBlockedLocations = new InputList<string>());
            set => _storageBlockedLocations = value;
        }

        /// <summary>
        /// Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        /// </summary>
        [Input("storageProvider", required: true)]
        public Input<string> StorageProvider { get; set; } = null!;

        [Input("type")]
        public Input<string>? Type { get; set; }

        public StorageIntegrationArgs()
        {
        }
        public static new StorageIntegrationArgs Empty => new StorageIntegrationArgs();
    }

    public sealed class StorageIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
        /// </summary>
        [Input("azureConsentUrl")]
        public Input<string>? AzureConsentUrl { get; set; }

        /// <summary>
        /// This is the name of the Snowflake client application created for your account.
        /// </summary>
        [Input("azureMultiTenantAppName")]
        public Input<string>? AzureMultiTenantAppName { get; set; }

        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Date and time when the storage integration was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("storageAllowedLocations")]
        private InputList<string>? _storageAllowedLocations;

        /// <summary>
        /// Explicitly limits external stages that use the integration to reference one or more storage locations.
        /// </summary>
        public InputList<string> StorageAllowedLocations
        {
            get => _storageAllowedLocations ?? (_storageAllowedLocations = new InputList<string>());
            set => _storageAllowedLocations = value;
        }

        /// <summary>
        /// The external ID that Snowflake will use when assuming the AWS role.
        /// </summary>
        [Input("storageAwsExternalId")]
        public Input<string>? StorageAwsExternalId { get; set; }

        /// <summary>
        /// The Snowflake user that will attempt to assume the AWS role.
        /// </summary>
        [Input("storageAwsIamUserArn")]
        public Input<string>? StorageAwsIamUserArn { get; set; }

        /// <summary>
        /// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        /// </summary>
        [Input("storageAwsObjectAcl")]
        public Input<string>? StorageAwsObjectAcl { get; set; }

        [Input("storageAwsRoleArn")]
        public Input<string>? StorageAwsRoleArn { get; set; }

        [Input("storageBlockedLocations")]
        private InputList<string>? _storageBlockedLocations;

        /// <summary>
        /// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        /// </summary>
        public InputList<string> StorageBlockedLocations
        {
            get => _storageBlockedLocations ?? (_storageBlockedLocations = new InputList<string>());
            set => _storageBlockedLocations = value;
        }

        /// <summary>
        /// This is the name of the Snowflake Google Service Account created for your account.
        /// </summary>
        [Input("storageGcpServiceAccount")]
        public Input<string>? StorageGcpServiceAccount { get; set; }

        /// <summary>
        /// Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        /// </summary>
        [Input("storageProvider")]
        public Input<string>? StorageProvider { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public StorageIntegrationState()
        {
        }
        public static new StorageIntegrationState Empty => new StorageIntegrationState();
    }
}
