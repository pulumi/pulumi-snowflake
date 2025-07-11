// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.GetDatabaseRolesLimitArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseRolesArgs Empty = new GetDatabaseRolesArgs();

    /**
     * The database from which to return the database roles from.
     * 
     */
    @Import(name="inDatabase", required=true)
    private Output<String> inDatabase;

    /**
     * @return The database from which to return the database roles from.
     * 
     */
    public Output<String> inDatabase() {
        return this.inDatabase;
    }

    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    @Import(name="like")
    private @Nullable Output<String> like;

    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<Output<String>> like() {
        return Optional.ofNullable(this.like);
    }

    /**
     * Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<GetDatabaseRolesLimitArgs> limit;

    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<Output<GetDatabaseRolesLimitArgs>> limit() {
        return Optional.ofNullable(this.limit);
    }

    private GetDatabaseRolesArgs() {}

    private GetDatabaseRolesArgs(GetDatabaseRolesArgs $) {
        this.inDatabase = $.inDatabase;
        this.like = $.like;
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseRolesArgs $;

        public Builder() {
            $ = new GetDatabaseRolesArgs();
        }

        public Builder(GetDatabaseRolesArgs defaults) {
            $ = new GetDatabaseRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inDatabase The database from which to return the database roles from.
         * 
         * @return builder
         * 
         */
        public Builder inDatabase(Output<String> inDatabase) {
            $.inDatabase = inDatabase;
            return this;
        }

        /**
         * @param inDatabase The database from which to return the database roles from.
         * 
         * @return builder
         * 
         */
        public Builder inDatabase(String inDatabase) {
            return inDatabase(Output.of(inDatabase));
        }

        /**
         * @param like Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
         * 
         * @return builder
         * 
         */
        public Builder like(@Nullable Output<String> like) {
            $.like = like;
            return this;
        }

        /**
         * @param like Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
         * 
         * @return builder
         * 
         */
        public Builder like(String like) {
            return like(Output.of(like));
        }

        /**
         * @param limit Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<GetDatabaseRolesLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
         * 
         * @return builder
         * 
         */
        public Builder limit(GetDatabaseRolesLimitArgs limit) {
            return limit(Output.of(limit));
        }

        public GetDatabaseRolesArgs build() {
            if ($.inDatabase == null) {
                throw new MissingRequiredPropertyException("GetDatabaseRolesArgs", "inDatabase");
            }
            return $;
        }
    }

}
