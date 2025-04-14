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
 * $ pulumi import snowflake:index/account:Account example '"<organization_name>"."<account_name>"'
 * ```
 */
export class Account extends pulumi.CustomResource {
    /**
     * Get an existing Account resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountState, opts?: pulumi.CustomResourceOptions): Account {
        return new Account(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/account:Account';

    /**
     * Returns true if the given object is an instance of Account.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Account {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Account.__pulumiType;
    }

    public readonly adminName!: pulumi.Output<string>;
    public readonly adminPassword!: pulumi.Output<string | undefined>;
    public readonly adminRsaPublicKey!: pulumi.Output<string | undefined>;
    public readonly adminUserType!: pulumi.Output<string | undefined>;
    /**
     * Specifies a comment for the account.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
     */
    public readonly edition!: pulumi.Output<string>;
    public readonly email!: pulumi.Output<string>;
    public readonly firstName!: pulumi.Output<string | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
     */
    public readonly gracePeriodInDays!: pulumi.Output<number>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
     */
    public readonly isOrgAdmin!: pulumi.Output<string | undefined>;
    public readonly lastName!: pulumi.Output<string | undefined>;
    public readonly mustChangePassword!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
     */
    public readonly regionGroup!: pulumi.Output<string | undefined>;
    /**
     * Outputs the result of `SHOW ACCOUNTS` for the given account.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.AccountShowOutput[]>;

    /**
     * Create a Account resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountArgs | AccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountState | undefined;
            resourceInputs["adminName"] = state ? state.adminName : undefined;
            resourceInputs["adminPassword"] = state ? state.adminPassword : undefined;
            resourceInputs["adminRsaPublicKey"] = state ? state.adminRsaPublicKey : undefined;
            resourceInputs["adminUserType"] = state ? state.adminUserType : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["edition"] = state ? state.edition : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["gracePeriodInDays"] = state ? state.gracePeriodInDays : undefined;
            resourceInputs["isOrgAdmin"] = state ? state.isOrgAdmin : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["mustChangePassword"] = state ? state.mustChangePassword : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["regionGroup"] = state ? state.regionGroup : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
        } else {
            const args = argsOrState as AccountArgs | undefined;
            if ((!args || args.adminName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'adminName'");
            }
            if ((!args || args.edition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'edition'");
            }
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            if ((!args || args.gracePeriodInDays === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gracePeriodInDays'");
            }
            resourceInputs["adminName"] = args?.adminName ? pulumi.secret(args.adminName) : undefined;
            resourceInputs["adminPassword"] = args?.adminPassword ? pulumi.secret(args.adminPassword) : undefined;
            resourceInputs["adminRsaPublicKey"] = args ? args.adminRsaPublicKey : undefined;
            resourceInputs["adminUserType"] = args ? args.adminUserType : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["edition"] = args ? args.edition : undefined;
            resourceInputs["email"] = args?.email ? pulumi.secret(args.email) : undefined;
            resourceInputs["firstName"] = args?.firstName ? pulumi.secret(args.firstName) : undefined;
            resourceInputs["gracePeriodInDays"] = args ? args.gracePeriodInDays : undefined;
            resourceInputs["isOrgAdmin"] = args ? args.isOrgAdmin : undefined;
            resourceInputs["lastName"] = args?.lastName ? pulumi.secret(args.lastName) : undefined;
            resourceInputs["mustChangePassword"] = args ? args.mustChangePassword : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["regionGroup"] = args ? args.regionGroup : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["adminName", "adminPassword", "email", "firstName", "lastName"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Account.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    adminName?: pulumi.Input<string>;
    adminPassword?: pulumi.Input<string>;
    adminRsaPublicKey?: pulumi.Input<string>;
    adminUserType?: pulumi.Input<string>;
    /**
     * Specifies a comment for the account.
     */
    comment?: pulumi.Input<string>;
    /**
     * Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
     */
    edition?: pulumi.Input<string>;
    email?: pulumi.Input<string>;
    firstName?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
     */
    gracePeriodInDays?: pulumi.Input<number>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
     */
    isOrgAdmin?: pulumi.Input<string>;
    lastName?: pulumi.Input<string>;
    mustChangePassword?: pulumi.Input<string>;
    /**
     * Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     */
    name?: pulumi.Input<string>;
    /**
     * [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    region?: pulumi.Input<string>;
    /**
     * ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
     */
    regionGroup?: pulumi.Input<string>;
    /**
     * Outputs the result of `SHOW ACCOUNTS` for the given account.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.AccountShowOutput>[]>;
}

/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    adminName: pulumi.Input<string>;
    adminPassword?: pulumi.Input<string>;
    adminRsaPublicKey?: pulumi.Input<string>;
    adminUserType?: pulumi.Input<string>;
    /**
     * Specifies a comment for the account.
     */
    comment?: pulumi.Input<string>;
    /**
     * Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
     */
    edition: pulumi.Input<string>;
    email: pulumi.Input<string>;
    firstName?: pulumi.Input<string>;
    /**
     * Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
     */
    gracePeriodInDays: pulumi.Input<number>;
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
     */
    isOrgAdmin?: pulumi.Input<string>;
    lastName?: pulumi.Input<string>;
    mustChangePassword?: pulumi.Input<string>;
    /**
     * Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     */
    name?: pulumi.Input<string>;
    /**
     * [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    region?: pulumi.Input<string>;
    /**
     * ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
     */
    regionGroup?: pulumi.Input<string>;
}
