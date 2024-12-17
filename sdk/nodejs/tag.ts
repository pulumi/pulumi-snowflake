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
 * $ pulumi import snowflake:index/tag:Tag example '"<database_name>"."<schema_name>"."<tag_name>"'
 * ```
 */
export class Tag extends pulumi.CustomResource {
    /**
     * Get an existing Tag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagState, opts?: pulumi.CustomResourceOptions): Tag {
        return new Tag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/tag:Tag';

    /**
     * Returns true if the given object is an instance of Tag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tag.__pulumiType;
    }

    /**
     * Set of allowed values for the tag.
     */
    public readonly allowedValues!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the tag.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
     */
    public readonly maskingPolicies!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW TAGS` for the given tag.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.TagShowOutput[]>;

    /**
     * Create a Tag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagArgs | TagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagState | undefined;
            resourceInputs["allowedValues"] = state ? state.allowedValues : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["maskingPolicies"] = state ? state.maskingPolicies : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as TagArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["allowedValues"] = args ? args.allowedValues : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["maskingPolicies"] = args ? args.maskingPolicies : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Tag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tag resources.
 */
export interface TagState {
    /**
     * Set of allowed values for the tag.
     */
    allowedValues?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the tag.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
     */
    maskingPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW TAGS` for the given tag.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.TagShowOutput>[]>;
}

/**
 * The set of arguments for constructing a Tag resource.
 */
export interface TagArgs {
    /**
     * Set of allowed values for the tag.
     */
    allowedValues?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the tag.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database: pulumi.Input<string>;
    /**
     * Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
     */
    maskingPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema: pulumi.Input<string>;
}
