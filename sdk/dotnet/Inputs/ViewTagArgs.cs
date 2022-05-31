// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ViewTagArgs : Pulumi.ResourceArgs
    {
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ViewTagArgs()
        {
        }
    }
}
