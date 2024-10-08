// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs;
import com.pulumi.snowflake.inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectFutureArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs Empty = new GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs();

    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     * 
     */
    @Import(name="all")
    private @Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs> all;

    /**
     * @return Configures the privilege to be granted on all objects in either a database or schema.
     * 
     */
    public Optional<Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * Configures the privilege to be granted on future objects in either a database or schema.
     * 
     */
    @Import(name="future")
    private @Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectFutureArgs> future;

    /**
     * @return Configures the privilege to be granted on future objects in either a database or schema.
     * 
     */
    public Optional<Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectFutureArgs>> future() {
        return Optional.ofNullable(this.future);
    }

    /**
     * The fully qualified name of the object on which privileges will be granted.
     * 
     */
    @Import(name="objectName")
    private @Nullable Output<String> objectName;

    /**
     * @return The fully qualified name of the object on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | CORTEX SEARCH SERVICE | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | NOTEBOOK | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | SNAPSHOT | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT | DATASET
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | CORTEX SEARCH SERVICE | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | NOTEBOOK | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | SNAPSHOT | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT | DATASET
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    private GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs() {}

    private GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs(GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs $) {
        this.all = $.all;
        this.future = $.future;
        this.objectName = $.objectName;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs $;

        public Builder() {
            $ = new GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs();
        }

        public Builder(GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs defaults) {
            $ = new GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all Configures the privilege to be granted on all objects in either a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all Configures the privilege to be granted on all objects in either a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder all(GrantPrivilegesToDatabaseRoleOnSchemaObjectAllArgs all) {
            return all(Output.of(all));
        }

        /**
         * @param future Configures the privilege to be granted on future objects in either a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder future(@Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectFutureArgs> future) {
            $.future = future;
            return this;
        }

        /**
         * @param future Configures the privilege to be granted on future objects in either a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder future(GrantPrivilegesToDatabaseRoleOnSchemaObjectFutureArgs future) {
            return future(Output.of(future));
        }

        /**
         * @param objectName The fully qualified name of the object on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder objectName(@Nullable Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName The fully qualified name of the object on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param objectType The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | CORTEX SEARCH SERVICE | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | NOTEBOOK | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | SNAPSHOT | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT | DATASET
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | CORTEX SEARCH SERVICE | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | NOTEBOOK | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | SNAPSHOT | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT | DATASET
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs build() {
            return $;
        }
    }

}
