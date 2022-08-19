// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ExternalTableColumnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String that specifies the expression for the column. When queried, the column returns results derived from this expression.
        /// </summary>
        [Input("as", required: true)]
        public Input<string> As { get; set; } = null!;

        /// <summary>
        /// Column name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Column type, e.g. VARIANT
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ExternalTableColumnArgs()
        {
        }
        public static new ExternalTableColumnArgs Empty => new ExternalTableColumnArgs();
    }
}
