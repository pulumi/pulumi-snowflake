// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetFunctionsFunction;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionsResult {
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private String database;
    /**
     * @return The functions in the schema
     * 
     */
    private List<GetFunctionsFunction> functions;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The schema from which to return the functions from.
     * 
     */
    private String schema;

    private GetFunctionsResult() {}
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The functions in the schema
     * 
     */
    public List<GetFunctionsFunction> functions() {
        return this.functions;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The schema from which to return the functions from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private List<GetFunctionsFunction> functions;
        private String id;
        private String schema;
        public Builder() {}
        public Builder(GetFunctionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.functions = defaults.functions;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetFunctionsResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder functions(List<GetFunctionsFunction> functions) {
            if (functions == null) {
              throw new MissingRequiredPropertyException("GetFunctionsResult", "functions");
            }
            this.functions = functions;
            return this;
        }
        public Builder functions(GetFunctionsFunction... functions) {
            return functions(List.of(functions));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFunctionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetFunctionsResult", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetFunctionsResult build() {
            final var _resultValue = new GetFunctionsResult();
            _resultValue.database = database;
            _resultValue.functions = functions;
            _resultValue.id = id;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
