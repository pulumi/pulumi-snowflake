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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var role = new Snowflake.Role("role", new()
    ///     {
    ///         Comment = "for testing",
    ///     });
    /// 
    ///     var user = new Snowflake.User("user", new()
    ///     {
    ///         Comment = "for testing",
    ///     });
    /// 
    ///     var user2 = new Snowflake.User("user2", new()
    ///     {
    ///         Comment = "for testing",
    ///     });
    /// 
    ///     var otherRole = new Snowflake.Role("otherRole");
    /// 
    ///     var grants = new Snowflake.RoleGrants("grants", new()
    ///     {
    ///         RoleName = role.Name,
    ///         Roles = new[]
    ///         {
    ///             otherRole.Name,
    ///         },
    ///         Users = new[]
    ///         {
    ///             user.Name,
    ///             user2.Name,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is role_name|roles|users
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/roleGrants:RoleGrants example "role_name|role1,role2|user1,user2"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/roleGrants:RoleGrants")]
    public partial class RoleGrants : global::Pulumi.CustomResource
    {
        /// <summary>
        /// When this is set to false, multiple grants of the same type cannot be created. This will cause Terraform to revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Output("enableMultipleGrants")]
        public Output<bool?> EnableMultipleGrants { get; private set; } = null!;

        /// <summary>
        /// The name of the role we are granting.
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;

        /// <summary>
        /// Grants role to this specified role.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// Grants role to this specified user.
        /// </summary>
        [Output("users")]
        public Output<ImmutableArray<string>> Users { get; private set; } = null!;


        /// <summary>
        /// Create a RoleGrants resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleGrants(string name, RoleGrantsArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/roleGrants:RoleGrants", name, args ?? new RoleGrantsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleGrants(string name, Input<string> id, RoleGrantsState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/roleGrants:RoleGrants", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleGrants resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleGrants Get(string name, Input<string> id, RoleGrantsState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleGrants(name, id, state, options);
        }
    }

    public sealed class RoleGrantsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this is set to false, multiple grants of the same type cannot be created. This will cause Terraform to revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Input("enableMultipleGrants")]
        public Input<bool>? EnableMultipleGrants { get; set; }

        /// <summary>
        /// The name of the role we are granting.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Grants role to this specified role.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("users")]
        private InputList<string>? _users;

        /// <summary>
        /// Grants role to this specified user.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        public RoleGrantsArgs()
        {
        }
        public static new RoleGrantsArgs Empty => new RoleGrantsArgs();
    }

    public sealed class RoleGrantsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this is set to false, multiple grants of the same type cannot be created. This will cause Terraform to revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Input("enableMultipleGrants")]
        public Input<bool>? EnableMultipleGrants { get; set; }

        /// <summary>
        /// The name of the role we are granting.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Grants role to this specified role.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("users")]
        private InputList<string>? _users;

        /// <summary>
        /// Grants role to this specified user.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        public RoleGrantsState()
        {
        }
        public static new RoleGrantsState Empty => new RoleGrantsState();
    }
}
