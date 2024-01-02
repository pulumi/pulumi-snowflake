// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionsFunction {
    private List<String> argumentTypes;
    private String comment;
    private String database;
    private String name;
    private String returnType;
    private String schema;

    private GetFunctionsFunction() {}
    public List<String> argumentTypes() {
        return this.argumentTypes;
    }
    public String comment() {
        return this.comment;
    }
    public String database() {
        return this.database;
    }
    public String name() {
        return this.name;
    }
    public String returnType() {
        return this.returnType;
    }
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionsFunction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> argumentTypes;
        private String comment;
        private String database;
        private String name;
        private String returnType;
        private String schema;
        public Builder() {}
        public Builder(GetFunctionsFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argumentTypes = defaults.argumentTypes;
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.name = defaults.name;
    	      this.returnType = defaults.returnType;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder argumentTypes(List<String> argumentTypes) {
            if (argumentTypes == null) {
              throw new MissingRequiredPropertyException("GetFunctionsFunction", "argumentTypes");
            }
            this.argumentTypes = argumentTypes;
            return this;
        }
        public Builder argumentTypes(String... argumentTypes) {
            return argumentTypes(List.of(argumentTypes));
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetFunctionsFunction", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetFunctionsFunction", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFunctionsFunction", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder returnType(String returnType) {
            if (returnType == null) {
              throw new MissingRequiredPropertyException("GetFunctionsFunction", "returnType");
            }
            this.returnType = returnType;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetFunctionsFunction", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetFunctionsFunction build() {
            final var _resultValue = new GetFunctionsFunction();
            _resultValue.argumentTypes = argumentTypes;
            _resultValue.comment = comment;
            _resultValue.database = database;
            _resultValue.name = name;
            _resultValue.returnType = returnType;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
