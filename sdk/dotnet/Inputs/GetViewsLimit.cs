// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GetViewsLimitArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
        /// </summary>
        [Input("from")]
        public string? From { get; set; }

        /// <summary>
        /// The maximum number of rows to return.
        /// </summary>
        [Input("rows", required: true)]
        public int Rows { get; set; }

        public GetViewsLimitArgs()
        {
        }
        public static new GetViewsLimitArgs Empty => new GetViewsLimitArgs();
    }
}
