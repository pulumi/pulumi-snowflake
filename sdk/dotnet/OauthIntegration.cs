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
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var tableauDesktop = new Snowflake.OauthIntegration("tableau_desktop", new()
    ///     {
    ///         Name = "TABLEAU_DESKTOP",
    ///         OauthClient = "TABLEAU_DESKTOP",
    ///         Enabled = true,
    ///         OauthIssueRefreshTokens = true,
    ///         OauthRefreshTokenValidity = 3600,
    ///         BlockedRolesLists = new[]
    ///         {
    ///             "SYSADMIN",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/oauthIntegration:OauthIntegration example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/oauthIntegration:OauthIntegration")]
    public partial class OauthIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
        /// </summary>
        [Output("blockedRolesLists")]
        public Output<ImmutableArray<string>> BlockedRolesLists { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Date and time when the OAuth integration was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Specifies whether this OAuth integration is enabled or disabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the OAuth client type.
        /// </summary>
        [Output("oauthClient")]
        public Output<string> OauthClient { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of client being registered. Snowflake supports both confidential and public clients.
        /// </summary>
        [Output("oauthClientType")]
        public Output<string?> OauthClientType { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
        /// </summary>
        [Output("oauthIssueRefreshTokens")]
        public Output<bool?> OauthIssueRefreshTokens { get; private set; } = null!;

        /// <summary>
        /// Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
        /// </summary>
        [Output("oauthRedirectUri")]
        public Output<string?> OauthRedirectUri { get; private set; } = null!;

        /// <summary>
        /// Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        /// </summary>
        [Output("oauthRefreshTokenValidity")]
        public Output<int?> OauthRefreshTokenValidity { get; private set; } = null!;

        /// <summary>
        /// Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
        /// </summary>
        [Output("oauthUseSecondaryRoles")]
        public Output<string?> OauthUseSecondaryRoles { get; private set; } = null!;


        /// <summary>
        /// Create a OauthIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OauthIntegration(string name, OauthIntegrationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/oauthIntegration:OauthIntegration", name, args ?? new OauthIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OauthIntegration(string name, Input<string> id, OauthIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/oauthIntegration:OauthIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OauthIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OauthIntegration Get(string name, Input<string> id, OauthIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new OauthIntegration(name, id, state, options);
        }
    }

    public sealed class OauthIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockedRolesLists")]
        private InputList<string>? _blockedRolesLists;

        /// <summary>
        /// List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
        /// </summary>
        public InputList<string> BlockedRolesLists
        {
            get => _blockedRolesLists ?? (_blockedRolesLists = new InputList<string>());
            set => _blockedRolesLists = value;
        }

        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether this OAuth integration is enabled or disabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the OAuth client type.
        /// </summary>
        [Input("oauthClient", required: true)]
        public Input<string> OauthClient { get; set; } = null!;

        /// <summary>
        /// Specifies the type of client being registered. Snowflake supports both confidential and public clients.
        /// </summary>
        [Input("oauthClientType")]
        public Input<string>? OauthClientType { get; set; }

        /// <summary>
        /// Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
        /// </summary>
        [Input("oauthIssueRefreshTokens")]
        public Input<bool>? OauthIssueRefreshTokens { get; set; }

        /// <summary>
        /// Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
        /// </summary>
        [Input("oauthRedirectUri")]
        public Input<string>? OauthRedirectUri { get; set; }

        /// <summary>
        /// Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        /// </summary>
        [Input("oauthRefreshTokenValidity")]
        public Input<int>? OauthRefreshTokenValidity { get; set; }

        /// <summary>
        /// Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
        /// </summary>
        [Input("oauthUseSecondaryRoles")]
        public Input<string>? OauthUseSecondaryRoles { get; set; }

        public OauthIntegrationArgs()
        {
        }
        public static new OauthIntegrationArgs Empty => new OauthIntegrationArgs();
    }

    public sealed class OauthIntegrationState : global::Pulumi.ResourceArgs
    {
        [Input("blockedRolesLists")]
        private InputList<string>? _blockedRolesLists;

        /// <summary>
        /// List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
        /// </summary>
        public InputList<string> BlockedRolesLists
        {
            get => _blockedRolesLists ?? (_blockedRolesLists = new InputList<string>());
            set => _blockedRolesLists = value;
        }

        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Date and time when the OAuth integration was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Specifies whether this OAuth integration is enabled or disabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the OAuth client type.
        /// </summary>
        [Input("oauthClient")]
        public Input<string>? OauthClient { get; set; }

        /// <summary>
        /// Specifies the type of client being registered. Snowflake supports both confidential and public clients.
        /// </summary>
        [Input("oauthClientType")]
        public Input<string>? OauthClientType { get; set; }

        /// <summary>
        /// Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
        /// </summary>
        [Input("oauthIssueRefreshTokens")]
        public Input<bool>? OauthIssueRefreshTokens { get; set; }

        /// <summary>
        /// Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
        /// </summary>
        [Input("oauthRedirectUri")]
        public Input<string>? OauthRedirectUri { get; set; }

        /// <summary>
        /// Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        /// </summary>
        [Input("oauthRefreshTokenValidity")]
        public Input<int>? OauthRefreshTokenValidity { get; set; }

        /// <summary>
        /// Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
        /// </summary>
        [Input("oauthUseSecondaryRoles")]
        public Input<string>? OauthUseSecondaryRoles { get; set; }

        public OauthIntegrationState()
        {
        }
        public static new OauthIntegrationState Empty => new OauthIntegrationState();
    }
}
