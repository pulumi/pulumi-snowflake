// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class AlertAlertScheduleCronGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        [Input("timeZone", required: true)]
        public Input<string> TimeZone { get; set; } = null!;

        public AlertAlertScheduleCronGetArgs()
        {
        }
        public static new AlertAlertScheduleCronGetArgs Empty => new AlertAlertScheduleCronGetArgs();
    }
}
