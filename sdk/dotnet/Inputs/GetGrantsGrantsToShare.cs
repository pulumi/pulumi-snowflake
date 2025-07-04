// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class GetGrantsGrantsToShareArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Lists all of the privileges and roles granted to the specified share.
        /// </summary>
        [Input("shareName", required: true)]
        public string ShareName { get; set; } = null!;

        public GetGrantsGrantsToShareArgs()
        {
        }
        public static new GetGrantsGrantsToShareArgs Empty => new GetGrantsGrantsToShareArgs();
    }
}
