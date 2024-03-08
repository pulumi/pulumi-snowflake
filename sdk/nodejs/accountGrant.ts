// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. <deprecation>
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const grant = new snowflake.AccountGrant("grant", {
 *     privilege: "CREATE ROLE",
 *     roles: [
 *         "role1",
 *         "role2",
 *     ],
 *     withGrantOption: false,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * format is privilege|with_grant_option|roles
 *
 * ```sh
 * $ pulumi import snowflake:index/accountGrant:AccountGrant example "privilege|false|role1,role2"
 * ```
 */
export class AccountGrant extends pulumi.CustomResource {
    /**
     * Get an existing AccountGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountGrantState, opts?: pulumi.CustomResourceOptions): AccountGrant {
        return new AccountGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/accountGrant:AccountGrant';

    /**
     * Returns true if the given object is an instance of AccountGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountGrant.__pulumiType;
    }

    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a AccountGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AccountGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountGrantArgs | AccountGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountGrantState | undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as AccountGrantArgs | undefined;
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccountGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountGrant resources.
 */
export interface AccountGrantState {
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    privilege?: pulumi.Input<string>;
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
 * The set of arguments for constructing a AccountGrant resource.
 */
export interface AccountGrantArgs {
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
