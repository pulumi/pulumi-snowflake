// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetShares
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Snowflake.GetShares.Invoke();
        /// 
        ///     var ad = Snowflake.GetShares.Invoke(new()
        ///     {
        ///         Pattern = "usage",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSharesResult> InvokeAsync(GetSharesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSharesResult>("snowflake:index/getShares:getShares", args ?? new GetSharesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Snowflake.GetShares.Invoke();
        /// 
        ///     var ad = Snowflake.GetShares.Invoke(new()
        ///     {
        ///         Pattern = "usage",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSharesResult> Invoke(GetSharesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSharesResult>("snowflake:index/getShares:getShares", args ?? new GetSharesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSharesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the command output by object name.
        /// </summary>
        [Input("pattern")]
        public string? Pattern { get; set; }

        public GetSharesArgs()
        {
        }
        public static new GetSharesArgs Empty => new GetSharesArgs();
    }

    public sealed class GetSharesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the command output by object name.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        public GetSharesInvokeArgs()
        {
        }
        public static new GetSharesInvokeArgs Empty => new GetSharesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSharesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filters the command output by object name.
        /// </summary>
        public readonly string? Pattern;
        /// <summary>
        /// List of all the shares available in the system.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSharesShareResult> Shares;

        [OutputConstructor]
        private GetSharesResult(
            string id,

            string? pattern,

            ImmutableArray<Outputs.GetSharesShareResult> shares)
        {
            Id = id;
            Pattern = pattern;
            Shares = shares;
        }
    }
}
