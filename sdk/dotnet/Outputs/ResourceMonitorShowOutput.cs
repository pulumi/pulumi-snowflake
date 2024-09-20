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
    public sealed class ResourceMonitorShowOutput
    {
        public readonly string? Comment;
        public readonly string? CreatedOn;
        public readonly double? CreditQuota;
        public readonly string? EndTime;
        public readonly string? Frequency;
        public readonly string? Level;
        public readonly string? Name;
        public readonly string? Owner;
        public readonly double? RemainingCredits;
        public readonly string? StartTime;
        public readonly int? SuspendAt;
        public readonly int? SuspendImmediateAt;
        public readonly double? UsedCredits;

        [OutputConstructor]
        private ResourceMonitorShowOutput(
            string? comment,

            string? createdOn,

            double? creditQuota,

            string? endTime,

            string? frequency,

            string? level,

            string? name,

            string? owner,

            double? remainingCredits,

            string? startTime,

            int? suspendAt,

            int? suspendImmediateAt,

            double? usedCredits)
        {
            Comment = comment;
            CreatedOn = createdOn;
            CreditQuota = creditQuota;
            EndTime = endTime;
            Frequency = frequency;
            Level = level;
            Name = name;
            Owner = owner;
            RemainingCredits = remainingCredits;
            StartTime = startTime;
            SuspendAt = suspendAt;
            SuspendImmediateAt = suspendImmediateAt;
            UsedCredits = usedCredits;
        }
    }
}
