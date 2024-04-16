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
    /// &gt; **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. &lt;deprecation&gt;
    /// 
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
    ///     var grant = new Snowflake.FunctionGrant("grant", new()
    ///     {
    ///         DatabaseName = "database",
    ///         SchemaName = "schema",
    ///         FunctionName = "function",
    ///         ArgumentDataTypes = new[]
    ///         {
    ///             "array",
    ///             "string",
    ///         },
    ///         Privilege = "USAGE",
    ///         Roles = new[]
    ///         {
    ///             "role1",
    ///             "role2",
    ///         },
    ///         Shares = new[]
    ///         {
    ///             "share1",
    ///             "share2",
    ///         },
    ///         OnFuture = false,
    ///         WithGrantOption = false,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// format is database_name|schema_name|function_name|argument_data_types|privilege|with_grant_option|on_future|roles|shares
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/functionGrant:FunctionGrant example "MY_DATABASE|MY_SCHEMA|MY_FUNCTION|ARG1TYPE,ARG2TYPE|USAGE|false|false|role1,role2|share1,share2"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/functionGrant:FunctionGrant")]
    public partial class FunctionGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the argument data types for the function (must be present if function has arguments and function_name is present)
        /// </summary>
        [Output("argumentDataTypes")]
        public Output<ImmutableArray<string>> ArgumentDataTypes { get; private set; } = null!;

        /// <summary>
        /// The name of the database containing the current or future functions on which to grant privileges.
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
        /// The name of the function on which to grant privileges immediately (only valid if on_future is false).
        /// </summary>
        [Output("functionName")]
        public Output<string?> FunctionName { get; private set; } = null!;

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        /// </summary>
        [Output("onAll")]
        public Output<bool?> OnAll { get; private set; } = null!;

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        /// </summary>
        [Output("onFuture")]
        public Output<bool?> OnFuture { get; private set; } = null!;

        /// <summary>
        /// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
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
        /// The name of the schema containing the current or future functions on which to grant privileges.
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
        /// Create a FunctionGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FunctionGrant(string name, FunctionGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/functionGrant:FunctionGrant", name, args ?? new FunctionGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FunctionGrant(string name, Input<string> id, FunctionGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/functionGrant:FunctionGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FunctionGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FunctionGrant Get(string name, Input<string> id, FunctionGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new FunctionGrant(name, id, state, options);
        }
    }

    public sealed class FunctionGrantArgs : global::Pulumi.ResourceArgs
    {
        [Input("argumentDataTypes")]
        private InputList<string>? _argumentDataTypes;

        /// <summary>
        /// List of the argument data types for the function (must be present if function has arguments and function_name is present)
        /// </summary>
        public InputList<string> ArgumentDataTypes
        {
            get => _argumentDataTypes ?? (_argumentDataTypes = new InputList<string>());
            set => _argumentDataTypes = value;
        }

        /// <summary>
        /// The name of the database containing the current or future functions on which to grant privileges.
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
        /// The name of the function on which to grant privileges immediately (only valid if on_future is false).
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        /// </summary>
        [Input("onAll")]
        public Input<bool>? OnAll { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        /// <summary>
        /// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        /// </summary>
        [Input("revertOwnershipToRoleName")]
        public Input<string>? RevertOwnershipToRoleName { get; set; }

        [Input("roles", required: true)]
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
        /// The name of the schema containing the current or future functions on which to grant privileges.
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

        public FunctionGrantArgs()
        {
        }
        public static new FunctionGrantArgs Empty => new FunctionGrantArgs();
    }

    public sealed class FunctionGrantState : global::Pulumi.ResourceArgs
    {
        [Input("argumentDataTypes")]
        private InputList<string>? _argumentDataTypes;

        /// <summary>
        /// List of the argument data types for the function (must be present if function has arguments and function_name is present)
        /// </summary>
        public InputList<string> ArgumentDataTypes
        {
            get => _argumentDataTypes ?? (_argumentDataTypes = new InputList<string>());
            set => _argumentDataTypes = value;
        }

        /// <summary>
        /// The name of the database containing the current or future functions on which to grant privileges.
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
        /// The name of the function on which to grant privileges immediately (only valid if on_future is false).
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        /// </summary>
        [Input("onAll")]
        public Input<bool>? OnAll { get; set; }

        /// <summary>
        /// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
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
        /// The name of the schema containing the current or future functions on which to grant privileges.
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

        public FunctionGrantState()
        {
        }
        public static new FunctionGrantState Empty => new FunctionGrantState();
    }
}
