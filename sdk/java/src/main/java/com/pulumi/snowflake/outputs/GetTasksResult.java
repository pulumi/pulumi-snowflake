// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetTasksTask;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTasksResult {
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The schema from which to return the tasks from.
     * 
     */
    private String schema;
    /**
     * @return The tasks in the schema
     * 
     */
    private List<GetTasksTask> tasks;

    private GetTasksResult() {}
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The schema from which to return the tasks from.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return The tasks in the schema
     * 
     */
    public List<GetTasksTask> tasks() {
        return this.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTasksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String id;
        private String schema;
        private List<GetTasksTask> tasks;
        public Builder() {}
        public Builder(GetTasksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
    	      this.tasks = defaults.tasks;
        }

        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder tasks(List<GetTasksTask> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }
        public Builder tasks(GetTasksTask... tasks) {
            return tasks(List.of(tasks));
        }
        public GetTasksResult build() {
            final var _resultValue = new GetTasksResult();
            _resultValue.database = database;
            _resultValue.id = id;
            _resultValue.schema = schema;
            _resultValue.tasks = tasks;
            return _resultValue;
        }
    }
}
