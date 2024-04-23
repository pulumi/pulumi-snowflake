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
    public sealed class GrantPrivilegesToRoleOnSchemaObjectFuture
    {
        /// <summary>
        /// The fully qualified name of the database.
        /// </summary>
        public readonly string? InDatabase;
        /// <summary>
        /// The fully qualified name of the schema.
        /// </summary>
        public readonly string? InSchema;
        /// <summary>
        /// The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PASSWORD POLICIES | PIPES | PROCEDURES | SECRETS | SERVICES | SEQUENCES | STAGES | STREAMS | TABLES | TASKS | VIEWS
        /// </summary>
        public readonly string ObjectTypePlural;

        [OutputConstructor]
        private GrantPrivilegesToRoleOnSchemaObjectFuture(
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
