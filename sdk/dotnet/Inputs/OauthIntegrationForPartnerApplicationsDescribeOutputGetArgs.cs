// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class OauthIntegrationForPartnerApplicationsDescribeOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockedRolesLists")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputBlockedRolesListGetArgs>? _blockedRolesLists;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputBlockedRolesListGetArgs> BlockedRolesLists
        {
            get => _blockedRolesLists ?? (_blockedRolesLists = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputBlockedRolesListGetArgs>());
            set => _blockedRolesLists = value;
        }

        [Input("comments")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputCommentGetArgs>? _comments;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputCommentGetArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputCommentGetArgs>());
            set => _comments = value;
        }

        [Input("enableds")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputEnabledGetArgs>? _enableds;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputEnabledGetArgs> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputEnabledGetArgs>());
            set => _enableds = value;
        }

        [Input("networkPolicies")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputNetworkPolicyGetArgs>? _networkPolicies;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputNetworkPolicyGetArgs> NetworkPolicies
        {
            get => _networkPolicies ?? (_networkPolicies = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputNetworkPolicyGetArgs>());
            set => _networkPolicies = value;
        }

        [Input("oauthAllowNonTlsRedirectUris")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowNonTlsRedirectUriGetArgs>? _oauthAllowNonTlsRedirectUris;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowNonTlsRedirectUriGetArgs> OauthAllowNonTlsRedirectUris
        {
            get => _oauthAllowNonTlsRedirectUris ?? (_oauthAllowNonTlsRedirectUris = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowNonTlsRedirectUriGetArgs>());
            set => _oauthAllowNonTlsRedirectUris = value;
        }

        [Input("oauthAllowedAuthorizationEndpoints")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedAuthorizationEndpointGetArgs>? _oauthAllowedAuthorizationEndpoints;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedAuthorizationEndpointGetArgs> OauthAllowedAuthorizationEndpoints
        {
            get => _oauthAllowedAuthorizationEndpoints ?? (_oauthAllowedAuthorizationEndpoints = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedAuthorizationEndpointGetArgs>());
            set => _oauthAllowedAuthorizationEndpoints = value;
        }

        [Input("oauthAllowedTokenEndpoints")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedTokenEndpointGetArgs>? _oauthAllowedTokenEndpoints;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedTokenEndpointGetArgs> OauthAllowedTokenEndpoints
        {
            get => _oauthAllowedTokenEndpoints ?? (_oauthAllowedTokenEndpoints = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAllowedTokenEndpointGetArgs>());
            set => _oauthAllowedTokenEndpoints = value;
        }

        [Input("oauthAuthorizationEndpoints")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAuthorizationEndpointGetArgs>? _oauthAuthorizationEndpoints;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAuthorizationEndpointGetArgs> OauthAuthorizationEndpoints
        {
            get => _oauthAuthorizationEndpoints ?? (_oauthAuthorizationEndpoints = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthAuthorizationEndpointGetArgs>());
            set => _oauthAuthorizationEndpoints = value;
        }

        [Input("oauthClientIds")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientIdGetArgs>? _oauthClientIds;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientIdGetArgs> OauthClientIds
        {
            get => _oauthClientIds ?? (_oauthClientIds = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientIdGetArgs>());
            set => _oauthClientIds = value;
        }

        [Input("oauthClientRsaPublicKey2Fps")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKey2FpGetArgs>? _oauthClientRsaPublicKey2Fps;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKey2FpGetArgs> OauthClientRsaPublicKey2Fps
        {
            get => _oauthClientRsaPublicKey2Fps ?? (_oauthClientRsaPublicKey2Fps = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKey2FpGetArgs>());
            set => _oauthClientRsaPublicKey2Fps = value;
        }

        [Input("oauthClientRsaPublicKeyFps")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKeyFpGetArgs>? _oauthClientRsaPublicKeyFps;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKeyFpGetArgs> OauthClientRsaPublicKeyFps
        {
            get => _oauthClientRsaPublicKeyFps ?? (_oauthClientRsaPublicKeyFps = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientRsaPublicKeyFpGetArgs>());
            set => _oauthClientRsaPublicKeyFps = value;
        }

        [Input("oauthClientTypes")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientTypeGetArgs>? _oauthClientTypes;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientTypeGetArgs> OauthClientTypes
        {
            get => _oauthClientTypes ?? (_oauthClientTypes = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientTypeGetArgs>());
            set => _oauthClientTypes = value;
        }

        [Input("oauthEnforcePkces")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthEnforcePkceGetArgs>? _oauthEnforcePkces;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthEnforcePkceGetArgs> OauthEnforcePkces
        {
            get => _oauthEnforcePkces ?? (_oauthEnforcePkces = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthEnforcePkceGetArgs>());
            set => _oauthEnforcePkces = value;
        }

        [Input("oauthIssueRefreshTokens")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthIssueRefreshTokenGetArgs>? _oauthIssueRefreshTokens;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthIssueRefreshTokenGetArgs> OauthIssueRefreshTokens
        {
            get => _oauthIssueRefreshTokens ?? (_oauthIssueRefreshTokens = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthIssueRefreshTokenGetArgs>());
            set => _oauthIssueRefreshTokens = value;
        }

        [Input("oauthRedirectUris")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRedirectUriGetArgs>? _oauthRedirectUris;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRedirectUriGetArgs> OauthRedirectUris
        {
            get => _oauthRedirectUris ?? (_oauthRedirectUris = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRedirectUriGetArgs>());
            set => _oauthRedirectUris = value;
        }

        [Input("oauthRefreshTokenValidities")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRefreshTokenValidityGetArgs>? _oauthRefreshTokenValidities;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRefreshTokenValidityGetArgs> OauthRefreshTokenValidities
        {
            get => _oauthRefreshTokenValidities ?? (_oauthRefreshTokenValidities = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthRefreshTokenValidityGetArgs>());
            set => _oauthRefreshTokenValidities = value;
        }

        [Input("oauthTokenEndpoints")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthTokenEndpointGetArgs>? _oauthTokenEndpoints;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthTokenEndpointGetArgs> OauthTokenEndpoints
        {
            get => _oauthTokenEndpoints ?? (_oauthTokenEndpoints = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthTokenEndpointGetArgs>());
            set => _oauthTokenEndpoints = value;
        }

        [Input("oauthUseSecondaryRoles")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthUseSecondaryRoleGetArgs>? _oauthUseSecondaryRoles;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthUseSecondaryRoleGetArgs> OauthUseSecondaryRoles
        {
            get => _oauthUseSecondaryRoles ?? (_oauthUseSecondaryRoles = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputOauthUseSecondaryRoleGetArgs>());
            set => _oauthUseSecondaryRoles = value;
        }

        [Input("preAuthorizedRolesLists")]
        private InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListGetArgs>? _preAuthorizedRolesLists;
        public InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListGetArgs> PreAuthorizedRolesLists
        {
            get => _preAuthorizedRolesLists ?? (_preAuthorizedRolesLists = new InputList<Inputs.OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListGetArgs>());
            set => _preAuthorizedRolesLists = value;
        }

        public OauthIntegrationForPartnerApplicationsDescribeOutputGetArgs()
        {
        }
        public static new OauthIntegrationForPartnerApplicationsDescribeOutputGetArgs Empty => new OauthIntegrationForPartnerApplicationsDescribeOutputGetArgs();
    }
}
