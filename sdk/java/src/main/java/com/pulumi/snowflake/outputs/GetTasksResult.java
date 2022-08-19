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
    private final String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The schema from which to return the tasks from.
     * 
     */
    private final String schema;
    /**
     * @return The tasks in the schema
     * 
     */
    private final List<GetTasksTask> tasks;

    @CustomType.Constructor
    private GetTasksResult(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("schema") String schema,
        @CustomType.Parameter("tasks") List<GetTasksTask> tasks) {
        this.database = database;
        this.id = id;
        this.schema = schema;
        this.tasks = tasks;
    }

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

    public static final class Builder {
        private String database;
        private String id;
        private String schema;
        private List<GetTasksTask> tasks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTasksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
    	      this.tasks = defaults.tasks;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public Builder tasks(List<GetTasksTask> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }
        public Builder tasks(GetTasksTask... tasks) {
            return tasks(List.of(tasks));
        }        public GetTasksResult build() {
            return new GetTasksResult(database, id, schema, tasks);
        }
    }
}
