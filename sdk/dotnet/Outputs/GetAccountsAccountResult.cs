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
    public sealed class GetAccountsAccountResult
    {
        /// <summary>
        /// Holds the output of SHOW ACCOUNTS.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountsAccountShowOutputResult> ShowOutputs;

        [OutputConstructor]
        private GetAccountsAccountResult(ImmutableArray<Outputs.GetAccountsAccountShowOutputResult> showOutputs)
        {
            ShowOutputs = showOutputs;
        }
    }
}
