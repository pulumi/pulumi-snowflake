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
        /// <summary>
        /// Specifies the cron expression for the alert. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Specifies the time zone for alert refresh.
        /// </summary>
        [Input("timeZone", required: true)]
        public Input<string> TimeZone { get; set; } = null!;

        public AlertAlertScheduleCronGetArgs()
        {
        }
        public static new AlertAlertScheduleCronGetArgs Empty => new AlertAlertScheduleCronGetArgs();
    }
}
