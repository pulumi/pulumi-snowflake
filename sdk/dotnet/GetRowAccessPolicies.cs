// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetRowAccessPolicies
    {
        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered row access policies. Filtering is aligned with the current possibilities for [SHOW ROW ACCESS POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-row-access-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `row_access_policies`.
        /// </summary>
        public static Task<GetRowAccessPoliciesResult> InvokeAsync(GetRowAccessPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRowAccessPoliciesResult>("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", args ?? new GetRowAccessPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered row access policies. Filtering is aligned with the current possibilities for [SHOW ROW ACCESS POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-row-access-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `row_access_policies`.
        /// </summary>
        public static Output<GetRowAccessPoliciesResult> Invoke(GetRowAccessPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRowAccessPoliciesResult>("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", args ?? new GetRowAccessPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRowAccessPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of row access policies
        /// </summary>
        [Input("in")]
        public Inputs.GetRowAccessPoliciesInArgs? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Inputs.GetRowAccessPoliciesLimitArgs? Limit { get; set; }

        /// <summary>
        /// Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        public GetRowAccessPoliciesArgs()
        {
        }
        public static new GetRowAccessPoliciesArgs Empty => new GetRowAccessPoliciesArgs();
    }

    public sealed class GetRowAccessPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of row access policies
        /// </summary>
        [Input("in")]
        public Input<Inputs.GetRowAccessPoliciesInInputArgs>? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Input<Inputs.GetRowAccessPoliciesLimitInputArgs>? Limit { get; set; }

        /// <summary>
        /// Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        public GetRowAccessPoliciesInvokeArgs()
        {
        }
        public static new GetRowAccessPoliciesInvokeArgs Empty => new GetRowAccessPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRowAccessPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IN clause to filter the list of row access policies
        /// </summary>
        public readonly Outputs.GetRowAccessPoliciesInResult? In;
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        public readonly string? Like;
        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        public readonly Outputs.GetRowAccessPoliciesLimitResult? Limit;
        /// <summary>
        /// Holds the aggregated output of all views details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRowAccessPoliciesRowAccessPolicyResult> RowAccessPolicies;
        /// <summary>
        /// Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;

        [OutputConstructor]
        private GetRowAccessPoliciesResult(
            string id,

            Outputs.GetRowAccessPoliciesInResult? @in,

            string? like,

            Outputs.GetRowAccessPoliciesLimitResult? limit,

            ImmutableArray<Outputs.GetRowAccessPoliciesRowAccessPolicyResult> rowAccessPolicies,

            bool? withDescribe)
        {
            Id = id;
            In = @in;
            Like = like;
            Limit = limit;
            RowAccessPolicies = rowAccessPolicies;
            WithDescribe = withDescribe;
        }
    }
}
