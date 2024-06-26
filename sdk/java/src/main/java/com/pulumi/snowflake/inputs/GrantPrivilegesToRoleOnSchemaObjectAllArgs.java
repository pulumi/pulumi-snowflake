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


public final class GrantPrivilegesToRoleOnSchemaObjectAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToRoleOnSchemaObjectAllArgs Empty = new GrantPrivilegesToRoleOnSchemaObjectAllArgs();

    /**
     * The fully qualified name of the database.
     * 
     */
    @Import(name="inDatabase")
    private @Nullable Output<String> inDatabase;

    /**
     * @return The fully qualified name of the database.
     * 
     */
    public Optional<Output<String>> inDatabase() {
        return Optional.ofNullable(this.inDatabase);
    }

    /**
     * The fully qualified name of the schema.
     * 
     */
    @Import(name="inSchema")
    private @Nullable Output<String> inSchema;

    /**
     * @return The fully qualified name of the schema.
     * 
     */
    public Optional<Output<String>> inSchema() {
        return Optional.ofNullable(this.inSchema);
    }

    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS
     * 
     */
    @Import(name="objectTypePlural", required=true)
    private Output<String> objectTypePlural;

    /**
     * @return The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS
     * 
     */
    public Output<String> objectTypePlural() {
        return this.objectTypePlural;
    }

    private GrantPrivilegesToRoleOnSchemaObjectAllArgs() {}

    private GrantPrivilegesToRoleOnSchemaObjectAllArgs(GrantPrivilegesToRoleOnSchemaObjectAllArgs $) {
        this.inDatabase = $.inDatabase;
        this.inSchema = $.inSchema;
        this.objectTypePlural = $.objectTypePlural;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToRoleOnSchemaObjectAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToRoleOnSchemaObjectAllArgs $;

        public Builder() {
            $ = new GrantPrivilegesToRoleOnSchemaObjectAllArgs();
        }

        public Builder(GrantPrivilegesToRoleOnSchemaObjectAllArgs defaults) {
            $ = new GrantPrivilegesToRoleOnSchemaObjectAllArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inDatabase The fully qualified name of the database.
         * 
         * @return builder
         * 
         */
        public Builder inDatabase(@Nullable Output<String> inDatabase) {
            $.inDatabase = inDatabase;
            return this;
        }

        /**
         * @param inDatabase The fully qualified name of the database.
         * 
         * @return builder
         * 
         */
        public Builder inDatabase(String inDatabase) {
            return inDatabase(Output.of(inDatabase));
        }

        /**
         * @param inSchema The fully qualified name of the schema.
         * 
         * @return builder
         * 
         */
        public Builder inSchema(@Nullable Output<String> inSchema) {
            $.inSchema = inSchema;
            return this;
        }

        /**
         * @param inSchema The fully qualified name of the schema.
         * 
         * @return builder
         * 
         */
        public Builder inSchema(String inSchema) {
            return inSchema(Output.of(inSchema));
        }

        /**
         * @param objectTypePlural The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS
         * 
         * @return builder
         * 
         */
        public Builder objectTypePlural(Output<String> objectTypePlural) {
            $.objectTypePlural = objectTypePlural;
            return this;
        }

        /**
         * @param objectTypePlural The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS
         * 
         * @return builder
         * 
         */
        public Builder objectTypePlural(String objectTypePlural) {
            return objectTypePlural(Output.of(objectTypePlural));
        }

        public GrantPrivilegesToRoleOnSchemaObjectAllArgs build() {
            if ($.objectTypePlural == null) {
                throw new MissingRequiredPropertyException("GrantPrivilegesToRoleOnSchemaObjectAllArgs", "objectTypePlural");
            }
            return $;
        }
    }

}
