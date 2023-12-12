// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalTableTag {
    /**
     * @return Name of the database that the tag was created in.
     * 
     */
    private @Nullable String database;
    /**
     * @return Tag name, e.g. department.
     * 
     */
    private String name;
    /**
     * @return Name of the schema that the tag was created in.
     * 
     */
    private @Nullable String schema;
    /**
     * @return Tag value, e.g. marketing_info.
     * 
     */
    private String value;

    private ExternalTableTag() {}
    /**
     * @return Name of the database that the tag was created in.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * @return Tag name, e.g. department.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of the schema that the tag was created in.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return Tag value, e.g. marketing_info.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalTableTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String database;
        private String name;
        private @Nullable String schema;
        private String value;
        public Builder() {}
        public Builder(ExternalTableTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ExternalTableTag build() {
            final var _resultValue = new ExternalTableTag();
            _resultValue.database = database;
            _resultValue.name = name;
            _resultValue.schema = schema;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
