// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnSchemaObjectAllArgs;
import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnSchemaObjectFutureArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantPrivilegesToRoleOnSchemaObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToRoleOnSchemaObjectArgs Empty = new GrantPrivilegesToRoleOnSchemaObjectArgs();

    /**
     * Configures the privilege to be granted on all objects in eihter a database or schema.
     * 
     */
    @Import(name="all")
    private @Nullable Output<GrantPrivilegesToRoleOnSchemaObjectAllArgs> all;

    /**
     * @return Configures the privilege to be granted on all objects in eihter a database or schema.
     * 
     */
    public Optional<Output<GrantPrivilegesToRoleOnSchemaObjectAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * Configures the privilege to be granted on future objects in eihter a database or schema.
     * 
     */
    @Import(name="future")
    private @Nullable Output<GrantPrivilegesToRoleOnSchemaObjectFutureArgs> future;

    /**
     * @return Configures the privilege to be granted on future objects in eihter a database or schema.
     * 
     */
    public Optional<Output<GrantPrivilegesToRoleOnSchemaObjectFutureArgs>> future() {
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
     * The object type of the schema object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return The object type of the schema object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    private GrantPrivilegesToRoleOnSchemaObjectArgs() {}

    private GrantPrivilegesToRoleOnSchemaObjectArgs(GrantPrivilegesToRoleOnSchemaObjectArgs $) {
        this.all = $.all;
        this.future = $.future;
        this.objectName = $.objectName;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToRoleOnSchemaObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToRoleOnSchemaObjectArgs $;

        public Builder() {
            $ = new GrantPrivilegesToRoleOnSchemaObjectArgs();
        }

        public Builder(GrantPrivilegesToRoleOnSchemaObjectArgs defaults) {
            $ = new GrantPrivilegesToRoleOnSchemaObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all Configures the privilege to be granted on all objects in eihter a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<GrantPrivilegesToRoleOnSchemaObjectAllArgs> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all Configures the privilege to be granted on all objects in eihter a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder all(GrantPrivilegesToRoleOnSchemaObjectAllArgs all) {
            return all(Output.of(all));
        }

        /**
         * @param future Configures the privilege to be granted on future objects in eihter a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder future(@Nullable Output<GrantPrivilegesToRoleOnSchemaObjectFutureArgs> future) {
            $.future = future;
            return this;
        }

        /**
         * @param future Configures the privilege to be granted on future objects in eihter a database or schema.
         * 
         * @return builder
         * 
         */
        public Builder future(GrantPrivilegesToRoleOnSchemaObjectFutureArgs future) {
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
         * @param objectType The object type of the schema object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType The object type of the schema object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public GrantPrivilegesToRoleOnSchemaObjectArgs build() {
            return $;
        }
    }

}
