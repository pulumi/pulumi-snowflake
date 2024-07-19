// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class OauthIntegrationForCustomClientsDescribeOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockedRolesLists")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs>? _blockedRolesLists;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs> BlockedRolesLists
        {
            get => _blockedRolesLists ?? (_blockedRolesLists = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs>());
            set => _blockedRolesLists = value;
        }

        [Input("comments")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputCommentArgs>? _comments;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputCommentArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputCommentArgs>());
            set => _comments = value;
        }

        [Input("enableds")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledArgs>? _enableds;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledArgs> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledArgs>());
            set => _enableds = value;
        }

        [Input("networkPolicies")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs>? _networkPolicies;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs> NetworkPolicies
        {
            get => _networkPolicies ?? (_networkPolicies = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs>());
            set => _networkPolicies = value;
        }

        [Input("oauthAllowNonTlsRedirectUris")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs>? _oauthAllowNonTlsRedirectUris;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs> OauthAllowNonTlsRedirectUris
        {
            get => _oauthAllowNonTlsRedirectUris ?? (_oauthAllowNonTlsRedirectUris = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs>());
            set => _oauthAllowNonTlsRedirectUris = value;
        }

        [Input("oauthAllowedAuthorizationEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs>? _oauthAllowedAuthorizationEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs> OauthAllowedAuthorizationEndpoints
        {
            get => _oauthAllowedAuthorizationEndpoints ?? (_oauthAllowedAuthorizationEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs>());
            set => _oauthAllowedAuthorizationEndpoints = value;
        }

        [Input("oauthAllowedTokenEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs>? _oauthAllowedTokenEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs> OauthAllowedTokenEndpoints
        {
            get => _oauthAllowedTokenEndpoints ?? (_oauthAllowedTokenEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs>());
            set => _oauthAllowedTokenEndpoints = value;
        }

        [Input("oauthAuthorizationEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs>? _oauthAuthorizationEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs> OauthAuthorizationEndpoints
        {
            get => _oauthAuthorizationEndpoints ?? (_oauthAuthorizationEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs>());
            set => _oauthAuthorizationEndpoints = value;
        }

        [Input("oauthClientIds")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientIdArgs>? _oauthClientIds;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientIdArgs> OauthClientIds
        {
            get => _oauthClientIds ?? (_oauthClientIds = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientIdArgs>());
            set => _oauthClientIds = value;
        }

        [Input("oauthClientRsaPublicKey2Fps")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs>? _oauthClientRsaPublicKey2Fps;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs> OauthClientRsaPublicKey2Fps
        {
            get => _oauthClientRsaPublicKey2Fps ?? (_oauthClientRsaPublicKey2Fps = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs>());
            set => _oauthClientRsaPublicKey2Fps = value;
        }

        [Input("oauthClientRsaPublicKeyFps")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs>? _oauthClientRsaPublicKeyFps;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs> OauthClientRsaPublicKeyFps
        {
            get => _oauthClientRsaPublicKeyFps ?? (_oauthClientRsaPublicKeyFps = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs>());
            set => _oauthClientRsaPublicKeyFps = value;
        }

        [Input("oauthClientTypes")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs>? _oauthClientTypes;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs> OauthClientTypes
        {
            get => _oauthClientTypes ?? (_oauthClientTypes = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs>());
            set => _oauthClientTypes = value;
        }

        [Input("oauthEnforcePkces")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs>? _oauthEnforcePkces;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs> OauthEnforcePkces
        {
            get => _oauthEnforcePkces ?? (_oauthEnforcePkces = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs>());
            set => _oauthEnforcePkces = value;
        }

        [Input("oauthIssueRefreshTokens")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs>? _oauthIssueRefreshTokens;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs> OauthIssueRefreshTokens
        {
            get => _oauthIssueRefreshTokens ?? (_oauthIssueRefreshTokens = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs>());
            set => _oauthIssueRefreshTokens = value;
        }

        [Input("oauthRedirectUris")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRedirectUriArgs>? _oauthRedirectUris;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRedirectUriArgs> OauthRedirectUris
        {
            get => _oauthRedirectUris ?? (_oauthRedirectUris = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRedirectUriArgs>());
            set => _oauthRedirectUris = value;
        }

        [Input("oauthRefreshTokenValidities")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs>? _oauthRefreshTokenValidities;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs> OauthRefreshTokenValidities
        {
            get => _oauthRefreshTokenValidities ?? (_oauthRefreshTokenValidities = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs>());
            set => _oauthRefreshTokenValidities = value;
        }

        [Input("oauthTokenEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs>? _oauthTokenEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs> OauthTokenEndpoints
        {
            get => _oauthTokenEndpoints ?? (_oauthTokenEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs>());
            set => _oauthTokenEndpoints = value;
        }

        [Input("oauthUseSecondaryRoles")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs>? _oauthUseSecondaryRoles;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs> OauthUseSecondaryRoles
        {
            get => _oauthUseSecondaryRoles ?? (_oauthUseSecondaryRoles = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs>());
            set => _oauthUseSecondaryRoles = value;
        }

        [Input("preAuthorizedRolesLists")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs>? _preAuthorizedRolesLists;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs> PreAuthorizedRolesLists
        {
            get => _preAuthorizedRolesLists ?? (_preAuthorizedRolesLists = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs>());
            set => _preAuthorizedRolesLists = value;
        }

        public OauthIntegrationForCustomClientsDescribeOutputArgs()
        {
        }
        public static new OauthIntegrationForCustomClientsDescribeOutputArgs Empty => new OauthIntegrationForCustomClientsDescribeOutputArgs();
    }
}