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
    public sealed class GetRowAccessPoliciesRowAccessPolicyShowOutputResult
    {
        public readonly string Comment;
        public readonly string CreatedOn;
        public readonly string DatabaseName;
        public readonly string Kind;
        public readonly string Name;
        public readonly string Options;
        public readonly string Owner;
        public readonly string OwnerRoleType;
        public readonly string SchemaName;

        [OutputConstructor]
        private GetRowAccessPoliciesRowAccessPolicyShowOutputResult(
            string comment,

            string createdOn,

            string databaseName,

            string kind,

            string name,

            string options,

            string owner,

            string ownerRoleType,

            string schemaName)
        {
            Comment = comment;
            CreatedOn = createdOn;
            DatabaseName = databaseName;
            Kind = kind;
            Name = name;
            Options = options;
            Owner = owner;
            OwnerRoleType = ownerRoleType;
            SchemaName = schemaName;
        }
    }
}