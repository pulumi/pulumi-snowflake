// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSequencesSequence {
    private String comment;
    private String database;
    private String name;
    private String schema;

    private GetSequencesSequence() {}
    public String comment() {
        return this.comment;
    }
    public String database() {
        return this.database;
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

    public static Builder builder(GetSequencesSequence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String database;
        private String name;
        private String schema;
        public Builder() {}
        public Builder(GetSequencesSequence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetSequencesSequence", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetSequencesSequence", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSequencesSequence", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetSequencesSequence", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetSequencesSequence build() {
            final var _resultValue = new GetSequencesSequence();
            _resultValue.comment = comment;
            _resultValue.database = database;
            _resultValue.name = name;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
