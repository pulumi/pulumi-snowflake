// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * format is application_role_name (string) | object_type (ACCOUNT_ROLE|APPLICATION) | grantee_name (string)
 *
 * ```sh
 * $ pulumi import snowflake:index/grantApplicationRole:GrantApplicationRole \"app_role_1\"|ACCOUNT_ROLE|\"my_role\""
 * ```
 */
export class GrantApplicationRole extends pulumi.CustomResource {
    /**
     * Get an existing GrantApplicationRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantApplicationRoleState, opts?: pulumi.CustomResourceOptions): GrantApplicationRole {
        return new GrantApplicationRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/grantApplicationRole:GrantApplicationRole';

    /**
     * Returns true if the given object is an instance of GrantApplicationRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GrantApplicationRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GrantApplicationRole.__pulumiType;
    }

    /**
     * The fully qualified name of the application on which application role will be granted.
     */
    public readonly applicationName!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the application role to grant.
     */
    public readonly applicationRoleName!: pulumi.Output<string>;
    /**
     * The fully qualified name of the account role on which application role will be granted.
     */
    public readonly parentAccountRoleName!: pulumi.Output<string | undefined>;

    /**
     * Create a GrantApplicationRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantApplicationRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantApplicationRoleArgs | GrantApplicationRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantApplicationRoleState | undefined;
            resourceInputs["applicationName"] = state ? state.applicationName : undefined;
            resourceInputs["applicationRoleName"] = state ? state.applicationRoleName : undefined;
            resourceInputs["parentAccountRoleName"] = state ? state.parentAccountRoleName : undefined;
        } else {
            const args = argsOrState as GrantApplicationRoleArgs | undefined;
            if ((!args || args.applicationRoleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationRoleName'");
            }
            resourceInputs["applicationName"] = args ? args.applicationName : undefined;
            resourceInputs["applicationRoleName"] = args ? args.applicationRoleName : undefined;
            resourceInputs["parentAccountRoleName"] = args ? args.parentAccountRoleName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GrantApplicationRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GrantApplicationRole resources.
 */
export interface GrantApplicationRoleState {
    /**
     * The fully qualified name of the application on which application role will be granted.
     */
    applicationName?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the application role to grant.
     */
    applicationRoleName?: pulumi.Input<string>;
    /**
     * The fully qualified name of the account role on which application role will be granted.
     */
    parentAccountRoleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GrantApplicationRole resource.
 */
export interface GrantApplicationRoleArgs {
    /**
     * The fully qualified name of the application on which application role will be granted.
     */
    applicationName?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the application role to grant.
     */
    applicationRoleName: pulumi.Input<string>;
    /**
     * The fully qualified name of the account role on which application role will be granted.
     */
    parentAccountRoleName?: pulumi.Input<string>;
}
