// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class OauthIntegrationForCustomClientsDescribeOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockedRolesLists")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListGetArgs>? _blockedRolesLists;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListGetArgs> BlockedRolesLists
        {
            get => _blockedRolesLists ?? (_blockedRolesLists = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListGetArgs>());
            set => _blockedRolesLists = value;
        }

        [Input("comments")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputCommentGetArgs>? _comments;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputCommentGetArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputCommentGetArgs>());
            set => _comments = value;
        }

        [Input("enableds")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledGetArgs>? _enableds;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledGetArgs> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledGetArgs>());
            set => _enableds = value;
        }

        [Input("networkPolicies")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyGetArgs>? _networkPolicies;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyGetArgs> NetworkPolicies
        {
            get => _networkPolicies ?? (_networkPolicies = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyGetArgs>());
            set => _networkPolicies = value;
        }

        [Input("oauthAllowNonTlsRedirectUris")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriGetArgs>? _oauthAllowNonTlsRedirectUris;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriGetArgs> OauthAllowNonTlsRedirectUris
        {
            get => _oauthAllowNonTlsRedirectUris ?? (_oauthAllowNonTlsRedirectUris = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriGetArgs>());
            set => _oauthAllowNonTlsRedirectUris = value;
        }

        [Input("oauthAllowedAuthorizationEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointGetArgs>? _oauthAllowedAuthorizationEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointGetArgs> OauthAllowedAuthorizationEndpoints
        {
            get => _oauthAllowedAuthorizationEndpoints ?? (_oauthAllowedAuthorizationEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointGetArgs>());
            set => _oauthAllowedAuthorizationEndpoints = value;
        }

        [Input("oauthAllowedTokenEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointGetArgs>? _oauthAllowedTokenEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointGetArgs> OauthAllowedTokenEndpoints
        {
            get => _oauthAllowedTokenEndpoints ?? (_oauthAllowedTokenEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointGetArgs>());
            set => _oauthAllowedTokenEndpoints = value;
        }

        [Input("oauthAuthorizationEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointGetArgs>? _oauthAuthorizationEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointGetArgs> OauthAuthorizationEndpoints
        {
            get => _oauthAuthorizationEndpoints ?? (_oauthAuthorizationEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointGetArgs>());
            set => _oauthAuthorizationEndpoints = value;
        }

        [Input("oauthClientRsaPublicKey2Fps")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpGetArgs>? _oauthClientRsaPublicKey2Fps;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpGetArgs> OauthClientRsaPublicKey2Fps
        {
            get => _oauthClientRsaPublicKey2Fps ?? (_oauthClientRsaPublicKey2Fps = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpGetArgs>());
            set => _oauthClientRsaPublicKey2Fps = value;
        }

        [Input("oauthClientRsaPublicKeyFps")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpGetArgs>? _oauthClientRsaPublicKeyFps;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpGetArgs> OauthClientRsaPublicKeyFps
        {
            get => _oauthClientRsaPublicKeyFps ?? (_oauthClientRsaPublicKeyFps = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpGetArgs>());
            set => _oauthClientRsaPublicKeyFps = value;
        }

        [Input("oauthClientTypes")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeGetArgs>? _oauthClientTypes;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeGetArgs> OauthClientTypes
        {
            get => _oauthClientTypes ?? (_oauthClientTypes = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeGetArgs>());
            set => _oauthClientTypes = value;
        }

        [Input("oauthEnforcePkces")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceGetArgs>? _oauthEnforcePkces;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceGetArgs> OauthEnforcePkces
        {
            get => _oauthEnforcePkces ?? (_oauthEnforcePkces = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceGetArgs>());
            set => _oauthEnforcePkces = value;
        }

        [Input("oauthIssueRefreshTokens")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenGetArgs>? _oauthIssueRefreshTokens;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenGetArgs> OauthIssueRefreshTokens
        {
            get => _oauthIssueRefreshTokens ?? (_oauthIssueRefreshTokens = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenGetArgs>());
            set => _oauthIssueRefreshTokens = value;
        }

        [Input("oauthRefreshTokenValidities")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityGetArgs>? _oauthRefreshTokenValidities;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityGetArgs> OauthRefreshTokenValidities
        {
            get => _oauthRefreshTokenValidities ?? (_oauthRefreshTokenValidities = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityGetArgs>());
            set => _oauthRefreshTokenValidities = value;
        }

        [Input("oauthTokenEndpoints")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointGetArgs>? _oauthTokenEndpoints;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointGetArgs> OauthTokenEndpoints
        {
            get => _oauthTokenEndpoints ?? (_oauthTokenEndpoints = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointGetArgs>());
            set => _oauthTokenEndpoints = value;
        }

        [Input("oauthUseSecondaryRoles")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleGetArgs>? _oauthUseSecondaryRoles;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleGetArgs> OauthUseSecondaryRoles
        {
            get => _oauthUseSecondaryRoles ?? (_oauthUseSecondaryRoles = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleGetArgs>());
            set => _oauthUseSecondaryRoles = value;
        }

        [Input("preAuthorizedRolesLists")]
        private InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListGetArgs>? _preAuthorizedRolesLists;
        public InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListGetArgs> PreAuthorizedRolesLists
        {
            get => _preAuthorizedRolesLists ?? (_preAuthorizedRolesLists = new InputList<Inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListGetArgs>());
            set => _preAuthorizedRolesLists = value;
        }

        public OauthIntegrationForCustomClientsDescribeOutputGetArgs()
        {
        }
        public static new OauthIntegrationForCustomClientsDescribeOutputGetArgs Empty => new OauthIntegrationForCustomClientsDescribeOutputGetArgs();
    }
}
