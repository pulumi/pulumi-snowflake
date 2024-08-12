// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.PasswordPolicyArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.PasswordPolicyState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A password policy specifies the requirements that must be met to create and reset a password to authenticate to Snowflake.
 * 
 */
@ResourceType(type="snowflake:index/passwordPolicy:PasswordPolicy")
public class PasswordPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Adds a comment or overwrites an existing comment for the password policy.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Adds a comment or overwrites an existing comment for the password policy.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database this password policy belongs to.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database this password policy belongs to.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     * 
     */
    @Export(name="history", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> history;

    /**
     * @return Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     * 
     */
    public Output<Optional<Integer>> history() {
        return Codegen.optional(this.history);
    }
    /**
     * Prevent overwriting a previous password policy with the same name.
     * 
     */
    @Export(name="ifNotExists", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ifNotExists;

    /**
     * @return Prevent overwriting a previous password policy with the same name.
     * 
     */
    public Output<Optional<Boolean>> ifNotExists() {
        return Codegen.optional(this.ifNotExists);
    }
    /**
     * Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     * 
     */
    @Export(name="lockoutTimeMins", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> lockoutTimeMins;

    /**
     * @return Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     * 
     */
    public Output<Optional<Integer>> lockoutTimeMins() {
        return Codegen.optional(this.lockoutTimeMins);
    }
    /**
     * Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     * 
     */
    @Export(name="maxAgeDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxAgeDays;

    /**
     * @return Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     * 
     */
    public Output<Optional<Integer>> maxAgeDays() {
        return Codegen.optional(this.maxAgeDays);
    }
    /**
     * Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     * 
     */
    @Export(name="maxLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxLength;

    /**
     * @return Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     * 
     */
    public Output<Optional<Integer>> maxLength() {
        return Codegen.optional(this.maxLength);
    }
    /**
     * Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     * 
     */
    @Export(name="maxRetries", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxRetries;

    /**
     * @return Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     * 
     */
    public Output<Optional<Integer>> maxRetries() {
        return Codegen.optional(this.maxRetries);
    }
    /**
     * Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     * 
     */
    @Export(name="minAgeDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minAgeDays;

    /**
     * @return Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     * 
     */
    public Output<Optional<Integer>> minAgeDays() {
        return Codegen.optional(this.minAgeDays);
    }
    /**
     * Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     * 
     */
    @Export(name="minLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minLength;

    /**
     * @return Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     * 
     */
    public Output<Optional<Integer>> minLength() {
        return Codegen.optional(this.minLength);
    }
    /**
     * Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Export(name="minLowerCaseChars", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minLowerCaseChars;

    /**
     * @return Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Output<Optional<Integer>> minLowerCaseChars() {
        return Codegen.optional(this.minLowerCaseChars);
    }
    /**
     * Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Export(name="minNumericChars", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minNumericChars;

    /**
     * @return Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Output<Optional<Integer>> minNumericChars() {
        return Codegen.optional(this.minNumericChars);
    }
    /**
     * Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Export(name="minSpecialChars", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minSpecialChars;

    /**
     * @return Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Output<Optional<Integer>> minSpecialChars() {
        return Codegen.optional(this.minSpecialChars);
    }
    /**
     * Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Export(name="minUpperCaseChars", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minUpperCaseChars;

    /**
     * @return Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Output<Optional<Integer>> minUpperCaseChars() {
        return Codegen.optional(this.minUpperCaseChars);
    }
    /**
     * Identifier for the password policy; must be unique for your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier for the password policy; must be unique for your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether to override a previous password policy with the same name.
     * 
     */
    @Export(name="orReplace", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> orReplace;

    /**
     * @return Whether to override a previous password policy with the same name.
     * 
     */
    public Output<Optional<Boolean>> orReplace() {
        return Codegen.optional(this.orReplace);
    }
    /**
     * The qualified name for the password policy.
     * 
     */
    @Export(name="qualifiedName", refs={String.class}, tree="[0]")
    private Output<String> qualifiedName;

    /**
     * @return The qualified name for the password policy.
     * 
     */
    public Output<String> qualifiedName() {
        return this.qualifiedName;
    }
    /**
     * The schema this password policy belongs to.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema this password policy belongs to.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PasswordPolicy(java.lang.String name) {
        this(name, PasswordPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PasswordPolicy(java.lang.String name, PasswordPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PasswordPolicy(java.lang.String name, PasswordPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/passwordPolicy:PasswordPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PasswordPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable PasswordPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/passwordPolicy:PasswordPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static PasswordPolicyArgs makeArgs(PasswordPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PasswordPolicyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PasswordPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable PasswordPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PasswordPolicy(name, id, state, options);
    }
}
