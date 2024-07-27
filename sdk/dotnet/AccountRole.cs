// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
    /// 
    /// The resource is used for role management, where roles can be assigned privileges and, in turn, granted to users and other roles. When granted to roles they can create hierarchies of privilege structures. For more details, refer to the [official documentation](https://docs.snowflake.com/en/user-guide/security-access-control-overview).
    /// 
    /// ## Minimal
    /// 
    /// resource "snowflake.AccountRole" "minimal" {
    ///   name = "role_name"
    /// }
    /// 
    /// ## Complete (with every optional set)
    /// 
    /// resource "snowflake.AccountRole" "complete" {
    ///   name    = "role_name"
    ///   comment = "my account role"
    /// }
    /// </summary>
    [SnowflakeResourceType("snowflake:index/accountRole:AccountRole")]
    public partial class AccountRole : global::Pulumi.CustomResource
    {
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW ROLES` for the given role.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.AccountRoleShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a AccountRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountRole(string name, AccountRoleArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/accountRole:AccountRole", name, args ?? new AccountRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountRole(string name, Input<string> id, AccountRoleState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/accountRole:AccountRole", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccountRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountRole Get(string name, Input<string> id, AccountRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountRole(name, id, state, options);
        }
    }

    public sealed class AccountRoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccountRoleArgs()
        {
        }
        public static new AccountRoleArgs Empty => new AccountRoleArgs();
    }

    public sealed class AccountRoleState : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.AccountRoleShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW ROLES` for the given role.
        /// </summary>
        public InputList<Inputs.AccountRoleShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.AccountRoleShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public AccountRoleState()
        {
        }
        public static new AccountRoleState Empty => new AccountRoleState();
    }
}
