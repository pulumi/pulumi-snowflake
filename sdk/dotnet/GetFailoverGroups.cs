// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetFailoverGroups
    {
        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Task<GetFailoverGroupsResult> InvokeAsync(GetFailoverGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFailoverGroupsResult>("snowflake:index/getFailoverGroups:getFailoverGroups", args ?? new GetFailoverGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Output<GetFailoverGroupsResult> Invoke(GetFailoverGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFailoverGroupsResult>("snowflake:index/getFailoverGroups:getFailoverGroups", args ?? new GetFailoverGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Output<GetFailoverGroupsResult> Invoke(GetFailoverGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFailoverGroupsResult>("snowflake:index/getFailoverGroups:getFailoverGroups", args ?? new GetFailoverGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFailoverGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the identifier for the account
        /// </summary>
        [Input("inAccount")]
        public string? InAccount { get; set; }

        public GetFailoverGroupsArgs()
        {
        }
        public static new GetFailoverGroupsArgs Empty => new GetFailoverGroupsArgs();
    }

    public sealed class GetFailoverGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the identifier for the account
        /// </summary>
        [Input("inAccount")]
        public Input<string>? InAccount { get; set; }

        public GetFailoverGroupsInvokeArgs()
        {
        }
        public static new GetFailoverGroupsInvokeArgs Empty => new GetFailoverGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFailoverGroupsResult
    {
        /// <summary>
        /// List of all the failover groups available in the system.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFailoverGroupsFailoverGroupResult> FailoverGroups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specifies the identifier for the account
        /// </summary>
        public readonly string? InAccount;

        [OutputConstructor]
        private GetFailoverGroupsResult(
            ImmutableArray<Outputs.GetFailoverGroupsFailoverGroupResult> failoverGroups,

            string id,

            string? inAccount)
        {
            FailoverGroups = failoverGroups;
            Id = id;
            InAccount = inAccount;
        }
    }
}
