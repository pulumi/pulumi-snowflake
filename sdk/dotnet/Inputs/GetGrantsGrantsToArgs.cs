// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GetGrantsGrantsToInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Lists all privileges and roles granted to the role
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Lists all the privileges granted to the share
        /// </summary>
        [Input("share")]
        public Input<string>? Share { get; set; }

        /// <summary>
        /// Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public GetGrantsGrantsToInputArgs()
        {
        }
        public static new GetGrantsGrantsToInputArgs Empty => new GetGrantsGrantsToInputArgs();
    }
}
