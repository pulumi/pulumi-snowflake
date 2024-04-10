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
    public sealed class GrantPrivilegesToAccountRoleOnSchemaObjectFuture
    {
        public readonly string? InDatabase;
        public readonly string? InSchema;
        /// <summary>
        /// The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | STREAMLITS | ICEBERG TABLES.
        /// </summary>
        public readonly string ObjectTypePlural;

        [OutputConstructor]
        private GrantPrivilegesToAccountRoleOnSchemaObjectFuture(
            string? inDatabase,

            string? inSchema,

            string objectTypePlural)
        {
            InDatabase = inDatabase;
            InSchema = inSchema;
            ObjectTypePlural = objectTypePlural;
        }
    }
}
