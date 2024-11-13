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
    public sealed class StreamOnTableShowOutput
    {
        public readonly ImmutableArray<string> BaseTables;
        public readonly string? Comment;
        public readonly string? CreatedOn;
        public readonly string? DatabaseName;
        public readonly string? InvalidReason;
        public readonly string? Mode;
        public readonly string? Name;
        public readonly string? Owner;
        public readonly string? OwnerRoleType;
        public readonly string? SchemaName;
        public readonly string? SourceType;
        public readonly bool? Stale;
        public readonly string? StaleAfter;
        public readonly string? TableName;
        public readonly string? Type;

        [OutputConstructor]
        private StreamOnTableShowOutput(
            ImmutableArray<string> baseTables,

            string? comment,

            string? createdOn,

            string? databaseName,

            string? invalidReason,

            string? mode,

            string? name,

            string? owner,

            string? ownerRoleType,

            string? schemaName,

            string? sourceType,

            bool? stale,

            string? staleAfter,

            string? tableName,

            string? type)
        {
            BaseTables = baseTables;
            Comment = comment;
            CreatedOn = createdOn;
            DatabaseName = databaseName;
            InvalidReason = invalidReason;
            Mode = mode;
            Name = name;
            Owner = owner;
            OwnerRoleType = ownerRoleType;
            SchemaName = schemaName;
            SourceType = sourceType;
            Stale = stale;
            StaleAfter = staleAfter;
            TableName = tableName;
            Type = type;
        }
    }
}
