// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetResourceMonitors
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var current = Output.Create(Snowflake.GetResourceMonitors.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetResourceMonitorsResult> InvokeAsync(InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetResourceMonitorsResult>("snowflake:index/getResourceMonitors:getResourceMonitors", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetResourceMonitorsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetResourceMonitorsResourceMonitorResult> ResourceMonitors;

        [OutputConstructor]
        private GetResourceMonitorsResult(
            string id,

            ImmutableArray<Outputs.GetResourceMonitorsResourceMonitorResult> resourceMonitors)
        {
            Id = id;
            ResourceMonitors = resourceMonitors;
        }
    }
}
