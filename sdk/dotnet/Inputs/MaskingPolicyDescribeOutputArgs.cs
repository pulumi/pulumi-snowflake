// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class MaskingPolicyDescribeOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("body")]
        public Input<string>? Body { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        [Input("signatures")]
        private InputList<Inputs.MaskingPolicyDescribeOutputSignatureArgs>? _signatures;
        public InputList<Inputs.MaskingPolicyDescribeOutputSignatureArgs> Signatures
        {
            get => _signatures ?? (_signatures = new InputList<Inputs.MaskingPolicyDescribeOutputSignatureArgs>());
            set => _signatures = value;
        }

        public MaskingPolicyDescribeOutputArgs()
        {
        }
        public static new MaskingPolicyDescribeOutputArgs Empty => new MaskingPolicyDescribeOutputArgs();
    }
}
