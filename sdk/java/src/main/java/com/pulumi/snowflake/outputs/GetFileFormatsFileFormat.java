// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFileFormatsFileFormat {
    private String comment;
    private String database;
    private String formatType;
    private String name;
    private String schema;

    private GetFileFormatsFileFormat() {}
    public String comment() {
        return this.comment;
    }
    public String database() {
        return this.database;
    }
    public String formatType() {
        return this.formatType;
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

    public static Builder builder(GetFileFormatsFileFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String database;
        private String formatType;
        private String name;
        private String schema;
        public Builder() {}
        public Builder(GetFileFormatsFileFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.formatType = defaults.formatType;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder formatType(String formatType) {
            this.formatType = Objects.requireNonNull(formatType);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public GetFileFormatsFileFormat build() {
            final var o = new GetFileFormatsFileFormat();
            o.comment = comment;
            o.database = database;
            o.formatType = formatType;
            o.name = name;
            o.schema = schema;
            return o;
        }
    }
}
