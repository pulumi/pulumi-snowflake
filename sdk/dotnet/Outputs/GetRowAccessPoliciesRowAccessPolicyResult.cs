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
    public sealed class GetRowAccessPoliciesRowAccessPolicyResult
    {
        /// <summary>
        /// Holds the output of DESCRIBE ROW ACCESS POLICY.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRowAccessPoliciesRowAccessPolicyDescribeOutputResult> DescribeOutputs;
        /// <summary>
        /// Holds the output of SHOW ROW ACCESS POLICIES.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRowAccessPoliciesRowAccessPolicyShowOutputResult> ShowOutputs;

        [OutputConstructor]
        private GetRowAccessPoliciesRowAccessPolicyResult(
            ImmutableArray<Outputs.GetRowAccessPoliciesRowAccessPolicyDescribeOutputResult> describeOutputs,

            ImmutableArray<Outputs.GetRowAccessPoliciesRowAccessPolicyShowOutputResult> showOutputs)
        {
            DescribeOutputs = describeOutputs;
            ShowOutputs = showOutputs;
        }
    }
}
