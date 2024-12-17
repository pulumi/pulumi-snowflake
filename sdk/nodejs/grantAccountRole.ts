// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * format is role_name (string) | grantee_object_type (ROLE|USER) | grantee_name (string)
 *
 * ```sh
 * $ pulumi import snowflake:index/grantAccountRole:GrantAccountRole example '"test_role"|ROLE|"test_parent_role"'
 * ```
 */
export class GrantAccountRole extends pulumi.CustomResource {
    /**
     * Get an existing GrantAccountRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantAccountRoleState, opts?: pulumi.CustomResourceOptions): GrantAccountRole {
        return new GrantAccountRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/grantAccountRole:GrantAccountRole';

    /**
     * Returns true if the given object is an instance of GrantAccountRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GrantAccountRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GrantAccountRole.__pulumiType;
    }

    /**
     * The fully qualified name of the parent role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     */
    public readonly parentRoleName!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the role which will be granted to the user or parent role. For more information about this resource, see docs.
     */
    public readonly roleName!: pulumi.Output<string>;
    /**
     * The fully qualified name of the user on which specified role will be granted. For more information about this resource, see docs.
     */
    public readonly userName!: pulumi.Output<string | undefined>;

    /**
     * Create a GrantAccountRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantAccountRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantAccountRoleArgs | GrantAccountRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantAccountRoleState | undefined;
            resourceInputs["parentRoleName"] = state ? state.parentRoleName : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as GrantAccountRoleArgs | undefined;
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            resourceInputs["parentRoleName"] = args ? args.parentRoleName : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GrantAccountRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GrantAccountRole resources.
 */
export interface GrantAccountRoleState {
    /**
     * The fully qualified name of the parent role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     */
    parentRoleName?: pulumi.Input<string>;
    /**
     * The fully qualified name of the role which will be granted to the user or parent role. For more information about this resource, see docs.
     */
    roleName?: pulumi.Input<string>;
    /**
     * The fully qualified name of the user on which specified role will be granted. For more information about this resource, see docs.
     */
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GrantAccountRole resource.
 */
export interface GrantAccountRoleArgs {
    /**
     * The fully qualified name of the parent role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     */
    parentRoleName?: pulumi.Input<string>;
    /**
     * The fully qualified name of the role which will be granted to the user or parent role. For more information about this resource, see docs.
     */
    roleName: pulumi.Input<string>;
    /**
     * The fully qualified name of the user on which specified role will be granted. For more information about this resource, see docs.
     */
    userName?: pulumi.Input<string>;
}
