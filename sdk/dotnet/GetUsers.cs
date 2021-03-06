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
        ///         var current = Output.Create(Snowflake.GetUsers.InvokeAsync(new Snowflake.GetUsersArgs
        ///         {
        ///             Pattern = "user1",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(GetUsersArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("snowflake:index/getUsers:getUsers", args ?? new GetUsersArgs(), options.WithDefaults());

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
        ///         var current = Output.Create(Snowflake.GetUsers.InvokeAsync(new Snowflake.GetUsersArgs
        ///         {
        ///             Pattern = "user1",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetUsersResult>("snowflake:index/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUsersArgs : Pulumi.InvokeArgs
    {
        [Input("pattern", required: true)]
        public string Pattern { get; set; } = null!;

        public GetUsersArgs()
        {
        }
    }

    public sealed class GetUsersInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        public GetUsersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Pattern;
        public readonly ImmutableArray<Outputs.GetUsersUserResult> Users;

        [OutputConstructor]
        private GetUsersResult(
            string id,

            string pattern,

            ImmutableArray<Outputs.GetUsersUserResult> users)
        {
            Id = id;
            Pattern = pattern;
            Users = users;
        }
    }
}
