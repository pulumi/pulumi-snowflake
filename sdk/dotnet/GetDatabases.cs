// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetDatabases
    {
        /// <summary>
        /// Data source used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `starts_with`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
        /// </summary>
        public static Task<GetDatabasesResult> InvokeAsync(GetDatabasesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabasesResult>("snowflake:index/getDatabases:getDatabases", args ?? new GetDatabasesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `starts_with`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
        /// </summary>
        public static Output<GetDatabasesResult> Invoke(GetDatabasesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabasesResult>("snowflake:index/getDatabases:getDatabases", args ?? new GetDatabasesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `starts_with`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.
        /// </summary>
        public static Output<GetDatabasesResult> Invoke(GetDatabasesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabasesResult>("snowflake:index/getDatabases:getDatabases", args ?? new GetDatabasesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabasesArgs : global::Pulumi.InvokeArgs
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
        public Inputs.GetDatabasesLimitArgs? Limit { get; set; }

        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        [Input("startsWith")]
        public string? StartsWith { get; set; }

        /// <summary>
        /// (Default: `true`) Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public bool? WithDescribe { get; set; }

        /// <summary>
        /// (Default: `true`) Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        [Input("withParameters")]
        public bool? WithParameters { get; set; }

        public GetDatabasesArgs()
        {
        }
        public static new GetDatabasesArgs Empty => new GetDatabasesArgs();
    }

    public sealed class GetDatabasesInvokeArgs : global::Pulumi.InvokeArgs
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
        public Input<Inputs.GetDatabasesLimitInputArgs>? Limit { get; set; }

        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        [Input("startsWith")]
        public Input<string>? StartsWith { get; set; }

        /// <summary>
        /// (Default: `true`) Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        [Input("withDescribe")]
        public Input<bool>? WithDescribe { get; set; }

        /// <summary>
        /// (Default: `true`) Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        [Input("withParameters")]
        public Input<bool>? WithParameters { get; set; }

        public GetDatabasesInvokeArgs()
        {
        }
        public static new GetDatabasesInvokeArgs Empty => new GetDatabasesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabasesResult
    {
        /// <summary>
        /// Holds the aggregated output of all database details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabasesDatabaseResult> Databases;
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
        public readonly Outputs.GetDatabasesLimitResult? Limit;
        /// <summary>
        /// Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        /// </summary>
        public readonly string? StartsWith;
        /// <summary>
        /// (Default: `true`) Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
        /// </summary>
        public readonly bool? WithDescribe;
        /// <summary>
        /// (Default: `true`) Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        /// </summary>
        public readonly bool? WithParameters;

        [OutputConstructor]
        private GetDatabasesResult(
            ImmutableArray<Outputs.GetDatabasesDatabaseResult> databases,

            string id,

            string? like,

            Outputs.GetDatabasesLimitResult? limit,

            string? startsWith,

            bool? withDescribe,

            bool? withParameters)
        {
            Databases = databases;
            Id = id;
            Like = like;
            Limit = limit;
            StartsWith = startsWith;
            WithDescribe = withDescribe;
            WithParameters = withParameters;
        }
    }
}
