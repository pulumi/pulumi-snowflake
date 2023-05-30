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
    ///     var grant = new Snowflake.IntegrationGrant("grant", new()
    ///     {
    ///         IntegrationName = "integration",
    ///         Privilege = "USAGE",
    ///         Roles = new[]
    ///         {
    ///             "role1",
    ///             "role2",
    ///         },
    ///         WithGrantOption = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is integration_name|privilege|with_grant_option|roles
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/integrationGrant:IntegrationGrant example "MY_INTEGRATION|USAGE|false|role1,role2"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/integrationGrant:IntegrationGrant")]
    public partial class IntegrationGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Output("enableMultipleGrants")]
        public Output<bool?> EnableMultipleGrants { get; private set; } = null!;

        /// <summary>
        /// Identifier for the integration; must be unique for your account.
        /// </summary>
        [Output("integrationName")]
        public Output<string> IntegrationName { get; private set; } = null!;

        /// <summary>
        /// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
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
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Output("withGrantOption")]
        public Output<bool?> WithGrantOption { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationGrant(string name, IntegrationGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/integrationGrant:IntegrationGrant", name, args ?? new IntegrationGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationGrant(string name, Input<string> id, IntegrationGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/integrationGrant:IntegrationGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IntegrationGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationGrant Get(string name, Input<string> id, IntegrationGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationGrant(name, id, state, options);
        }
    }

    public sealed class IntegrationGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Input("enableMultipleGrants")]
        public Input<bool>? EnableMultipleGrants { get; set; }

        /// <summary>
        /// Identifier for the integration; must be unique for your account.
        /// </summary>
        [Input("integrationName", required: true)]
        public Input<string> IntegrationName { get; set; } = null!;

        /// <summary>
        /// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
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
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public IntegrationGrantArgs()
        {
        }
        public static new IntegrationGrantArgs Empty => new IntegrationGrantArgs();
    }

    public sealed class IntegrationGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        /// grants applied to roles and objects outside Terraform.
        /// </summary>
        [Input("enableMultipleGrants")]
        public Input<bool>? EnableMultipleGrants { get; set; }

        /// <summary>
        /// Identifier for the integration; must be unique for your account.
        /// </summary>
        [Input("integrationName")]
        public Input<string>? IntegrationName { get; set; }

        /// <summary>
        /// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
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
        /// When this is set to true, allows the recipient role to grant the privileges to other roles.
        /// </summary>
        [Input("withGrantOption")]
        public Input<bool>? WithGrantOption { get; set; }

        public IntegrationGrantState()
        {
        }
        public static new IntegrationGrantState Empty => new IntegrationGrantState();
    }
}
