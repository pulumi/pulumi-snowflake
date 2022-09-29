// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * format is tag database name | tag schema name | tag name | masking policy database | masking policy schema | masking policy name
 *
 * ```sh
 *  $ pulumi import snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation example 'tag_db|tag_schema|tag_name|mp_db|mp_schema|mp_name'
 * ```
 */
export class TagMaskingPolicyAssociation extends pulumi.CustomResource {
    /**
     * Get an existing TagMaskingPolicyAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagMaskingPolicyAssociationState, opts?: pulumi.CustomResourceOptions): TagMaskingPolicyAssociation {
        return new TagMaskingPolicyAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation';

    /**
     * Returns true if the given object is an instance of TagMaskingPolicyAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TagMaskingPolicyAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TagMaskingPolicyAssociation.__pulumiType;
    }

    /**
     * The the resource id of the masking policy
     */
    public readonly maskingPolicyId!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
     */
    public readonly tagId!: pulumi.Output<string>;

    /**
     * Create a TagMaskingPolicyAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagMaskingPolicyAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagMaskingPolicyAssociationArgs | TagMaskingPolicyAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagMaskingPolicyAssociationState | undefined;
            resourceInputs["maskingPolicyId"] = state ? state.maskingPolicyId : undefined;
            resourceInputs["tagId"] = state ? state.tagId : undefined;
        } else {
            const args = argsOrState as TagMaskingPolicyAssociationArgs | undefined;
            if ((!args || args.maskingPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maskingPolicyId'");
            }
            if ((!args || args.tagId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tagId'");
            }
            resourceInputs["maskingPolicyId"] = args ? args.maskingPolicyId : undefined;
            resourceInputs["tagId"] = args ? args.tagId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TagMaskingPolicyAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TagMaskingPolicyAssociation resources.
 */
export interface TagMaskingPolicyAssociationState {
    /**
     * The the resource id of the masking policy
     */
    maskingPolicyId?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
     */
    tagId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TagMaskingPolicyAssociation resource.
 */
export interface TagMaskingPolicyAssociationArgs {
    /**
     * The the resource id of the masking policy
     */
    maskingPolicyId: pulumi.Input<string>;
    /**
     * Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
     */
    tagId: pulumi.Input<string>;
}
