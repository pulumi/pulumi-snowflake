// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/saml2Integration:Saml2Integration example "name"
 * ```
 */
export class Saml2Integration extends pulumi.CustomResource {
    /**
     * Get an existing Saml2Integration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: Saml2IntegrationState, opts?: pulumi.CustomResourceOptions): Saml2Integration {
        return new Saml2Integration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/saml2Integration:Saml2Integration';

    /**
     * Returns true if the given object is an instance of Saml2Integration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Saml2Integration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Saml2Integration.__pulumiType;
    }

    /**
     * A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    public readonly allowedEmailPatterns!: pulumi.Output<string[] | undefined>;
    /**
     * A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    public readonly allowedUserDomains!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the integration.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.Saml2IntegrationDescribeOutput[]>;
    /**
     * Specifies whether this security integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly enabled!: pulumi.Output<string | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly saml2EnableSpInitiated!: pulumi.Output<string | undefined>;
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly saml2ForceAuthn!: pulumi.Output<string | undefined>;
    /**
     * The string containing the IdP EntityID / Issuer.
     */
    public readonly saml2Issuer!: pulumi.Output<string>;
    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     */
    public readonly saml2PostLogoutRedirectUrl!: pulumi.Output<string | undefined>;
    /**
     * The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
     */
    public readonly saml2Provider!: pulumi.Output<string>;
    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
     */
    public readonly saml2RequestedNameidFormat!: pulumi.Output<string | undefined>;
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    public readonly saml2SignRequest!: pulumi.Output<string | undefined>;
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     */
    public readonly saml2SnowflakeAcsUrl!: pulumi.Output<string | undefined>;
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     */
    public readonly saml2SnowflakeIssuerUrl!: pulumi.Output<string | undefined>;
    /**
     * The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    public readonly saml2SpInitiatedLoginPageLabel!: pulumi.Output<string | undefined>;
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     */
    public readonly saml2SsoUrl!: pulumi.Output<string>;
    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     */
    public readonly saml2X509Cert!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.Saml2IntegrationShowOutput[]>;

    /**
     * Create a Saml2Integration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: Saml2IntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: Saml2IntegrationArgs | Saml2IntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as Saml2IntegrationState | undefined;
            resourceInputs["allowedEmailPatterns"] = state ? state.allowedEmailPatterns : undefined;
            resourceInputs["allowedUserDomains"] = state ? state.allowedUserDomains : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["saml2EnableSpInitiated"] = state ? state.saml2EnableSpInitiated : undefined;
            resourceInputs["saml2ForceAuthn"] = state ? state.saml2ForceAuthn : undefined;
            resourceInputs["saml2Issuer"] = state ? state.saml2Issuer : undefined;
            resourceInputs["saml2PostLogoutRedirectUrl"] = state ? state.saml2PostLogoutRedirectUrl : undefined;
            resourceInputs["saml2Provider"] = state ? state.saml2Provider : undefined;
            resourceInputs["saml2RequestedNameidFormat"] = state ? state.saml2RequestedNameidFormat : undefined;
            resourceInputs["saml2SignRequest"] = state ? state.saml2SignRequest : undefined;
            resourceInputs["saml2SnowflakeAcsUrl"] = state ? state.saml2SnowflakeAcsUrl : undefined;
            resourceInputs["saml2SnowflakeIssuerUrl"] = state ? state.saml2SnowflakeIssuerUrl : undefined;
            resourceInputs["saml2SpInitiatedLoginPageLabel"] = state ? state.saml2SpInitiatedLoginPageLabel : undefined;
            resourceInputs["saml2SsoUrl"] = state ? state.saml2SsoUrl : undefined;
            resourceInputs["saml2X509Cert"] = state ? state.saml2X509Cert : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as Saml2IntegrationArgs | undefined;
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
            resourceInputs["allowedEmailPatterns"] = args ? args.allowedEmailPatterns : undefined;
            resourceInputs["allowedUserDomains"] = args ? args.allowedUserDomains : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
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
            resourceInputs["saml2SpInitiatedLoginPageLabel"] = args ? args.saml2SpInitiatedLoginPageLabel : undefined;
            resourceInputs["saml2SsoUrl"] = args ? args.saml2SsoUrl : undefined;
            resourceInputs["saml2X509Cert"] = args ? args.saml2X509Cert : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Saml2Integration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Saml2Integration resources.
 */
export interface Saml2IntegrationState {
    /**
     * A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    allowedEmailPatterns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    allowedUserDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.Saml2IntegrationDescribeOutput>[]>;
    /**
     * Specifies whether this security integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    enabled?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    saml2EnableSpInitiated?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    saml2ForceAuthn?: pulumi.Input<string>;
    /**
     * The string containing the IdP EntityID / Issuer.
     */
    saml2Issuer?: pulumi.Input<string>;
    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     */
    saml2PostLogoutRedirectUrl?: pulumi.Input<string>;
    /**
     * The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
     */
    saml2Provider?: pulumi.Input<string>;
    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
     */
    saml2RequestedNameidFormat?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    saml2SignRequest?: pulumi.Input<string>;
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     */
    saml2SnowflakeAcsUrl?: pulumi.Input<string>;
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     */
    saml2SnowflakeIssuerUrl?: pulumi.Input<string>;
    /**
     * The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    saml2SpInitiatedLoginPageLabel?: pulumi.Input<string>;
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     */
    saml2SsoUrl?: pulumi.Input<string>;
    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     */
    saml2X509Cert?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.Saml2IntegrationShowOutput>[]>;
}

/**
 * The set of arguments for constructing a Saml2Integration resource.
 */
export interface Saml2IntegrationArgs {
    /**
     * A list of regular expressions that email addresses are matched against to authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    allowedEmailPatterns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of email domains that can authenticate with a SAML2 security integration. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    allowedUserDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the integration.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether this security integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    enabled?: pulumi.Input<string>;
    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in With button on the login page. FALSE: does not display the Log in With button on the login page. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    saml2EnableSpInitiated?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    saml2ForceAuthn?: pulumi.Input<string>;
    /**
     * The string containing the IdP EntityID / Issuer.
     */
    saml2Issuer: pulumi.Input<string>;
    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     */
    saml2PostLogoutRedirectUrl?: pulumi.Input<string>;
    /**
     * The string describing the IdP. Valid options are: `OKTA` | `ADFS` | `CUSTOM`.
     */
    saml2Provider: pulumi.Input<string>;
    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. Valid options are: `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified` | `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` | `urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName` | `urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName` | `urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos` | `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` | `urn:oasis:names:tc:SAML:2.0:nameid-format:transient`.
     */
    saml2RequestedNameidFormat?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
     */
    saml2SignRequest?: pulumi.Input<string>;
    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     */
    saml2SnowflakeAcsUrl?: pulumi.Input<string>;
    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Because Okta does not support underscores in URLs, the underscore in the account name must be converted to a hyphen. See [docs](https://docs.snowflake.com/en/user-guide/organizations-connect#okta-urls).
     */
    saml2SnowflakeIssuerUrl?: pulumi.Input<string>;
    /**
     * The string containing the label to display after the Log In With button on the login page. If this field changes value from non-empty to empty, the whole resource is recreated because of Snowflake limitations.
     */
    saml2SpInitiatedLoginPageLabel?: pulumi.Input<string>;
    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     */
    saml2SsoUrl: pulumi.Input<string>;
    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     */
    saml2X509Cert: pulumi.Input<string>;
}
