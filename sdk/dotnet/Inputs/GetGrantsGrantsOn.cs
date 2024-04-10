// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GetGrantsGrantsOnArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
        /// </summary>
        [Input("account")]
        public bool? Account { get; set; }

        /// <summary>
        /// Name of object to list privileges on.
        /// </summary>
        [Input("objectName")]
        public string? ObjectName { get; set; }

        /// <summary>
        /// Type of object to list privileges on.
        /// </summary>
        [Input("objectType")]
        public string? ObjectType { get; set; }

        public GetGrantsGrantsOnArgs()
        {
        }
        public static new GetGrantsGrantsOnArgs Empty => new GetGrantsGrantsOnArgs();
    }
}
