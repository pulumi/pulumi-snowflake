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
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var grant = new Snowflake.ExternalTableGrant("grant", new()
    ///     {
    ///         DatabaseName = "db",
    ///         ExternalTableName = "external_table",
    ///         OnFuture = false,
    ///         Privilege = "select",
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
    ///         WithGrantOption = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// # format is database name | schema name | external table name | privilege | true/false for with_grant_option
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/externalTableGrant:ExternalTableGrant example 'dbName|schemaName|externalTableName|SELECT|false'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/externalTableGrant:ExternalTableGrant")]
    public partial class ExternalTableGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the database containing the current or future external tables on which to grant privileges.
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
        /// The name of the external table on which to grant privileges immediately (only valid if on_future is false).
        /// </summary>
        [Output("externalTableName")]
        public Output<string?> ExternalTableName { get; private set; } = null!;

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
        /// </summary>
        [Output("onFuture")]
        public Output<bool?> OnFuture { get; private set; } = null!;

        /// <summary>
        /// The privilege to grant on the current or future external table.
        /// </summary>
        [Output("privilege")]
        public Output<string?> Privilege { get; private set; } = null!;

        /// <summary>
        /// Grants privilege to these roles.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// The name of the schema containing the current or future external tables on which to grant privileges.
        /// </summary>
        [Output("schemaName")]
        public Output<string?> SchemaName { get; private set; } = null!;

        /// <summary>
        /// Grants privilege to these shares (only valid if on_future is false).
        /// </summary>
        [Output("shares")]
        public Output<ImmutableArray<string>> Shares { get; private set; } = null!;

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Output("withGrantOption")]
        public Output<bool?> WithGrantOption { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalTableGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalTableGrant(string name, ExternalTableGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/externalTableGrant:ExternalTableGrant", name, args ?? new ExternalTableGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalTableGrant(string name, Input<string> id, ExternalTableGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/externalTableGrant:ExternalTableGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExternalTableGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalTableGrant Get(string name, Input<string> id, ExternalTableGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalTableGrant(name, id, state, options);
        }
    }

    public sealed class ExternalTableGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database containing the current or future external tables on which to grant privileges.
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
        /// The name of the external table on which to grant privileges immediately (only valid if on_future is false).
        /// </summary>
        [Input("externalTableName")]
        public Input<string>? ExternalTableName { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future external table.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

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
        /// The name of the schema containing the current or future external tables on which to grant privileges.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("shares")]
        private InputList<string>? _shares;

        /// <summary>
        /// Grants privilege to these shares (only valid if on_future is false).
        /// </summary>
        public InputList<string> Shares
        {
            get => _shares ?? (_shares = new InputList<string>());
            set => _shares = value;
        }

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public ExternalTableGrantArgs()
        {
        }
        public static new ExternalTableGrantArgs Empty => new ExternalTableGrantArgs();
    }

    public sealed class ExternalTableGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database containing the current or future external tables on which to grant privileges.
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
        /// The name of the external table on which to grant privileges immediately (only valid if on_future is false).
        /// </summary>
        [Input("externalTableName")]
        public Input<string>? ExternalTableName { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future external table.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

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
        /// The name of the schema containing the current or future external tables on which to grant privileges.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("shares")]
        private InputList<string>? _shares;

        /// <summary>
        /// Grants privilege to these shares (only valid if on_future is false).
        /// </summary>
        public InputList<string> Shares
        {
            get => _shares ?? (_shares = new InputList<string>());
            set => _shares = value;
        }

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public ExternalTableGrantState()
        {
        }
        public static new ExternalTableGrantState Empty => new ExternalTableGrantState();
    }
}
