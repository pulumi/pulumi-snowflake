// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class StreamOnDirectoryTableDescribeOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("baseTables")]
        private InputList<string>? _baseTables;
        public InputList<string> BaseTables
        {
            get => _baseTables ?? (_baseTables = new InputList<string>());
            set => _baseTables = value;
        }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("invalidReason")]
        public Input<string>? InvalidReason { get; set; }

        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("ownerRoleType")]
        public Input<string>? OwnerRoleType { get; set; }

        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        [Input("stale")]
        public Input<bool>? Stale { get; set; }

        [Input("staleAfter")]
        public Input<string>? StaleAfter { get; set; }

        [Input("tableName")]
        public Input<string>? TableName { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public StreamOnDirectoryTableDescribeOutputGetArgs()
        {
        }
        public static new StreamOnDirectoryTableDescribeOutputGetArgs Empty => new StreamOnDirectoryTableDescribeOutputGetArgs();
    }
}