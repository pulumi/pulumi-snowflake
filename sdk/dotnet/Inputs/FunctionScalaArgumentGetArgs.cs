// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class FunctionScalaArgumentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The argument type.
        /// </summary>
        [Input("argDataType", required: true)]
        public Input<string> ArgDataType { get; set; } = null!;

        [Input("argDefaultValue")]
        public Input<string>? ArgDefaultValue { get; set; }

        /// <summary>
        /// The argument name.
        /// </summary>
        [Input("argName", required: true)]
        public Input<string> ArgName { get; set; } = null!;

        public FunctionScalaArgumentGetArgs()
        {
        }
        public static new FunctionScalaArgumentGetArgs Empty => new FunctionScalaArgumentGetArgs();
    }
}
