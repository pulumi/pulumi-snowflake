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
    public sealed class GetExternalFunctionsExternalFunctionResult
    {
        public readonly string Comment;
        public readonly string Database;
        public readonly string Language;
        public readonly string Name;
        public readonly string Schema;

        [OutputConstructor]
        private GetExternalFunctionsExternalFunctionResult(
            string comment,

            string database,

            string language,

            string name,

            string schema)
        {
            Comment = comment;
            Database = database;
            Language = language;
            Name = name;
            Schema = schema;
        }
    }
}
