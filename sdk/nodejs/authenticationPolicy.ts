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
 * $ pulumi import snowflake:index/authenticationPolicy:AuthenticationPolicy example '"<database_name>"."<schema_name>"."<authentication_policy_name>"'
 * ```
 */
export class AuthenticationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AuthenticationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthenticationPolicyState, opts?: pulumi.CustomResourceOptions): AuthenticationPolicy {
        return new AuthenticationPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/authenticationPolicy:AuthenticationPolicy';

    /**
     * Returns true if the given object is an instance of AuthenticationPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthenticationPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthenticationPolicy.__pulumiType;
    }

    /**
     * A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
     */
    public readonly authenticationMethods!: pulumi.Output<string[] | undefined>;
    /**
     * A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
     */
    public readonly clientTypes!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the authentication policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE AUTHENTICATION POLICY` for the given policy.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.AuthenticationPolicyDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
     */
    public readonly mfaAuthenticationMethods!: pulumi.Output<string[] | undefined>;
    /**
     * Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
     */
    public readonly mfaEnrollment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
     */
    public readonly securityIntegrations!: pulumi.Output<string[] | undefined>;
    /**
     * Outputs the result of `SHOW AUTHENTICATION POLICIES` for the given policy.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.AuthenticationPolicyShowOutput[]>;

    /**
     * Create a AuthenticationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthenticationPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthenticationPolicyArgs | AuthenticationPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthenticationPolicyState | undefined;
            resourceInputs["authenticationMethods"] = state ? state.authenticationMethods : undefined;
            resourceInputs["clientTypes"] = state ? state.clientTypes : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["mfaAuthenticationMethods"] = state ? state.mfaAuthenticationMethods : undefined;
            resourceInputs["mfaEnrollment"] = state ? state.mfaEnrollment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["securityIntegrations"] = state ? state.securityIntegrations : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as AuthenticationPolicyArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["authenticationMethods"] = args ? args.authenticationMethods : undefined;
            resourceInputs["clientTypes"] = args ? args.clientTypes : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["mfaAuthenticationMethods"] = args ? args.mfaAuthenticationMethods : undefined;
            resourceInputs["mfaEnrollment"] = args ? args.mfaEnrollment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["securityIntegrations"] = args ? args.securityIntegrations : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AuthenticationPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthenticationPolicy resources.
 */
export interface AuthenticationPolicyState {
    /**
     * A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
     */
    authenticationMethods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
     */
    clientTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the authentication policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE AUTHENTICATION POLICY` for the given policy.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.AuthenticationPolicyDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
     */
    mfaAuthenticationMethods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
     */
    mfaEnrollment?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    schema?: pulumi.Input<string>;
    /**
     * A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
     */
    securityIntegrations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Outputs the result of `SHOW AUTHENTICATION POLICIES` for the given policy.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.AuthenticationPolicyShowOutput>[]>;
}

/**
 * The set of arguments for constructing a AuthenticationPolicy resource.
 */
export interface AuthenticationPolicyArgs {
    /**
     * A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
     */
    authenticationMethods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
     */
    clientTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the authentication policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    database: pulumi.Input<string>;
    /**
     * A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
     */
    mfaAuthenticationMethods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
     */
    mfaEnrollment?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    schema: pulumi.Input<string>;
    /**
     * A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
     */
    securityIntegrations?: pulumi.Input<pulumi.Input<string>[]>;
}