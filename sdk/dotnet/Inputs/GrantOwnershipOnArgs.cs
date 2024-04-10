// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GrantOwnershipOnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures the privilege to be granted on all objects in either a database or schema.
        /// </summary>
        [Input("all")]
        public Input<Inputs.GrantOwnershipOnAllArgs>? All { get; set; }

        /// <summary>
        /// Configures the privilege to be granted on all objects in either a database or schema.
        /// </summary>
        [Input("future")]
        public Input<Inputs.GrantOwnershipOnFutureArgs>? Future { get; set; }

        /// <summary>
        /// Specifies the identifier for the object on which you are transferring ownership.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        /// <summary>
        /// Specifies the type of object on which you are transferring ownership. Available values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | COMPUTE POOL | DATABASE | DATABASE ROLE | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | EXTERNAL VOLUME | FAILOVER GROUP | FILE FORMAT | FUNCTION | HYBRID TABLE | ICEBERG TABLE | IMAGE REPOSITORY | INTEGRATION | MATERIALIZED VIEW | NETWORK POLICY | NETWORK RULE | PACKAGES POLICY | PIPE | PROCEDURE | MASKING POLICY | PASSWORD POLICY | PROJECTION POLICY | REPLICATION GROUP | ROLE | ROW ACCESS POLICY | SCHEMA | SESSION POLICY | SECRET | SEQUENCE | STAGE | STREAM | TABLE | TAG | TASK | USER | VIEW | WAREHOUSE
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        public GrantOwnershipOnArgs()
        {
        }
        public static new GrantOwnershipOnArgs Empty => new GrantOwnershipOnArgs();
    }
}
