// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetProceduresProcedure;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProceduresResult {
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
     * @return The procedures in the schema
     * 
     */
    private final List<GetProceduresProcedure> procedures;
    /**
     * @return The schema from which to return the procedures from.
     * 
     */
    private final String schema;

    @CustomType.Constructor
    private GetProceduresResult(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("procedures") List<GetProceduresProcedure> procedures,
        @CustomType.Parameter("schema") String schema) {
        this.database = database;
        this.id = id;
        this.procedures = procedures;
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
     * @return The procedures in the schema
     * 
     */
    public List<GetProceduresProcedure> procedures() {
        return this.procedures;
    }
    /**
     * @return The schema from which to return the procedures from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProceduresResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String id;
        private List<GetProceduresProcedure> procedures;
        private String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProceduresResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.procedures = defaults.procedures;
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
        public Builder procedures(List<GetProceduresProcedure> procedures) {
            this.procedures = Objects.requireNonNull(procedures);
            return this;
        }
        public Builder procedures(GetProceduresProcedure... procedures) {
            return procedures(List.of(procedures));
        }
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }        public GetProceduresResult build() {
            return new GetProceduresResult(database, id, procedures, schema);
        }
    }
}
