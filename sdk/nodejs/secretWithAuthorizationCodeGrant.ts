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
 * $ pulumi import snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant example '"<database_name>"."<schema_name>"."<secret_name>"'
 * ```
 */
export class SecretWithAuthorizationCodeGrant extends pulumi.CustomResource {
    /**
     * Get an existing SecretWithAuthorizationCodeGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretWithAuthorizationCodeGrantState, opts?: pulumi.CustomResourceOptions): SecretWithAuthorizationCodeGrant {
        return new SecretWithAuthorizationCodeGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant';

    /**
     * Returns true if the given object is an instance of SecretWithAuthorizationCodeGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretWithAuthorizationCodeGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretWithAuthorizationCodeGrant.__pulumiType;
    }

    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
     */
    public readonly apiAuthentication!: pulumi.Output<string>;
    /**
     * Specifies a comment for the secret.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.SecretWithAuthorizationCodeGrantDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    public readonly oauthRefreshToken!: pulumi.Output<string>;
    /**
     * Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
     */
    public readonly oauthRefreshTokenExpiryTime!: pulumi.Output<string>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     */
    public /*out*/ readonly secretType!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.SecretWithAuthorizationCodeGrantShowOutput[]>;

    /**
     * Create a SecretWithAuthorizationCodeGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretWithAuthorizationCodeGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretWithAuthorizationCodeGrantArgs | SecretWithAuthorizationCodeGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretWithAuthorizationCodeGrantState | undefined;
            resourceInputs["apiAuthentication"] = state ? state.apiAuthentication : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthRefreshToken"] = state ? state.oauthRefreshToken : undefined;
            resourceInputs["oauthRefreshTokenExpiryTime"] = state ? state.oauthRefreshTokenExpiryTime : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["secretType"] = state ? state.secretType : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as SecretWithAuthorizationCodeGrantArgs | undefined;
            if ((!args || args.apiAuthentication === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiAuthentication'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.oauthRefreshToken === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthRefreshToken'");
            }
            if ((!args || args.oauthRefreshTokenExpiryTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthRefreshTokenExpiryTime'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["apiAuthentication"] = args ? args.apiAuthentication : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthRefreshToken"] = args?.oauthRefreshToken ? pulumi.secret(args.oauthRefreshToken) : undefined;
            resourceInputs["oauthRefreshTokenExpiryTime"] = args ? args.oauthRefreshTokenExpiryTime : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["secretType"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["oauthRefreshToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SecretWithAuthorizationCodeGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretWithAuthorizationCodeGrant resources.
 */
export interface SecretWithAuthorizationCodeGrantState {
    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
     */
    apiAuthentication?: pulumi.Input<string>;
    /**
     * Specifies a comment for the secret.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.SecretWithAuthorizationCodeGrantDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    oauthRefreshToken?: pulumi.Input<string>;
    /**
     * Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
     */
    oauthRefreshTokenExpiryTime?: pulumi.Input<string>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     */
    secretType?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.SecretWithAuthorizationCodeGrantShowOutput>[]>;
}

/**
 * The set of arguments for constructing a SecretWithAuthorizationCodeGrant resource.
 */
export interface SecretWithAuthorizationCodeGrantArgs {
    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
     */
    apiAuthentication: pulumi.Input<string>;
    /**
     * Specifies a comment for the secret.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    database: pulumi.Input<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    oauthRefreshToken: pulumi.Input<string>;
    /**
     * Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
     */
    oauthRefreshTokenExpiryTime: pulumi.Input<string>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    schema: pulumi.Input<string>;
}