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
    public sealed class GetDatabaseRolesDatabaseRoleResult
    {
        public readonly string Comment;
        public readonly string Name;
        public readonly string Owner;

        [OutputConstructor]
        private GetDatabaseRolesDatabaseRoleResult(
            string comment,

            string name,

            string owner)
        {
            Comment = comment;
            Name = name;
            Owner = owner;
        }
    }
}
