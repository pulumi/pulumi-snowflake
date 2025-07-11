// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class TableColumnGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Default: ``) Column collation, e.g. utf8
        /// </summary>
        [Input("collate")]
        public Input<string>? Collate { get; set; }

        /// <summary>
        /// (Default: ``) Column comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Defines the column default value; note due to limitations of Snowflake's ALTER TABLE ADD/MODIFY COLUMN updates to default will not be applied
        /// </summary>
        [Input("default")]
        public Input<Inputs.TableColumnDefaultGetArgs>? Default { get; set; }

        /// <summary>
        /// Defines the identity start/step values for a column. **Note** Identity/default are mutually exclusive.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.TableColumnIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// (Default: ``) Masking policy to apply on column. It has to be a fully qualified name.
        /// </summary>
        [Input("maskingPolicy")]
        public Input<string>? MaskingPolicy { get; set; }

        /// <summary>
        /// Column name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (Default: `true`) Whether this column can contain null values. **Note**: Depending on your Snowflake version, the default value will not suffice if this column is used in a primary key constraint.
        /// </summary>
        [Input("nullable")]
        public Input<bool>? Nullable { get; set; }

        /// <summary>
        /// Record of schema evolution.
        /// </summary>
        [Input("schemaEvolutionRecord")]
        public Input<string>? SchemaEvolutionRecord { get; set; }

        /// <summary>
        /// Column type, e.g. VARIANT. For a full list of column types, see [Summary of Data Types](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public TableColumnGetArgs()
        {
        }
        public static new TableColumnGetArgs Empty => new TableColumnGetArgs();
    }
}
