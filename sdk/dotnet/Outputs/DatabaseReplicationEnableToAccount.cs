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
    public sealed class DatabaseReplicationEnableToAccount
    {
        /// <summary>
        /// Specifies account identifier for which replication should be enabled. The account identifiers should be in the form of `"&lt;organization_name&gt;"."&lt;account_name&gt;"`.
        /// </summary>
        public readonly string AccountIdentifier;
        /// <summary>
        /// Specifies if failover should be enabled for the specified account identifier
        /// </summary>
        public readonly bool? WithFailover;

        [OutputConstructor]
        private DatabaseReplicationEnableToAccount(
            string accountIdentifier,

            bool? withFailover)
        {
            AccountIdentifier = accountIdentifier;
            WithFailover = withFailover;
        }
    }
}