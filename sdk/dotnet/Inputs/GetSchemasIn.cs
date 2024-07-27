// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GetSchemasInArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Returns records for the entire account.
        /// </summary>
        [Input("account")]
        public bool? Account { get; set; }

        /// <summary>
        /// Returns records for the specified application.
        /// </summary>
        [Input("application")]
        public string? Application { get; set; }

        /// <summary>
        /// Returns records for the specified application package.
        /// </summary>
        [Input("applicationPackage")]
        public string? ApplicationPackage { get; set; }

        /// <summary>
        /// Returns records for the current database in use or for a specified database (db_name).
        /// </summary>
        [Input("database")]
        public string? Database { get; set; }

        public GetSchemasInArgs()
        {
        }
        public static new GetSchemasInArgs Empty => new GetSchemasInArgs();
    }
}
