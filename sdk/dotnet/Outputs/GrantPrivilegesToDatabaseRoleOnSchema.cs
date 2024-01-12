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
    public sealed class GrantPrivilegesToDatabaseRoleOnSchema
    {
        /// <summary>
        /// The fully qualified name of the database.
        /// </summary>
        public readonly string? AllSchemasInDatabase;
        /// <summary>
        /// The fully qualified name of the database.
        /// </summary>
        public readonly string? FutureSchemasInDatabase;
        /// <summary>
        /// The fully qualified name of the schema.
        /// </summary>
        public readonly string? SchemaName;

        [OutputConstructor]
        private GrantPrivilegesToDatabaseRoleOnSchema(
            string? allSchemasInDatabase,

            string? futureSchemasInDatabase,

            string? schemaName)
        {
            AllSchemasInDatabase = allSchemasInDatabase;
            FutureSchemasInDatabase = futureSchemasInDatabase;
            SchemaName = schemaName;
        }
    }
}
