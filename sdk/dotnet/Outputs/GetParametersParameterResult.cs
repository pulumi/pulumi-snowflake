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
    public sealed class GetParametersParameterResult
    {
        public readonly string Default;
        public readonly string Description;
        public readonly string Key;
        public readonly string Level;
        public readonly string Type;
        public readonly string Value;

        [OutputConstructor]
        private GetParametersParameterResult(
            string @default,

            string description,

            string key,

            string level,

            string type,

            string value)
        {
            Default = @default;
            Description = description;
            Key = key;
            Level = level;
            Type = type;
            Value = value;
        }
    }
}
