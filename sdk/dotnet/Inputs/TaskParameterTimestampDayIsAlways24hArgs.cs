// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class TaskParameterTimestampDayIsAlways24hArgs : global::Pulumi.ResourceArgs
    {
        [Input("default")]
        public Input<string>? Default { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("level")]
        public Input<string>? Level { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public TaskParameterTimestampDayIsAlways24hArgs()
        {
        }
        public static new TaskParameterTimestampDayIsAlways24hArgs Empty => new TaskParameterTimestampDayIsAlways24hArgs();
    }
}
