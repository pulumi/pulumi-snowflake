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
    public sealed class GrantPrivilegesToDatabaseRoleOnSchemaObject
    {
        /// <summary>
        /// Configures the privilege to be granted on all objects in either a database or schema.
        /// </summary>
        public readonly Outputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectAll? All;
        /// <summary>
        /// Configures the privilege to be granted on future objects in either a database or schema.
        /// </summary>
        public readonly Outputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectFuture? Future;
        /// <summary>
        /// The fully qualified name of the object on which privileges will be granted.
        /// </summary>
        public readonly string? ObjectName;
        /// <summary>
        /// The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT
        /// </summary>
        public readonly string? ObjectType;

        [OutputConstructor]
        private GrantPrivilegesToDatabaseRoleOnSchemaObject(
            Outputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectAll? all,

            Outputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectFuture? future,

            string? objectName,

            string? objectType)
        {
            All = all;
            Future = future;
            ObjectName = objectName;
            ObjectType = objectType;
        }
    }
}
