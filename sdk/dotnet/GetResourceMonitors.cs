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
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered resource monitors. Filtering is aligned with the current possibilities for [SHOW RESOURCE MONITORS](https://docs.snowflake.com/en/sql-reference/sql/show-resource-monitors) query (`like` is supported). The results of SHOW is encapsulated in show_output collection.
        /// </summary>
        public static Task<GetResourceMonitorsResult> InvokeAsync(GetResourceMonitorsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetResourceMonitorsResult>("snowflake:index/getResourceMonitors:getResourceMonitors", args ?? new GetResourceMonitorsArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered resource monitors. Filtering is aligned with the current possibilities for [SHOW RESOURCE MONITORS](https://docs.snowflake.com/en/sql-reference/sql/show-resource-monitors) query (`like` is supported). The results of SHOW is encapsulated in show_output collection.
        /// </summary>
        public static Output<GetResourceMonitorsResult> Invoke(GetResourceMonitorsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetResourceMonitorsResult>("snowflake:index/getResourceMonitors:getResourceMonitors", args ?? new GetResourceMonitorsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResourceMonitorsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        public GetResourceMonitorsArgs()
        {
        }
        public static new GetResourceMonitorsArgs Empty => new GetResourceMonitorsArgs();
    }

    public sealed class GetResourceMonitorsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        public GetResourceMonitorsInvokeArgs()
        {
        }
        public static new GetResourceMonitorsInvokeArgs Empty => new GetResourceMonitorsInvokeArgs();
    }


    [OutputType]
    public sealed class GetResourceMonitorsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        public readonly string? Like;
        /// <summary>
        /// Holds the aggregated output of all resource monitor details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetResourceMonitorsResourceMonitorResult> ResourceMonitors;

        [OutputConstructor]
        private GetResourceMonitorsResult(
            string id,

            string? like,

            ImmutableArray<Outputs.GetResourceMonitorsResourceMonitorResult> resourceMonitors)
        {
            Id = id;
            Like = like;
            ResourceMonitors = resourceMonitors;
        }
    }
}
