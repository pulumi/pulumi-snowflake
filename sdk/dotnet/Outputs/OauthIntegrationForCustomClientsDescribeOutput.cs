// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class OauthIntegrationForCustomClientsDescribeOutput
    {
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList> BlockedRolesLists;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputComment> Comments;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputEnabled> Enableds;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy> NetworkPolicies;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri> OauthAllowNonTlsRedirectUris;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint> OauthAllowedAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint> OauthAllowedTokenEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint> OauthAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp> OauthClientRsaPublicKey2Fps;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp> OauthClientRsaPublicKeyFps;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientType> OauthClientTypes;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce> OauthEnforcePkces;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken> OauthIssueRefreshTokens;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity> OauthRefreshTokenValidities;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint> OauthTokenEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole> OauthUseSecondaryRoles;
        public readonly ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList> PreAuthorizedRolesLists;

        [OutputConstructor]
        private OauthIntegrationForCustomClientsDescribeOutput(
            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList> blockedRolesLists,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputComment> comments,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputEnabled> enableds,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy> networkPolicies,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri> oauthAllowNonTlsRedirectUris,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint> oauthAllowedAuthorizationEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint> oauthAllowedTokenEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp> oauthClientRsaPublicKey2Fps,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp> oauthClientRsaPublicKeyFps,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientType> oauthClientTypes,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce> oauthEnforcePkces,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken> oauthIssueRefreshTokens,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole> oauthUseSecondaryRoles,

            ImmutableArray<Outputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList> preAuthorizedRolesLists)
        {
            BlockedRolesLists = blockedRolesLists;
            Comments = comments;
            Enableds = enableds;
            NetworkPolicies = networkPolicies;
            OauthAllowNonTlsRedirectUris = oauthAllowNonTlsRedirectUris;
            OauthAllowedAuthorizationEndpoints = oauthAllowedAuthorizationEndpoints;
            OauthAllowedTokenEndpoints = oauthAllowedTokenEndpoints;
            OauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            OauthClientRsaPublicKey2Fps = oauthClientRsaPublicKey2Fps;
            OauthClientRsaPublicKeyFps = oauthClientRsaPublicKeyFps;
            OauthClientTypes = oauthClientTypes;
            OauthEnforcePkces = oauthEnforcePkces;
            OauthIssueRefreshTokens = oauthIssueRefreshTokens;
            OauthRefreshTokenValidities = oauthRefreshTokenValidities;
            OauthTokenEndpoints = oauthTokenEndpoints;
            OauthUseSecondaryRoles = oauthUseSecondaryRoles;
            PreAuthorizedRolesLists = preAuthorizedRolesLists;
        }
    }
}
