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
    public sealed class TableColumn
    {
        /// <summary>
        /// Column collation, e.g. utf8
        /// </summary>
        public readonly string? Collate;
        /// <summary>
        /// Column comment
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Defines the column default value; note due to limitations of Snowflake's ALTER TABLE ADD/MODIFY COLUMN updates to default will not be applied
        /// </summary>
        public readonly Outputs.TableColumnDefault? Default;
        /// <summary>
        /// Defines the identity start/step values for a column. **Note** Identity/default are mutually exclusive.
        /// </summary>
        public readonly Outputs.TableColumnIdentity? Identity;
        /// <summary>
        /// Masking policy to apply on column. It has to be a fully qualified name.
        /// </summary>
        public readonly string? MaskingPolicy;
        /// <summary>
        /// Column name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Whether this column can contain null values. **Note**: Depending on your Snowflake version, the default value will not suffice if this column is used in a primary key constraint.
        /// </summary>
        public readonly bool? Nullable;
        /// <summary>
        /// Record of schema evolution.
        /// </summary>
        public readonly string? SchemaEvolutionRecord;
        /// <summary>
        /// Column type, e.g. VARIANT
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private TableColumn(
            string? collate,

            string? comment,

            Outputs.TableColumnDefault? @default,

            Outputs.TableColumnIdentity? identity,

            string? maskingPolicy,

            string name,

            bool? nullable,

            string? schemaEvolutionRecord,

            string type)
        {
            Collate = collate;
            Comment = comment;
            Default = @default;
            Identity = identity;
            MaskingPolicy = maskingPolicy;
            Name = name;
            Nullable = nullable;
            SchemaEvolutionRecord = schemaEvolutionRecord;
            Type = type;
        }
    }
}
