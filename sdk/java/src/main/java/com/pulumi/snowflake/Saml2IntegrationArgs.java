// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Saml2IntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final Saml2IntegrationArgs Empty = new Saml2IntegrationArgs();

    /**
     * A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    @Import(name="allowedEmailPatterns")
    private @Nullable Output<List<String>> allowedEmailPatterns;

    /**
     * @return A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    public Optional<Output<List<String>>> allowedEmailPatterns() {
        return Optional.ofNullable(this.allowedEmailPatterns);
    }

    /**
     * A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    @Import(name="allowedUserDomains")
    private @Nullable Output<List<String>> allowedUserDomains;

    /**
     * @return A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    public Optional<Output<List<String>>> allowedUserDomains() {
        return Optional.ofNullable(this.allowedUserDomains);
    }

    /**
     * Specifies a comment for the integration.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the integration.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies whether this security integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<String> enabled;

    /**
     * @return Specifies whether this security integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="saml2EnableSpInitiated")
    private @Nullable Output<String> saml2EnableSpInitiated;

    /**
     * @return The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> saml2EnableSpInitiated() {
        return Optional.ofNullable(this.saml2EnableSpInitiated);
    }

    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="saml2ForceAuthn")
    private @Nullable Output<String> saml2ForceAuthn;

    /**
     * @return The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> saml2ForceAuthn() {
        return Optional.ofNullable(this.saml2ForceAuthn);
    }

    /**
     * The string containing the IdP EntityID / Issuer.
     * 
     */
    @Import(name="saml2Issuer", required=true)
    private Output<String> saml2Issuer;

    /**
     * @return The string containing the IdP EntityID / Issuer.
     * 
     */
    public Output<String> saml2Issuer() {
        return this.saml2Issuer;
    }

    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     * 
     */
    @Import(name="saml2PostLogoutRedirectUrl")
    private @Nullable Output<String> saml2PostLogoutRedirectUrl;

    /**
     * @return The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     * 
     */
    public Optional<Output<String>> saml2PostLogoutRedirectUrl() {
        return Optional.ofNullable(this.saml2PostLogoutRedirectUrl);
    }

    /**
     * The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
     * 
     */
    @Import(name="saml2Provider", required=true)
    private Output<String> saml2Provider;

    /**
     * @return The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
     * 
     */
    public Output<String> saml2Provider() {
        return this.saml2Provider;
    }

    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
     * 
     */
    @Import(name="saml2RequestedNameidFormat")
    private @Nullable Output<String> saml2RequestedNameidFormat;

    /**
     * @return The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
     * 
     */
    public Optional<Output<String>> saml2RequestedNameidFormat() {
        return Optional.ofNullable(this.saml2RequestedNameidFormat);
    }

    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="saml2SignRequest")
    private @Nullable Output<String> saml2SignRequest;

    /**
     * @return The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> saml2SignRequest() {
        return Optional.ofNullable(this.saml2SignRequest);
    }

    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    @Import(name="saml2SnowflakeAcsUrl")
    private @Nullable Output<String> saml2SnowflakeAcsUrl;

    /**
     * @return The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    public Optional<Output<String>> saml2SnowflakeAcsUrl() {
        return Optional.ofNullable(this.saml2SnowflakeAcsUrl);
    }

    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    @Import(name="saml2SnowflakeIssuerUrl")
    private @Nullable Output<String> saml2SnowflakeIssuerUrl;

    /**
     * @return The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    public Optional<Output<String>> saml2SnowflakeIssuerUrl() {
        return Optional.ofNullable(this.saml2SnowflakeIssuerUrl);
    }

    /**
     * The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    @Import(name="saml2SpInitiatedLoginPageLabel")
    private @Nullable Output<String> saml2SpInitiatedLoginPageLabel;

    /**
     * @return The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    public Optional<Output<String>> saml2SpInitiatedLoginPageLabel() {
        return Optional.ofNullable(this.saml2SpInitiatedLoginPageLabel);
    }

    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     * 
     */
    @Import(name="saml2SsoUrl", required=true)
    private Output<String> saml2SsoUrl;

    /**
     * @return The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     * 
     */
    public Output<String> saml2SsoUrl() {
        return this.saml2SsoUrl;
    }

    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     * 
     */
    @Import(name="saml2X509Cert", required=true)
    private Output<String> saml2X509Cert;

    /**
     * @return The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     * 
     */
    public Output<String> saml2X509Cert() {
        return this.saml2X509Cert;
    }

    private Saml2IntegrationArgs() {}

    private Saml2IntegrationArgs(Saml2IntegrationArgs $) {
        this.allowedEmailPatterns = $.allowedEmailPatterns;
        this.allowedUserDomains = $.allowedUserDomains;
        this.comment = $.comment;
        this.enabled = $.enabled;
        this.name = $.name;
        this.saml2EnableSpInitiated = $.saml2EnableSpInitiated;
        this.saml2ForceAuthn = $.saml2ForceAuthn;
        this.saml2Issuer = $.saml2Issuer;
        this.saml2PostLogoutRedirectUrl = $.saml2PostLogoutRedirectUrl;
        this.saml2Provider = $.saml2Provider;
        this.saml2RequestedNameidFormat = $.saml2RequestedNameidFormat;
        this.saml2SignRequest = $.saml2SignRequest;
        this.saml2SnowflakeAcsUrl = $.saml2SnowflakeAcsUrl;
        this.saml2SnowflakeIssuerUrl = $.saml2SnowflakeIssuerUrl;
        this.saml2SpInitiatedLoginPageLabel = $.saml2SpInitiatedLoginPageLabel;
        this.saml2SsoUrl = $.saml2SsoUrl;
        this.saml2X509Cert = $.saml2X509Cert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Saml2IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Saml2IntegrationArgs $;

        public Builder() {
            $ = new Saml2IntegrationArgs();
        }

        public Builder(Saml2IntegrationArgs defaults) {
            $ = new Saml2IntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedEmailPatterns A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder allowedEmailPatterns(@Nullable Output<List<String>> allowedEmailPatterns) {
            $.allowedEmailPatterns = allowedEmailPatterns;
            return this;
        }

        /**
         * @param allowedEmailPatterns A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder allowedEmailPatterns(List<String> allowedEmailPatterns) {
            return allowedEmailPatterns(Output.of(allowedEmailPatterns));
        }

        /**
         * @param allowedEmailPatterns A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder allowedEmailPatterns(String... allowedEmailPatterns) {
            return allowedEmailPatterns(List.of(allowedEmailPatterns));
        }

        /**
         * @param allowedUserDomains A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder allowedUserDomains(@Nullable Output<List<String>> allowedUserDomains) {
            $.allowedUserDomains = allowedUserDomains;
            return this;
        }

        /**
         * @param allowedUserDomains A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder allowedUserDomains(List<String> allowedUserDomains) {
            return allowedUserDomains(Output.of(allowedUserDomains));
        }

        /**
         * @param allowedUserDomains A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder allowedUserDomains(String... allowedUserDomains) {
            return allowedUserDomains(List.of(allowedUserDomains));
        }

        /**
         * @param comment Specifies a comment for the integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param enabled Specifies whether this security integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<String> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether this security integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder enabled(String enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param saml2EnableSpInitiated The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder saml2EnableSpInitiated(@Nullable Output<String> saml2EnableSpInitiated) {
            $.saml2EnableSpInitiated = saml2EnableSpInitiated;
            return this;
        }

        /**
         * @param saml2EnableSpInitiated The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder saml2EnableSpInitiated(String saml2EnableSpInitiated) {
            return saml2EnableSpInitiated(Output.of(saml2EnableSpInitiated));
        }

        /**
         * @param saml2ForceAuthn The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder saml2ForceAuthn(@Nullable Output<String> saml2ForceAuthn) {
            $.saml2ForceAuthn = saml2ForceAuthn;
            return this;
        }

        /**
         * @param saml2ForceAuthn The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder saml2ForceAuthn(String saml2ForceAuthn) {
            return saml2ForceAuthn(Output.of(saml2ForceAuthn));
        }

        /**
         * @param saml2Issuer The string containing the IdP EntityID / Issuer.
         * 
         * @return builder
         * 
         */
        public Builder saml2Issuer(Output<String> saml2Issuer) {
            $.saml2Issuer = saml2Issuer;
            return this;
        }

        /**
         * @param saml2Issuer The string containing the IdP EntityID / Issuer.
         * 
         * @return builder
         * 
         */
        public Builder saml2Issuer(String saml2Issuer) {
            return saml2Issuer(Output.of(saml2Issuer));
        }

        /**
         * @param saml2PostLogoutRedirectUrl The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
         * 
         * @return builder
         * 
         */
        public Builder saml2PostLogoutRedirectUrl(@Nullable Output<String> saml2PostLogoutRedirectUrl) {
            $.saml2PostLogoutRedirectUrl = saml2PostLogoutRedirectUrl;
            return this;
        }

        /**
         * @param saml2PostLogoutRedirectUrl The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
         * 
         * @return builder
         * 
         */
        public Builder saml2PostLogoutRedirectUrl(String saml2PostLogoutRedirectUrl) {
            return saml2PostLogoutRedirectUrl(Output.of(saml2PostLogoutRedirectUrl));
        }

        /**
         * @param saml2Provider The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder saml2Provider(Output<String> saml2Provider) {
            $.saml2Provider = saml2Provider;
            return this;
        }

        /**
         * @param saml2Provider The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder saml2Provider(String saml2Provider) {
            return saml2Provider(Output.of(saml2Provider));
        }

        /**
         * @param saml2RequestedNameidFormat The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
         * 
         * @return builder
         * 
         */
        public Builder saml2RequestedNameidFormat(@Nullable Output<String> saml2RequestedNameidFormat) {
            $.saml2RequestedNameidFormat = saml2RequestedNameidFormat;
            return this;
        }

        /**
         * @param saml2RequestedNameidFormat The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
         * 
         * @return builder
         * 
         */
        public Builder saml2RequestedNameidFormat(String saml2RequestedNameidFormat) {
            return saml2RequestedNameidFormat(Output.of(saml2RequestedNameidFormat));
        }

        /**
         * @param saml2SignRequest The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder saml2SignRequest(@Nullable Output<String> saml2SignRequest) {
            $.saml2SignRequest = saml2SignRequest;
            return this;
        }

        /**
         * @param saml2SignRequest The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder saml2SignRequest(String saml2SignRequest) {
            return saml2SignRequest(Output.of(saml2SignRequest));
        }

        /**
         * @param saml2SnowflakeAcsUrl The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeAcsUrl(@Nullable Output<String> saml2SnowflakeAcsUrl) {
            $.saml2SnowflakeAcsUrl = saml2SnowflakeAcsUrl;
            return this;
        }

        /**
         * @param saml2SnowflakeAcsUrl The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeAcsUrl(String saml2SnowflakeAcsUrl) {
            return saml2SnowflakeAcsUrl(Output.of(saml2SnowflakeAcsUrl));
        }

        /**
         * @param saml2SnowflakeIssuerUrl The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeIssuerUrl(@Nullable Output<String> saml2SnowflakeIssuerUrl) {
            $.saml2SnowflakeIssuerUrl = saml2SnowflakeIssuerUrl;
            return this;
        }

        /**
         * @param saml2SnowflakeIssuerUrl The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeIssuerUrl(String saml2SnowflakeIssuerUrl) {
            return saml2SnowflakeIssuerUrl(Output.of(saml2SnowflakeIssuerUrl));
        }

        /**
         * @param saml2SpInitiatedLoginPageLabel The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder saml2SpInitiatedLoginPageLabel(@Nullable Output<String> saml2SpInitiatedLoginPageLabel) {
            $.saml2SpInitiatedLoginPageLabel = saml2SpInitiatedLoginPageLabel;
            return this;
        }

        /**
         * @param saml2SpInitiatedLoginPageLabel The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
         * 
         * @return builder
         * 
         */
        public Builder saml2SpInitiatedLoginPageLabel(String saml2SpInitiatedLoginPageLabel) {
            return saml2SpInitiatedLoginPageLabel(Output.of(saml2SpInitiatedLoginPageLabel));
        }

        /**
         * @param saml2SsoUrl The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
         * 
         * @return builder
         * 
         */
        public Builder saml2SsoUrl(Output<String> saml2SsoUrl) {
            $.saml2SsoUrl = saml2SsoUrl;
            return this;
        }

        /**
         * @param saml2SsoUrl The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
         * 
         * @return builder
         * 
         */
        public Builder saml2SsoUrl(String saml2SsoUrl) {
            return saml2SsoUrl(Output.of(saml2SsoUrl));
        }

        /**
         * @param saml2X509Cert The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
         * 
         * @return builder
         * 
         */
        public Builder saml2X509Cert(Output<String> saml2X509Cert) {
            $.saml2X509Cert = saml2X509Cert;
            return this;
        }

        /**
         * @param saml2X509Cert The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
         * 
         * @return builder
         * 
         */
        public Builder saml2X509Cert(String saml2X509Cert) {
            return saml2X509Cert(Output.of(saml2X509Cert));
        }

        public Saml2IntegrationArgs build() {
            if ($.saml2Issuer == null) {
                throw new MissingRequiredPropertyException("Saml2IntegrationArgs", "saml2Issuer");
            }
            if ($.saml2Provider == null) {
                throw new MissingRequiredPropertyException("Saml2IntegrationArgs", "saml2Provider");
            }
            if ($.saml2SsoUrl == null) {
                throw new MissingRequiredPropertyException("Saml2IntegrationArgs", "saml2SsoUrl");
            }
            if ($.saml2X509Cert == null) {
                throw new MissingRequiredPropertyException("Saml2IntegrationArgs", "saml2X509Cert");
            }
            return $;
        }
    }

}
