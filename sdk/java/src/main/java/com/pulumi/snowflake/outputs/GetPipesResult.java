// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetPipesPipe;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPipesResult {
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
     * @return The pipes in the schema
     * 
     */
    private final List<GetPipesPipe> pipes;
    /**
     * @return The schema from which to return the pipes from.
     * 
     */
    private final String schema;

    @CustomType.Constructor
    private GetPipesResult(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("pipes") List<GetPipesPipe> pipes,
        @CustomType.Parameter("schema") String schema) {
        this.database = database;
        this.id = id;
        this.pipes = pipes;
        this.schema = schema;
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
     * @return The pipes in the schema
     * 
     */
    public List<GetPipesPipe> pipes() {
        return this.pipes;
    }
    /**
     * @return The schema from which to return the pipes from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String id;
        private List<GetPipesPipe> pipes;
        private String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.pipes = defaults.pipes;
    	      this.schema = defaults.schema;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder pipes(List<GetPipesPipe> pipes) {
            this.pipes = Objects.requireNonNull(pipes);
            return this;
        }
        public Builder pipes(GetPipesPipe... pipes) {
            return pipes(List.of(pipes));
        }
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }        public GetPipesResult build() {
            return new GetPipesResult(database, id, pipes, schema);
        }
    }
}
