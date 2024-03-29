// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMaskingPoliciesMaskingPolicy {
    private String comment;
    private String database;
    private String kind;
    private String name;
    private String schema;

    private GetMaskingPoliciesMaskingPolicy() {}
    public String comment() {
        return this.comment;
    }
    public String database() {
        return this.database;
    }
    public String kind() {
        return this.kind;
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

    public static Builder builder(GetMaskingPoliciesMaskingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String database;
        private String kind;
        private String name;
        private String schema;
        public Builder() {}
        public Builder(GetMaskingPoliciesMaskingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetMaskingPoliciesMaskingPolicy build() {
            final var _resultValue = new GetMaskingPoliciesMaskingPolicy();
            _resultValue.comment = comment;
            _resultValue.database = database;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
