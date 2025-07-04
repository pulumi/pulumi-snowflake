// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("authTypes")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputAuthTypeArgs>? _authTypes;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputAuthTypeArgs> AuthTypes
        {
            get => _authTypes ?? (_authTypes = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputAuthTypeArgs>());
            set => _authTypes = value;
        }

        [Input("comments")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputCommentArgs>? _comments;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputCommentArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputCommentArgs>());
            set => _comments = value;
        }

        [Input("enableds")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputEnabledArgs>? _enableds;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputEnabledArgs> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputEnabledArgs>());
            set => _enableds = value;
        }

        [Input("oauthAccessTokenValidities")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAccessTokenValidityArgs>? _oauthAccessTokenValidities;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAccessTokenValidityArgs> OauthAccessTokenValidities
        {
            get => _oauthAccessTokenValidities ?? (_oauthAccessTokenValidities = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAccessTokenValidityArgs>());
            set => _oauthAccessTokenValidities = value;
        }

        [Input("oauthAllowedScopes")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAllowedScopeArgs>? _oauthAllowedScopes;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAllowedScopeArgs> OauthAllowedScopes
        {
            get => _oauthAllowedScopes ?? (_oauthAllowedScopes = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAllowedScopeArgs>());
            set => _oauthAllowedScopes = value;
        }

        [Input("oauthAuthorizationEndpoints")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAuthorizationEndpointArgs>? _oauthAuthorizationEndpoints;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAuthorizationEndpointArgs> OauthAuthorizationEndpoints
        {
            get => _oauthAuthorizationEndpoints ?? (_oauthAuthorizationEndpoints = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAuthorizationEndpointArgs>());
            set => _oauthAuthorizationEndpoints = value;
        }

        [Input("oauthClientAuthMethods")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientAuthMethodArgs>? _oauthClientAuthMethods;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientAuthMethodArgs> OauthClientAuthMethods
        {
            get => _oauthClientAuthMethods ?? (_oauthClientAuthMethods = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientAuthMethodArgs>());
            set => _oauthClientAuthMethods = value;
        }

        [Input("oauthGrants")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthGrantArgs>? _oauthGrants;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthGrantArgs> OauthGrants
        {
            get => _oauthGrants ?? (_oauthGrants = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthGrantArgs>());
            set => _oauthGrants = value;
        }

        [Input("oauthRefreshTokenValidities")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthRefreshTokenValidityArgs>? _oauthRefreshTokenValidities;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthRefreshTokenValidityArgs> OauthRefreshTokenValidities
        {
            get => _oauthRefreshTokenValidities ?? (_oauthRefreshTokenValidities = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthRefreshTokenValidityArgs>());
            set => _oauthRefreshTokenValidities = value;
        }

        [Input("oauthTokenEndpoints")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthTokenEndpointArgs>? _oauthTokenEndpoints;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthTokenEndpointArgs> OauthTokenEndpoints
        {
            get => _oauthTokenEndpoints ?? (_oauthTokenEndpoints = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthTokenEndpointArgs>());
            set => _oauthTokenEndpoints = value;
        }

        [Input("parentIntegrations")]
        private InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputParentIntegrationArgs>? _parentIntegrations;
        public InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputParentIntegrationArgs> ParentIntegrations
        {
            get => _parentIntegrations ?? (_parentIntegrations = new InputList<Inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputParentIntegrationArgs>());
            set => _parentIntegrations = value;
        }

        public ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs()
        {
        }
        public static new ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs Empty => new ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs();
    }
}
