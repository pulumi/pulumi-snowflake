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
        /// <summary>
        /// The fully qualified name of the database.
        /// </summary>
        [Input("inDatabase")]
        public Input<string>? InDatabase { get; set; }

        /// <summary>
        /// The fully qualified name of the schema.
        /// </summary>
        [Input("inSchema")]
        public Input<string>? InSchema { get; set; }

        /// <summary>
        /// The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS
        /// </summary>
        [Input("objectTypePlural", required: true)]
        public Input<string> ObjectTypePlural { get; set; } = null!;

        public GrantPrivilegesToRoleOnSchemaObjectAllGetArgs()
        {
        }
        public static new GrantPrivilegesToRoleOnSchemaObjectAllGetArgs Empty => new GrantPrivilegesToRoleOnSchemaObjectAllGetArgs();
    }
}
