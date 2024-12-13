// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetMaskingPolicies
    {
        /// <summary>
        /// Data source used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `masking_policies`.
        /// </summary>
        public static Task<GetMaskingPoliciesResult> InvokeAsync(GetMaskingPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMaskingPoliciesResult>("snowflake:index/getMaskingPolicies:getMaskingPolicies", args ?? new GetMaskingPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `masking_policies`.
        /// </summary>
        public static Output<GetMaskingPoliciesResult> Invoke(GetMaskingPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaskingPoliciesResult>("snowflake:index/getMaskingPolicies:getMaskingPolicies", args ?? new GetMaskingPoliciesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `masking_policies`.
        /// </summary>
        public static Output<GetMaskingPoliciesResult> Invoke(GetMaskingPoliciesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaskingPoliciesResult>("snowflake:index/getMaskingPolicies:getMaskingPolicies", args ?? new GetMaskingPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMaskingPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of masking policies
        /// </summary>
        [Input("in")]
        public Inputs.GetMaskingPoliciesInArgs? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Inputs.GetMaskingPoliciesLimitArgs? Limit { get; set; }

        /// <summary>
        /// Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        public GetMaskingPoliciesArgs()
        {
        }
        public static new GetMaskingPoliciesArgs Empty => new GetMaskingPoliciesArgs();
    }

    public sealed class GetMaskingPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of masking policies
        /// </summary>
        [Input("in")]
        public Input<Inputs.GetMaskingPoliciesInInputArgs>? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Input<Inputs.GetMaskingPoliciesLimitInputArgs>? Limit { get; set; }

        /// <summary>
        /// Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        public GetMaskingPoliciesInvokeArgs()
        {
        }
        public static new GetMaskingPoliciesInvokeArgs Empty => new GetMaskingPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetMaskingPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IN clause to filter the list of masking policies
        /// </summary>
        public readonly Outputs.GetMaskingPoliciesInResult? In;
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        public readonly string? Like;
        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        public readonly Outputs.GetMaskingPoliciesLimitResult? Limit;
        /// <summary>
        /// Holds the aggregated output of all views details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMaskingPoliciesMaskingPolicyResult> MaskingPolicies;
        /// <summary>
        /// Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;

        [OutputConstructor]
        private GetMaskingPoliciesResult(
            string id,

            Outputs.GetMaskingPoliciesInResult? @in,

            string? like,

            Outputs.GetMaskingPoliciesLimitResult? limit,

            ImmutableArray<Outputs.GetMaskingPoliciesMaskingPolicyResult> maskingPolicies,

            bool? withDescribe)
        {
            Id = id;
            In = @in;
            Like = like;
            Limit = limit;
            MaskingPolicies = maskingPolicies;
            WithDescribe = withDescribe;
        }
    }
}
