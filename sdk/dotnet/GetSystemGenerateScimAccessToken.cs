// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetSystemGenerateScimAccessToken
    {
        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var scim = Snowflake.GetSystemGenerateScimAccessToken.Invoke(new()
        ///     {
        ///         IntegrationName = "AAD_PROVISIONING",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Task<GetSystemGenerateScimAccessTokenResult> InvokeAsync(GetSystemGenerateScimAccessTokenArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSystemGenerateScimAccessTokenResult>("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", args ?? new GetSystemGenerateScimAccessTokenArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var scim = Snowflake.GetSystemGenerateScimAccessToken.Invoke(new()
        ///     {
        ///         IntegrationName = "AAD_PROVISIONING",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Output<GetSystemGenerateScimAccessTokenResult> Invoke(GetSystemGenerateScimAccessTokenInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemGenerateScimAccessTokenResult>("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", args ?? new GetSystemGenerateScimAccessTokenInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var scim = Snowflake.GetSystemGenerateScimAccessToken.Invoke(new()
        ///     {
        ///         IntegrationName = "AAD_PROVISIONING",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
        /// </summary>
        public static Output<GetSystemGenerateScimAccessTokenResult> Invoke(GetSystemGenerateScimAccessTokenInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemGenerateScimAccessTokenResult>("snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken", args ?? new GetSystemGenerateScimAccessTokenInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSystemGenerateScimAccessTokenArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// SCIM Integration Name
        /// </summary>
        [Input("integrationName", required: true)]
        public string IntegrationName { get; set; } = null!;

        public GetSystemGenerateScimAccessTokenArgs()
        {
        }
        public static new GetSystemGenerateScimAccessTokenArgs Empty => new GetSystemGenerateScimAccessTokenArgs();
    }

    public sealed class GetSystemGenerateScimAccessTokenInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// SCIM Integration Name
        /// </summary>
        [Input("integrationName", required: true)]
        public Input<string> IntegrationName { get; set; } = null!;

        public GetSystemGenerateScimAccessTokenInvokeArgs()
        {
        }
        public static new GetSystemGenerateScimAccessTokenInvokeArgs Empty => new GetSystemGenerateScimAccessTokenInvokeArgs();
    }


    [OutputType]
    public sealed class GetSystemGenerateScimAccessTokenResult
    {
        /// <summary>
        /// SCIM Access Token
        /// </summary>
        public readonly string AccessToken;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// SCIM Integration Name
        /// </summary>
        public readonly string IntegrationName;

        [OutputConstructor]
        private GetSystemGenerateScimAccessTokenResult(
            string accessToken,

            string id,

            string integrationName)
        {
            AccessToken = accessToken;
            Id = id;
            IntegrationName = integrationName;
        }
    }
}
