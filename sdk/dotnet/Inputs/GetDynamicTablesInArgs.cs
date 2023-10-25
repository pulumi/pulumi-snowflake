// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GetDynamicTablesInInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Returns records for the entire account.
        /// </summary>
        [Input("account")]
        public Input<bool>? Account { get; set; }

        /// <summary>
        /// Returns records for the current database in use or for a specified database (db_name).
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Returns records for the current schema in use or a specified schema (schema_name).
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public GetDynamicTablesInInputArgs()
        {
        }
        public static new GetDynamicTablesInInputArgs Empty => new GetDynamicTablesInInputArgs();
    }
}
