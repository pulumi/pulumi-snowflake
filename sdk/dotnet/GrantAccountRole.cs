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
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     //#################################
    ///     //## grant account role to account role
    ///     //#################################
    ///     var roleRole = new Snowflake.Role("roleRole");
    /// 
    ///     var parentRole = new Snowflake.Role("parentRole");
    /// 
    ///     var grantAccountRole = new Snowflake.GrantAccountRole("grantAccountRole", new()
    ///     {
    ///         RoleName = roleRole.Name,
    ///         ParentRoleName = parentRole.Name,
    ///     });
    /// 
    ///     //#################################
    ///     //## grant account role to user
    ///     //#################################
    ///     var roleIndex_roleRole = new Snowflake.Role("roleIndex/roleRole");
    /// 
    ///     var user = new Snowflake.User("user");
    /// 
    ///     var index_grantAccountRoleGrantAccountRole = new Snowflake.GrantAccountRole("index/grantAccountRoleGrantAccountRole", new()
    ///     {
    ///         RoleName = roleRole.Name,
    ///         UserName = user.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// format is role_name (string) | grantee_object_type (ROLE|USER) | grantee_name (string)
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantAccountRole:GrantAccountRole "\"test_role\"|ROLE|\"test_parent_role\""
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/grantAccountRole:GrantAccountRole")]
    public partial class GrantAccountRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
        /// </summary>
        [Output("parentRoleName")]
        public Output<string?> ParentRoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the role which will be granted to the user or parent role.
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the user on which specified role will be granted.
        /// </summary>
        [Output("userName")]
        public Output<string?> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a GrantAccountRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrantAccountRole(string name, GrantAccountRoleArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/grantAccountRole:GrantAccountRole", name, args ?? new GrantAccountRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrantAccountRole(string name, Input<string> id, GrantAccountRoleState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/grantAccountRole:GrantAccountRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrantAccountRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrantAccountRole Get(string name, Input<string> id, GrantAccountRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new GrantAccountRole(name, id, state, options);
        }
    }

    public sealed class GrantAccountRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
        /// </summary>
        [Input("parentRoleName")]
        public Input<string>? ParentRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the role which will be granted to the user or parent role.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        /// <summary>
        /// The fully qualified name of the user on which specified role will be granted.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public GrantAccountRoleArgs()
        {
        }
        public static new GrantAccountRoleArgs Empty => new GrantAccountRoleArgs();
    }

    public sealed class GrantAccountRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the parent role which will create a parent-child relationship between the roles.
        /// </summary>
        [Input("parentRoleName")]
        public Input<string>? ParentRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the role which will be granted to the user or parent role.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the user on which specified role will be granted.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public GrantAccountRoleState()
        {
        }
        public static new GrantAccountRoleState Empty => new GrantAccountRoleState();
    }
}
