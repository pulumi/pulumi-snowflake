// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class DynamicTableTargetLagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the target lag time is downstream.
        /// </summary>
        [Input("downstream")]
        public Input<bool>? Downstream { get; set; }

        /// <summary>
        /// Specifies the maximum target lag time for the dynamic table.
        /// </summary>
        [Input("maximumDuration")]
        public Input<string>? MaximumDuration { get; set; }

        public DynamicTableTargetLagGetArgs()
        {
        }
        public static new DynamicTableTargetLagGetArgs Empty => new DynamicTableTargetLagGetArgs();
    }
}