// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetCurrentAccount
    {
        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Snowflake.GetCurrentAccount.Invoke();
        /// 
        ///     var snowflakeAccountUrl = new Aws.Index.SsmParameter("snowflake_account_url", new()
        ///     {
        ///         Name = "/snowflake/account_url",
        ///         Type = "String",
        ///         Value = @this.Apply(getCurrentAccountResult =&gt; getCurrentAccountResult.Url),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCurrentAccountResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCurrentAccountResult>("snowflake:index/getCurrentAccount:getCurrentAccount", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Snowflake.GetCurrentAccount.Invoke();
        /// 
        ///     var snowflakeAccountUrl = new Aws.Index.SsmParameter("snowflake_account_url", new()
        ///     {
        ///         Name = "/snowflake/account_url",
        ///         Type = "String",
        ///         Value = @this.Apply(getCurrentAccountResult =&gt; getCurrentAccountResult.Url),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCurrentAccountResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCurrentAccountResult>("snowflake:index/getCurrentAccount:getCurrentAccount", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Snowflake.GetCurrentAccount.Invoke();
        /// 
        ///     var snowflakeAccountUrl = new Aws.Index.SsmParameter("snowflake_account_url", new()
        ///     {
        ///         Name = "/snowflake/account_url",
        ///         Type = "String",
        ///         Value = @this.Apply(getCurrentAccountResult =&gt; getCurrentAccountResult.Url),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCurrentAccountResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCurrentAccountResult>("snowflake:index/getCurrentAccount:getCurrentAccount", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetCurrentAccountResult
    {
        /// <summary>
        /// The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
        /// </summary>
        public readonly string Account;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Snowflake Region; as returned by CURRENT_REGION()
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The Snowflake URL.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetCurrentAccountResult(
            string account,

            string id,

            string region,

            string url)
        {
            Account = account;
            Id = id;
            Region = region;
            Url = url;
        }
    }
}
