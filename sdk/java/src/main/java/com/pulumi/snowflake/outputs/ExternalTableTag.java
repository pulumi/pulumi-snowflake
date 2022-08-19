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
    private final @Nullable String database;
    /**
     * @return Tag name, e.g. department.
     * 
     */
    private final String name;
    /**
     * @return Name of the schema that the tag was created in.
     * 
     */
    private final @Nullable String schema;
    /**
     * @return Tag value, e.g. marketing_info.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ExternalTableTag(
        @CustomType.Parameter("database") @Nullable String database,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schema") @Nullable String schema,
        @CustomType.Parameter("value") String value) {
        this.database = database;
        this.name = name;
        this.schema = schema;
        this.value = value;
    }

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

    public static final class Builder {
        private @Nullable String database;
        private String name;
        private @Nullable String schema;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalTableTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.value = defaults.value;
        }

        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ExternalTableTag build() {
            return new ExternalTableTag(database, name, schema, value);
        }
    }
}
