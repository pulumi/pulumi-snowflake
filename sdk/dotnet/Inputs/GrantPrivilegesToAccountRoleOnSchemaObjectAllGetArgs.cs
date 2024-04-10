// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantPrivilegesToAccountRoleOnSchemaObjectAllGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("inDatabase")]
        public Input<string>? InDatabase { get; set; }

        [Input("inSchema")]
        public Input<string>? InSchema { get; set; }

        /// <summary>
        /// The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | STREAMLITS | ICEBERG TABLES.
        /// </summary>
        [Input("objectTypePlural", required: true)]
        public Input<string> ObjectTypePlural { get; set; } = null!;

        public GrantPrivilegesToAccountRoleOnSchemaObjectAllGetArgs()
        {
        }
        public static new GrantPrivilegesToAccountRoleOnSchemaObjectAllGetArgs Empty => new GrantPrivilegesToAccountRoleOnSchemaObjectAllGetArgs();
    }
}
