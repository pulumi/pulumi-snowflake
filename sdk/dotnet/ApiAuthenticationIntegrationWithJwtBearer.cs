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
    /// ```sh
    /// $ pulumi import snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer example "name"
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer")]
    public partial class ApiAuthenticationIntegrationWithJwtBearer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the integration.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Specifies whether this security integration is enabled or disabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        /// </summary>
        [Output("oauthAccessTokenValidity")]
        public Output<int?> OauthAccessTokenValidity { get; private set; } = null!;

        [Output("oauthAssertionIssuer")]
        public Output<string> OauthAssertionIssuer { get; private set; } = null!;

        /// <summary>
        /// Specifies the URL for authenticating to the external service.
        /// </summary>
        [Output("oauthAuthorizationEndpoint")]
        public Output<string?> OauthAuthorizationEndpoint { get; private set; } = null!;

        /// <summary>
        /// Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        /// </summary>
        [Output("oauthClientAuthMethod")]
        public Output<string?> OauthClientAuthMethod { get; private set; } = null!;

        /// <summary>
        /// Specifies the client ID for the OAuth application in the external service.
        /// </summary>
        [Output("oauthClientId")]
        public Output<string> OauthClientId { get; private set; } = null!;

        /// <summary>
        /// Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        /// </summary>
        [Output("oauthClientSecret")]
        public Output<string> OauthClientSecret { get; private set; } = null!;

        /// <summary>
        /// Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        /// </summary>
        [Output("oauthRefreshTokenValidity")]
        public Output<int?> OauthRefreshTokenValidity { get; private set; } = null!;

        /// <summary>
        /// Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        /// </summary>
        [Output("oauthTokenEndpoint")]
        public Output<string?> OauthTokenEndpoint { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.ApiAuthenticationIntegrationWithJwtBearerShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a ApiAuthenticationIntegrationWithJwtBearer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiAuthenticationIntegrationWithJwtBearer(string name, ApiAuthenticationIntegrationWithJwtBearerArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer", name, args ?? new ApiAuthenticationIntegrationWithJwtBearerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiAuthenticationIntegrationWithJwtBearer(string name, Input<string> id, ApiAuthenticationIntegrationWithJwtBearerState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApiAuthenticationIntegrationWithJwtBearer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiAuthenticationIntegrationWithJwtBearer Get(string name, Input<string> id, ApiAuthenticationIntegrationWithJwtBearerState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiAuthenticationIntegrationWithJwtBearer(name, id, state, options);
        }
    }

    public sealed class ApiAuthenticationIntegrationWithJwtBearerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether this security integration is enabled or disabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        /// </summary>
        [Input("oauthAccessTokenValidity")]
        public Input<int>? OauthAccessTokenValidity { get; set; }

        [Input("oauthAssertionIssuer", required: true)]
        public Input<string> OauthAssertionIssuer { get; set; } = null!;

        /// <summary>
        /// Specifies the URL for authenticating to the external service.
        /// </summary>
        [Input("oauthAuthorizationEndpoint")]
        public Input<string>? OauthAuthorizationEndpoint { get; set; }

        /// <summary>
        /// Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        /// </summary>
        [Input("oauthClientAuthMethod")]
        public Input<string>? OauthClientAuthMethod { get; set; }

        /// <summary>
        /// Specifies the client ID for the OAuth application in the external service.
        /// </summary>
        [Input("oauthClientId", required: true)]
        public Input<string> OauthClientId { get; set; } = null!;

        /// <summary>
        /// Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        /// </summary>
        [Input("oauthClientSecret", required: true)]
        public Input<string> OauthClientSecret { get; set; } = null!;

        /// <summary>
        /// Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        /// </summary>
        [Input("oauthRefreshTokenValidity")]
        public Input<int>? OauthRefreshTokenValidity { get; set; }

        /// <summary>
        /// Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        /// </summary>
        [Input("oauthTokenEndpoint")]
        public Input<string>? OauthTokenEndpoint { get; set; }

        public ApiAuthenticationIntegrationWithJwtBearerArgs()
        {
        }
        public static new ApiAuthenticationIntegrationWithJwtBearerArgs Empty => new ApiAuthenticationIntegrationWithJwtBearerArgs();
    }

    public sealed class ApiAuthenticationIntegrationWithJwtBearerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        public InputList<Inputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Specifies whether this security integration is enabled or disabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        /// </summary>
        [Input("oauthAccessTokenValidity")]
        public Input<int>? OauthAccessTokenValidity { get; set; }

        [Input("oauthAssertionIssuer")]
        public Input<string>? OauthAssertionIssuer { get; set; }

        /// <summary>
        /// Specifies the URL for authenticating to the external service.
        /// </summary>
        [Input("oauthAuthorizationEndpoint")]
        public Input<string>? OauthAuthorizationEndpoint { get; set; }

        /// <summary>
        /// Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        /// </summary>
        [Input("oauthClientAuthMethod")]
        public Input<string>? OauthClientAuthMethod { get; set; }

        /// <summary>
        /// Specifies the client ID for the OAuth application in the external service.
        /// </summary>
        [Input("oauthClientId")]
        public Input<string>? OauthClientId { get; set; }

        /// <summary>
        /// Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        /// </summary>
        [Input("oauthClientSecret")]
        public Input<string>? OauthClientSecret { get; set; }

        /// <summary>
        /// Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        /// </summary>
        [Input("oauthRefreshTokenValidity")]
        public Input<int>? OauthRefreshTokenValidity { get; set; }

        /// <summary>
        /// Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        /// </summary>
        [Input("oauthTokenEndpoint")]
        public Input<string>? OauthTokenEndpoint { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        public InputList<Inputs.ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public ApiAuthenticationIntegrationWithJwtBearerState()
        {
        }
        public static new ApiAuthenticationIntegrationWithJwtBearerState Empty => new ApiAuthenticationIntegrationWithJwtBearerState();
    }
}
