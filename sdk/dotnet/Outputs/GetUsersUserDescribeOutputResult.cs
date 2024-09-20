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
    public sealed class GetUsersUserDescribeOutputResult
    {
        public readonly string Comment;
        public readonly string CustomLandingPageUrl;
        public readonly bool CustomLandingPageUrlFlushNextUiLoad;
        public readonly double DaysToExpiry;
        public readonly string DefaultNamespace;
        public readonly string DefaultRole;
        public readonly string DefaultSecondaryRoles;
        public readonly string DefaultWarehouse;
        public readonly bool Disabled;
        public readonly string DisplayName;
        public readonly string Email;
        public readonly bool ExtAuthnDuo;
        public readonly string ExtAuthnUid;
        public readonly string FirstName;
        public readonly bool HasMfa;
        public readonly string LastName;
        public readonly string LoginName;
        public readonly string MiddleName;
        public readonly int MinsToBypassMfa;
        public readonly int MinsToBypassNetworkPolicy;
        public readonly int MinsToUnlock;
        public readonly bool MustChangePassword;
        public readonly string Name;
        public readonly string Password;
        public readonly string PasswordLastSetTime;
        public readonly string RsaPublicKey;
        public readonly string RsaPublicKey2;
        public readonly string RsaPublicKey2Fp;
        public readonly string RsaPublicKeyFp;
        public readonly bool SnowflakeLock;
        public readonly bool SnowflakeSupport;

        [OutputConstructor]
        private GetUsersUserDescribeOutputResult(
            string comment,

            string customLandingPageUrl,

            bool customLandingPageUrlFlushNextUiLoad,

            double daysToExpiry,

            string defaultNamespace,

            string defaultRole,

            string defaultSecondaryRoles,

            string defaultWarehouse,

            bool disabled,

            string displayName,

            string email,

            bool extAuthnDuo,

            string extAuthnUid,

            string firstName,

            bool hasMfa,

            string lastName,

            string loginName,

            string middleName,

            int minsToBypassMfa,

            int minsToBypassNetworkPolicy,

            int minsToUnlock,

            bool mustChangePassword,

            string name,

            string password,

            string passwordLastSetTime,

            string rsaPublicKey,

            string rsaPublicKey2,

            string rsaPublicKey2Fp,

            string rsaPublicKeyFp,

            bool snowflakeLock,

            bool snowflakeSupport)
        {
            Comment = comment;
            CustomLandingPageUrl = customLandingPageUrl;
            CustomLandingPageUrlFlushNextUiLoad = customLandingPageUrlFlushNextUiLoad;
            DaysToExpiry = daysToExpiry;
            DefaultNamespace = defaultNamespace;
            DefaultRole = defaultRole;
            DefaultSecondaryRoles = defaultSecondaryRoles;
            DefaultWarehouse = defaultWarehouse;
            Disabled = disabled;
            DisplayName = displayName;
            Email = email;
            ExtAuthnDuo = extAuthnDuo;
            ExtAuthnUid = extAuthnUid;
            FirstName = firstName;
            HasMfa = hasMfa;
            LastName = lastName;
            LoginName = loginName;
            MiddleName = middleName;
            MinsToBypassMfa = minsToBypassMfa;
            MinsToBypassNetworkPolicy = minsToBypassNetworkPolicy;
            MinsToUnlock = minsToUnlock;
            MustChangePassword = mustChangePassword;
            Name = name;
            Password = password;
            PasswordLastSetTime = passwordLastSetTime;
            RsaPublicKey = rsaPublicKey;
            RsaPublicKey2 = rsaPublicKey2;
            RsaPublicKey2Fp = rsaPublicKey2Fp;
            RsaPublicKeyFp = rsaPublicKeyFp;
            SnowflakeLock = snowflakeLock;
            SnowflakeSupport = snowflakeSupport;
        }
    }
}