// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantAccountRole instead. <deprecation>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const role = new snowflake.Role("role", {
 *     name: "rking_test_role",
 *     comment: "for testing",
 * });
 * const user = new snowflake.User("user", {
 *     name: "rking_test_user",
 *     comment: "for testing",
 * });
 * const user2 = new snowflake.User("user2", {
 *     name: "rking_test_user2",
 *     comment: "for testing",
 * });
 * const otherRole = new snowflake.Role("other_role", {name: "rking_test_role2"});
 * const grants = new snowflake.RoleGrants("grants", {
 *     roleName: role.name,
 *     roles: [otherRole.name],
 *     users: [
 *         user.name,
 *         user2.name,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * format is role_name|roles|users
 *
 * ```sh
 * $ pulumi import snowflake:index/roleGrants:RoleGrants example "role_name|role1,role2|user1,user2"
 * ```
 */
export class RoleGrants extends pulumi.CustomResource {
    /**
     * Get an existing RoleGrants resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleGrantsState, opts?: pulumi.CustomResourceOptions): RoleGrants {
        return new RoleGrants(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/roleGrants:RoleGrants';

    /**
     * Returns true if the given object is an instance of RoleGrants.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleGrants {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleGrants.__pulumiType;
    }

    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the role we are granting.
     */
    public readonly roleName!: pulumi.Output<string>;
    /**
     * Grants role to this specified role.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * Grants role to this specified user.
     */
    public readonly users!: pulumi.Output<string[] | undefined>;

    /**
     * Create a RoleGrants resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoleGrantsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleGrantsArgs | RoleGrantsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleGrantsState | undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["users"] = state ? state.users : undefined;
        } else {
            const args = argsOrState as RoleGrantsArgs | undefined;
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["users"] = args ? args.users : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoleGrants.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleGrants resources.
 */
export interface RoleGrantsState {
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The name of the role we are granting.
     */
    roleName?: pulumi.Input<string>;
    /**
     * Grants role to this specified role.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Grants role to this specified user.
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a RoleGrants resource.
 */
export interface RoleGrantsArgs {
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The name of the role we are granting.
     */
    roleName: pulumi.Input<string>;
    /**
     * Grants role to this specified role.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Grants role to this specified user.
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}
