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
    public sealed class ProcedurePythonArgument
    {
        /// <summary>
        /// The argument type.
        /// </summary>
        public readonly string ArgDataType;
        public readonly string? ArgDefaultValue;
        /// <summary>
        /// The argument name. The provider wraps it in double quotes by default, so be aware of that while referencing the argument in the procedure definition.
        /// </summary>
        public readonly string ArgName;

        [OutputConstructor]
        private ProcedurePythonArgument(
            string argDataType,

            string? argDefaultValue,

            string argName)
        {
            ArgDataType = argDataType;
            ArgDefaultValue = argDefaultValue;
            ArgName = argName;
        }
    }
}
