// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPipesPipe {
    private String comment;
    private String database;
    private String integration;
    private String name;
    private String schema;

    private GetPipesPipe() {}
    public String comment() {
        return this.comment;
    }
    public String database() {
        return this.database;
    }
    public String integration() {
        return this.integration;
    }
    public String name() {
        return this.name;
    }
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipesPipe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String database;
        private String integration;
        private String name;
        private String schema;
        public Builder() {}
        public Builder(GetPipesPipe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.integration = defaults.integration;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetPipesPipe", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetPipesPipe", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder integration(String integration) {
            if (integration == null) {
              throw new MissingRequiredPropertyException("GetPipesPipe", "integration");
            }
            this.integration = integration;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPipesPipe", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetPipesPipe", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetPipesPipe build() {
            final var _resultValue = new GetPipesPipe();
            _resultValue.comment = comment;
            _resultValue.database = database;
            _resultValue.integration = integration;
            _resultValue.name = name;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
