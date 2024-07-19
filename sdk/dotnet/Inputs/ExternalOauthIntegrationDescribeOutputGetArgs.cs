// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ExternalOauthIntegrationDescribeOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("comments")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputCommentGetArgs>? _comments;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputCommentGetArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputCommentGetArgs>());
            set => _comments = value;
        }

        [Input("enableds")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputEnabledGetArgs>? _enableds;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputEnabledGetArgs> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputEnabledGetArgs>());
            set => _enableds = value;
        }

        [Input("externalOauthAllowedRolesLists")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAllowedRolesListGetArgs>? _externalOauthAllowedRolesLists;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAllowedRolesListGetArgs> ExternalOauthAllowedRolesLists
        {
            get => _externalOauthAllowedRolesLists ?? (_externalOauthAllowedRolesLists = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAllowedRolesListGetArgs>());
            set => _externalOauthAllowedRolesLists = value;
        }

        [Input("externalOauthAnyRoleModes")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAnyRoleModeGetArgs>? _externalOauthAnyRoleModes;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAnyRoleModeGetArgs> ExternalOauthAnyRoleModes
        {
            get => _externalOauthAnyRoleModes ?? (_externalOauthAnyRoleModes = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAnyRoleModeGetArgs>());
            set => _externalOauthAnyRoleModes = value;
        }

        [Input("externalOauthAudienceLists")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAudienceListGetArgs>? _externalOauthAudienceLists;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAudienceListGetArgs> ExternalOauthAudienceLists
        {
            get => _externalOauthAudienceLists ?? (_externalOauthAudienceLists = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthAudienceListGetArgs>());
            set => _externalOauthAudienceLists = value;
        }

        [Input("externalOauthBlockedRolesLists")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthBlockedRolesListGetArgs>? _externalOauthBlockedRolesLists;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthBlockedRolesListGetArgs> ExternalOauthBlockedRolesLists
        {
            get => _externalOauthBlockedRolesLists ?? (_externalOauthBlockedRolesLists = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthBlockedRolesListGetArgs>());
            set => _externalOauthBlockedRolesLists = value;
        }

        [Input("externalOauthIssuers")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthIssuerGetArgs>? _externalOauthIssuers;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthIssuerGetArgs> ExternalOauthIssuers
        {
            get => _externalOauthIssuers ?? (_externalOauthIssuers = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthIssuerGetArgs>());
            set => _externalOauthIssuers = value;
        }

        [Input("externalOauthJwsKeysUrls")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthJwsKeysUrlGetArgs>? _externalOauthJwsKeysUrls;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthJwsKeysUrlGetArgs> ExternalOauthJwsKeysUrls
        {
            get => _externalOauthJwsKeysUrls ?? (_externalOauthJwsKeysUrls = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthJwsKeysUrlGetArgs>());
            set => _externalOauthJwsKeysUrls = value;
        }

        [Input("externalOauthRsaPublicKey2s")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthRsaPublicKey2GetArgs>? _externalOauthRsaPublicKey2s;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthRsaPublicKey2GetArgs> ExternalOauthRsaPublicKey2s
        {
            get => _externalOauthRsaPublicKey2s ?? (_externalOauthRsaPublicKey2s = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthRsaPublicKey2GetArgs>());
            set => _externalOauthRsaPublicKey2s = value;
        }

        [Input("externalOauthRsaPublicKeys")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthRsaPublicKeyGetArgs>? _externalOauthRsaPublicKeys;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthRsaPublicKeyGetArgs> ExternalOauthRsaPublicKeys
        {
            get => _externalOauthRsaPublicKeys ?? (_externalOauthRsaPublicKeys = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthRsaPublicKeyGetArgs>());
            set => _externalOauthRsaPublicKeys = value;
        }

        [Input("externalOauthScopeDelimiters")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthScopeDelimiterGetArgs>? _externalOauthScopeDelimiters;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthScopeDelimiterGetArgs> ExternalOauthScopeDelimiters
        {
            get => _externalOauthScopeDelimiters ?? (_externalOauthScopeDelimiters = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthScopeDelimiterGetArgs>());
            set => _externalOauthScopeDelimiters = value;
        }

        [Input("externalOauthSnowflakeUserMappingAttributes")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthSnowflakeUserMappingAttributeGetArgs>? _externalOauthSnowflakeUserMappingAttributes;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthSnowflakeUserMappingAttributeGetArgs> ExternalOauthSnowflakeUserMappingAttributes
        {
            get => _externalOauthSnowflakeUserMappingAttributes ?? (_externalOauthSnowflakeUserMappingAttributes = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthSnowflakeUserMappingAttributeGetArgs>());
            set => _externalOauthSnowflakeUserMappingAttributes = value;
        }

        [Input("externalOauthTokenUserMappingClaims")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthTokenUserMappingClaimGetArgs>? _externalOauthTokenUserMappingClaims;
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthTokenUserMappingClaimGetArgs> ExternalOauthTokenUserMappingClaims
        {
            get => _externalOauthTokenUserMappingClaims ?? (_externalOauthTokenUserMappingClaims = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputExternalOauthTokenUserMappingClaimGetArgs>());
            set => _externalOauthTokenUserMappingClaims = value;
        }

        public ExternalOauthIntegrationDescribeOutputGetArgs()
        {
        }
        public static new ExternalOauthIntegrationDescribeOutputGetArgs Empty => new ExternalOauthIntegrationDescribeOutputGetArgs();
    }
}