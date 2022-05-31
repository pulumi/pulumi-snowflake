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
    public sealed class GetUsersUserResult
    {
        public readonly string Comment;
        public readonly string DefaultNamespace;
        public readonly string DefaultRole;
        public readonly string DefaultWarehouse;
        public readonly bool Disabled;
        public readonly string DisplayName;
        public readonly string Email;
        public readonly string FirstName;
        public readonly bool HasRsaPublicKey;
        public readonly string LastName;
        public readonly string LoginName;
        public readonly string Name;

        [OutputConstructor]
        private GetUsersUserResult(
            string comment,

            string defaultNamespace,

            string defaultRole,

            string defaultWarehouse,

            bool disabled,

            string displayName,

            string email,

            string firstName,

            bool hasRsaPublicKey,

            string lastName,

            string loginName,

            string name)
        {
            Comment = comment;
            DefaultNamespace = defaultNamespace;
            DefaultRole = defaultRole;
            DefaultWarehouse = defaultWarehouse;
            Disabled = disabled;
            DisplayName = displayName;
            Email = email;
            FirstName = firstName;
            HasRsaPublicKey = hasRsaPublicKey;
            LastName = lastName;
            LoginName = loginName;
            Name = name;
        }
    }
}
