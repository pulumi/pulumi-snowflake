// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. <deprecation>
 */
export class FailoverGroupGrant extends pulumi.CustomResource {
    /**
     * Get an existing FailoverGroupGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FailoverGroupGrantState, opts?: pulumi.CustomResourceOptions): FailoverGroupGrant {
        return new FailoverGroupGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/failoverGroupGrant:FailoverGroupGrant';

    /**
     * Returns true if the given object is an instance of FailoverGroupGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FailoverGroupGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FailoverGroupGrant.__pulumiType;
    }

    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the failover group on which to grant privileges.
     */
    public readonly failoverGroupName!: pulumi.Output<string | undefined>;
    /**
     * The privilege to grant on the failover group. To grant all privileges, use the value `ALL PRIVILEGES`
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    public readonly revertOwnershipToRoleName!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a FailoverGroupGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FailoverGroupGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FailoverGroupGrantArgs | FailoverGroupGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FailoverGroupGrantState | undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["failoverGroupName"] = state ? state.failoverGroupName : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["revertOwnershipToRoleName"] = state ? state.revertOwnershipToRoleName : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as FailoverGroupGrantArgs | undefined;
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["failoverGroupName"] = args ? args.failoverGroupName : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["revertOwnershipToRoleName"] = args ? args.revertOwnershipToRoleName : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FailoverGroupGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FailoverGroupGrant resources.
 */
export interface FailoverGroupGrantState {
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The name of the failover group on which to grant privileges.
     */
    failoverGroupName?: pulumi.Input<string>;
    /**
     * The privilege to grant on the failover group. To grant all privileges, use the value `ALL PRIVILEGES`
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    revertOwnershipToRoleName?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a FailoverGroupGrant resource.
 */
export interface FailoverGroupGrantArgs {
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The name of the failover group on which to grant privileges.
     */
    failoverGroupName?: pulumi.Input<string>;
    /**
     * The privilege to grant on the failover group. To grant all privileges, use the value `ALL PRIVILEGES`
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    revertOwnershipToRoleName?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
