// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.Saml2IntegrationArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.Saml2IntegrationState;
import com.pulumi.snowflake.outputs.Saml2IntegrationDescribeOutput;
import com.pulumi.snowflake.outputs.Saml2IntegrationShowOutput;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 * 
 * Resource used to manage saml2 security integration objects. For more information, check [security integrations documentation](https://docs.snowflake.com/en/sql-reference/sql/create-security-integration-saml2).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/saml2Integration:Saml2Integration example &#34;name&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/saml2Integration:Saml2Integration")
public class Saml2Integration extends com.pulumi.resources.CustomResource {
    /**
     * A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    @Export(name="allowedEmailPatterns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedEmailPatterns;

    /**
     * @return A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    public Output<Optional<List<String>>> allowedEmailPatterns() {
        return Codegen.optional(this.allowedEmailPatterns);
    }
    /**
     * A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    @Export(name="allowedUserDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedUserDomains;

    /**
     * @return A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    public Output<Optional<List<String>>> allowedUserDomains() {
        return Codegen.optional(this.allowedUserDomains);
    }
    /**
     * Specifies a comment for the integration.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the integration.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,Saml2IntegrationDescribeOutput.class}, tree="[0,1]")
    private Output<List<Saml2IntegrationDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Output<List<Saml2IntegrationDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * Specifies whether this security integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="enabled", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enabled;

    /**
     * @return Specifies whether this security integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="saml2EnableSpInitiated", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2EnableSpInitiated;

    /**
     * @return The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> saml2EnableSpInitiated() {
        return Codegen.optional(this.saml2EnableSpInitiated);
    }
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="saml2ForceAuthn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2ForceAuthn;

    /**
     * @return The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> saml2ForceAuthn() {
        return Codegen.optional(this.saml2ForceAuthn);
    }
    /**
     * The string containing the IdP EntityID / Issuer.
     * 
     */
    @Export(name="saml2Issuer", refs={String.class}, tree="[0]")
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
    @Export(name="saml2PostLogoutRedirectUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2PostLogoutRedirectUrl;

    /**
     * @return The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     * 
     */
    public Output<Optional<String>> saml2PostLogoutRedirectUrl() {
        return Codegen.optional(this.saml2PostLogoutRedirectUrl);
    }
    /**
     * The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
     * 
     */
    @Export(name="saml2Provider", refs={String.class}, tree="[0]")
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
    @Export(name="saml2RequestedNameidFormat", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2RequestedNameidFormat;

    /**
     * @return The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
     * 
     */
    public Output<Optional<String>> saml2RequestedNameidFormat() {
        return Codegen.optional(this.saml2RequestedNameidFormat);
    }
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="saml2SignRequest", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2SignRequest;

    /**
     * @return The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> saml2SignRequest() {
        return Codegen.optional(this.saml2SignRequest);
    }
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    @Export(name="saml2SnowflakeAcsUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2SnowflakeAcsUrl;

    /**
     * @return The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    public Output<Optional<String>> saml2SnowflakeAcsUrl() {
        return Codegen.optional(this.saml2SnowflakeAcsUrl);
    }
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    @Export(name="saml2SnowflakeIssuerUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2SnowflakeIssuerUrl;

    /**
     * @return The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     * 
     */
    public Output<Optional<String>> saml2SnowflakeIssuerUrl() {
        return Codegen.optional(this.saml2SnowflakeIssuerUrl);
    }
    /**
     * The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    @Export(name="saml2SpInitiatedLoginPageLabel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> saml2SpInitiatedLoginPageLabel;

    /**
     * @return The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     * 
     */
    public Output<Optional<String>> saml2SpInitiatedLoginPageLabel() {
        return Codegen.optional(this.saml2SpInitiatedLoginPageLabel);
    }
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     * 
     */
    @Export(name="saml2SsoUrl", refs={String.class}, tree="[0]")
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
    @Export(name="saml2X509Cert", refs={String.class}, tree="[0]")
    private Output<String> saml2X509Cert;

    /**
     * @return The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     * 
     */
    public Output<String> saml2X509Cert() {
        return this.saml2X509Cert;
    }
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Export(name="showOutputs", refs={List.class,Saml2IntegrationShowOutput.class}, tree="[0,1]")
    private Output<List<Saml2IntegrationShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Output<List<Saml2IntegrationShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Saml2Integration(String name) {
        this(name, Saml2IntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Saml2Integration(String name, Saml2IntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Saml2Integration(String name, Saml2IntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/saml2Integration:Saml2Integration", name, args == null ? Saml2IntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Saml2Integration(String name, Output<String> id, @Nullable Saml2IntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/saml2Integration:Saml2Integration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Saml2Integration get(String name, Output<String> id, @Nullable Saml2IntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Saml2Integration(name, id, state, options);
    }
}
