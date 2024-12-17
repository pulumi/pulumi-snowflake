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
    public sealed class ViewRowAccessPolicy
    {
        /// <summary>
        /// Defines which columns are affected by the policy.
        /// </summary>
        public readonly ImmutableArray<string> Ons;
        /// <summary>
        /// Row access policy name. For more information about this resource, see docs.
        /// </summary>
        public readonly string PolicyName;

        [OutputConstructor]
        private ViewRowAccessPolicy(
            ImmutableArray<string> ons,

            string policyName)
        {
            Ons = ons;
            PolicyName = policyName;
        }
    }
}
