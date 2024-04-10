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
public final class GrantPrivilegesToDatabaseRoleOnSchemaObjectAll {
    /**
     * @return The fully qualified name of the database.
     * 
     */
    private @Nullable String inDatabase;
    /**
     * @return The fully qualified name of the schema.
     * 
     */
    private @Nullable String inSchema;
    /**
     * @return The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | STREAMLITS | ICEBERG TABLES.
     * 
     */
    private String objectTypePlural;

    private GrantPrivilegesToDatabaseRoleOnSchemaObjectAll() {}
    /**
     * @return The fully qualified name of the database.
     * 
     */
    public Optional<String> inDatabase() {
        return Optional.ofNullable(this.inDatabase);
    }
    /**
     * @return The fully qualified name of the schema.
     * 
     */
    public Optional<String> inSchema() {
        return Optional.ofNullable(this.inSchema);
    }
    /**
     * @return The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | STREAMLITS | ICEBERG TABLES.
     * 
     */
    public String objectTypePlural() {
        return this.objectTypePlural;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantPrivilegesToDatabaseRoleOnSchemaObjectAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String inDatabase;
        private @Nullable String inSchema;
        private String objectTypePlural;
        public Builder() {}
        public Builder(GrantPrivilegesToDatabaseRoleOnSchemaObjectAll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inDatabase = defaults.inDatabase;
    	      this.inSchema = defaults.inSchema;
    	      this.objectTypePlural = defaults.objectTypePlural;
        }

        @CustomType.Setter
        public Builder inDatabase(@Nullable String inDatabase) {

            this.inDatabase = inDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder inSchema(@Nullable String inSchema) {

            this.inSchema = inSchema;
            return this;
        }
        @CustomType.Setter
        public Builder objectTypePlural(String objectTypePlural) {
            if (objectTypePlural == null) {
              throw new MissingRequiredPropertyException("GrantPrivilegesToDatabaseRoleOnSchemaObjectAll", "objectTypePlural");
            }
            this.objectTypePlural = objectTypePlural;
            return this;
        }
        public GrantPrivilegesToDatabaseRoleOnSchemaObjectAll build() {
            final var _resultValue = new GrantPrivilegesToDatabaseRoleOnSchemaObjectAll();
            _resultValue.inDatabase = inDatabase;
            _resultValue.inSchema = inSchema;
            _resultValue.objectTypePlural = objectTypePlural;
            return _resultValue;
        }
    }
}
