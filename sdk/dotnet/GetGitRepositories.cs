// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetGitRepositories
    {
        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// Data source used to get details of filtered git repositories. Filtering is aligned with the current possibilities for [SHOW GIT REPOSITORIES](https://docs.snowflake.com/en/sql-reference/sql/show-git-repositories) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `git_repositories`.
        /// </summary>
        public static Task<GetGitRepositoriesResult> InvokeAsync(GetGitRepositoriesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitRepositoriesResult>("snowflake:index/getGitRepositories:getGitRepositories", args ?? new GetGitRepositoriesArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// Data source used to get details of filtered git repositories. Filtering is aligned with the current possibilities for [SHOW GIT REPOSITORIES](https://docs.snowflake.com/en/sql-reference/sql/show-git-repositories) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `git_repositories`.
        /// </summary>
        public static Output<GetGitRepositoriesResult> Invoke(GetGitRepositoriesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitRepositoriesResult>("snowflake:index/getGitRepositories:getGitRepositories", args ?? new GetGitRepositoriesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// Data source used to get details of filtered git repositories. Filtering is aligned with the current possibilities for [SHOW GIT REPOSITORIES](https://docs.snowflake.com/en/sql-reference/sql/show-git-repositories) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `git_repositories`.
        /// </summary>
        public static Output<GetGitRepositoriesResult> Invoke(GetGitRepositoriesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitRepositoriesResult>("snowflake:index/getGitRepositories:getGitRepositories", args ?? new GetGitRepositoriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitRepositoriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of objects
        /// </summary>
        [Input("in")]
        public Inputs.GetGitRepositoriesInArgs? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Inputs.GetGitRepositoriesLimitArgs? Limit { get; set; }

        /// <summary>
        /// (Default: `true`) Runs DESC GIT REPOSITORY for each git repository returned by SHOW GIT REPOSITORIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        public GetGitRepositoriesArgs()
        {
        }
        public static new GetGitRepositoriesArgs Empty => new GetGitRepositoriesArgs();
    }

    public sealed class GetGitRepositoriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// IN clause to filter the list of objects
        /// </summary>
        [Input("in")]
        public Input<Inputs.GetGitRepositoriesInInputArgs>? In { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        [Input("limit")]
        public Input<Inputs.GetGitRepositoriesLimitInputArgs>? Limit { get; set; }

        /// <summary>
        /// (Default: `true`) Runs DESC GIT REPOSITORY for each git repository returned by SHOW GIT REPOSITORIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        public GetGitRepositoriesInvokeArgs()
        {
        }
        public static new GetGitRepositoriesInvokeArgs Empty => new GetGitRepositoriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitRepositoriesResult
    {
        /// <summary>
        /// Holds the aggregated output of all git repositories details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitRepositoriesGitRepositoryResult> GitRepositories;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IN clause to filter the list of objects
        /// </summary>
        public readonly Outputs.GetGitRepositoriesInResult? In;
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        public readonly string? Like;
        /// <summary>
        /// Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        /// </summary>
        public readonly Outputs.GetGitRepositoriesLimitResult? Limit;
        /// <summary>
        /// (Default: `true`) Runs DESC GIT REPOSITORY for each git repository returned by SHOW GIT REPOSITORIES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;

        [OutputConstructor]
        private GetGitRepositoriesResult(
            ImmutableArray<Outputs.GetGitRepositoriesGitRepositoryResult> gitRepositories,

            string id,

            Outputs.GetGitRepositoriesInResult? @in,

            string? like,

            Outputs.GetGitRepositoriesLimitResult? limit,

            bool? withDescribe)
        {
            GitRepositories = gitRepositories;
            Id = id;
            In = @in;
            Like = like;
            Limit = limit;
            WithDescribe = withDescribe;
        }
    }
}
