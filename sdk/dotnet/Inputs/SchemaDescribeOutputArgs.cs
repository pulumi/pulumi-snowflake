// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class SchemaDescribeOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public SchemaDescribeOutputArgs()
        {
        }
        public static new SchemaDescribeOutputArgs Empty => new SchemaDescribeOutputArgs();
    }
}
