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
    public sealed class TableConstraintForeignKeyProperties
    {
        /// <summary>
        /// The match type for the foreign key. Not applicable for primary/unique keys
        /// </summary>
        public readonly string? Match;
        /// <summary>
        /// Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
        /// </summary>
        public readonly string? OnDelete;
        /// <summary>
        /// Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
        /// </summary>
        public readonly string? OnUpdate;
        /// <summary>
        /// The table and columns that the foreign key references. Not applicable for primary/unique keys
        /// </summary>
        public readonly Outputs.TableConstraintForeignKeyPropertiesReferences? References;

        [OutputConstructor]
        private TableConstraintForeignKeyProperties(
            string? match,

            string? onDelete,

            string? onUpdate,

            Outputs.TableConstraintForeignKeyPropertiesReferences? references)
        {
            Match = match;
            OnDelete = onDelete;
            OnUpdate = onUpdate;
            References = references;
        }
    }
}
