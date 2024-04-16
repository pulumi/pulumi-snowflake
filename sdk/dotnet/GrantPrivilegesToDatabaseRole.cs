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
    /// &gt; **Note** This is a preview resource. It's ready for general use. In case of any errors, please file an issue in our GitHub repository.
    /// 
    /// !&gt; **Warning** Be careful when using `always_apply` field. It will always produce a plan (even when no changes were made) and can be harmful in some setups. For more details why we decided to introduce it to go our document explaining those design decisions (coming soon).
    /// 
    /// #### Grant all privileges OnDatabase
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|ALL|OnDatabase|\"test_db\""`
    /// ```
    /// 
    /// #### Grant list of privileges OnAllSchemasInDatabase
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\"test_db\""`
    /// ```
    /// 
    /// #### Grant list of privileges on table
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_table\""`
    /// ```
    /// 
    /// #### Grant list of privileges OnAll tables in schema
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_schema\""`
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole")]
    public partial class GrantPrivilegesToDatabaseRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Grant all privileges on the database role.
        /// </summary>
        [Output("allPrivileges")]
        public Output<bool?> AllPrivileges { get; private set; } = null!;

        /// <summary>
        /// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
        /// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
        /// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
        /// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
        /// of the config being eventually convergent (producing an empty plan).
        /// </summary>
        [Output("alwaysApply")]
        public Output<bool?> AlwaysApply { get; private set; } = null!;

        /// <summary>
        /// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        /// </summary>
        [Output("alwaysApplyTrigger")]
        public Output<string?> AlwaysApplyTrigger { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the database role to which privileges will be granted.
        /// </summary>
        [Output("databaseRoleName")]
        public Output<string> DatabaseRoleName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the database on which privileges will be granted.
        /// </summary>
        [Output("onDatabase")]
        public Output<string?> OnDatabase { get; private set; } = null!;

        /// <summary>
        /// Specifies the schema on which privileges will be granted.
        /// </summary>
        [Output("onSchema")]
        public Output<Outputs.GrantPrivilegesToDatabaseRoleOnSchema?> OnSchema { get; private set; } = null!;

        /// <summary>
        /// Specifies the schema object on which privileges will be granted.
        /// </summary>
        [Output("onSchemaObject")]
        public Output<Outputs.GrantPrivilegesToDatabaseRoleOnSchemaObject?> OnSchemaObject { get; private set; } = null!;

        /// <summary>
        /// The privileges to grant on the database role.
        /// </summary>
        [Output("privileges")]
        public Output<ImmutableArray<string>> Privileges { get; private set; } = null!;

        /// <summary>
        /// If specified, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Output("withGrantOption")]
        public Output<bool?> WithGrantOption { get; private set; } = null!;


        /// <summary>
        /// Create a GrantPrivilegesToDatabaseRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrantPrivilegesToDatabaseRole(string name, GrantPrivilegesToDatabaseRoleArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, args ?? new GrantPrivilegesToDatabaseRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrantPrivilegesToDatabaseRole(string name, Input<string> id, GrantPrivilegesToDatabaseRoleState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrantPrivilegesToDatabaseRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrantPrivilegesToDatabaseRole Get(string name, Input<string> id, GrantPrivilegesToDatabaseRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new GrantPrivilegesToDatabaseRole(name, id, state, options);
        }
    }

    public sealed class GrantPrivilegesToDatabaseRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Grant all privileges on the database role.
        /// </summary>
        [Input("allPrivileges")]
        public Input<bool>? AllPrivileges { get; set; }

        /// <summary>
        /// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
        /// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
        /// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
        /// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
        /// of the config being eventually convergent (producing an empty plan).
        /// </summary>
        [Input("alwaysApply")]
        public Input<bool>? AlwaysApply { get; set; }

        /// <summary>
        /// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        /// </summary>
        [Input("alwaysApplyTrigger")]
        public Input<string>? AlwaysApplyTrigger { get; set; }

        /// <summary>
        /// The fully qualified name of the database role to which privileges will be granted.
        /// </summary>
        [Input("databaseRoleName", required: true)]
        public Input<string> DatabaseRoleName { get; set; } = null!;

        /// <summary>
        /// The fully qualified name of the database on which privileges will be granted.
        /// </summary>
        [Input("onDatabase")]
        public Input<string>? OnDatabase { get; set; }

        /// <summary>
        /// Specifies the schema on which privileges will be granted.
        /// </summary>
        [Input("onSchema")]
        public Input<Inputs.GrantPrivilegesToDatabaseRoleOnSchemaArgs>? OnSchema { get; set; }

        /// <summary>
        /// Specifies the schema object on which privileges will be granted.
        /// </summary>
        [Input("onSchemaObject")]
        public Input<Inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs>? OnSchemaObject { get; set; }

        [Input("privileges")]
        private InputList<string>? _privileges;

        /// <summary>
        /// The privileges to grant on the database role.
        /// </summary>
        public InputList<string> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<string>());
            set => _privileges = value;
        }

        /// <summary>
        /// If specified, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public GrantPrivilegesToDatabaseRoleArgs()
        {
        }
        public static new GrantPrivilegesToDatabaseRoleArgs Empty => new GrantPrivilegesToDatabaseRoleArgs();
    }

    public sealed class GrantPrivilegesToDatabaseRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Grant all privileges on the database role.
        /// </summary>
        [Input("allPrivileges")]
        public Input<bool>? AllPrivileges { get; set; }

        /// <summary>
        /// If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
        /// supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
        /// X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
        /// new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
        /// of the config being eventually convergent (producing an empty plan).
        /// </summary>
        [Input("alwaysApply")]
        public Input<bool>? AlwaysApply { get; set; }

        /// <summary>
        /// This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        /// </summary>
        [Input("alwaysApplyTrigger")]
        public Input<string>? AlwaysApplyTrigger { get; set; }

        /// <summary>
        /// The fully qualified name of the database role to which privileges will be granted.
        /// </summary>
        [Input("databaseRoleName")]
        public Input<string>? DatabaseRoleName { get; set; }

        /// <summary>
        /// The fully qualified name of the database on which privileges will be granted.
        /// </summary>
        [Input("onDatabase")]
        public Input<string>? OnDatabase { get; set; }

        /// <summary>
        /// Specifies the schema on which privileges will be granted.
        /// </summary>
        [Input("onSchema")]
        public Input<Inputs.GrantPrivilegesToDatabaseRoleOnSchemaGetArgs>? OnSchema { get; set; }

        /// <summary>
        /// Specifies the schema object on which privileges will be granted.
        /// </summary>
        [Input("onSchemaObject")]
        public Input<Inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectGetArgs>? OnSchemaObject { get; set; }

        [Input("privileges")]
        private InputList<string>? _privileges;

        /// <summary>
        /// The privileges to grant on the database role.
        /// </summary>
        public InputList<string> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<string>());
            set => _privileges = value;
        }

        /// <summary>
        /// If specified, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public GrantPrivilegesToDatabaseRoleState()
        {
        }
        public static new GrantPrivilegesToDatabaseRoleState Empty => new GrantPrivilegesToDatabaseRoleState();
    }
}
