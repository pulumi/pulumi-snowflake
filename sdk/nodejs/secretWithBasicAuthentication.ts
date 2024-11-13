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
 * $ pulumi import snowflake:index/secretWithBasicAuthentication:SecretWithBasicAuthentication example '"<database_name>"."<schema_name>"."<secret_name>"'
 * ```
 */
export class SecretWithBasicAuthentication extends pulumi.CustomResource {
    /**
     * Get an existing SecretWithBasicAuthentication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretWithBasicAuthenticationState, opts?: pulumi.CustomResourceOptions): SecretWithBasicAuthentication {
        return new SecretWithBasicAuthentication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/secretWithBasicAuthentication:SecretWithBasicAuthentication';

    /**
     * Returns true if the given object is an instance of SecretWithBasicAuthentication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretWithBasicAuthentication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretWithBasicAuthentication.__pulumiType;
    }

    /**
     * Specifies a comment for the secret.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.SecretWithBasicAuthenticationDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    public readonly password!: pulumi.Output<string>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     */
    public /*out*/ readonly secretType!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.SecretWithBasicAuthenticationShowOutput[]>;
    /**
     * Specifies the username value to store in the secret.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a SecretWithBasicAuthentication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretWithBasicAuthenticationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretWithBasicAuthenticationArgs | SecretWithBasicAuthenticationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretWithBasicAuthenticationState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["secretType"] = state ? state.secretType : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as SecretWithBasicAuthenticationArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["username"] = args?.username ? pulumi.secret(args.username) : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["secretType"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password", "username"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SecretWithBasicAuthentication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretWithBasicAuthentication resources.
 */
export interface SecretWithBasicAuthenticationState {
    /**
     * Specifies a comment for the secret.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.SecretWithBasicAuthenticationDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    name?: pulumi.Input<string>;
    password?: pulumi.Input<string>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     */
    secretType?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.SecretWithBasicAuthenticationShowOutput>[]>;
    /**
     * Specifies the username value to store in the secret.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecretWithBasicAuthentication resource.
 */
export interface SecretWithBasicAuthenticationArgs {
    /**
     * Specifies a comment for the secret.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    database: pulumi.Input<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    name?: pulumi.Input<string>;
    password: pulumi.Input<string>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies the username value to store in the secret.
     */
    username: pulumi.Input<string>;
}
