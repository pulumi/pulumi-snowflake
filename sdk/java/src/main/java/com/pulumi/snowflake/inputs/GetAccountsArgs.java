// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountsArgs Empty = new GetAccountsArgs();

    /**
     * Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private GetAccountsArgs() {}

    private GetAccountsArgs(GetAccountsArgs $) {
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountsArgs $;

        public Builder() {
            $ = new GetAccountsArgs();
        }

        public Builder(GetAccountsArgs defaults) {
            $ = new GetAccountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public GetAccountsArgs build() {
            return $;
        }
    }

}