// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class GetViewsViewResult
    {
        /// <summary>
        /// Holds the output of DESCRIBE VIEW.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetViewsViewDescribeOutputResult> DescribeOutputs;
        /// <summary>
        /// Holds the output of SHOW VIEWS.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetViewsViewShowOutputResult> ShowOutputs;

        [OutputConstructor]
        private GetViewsViewResult(
            ImmutableArray<Outputs.GetViewsViewDescribeOutputResult> describeOutputs,

            ImmutableArray<Outputs.GetViewsViewShowOutputResult> showOutputs)
        {
            DescribeOutputs = describeOutputs;
            ShowOutputs = showOutputs;
        }
    }
}
