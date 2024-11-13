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
    /// ## Import
    /// 
    /// ### Import examples
    /// 
    /// #### Grant all privileges OnAccountObject (Database)
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole example '"test_db_role"|false|false|ALL|OnAccountObject|DATABASE|"test_db"'`
    /// ```
    /// 
    /// #### Grant list of privileges OnAllSchemasInDatabase
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole example '"test_db_role"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|"test_db"'`
    /// ```
    /// 
    /// #### Grant list of privileges on table
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole example '"test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnObject|TABLE|"test_db"."test_schema"."test_table"'`
    /// ```
    /// 
    /// #### Grant list of privileges OnAll tables in schema
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole example '"test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnAll|TABLES|InSchema|"test_db"."test_schema"'`
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole")]
    public partial class GrantPrivilegesToAccountRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The fully qualified name of the account role to which privileges will be granted.
        /// </summary>
        [Output("accountRoleName")]
        public Output<string> AccountRoleName { get; private set; } = null!;

        /// <summary>
        /// Grant all privileges on the account role.
        /// </summary>
        [Output("allPrivileges")]
        public Output<bool?> AllPrivileges { get; private set; } = null!;

        [Output("alwaysApply")]
        public Output<bool?> AlwaysApply { get; private set; } = null!;

        /// <summary>
        /// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        /// </summary>
        [Output("alwaysApplyTrigger")]
        public Output<string?> AlwaysApplyTrigger { get; private set; } = null!;

        /// <summary>
        /// If true, the privileges will be granted on the account.
        /// </summary>
        [Output("onAccount")]
        public Output<bool?> OnAccount { get; private set; } = null!;

        /// <summary>
        /// Specifies the account object on which privileges will be granted
        /// </summary>
        [Output("onAccountObject")]
        public Output<Outputs.GrantPrivilegesToAccountRoleOnAccountObject?> OnAccountObject { get; private set; } = null!;

        /// <summary>
        /// Specifies the schema on which privileges will be granted.
        /// </summary>
        [Output("onSchema")]
        public Output<Outputs.GrantPrivilegesToAccountRoleOnSchema?> OnSchema { get; private set; } = null!;

        /// <summary>
        /// Specifies the schema object on which privileges will be granted.
        /// </summary>
        [Output("onSchemaObject")]
        public Output<Outputs.GrantPrivilegesToAccountRoleOnSchemaObject?> OnSchemaObject { get; private set; } = null!;

        /// <summary>
        /// The privileges to grant on the account role.
        /// </summary>
        [Output("privileges")]
        public Output<ImmutableArray<string>> Privileges { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the grantee can grant the privileges to other users.
        /// </summary>
        [Output("withGrantOption")]
        public Output<bool?> WithGrantOption { get; private set; } = null!;


        /// <summary>
        /// Create a GrantPrivilegesToAccountRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrantPrivilegesToAccountRole(string name, GrantPrivilegesToAccountRoleArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole", name, args ?? new GrantPrivilegesToAccountRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrantPrivilegesToAccountRole(string name, Input<string> id, GrantPrivilegesToAccountRoleState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrantPrivilegesToAccountRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrantPrivilegesToAccountRole Get(string name, Input<string> id, GrantPrivilegesToAccountRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new GrantPrivilegesToAccountRole(name, id, state, options);
        }
    }

    public sealed class GrantPrivilegesToAccountRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the account role to which privileges will be granted.
        /// </summary>
        [Input("accountRoleName", required: true)]
        public Input<string> AccountRoleName { get; set; } = null!;

        /// <summary>
        /// Grant all privileges on the account role.
        /// </summary>
        [Input("allPrivileges")]
        public Input<bool>? AllPrivileges { get; set; }

        [Input("alwaysApply")]
        public Input<bool>? AlwaysApply { get; set; }

        /// <summary>
        /// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        /// </summary>
        [Input("alwaysApplyTrigger")]
        public Input<string>? AlwaysApplyTrigger { get; set; }

        /// <summary>
        /// If true, the privileges will be granted on the account.
        /// </summary>
        [Input("onAccount")]
        public Input<bool>? OnAccount { get; set; }

        /// <summary>
        /// Specifies the account object on which privileges will be granted
        /// </summary>
        [Input("onAccountObject")]
        public Input<Inputs.GrantPrivilegesToAccountRoleOnAccountObjectArgs>? OnAccountObject { get; set; }

        /// <summary>
        /// Specifies the schema on which privileges will be granted.
        /// </summary>
        [Input("onSchema")]
        public Input<Inputs.GrantPrivilegesToAccountRoleOnSchemaArgs>? OnSchema { get; set; }

        /// <summary>
        /// Specifies the schema object on which privileges will be granted.
        /// </summary>
        [Input("onSchemaObject")]
        public Input<Inputs.GrantPrivilegesToAccountRoleOnSchemaObjectArgs>? OnSchemaObject { get; set; }

        [Input("privileges")]
        private InputList<string>? _privileges;

        /// <summary>
        /// The privileges to grant on the account role.
        /// </summary>
        public InputList<string> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<string>());
            set => _privileges = value;
        }

        /// <summary>
        /// Specifies whether the grantee can grant the privileges to other users.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public GrantPrivilegesToAccountRoleArgs()
        {
        }
        public static new GrantPrivilegesToAccountRoleArgs Empty => new GrantPrivilegesToAccountRoleArgs();
    }

    public sealed class GrantPrivilegesToAccountRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified name of the account role to which privileges will be granted.
        /// </summary>
        [Input("accountRoleName")]
        public Input<string>? AccountRoleName { get; set; }

        /// <summary>
        /// Grant all privileges on the account role.
        /// </summary>
        [Input("allPrivileges")]
        public Input<bool>? AllPrivileges { get; set; }

        [Input("alwaysApply")]
        public Input<bool>? AlwaysApply { get; set; }

        /// <summary>
        /// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        /// </summary>
        [Input("alwaysApplyTrigger")]
        public Input<string>? AlwaysApplyTrigger { get; set; }

        /// <summary>
        /// If true, the privileges will be granted on the account.
        /// </summary>
        [Input("onAccount")]
        public Input<bool>? OnAccount { get; set; }

        /// <summary>
        /// Specifies the account object on which privileges will be granted
        /// </summary>
        [Input("onAccountObject")]
        public Input<Inputs.GrantPrivilegesToAccountRoleOnAccountObjectGetArgs>? OnAccountObject { get; set; }

        /// <summary>
        /// Specifies the schema on which privileges will be granted.
        /// </summary>
        [Input("onSchema")]
        public Input<Inputs.GrantPrivilegesToAccountRoleOnSchemaGetArgs>? OnSchema { get; set; }

        /// <summary>
        /// Specifies the schema object on which privileges will be granted.
        /// </summary>
        [Input("onSchemaObject")]
        public Input<Inputs.GrantPrivilegesToAccountRoleOnSchemaObjectGetArgs>? OnSchemaObject { get; set; }

        [Input("privileges")]
        private InputList<string>? _privileges;

        /// <summary>
        /// The privileges to grant on the account role.
        /// </summary>
        public InputList<string> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<string>());
            set => _privileges = value;
        }

        /// <summary>
        /// Specifies whether the grantee can grant the privileges to other users.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public GrantPrivilegesToAccountRoleState()
        {
        }
        public static new GrantPrivilegesToAccountRoleState Empty => new GrantPrivilegesToAccountRoleState();
    }
}
