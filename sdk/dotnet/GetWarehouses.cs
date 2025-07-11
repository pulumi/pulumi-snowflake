// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetWarehouses
    {
        /// <summary>
        /// Data source used to get details of filtered warehouses. Filtering is aligned with the current possibilities for [SHOW WAREHOUSES](https://docs.snowflake.com/en/sql-reference/sql/show-warehouses) query (only `like` is supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
        /// </summary>
        public static Task<GetWarehousesResult> InvokeAsync(GetWarehousesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWarehousesResult>("snowflake:index/getWarehouses:getWarehouses", args ?? new GetWarehousesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered warehouses. Filtering is aligned with the current possibilities for [SHOW WAREHOUSES](https://docs.snowflake.com/en/sql-reference/sql/show-warehouses) query (only `like` is supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
        /// </summary>
        public static Output<GetWarehousesResult> Invoke(GetWarehousesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWarehousesResult>("snowflake:index/getWarehouses:getWarehouses", args ?? new GetWarehousesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered warehouses. Filtering is aligned with the current possibilities for [SHOW WAREHOUSES](https://docs.snowflake.com/en/sql-reference/sql/show-warehouses) query (only `like` is supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
        /// </summary>
        public static Output<GetWarehousesResult> Invoke(GetWarehousesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWarehousesResult>("snowflake:index/getWarehouses:getWarehouses", args ?? new GetWarehousesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWarehousesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        /// <summary>
        /// (Default: `true`) Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        /// <summary>
        /// (Default: `true`) Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        [Input("withParameters")]
        public bool? WithParameters { get; set; }

        public GetWarehousesArgs()
        {
        }
        public static new GetWarehousesArgs Empty => new GetWarehousesArgs();
    }

    public sealed class GetWarehousesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        /// <summary>
        /// (Default: `true`) Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        /// <summary>
        /// (Default: `true`) Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        [Input("withParameters")]
        public Input<bool>? WithParameters { get; set; }

        public GetWarehousesInvokeArgs()
        {
        }
        public static new GetWarehousesInvokeArgs Empty => new GetWarehousesInvokeArgs();
    }


    [OutputType]
    public sealed class GetWarehousesResult
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
        /// Holds the aggregated output of all warehouse details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWarehousesWarehouseResult> Warehouses;
        /// <summary>
        /// (Default: `true`) Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;
        /// <summary>
        /// (Default: `true`) Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        public readonly bool? WithParameters;

        [OutputConstructor]
        private GetWarehousesResult(
            string id,

            string? like,

            ImmutableArray<Outputs.GetWarehousesWarehouseResult> warehouses,

            bool? withDescribe,

            bool? withParameters)
        {
            Id = id;
            Like = like;
            Warehouses = warehouses;
            WithDescribe = withDescribe;
            WithParameters = withParameters;
        }
    }
}
