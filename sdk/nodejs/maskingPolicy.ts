// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const test = new snowflake.MaskingPolicy("test", {
 *     name: "EXAMPLE_MASKING_POLICY",
 *     database: "EXAMPLE_DB",
 *     schema: "EXAMPLE_SCHEMA",
 *     signature: {
 *         columns: [{
 *             name: "val",
 *             type: "VARCHAR",
 *         }],
 *     },
 *     maskingExpression: `case 
 *   when current_role() in ('ROLE_A') then 
 *     val 
 *   when is_role_in_session( 'ROLE_B' ) then 
 *     'ABC123'
 *   else
 *     '******'
 * end
 * `,
 *     returnDataType: "VARCHAR",
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | policy name
 *
 * ```sh
 * $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example 'dbName|schemaName|policyName'
 * ```
 */
export class MaskingPolicy extends pulumi.CustomResource {
    /**
     * Get an existing MaskingPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MaskingPolicyState, opts?: pulumi.CustomResourceOptions): MaskingPolicy {
        return new MaskingPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/maskingPolicy:MaskingPolicy';

    /**
     * Returns true if the given object is an instance of MaskingPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MaskingPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MaskingPolicy.__pulumiType;
    }

    /**
     * Specifies a comment for the masking policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the masking policy.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     */
    public readonly exemptOtherPolicies!: pulumi.Output<boolean | undefined>;
    /**
     * Prevent overwriting a previous masking policy with the same name.
     */
    public readonly ifNotExists!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the SQL expression that transforms the data.
     */
    public readonly maskingExpression!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Whether to override a previous masking policy with the same name.
     */
    public readonly orReplace!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the qualified identifier for the masking policy.
     */
    public /*out*/ readonly qualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the data type to return.
     */
    public readonly returnDataType!: pulumi.Output<string>;
    /**
     * The schema in which to create the masking policy.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     */
    public readonly signature!: pulumi.Output<outputs.MaskingPolicySignature>;

    /**
     * Create a MaskingPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MaskingPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MaskingPolicyArgs | MaskingPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MaskingPolicyState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["exemptOtherPolicies"] = state ? state.exemptOtherPolicies : undefined;
            resourceInputs["ifNotExists"] = state ? state.ifNotExists : undefined;
            resourceInputs["maskingExpression"] = state ? state.maskingExpression : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orReplace"] = state ? state.orReplace : undefined;
            resourceInputs["qualifiedName"] = state ? state.qualifiedName : undefined;
            resourceInputs["returnDataType"] = state ? state.returnDataType : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["signature"] = state ? state.signature : undefined;
        } else {
            const args = argsOrState as MaskingPolicyArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.maskingExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maskingExpression'");
            }
            if ((!args || args.returnDataType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'returnDataType'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.signature === undefined) && !opts.urn) {
                throw new Error("Missing required property 'signature'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["exemptOtherPolicies"] = args ? args.exemptOtherPolicies : undefined;
            resourceInputs["ifNotExists"] = args ? args.ifNotExists : undefined;
            resourceInputs["maskingExpression"] = args ? args.maskingExpression : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orReplace"] = args ? args.orReplace : undefined;
            resourceInputs["returnDataType"] = args ? args.returnDataType : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["signature"] = args ? args.signature : undefined;
            resourceInputs["qualifiedName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MaskingPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MaskingPolicy resources.
 */
export interface MaskingPolicyState {
    /**
     * Specifies a comment for the masking policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the masking policy.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     */
    exemptOtherPolicies?: pulumi.Input<boolean>;
    /**
     * Prevent overwriting a previous masking policy with the same name.
     */
    ifNotExists?: pulumi.Input<boolean>;
    /**
     * Specifies the SQL expression that transforms the data.
     */
    maskingExpression?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to override a previous masking policy with the same name.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * Specifies the qualified identifier for the masking policy.
     */
    qualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the data type to return.
     */
    returnDataType?: pulumi.Input<string>;
    /**
     * The schema in which to create the masking policy.
     */
    schema?: pulumi.Input<string>;
    /**
     * The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     */
    signature?: pulumi.Input<inputs.MaskingPolicySignature>;
}

/**
 * The set of arguments for constructing a MaskingPolicy resource.
 */
export interface MaskingPolicyArgs {
    /**
     * Specifies a comment for the masking policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the masking policy.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     */
    exemptOtherPolicies?: pulumi.Input<boolean>;
    /**
     * Prevent overwriting a previous masking policy with the same name.
     */
    ifNotExists?: pulumi.Input<boolean>;
    /**
     * Specifies the SQL expression that transforms the data.
     */
    maskingExpression: pulumi.Input<string>;
    /**
     * Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to override a previous masking policy with the same name.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * Specifies the data type to return.
     */
    returnDataType: pulumi.Input<string>;
    /**
     * The schema in which to create the masking policy.
     */
    schema: pulumi.Input<string>;
    /**
     * The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     */
    signature: pulumi.Input<inputs.MaskingPolicySignature>;
}
