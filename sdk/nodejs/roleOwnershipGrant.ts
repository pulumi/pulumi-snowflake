// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class RoleOwnershipGrant extends pulumi.CustomResource {
    /**
     * Get an existing RoleOwnershipGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleOwnershipGrantState, opts?: pulumi.CustomResourceOptions): RoleOwnershipGrant {
        return new RoleOwnershipGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/roleOwnershipGrant:RoleOwnershipGrant';

    /**
     * Returns true if the given object is an instance of RoleOwnershipGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleOwnershipGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleOwnershipGrant.__pulumiType;
    }

    /**
     * Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to
     * a new role.
     */
    public readonly currentGrants!: pulumi.Output<string | undefined>;
    /**
     * The name of the role ownership is granted on.
     */
    public readonly onRoleName!: pulumi.Output<string>;
    /**
     * The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
     */
    public readonly toRoleName!: pulumi.Output<string>;

    /**
     * Create a RoleOwnershipGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoleOwnershipGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleOwnershipGrantArgs | RoleOwnershipGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleOwnershipGrantState | undefined;
            resourceInputs["currentGrants"] = state ? state.currentGrants : undefined;
            resourceInputs["onRoleName"] = state ? state.onRoleName : undefined;
            resourceInputs["toRoleName"] = state ? state.toRoleName : undefined;
        } else {
            const args = argsOrState as RoleOwnershipGrantArgs | undefined;
            if ((!args || args.onRoleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'onRoleName'");
            }
            if ((!args || args.toRoleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'toRoleName'");
            }
            resourceInputs["currentGrants"] = args ? args.currentGrants : undefined;
            resourceInputs["onRoleName"] = args ? args.onRoleName : undefined;
            resourceInputs["toRoleName"] = args ? args.toRoleName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoleOwnershipGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleOwnershipGrant resources.
 */
export interface RoleOwnershipGrantState {
    /**
     * Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to
     * a new role.
     */
    currentGrants?: pulumi.Input<string>;
    /**
     * The name of the role ownership is granted on.
     */
    onRoleName?: pulumi.Input<string>;
    /**
     * The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
     */
    toRoleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RoleOwnershipGrant resource.
 */
export interface RoleOwnershipGrantArgs {
    /**
     * Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to
     * a new role.
     */
    currentGrants?: pulumi.Input<string>;
    /**
     * The name of the role ownership is granted on.
     */
    onRoleName: pulumi.Input<string>;
    /**
     * The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
     */
    toRoleName: pulumi.Input<string>;
}
