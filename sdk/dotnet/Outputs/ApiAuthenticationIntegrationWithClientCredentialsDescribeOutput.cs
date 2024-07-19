// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class ApiAuthenticationIntegrationWithClientCredentialsDescribeOutput
    {
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputAuthType> AuthTypes;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputComment> Comments;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputEnabled> Enableds;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAccessTokenValidity> OauthAccessTokenValidities;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAllowedScope> OauthAllowedScopes;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAuthorizationEndpoint> OauthAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientAuthMethod> OauthClientAuthMethods;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientId> OauthClientIds;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthGrant> OauthGrants;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthRefreshTokenValidity> OauthRefreshTokenValidities;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthTokenEndpoint> OauthTokenEndpoints;
        public readonly ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputParentIntegration> ParentIntegrations;

        [OutputConstructor]
        private ApiAuthenticationIntegrationWithClientCredentialsDescribeOutput(
            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputAuthType> authTypes,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputComment> comments,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputEnabled> enableds,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAccessTokenValidity> oauthAccessTokenValidities,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAllowedScope> oauthAllowedScopes,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientAuthMethod> oauthClientAuthMethods,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthClientId> oauthClientIds,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthGrant> oauthGrants,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints,

            ImmutableArray<Outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputParentIntegration> parentIntegrations)
        {
            AuthTypes = authTypes;
            Comments = comments;
            Enableds = enableds;
            OauthAccessTokenValidities = oauthAccessTokenValidities;
            OauthAllowedScopes = oauthAllowedScopes;
            OauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            OauthClientAuthMethods = oauthClientAuthMethods;
            OauthClientIds = oauthClientIds;
            OauthGrants = oauthGrants;
            OauthRefreshTokenValidities = oauthRefreshTokenValidities;
            OauthTokenEndpoints = oauthTokenEndpoints;
            ParentIntegrations = parentIntegrations;
        }
    }
}