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
 * const exampleRowAccessPolicy = new snowflake.RowAccessPolicy("exampleRowAccessPolicy", {
 *     database: "EXAMPLE_DB",
 *     rowAccessExpression: "case when current_role() in ('ANALYST') then true else false end",
 *     schema: "EXAMPLE_SCHEMA",
 *     signature: {
 *         A: "VARCHAR",
 *         B: "VARCHAR",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | policy name
 *
 * ```sh
 *  $ pulumi import snowflake:index/rowAccessPolicy:RowAccessPolicy example 'dbName|schemaName|policyName'
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
     * Specifies a comment for the row access policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the row access policy.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     */
    public readonly rowAccessExpression!: pulumi.Output<string>;
    /**
     * The schema in which to create the row access policy.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     */
    public readonly signature!: pulumi.Output<{[key: string]: string}>;

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
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rowAccessExpression"] = state ? state.rowAccessExpression : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["signature"] = state ? state.signature : undefined;
        } else {
            const args = argsOrState as RowAccessPolicyArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.rowAccessExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rowAccessExpression'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.signature === undefined) && !opts.urn) {
                throw new Error("Missing required property 'signature'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rowAccessExpression"] = args ? args.rowAccessExpression : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["signature"] = args ? args.signature : undefined;
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
     * Specifies a comment for the row access policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the row access policy.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     */
    rowAccessExpression?: pulumi.Input<string>;
    /**
     * The schema in which to create the row access policy.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     */
    signature?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a RowAccessPolicy resource.
 */
export interface RowAccessPolicyArgs {
    /**
     * Specifies a comment for the row access policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the row access policy.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     */
    rowAccessExpression: pulumi.Input<string>;
    /**
     * The schema in which to create the row access policy.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     */
    signature: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
