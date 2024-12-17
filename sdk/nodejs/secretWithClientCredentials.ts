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
 * $ pulumi import snowflake:index/secretWithClientCredentials:SecretWithClientCredentials example '"<database_name>"."<schema_name>"."<secret_name>"'
 * ```
 */
export class SecretWithClientCredentials extends pulumi.CustomResource {
    /**
     * Get an existing SecretWithClientCredentials resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretWithClientCredentialsState, opts?: pulumi.CustomResourceOptions): SecretWithClientCredentials {
        return new SecretWithClientCredentials(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/secretWithClientCredentials:SecretWithClientCredentials';

    /**
     * Returns true if the given object is an instance of SecretWithClientCredentials.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretWithClientCredentials {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretWithClientCredentials.__pulumiType;
    }

    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
     */
    public readonly apiAuthentication!: pulumi.Output<string>;
    /**
     * Specifies a comment for the secret.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.SecretWithClientCredentialsDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies a list of scopes to use when making a request from the OAuth server by a role with USAGE on the integration during the OAuth client credentials flow.
     */
    public readonly oauthScopes!: pulumi.Output<string[]>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     */
    public /*out*/ readonly secretType!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.SecretWithClientCredentialsShowOutput[]>;

    /**
     * Create a SecretWithClientCredentials resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretWithClientCredentialsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretWithClientCredentialsArgs | SecretWithClientCredentialsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretWithClientCredentialsState | undefined;
            resourceInputs["apiAuthentication"] = state ? state.apiAuthentication : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthScopes"] = state ? state.oauthScopes : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["secretType"] = state ? state.secretType : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as SecretWithClientCredentialsArgs | undefined;
            if ((!args || args.apiAuthentication === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiAuthentication'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.oauthScopes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oauthScopes'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["apiAuthentication"] = args ? args.apiAuthentication : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthScopes"] = args ? args.oauthScopes : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["secretType"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecretWithClientCredentials.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretWithClientCredentials resources.
 */
export interface SecretWithClientCredentialsState {
    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
     */
    apiAuthentication?: pulumi.Input<string>;
    /**
     * Specifies a comment for the secret.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.SecretWithClientCredentialsDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies a list of scopes to use when making a request from the OAuth server by a role with USAGE on the integration during the OAuth client credentials flow.
     */
    oauthScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     */
    secretType?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.SecretWithClientCredentialsShowOutput>[]>;
}

/**
 * The set of arguments for constructing a SecretWithClientCredentials resource.
 */
export interface SecretWithClientCredentialsArgs {
    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
     */
    apiAuthentication: pulumi.Input<string>;
    /**
     * Specifies a comment for the secret.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database: pulumi.Input<string>;
    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies a list of scopes to use when making a request from the OAuth server by a role with USAGE on the integration during the OAuth client credentials flow.
     */
    oauthScopes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema: pulumi.Input<string>;
}
