// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class Saml2IntegrationDescribeOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedEmailPatterns")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputAllowedEmailPatternArgs>? _allowedEmailPatterns;
        public InputList<Inputs.Saml2IntegrationDescribeOutputAllowedEmailPatternArgs> AllowedEmailPatterns
        {
            get => _allowedEmailPatterns ?? (_allowedEmailPatterns = new InputList<Inputs.Saml2IntegrationDescribeOutputAllowedEmailPatternArgs>());
            set => _allowedEmailPatterns = value;
        }

        [Input("allowedUserDomains")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputAllowedUserDomainArgs>? _allowedUserDomains;
        public InputList<Inputs.Saml2IntegrationDescribeOutputAllowedUserDomainArgs> AllowedUserDomains
        {
            get => _allowedUserDomains ?? (_allowedUserDomains = new InputList<Inputs.Saml2IntegrationDescribeOutputAllowedUserDomainArgs>());
            set => _allowedUserDomains = value;
        }

        [Input("comments")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputCommentArgs>? _comments;
        public InputList<Inputs.Saml2IntegrationDescribeOutputCommentArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.Saml2IntegrationDescribeOutputCommentArgs>());
            set => _comments = value;
        }

        [Input("saml2DigestMethodsUseds")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedArgs>? _saml2DigestMethodsUseds;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedArgs> Saml2DigestMethodsUseds
        {
            get => _saml2DigestMethodsUseds ?? (_saml2DigestMethodsUseds = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedArgs>());
            set => _saml2DigestMethodsUseds = value;
        }

        [Input("saml2EnableSpInitiateds")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2EnableSpInitiatedArgs>? _saml2EnableSpInitiateds;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2EnableSpInitiatedArgs> Saml2EnableSpInitiateds
        {
            get => _saml2EnableSpInitiateds ?? (_saml2EnableSpInitiateds = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2EnableSpInitiatedArgs>());
            set => _saml2EnableSpInitiateds = value;
        }

        [Input("saml2ForceAuthns")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2ForceAuthnArgs>? _saml2ForceAuthns;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2ForceAuthnArgs> Saml2ForceAuthns
        {
            get => _saml2ForceAuthns ?? (_saml2ForceAuthns = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2ForceAuthnArgs>());
            set => _saml2ForceAuthns = value;
        }

        [Input("saml2Issuers")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2IssuerArgs>? _saml2Issuers;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2IssuerArgs> Saml2Issuers
        {
            get => _saml2Issuers ?? (_saml2Issuers = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2IssuerArgs>());
            set => _saml2Issuers = value;
        }

        [Input("saml2PostLogoutRedirectUrls")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2PostLogoutRedirectUrlArgs>? _saml2PostLogoutRedirectUrls;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2PostLogoutRedirectUrlArgs> Saml2PostLogoutRedirectUrls
        {
            get => _saml2PostLogoutRedirectUrls ?? (_saml2PostLogoutRedirectUrls = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2PostLogoutRedirectUrlArgs>());
            set => _saml2PostLogoutRedirectUrls = value;
        }

        [Input("saml2Providers")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2ProviderArgs>? _saml2Providers;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2ProviderArgs> Saml2Providers
        {
            get => _saml2Providers ?? (_saml2Providers = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2ProviderArgs>());
            set => _saml2Providers = value;
        }

        [Input("saml2RequestedNameidFormats")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2RequestedNameidFormatArgs>? _saml2RequestedNameidFormats;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2RequestedNameidFormatArgs> Saml2RequestedNameidFormats
        {
            get => _saml2RequestedNameidFormats ?? (_saml2RequestedNameidFormats = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2RequestedNameidFormatArgs>());
            set => _saml2RequestedNameidFormats = value;
        }

        [Input("saml2SignRequests")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SignRequestArgs>? _saml2SignRequests;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SignRequestArgs> Saml2SignRequests
        {
            get => _saml2SignRequests ?? (_saml2SignRequests = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SignRequestArgs>());
            set => _saml2SignRequests = value;
        }

        [Input("saml2SignatureMethodsUseds")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SignatureMethodsUsedArgs>? _saml2SignatureMethodsUseds;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SignatureMethodsUsedArgs> Saml2SignatureMethodsUseds
        {
            get => _saml2SignatureMethodsUseds ?? (_saml2SignatureMethodsUseds = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SignatureMethodsUsedArgs>());
            set => _saml2SignatureMethodsUseds = value;
        }

        [Input("saml2SnowflakeAcsUrls")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeAcsUrlArgs>? _saml2SnowflakeAcsUrls;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeAcsUrlArgs> Saml2SnowflakeAcsUrls
        {
            get => _saml2SnowflakeAcsUrls ?? (_saml2SnowflakeAcsUrls = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeAcsUrlArgs>());
            set => _saml2SnowflakeAcsUrls = value;
        }

        [Input("saml2SnowflakeIssuerUrls")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeIssuerUrlArgs>? _saml2SnowflakeIssuerUrls;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeIssuerUrlArgs> Saml2SnowflakeIssuerUrls
        {
            get => _saml2SnowflakeIssuerUrls ?? (_saml2SnowflakeIssuerUrls = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeIssuerUrlArgs>());
            set => _saml2SnowflakeIssuerUrls = value;
        }

        [Input("saml2SnowflakeMetadatas")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeMetadataArgs>? _saml2SnowflakeMetadatas;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeMetadataArgs> Saml2SnowflakeMetadatas
        {
            get => _saml2SnowflakeMetadatas ?? (_saml2SnowflakeMetadatas = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeMetadataArgs>());
            set => _saml2SnowflakeMetadatas = value;
        }

        [Input("saml2SnowflakeX509Certs")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeX509CertArgs>? _saml2SnowflakeX509Certs;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeX509CertArgs> Saml2SnowflakeX509Certs
        {
            get => _saml2SnowflakeX509Certs ?? (_saml2SnowflakeX509Certs = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SnowflakeX509CertArgs>());
            set => _saml2SnowflakeX509Certs = value;
        }

        [Input("saml2SpInitiatedLoginPageLabels")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SpInitiatedLoginPageLabelArgs>? _saml2SpInitiatedLoginPageLabels;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SpInitiatedLoginPageLabelArgs> Saml2SpInitiatedLoginPageLabels
        {
            get => _saml2SpInitiatedLoginPageLabels ?? (_saml2SpInitiatedLoginPageLabels = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SpInitiatedLoginPageLabelArgs>());
            set => _saml2SpInitiatedLoginPageLabels = value;
        }

        [Input("saml2SsoUrls")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SsoUrlArgs>? _saml2SsoUrls;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SsoUrlArgs> Saml2SsoUrls
        {
            get => _saml2SsoUrls ?? (_saml2SsoUrls = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2SsoUrlArgs>());
            set => _saml2SsoUrls = value;
        }

        [Input("saml2X509Certs")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputSaml2X509CertArgs>? _saml2X509Certs;
        public InputList<Inputs.Saml2IntegrationDescribeOutputSaml2X509CertArgs> Saml2X509Certs
        {
            get => _saml2X509Certs ?? (_saml2X509Certs = new InputList<Inputs.Saml2IntegrationDescribeOutputSaml2X509CertArgs>());
            set => _saml2X509Certs = value;
        }

        public Saml2IntegrationDescribeOutputArgs()
        {
        }
        public static new Saml2IntegrationDescribeOutputArgs Empty => new Saml2IntegrationDescribeOutputArgs();
    }
}
