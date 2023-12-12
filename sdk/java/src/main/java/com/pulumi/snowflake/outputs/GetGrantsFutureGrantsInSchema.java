// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGrantsFutureGrantsInSchema {
    /**
     * @return The database in which the scehma resides. Optional when querying a schema in the current database.
     * 
     */
    private @Nullable String databaseName;
    /**
     * @return The name of the schema to list all privileges of new (ie. future) objects granted to
     * 
     */
    private String schemaName;

    private GetGrantsFutureGrantsInSchema() {}
    /**
     * @return The database in which the scehma resides. Optional when querying a schema in the current database.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * @return The name of the schema to list all privileges of new (ie. future) objects granted to
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrantsFutureGrantsInSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String databaseName;
        private String schemaName;
        public Builder() {}
        public Builder(GetGrantsFutureGrantsInSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.schemaName = defaults.schemaName;
        }

        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public GetGrantsFutureGrantsInSchema build() {
            final var _resultValue = new GetGrantsFutureGrantsInSchema();
            _resultValue.databaseName = databaseName;
            _resultValue.schemaName = schemaName;
            return _resultValue;
        }
    }
}
