// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountParameterState extends com.pulumi.resources.ResourceArgs {

    public static final AccountParameterState Empty = new AccountParameterState();

    /**
     * Name of account parameter. Valid values are those in [account parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#account-parameters).
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Name of account parameter. Valid values are those in [account parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#account-parameters).
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Value of account parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of account parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AccountParameterState() {}

    private AccountParameterState(AccountParameterState $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountParameterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountParameterState $;

        public Builder() {
            $ = new AccountParameterState();
        }

        public Builder(AccountParameterState defaults) {
            $ = new AccountParameterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Name of account parameter. Valid values are those in [account parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#account-parameters).
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Name of account parameter. Valid values are those in [account parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#account-parameters).
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value of account parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of account parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AccountParameterState build() {
            return $;
        }
    }

}
