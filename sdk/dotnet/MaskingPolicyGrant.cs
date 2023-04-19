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
    ///     var example = new Snowflake.MaskingPolicyGrant("example", new()
    ///     {
    ///         DatabaseName = "EXAMPLE_DB_NAME",
    ///         EnableMultipleGrants = true,
    ///         MaskingPolicyName = "EXAMPLE_MASKING_POLICY_NAME",
    ///         Privilege = "APPLY",
    ///         Roles = new[]
    ///         {
    ///             "ROLE1_NAME",
    ///             "ROLE2_NAME",
    ///         },
    ///         SchemaName = "EXAMPLE_SCHEMA_NAME",
    ///         WithGrantOption = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is database_name|schema_name|masking_policy_name|privilege|with_grant_option|roles
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/maskingPolicyGrant:MaskingPolicyGrant example "dbName|schemaName|maskingPolicyName|USAGE|false|role1,role2"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant")]
    public partial class MaskingPolicyGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the database containing the masking policy on which to grant privileges.
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
        /// The name of the masking policy on which to grant privileges immediately.
        /// </summary>
        [Output("maskingPolicyName")]
        public Output<string> MaskingPolicyName { get; private set; } = null!;

        /// <summary>
        /// The privilege to grant on the masking policy.
        /// </summary>
        [Output("privilege")]
        public Output<string?> Privilege { get; private set; } = null!;

        /// <summary>
        /// Grants privilege to these roles.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// The name of the schema containing the masking policy on which to grant privileges.
        /// </summary>
        [Output("schemaName")]
        public Output<string> SchemaName { get; private set; } = null!;

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Output("withGrantOption")]
        public Output<bool?> WithGrantOption { get; private set; } = null!;


        /// <summary>
        /// Create a MaskingPolicyGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MaskingPolicyGrant(string name, MaskingPolicyGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant", name, args ?? new MaskingPolicyGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MaskingPolicyGrant(string name, Input<string> id, MaskingPolicyGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MaskingPolicyGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MaskingPolicyGrant Get(string name, Input<string> id, MaskingPolicyGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new MaskingPolicyGrant(name, id, state, options);
        }
    }

    public sealed class MaskingPolicyGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database containing the masking policy on which to grant privileges.
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
        /// The name of the masking policy on which to grant privileges immediately.
        /// </summary>
        [Input("maskingPolicyName", required: true)]
        public Input<string> MaskingPolicyName { get; set; } = null!;

        /// <summary>
        /// The privilege to grant on the masking policy.
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
        /// The name of the schema containing the masking policy on which to grant privileges.
        /// </summary>
        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public MaskingPolicyGrantArgs()
        {
        }
        public static new MaskingPolicyGrantArgs Empty => new MaskingPolicyGrantArgs();
    }

    public sealed class MaskingPolicyGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database containing the masking policy on which to grant privileges.
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
        /// The name of the masking policy on which to grant privileges immediately.
        /// </summary>
        [Input("maskingPolicyName")]
        public Input<string>? MaskingPolicyName { get; set; }

        /// <summary>
        /// The privilege to grant on the masking policy.
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
        /// The name of the schema containing the masking policy on which to grant privileges.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        /// <summary>
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public MaskingPolicyGrantState()
        {
        }
        public static new MaskingPolicyGrantState Empty => new MaskingPolicyGrantState();
    }
}
