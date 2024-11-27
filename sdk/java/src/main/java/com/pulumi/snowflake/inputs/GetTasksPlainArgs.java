// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GetTasksIn;
import com.pulumi.snowflake.inputs.GetTasksLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTasksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTasksPlainArgs Empty = new GetTasksPlainArgs();

    /**
     * IN clause to filter the list of objects
     * 
     */
    @Import(name="in")
    private @Nullable GetTasksIn in;

    /**
     * @return IN clause to filter the list of objects
     * 
     */
    public Optional<GetTasksIn> in() {
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
     * Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    @Import(name="limit")
    private @Nullable GetTasksLimit limit;

    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetTasksLimit> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Filters the command output to return only root tasks (tasks with no predecessors).
     * 
     */
    @Import(name="rootOnly")
    private @Nullable Boolean rootOnly;

    /**
     * @return Filters the command output to return only root tasks (tasks with no predecessors).
     * 
     */
    public Optional<Boolean> rootOnly() {
        return Optional.ofNullable(this.rootOnly);
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
     * Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     * 
     */
    @Import(name="withParameters")
    private @Nullable Boolean withParameters;

    /**
     * @return Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withParameters() {
        return Optional.ofNullable(this.withParameters);
    }

    private GetTasksPlainArgs() {}

    private GetTasksPlainArgs(GetTasksPlainArgs $) {
        this.in = $.in;
        this.like = $.like;
        this.limit = $.limit;
        this.rootOnly = $.rootOnly;
        this.startsWith = $.startsWith;
        this.withParameters = $.withParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTasksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTasksPlainArgs $;

        public Builder() {
            $ = new GetTasksPlainArgs();
        }

        public Builder(GetTasksPlainArgs defaults) {
            $ = new GetTasksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param in IN clause to filter the list of objects
         * 
         * @return builder
         * 
         */
        public Builder in(@Nullable GetTasksIn in) {
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
         * @param limit Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable GetTasksLimit limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param rootOnly Filters the command output to return only root tasks (tasks with no predecessors).
         * 
         * @return builder
         * 
         */
        public Builder rootOnly(@Nullable Boolean rootOnly) {
            $.rootOnly = rootOnly;
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
         * @param withParameters Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withParameters(@Nullable Boolean withParameters) {
            $.withParameters = withParameters;
            return this;
        }

        public GetTasksPlainArgs build() {
            return $;
        }
    }

}
