// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetStreams
    {
        /// <summary>
        /// Data source used to get details of filtered streams. Filtering is aligned with the current possibilities for [SHOW STREAMS](https://docs.snowflake.com/en/sql-reference/sql/show-streams) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `streams`.
        /// </summary>
        public static Task<GetStreamsResult> InvokeAsync(GetStreamsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStreamsResult>("snowflake:index/getStreams:getStreams", args ?? new GetStreamsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered streams. Filtering is aligned with the current possibilities for [SHOW STREAMS](https://docs.snowflake.com/en/sql-reference/sql/show-streams) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `streams`.
        /// </summary>
        public static Output<GetStreamsResult> Invoke(GetStreamsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStreamsResult>("snowflake:index/getStreams:getStreams", args ?? new GetStreamsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered streams. Filtering is aligned with the current possibilities for [SHOW STREAMS](https://docs.snowflake.com/en/sql-reference/sql/show-streams) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `streams`.
        /// </summary>
        public static Output<GetStreamsResult> Invoke(GetStreamsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetStreamsResult>("snowflake:index/getStreams:getStreams", args ?? new GetStreamsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStreamsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of objects
        /// </summary>
        [Input("in")]
        public Inputs.GetStreamsInArgs? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Inputs.GetStreamsLimitArgs? Limit { get; set; }

        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        [Input("startsWith")]
        public string? StartsWith { get; set; }

        /// <summary>
        /// Runs DESC STREAM for each user returned by SHOW STREAMS. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        public GetStreamsArgs()
        {
        }
        public static new GetStreamsArgs Empty => new GetStreamsArgs();
    }

    public sealed class GetStreamsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of objects
        /// </summary>
        [Input("in")]
        public Input<Inputs.GetStreamsInInputArgs>? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Input<Inputs.GetStreamsLimitInputArgs>? Limit { get; set; }

        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        [Input("startsWith")]
        public Input<string>? StartsWith { get; set; }

        /// <summary>
        /// Runs DESC STREAM for each user returned by SHOW STREAMS. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        public GetStreamsInvokeArgs()
        {
        }
        public static new GetStreamsInvokeArgs Empty => new GetStreamsInvokeArgs();
    }


    [OutputType]
    public sealed class GetStreamsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IN clause to filter the list of objects
        /// </summary>
        public readonly Outputs.GetStreamsInResult? In;
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        public readonly string? Like;
        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        public readonly Outputs.GetStreamsLimitResult? Limit;
        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        public readonly string? StartsWith;
        /// <summary>
        /// Holds the aggregated output of all streams details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStreamsStreamResult> Streams;
        /// <summary>
        /// Runs DESC STREAM for each user returned by SHOW STREAMS. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;

        [OutputConstructor]
        private GetStreamsResult(
            string id,

            Outputs.GetStreamsInResult? @in,

            string? like,

            Outputs.GetStreamsLimitResult? limit,

            string? startsWith,

            ImmutableArray<Outputs.GetStreamsStreamResult> streams,

            bool? withDescribe)
        {
            Id = id;
            In = @in;
            Like = like;
            Limit = limit;
            StartsWith = startsWith;
            Streams = streams;
            WithDescribe = withDescribe;
        }
    }
}
