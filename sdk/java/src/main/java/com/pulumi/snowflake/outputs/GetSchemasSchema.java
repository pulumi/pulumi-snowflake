// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemasSchema {
    private String comment;
    private String database;
    private String name;

    private GetSchemasSchema() {}
    public String comment() {
        return this.comment;
    }
    public String database() {
        return this.database;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemasSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String database;
        private String name;
        public Builder() {}
        public Builder(GetSchemasSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchema", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchema", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchema", "name");
            }
            this.name = name;
            return this;
        }
        public GetSchemasSchema build() {
            final var _resultValue = new GetSchemasSchema();
            _resultValue.comment = comment;
            _resultValue.database = database;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
