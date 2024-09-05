// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ViewRowAccessPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("ons", required: true)]
        private InputList<string>? _ons;

        /// <summary>
        /// Defines which columns are affected by the policy.
        /// </summary>
        public InputList<string> Ons
        {
            get => _ons ?? (_ons = new InputList<string>());
            set => _ons = value;
        }

        /// <summary>
        /// Row access policy name.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        public ViewRowAccessPolicyArgs()
        {
        }
        public static new ViewRowAccessPolicyArgs Empty => new ViewRowAccessPolicyArgs();
    }
}
