// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GetDatabasesLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasesPlainArgs Empty = new GetDatabasesPlainArgs();

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
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    @Import(name="limit")
    private @Nullable GetDatabasesLimit limit;

    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetDatabasesLimit> limit() {
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
     * Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    @Import(name="withDescribe")
    private @Nullable Boolean withDescribe;

    /**
     * @return Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    /**
     * Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     * 
     */
    @Import(name="withParameters")
    private @Nullable Boolean withParameters;

    /**
     * @return Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withParameters() {
        return Optional.ofNullable(this.withParameters);
    }

    private GetDatabasesPlainArgs() {}

    private GetDatabasesPlainArgs(GetDatabasesPlainArgs $) {
        this.like = $.like;
        this.limit = $.limit;
        this.startsWith = $.startsWith;
        this.withDescribe = $.withDescribe;
        this.withParameters = $.withParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasesPlainArgs $;

        public Builder() {
            $ = new GetDatabasesPlainArgs();
        }

        public Builder(GetDatabasesPlainArgs defaults) {
            $ = new GetDatabasesPlainArgs(Objects.requireNonNull(defaults));
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
         * @param limit Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable GetDatabasesLimit limit) {
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
         * @param withDescribe Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withDescribe(@Nullable Boolean withDescribe) {
            $.withDescribe = withDescribe;
            return this;
        }

        /**
         * @param withParameters Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withParameters(@Nullable Boolean withParameters) {
            $.withParameters = withParameters;
            return this;
        }

        public GetDatabasesPlainArgs build() {
            return $;
        }
    }

}
