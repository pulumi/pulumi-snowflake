// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class DatabaseReplicationEnableToAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies account identifier for which replication should be enabled. The account identifiers should be in the form of `"&lt;organization_name&gt;"."&lt;account_name&gt;"`.
        /// </summary>
        [Input("accountIdentifier", required: true)]
        public Input<string> AccountIdentifier { get; set; } = null!;

        /// <summary>
        /// Specifies if failover should be enabled for the specified account identifier
        /// </summary>
        [Input("withFailover")]
        public Input<bool>? WithFailover { get; set; }

        public DatabaseReplicationEnableToAccountArgs()
        {
        }
        public static new DatabaseReplicationEnableToAccountArgs Empty => new DatabaseReplicationEnableToAccountArgs();
    }
}
