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
public final class GrantOwnershipOnAll {
    /**
     * @return The fully qualified name of the database. For more information about this resource, see docs.
     * 
     */
    private @Nullable String inDatabase;
    /**
     * @return The fully qualified name of the schema. For more information about this resource, see docs.
     * 
     */
    private @Nullable String inSchema;
    /**
     * @return Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | RESOURCE MONITORS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
     * 
     */
    private String objectTypePlural;

    private GrantOwnershipOnAll() {}
    /**
     * @return The fully qualified name of the database. For more information about this resource, see docs.
     * 
     */
    public Optional<String> inDatabase() {
        return Optional.ofNullable(this.inDatabase);
    }
    /**
     * @return The fully qualified name of the schema. For more information about this resource, see docs.
     * 
     */
    public Optional<String> inSchema() {
        return Optional.ofNullable(this.inSchema);
    }
    /**
     * @return Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | RESOURCE MONITORS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
     * 
     */
    public String objectTypePlural() {
        return this.objectTypePlural;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantOwnershipOnAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String inDatabase;
        private @Nullable String inSchema;
        private String objectTypePlural;
        public Builder() {}
        public Builder(GrantOwnershipOnAll defaults) {
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
              throw new MissingRequiredPropertyException("GrantOwnershipOnAll", "objectTypePlural");
            }
            this.objectTypePlural = objectTypePlural;
            return this;
        }
        public GrantOwnershipOnAll build() {
            final var _resultValue = new GrantOwnershipOnAll();
            _resultValue.inDatabase = inDatabase;
            _resultValue.inSchema = inSchema;
            _resultValue.objectTypePlural = objectTypePlural;
            return _resultValue;
        }
    }
}
