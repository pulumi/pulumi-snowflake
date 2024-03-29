// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectParameterObjectIdentifier {
    /**
     * @return Name of the database that the object was created in.
     * 
     */
    private @Nullable String database;
    /**
     * @return Name of the object to set the parameter for.
     * 
     */
    private String name;
    /**
     * @return Name of the schema that the object was created in.
     * 
     */
    private @Nullable String schema;

    private ObjectParameterObjectIdentifier() {}
    /**
     * @return Name of the database that the object was created in.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * @return Name of the object to set the parameter for.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of the schema that the object was created in.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectParameterObjectIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String database;
        private String name;
        private @Nullable String schema;
        public Builder() {}
        public Builder(ObjectParameterObjectIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder database(@Nullable String database) {

            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ObjectParameterObjectIdentifier", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable String schema) {

            this.schema = schema;
            return this;
        }
        public ObjectParameterObjectIdentifier build() {
            final var _resultValue = new ObjectParameterObjectIdentifier();
            _resultValue.database = database;
            _resultValue.name = name;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
