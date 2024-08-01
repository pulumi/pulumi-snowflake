// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class SchemaShowOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("droppedOn")]
        public Input<string>? DroppedOn { get; set; }

        [Input("isCurrent")]
        public Input<bool>? IsCurrent { get; set; }

        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("options")]
        public Input<string>? Options { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("ownerRoleType")]
        public Input<string>? OwnerRoleType { get; set; }

        [Input("retentionTime")]
        public Input<string>? RetentionTime { get; set; }

        public SchemaShowOutputGetArgs()
        {
        }
        public static new SchemaShowOutputGetArgs Empty => new SchemaShowOutputGetArgs();
    }
}
