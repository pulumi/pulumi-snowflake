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
    public sealed class OauthIntegrationForPartnerApplicationsDescribeOutput
    {
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputBlockedRolesList> BlockedRolesLists;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputComment> Comments;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputEnabled> Enableds;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputNetworkPolicy> NetworkPolicies;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowNonTlsRedirectUri> OauthAllowNonTlsRedirectUris;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedAuthorizationEndpoint> OauthAllowedAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedTokenEndpoint> OauthAllowedTokenEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAuthorizationEndpoint> OauthAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientId> OauthClientIds;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKey2Fp> OauthClientRsaPublicKey2Fps;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKeyFp> OauthClientRsaPublicKeyFps;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientType> OauthClientTypes;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthEnforcePkce> OauthEnforcePkces;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthIssueRefreshToken> OauthIssueRefreshTokens;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRedirectUri> OauthRedirectUris;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRefreshTokenValidity> OauthRefreshTokenValidities;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthTokenEndpoint> OauthTokenEndpoints;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthUseSecondaryRole> OauthUseSecondaryRoles;
        public readonly ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesList> PreAuthorizedRolesLists;

        [OutputConstructor]
        private OauthIntegrationForPartnerApplicationsDescribeOutput(
            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputBlockedRolesList> blockedRolesLists,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputComment> comments,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputEnabled> enableds,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputNetworkPolicy> networkPolicies,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowNonTlsRedirectUri> oauthAllowNonTlsRedirectUris,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedAuthorizationEndpoint> oauthAllowedAuthorizationEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedTokenEndpoint> oauthAllowedTokenEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientId> oauthClientIds,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKey2Fp> oauthClientRsaPublicKey2Fps,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKeyFp> oauthClientRsaPublicKeyFps,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientType> oauthClientTypes,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthEnforcePkce> oauthEnforcePkces,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthIssueRefreshToken> oauthIssueRefreshTokens,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRedirectUri> oauthRedirectUris,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthUseSecondaryRole> oauthUseSecondaryRoles,

            ImmutableArray<Outputs.OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesList> preAuthorizedRolesLists)
        {
            BlockedRolesLists = blockedRolesLists;
            Comments = comments;
            Enableds = enableds;
            NetworkPolicies = networkPolicies;
            OauthAllowNonTlsRedirectUris = oauthAllowNonTlsRedirectUris;
            OauthAllowedAuthorizationEndpoints = oauthAllowedAuthorizationEndpoints;
            OauthAllowedTokenEndpoints = oauthAllowedTokenEndpoints;
            OauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            OauthClientIds = oauthClientIds;
            OauthClientRsaPublicKey2Fps = oauthClientRsaPublicKey2Fps;
            OauthClientRsaPublicKeyFps = oauthClientRsaPublicKeyFps;
            OauthClientTypes = oauthClientTypes;
            OauthEnforcePkces = oauthEnforcePkces;
            OauthIssueRefreshTokens = oauthIssueRefreshTokens;
            OauthRedirectUris = oauthRedirectUris;
            OauthRefreshTokenValidities = oauthRefreshTokenValidities;
            OauthTokenEndpoints = oauthTokenEndpoints;
            OauthUseSecondaryRoles = oauthUseSecondaryRoles;
            PreAuthorizedRolesLists = preAuthorizedRolesLists;
        }
    }
}