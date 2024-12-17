// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantOwnershipOnAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantOwnershipOnAllArgs Empty = new GrantOwnershipOnAllArgs();

    /**
     * The fully qualified name of the database. For more information about this resource, see docs.
     * 
     */
    @Import(name="inDatabase")
    private @Nullable Output<String> inDatabase;

    /**
     * @return The fully qualified name of the database. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> inDatabase() {
        return Optional.ofNullable(this.inDatabase);
    }

    /**
     * The fully qualified name of the schema. For more information about this resource, see docs.
     * 
     */
    @Import(name="inSchema")
    private @Nullable Output<String> inSchema;

    /**
     * @return The fully qualified name of the schema. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> inSchema() {
        return Optional.ofNullable(this.inSchema);
    }

    /**
     * Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
     * 
     */
    @Import(name="objectTypePlural", required=true)
    private Output<String> objectTypePlural;

    /**
     * @return Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
     * 
     */
    public Output<String> objectTypePlural() {
        return this.objectTypePlural;
    }

    private GrantOwnershipOnAllArgs() {}

    private GrantOwnershipOnAllArgs(GrantOwnershipOnAllArgs $) {
        this.inDatabase = $.inDatabase;
        this.inSchema = $.inSchema;
        this.objectTypePlural = $.objectTypePlural;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantOwnershipOnAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantOwnershipOnAllArgs $;

        public Builder() {
            $ = new GrantOwnershipOnAllArgs();
        }

        public Builder(GrantOwnershipOnAllArgs defaults) {
            $ = new GrantOwnershipOnAllArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inDatabase The fully qualified name of the database. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder inDatabase(@Nullable Output<String> inDatabase) {
            $.inDatabase = inDatabase;
            return this;
        }

        /**
         * @param inDatabase The fully qualified name of the database. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder inDatabase(String inDatabase) {
            return inDatabase(Output.of(inDatabase));
        }

        /**
         * @param inSchema The fully qualified name of the schema. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder inSchema(@Nullable Output<String> inSchema) {
            $.inSchema = inSchema;
            return this;
        }

        /**
         * @param inSchema The fully qualified name of the schema. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder inSchema(String inSchema) {
            return inSchema(Output.of(inSchema));
        }

        /**
         * @param objectTypePlural Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
         * 
         * @return builder
         * 
         */
        public Builder objectTypePlural(Output<String> objectTypePlural) {
            $.objectTypePlural = objectTypePlural;
            return this;
        }

        /**
         * @param objectTypePlural Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
         * 
         * @return builder
         * 
         */
        public Builder objectTypePlural(String objectTypePlural) {
            return objectTypePlural(Output.of(objectTypePlural));
        }

        public GrantOwnershipOnAllArgs build() {
            if ($.objectTypePlural == null) {
                throw new MissingRequiredPropertyException("GrantOwnershipOnAllArgs", "objectTypePlural");
            }
            return $;
        }
    }

}
