// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/saml2Integration:Saml2Integration example '"&lt;integration_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/saml2Integration:Saml2Integration")]
    public partial class Saml2Integration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        [Output("allowedEmailPatterns")]
        public Output<ImmutableArray<string>> AllowedEmailPatterns { get; private set; } = null!;

        /// <summary>
        /// A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        [Output("allowedUserDomains")]
        public Output<ImmutableArray<string>> AllowedUserDomains { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the integration.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.Saml2IntegrationDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Specifies whether this security integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("enabled")]
        public Output<string?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("saml2EnableSpInitiated")]
        public Output<string?> Saml2EnableSpInitiated { get; private set; } = null!;

        /// <summary>
        /// The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("saml2ForceAuthn")]
        public Output<string?> Saml2ForceAuthn { get; private set; } = null!;

        /// <summary>
        /// The string containing the IdP EntityID / Issuer.
        /// </summary>
        [Output("saml2Issuer")]
        public Output<string> Saml2Issuer { get; private set; } = null!;

        /// <summary>
        /// The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
        /// </summary>
        [Output("saml2PostLogoutRedirectUrl")]
        public Output<string?> Saml2PostLogoutRedirectUrl { get; private set; } = null!;

        /// <summary>
        /// The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
        /// </summary>
        [Output("saml2Provider")]
        public Output<string> Saml2Provider { get; private set; } = null!;

        /// <summary>
        /// The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
        /// </summary>
        [Output("saml2RequestedNameidFormat")]
        public Output<string?> Saml2RequestedNameidFormat { get; private set; } = null!;

        /// <summary>
        /// The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("saml2SignRequest")]
        public Output<string?> Saml2SignRequest { get; private set; } = null!;

        /// <summary>
        /// The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
        /// </summary>
        [Output("saml2SnowflakeAcsUrl")]
        public Output<string?> Saml2SnowflakeAcsUrl { get; private set; } = null!;

        /// <summary>
        /// The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
        /// </summary>
        [Output("saml2SnowflakeIssuerUrl")]
        public Output<string?> Saml2SnowflakeIssuerUrl { get; private set; } = null!;

        /// <summary>
        /// The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        [Output("saml2SpInitiatedLoginPageLabel")]
        public Output<string?> Saml2SpInitiatedLoginPageLabel { get; private set; } = null!;

        /// <summary>
        /// The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
        /// </summary>
        [Output("saml2SsoUrl")]
        public Output<string> Saml2SsoUrl { get; private set; } = null!;

        /// <summary>
        /// The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
        /// </summary>
        [Output("saml2X509Cert")]
        public Output<string> Saml2X509Cert { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.Saml2IntegrationShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a Saml2Integration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Saml2Integration(string name, Saml2IntegrationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/saml2Integration:Saml2Integration", name, args ?? new Saml2IntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Saml2Integration(string name, Input<string> id, Saml2IntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/saml2Integration:Saml2Integration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Saml2Integration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Saml2Integration Get(string name, Input<string> id, Saml2IntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new Saml2Integration(name, id, state, options);
        }
    }

    public sealed class Saml2IntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedEmailPatterns")]
        private InputList<string>? _allowedEmailPatterns;

        /// <summary>
        /// A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        public InputList<string> AllowedEmailPatterns
        {
            get => _allowedEmailPatterns ?? (_allowedEmailPatterns = new InputList<string>());
            set => _allowedEmailPatterns = value;
        }

        [Input("allowedUserDomains")]
        private InputList<string>? _allowedUserDomains;

        /// <summary>
        /// A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        public InputList<string> AllowedUserDomains
        {
            get => _allowedUserDomains ?? (_allowedUserDomains = new InputList<string>());
            set => _allowedUserDomains = value;
        }

        /// <summary>
        /// Specifies a comment for the integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether this security integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("enabled")]
        public Input<string>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("saml2EnableSpInitiated")]
        public Input<string>? Saml2EnableSpInitiated { get; set; }

        /// <summary>
        /// The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("saml2ForceAuthn")]
        public Input<string>? Saml2ForceAuthn { get; set; }

        /// <summary>
        /// The string containing the IdP EntityID / Issuer.
        /// </summary>
        [Input("saml2Issuer", required: true)]
        public Input<string> Saml2Issuer { get; set; } = null!;

        /// <summary>
        /// The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
        /// </summary>
        [Input("saml2PostLogoutRedirectUrl")]
        public Input<string>? Saml2PostLogoutRedirectUrl { get; set; }

        /// <summary>
        /// The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
        /// </summary>
        [Input("saml2Provider", required: true)]
        public Input<string> Saml2Provider { get; set; } = null!;

        /// <summary>
        /// The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
        /// </summary>
        [Input("saml2RequestedNameidFormat")]
        public Input<string>? Saml2RequestedNameidFormat { get; set; }

        /// <summary>
        /// The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("saml2SignRequest")]
        public Input<string>? Saml2SignRequest { get; set; }

        /// <summary>
        /// The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
        /// </summary>
        [Input("saml2SnowflakeAcsUrl")]
        public Input<string>? Saml2SnowflakeAcsUrl { get; set; }

        /// <summary>
        /// The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
        /// </summary>
        [Input("saml2SnowflakeIssuerUrl")]
        public Input<string>? Saml2SnowflakeIssuerUrl { get; set; }

        /// <summary>
        /// The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        [Input("saml2SpInitiatedLoginPageLabel")]
        public Input<string>? Saml2SpInitiatedLoginPageLabel { get; set; }

        /// <summary>
        /// The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
        /// </summary>
        [Input("saml2SsoUrl", required: true)]
        public Input<string> Saml2SsoUrl { get; set; } = null!;

        /// <summary>
        /// The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
        /// </summary>
        [Input("saml2X509Cert", required: true)]
        public Input<string> Saml2X509Cert { get; set; } = null!;

        public Saml2IntegrationArgs()
        {
        }
        public static new Saml2IntegrationArgs Empty => new Saml2IntegrationArgs();
    }

    public sealed class Saml2IntegrationState : global::Pulumi.ResourceArgs
    {
        [Input("allowedEmailPatterns")]
        private InputList<string>? _allowedEmailPatterns;

        /// <summary>
        /// A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        public InputList<string> AllowedEmailPatterns
        {
            get => _allowedEmailPatterns ?? (_allowedEmailPatterns = new InputList<string>());
            set => _allowedEmailPatterns = value;
        }

        [Input("allowedUserDomains")]
        private InputList<string>? _allowedUserDomains;

        /// <summary>
        /// A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        public InputList<string> AllowedUserDomains
        {
            get => _allowedUserDomains ?? (_allowedUserDomains = new InputList<string>());
            set => _allowedUserDomains = value;
        }

        /// <summary>
        /// Specifies a comment for the integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.Saml2IntegrationDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
        /// </summary>
        public InputList<Inputs.Saml2IntegrationDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.Saml2IntegrationDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Specifies whether this security integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("enabled")]
        public Input<string>? Enabled { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("saml2EnableSpInitiated")]
        public Input<string>? Saml2EnableSpInitiated { get; set; }

        /// <summary>
        /// The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("saml2ForceAuthn")]
        public Input<string>? Saml2ForceAuthn { get; set; }

        /// <summary>
        /// The string containing the IdP EntityID / Issuer.
        /// </summary>
        [Input("saml2Issuer")]
        public Input<string>? Saml2Issuer { get; set; }

        /// <summary>
        /// The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
        /// </summary>
        [Input("saml2PostLogoutRedirectUrl")]
        public Input<string>? Saml2PostLogoutRedirectUrl { get; set; }

        /// <summary>
        /// The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
        /// </summary>
        [Input("saml2Provider")]
        public Input<string>? Saml2Provider { get; set; }

        /// <summary>
        /// The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
        /// </summary>
        [Input("saml2RequestedNameidFormat")]
        public Input<string>? Saml2RequestedNameidFormat { get; set; }

        /// <summary>
        /// The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("saml2SignRequest")]
        public Input<string>? Saml2SignRequest { get; set; }

        /// <summary>
        /// The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
        /// </summary>
        [Input("saml2SnowflakeAcsUrl")]
        public Input<string>? Saml2SnowflakeAcsUrl { get; set; }

        /// <summary>
        /// The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
        /// </summary>
        [Input("saml2SnowflakeIssuerUrl")]
        public Input<string>? Saml2SnowflakeIssuerUrl { get; set; }

        /// <summary>
        /// The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
        /// </summary>
        [Input("saml2SpInitiatedLoginPageLabel")]
        public Input<string>? Saml2SpInitiatedLoginPageLabel { get; set; }

        /// <summary>
        /// The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
        /// </summary>
        [Input("saml2SsoUrl")]
        public Input<string>? Saml2SsoUrl { get; set; }

        /// <summary>
        /// The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
        /// </summary>
        [Input("saml2X509Cert")]
        public Input<string>? Saml2X509Cert { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.Saml2IntegrationShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
        /// </summary>
        public InputList<Inputs.Saml2IntegrationShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.Saml2IntegrationShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public Saml2IntegrationState()
        {
        }
        public static new Saml2IntegrationState Empty => new Saml2IntegrationState();
    }
}
