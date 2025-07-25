// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantPrivilegesToDatabaseRoleOnSchemaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the database.
        /// </summary>
        [Input("allSchemasInDatabase")]
        public Input<string>? AllSchemasInDatabase { get; set; }

        /// <summary>
        /// The fully qualified name of the database.
        /// </summary>
        [Input("futureSchemasInDatabase")]
        public Input<string>? FutureSchemasInDatabase { get; set; }

        /// <summary>
        /// The fully qualified name of the schema.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        public GrantPrivilegesToDatabaseRoleOnSchemaArgs()
        {
        }
        public static new GrantPrivilegesToDatabaseRoleOnSchemaArgs Empty => new GrantPrivilegesToDatabaseRoleOnSchemaArgs();
    }
}
