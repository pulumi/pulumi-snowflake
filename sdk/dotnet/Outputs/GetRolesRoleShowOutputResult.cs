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
    public sealed class GetRolesRoleShowOutputResult
    {
        public readonly int AssignedToUsers;
        public readonly string Comment;
        public readonly string CreatedOn;
        public readonly int GrantedRoles;
        public readonly int GrantedToRoles;
        public readonly bool IsCurrent;
        public readonly bool IsDefault;
        public readonly bool IsInherited;
        public readonly string Name;
        public readonly string Owner;

        [OutputConstructor]
        private GetRolesRoleShowOutputResult(
            int assignedToUsers,

            string comment,

            string createdOn,

            int grantedRoles,

            int grantedToRoles,

            bool isCurrent,

            bool isDefault,

            bool isInherited,

            string name,

            string owner)
        {
            AssignedToUsers = assignedToUsers;
            Comment = comment;
            CreatedOn = createdOn;
            GrantedRoles = grantedRoles;
            GrantedToRoles = grantedToRoles;
            IsCurrent = isCurrent;
            IsDefault = isDefault;
            IsInherited = isInherited;
            Name = name;
            Owner = owner;
        }
    }
}
