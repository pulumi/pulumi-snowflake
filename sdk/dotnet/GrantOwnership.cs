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
    /// ### Import examples
    /// 
    /// #### OnObject on Schema ToAccountRole
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|COPY|OnObject|SCHEMA|"database_name"."schema_name"'`
    /// ```
    /// 
    /// #### OnObject on Schema ToDatabaseRole
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToDatabaseRole|"database_name"."database_role_name"|COPY|OnObject|SCHEMA|"database_name"."schema_name"'`
    /// ```
    /// 
    /// #### OnObject on Table
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|COPY|OnObject|TABLE|"database_name"."schema_name"."table_name"'`
    /// ```
    /// 
    /// #### OnAll InDatabase
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|REVOKE|OnAll|TABLES|InDatabase|"database_name"'`
    /// ```
    /// 
    /// #### OnAll InSchema
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"||OnAll|TABLES|InSchema|"database_name"."schema_name"'`
    /// ```
    /// 
    /// #### OnFuture InDatabase
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"||OnFuture|TABLES|InDatabase|"database_name"'`
    /// ```
    /// 
    /// #### OnFuture InSchema
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantOwnership:GrantOwnership example 'ToAccountRole|"account_role"|COPY|OnFuture|TABLES|InSchema|"database_name"."schema_name"'`
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/grantOwnership:GrantOwnership")]
    public partial class GrantOwnership : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Output("accountRoleName")]
        public Output<string?> AccountRoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Output("databaseRoleName")]
        public Output<string?> DatabaseRoleName { get; private set; } = null!;

        /// <summary>
        /// Configures which object(s) should transfer their ownership to the specified role.
        /// </summary>
        [Output("on")]
        public Output<Outputs.GrantOwnershipOn> On { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
        /// </summary>
        [Output("outboundPrivileges")]
        public Output<string?> OutboundPrivileges { get; private set; } = null!;


        /// <summary>
        /// Create a GrantOwnership resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrantOwnership(string name, GrantOwnershipArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/grantOwnership:GrantOwnership", name, args ?? new GrantOwnershipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrantOwnership(string name, Input<string> id, GrantOwnershipState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/grantOwnership:GrantOwnership", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrantOwnership resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrantOwnership Get(string name, Input<string> id, GrantOwnershipState? state = null, CustomResourceOptions? options = null)
        {
            return new GrantOwnership(name, id, state, options);
        }
    }

    public sealed class GrantOwnershipArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Input("accountRoleName")]
        public Input<string>? AccountRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Input("databaseRoleName")]
        public Input<string>? DatabaseRoleName { get; set; }

        /// <summary>
        /// Configures which object(s) should transfer their ownership to the specified role.
        /// </summary>
        [Input("on", required: true)]
        public Input<Inputs.GrantOwnershipOnArgs> On { get; set; } = null!;

        /// <summary>
        /// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
        /// </summary>
        [Input("outboundPrivileges")]
        public Input<string>? OutboundPrivileges { get; set; }

        public GrantOwnershipArgs()
        {
        }
        public static new GrantOwnershipArgs Empty => new GrantOwnershipArgs();
    }

    public sealed class GrantOwnershipState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Input("accountRoleName")]
        public Input<string>? AccountRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        /// </summary>
        [Input("databaseRoleName")]
        public Input<string>? DatabaseRoleName { get; set; }

        /// <summary>
        /// Configures which object(s) should transfer their ownership to the specified role.
        /// </summary>
        [Input("on")]
        public Input<Inputs.GrantOwnershipOnGetArgs>? On { get; set; }

        /// <summary>
        /// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
        /// </summary>
        [Input("outboundPrivileges")]
        public Input<string>? OutboundPrivileges { get; set; }

        public GrantOwnershipState()
        {
        }
        public static new GrantOwnershipState Empty => new GrantOwnershipState();
    }
}
