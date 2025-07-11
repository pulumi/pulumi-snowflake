// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class DatabaseRoleShowOutput
    {
        public readonly string? Comment;
        public readonly string? CreatedOn;
        public readonly string? DatabaseName;
        public readonly int? GrantedDatabaseRoles;
        public readonly int? GrantedToDatabaseRoles;
        public readonly int? GrantedToRoles;
        public readonly bool? IsCurrent;
        public readonly bool? IsDefault;
        public readonly bool? IsInherited;
        public readonly string? Name;
        public readonly string? Owner;
        public readonly string? OwnerRoleType;

        [OutputConstructor]
        private DatabaseRoleShowOutput(
            string? comment,

            string? createdOn,

            string? databaseName,

            int? grantedDatabaseRoles,

            int? grantedToDatabaseRoles,

            int? grantedToRoles,

            bool? isCurrent,

            bool? isDefault,

            bool? isInherited,

            string? name,

            string? owner,

            string? ownerRoleType)
        {
            Comment = comment;
            CreatedOn = createdOn;
            DatabaseName = databaseName;
            GrantedDatabaseRoles = grantedDatabaseRoles;
            GrantedToDatabaseRoles = grantedToDatabaseRoles;
            GrantedToRoles = grantedToRoles;
            IsCurrent = isCurrent;
            IsDefault = isDefault;
            IsInherited = isInherited;
            Name = name;
            Owner = owner;
            OwnerRoleType = ownerRoleType;
        }
    }
}
