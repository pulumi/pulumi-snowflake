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
    ///     var grantViewGrant = new Snowflake.ViewGrant("grantViewGrant", new()
    ///     {
    ///         DatabaseName = "database",
    ///         OnFuture = false,
    ///         Privilege = "SELECT",
    ///         Roles = new[]
    ///         {
    ///             "role1",
    ///             "role2",
    ///         },
    ///         SchemaName = "schema",
    ///         Shares = new[]
    ///         {
    ///             "share1",
    ///             "share2",
    ///         },
    ///         ViewName = "view",
    ///         WithGrantOption = false,
    ///     });
    /// 
    ///     var grantSchemaGrant = new Snowflake.SchemaGrant("grantSchemaGrant", new()
    ///     {
    ///         DatabaseName = "database",
    ///         Privilege = "USAGE",
    ///         Roles = new[]
    ///         {
    ///             "role1",
    ///             "role2",
    ///         },
    ///         SchemaName = "schema",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is database_name|schema_name|view_name|privilege|with_grant_option|on_future|on_all|roles|shares
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/viewGrant:ViewGrant example "MY_DATABASE|MY_SCHEMA|MY_VIEW|USAGE|false|false|false|role1,role2|share1,share2"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/viewGrant:ViewGrant")]
    public partial class ViewGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the database containing the current or future views on which to grant privileges.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Output("enableMultipleGrants")]
        public Output<bool?> EnableMultipleGrants { get; private set; } = null!;

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all views in the given schema. When this is true and no schema*name is provided apply this grant on all views in the given database. The view*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
        /// </summary>
        [Output("onAll")]
        public Output<bool?> OnAll { get; private set; } = null!;

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future views in the given schema. When this is true and no schema*name is provided apply this grant on all future views in the given database. The view*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
        /// </summary>
        [Output("onFuture")]
        public Output<bool?> OnFuture { get; private set; } = null!;

        /// <summary>
        /// The privilege to grant on the current or future view. To grant all privileges, use the value `ALL PRIVILEGES`.
        /// </summary>
        [Output("privilege")]
        public Output<string?> Privilege { get; private set; } = null!;

        /// <summary>
        /// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        /// </summary>
        [Output("revertOwnershipToRoleName")]
        public Output<string?> RevertOwnershipToRoleName { get; private set; } = null!;

        /// <summary>
        /// Grants privilege to these roles.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// The name of the schema containing the current or future views on which to grant privileges.
        /// </summary>
        [Output("schemaName")]
        public Output<string?> SchemaName { get; private set; } = null!;

        /// <summary>
        /// Grants privilege to these shares (only valid if on*future and on*all are unset).
        /// </summary>
        [Output("shares")]
        public Output<ImmutableArray<string>> Shares { get; private set; } = null!;

        /// <summary>
        /// The name of the view on which to grant privileges immediately (only valid if on*future and on*all are unset).
        /// </summary>
        [Output("viewName")]
        public Output<string?> ViewName { get; private set; } = null!;

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Output("withGrantOption")]
        public Output<bool?> WithGrantOption { get; private set; } = null!;


        /// <summary>
        /// Create a ViewGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ViewGrant(string name, ViewGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/viewGrant:ViewGrant", name, args ?? new ViewGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ViewGrant(string name, Input<string> id, ViewGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/viewGrant:ViewGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ViewGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ViewGrant Get(string name, Input<string> id, ViewGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new ViewGrant(name, id, state, options);
        }
    }

    public sealed class ViewGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database containing the current or future views on which to grant privileges.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Input("enableMultipleGrants")]
        public Input<bool>? EnableMultipleGrants { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all views in the given schema. When this is true and no schema*name is provided apply this grant on all views in the given database. The view*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
        /// </summary>
        [Input("onAll")]
        public Input<bool>? OnAll { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future views in the given schema. When this is true and no schema*name is provided apply this grant on all future views in the given database. The view*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future view. To grant all privileges, use the value `ALL PRIVILEGES`.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        /// <summary>
        /// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        /// </summary>
        [Input("revertOwnershipToRoleName")]
        public Input<string>? RevertOwnershipToRoleName { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Grants privilege to these roles.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// The name of the schema containing the current or future views on which to grant privileges.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("shares")]
        private InputList<string>? _shares;

        /// <summary>
        /// Grants privilege to these shares (only valid if on*future and on*all are unset).
        /// </summary>
        public InputList<string> Shares
        {
            get => _shares ?? (_shares = new InputList<string>());
            set => _shares = value;
        }

        /// <summary>
        /// The name of the view on which to grant privileges immediately (only valid if on*future and on*all are unset).
        /// </summary>
        [Input("viewName")]
        public Input<string>? ViewName { get; set; }

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public ViewGrantArgs()
        {
        }
        public static new ViewGrantArgs Empty => new ViewGrantArgs();
    }

    public sealed class ViewGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database containing the current or future views on which to grant privileges.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Input("enableMultipleGrants")]
        public Input<bool>? EnableMultipleGrants { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all views in the given schema. When this is true and no schema*name is provided apply this grant on all views in the given database. The view*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
        /// </summary>
        [Input("onAll")]
        public Input<bool>? OnAll { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future views in the given schema. When this is true and no schema*name is provided apply this grant on all future views in the given database. The view*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future view. To grant all privileges, use the value `ALL PRIVILEGES`.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        /// <summary>
        /// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        /// </summary>
        [Input("revertOwnershipToRoleName")]
        public Input<string>? RevertOwnershipToRoleName { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Grants privilege to these roles.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// The name of the schema containing the current or future views on which to grant privileges.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("shares")]
        private InputList<string>? _shares;

        /// <summary>
        /// Grants privilege to these shares (only valid if on*future and on*all are unset).
        /// </summary>
        public InputList<string> Shares
        {
            get => _shares ?? (_shares = new InputList<string>());
            set => _shares = value;
        }

        /// <summary>
        /// The name of the view on which to grant privileges immediately (only valid if on*future and on*all are unset).
        /// </summary>
        [Input("viewName")]
        public Input<string>? ViewName { get; set; }

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public ViewGrantState()
        {
        }
        public static new ViewGrantState Empty => new ViewGrantState();
    }
}
