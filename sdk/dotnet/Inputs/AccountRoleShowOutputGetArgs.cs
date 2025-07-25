// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class AccountRoleShowOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("assignedToUsers")]
        public Input<int>? AssignedToUsers { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("grantedRoles")]
        public Input<int>? GrantedRoles { get; set; }

        [Input("grantedToRoles")]
        public Input<int>? GrantedToRoles { get; set; }

        [Input("isCurrent")]
        public Input<bool>? IsCurrent { get; set; }

        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        [Input("isInherited")]
        public Input<bool>? IsInherited { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        public AccountRoleShowOutputGetArgs()
        {
        }
        public static new AccountRoleShowOutputGetArgs Empty => new AccountRoleShowOutputGetArgs();
    }
}
