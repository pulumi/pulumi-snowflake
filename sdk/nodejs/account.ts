// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The account resource allows you to create and manage Snowflake accounts.
 *
 *     **WARNING** This resource cannot be destroyed!!! The only way to delete accounts is to go through [Snowflake Support](https://docs.snowflake.com/en/user-guide/organizations-manage-accounts.html#deleting-an-account)
 *     
 *     **NOTE** ORGADMIN priviliges are required for this resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const orgadmin = new snowflake.Provider("orgadmin", {role: "ORGADMIN"});
 * const ac1 = new snowflake.Account("ac1", {
 *     adminName: "John Doe",
 *     adminPassword: "Abcd1234!",
 *     email: "john.doe@snowflake.com",
 *     firstName: "John",
 *     lastName: "Doe",
 *     mustChangePassword: true,
 *     edition: "STANDARD",
 *     comment: "Snowflake Test Account",
 *     region: "AWS_US_WEST_2",
 * }, {
 *     provider: snowflake.orgadmin,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/account:Account account <account_locator>
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

    /**
     * Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     */
    public readonly adminName!: pulumi.Output<string>;
    /**
     * Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     */
    public readonly adminPassword!: pulumi.Output<string | undefined>;
    /**
     * Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     */
    public readonly adminRsaPublicKey!: pulumi.Output<string | undefined>;
    /**
     * Specifies a comment for the account.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     */
    public readonly edition!: pulumi.Output<string>;
    /**
     * Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * First name of the initial administrative user of the account
     */
    public readonly firstName!: pulumi.Output<string | undefined>;
    /**
     * Last name of the initial administrative user of the account
     */
    public readonly lastName!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     */
    public readonly mustChangePassword!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    public readonly regionGroup!: pulumi.Output<string | undefined>;

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
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["edition"] = state ? state.edition : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["mustChangePassword"] = state ? state.mustChangePassword : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["regionGroup"] = state ? state.regionGroup : undefined;
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
            resourceInputs["adminName"] = args ? args.adminName : undefined;
            resourceInputs["adminPassword"] = args?.adminPassword ? pulumi.secret(args.adminPassword) : undefined;
            resourceInputs["adminRsaPublicKey"] = args?.adminRsaPublicKey ? pulumi.secret(args.adminRsaPublicKey) : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["edition"] = args ? args.edition : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["firstName"] = args ? args.firstName : undefined;
            resourceInputs["lastName"] = args ? args.lastName : undefined;
            resourceInputs["mustChangePassword"] = args ? args.mustChangePassword : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["regionGroup"] = args ? args.regionGroup : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["adminPassword", "adminRsaPublicKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Account.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     */
    adminName?: pulumi.Input<string>;
    /**
     * Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     */
    adminPassword?: pulumi.Input<string>;
    /**
     * Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     */
    adminRsaPublicKey?: pulumi.Input<string>;
    /**
     * Specifies a comment for the account.
     */
    comment?: pulumi.Input<string>;
    /**
     * [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     */
    edition?: pulumi.Input<string>;
    /**
     * Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     */
    email?: pulumi.Input<string>;
    /**
     * First name of the initial administrative user of the account
     */
    firstName?: pulumi.Input<string>;
    /**
     * Last name of the initial administrative user of the account
     */
    lastName?: pulumi.Input<string>;
    /**
     * Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     */
    mustChangePassword?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    region?: pulumi.Input<string>;
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    regionGroup?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     */
    adminName: pulumi.Input<string>;
    /**
     * Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     */
    adminPassword?: pulumi.Input<string>;
    /**
     * Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     */
    adminRsaPublicKey?: pulumi.Input<string>;
    /**
     * Specifies a comment for the account.
     */
    comment?: pulumi.Input<string>;
    /**
     * [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     */
    edition: pulumi.Input<string>;
    /**
     * Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     */
    email: pulumi.Input<string>;
    /**
     * First name of the initial administrative user of the account
     */
    firstName?: pulumi.Input<string>;
    /**
     * Last name of the initial administrative user of the account
     */
    lastName?: pulumi.Input<string>;
    /**
     * Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     */
    mustChangePassword?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    region?: pulumi.Input<string>;
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     */
    regionGroup?: pulumi.Input<string>;
}
