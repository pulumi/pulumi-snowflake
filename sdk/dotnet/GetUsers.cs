// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetUsers
    {
        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered users. Filtering is aligned with the current possibilities for [SHOW USERS](https://docs.snowflake.com/en/sql-reference/sql/show-users) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection. Important note is that when querying users you don't have permissions to, the querying options are limited. You won't get almost any field in `show_output` (only empty or default values), the DESCRIBE command cannot be called, so you have to set `with_describe = false`. Only `parameters` output is not affected by the lack of privileges.
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(GetUsersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("snowflake:index/getUsers:getUsers", args ?? new GetUsersArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered users. Filtering is aligned with the current possibilities for [SHOW USERS](https://docs.snowflake.com/en/sql-reference/sql/show-users) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection. Important note is that when querying users you don't have permissions to, the querying options are limited. You won't get almost any field in `show_output` (only empty or default values), the DESCRIBE command cannot be called, so you have to set `with_describe = false`. Only `parameters` output is not affected by the lack of privileges.
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersResult>("snowflake:index/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.
        /// 
        /// Datasource used to get details of filtered users. Filtering is aligned with the current possibilities for [SHOW USERS](https://docs.snowflake.com/en/sql-reference/sql/show-users) query. The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection. Important note is that when querying users you don't have permissions to, the querying options are limited. You won't get almost any field in `show_output` (only empty or default values), the DESCRIBE command cannot be called, so you have to set `with_describe = false`. Only `parameters` output is not affected by the lack of privileges.
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersResult>("snowflake:index/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Inputs.GetUsersLimitArgs? Limit { get; set; }

        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        [Input("startsWith")]
        public string? StartsWith { get; set; }

        /// <summary>
        /// Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        /// <summary>
        /// Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        [Input("withParameters")]
        public bool? WithParameters { get; set; }

        public GetUsersArgs()
        {
        }
        public static new GetUsersArgs Empty => new GetUsersArgs();
    }

    public sealed class GetUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Input<Inputs.GetUsersLimitInputArgs>? Limit { get; set; }

        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        [Input("startsWith")]
        public Input<string>? StartsWith { get; set; }

        /// <summary>
        /// Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        /// <summary>
        /// Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        [Input("withParameters")]
        public Input<bool>? WithParameters { get; set; }

        public GetUsersInvokeArgs()
        {
        }
        public static new GetUsersInvokeArgs Empty => new GetUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetUsersResult
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
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        public readonly Outputs.GetUsersLimitResult? Limit;
        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        public readonly string? StartsWith;
        /// <summary>
        /// Holds the aggregated output of all user details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserResult> Users;
        /// <summary>
        /// Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;
        /// <summary>
        /// Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        public readonly bool? WithParameters;

        [OutputConstructor]
        private GetUsersResult(
            string id,

            string? like,

            Outputs.GetUsersLimitResult? limit,

            string? startsWith,

            ImmutableArray<Outputs.GetUsersUserResult> users,

            bool? withDescribe,

            bool? withParameters)
        {
            Id = id;
            Like = like;
            Limit = limit;
            StartsWith = startsWith;
            Users = users;
            WithDescribe = withDescribe;
            WithParameters = withParameters;
        }
    }
}
