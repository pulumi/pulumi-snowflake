// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class GetDatabasesDatabaseShowOutputResult
    {
        public readonly string Comment;
        public readonly string CreatedOn;
        public readonly string DroppedOn;
        public readonly bool IsCurrent;
        public readonly bool IsDefault;
        public readonly string Kind;
        public readonly string Name;
        public readonly string Options;
        public readonly string Origin;
        public readonly string Owner;
        public readonly string OwnerRoleType;
        public readonly string ResourceGroup;
        public readonly int RetentionTime;
        public readonly bool Transient;

        [OutputConstructor]
        private GetDatabasesDatabaseShowOutputResult(
            string comment,

            string createdOn,

            string droppedOn,

            bool isCurrent,

            bool isDefault,

            string kind,

            string name,

            string options,

            string origin,

            string owner,

            string ownerRoleType,

            string resourceGroup,

            int retentionTime,

            bool transient)
        {
            Comment = comment;
            CreatedOn = createdOn;
            DroppedOn = droppedOn;
            IsCurrent = isCurrent;
            IsDefault = isDefault;
            Kind = kind;
            Name = name;
            Options = options;
            Origin = origin;
            Owner = owner;
            OwnerRoleType = ownerRoleType;
            ResourceGroup = resourceGroup;
            RetentionTime = retentionTime;
            Transient = transient;
        }
    }
}
