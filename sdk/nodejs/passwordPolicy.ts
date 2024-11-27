// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class PasswordPolicy extends pulumi.CustomResource {
    /**
     * Get an existing PasswordPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PasswordPolicyState, opts?: pulumi.CustomResourceOptions): PasswordPolicy {
        return new PasswordPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/passwordPolicy:PasswordPolicy';

    /**
     * Returns true if the given object is an instance of PasswordPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PasswordPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PasswordPolicy.__pulumiType;
    }

    /**
     * Adds a comment or overwrites an existing comment for the password policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database this password policy belongs to.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     */
    public readonly history!: pulumi.Output<number | undefined>;
    /**
     * Prevent overwriting a previous password policy with the same name.
     */
    public readonly ifNotExists!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     */
    public readonly lockoutTimeMins!: pulumi.Output<number | undefined>;
    /**
     * Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     */
    public readonly maxAgeDays!: pulumi.Output<number | undefined>;
    /**
     * Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     */
    public readonly maxLength!: pulumi.Output<number | undefined>;
    /**
     * Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     */
    public readonly maxRetries!: pulumi.Output<number | undefined>;
    /**
     * Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     */
    public readonly minAgeDays!: pulumi.Output<number | undefined>;
    /**
     * Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     */
    public readonly minLength!: pulumi.Output<number | undefined>;
    /**
     * Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    public readonly minLowerCaseChars!: pulumi.Output<number | undefined>;
    /**
     * Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    public readonly minNumericChars!: pulumi.Output<number | undefined>;
    /**
     * Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    public readonly minSpecialChars!: pulumi.Output<number | undefined>;
    /**
     * Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    public readonly minUpperCaseChars!: pulumi.Output<number | undefined>;
    /**
     * Identifier for the password policy; must be unique for your account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Whether to override a previous password policy with the same name.
     */
    public readonly orReplace!: pulumi.Output<boolean | undefined>;
    /**
     * The schema this password policy belongs to.
     */
    public readonly schema!: pulumi.Output<string>;

    /**
     * Create a PasswordPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PasswordPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PasswordPolicyArgs | PasswordPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PasswordPolicyState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["history"] = state ? state.history : undefined;
            resourceInputs["ifNotExists"] = state ? state.ifNotExists : undefined;
            resourceInputs["lockoutTimeMins"] = state ? state.lockoutTimeMins : undefined;
            resourceInputs["maxAgeDays"] = state ? state.maxAgeDays : undefined;
            resourceInputs["maxLength"] = state ? state.maxLength : undefined;
            resourceInputs["maxRetries"] = state ? state.maxRetries : undefined;
            resourceInputs["minAgeDays"] = state ? state.minAgeDays : undefined;
            resourceInputs["minLength"] = state ? state.minLength : undefined;
            resourceInputs["minLowerCaseChars"] = state ? state.minLowerCaseChars : undefined;
            resourceInputs["minNumericChars"] = state ? state.minNumericChars : undefined;
            resourceInputs["minSpecialChars"] = state ? state.minSpecialChars : undefined;
            resourceInputs["minUpperCaseChars"] = state ? state.minUpperCaseChars : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orReplace"] = state ? state.orReplace : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
        } else {
            const args = argsOrState as PasswordPolicyArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["history"] = args ? args.history : undefined;
            resourceInputs["ifNotExists"] = args ? args.ifNotExists : undefined;
            resourceInputs["lockoutTimeMins"] = args ? args.lockoutTimeMins : undefined;
            resourceInputs["maxAgeDays"] = args ? args.maxAgeDays : undefined;
            resourceInputs["maxLength"] = args ? args.maxLength : undefined;
            resourceInputs["maxRetries"] = args ? args.maxRetries : undefined;
            resourceInputs["minAgeDays"] = args ? args.minAgeDays : undefined;
            resourceInputs["minLength"] = args ? args.minLength : undefined;
            resourceInputs["minLowerCaseChars"] = args ? args.minLowerCaseChars : undefined;
            resourceInputs["minNumericChars"] = args ? args.minNumericChars : undefined;
            resourceInputs["minSpecialChars"] = args ? args.minSpecialChars : undefined;
            resourceInputs["minUpperCaseChars"] = args ? args.minUpperCaseChars : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orReplace"] = args ? args.orReplace : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PasswordPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PasswordPolicy resources.
 */
export interface PasswordPolicyState {
    /**
     * Adds a comment or overwrites an existing comment for the password policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database this password policy belongs to.
     */
    database?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     */
    history?: pulumi.Input<number>;
    /**
     * Prevent overwriting a previous password policy with the same name.
     */
    ifNotExists?: pulumi.Input<boolean>;
    /**
     * Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     */
    lockoutTimeMins?: pulumi.Input<number>;
    /**
     * Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     */
    maxAgeDays?: pulumi.Input<number>;
    /**
     * Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     */
    maxLength?: pulumi.Input<number>;
    /**
     * Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     */
    minAgeDays?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     */
    minLength?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minLowerCaseChars?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minNumericChars?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minSpecialChars?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minUpperCaseChars?: pulumi.Input<number>;
    /**
     * Identifier for the password policy; must be unique for your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to override a previous password policy with the same name.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * The schema this password policy belongs to.
     */
    schema?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PasswordPolicy resource.
 */
export interface PasswordPolicyArgs {
    /**
     * Adds a comment or overwrites an existing comment for the password policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database this password policy belongs to.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     */
    history?: pulumi.Input<number>;
    /**
     * Prevent overwriting a previous password policy with the same name.
     */
    ifNotExists?: pulumi.Input<boolean>;
    /**
     * Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     */
    lockoutTimeMins?: pulumi.Input<number>;
    /**
     * Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     */
    maxAgeDays?: pulumi.Input<number>;
    /**
     * Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     */
    maxLength?: pulumi.Input<number>;
    /**
     * Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     */
    minAgeDays?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     */
    minLength?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minLowerCaseChars?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minNumericChars?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minSpecialChars?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     */
    minUpperCaseChars?: pulumi.Input<number>;
    /**
     * Identifier for the password policy; must be unique for your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to override a previous password policy with the same name.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * The schema this password policy belongs to.
     */
    schema: pulumi.Input<string>;
}
