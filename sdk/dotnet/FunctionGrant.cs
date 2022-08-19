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
    ///     var grant = new Snowflake.FunctionGrant("grant", new()
    ///     {
    ///         Arguments = new[]
    ///         {
    ///             new Snowflake.Inputs.FunctionGrantArgumentArgs
    ///             {
    ///                 Name = "a",
    ///                 Type = "array",
    ///             },
    ///             new Snowflake.Inputs.FunctionGrantArgumentArgs
    ///             {
    ///                 Name = "b",
    ///                 Type = "string",
    ///             },
    ///         },
    ///         DatabaseName = "db",
    ///         FunctionName = "function",
    ///         OnFuture = false,
    ///         Privilege = "USAGE",
    ///         ReturnType = "string",
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
    /// # format is database name | schema name | function signature | privilege | true/false for with_grant_option
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/functionGrant:FunctionGrant example 'dbName|schemaName|functionName(ARG1 ARG1TYPE, ARG2 ARG2TYPE):RETURNTYPE|USAGE|false'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/functionGrant:FunctionGrant")]
    public partial class FunctionGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the function (must be present if function has arguments and function_name is present)
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.FunctionGrantArgument>> Arguments { get; private set; } = null!;

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
        /// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        /// </summary>
        [Output("onFuture")]
        public Output<bool?> OnFuture { get; private set; } = null!;

        /// <summary>
        /// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        /// </summary>
        [Output("privilege")]
        public Output<string?> Privilege { get; private set; } = null!;

        /// <summary>
        /// The return type of the function (must be present if function_name is present)
        /// </summary>
        [Output("returnType")]
        public Output<string?> ReturnType { get; private set; } = null!;

        /// <summary>
        /// Grants privilege to these roles.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// The name of the schema containing the current or future functions on which to grant privileges.
        /// </summary>
        [Output("schemaName")]
        public Output<string> SchemaName { get; private set; } = null!;

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
        [Input("arguments")]
        private InputList<Inputs.FunctionGrantArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function (must be present if function has arguments and function_name is present)
        /// </summary>
        public InputList<Inputs.FunctionGrantArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionGrantArgumentArgs>());
            set => _arguments = value;
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
        /// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        /// <summary>
        /// The return type of the function (must be present if function_name is present)
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

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
        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

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
        [Input("arguments")]
        private InputList<Inputs.FunctionGrantArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function (must be present if function has arguments and function_name is present)
        /// </summary>
        public InputList<Inputs.FunctionGrantArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionGrantArgumentGetArgs>());
            set => _arguments = value;
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
        /// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        /// </summary>
        [Input("onFuture")]
        public Input<bool>? OnFuture { get; set; }

        /// <summary>
        /// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        /// <summary>
        /// The return type of the function (must be present if function_name is present)
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

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
