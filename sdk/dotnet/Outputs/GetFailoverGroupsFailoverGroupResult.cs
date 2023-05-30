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
    public sealed class GetFailoverGroupsFailoverGroupResult
    {
        public readonly string AccountLocator;
        public readonly string AccountName;
        public readonly ImmutableArray<object> AllowedAccounts;
        public readonly ImmutableArray<object> AllowedIntegrationTypes;
        public readonly string Comment;
        public readonly string CreatedOn;
        public readonly bool IsPrimary;
        public readonly string NextScheduledRefresh;
        public readonly ImmutableArray<object> ObjectTypes;
        public readonly string OrganizationName;
        public readonly string Owner;
        public readonly string Primary;
        public readonly string RegionGroup;
        public readonly string ReplicationSchedule;
        public readonly string SecondaryState;
        public readonly string SnowflakeRegion;
        public readonly string Type;

        [OutputConstructor]
        private GetFailoverGroupsFailoverGroupResult(
            string accountLocator,

            string accountName,

            ImmutableArray<object> allowedAccounts,

            ImmutableArray<object> allowedIntegrationTypes,

            string comment,

            string createdOn,

            bool isPrimary,

            string nextScheduledRefresh,

            ImmutableArray<object> objectTypes,

            string organizationName,

            string owner,

            string primary,

            string regionGroup,

            string replicationSchedule,

            string secondaryState,

            string snowflakeRegion,

            string type)
        {
            AccountLocator = accountLocator;
            AccountName = accountName;
            AllowedAccounts = allowedAccounts;
            AllowedIntegrationTypes = allowedIntegrationTypes;
            Comment = comment;
            CreatedOn = createdOn;
            IsPrimary = isPrimary;
            NextScheduledRefresh = nextScheduledRefresh;
            ObjectTypes = objectTypes;
            OrganizationName = organizationName;
            Owner = owner;
            Primary = primary;
            RegionGroup = regionGroup;
            ReplicationSchedule = replicationSchedule;
            SecondaryState = secondaryState;
            SnowflakeRegion = snowflakeRegion;
            Type = type;
        }
    }
}
