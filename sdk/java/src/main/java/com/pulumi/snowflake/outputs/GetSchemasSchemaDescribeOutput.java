// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemasSchemaDescribeOutput {
    private String createdOn;
    private String kind;
    private String name;

    private GetSchemasSchemaDescribeOutput() {}
    public String createdOn() {
        return this.createdOn;
    }
    public String kind() {
        return this.kind;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemasSchemaDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private String kind;
        private String name;
        public Builder() {}
        public Builder(GetSchemasSchemaDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaDescribeOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaDescribeOutput", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaDescribeOutput", "name");
            }
            this.name = name;
            return this;
        }
        public GetSchemasSchemaDescribeOutput build() {
            final var _resultValue = new GetSchemasSchemaDescribeOutput();
            _resultValue.createdOn = createdOn;
            _resultValue.kind = kind;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}