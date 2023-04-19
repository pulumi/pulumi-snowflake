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
    /// An External OAuth security integration allows a client to use a third-party authorization server to obtain the access tokens needed to interact with Snowflake.
    /// 
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
    ///     var azure = new Snowflake.ExternalOauthIntegration("azure", new()
    ///     {
    ///         AudienceUrls = new[]
    ///         {
    ///             "https://analysis.windows.net/powerbi/connector/Snowflake",
    ///         },
    ///         Enabled = true,
    ///         Issuer = "https://sts.windows.net/00000000-0000-0000-0000-000000000000",
    ///         JwsKeysUrls = new[]
    ///         {
    ///             "https://login.windows.net/common/discovery/keys",
    ///         },
    ///         SnowflakeUserMappingAttribute = "LOGIN_NAME",
    ///         TokenUserMappingClaims = new[]
    ///         {
    ///             "upn",
    ///         },
    ///         Type = "AZURE",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/externalOauthIntegration:ExternalOauthIntegration example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/externalOauthIntegration:ExternalOauthIntegration")]
    public partial class ExternalOauthIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the list of roles that the client can set as the primary role.
        /// </summary>
        [Output("allowedRoles")]
        public Output<ImmutableArray<string>> AllowedRoles { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
        /// </summary>
        [Output("anyRoleMode")]
        public Output<string?> AnyRoleMode { get; private set; } = null!;

        /// <summary>
        /// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
        /// </summary>
        [Output("audienceUrls")]
        public Output<ImmutableArray<string>> AudienceUrls { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
        /// </summary>
        [Output("blockedRoles")]
        public Output<ImmutableArray<string>> BlockedRoles { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Date and time when the External OAUTH integration was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to initiate operation of the integration or suspend it.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the URL to define the OAuth 2.0 authorization server.
        /// </summary>
        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
        /// </summary>
        [Output("jwsKeysUrls")]
        public Output<ImmutableArray<string>> JwsKeysUrls { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
        /// </summary>
        [Output("rsaPublicKey")]
        public Output<string?> RsaPublicKey { get; private set; } = null!;

        /// <summary>
        /// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
        /// </summary>
        [Output("rsaPublicKey2")]
        public Output<string?> RsaPublicKey2 { get; private set; } = null!;

        /// <summary>
        /// Specifies the scope delimiter in the authorization token.
        /// </summary>
        [Output("scopeDelimiter")]
        public Output<string?> ScopeDelimiter { get; private set; } = null!;

        /// <summary>
        /// Specifies the access token claim to map the access token to an account role.
        /// </summary>
        [Output("scopeMappingAttribute")]
        public Output<string?> ScopeMappingAttribute { get; private set; } = null!;

        /// <summary>
        /// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
        /// </summary>
        [Output("snowflakeUserMappingAttribute")]
        public Output<string> SnowflakeUserMappingAttribute { get; private set; } = null!;

        /// <summary>
        /// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
        /// </summary>
        [Output("tokenUserMappingClaims")]
        public Output<ImmutableArray<string>> TokenUserMappingClaims { get; private set; } = null!;

        /// <summary>
        /// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalOauthIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalOauthIntegration(string name, ExternalOauthIntegrationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/externalOauthIntegration:ExternalOauthIntegration", name, args ?? new ExternalOauthIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalOauthIntegration(string name, Input<string> id, ExternalOauthIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/externalOauthIntegration:ExternalOauthIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExternalOauthIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalOauthIntegration Get(string name, Input<string> id, ExternalOauthIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalOauthIntegration(name, id, state, options);
        }
    }

    public sealed class ExternalOauthIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedRoles")]
        private InputList<string>? _allowedRoles;

        /// <summary>
        /// Specifies the list of roles that the client can set as the primary role.
        /// </summary>
        public InputList<string> AllowedRoles
        {
            get => _allowedRoles ?? (_allowedRoles = new InputList<string>());
            set => _allowedRoles = value;
        }

        /// <summary>
        /// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
        /// </summary>
        [Input("anyRoleMode")]
        public Input<string>? AnyRoleMode { get; set; }

        [Input("audienceUrls")]
        private InputList<string>? _audienceUrls;

        /// <summary>
        /// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
        /// </summary>
        public InputList<string> AudienceUrls
        {
            get => _audienceUrls ?? (_audienceUrls = new InputList<string>());
            set => _audienceUrls = value;
        }

        [Input("blockedRoles")]
        private InputList<string>? _blockedRoles;

        /// <summary>
        /// Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
        /// </summary>
        public InputList<string> BlockedRoles
        {
            get => _blockedRoles ?? (_blockedRoles = new InputList<string>());
            set => _blockedRoles = value;
        }

        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether to initiate operation of the integration or suspend it.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Specifies the URL to define the OAuth 2.0 authorization server.
        /// </summary>
        [Input("issuer", required: true)]
        public Input<string> Issuer { get; set; } = null!;

        [Input("jwsKeysUrls")]
        private InputList<string>? _jwsKeysUrls;

        /// <summary>
        /// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
        /// </summary>
        public InputList<string> JwsKeysUrls
        {
            get => _jwsKeysUrls ?? (_jwsKeysUrls = new InputList<string>());
            set => _jwsKeysUrls = value;
        }

        /// <summary>
        /// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
        /// </summary>
        [Input("rsaPublicKey")]
        public Input<string>? RsaPublicKey { get; set; }

        /// <summary>
        /// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
        /// </summary>
        [Input("rsaPublicKey2")]
        public Input<string>? RsaPublicKey2 { get; set; }

        /// <summary>
        /// Specifies the scope delimiter in the authorization token.
        /// </summary>
        [Input("scopeDelimiter")]
        public Input<string>? ScopeDelimiter { get; set; }

        /// <summary>
        /// Specifies the access token claim to map the access token to an account role.
        /// </summary>
        [Input("scopeMappingAttribute")]
        public Input<string>? ScopeMappingAttribute { get; set; }

        /// <summary>
        /// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
        /// </summary>
        [Input("snowflakeUserMappingAttribute", required: true)]
        public Input<string> SnowflakeUserMappingAttribute { get; set; } = null!;

        [Input("tokenUserMappingClaims", required: true)]
        private InputList<string>? _tokenUserMappingClaims;

        /// <summary>
        /// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
        /// </summary>
        public InputList<string> TokenUserMappingClaims
        {
            get => _tokenUserMappingClaims ?? (_tokenUserMappingClaims = new InputList<string>());
            set => _tokenUserMappingClaims = value;
        }

        /// <summary>
        /// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ExternalOauthIntegrationArgs()
        {
        }
        public static new ExternalOauthIntegrationArgs Empty => new ExternalOauthIntegrationArgs();
    }

    public sealed class ExternalOauthIntegrationState : global::Pulumi.ResourceArgs
    {
        [Input("allowedRoles")]
        private InputList<string>? _allowedRoles;

        /// <summary>
        /// Specifies the list of roles that the client can set as the primary role.
        /// </summary>
        public InputList<string> AllowedRoles
        {
            get => _allowedRoles ?? (_allowedRoles = new InputList<string>());
            set => _allowedRoles = value;
        }

        /// <summary>
        /// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
        /// </summary>
        [Input("anyRoleMode")]
        public Input<string>? AnyRoleMode { get; set; }

        [Input("audienceUrls")]
        private InputList<string>? _audienceUrls;

        /// <summary>
        /// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
        /// </summary>
        public InputList<string> AudienceUrls
        {
            get => _audienceUrls ?? (_audienceUrls = new InputList<string>());
            set => _audienceUrls = value;
        }

        [Input("blockedRoles")]
        private InputList<string>? _blockedRoles;

        /// <summary>
        /// Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
        /// </summary>
        public InputList<string> BlockedRoles
        {
            get => _blockedRoles ?? (_blockedRoles = new InputList<string>());
            set => _blockedRoles = value;
        }

        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Date and time when the External OAUTH integration was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Specifies whether to initiate operation of the integration or suspend it.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the URL to define the OAuth 2.0 authorization server.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        [Input("jwsKeysUrls")]
        private InputList<string>? _jwsKeysUrls;

        /// <summary>
        /// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
        /// </summary>
        public InputList<string> JwsKeysUrls
        {
            get => _jwsKeysUrls ?? (_jwsKeysUrls = new InputList<string>());
            set => _jwsKeysUrls = value;
        }

        /// <summary>
        /// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
        /// </summary>
        [Input("rsaPublicKey")]
        public Input<string>? RsaPublicKey { get; set; }

        /// <summary>
        /// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
        /// </summary>
        [Input("rsaPublicKey2")]
        public Input<string>? RsaPublicKey2 { get; set; }

        /// <summary>
        /// Specifies the scope delimiter in the authorization token.
        /// </summary>
        [Input("scopeDelimiter")]
        public Input<string>? ScopeDelimiter { get; set; }

        /// <summary>
        /// Specifies the access token claim to map the access token to an account role.
        /// </summary>
        [Input("scopeMappingAttribute")]
        public Input<string>? ScopeMappingAttribute { get; set; }

        /// <summary>
        /// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
        /// </summary>
        [Input("snowflakeUserMappingAttribute")]
        public Input<string>? SnowflakeUserMappingAttribute { get; set; }

        [Input("tokenUserMappingClaims")]
        private InputList<string>? _tokenUserMappingClaims;

        /// <summary>
        /// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
        /// </summary>
        public InputList<string> TokenUserMappingClaims
        {
            get => _tokenUserMappingClaims ?? (_tokenUserMappingClaims = new InputList<string>());
            set => _tokenUserMappingClaims = value;
        }

        /// <summary>
        /// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ExternalOauthIntegrationState()
        {
        }
        public static new ExternalOauthIntegrationState Empty => new ExternalOauthIntegrationState();
    }
}
