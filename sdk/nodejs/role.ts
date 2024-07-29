// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.AccountRole instead. <deprecation>
 *
 * The resource is used for role management, where roles can be assigned privileges and, in turn, granted to users and other roles. When granted to roles they can create hierarchies of privilege structures. For more details, refer to the [official documentation](https://docs.snowflake.com/en/user-guide/security-access-control-overview).
 *
 * ## Minimal
 *
 * resource "snowflake.Role" "minimal" {
 *   name = "roleName"
 * }
 *
 * ## Complete (with every optional set)
 *
 * resource "snowflake.Role" "complete" {
 *   name    = "roleName"
 *   comment = "my account role"
 * }
 */
export class Role extends pulumi.CustomResource {
    /**
     * Get an existing Role resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleState, opts?: pulumi.CustomResourceOptions): Role {
        return new Role(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/role:Role';

    /**
     * Returns true if the given object is an instance of Role.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Role {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Role.__pulumiType;
    }

    public readonly comment!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * Outputs the result of `SHOW ROLES` for the given role.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.RoleShowOutput[]>;

    /**
     * Create a Role resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleArgs | RoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as RoleArgs | undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Role.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Role resources.
 */
export interface RoleState {
    comment?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW ROLES` for the given role.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.RoleShowOutput>[]>;
}

/**
 * The set of arguments for constructing a Role resource.
 */
export interface RoleArgs {
    comment?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
}
