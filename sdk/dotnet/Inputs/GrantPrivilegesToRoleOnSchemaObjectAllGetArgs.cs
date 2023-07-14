// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantPrivilegesToRoleOnSchemaObjectAllGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("inDatabase")]
        public Input<string>? InDatabase { get; set; }

        [Input("inSchema")]
        public Input<string>? InSchema { get; set; }

        [Input("objectTypePlural", required: true)]
        public Input<string> ObjectTypePlural { get; set; } = null!;

        public GrantPrivilegesToRoleOnSchemaObjectAllGetArgs()
        {
        }
        public static new GrantPrivilegesToRoleOnSchemaObjectAllGetArgs Empty => new GrantPrivilegesToRoleOnSchemaObjectAllGetArgs();
    }
}