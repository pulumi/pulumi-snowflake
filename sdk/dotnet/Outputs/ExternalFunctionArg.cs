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
    public sealed class ExternalFunctionArg
    {
        public readonly string Name;
        public readonly string Type;

        [OutputConstructor]
        private ExternalFunctionArg(
            string name,

            string type)
        {
            Name = name;
            Type = type;
        }
    }
}
