// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetTasksIn;
import com.pulumi.snowflake.outputs.GetTasksLimit;
import com.pulumi.snowflake.outputs.GetTasksTask;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTasksResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IN clause to filter the list of objects
     * 
     */
    private @Nullable GetTasksIn in;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    private @Nullable GetTasksLimit limit;
    /**
     * @return Filters the command output to return only root tasks (tasks with no predecessors).
     * 
     */
    private @Nullable Boolean rootOnly;
    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    private @Nullable String startsWith;
    /**
     * @return Holds the aggregated output of all task details queries.
     * 
     */
    private List<GetTasksTask> tasks;
    /**
     * @return (Default: `true`) Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     * 
     */
    private @Nullable Boolean withParameters;

    private GetTasksResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IN clause to filter the list of objects
     * 
     */
    public Optional<GetTasksIn> in() {
        return Optional.ofNullable(this.in);
    }
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<String> like() {
        return Optional.ofNullable(this.like);
    }
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetTasksLimit> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Filters the command output to return only root tasks (tasks with no predecessors).
     * 
     */
    public Optional<Boolean> rootOnly() {
        return Optional.ofNullable(this.rootOnly);
    }
    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    public Optional<String> startsWith() {
        return Optional.ofNullable(this.startsWith);
    }
    /**
     * @return Holds the aggregated output of all task details queries.
     * 
     */
    public List<GetTasksTask> tasks() {
        return this.tasks;
    }
    /**
     * @return (Default: `true`) Runs SHOW PARAMETERS FOR TASK for each task returned by SHOW TASK and saves the output to the parameters field as a map. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withParameters() {
        return Optional.ofNullable(this.withParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTasksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable GetTasksIn in;
        private @Nullable String like;
        private @Nullable GetTasksLimit limit;
        private @Nullable Boolean rootOnly;
        private @Nullable String startsWith;
        private List<GetTasksTask> tasks;
        private @Nullable Boolean withParameters;
        public Builder() {}
        public Builder(GetTasksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.in = defaults.in;
    	      this.like = defaults.like;
    	      this.limit = defaults.limit;
    	      this.rootOnly = defaults.rootOnly;
    	      this.startsWith = defaults.startsWith;
    	      this.tasks = defaults.tasks;
    	      this.withParameters = defaults.withParameters;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTasksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder in(@Nullable GetTasksIn in) {

            this.in = in;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable GetTasksLimit limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder rootOnly(@Nullable Boolean rootOnly) {

            this.rootOnly = rootOnly;
            return this;
        }
        @CustomType.Setter
        public Builder startsWith(@Nullable String startsWith) {

            this.startsWith = startsWith;
            return this;
        }
        @CustomType.Setter
        public Builder tasks(List<GetTasksTask> tasks) {
            if (tasks == null) {
              throw new MissingRequiredPropertyException("GetTasksResult", "tasks");
            }
            this.tasks = tasks;
            return this;
        }
        public Builder tasks(GetTasksTask... tasks) {
            return tasks(List.of(tasks));
        }
        @CustomType.Setter
        public Builder withParameters(@Nullable Boolean withParameters) {

            this.withParameters = withParameters;
            return this;
        }
        public GetTasksResult build() {
            final var _resultValue = new GetTasksResult();
            _resultValue.id = id;
            _resultValue.in = in;
            _resultValue.like = like;
            _resultValue.limit = limit;
            _resultValue.rootOnly = rootOnly;
            _resultValue.startsWith = startsWith;
            _resultValue.tasks = tasks;
            _resultValue.withParameters = withParameters;
            return _resultValue;
        }
    }
}
