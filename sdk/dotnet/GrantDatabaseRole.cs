// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Import
    /// 
    /// format is database_role_name (string) | object_type (ROLE|DATABASE ROLE|SHARE) | grantee_name (string)
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantDatabaseRole:GrantDatabaseRole example '"ABC"."test_db_role"|ROLE|"test_parent_role"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/grantDatabaseRole:GrantDatabaseRole")]
    public partial class GrantDatabaseRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
        /// </summary>
        [Output("databaseRoleName")]
        public Output<string> DatabaseRoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
        /// </summary>
        [Output("parentDatabaseRoleName")]
        public Output<string?> ParentDatabaseRoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
        /// </summary>
        [Output("parentRoleName")]
        public Output<string?> ParentRoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Output("shareName")]
        public Output<string?> ShareName { get; private set; } = null!;


        /// <summary>
        /// Create a GrantDatabaseRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrantDatabaseRole(string name, GrantDatabaseRoleArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/grantDatabaseRole:GrantDatabaseRole", name, args ?? new GrantDatabaseRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrantDatabaseRole(string name, Input<string> id, GrantDatabaseRoleState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/grantDatabaseRole:GrantDatabaseRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrantDatabaseRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrantDatabaseRole Get(string name, Input<string> id, GrantDatabaseRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new GrantDatabaseRole(name, id, state, options);
        }
    }

    public sealed class GrantDatabaseRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
        /// </summary>
        [Input("databaseRoleName", required: true)]
        public Input<string> DatabaseRoleName { get; set; } = null!;

        /// <summary>
        /// The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
        /// </summary>
        [Input("parentDatabaseRoleName")]
        public Input<string>? ParentDatabaseRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
        /// </summary>
        [Input("parentRoleName")]
        public Input<string>? ParentRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Input("shareName")]
        public Input<string>? ShareName { get; set; }

        public GrantDatabaseRoleArgs()
        {
        }
        public static new GrantDatabaseRoleArgs Empty => new GrantDatabaseRoleArgs();
    }

    public sealed class GrantDatabaseRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
        /// </summary>
        [Input("databaseRoleName")]
        public Input<string>? DatabaseRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
        /// </summary>
        [Input("parentDatabaseRoleName")]
        public Input<string>? ParentDatabaseRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
        /// </summary>
        [Input("parentRoleName")]
        public Input<string>? ParentRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Input("shareName")]
        public Input<string>? ShareName { get; set; }

        public GrantDatabaseRoleState()
        {
        }
        public static new GrantDatabaseRoleState Empty => new GrantDatabaseRoleState();
    }
}
