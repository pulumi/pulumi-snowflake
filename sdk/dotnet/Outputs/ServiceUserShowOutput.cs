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
    public sealed class ServiceUserShowOutput
    {
        public readonly string? Comment;
        public readonly string? CreatedOn;
        public readonly string? DaysToExpiry;
        public readonly string? DefaultNamespace;
        public readonly string? DefaultRole;
        public readonly string? DefaultSecondaryRoles;
        public readonly string? DefaultWarehouse;
        public readonly bool? Disabled;
        public readonly string? DisplayName;
        public readonly string? Email;
        public readonly string? ExpiresAtTime;
        public readonly bool? ExtAuthnDuo;
        public readonly string? ExtAuthnUid;
        public readonly string? FirstName;
        public readonly bool? HasMfa;
        public readonly bool? HasPassword;
        public readonly bool? HasRsaPublicKey;
        public readonly string? LastName;
        public readonly string? LastSuccessLogin;
        public readonly string? LockedUntilTime;
        public readonly string? LoginName;
        public readonly string? MinsToBypassMfa;
        public readonly string? MinsToUnlock;
        public readonly bool? MustChangePassword;
        public readonly string? Name;
        public readonly string? Owner;
        public readonly bool? SnowflakeLock;
        public readonly string? Type;

        [OutputConstructor]
        private ServiceUserShowOutput(
            string? comment,

            string? createdOn,

            string? daysToExpiry,

            string? defaultNamespace,

            string? defaultRole,

            string? defaultSecondaryRoles,

            string? defaultWarehouse,

            bool? disabled,

            string? displayName,

            string? email,

            string? expiresAtTime,

            bool? extAuthnDuo,

            string? extAuthnUid,

            string? firstName,

            bool? hasMfa,

            bool? hasPassword,

            bool? hasRsaPublicKey,

            string? lastName,

            string? lastSuccessLogin,

            string? lockedUntilTime,

            string? loginName,

            string? minsToBypassMfa,

            string? minsToUnlock,

            bool? mustChangePassword,

            string? name,

            string? owner,

            bool? snowflakeLock,

            string? type)
        {
            Comment = comment;
            CreatedOn = createdOn;
            DaysToExpiry = daysToExpiry;
            DefaultNamespace = defaultNamespace;
            DefaultRole = defaultRole;
            DefaultSecondaryRoles = defaultSecondaryRoles;
            DefaultWarehouse = defaultWarehouse;
            Disabled = disabled;
            DisplayName = displayName;
            Email = email;
            ExpiresAtTime = expiresAtTime;
            ExtAuthnDuo = extAuthnDuo;
            ExtAuthnUid = extAuthnUid;
            FirstName = firstName;
            HasMfa = hasMfa;
            HasPassword = hasPassword;
            HasRsaPublicKey = hasRsaPublicKey;
            LastName = lastName;
            LastSuccessLogin = lastSuccessLogin;
            LockedUntilTime = lockedUntilTime;
            LoginName = loginName;
            MinsToBypassMfa = minsToBypassMfa;
            MinsToUnlock = minsToUnlock;
            MustChangePassword = mustChangePassword;
            Name = name;
            Owner = owner;
            SnowflakeLock = snowflakeLock;
            Type = type;
        }
    }
}
