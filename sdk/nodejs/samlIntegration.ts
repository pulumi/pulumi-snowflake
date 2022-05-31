// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const samlIntegration = new snowflake.SamlIntegration("saml_integration", {
 *     enabled: true,
 *     saml2Issuer: "test_issuer",
 *     saml2Provider: "CUSTOM",
 *     saml2SsoUrl: "https://testsamlissuer.com",
 *     saml2X509Cert: "MIICYzCCAcygAwIBAgIBADANBgkqhkiG9w0BAQUFADAuMQswCQYDVQQGEwJVUzEMMAoGA1UEChMDSUJNMREwDwYDVQQLEwhMb2NhbCBDQTAeFw05OTEyMjIwNTAwMDBaFw0wMDEyMjMwNDU5NTlaMC4xCzAJBgNVBAYTAlVTMQwwCgYDVQQKEwNJQk0xETAPBgNVBAsTCExvY2FsIENBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD2bZEo7xGaX2/0GHkrNFZvlxBou9v1Jmt/PDiTMPve8r9FeJAQ0QdvFST/0JPQYD20rH0bimdDLgNdNynmyRoS2S/IInfpmf69iyc2G0TPyRvmHIiOZbdCd+YBHQi1adkj17NDcWj6S14tVurFX73zx0sNoMS79q3tuXKrDsxeuwIDAQABo4GQMIGNMEsGCVUdDwGG+EIBDQQ+EzxHZW5lcmF0ZWQgYnkgdGhlIFNlY3VyZVdheSBTZWN1cml0eSBTZXJ2ZXIgZm9yIE9TLzM5MCAoUkFDRikwDgYDVR0PAQH/BAQDAgAGMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFJ3+ocRyCTJw067dLSwr/nalx6YMMA0GCSqGSIb3DQEBBQUAA4GBAMaQzt+zaj1GU77yzlr8iiMBXgdQrwsZZWJo5exnAucJAEYQZmOfyLiMD6oYq+ZnfvM0n8G/Y79q8nhwvuxpYOnRSAXFp6xSkrIOeZtJMY1h00LKp/JX3Ng1svZ2agE126JHsQ0bhzN5TKsYfbwfTwfjdWAGy6Vf1nYi/rO+ryMO",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/samlIntegration:SamlIntegration example name
 * ```
 */
export class SamlIntegration extends pulumi.CustomResource {
    /**
     * Get an existing SamlIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SamlIntegrationState, opts?: pulumi.CustomResourceOptions): SamlIntegration {
        return new SamlIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/samlIntegration:SamlIntegration';

    /**
     * Returns true if the given object is an instance of SamlIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SamlIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SamlIntegration.__pulumiType;
    }

    /**
     * Date and time when the SAML integration was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Specifies whether this security integration is enabled or disabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be
     * unique among security integrations in your account.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly saml2DigestMethodsUsed!: pulumi.Output<string>;
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button
     * on the login page. FALSE: does not display the Log in With button on the login page.
     */
    public readonly saml2EnableSpInitiated!: pulumi.Output<boolean | undefined>;
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access
     * Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake
     * to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the
     * identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
     */
    public readonly saml2ForceAuthn!: pulumi.Output<boolean | undefined>;
    /**
     * The string containing the IdP EntityID / Issuer.
     */
    public readonly saml2Issuer!: pulumi.Output<string>;
    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web
     * interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     */
    public readonly saml2PostLogoutRedirectUrl!: pulumi.Output<string | undefined>;
    /**
     * The string describing the IdP. One of the following: OKTA, ADFS, Custom.
     */
    public readonly saml2Provider!: pulumi.Output<string>;
    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML
     * Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified,
     * Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the
     * IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified,
     * urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName,
     * urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName,
     * urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent,
     * urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
     */
    public readonly saml2RequestedNameidFormat!: pulumi.Output<string | undefined>;
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow
     * SAML requests to be signed.
     */
    public readonly saml2SignRequest!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly saml2SignatureMethodsUsed!: pulumi.Output<string>;
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication
     * response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when
     * initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message
     * indicating the acceptable values to use. Default: https://<account_locator>.<region>.snowflakecomputing.com/fed/login
     */
    public readonly saml2SnowflakeAcsUrl!: pulumi.Output<string>;
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified,
     * Snowflake returns an error message indicating the acceptable values to use.
     */
    public readonly saml2SnowflakeIssuerUrl!: pulumi.Output<string>;
    /**
     * Metadata created by Snowflake to provide to SAML2 provider.
     */
    public /*out*/ readonly saml2SnowflakeMetadata!: pulumi.Output<string>;
    /**
     * The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed
     * SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled
     * in your Snowflake account to access the certificate value.
     */
    public readonly saml2SnowflakeX509Cert!: pulumi.Output<string>;
    /**
     * The string containing the label to display after the Log In With button on the login page.
     */
    public readonly saml2SpInitiatedLoginPageLabel!: pulumi.Output<string | undefined>;
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a
     * SAML AuthnRequest message.
     */
    public readonly saml2SsoUrl!: pulumi.Output<string>;
    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending
     * -----END CERTIFICATE----- markers.
     */
    public readonly saml2X509Cert!: pulumi.Output<string>;

    /**
     * Create a SamlIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SamlIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SamlIntegrationArgs | SamlIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SamlIntegrationState | undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["saml2DigestMethodsUsed"] = state ? state.saml2DigestMethodsUsed : undefined;
            resourceInputs["saml2EnableSpInitiated"] = state ? state.saml2EnableSpInitiated : undefined;
            resourceInputs["saml2ForceAuthn"] = state ? state.saml2ForceAuthn : undefined;
            resourceInputs["saml2Issuer"] = state ? state.saml2Issuer : undefined;
            resourceInputs["saml2PostLogoutRedirectUrl"] = state ? state.saml2PostLogoutRedirectUrl : undefined;
            resourceInputs["saml2Provider"] = state ? state.saml2Provider : undefined;
            resourceInputs["saml2RequestedNameidFormat"] = state ? state.saml2RequestedNameidFormat : undefined;
            resourceInputs["saml2SignRequest"] = state ? state.saml2SignRequest : undefined;
            resourceInputs["saml2SignatureMethodsUsed"] = state ? state.saml2SignatureMethodsUsed : undefined;
            resourceInputs["saml2SnowflakeAcsUrl"] = state ? state.saml2SnowflakeAcsUrl : undefined;
            resourceInputs["saml2SnowflakeIssuerUrl"] = state ? state.saml2SnowflakeIssuerUrl : undefined;
            resourceInputs["saml2SnowflakeMetadata"] = state ? state.saml2SnowflakeMetadata : undefined;
            resourceInputs["saml2SnowflakeX509Cert"] = state ? state.saml2SnowflakeX509Cert : undefined;
            resourceInputs["saml2SpInitiatedLoginPageLabel"] = state ? state.saml2SpInitiatedLoginPageLabel : undefined;
            resourceInputs["saml2SsoUrl"] = state ? state.saml2SsoUrl : undefined;
            resourceInputs["saml2X509Cert"] = state ? state.saml2X509Cert : undefined;
        } else {
            const args = argsOrState as SamlIntegrationArgs | undefined;
            if ((!args || args.saml2Issuer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'saml2Issuer'");
            }
            if ((!args || args.saml2Provider === undefined) && !opts.urn) {
                throw new Error("Missing required property 'saml2Provider'");
            }
            if ((!args || args.saml2SsoUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'saml2SsoUrl'");
            }
            if ((!args || args.saml2X509Cert === undefined) && !opts.urn) {
                throw new Error("Missing required property 'saml2X509Cert'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["saml2EnableSpInitiated"] = args ? args.saml2EnableSpInitiated : undefined;
            resourceInputs["saml2ForceAuthn"] = args ? args.saml2ForceAuthn : undefined;
            resourceInputs["saml2Issuer"] = args ? args.saml2Issuer : undefined;
            resourceInputs["saml2PostLogoutRedirectUrl"] = args ? args.saml2PostLogoutRedirectUrl : undefined;
            resourceInputs["saml2Provider"] = args ? args.saml2Provider : undefined;
            resourceInputs["saml2RequestedNameidFormat"] = args ? args.saml2RequestedNameidFormat : undefined;
            resourceInputs["saml2SignRequest"] = args ? args.saml2SignRequest : undefined;
            resourceInputs["saml2SnowflakeAcsUrl"] = args ? args.saml2SnowflakeAcsUrl : undefined;
            resourceInputs["saml2SnowflakeIssuerUrl"] = args ? args.saml2SnowflakeIssuerUrl : undefined;
            resourceInputs["saml2SnowflakeX509Cert"] = args ? args.saml2SnowflakeX509Cert : undefined;
            resourceInputs["saml2SpInitiatedLoginPageLabel"] = args ? args.saml2SpInitiatedLoginPageLabel : undefined;
            resourceInputs["saml2SsoUrl"] = args ? args.saml2SsoUrl : undefined;
            resourceInputs["saml2X509Cert"] = args ? args.saml2X509Cert : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["saml2DigestMethodsUsed"] = undefined /*out*/;
            resourceInputs["saml2SignatureMethodsUsed"] = undefined /*out*/;
            resourceInputs["saml2SnowflakeMetadata"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SamlIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SamlIntegration resources.
 */
export interface SamlIntegrationState {
    /**
     * Date and time when the SAML integration was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Specifies whether this security integration is enabled or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be
     * unique among security integrations in your account.
     */
    name?: pulumi.Input<string>;
    saml2DigestMethodsUsed?: pulumi.Input<string>;
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button
     * on the login page. FALSE: does not display the Log in With button on the login page.
     */
    saml2EnableSpInitiated?: pulumi.Input<boolean>;
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access
     * Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake
     * to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the
     * identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
     */
    saml2ForceAuthn?: pulumi.Input<boolean>;
    /**
     * The string containing the IdP EntityID / Issuer.
     */
    saml2Issuer?: pulumi.Input<string>;
    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web
     * interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     */
    saml2PostLogoutRedirectUrl?: pulumi.Input<string>;
    /**
     * The string describing the IdP. One of the following: OKTA, ADFS, Custom.
     */
    saml2Provider?: pulumi.Input<string>;
    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML
     * Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified,
     * Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the
     * IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified,
     * urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName,
     * urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName,
     * urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent,
     * urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
     */
    saml2RequestedNameidFormat?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow
     * SAML requests to be signed.
     */
    saml2SignRequest?: pulumi.Input<boolean>;
    saml2SignatureMethodsUsed?: pulumi.Input<string>;
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication
     * response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when
     * initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message
     * indicating the acceptable values to use. Default: https://<account_locator>.<region>.snowflakecomputing.com/fed/login
     */
    saml2SnowflakeAcsUrl?: pulumi.Input<string>;
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified,
     * Snowflake returns an error message indicating the acceptable values to use.
     */
    saml2SnowflakeIssuerUrl?: pulumi.Input<string>;
    /**
     * Metadata created by Snowflake to provide to SAML2 provider.
     */
    saml2SnowflakeMetadata?: pulumi.Input<string>;
    /**
     * The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed
     * SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled
     * in your Snowflake account to access the certificate value.
     */
    saml2SnowflakeX509Cert?: pulumi.Input<string>;
    /**
     * The string containing the label to display after the Log In With button on the login page.
     */
    saml2SpInitiatedLoginPageLabel?: pulumi.Input<string>;
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a
     * SAML AuthnRequest message.
     */
    saml2SsoUrl?: pulumi.Input<string>;
    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending
     * -----END CERTIFICATE----- markers.
     */
    saml2X509Cert?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SamlIntegration resource.
 */
export interface SamlIntegrationArgs {
    /**
     * Specifies whether this security integration is enabled or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be
     * unique among security integrations in your account.
     */
    name?: pulumi.Input<string>;
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button
     * on the login page. FALSE: does not display the Log in With button on the login page.
     */
    saml2EnableSpInitiated?: pulumi.Input<boolean>;
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access
     * Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake
     * to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the
     * identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
     */
    saml2ForceAuthn?: pulumi.Input<boolean>;
    /**
     * The string containing the IdP EntityID / Issuer.
     */
    saml2Issuer: pulumi.Input<string>;
    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web
     * interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     */
    saml2PostLogoutRedirectUrl?: pulumi.Input<string>;
    /**
     * The string describing the IdP. One of the following: OKTA, ADFS, Custom.
     */
    saml2Provider: pulumi.Input<string>;
    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML
     * Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified,
     * Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the
     * IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified,
     * urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName,
     * urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName,
     * urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent,
     * urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
     */
    saml2RequestedNameidFormat?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow
     * SAML requests to be signed.
     */
    saml2SignRequest?: pulumi.Input<boolean>;
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication
     * response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when
     * initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message
     * indicating the acceptable values to use. Default: https://<account_locator>.<region>.snowflakecomputing.com/fed/login
     */
    saml2SnowflakeAcsUrl?: pulumi.Input<string>;
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified,
     * Snowflake returns an error message indicating the acceptable values to use.
     */
    saml2SnowflakeIssuerUrl?: pulumi.Input<string>;
    /**
     * The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed
     * SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled
     * in your Snowflake account to access the certificate value.
     */
    saml2SnowflakeX509Cert?: pulumi.Input<string>;
    /**
     * The string containing the label to display after the Log In With button on the login page.
     */
    saml2SpInitiatedLoginPageLabel?: pulumi.Input<string>;
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a
     * SAML AuthnRequest message.
     */
    saml2SsoUrl: pulumi.Input<string>;
    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending
     * -----END CERTIFICATE----- markers.
     */
    saml2X509Cert: pulumi.Input<string>;
}
