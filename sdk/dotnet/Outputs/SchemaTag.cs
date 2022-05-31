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
    public sealed class SchemaTag
    {
        public readonly string? Database;
        public readonly string Name;
        public readonly string? Schema;
        public readonly string Value;

        [OutputConstructor]
        private SchemaTag(
            string? database,

            string name,

            string? schema,

            string value)
        {
            Database = database;
            Name = name;
            Schema = schema;
            Value = value;
        }
    }
}
