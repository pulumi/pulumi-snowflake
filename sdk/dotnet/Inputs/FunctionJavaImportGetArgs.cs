// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class FunctionJavaImportGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path for import on stage, without the leading `/`.
        /// </summary>
        [Input("pathOnStage", required: true)]
        public Input<string> PathOnStage { get; set; } = null!;

        [Input("stageLocation", required: true)]
        public Input<string> StageLocation { get; set; } = null!;

        public FunctionJavaImportGetArgs()
        {
        }
        public static new FunctionJavaImportGetArgs Empty => new FunctionJavaImportGetArgs();
    }
}
