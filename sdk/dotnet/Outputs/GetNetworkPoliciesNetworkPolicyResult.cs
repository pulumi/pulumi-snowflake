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
    public sealed class GetNetworkPoliciesNetworkPolicyResult
    {
        /// <summary>
        /// Holds the output of DESCRIBE NETWORK POLICIES.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkPoliciesNetworkPolicyDescribeOutputResult> DescribeOutputs;
        /// <summary>
        /// Holds the output of SHOW NETWORK POLICIES.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkPoliciesNetworkPolicyShowOutputResult> ShowOutputs;

        [OutputConstructor]
        private GetNetworkPoliciesNetworkPolicyResult(
            ImmutableArray<Outputs.GetNetworkPoliciesNetworkPolicyDescribeOutputResult> describeOutputs,

            ImmutableArray<Outputs.GetNetworkPoliciesNetworkPolicyShowOutputResult> showOutputs)
        {
            DescribeOutputs = describeOutputs;
            ShowOutputs = showOutputs;
        }
    }
}
