// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/rowAccessPolicy:RowAccessPolicy example '"<database_name>"."<schema_name>"."<row_access_policy_name>"'
 * ```
 */
export class RowAccessPolicy extends pulumi.CustomResource {
    /**
     * Get an existing RowAccessPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RowAccessPolicyState, opts?: pulumi.CustomResourceOptions): RowAccessPolicy {
        return new RowAccessPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/rowAccessPolicy:RowAccessPolicy';

    /**
     * Returns true if the given object is an instance of RowAccessPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RowAccessPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RowAccessPolicy.__pulumiType;
    }

    /**
     * List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
     */
    public readonly arguments!: pulumi.Output<outputs.RowAccessPolicyArgument[]>;
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    public readonly body!: pulumi.Output<string>;
    /**
     * Specifies a comment for the row access policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Outputs the result of `DESCRIBE ROW ACCESS POLICY` for the given row access policy.
     */
    public /*out*/ readonly describeOutputs!: pulumi.Output<outputs.RowAccessPolicyDescribeOutput[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW ROW ACCESS POLICIES` for the given row access policy.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.RowAccessPolicyShowOutput[]>;

    /**
     * Create a RowAccessPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RowAccessPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RowAccessPolicyArgs | RowAccessPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RowAccessPolicyState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["body"] = state ? state.body : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["describeOutputs"] = state ? state.describeOutputs : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as RowAccessPolicyArgs | undefined;
            if ((!args || args.arguments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'arguments'");
            }
            if ((!args || args.body === undefined) && !opts.urn) {
                throw new Error("Missing required property 'body'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["arguments"] = args ? args.arguments : undefined;
            resourceInputs["body"] = args ? args.body : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["describeOutputs"] = undefined /*out*/;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RowAccessPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RowAccessPolicy resources.
 */
export interface RowAccessPolicyState {
    /**
     * List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.RowAccessPolicyArgument>[]>;
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    body?: pulumi.Input<string>;
    /**
     * Specifies a comment for the row access policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database?: pulumi.Input<string>;
    /**
     * Outputs the result of `DESCRIBE ROW ACCESS POLICY` for the given row access policy.
     */
    describeOutputs?: pulumi.Input<pulumi.Input<inputs.RowAccessPolicyDescribeOutput>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW ROW ACCESS POLICIES` for the given row access policy.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.RowAccessPolicyShowOutput>[]>;
}

/**
 * The set of arguments for constructing a RowAccessPolicy resource.
 */
export interface RowAccessPolicyArgs {
    /**
     * List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
     */
    arguments: pulumi.Input<pulumi.Input<inputs.RowAccessPolicyArgument>[]>;
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    body: pulumi.Input<string>;
    /**
     * Specifies a comment for the row access policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema: pulumi.Input<string>;
}
