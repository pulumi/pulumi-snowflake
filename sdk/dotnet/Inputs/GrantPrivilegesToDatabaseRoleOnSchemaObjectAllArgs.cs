// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs : global::Pulumi.ResourceArgs
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
        /// The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | CORTEX SEARCH SERVICES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS.
        /// </summary>
        [Input("objectTypePlural", required: true)]
        public Input<string> ObjectTypePlural { get; set; } = null!;

        public GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs()
        {
        }
        public static new GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs Empty => new GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs();
    }
}
