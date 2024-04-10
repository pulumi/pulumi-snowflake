// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantOwnershipOnFutureGetArgs : global::Pulumi.ResourceArgs
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
        /// Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
        /// </summary>
        [Input("objectTypePlural", required: true)]
        public Input<string> ObjectTypePlural { get; set; } = null!;

        public GrantOwnershipOnFutureGetArgs()
        {
        }
        public static new GrantOwnershipOnFutureGetArgs Empty => new GrantOwnershipOnFutureGetArgs();
    }
}
