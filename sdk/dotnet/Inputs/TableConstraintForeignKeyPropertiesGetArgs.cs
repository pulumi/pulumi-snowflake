// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class TableConstraintForeignKeyPropertiesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The match type for the foreign key. Not applicable for primary/unique keys
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
        /// </summary>
        [Input("onDelete")]
        public Input<string>? OnDelete { get; set; }

        /// <summary>
        /// Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
        /// </summary>
        [Input("onUpdate")]
        public Input<string>? OnUpdate { get; set; }

        /// <summary>
        /// The table and columns that the foreign key references.
        /// </summary>
        [Input("references", required: true)]
        public Input<Inputs.TableConstraintForeignKeyPropertiesReferencesGetArgs> References { get; set; } = null!;

        public TableConstraintForeignKeyPropertiesGetArgs()
        {
        }
        public static new TableConstraintForeignKeyPropertiesGetArgs Empty => new TableConstraintForeignKeyPropertiesGetArgs();
    }
}
