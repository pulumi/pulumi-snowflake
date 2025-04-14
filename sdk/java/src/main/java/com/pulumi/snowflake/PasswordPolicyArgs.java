// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PasswordPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PasswordPolicyArgs Empty = new PasswordPolicyArgs();

    /**
     * Adds a comment or overwrites an existing comment for the password policy.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Adds a comment or overwrites an existing comment for the password policy.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database this password policy belongs to.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database this password policy belongs to.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * (Default: `0`) Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     * 
     */
    @Import(name="history")
    private @Nullable Output<Integer> history;

    /**
     * @return (Default: `0`) Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
     * 
     */
    public Optional<Output<Integer>> history() {
        return Optional.ofNullable(this.history);
    }

    /**
     * (Default: `false`) Prevent overwriting a previous password policy with the same name.
     * 
     */
    @Import(name="ifNotExists")
    private @Nullable Output<Boolean> ifNotExists;

    /**
     * @return (Default: `false`) Prevent overwriting a previous password policy with the same name.
     * 
     */
    public Optional<Output<Boolean>> ifNotExists() {
        return Optional.ofNullable(this.ifNotExists);
    }

    /**
     * (Default: `15`) Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     * 
     */
    @Import(name="lockoutTimeMins")
    private @Nullable Output<Integer> lockoutTimeMins;

    /**
     * @return (Default: `15`) Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
     * 
     */
    public Optional<Output<Integer>> lockoutTimeMins() {
        return Optional.ofNullable(this.lockoutTimeMins);
    }

    /**
     * (Default: `90`) Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     * 
     */
    @Import(name="maxAgeDays")
    private @Nullable Output<Integer> maxAgeDays;

    /**
     * @return (Default: `90`) Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
     * 
     */
    public Optional<Output<Integer>> maxAgeDays() {
        return Optional.ofNullable(this.maxAgeDays);
    }

    /**
     * (Default: `256`) Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     * 
     */
    @Import(name="maxLength")
    private @Nullable Output<Integer> maxLength;

    /**
     * @return (Default: `256`) Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
     * 
     */
    public Optional<Output<Integer>> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }

    /**
     * (Default: `5`) Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return (Default: `5`) Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * (Default: `0`) Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     * 
     */
    @Import(name="minAgeDays")
    private @Nullable Output<Integer> minAgeDays;

    /**
     * @return (Default: `0`) Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
     * 
     */
    public Optional<Output<Integer>> minAgeDays() {
        return Optional.ofNullable(this.minAgeDays);
    }

    /**
     * (Default: `8`) Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    /**
     * @return (Default: `8`) Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
     * 
     */
    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    /**
     * (Default: `1`) Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Import(name="minLowerCaseChars")
    private @Nullable Output<Integer> minLowerCaseChars;

    /**
     * @return (Default: `1`) Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Optional<Output<Integer>> minLowerCaseChars() {
        return Optional.ofNullable(this.minLowerCaseChars);
    }

    /**
     * (Default: `1`) Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Import(name="minNumericChars")
    private @Nullable Output<Integer> minNumericChars;

    /**
     * @return (Default: `1`) Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Optional<Output<Integer>> minNumericChars() {
        return Optional.ofNullable(this.minNumericChars);
    }

    /**
     * (Default: `1`) Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Import(name="minSpecialChars")
    private @Nullable Output<Integer> minSpecialChars;

    /**
     * @return (Default: `1`) Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Optional<Output<Integer>> minSpecialChars() {
        return Optional.ofNullable(this.minSpecialChars);
    }

    /**
     * (Default: `1`) Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    @Import(name="minUpperCaseChars")
    private @Nullable Output<Integer> minUpperCaseChars;

    /**
     * @return (Default: `1`) Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
     * 
     */
    public Optional<Output<Integer>> minUpperCaseChars() {
        return Optional.ofNullable(this.minUpperCaseChars);
    }

    /**
     * Identifier for the password policy; must be unique for your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier for the password policy; must be unique for your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Default: `false`) Whether to override a previous password policy with the same name.
     * 
     */
    @Import(name="orReplace")
    private @Nullable Output<Boolean> orReplace;

    /**
     * @return (Default: `false`) Whether to override a previous password policy with the same name.
     * 
     */
    public Optional<Output<Boolean>> orReplace() {
        return Optional.ofNullable(this.orReplace);
    }

    /**
     * The schema this password policy belongs to.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema this password policy belongs to.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private PasswordPolicyArgs() {}

    private PasswordPolicyArgs(PasswordPolicyArgs $) {
        this.comment = $.comment;
        this.database = $.database;
        this.history = $.history;
        this.ifNotExists = $.ifNotExists;
        this.lockoutTimeMins = $.lockoutTimeMins;
        this.maxAgeDays = $.maxAgeDays;
        this.maxLength = $.maxLength;
        this.maxRetries = $.maxRetries;
        this.minAgeDays = $.minAgeDays;
        this.minLength = $.minLength;
        this.minLowerCaseChars = $.minLowerCaseChars;
        this.minNumericChars = $.minNumericChars;
        this.minSpecialChars = $.minSpecialChars;
        this.minUpperCaseChars = $.minUpperCaseChars;
        this.name = $.name;
        this.orReplace = $.orReplace;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PasswordPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PasswordPolicyArgs $;

        public Builder() {
            $ = new PasswordPolicyArgs();
        }

        public Builder(PasswordPolicyArgs defaults) {
            $ = new PasswordPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Adds a comment or overwrites an existing comment for the password policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Adds a comment or overwrites an existing comment for the password policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database this password policy belongs to.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database this password policy belongs to.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param history (Default: `0`) Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
         * 
         * @return builder
         * 
         */
        public Builder history(@Nullable Output<Integer> history) {
            $.history = history;
            return this;
        }

        /**
         * @param history (Default: `0`) Specifies the number of the most recent passwords that Snowflake stores. These stored passwords cannot be repeated when a user updates their password value. The current password value does not count towards the history. When you increase the history value, Snowflake saves the previous values. When you decrease the value, Snowflake saves the stored values up to that value that is set. For example, if the history value is 8 and you change the history value to 3, Snowflake stores the most recent 3 passwords and deletes the 5 older password values from the history. Default: 0 Max: 24
         * 
         * @return builder
         * 
         */
        public Builder history(Integer history) {
            return history(Output.of(history));
        }

        /**
         * @param ifNotExists (Default: `false`) Prevent overwriting a previous password policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder ifNotExists(@Nullable Output<Boolean> ifNotExists) {
            $.ifNotExists = ifNotExists;
            return this;
        }

        /**
         * @param ifNotExists (Default: `false`) Prevent overwriting a previous password policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder ifNotExists(Boolean ifNotExists) {
            return ifNotExists(Output.of(ifNotExists));
        }

        /**
         * @param lockoutTimeMins (Default: `15`) Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
         * 
         * @return builder
         * 
         */
        public Builder lockoutTimeMins(@Nullable Output<Integer> lockoutTimeMins) {
            $.lockoutTimeMins = lockoutTimeMins;
            return this;
        }

        /**
         * @param lockoutTimeMins (Default: `15`) Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
         * 
         * @return builder
         * 
         */
        public Builder lockoutTimeMins(Integer lockoutTimeMins) {
            return lockoutTimeMins(Output.of(lockoutTimeMins));
        }

        /**
         * @param maxAgeDays (Default: `90`) Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeDays(@Nullable Output<Integer> maxAgeDays) {
            $.maxAgeDays = maxAgeDays;
            return this;
        }

        /**
         * @param maxAgeDays (Default: `90`) Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeDays(Integer maxAgeDays) {
            return maxAgeDays(Output.of(maxAgeDays));
        }

        /**
         * @param maxLength (Default: `256`) Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
         * 
         * @return builder
         * 
         */
        public Builder maxLength(@Nullable Output<Integer> maxLength) {
            $.maxLength = maxLength;
            return this;
        }

        /**
         * @param maxLength (Default: `256`) Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
         * 
         * @return builder
         * 
         */
        public Builder maxLength(Integer maxLength) {
            return maxLength(Output.of(maxLength));
        }

        /**
         * @param maxRetries (Default: `5`) Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries (Default: `5`) Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param minAgeDays (Default: `0`) Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder minAgeDays(@Nullable Output<Integer> minAgeDays) {
            $.minAgeDays = minAgeDays;
            return this;
        }

        /**
         * @param minAgeDays (Default: `0`) Specifies the number of days the user must wait before a recently changed password can be changed again. Supported range: 0 to 999, inclusive. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder minAgeDays(Integer minAgeDays) {
            return minAgeDays(Output.of(minAgeDays));
        }

        /**
         * @param minLength (Default: `8`) Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
         * 
         * @return builder
         * 
         */
        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        /**
         * @param minLength (Default: `8`) Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
         * 
         * @return builder
         * 
         */
        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        /**
         * @param minLowerCaseChars (Default: `1`) Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minLowerCaseChars(@Nullable Output<Integer> minLowerCaseChars) {
            $.minLowerCaseChars = minLowerCaseChars;
            return this;
        }

        /**
         * @param minLowerCaseChars (Default: `1`) Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minLowerCaseChars(Integer minLowerCaseChars) {
            return minLowerCaseChars(Output.of(minLowerCaseChars));
        }

        /**
         * @param minNumericChars (Default: `1`) Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minNumericChars(@Nullable Output<Integer> minNumericChars) {
            $.minNumericChars = minNumericChars;
            return this;
        }

        /**
         * @param minNumericChars (Default: `1`) Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minNumericChars(Integer minNumericChars) {
            return minNumericChars(Output.of(minNumericChars));
        }

        /**
         * @param minSpecialChars (Default: `1`) Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minSpecialChars(@Nullable Output<Integer> minSpecialChars) {
            $.minSpecialChars = minSpecialChars;
            return this;
        }

        /**
         * @param minSpecialChars (Default: `1`) Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minSpecialChars(Integer minSpecialChars) {
            return minSpecialChars(Output.of(minSpecialChars));
        }

        /**
         * @param minUpperCaseChars (Default: `1`) Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minUpperCaseChars(@Nullable Output<Integer> minUpperCaseChars) {
            $.minUpperCaseChars = minUpperCaseChars;
            return this;
        }

        /**
         * @param minUpperCaseChars (Default: `1`) Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
         * 
         * @return builder
         * 
         */
        public Builder minUpperCaseChars(Integer minUpperCaseChars) {
            return minUpperCaseChars(Output.of(minUpperCaseChars));
        }

        /**
         * @param name Identifier for the password policy; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier for the password policy; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orReplace (Default: `false`) Whether to override a previous password policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(@Nullable Output<Boolean> orReplace) {
            $.orReplace = orReplace;
            return this;
        }

        /**
         * @param orReplace (Default: `false`) Whether to override a previous password policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(Boolean orReplace) {
            return orReplace(Output.of(orReplace));
        }

        /**
         * @param schema The schema this password policy belongs to.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema this password policy belongs to.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public PasswordPolicyArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("PasswordPolicyArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("PasswordPolicyArgs", "schema");
            }
            return $;
        }
    }

}
