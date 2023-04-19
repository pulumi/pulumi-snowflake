// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class AlertAlertScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the cron expression for the alert. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
        /// </summary>
        [Input("cron")]
        public Input<Inputs.AlertAlertScheduleCronGetArgs>? Cron { get; set; }

        /// <summary>
        /// Specifies the interval in minutes for the alert schedule. The interval must be greater than 0 and less than 1440 (24 hours).
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        public AlertAlertScheduleGetArgs()
        {
        }
        public static new AlertAlertScheduleGetArgs Empty => new AlertAlertScheduleGetArgs();
    }
}
