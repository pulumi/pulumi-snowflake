// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetAccountRoles
    {
        /// <summary>
        /// Data source used to get details of filtered account roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `in_class` are all supported). The results of SHOW are encapsulated in one output collection.
        /// </summary>
        public static Task<GetAccountRolesResult> InvokeAsync(GetAccountRolesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountRolesResult>("snowflake:index/getAccountRoles:getAccountRoles", args ?? new GetAccountRolesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered account roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `in_class` are all supported). The results of SHOW are encapsulated in one output collection.
        /// </summary>
        public static Output<GetAccountRolesResult> Invoke(GetAccountRolesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountRolesResult>("snowflake:index/getAccountRoles:getAccountRoles", args ?? new GetAccountRolesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source used to get details of filtered account roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `in_class` are all supported). The results of SHOW are encapsulated in one output collection.
        /// </summary>
        public static Output<GetAccountRolesResult> Invoke(GetAccountRolesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountRolesResult>("snowflake:index/getAccountRoles:getAccountRoles", args ?? new GetAccountRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountRolesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the SHOW GRANTS output by class name.
        /// </summary>
        [Input("inClass")]
        public string? InClass { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public string? Like { get; set; }

        public GetAccountRolesArgs()
        {
        }
        public static new GetAccountRolesArgs Empty => new GetAccountRolesArgs();
    }

    public sealed class GetAccountRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the SHOW GRANTS output by class name.
        /// </summary>
        [Input("inClass")]
        public Input<string>? InClass { get; set; }

        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        [Input("like")]
        public Input<string>? Like { get; set; }

        public GetAccountRolesInvokeArgs()
        {
        }
        public static new GetAccountRolesInvokeArgs Empty => new GetAccountRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountRolesResult
    {
        /// <summary>
        /// Holds the aggregated output of all account role details queries.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountRolesAccountRoleResult> AccountRoles;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filters the SHOW GRANTS output by class name.
        /// </summary>
        public readonly string? InClass;
        /// <summary>
        /// Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        /// </summary>
        public readonly string? Like;

        [OutputConstructor]
        private GetAccountRolesResult(
            ImmutableArray<Outputs.GetAccountRolesAccountRoleResult> accountRoles,

            string id,

            string? inClass,

            string? like)
        {
            AccountRoles = accountRoles;
            Id = id;
            InClass = inClass;
            Like = like;
        }
    }
}
