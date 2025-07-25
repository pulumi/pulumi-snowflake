// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantPrivilegesToDatabaseRoleOnSchemaObjectGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures the privilege to be granted on all objects in either a database or schema.
        /// </summary>
        [Input("all")]
        public Input<Inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectAllGetArgs>? All { get; set; }

        /// <summary>
        /// Configures the privilege to be granted on future objects in either a database or schema.
        /// </summary>
        [Input("future")]
        public Input<Inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectFutureGetArgs>? Future { get; set; }

        /// <summary>
        /// The fully qualified name of the object on which privileges will be granted.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        /// <summary>
        /// The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | CORTEX SEARCH SERVICE | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | NOTEBOOK | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | SNAPSHOT | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT | DATASET
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        public GrantPrivilegesToDatabaseRoleOnSchemaObjectGetArgs()
        {
        }
        public static new GrantPrivilegesToDatabaseRoleOnSchemaObjectGetArgs Empty => new GrantPrivilegesToDatabaseRoleOnSchemaObjectGetArgs();
    }
}
