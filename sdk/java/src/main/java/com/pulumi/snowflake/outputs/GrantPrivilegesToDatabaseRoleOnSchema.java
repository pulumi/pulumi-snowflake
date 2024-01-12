// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrantPrivilegesToDatabaseRoleOnSchema {
    /**
     * @return The fully qualified name of the database.
     * 
     */
    private @Nullable String allSchemasInDatabase;
    /**
     * @return The fully qualified name of the database.
     * 
     */
    private @Nullable String futureSchemasInDatabase;
    /**
     * @return The fully qualified name of the schema.
     * 
     */
    private @Nullable String schemaName;

    private GrantPrivilegesToDatabaseRoleOnSchema() {}
    /**
     * @return The fully qualified name of the database.
     * 
     */
    public Optional<String> allSchemasInDatabase() {
        return Optional.ofNullable(this.allSchemasInDatabase);
    }
    /**
     * @return The fully qualified name of the database.
     * 
     */
    public Optional<String> futureSchemasInDatabase() {
        return Optional.ofNullable(this.futureSchemasInDatabase);
    }
    /**
     * @return The fully qualified name of the schema.
     * 
     */
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantPrivilegesToDatabaseRoleOnSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allSchemasInDatabase;
        private @Nullable String futureSchemasInDatabase;
        private @Nullable String schemaName;
        public Builder() {}
        public Builder(GrantPrivilegesToDatabaseRoleOnSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSchemasInDatabase = defaults.allSchemasInDatabase;
    	      this.futureSchemasInDatabase = defaults.futureSchemasInDatabase;
    	      this.schemaName = defaults.schemaName;
        }

        @CustomType.Setter
        public Builder allSchemasInDatabase(@Nullable String allSchemasInDatabase) {

            this.allSchemasInDatabase = allSchemasInDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder futureSchemasInDatabase(@Nullable String futureSchemasInDatabase) {

            this.futureSchemasInDatabase = futureSchemasInDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(@Nullable String schemaName) {

            this.schemaName = schemaName;
            return this;
        }
        public GrantPrivilegesToDatabaseRoleOnSchema build() {
            final var _resultValue = new GrantPrivilegesToDatabaseRoleOnSchema();
            _resultValue.allSchemasInDatabase = allSchemasInDatabase;
            _resultValue.futureSchemasInDatabase = futureSchemasInDatabase;
            _resultValue.schemaName = schemaName;
            return _resultValue;
        }
    }
}
