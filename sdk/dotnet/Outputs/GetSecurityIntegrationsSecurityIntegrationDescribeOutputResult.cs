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
    public sealed class GetSecurityIntegrationsSecurityIntegrationDescribeOutputResult
    {
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputAllowedEmailPatternResult> AllowedEmailPatterns;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputAllowedUserDomainResult> AllowedUserDomains;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputAuthTypeResult> AuthTypes;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputBlockedRolesListResult> BlockedRolesLists;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputCommentResult> Comments;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputEnabledResult> Enableds;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAllowedRolesListResult> ExternalOauthAllowedRolesLists;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAnyRoleModeResult> ExternalOauthAnyRoleModes;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceListResult> ExternalOauthAudienceLists;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthBlockedRolesListResult> ExternalOauthBlockedRolesLists;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthIssuerResult> ExternalOauthIssuers;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthJwsKeysUrlResult> ExternalOauthJwsKeysUrls;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthRsaPublicKey2Result> ExternalOauthRsaPublicKey2s;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthRsaPublicKeyResult> ExternalOauthRsaPublicKeys;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthScopeDelimiterResult> ExternalOauthScopeDelimiters;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthSnowflakeUserMappingAttributeResult> ExternalOauthSnowflakeUserMappingAttributes;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthTokenUserMappingClaimResult> ExternalOauthTokenUserMappingClaims;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputNetworkPolicyResult> NetworkPolicies;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAccessTokenValidityResult> OauthAccessTokenValidities;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowNonTlsRedirectUriResult> OauthAllowNonTlsRedirectUris;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowedAuthorizationEndpointResult> OauthAllowedAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowedScopeResult> OauthAllowedScopes;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowedTokenEndpointResult> OauthAllowedTokenEndpoints;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAuthorizationEndpointResult> OauthAuthorizationEndpoints;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientAuthMethodResult> OauthClientAuthMethods;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientIdResult> OauthClientIds;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientRsaPublicKey2FpResult> OauthClientRsaPublicKey2Fps;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientRsaPublicKeyFpResult> OauthClientRsaPublicKeyFps;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientTypeResult> OauthClientTypes;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthEnforcePkceResult> OauthEnforcePkces;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthGrantResult> OauthGrants;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthIssueRefreshTokenResult> OauthIssueRefreshTokens;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthRedirectUriResult> OauthRedirectUris;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthRefreshTokenValidityResult> OauthRefreshTokenValidities;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthTokenEndpointResult> OauthTokenEndpoints;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthUseSecondaryRoleResult> OauthUseSecondaryRoles;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputParentIntegrationResult> ParentIntegrations;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputPreAuthorizedRolesListResult> PreAuthorizedRolesLists;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputRunAsRoleResult> RunAsRoles;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2DigestMethodsUsedResult> Saml2DigestMethodsUseds;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2EnableSpInitiatedResult> Saml2EnableSpInitiateds;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2ForceAuthnResult> Saml2ForceAuthns;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2IssuerResult> Saml2Issuers;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2PostLogoutRedirectUrlResult> Saml2PostLogoutRedirectUrls;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2ProviderResult> Saml2Providers;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2RequestedNameidFormatResult> Saml2RequestedNameidFormats;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SignRequestResult> Saml2SignRequests;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SignatureMethodsUsedResult> Saml2SignatureMethodsUseds;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeAcsUrlResult> Saml2SnowflakeAcsUrls;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeIssuerUrlResult> Saml2SnowflakeIssuerUrls;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeMetadataResult> Saml2SnowflakeMetadatas;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeX509CertResult> Saml2SnowflakeX509Certs;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SpInitiatedLoginPageLabelResult> Saml2SpInitiatedLoginPageLabels;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SsoUrlResult> Saml2SsoUrls;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2X509CertResult> Saml2X509Certs;
        public readonly ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSyncPasswordResult> SyncPasswords;

        [OutputConstructor]
        private GetSecurityIntegrationsSecurityIntegrationDescribeOutputResult(
            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputAllowedEmailPatternResult> allowedEmailPatterns,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputAllowedUserDomainResult> allowedUserDomains,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputAuthTypeResult> authTypes,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputBlockedRolesListResult> blockedRolesLists,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputCommentResult> comments,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputEnabledResult> enableds,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAllowedRolesListResult> externalOauthAllowedRolesLists,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAnyRoleModeResult> externalOauthAnyRoleModes,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceListResult> externalOauthAudienceLists,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthBlockedRolesListResult> externalOauthBlockedRolesLists,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthIssuerResult> externalOauthIssuers,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthJwsKeysUrlResult> externalOauthJwsKeysUrls,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthRsaPublicKey2Result> externalOauthRsaPublicKey2s,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthRsaPublicKeyResult> externalOauthRsaPublicKeys,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthScopeDelimiterResult> externalOauthScopeDelimiters,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthSnowflakeUserMappingAttributeResult> externalOauthSnowflakeUserMappingAttributes,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthTokenUserMappingClaimResult> externalOauthTokenUserMappingClaims,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputNetworkPolicyResult> networkPolicies,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAccessTokenValidityResult> oauthAccessTokenValidities,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowNonTlsRedirectUriResult> oauthAllowNonTlsRedirectUris,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowedAuthorizationEndpointResult> oauthAllowedAuthorizationEndpoints,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowedScopeResult> oauthAllowedScopes,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAllowedTokenEndpointResult> oauthAllowedTokenEndpoints,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthAuthorizationEndpointResult> oauthAuthorizationEndpoints,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientAuthMethodResult> oauthClientAuthMethods,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientIdResult> oauthClientIds,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientRsaPublicKey2FpResult> oauthClientRsaPublicKey2Fps,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientRsaPublicKeyFpResult> oauthClientRsaPublicKeyFps,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthClientTypeResult> oauthClientTypes,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthEnforcePkceResult> oauthEnforcePkces,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthGrantResult> oauthGrants,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthIssueRefreshTokenResult> oauthIssueRefreshTokens,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthRedirectUriResult> oauthRedirectUris,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthRefreshTokenValidityResult> oauthRefreshTokenValidities,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthTokenEndpointResult> oauthTokenEndpoints,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputOauthUseSecondaryRoleResult> oauthUseSecondaryRoles,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputParentIntegrationResult> parentIntegrations,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputPreAuthorizedRolesListResult> preAuthorizedRolesLists,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputRunAsRoleResult> runAsRoles,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2DigestMethodsUsedResult> saml2DigestMethodsUseds,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2EnableSpInitiatedResult> saml2EnableSpInitiateds,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2ForceAuthnResult> saml2ForceAuthns,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2IssuerResult> saml2Issuers,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2PostLogoutRedirectUrlResult> saml2PostLogoutRedirectUrls,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2ProviderResult> saml2Providers,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2RequestedNameidFormatResult> saml2RequestedNameidFormats,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SignRequestResult> saml2SignRequests,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SignatureMethodsUsedResult> saml2SignatureMethodsUseds,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeAcsUrlResult> saml2SnowflakeAcsUrls,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeIssuerUrlResult> saml2SnowflakeIssuerUrls,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeMetadataResult> saml2SnowflakeMetadatas,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SnowflakeX509CertResult> saml2SnowflakeX509Certs,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SpInitiatedLoginPageLabelResult> saml2SpInitiatedLoginPageLabels,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2SsoUrlResult> saml2SsoUrls,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSaml2X509CertResult> saml2X509Certs,

            ImmutableArray<Outputs.GetSecurityIntegrationsSecurityIntegrationDescribeOutputSyncPasswordResult> syncPasswords)
        {
            AllowedEmailPatterns = allowedEmailPatterns;
            AllowedUserDomains = allowedUserDomains;
            AuthTypes = authTypes;
            BlockedRolesLists = blockedRolesLists;
            Comments = comments;
            Enableds = enableds;
            ExternalOauthAllowedRolesLists = externalOauthAllowedRolesLists;
            ExternalOauthAnyRoleModes = externalOauthAnyRoleModes;
            ExternalOauthAudienceLists = externalOauthAudienceLists;
            ExternalOauthBlockedRolesLists = externalOauthBlockedRolesLists;
            ExternalOauthIssuers = externalOauthIssuers;
            ExternalOauthJwsKeysUrls = externalOauthJwsKeysUrls;
            ExternalOauthRsaPublicKey2s = externalOauthRsaPublicKey2s;
            ExternalOauthRsaPublicKeys = externalOauthRsaPublicKeys;
            ExternalOauthScopeDelimiters = externalOauthScopeDelimiters;
            ExternalOauthSnowflakeUserMappingAttributes = externalOauthSnowflakeUserMappingAttributes;
            ExternalOauthTokenUserMappingClaims = externalOauthTokenUserMappingClaims;
            NetworkPolicies = networkPolicies;
            OauthAccessTokenValidities = oauthAccessTokenValidities;
            OauthAllowNonTlsRedirectUris = oauthAllowNonTlsRedirectUris;
            OauthAllowedAuthorizationEndpoints = oauthAllowedAuthorizationEndpoints;
            OauthAllowedScopes = oauthAllowedScopes;
            OauthAllowedTokenEndpoints = oauthAllowedTokenEndpoints;
            OauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            OauthClientAuthMethods = oauthClientAuthMethods;
            OauthClientIds = oauthClientIds;
            OauthClientRsaPublicKey2Fps = oauthClientRsaPublicKey2Fps;
            OauthClientRsaPublicKeyFps = oauthClientRsaPublicKeyFps;
            OauthClientTypes = oauthClientTypes;
            OauthEnforcePkces = oauthEnforcePkces;
            OauthGrants = oauthGrants;
            OauthIssueRefreshTokens = oauthIssueRefreshTokens;
            OauthRedirectUris = oauthRedirectUris;
            OauthRefreshTokenValidities = oauthRefreshTokenValidities;
            OauthTokenEndpoints = oauthTokenEndpoints;
            OauthUseSecondaryRoles = oauthUseSecondaryRoles;
            ParentIntegrations = parentIntegrations;
            PreAuthorizedRolesLists = preAuthorizedRolesLists;
            RunAsRoles = runAsRoles;
            Saml2DigestMethodsUseds = saml2DigestMethodsUseds;
            Saml2EnableSpInitiateds = saml2EnableSpInitiateds;
            Saml2ForceAuthns = saml2ForceAuthns;
            Saml2Issuers = saml2Issuers;
            Saml2PostLogoutRedirectUrls = saml2PostLogoutRedirectUrls;
            Saml2Providers = saml2Providers;
            Saml2RequestedNameidFormats = saml2RequestedNameidFormats;
            Saml2SignRequests = saml2SignRequests;
            Saml2SignatureMethodsUseds = saml2SignatureMethodsUseds;
            Saml2SnowflakeAcsUrls = saml2SnowflakeAcsUrls;
            Saml2SnowflakeIssuerUrls = saml2SnowflakeIssuerUrls;
            Saml2SnowflakeMetadatas = saml2SnowflakeMetadatas;
            Saml2SnowflakeX509Certs = saml2SnowflakeX509Certs;
            Saml2SpInitiatedLoginPageLabels = saml2SpInitiatedLoginPageLabels;
            Saml2SsoUrls = saml2SsoUrls;
            Saml2X509Certs = saml2X509Certs;
            SyncPasswords = syncPasswords;
        }
    }
}