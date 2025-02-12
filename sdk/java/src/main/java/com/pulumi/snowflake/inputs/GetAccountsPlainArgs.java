// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountsPlainArgs Empty = new GetAccountsPlainArgs();

    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    @Import(name="like")
    private @Nullable String like;

    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<String> like() {
        return Optional.ofNullable(this.like);
    }

    /**
     * Includes dropped accounts that have not yet been deleted.
     * 
     */
    @Import(name="withHistory")
    private @Nullable Boolean withHistory;

    /**
     * @return Includes dropped accounts that have not yet been deleted.
     * 
     */
    public Optional<Boolean> withHistory() {
        return Optional.ofNullable(this.withHistory);
    }

    private GetAccountsPlainArgs() {}

    private GetAccountsPlainArgs(GetAccountsPlainArgs $) {
        this.like = $.like;
        this.withHistory = $.withHistory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountsPlainArgs $;

        public Builder() {
            $ = new GetAccountsPlainArgs();
        }

        public Builder(GetAccountsPlainArgs defaults) {
            $ = new GetAccountsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param like Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
         * 
         * @return builder
         * 
         */
        public Builder like(@Nullable String like) {
            $.like = like;
            return this;
        }

        /**
         * @param withHistory Includes dropped accounts that have not yet been deleted.
         * 
         * @return builder
         * 
         */
        public Builder withHistory(@Nullable Boolean withHistory) {
            $.withHistory = withHistory;
            return this;
        }

        public GetAccountsPlainArgs build() {
            return $;
        }
    }

}
