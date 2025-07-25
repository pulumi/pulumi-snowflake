// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GetViewsIn;
import com.pulumi.snowflake.inputs.GetViewsLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetViewsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetViewsPlainArgs Empty = new GetViewsPlainArgs();

    /**
     * IN clause to filter the list of views
     * 
     */
    @Import(name="in")
    private @Nullable GetViewsIn in;

    /**
     * @return IN clause to filter the list of views
     * 
     */
    public Optional<GetViewsIn> in() {
        return Optional.ofNullable(this.in);
    }

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
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    @Import(name="limit")
    private @Nullable GetViewsLimit limit;

    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetViewsLimit> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    @Import(name="startsWith")
    private @Nullable String startsWith;

    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    public Optional<String> startsWith() {
        return Optional.ofNullable(this.startsWith);
    }

    /**
     * (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    @Import(name="withDescribe")
    private @Nullable Boolean withDescribe;

    /**
     * @return (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    private GetViewsPlainArgs() {}

    private GetViewsPlainArgs(GetViewsPlainArgs $) {
        this.in = $.in;
        this.like = $.like;
        this.limit = $.limit;
        this.startsWith = $.startsWith;
        this.withDescribe = $.withDescribe;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetViewsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetViewsPlainArgs $;

        public Builder() {
            $ = new GetViewsPlainArgs();
        }

        public Builder(GetViewsPlainArgs defaults) {
            $ = new GetViewsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param in IN clause to filter the list of views
         * 
         * @return builder
         * 
         */
        public Builder in(@Nullable GetViewsIn in) {
            $.in = in;
            return this;
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
         * @param limit Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable GetViewsLimit limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param startsWith Filters the output with **case-sensitive** characters indicating the beginning of the object name.
         * 
         * @return builder
         * 
         */
        public Builder startsWith(@Nullable String startsWith) {
            $.startsWith = startsWith;
            return this;
        }

        /**
         * @param withDescribe (Default: `true`) Runs DESC VIEW for each view returned by SHOW VIEWS. The output of describe is saved to the description field. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withDescribe(@Nullable Boolean withDescribe) {
            $.withDescribe = withDescribe;
            return this;
        }

        public GetViewsPlainArgs build() {
            return $;
        }
    }

}
