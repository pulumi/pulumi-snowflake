// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ExternalVolumeStorageLocationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the ID for your Office 365 tenant that the allowed and blocked storage accounts belong to.
        /// </summary>
        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        /// <summary>
        /// Specifies the ID for the KMS-managed key used to encrypt files.
        /// </summary>
        [Input("encryptionKmsKeyId")]
        public Input<string>? EncryptionKmsKeyId { get; set; }

        /// <summary>
        /// Specifies the encryption type used.
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// External ID that Snowflake uses to establish a trust relationship with AWS.
        /// </summary>
        [Input("storageAwsExternalId")]
        public Input<string>? StorageAwsExternalId { get; set; }

        /// <summary>
        /// Specifies the case-sensitive Amazon Resource Name (ARN) of the AWS identity and access management (IAM) role that grants privileges on the S3 bucket containing your data files.
        /// </summary>
        [Input("storageAwsRoleArn")]
        public Input<string>? StorageAwsRoleArn { get; set; }

        /// <summary>
        /// Specifies the base URL for your cloud storage location.
        /// </summary>
        [Input("storageBaseUrl", required: true)]
        public Input<string> StorageBaseUrl { get; set; } = null!;

        [Input("storageLocationName", required: true)]
        public Input<string> StorageLocationName { get; set; } = null!;

        /// <summary>
        /// Specifies the cloud storage provider that stores your data files. Valid values are (case-insensitive): `GCS` | `AZURE` | `S3` | `S3GOV`.
        /// </summary>
        [Input("storageProvider", required: true)]
        public Input<string> StorageProvider { get; set; } = null!;

        public ExternalVolumeStorageLocationGetArgs()
        {
        }
        public static new ExternalVolumeStorageLocationGetArgs Empty => new ExternalVolumeStorageLocationGetArgs();
    }
}