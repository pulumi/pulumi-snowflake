// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class GetSchemasSchemaDescribeOutputResult
    {
        public readonly string CreatedOn;
        public readonly string Kind;
        public readonly string Name;

        [OutputConstructor]
        private GetSchemasSchemaDescribeOutputResult(
            string createdOn,

            string kind,

            string name)
        {
            CreatedOn = createdOn;
            Kind = kind;
            Name = name;
        }
    }
}
