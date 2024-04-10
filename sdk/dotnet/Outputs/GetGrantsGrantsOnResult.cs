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
    public sealed class GetGrantsGrantsOnResult
    {
        /// <summary>
        /// Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
        /// </summary>
        public readonly bool? Account;
        /// <summary>
        /// Name of object to list privileges on.
        /// </summary>
        public readonly string? ObjectName;
        /// <summary>
        /// Type of object to list privileges on.
        /// </summary>
        public readonly string? ObjectType;

        [OutputConstructor]
        private GetGrantsGrantsOnResult(
            bool? account,

            string? objectName,

            string? objectType)
        {
            Account = account;
            ObjectName = objectName;
            ObjectType = objectType;
        }
    }
}
