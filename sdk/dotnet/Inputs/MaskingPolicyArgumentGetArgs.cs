// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class MaskingPolicyArgumentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The argument name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The argument type. VECTOR data types are not yet supported. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public MaskingPolicyArgumentGetArgs()
        {
        }
        public static new MaskingPolicyArgumentGetArgs Empty => new MaskingPolicyArgumentGetArgs();
    }
}
