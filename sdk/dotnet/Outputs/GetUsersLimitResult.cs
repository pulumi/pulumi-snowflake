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
    public sealed class GetUsersLimitResult
    {
        /// <summary>
        /// Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
        /// </summary>
        public readonly string? From;
        /// <summary>
        /// The maximum number of rows to return.
        /// </summary>
        public readonly int Rows;

        [OutputConstructor]
        private GetUsersLimitResult(
            string? from,

            int rows)
        {
            From = from;
            Rows = rows;
        }
    }
}
