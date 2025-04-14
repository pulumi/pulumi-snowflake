// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GrantPrivilegesToDatabaseRoleOnSchemaArgs;
import com.pulumi.snowflake.inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantPrivilegesToDatabaseRoleState extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToDatabaseRoleState Empty = new GrantPrivilegesToDatabaseRoleState();

    /**
     * (Default: `false`) Grant all privileges on the database role.
     * 
     */
    @Import(name="allPrivileges")
    private @Nullable Output<Boolean> allPrivileges;

    /**
     * @return (Default: `false`) Grant all privileges on the database role.
     * 
     */
    public Optional<Output<Boolean>> allPrivileges() {
        return Optional.ofNullable(this.allPrivileges);
    }

    @Import(name="alwaysApply")
    private @Nullable Output<Boolean> alwaysApply;

    public Optional<Output<Boolean>> alwaysApply() {
        return Optional.ofNullable(this.alwaysApply);
    }

    /**
     * (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
     * 
     */
    @Import(name="alwaysApplyTrigger")
    private @Nullable Output<String> alwaysApplyTrigger;

    /**
     * @return (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
     * 
     */
    public Optional<Output<String>> alwaysApplyTrigger() {
        return Optional.ofNullable(this.alwaysApplyTrigger);
    }

    /**
     * The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Import(name="databaseRoleName")
    private @Nullable Output<String> databaseRoleName;

    /**
     * @return The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> databaseRoleName() {
        return Optional.ofNullable(this.databaseRoleName);
    }

    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Import(name="onDatabase")
    private @Nullable Output<String> onDatabase;

    /**
     * @return The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> onDatabase() {
        return Optional.ofNullable(this.onDatabase);
    }

    /**
     * Specifies the schema on which privileges will be granted.
     * 
     */
    @Import(name="onSchema")
    private @Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaArgs> onSchema;

    /**
     * @return Specifies the schema on which privileges will be granted.
     * 
     */
    public Optional<Output<GrantPrivilegesToDatabaseRoleOnSchemaArgs>> onSchema() {
        return Optional.ofNullable(this.onSchema);
    }

    /**
     * Specifies the schema object on which privileges will be granted.
     * 
     */
    @Import(name="onSchemaObject")
    private @Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs> onSchemaObject;

    /**
     * @return Specifies the schema object on which privileges will be granted.
     * 
     */
    public Optional<Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs>> onSchemaObject() {
        return Optional.ofNullable(this.onSchemaObject);
    }

    /**
     * The privileges to grant on the database role.
     * 
     */
    @Import(name="privileges")
    private @Nullable Output<List<String>> privileges;

    /**
     * @return The privileges to grant on the database role.
     * 
     */
    public Optional<Output<List<String>>> privileges() {
        return Optional.ofNullable(this.privileges);
    }

    /**
     * (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Import(name="withGrantOption")
    private @Nullable Output<Boolean> withGrantOption;

    /**
     * @return (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Optional<Output<Boolean>> withGrantOption() {
        return Optional.ofNullable(this.withGrantOption);
    }

    private GrantPrivilegesToDatabaseRoleState() {}

    private GrantPrivilegesToDatabaseRoleState(GrantPrivilegesToDatabaseRoleState $) {
        this.allPrivileges = $.allPrivileges;
        this.alwaysApply = $.alwaysApply;
        this.alwaysApplyTrigger = $.alwaysApplyTrigger;
        this.databaseRoleName = $.databaseRoleName;
        this.onDatabase = $.onDatabase;
        this.onSchema = $.onSchema;
        this.onSchemaObject = $.onSchemaObject;
        this.privileges = $.privileges;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToDatabaseRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToDatabaseRoleState $;

        public Builder() {
            $ = new GrantPrivilegesToDatabaseRoleState();
        }

        public Builder(GrantPrivilegesToDatabaseRoleState defaults) {
            $ = new GrantPrivilegesToDatabaseRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allPrivileges (Default: `false`) Grant all privileges on the database role.
         * 
         * @return builder
         * 
         */
        public Builder allPrivileges(@Nullable Output<Boolean> allPrivileges) {
            $.allPrivileges = allPrivileges;
            return this;
        }

        /**
         * @param allPrivileges (Default: `false`) Grant all privileges on the database role.
         * 
         * @return builder
         * 
         */
        public Builder allPrivileges(Boolean allPrivileges) {
            return allPrivileges(Output.of(allPrivileges));
        }

        public Builder alwaysApply(@Nullable Output<Boolean> alwaysApply) {
            $.alwaysApply = alwaysApply;
            return this;
        }

        public Builder alwaysApply(Boolean alwaysApply) {
            return alwaysApply(Output.of(alwaysApply));
        }

        /**
         * @param alwaysApplyTrigger (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
         * 
         * @return builder
         * 
         */
        public Builder alwaysApplyTrigger(@Nullable Output<String> alwaysApplyTrigger) {
            $.alwaysApplyTrigger = alwaysApplyTrigger;
            return this;
        }

        /**
         * @param alwaysApplyTrigger (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
         * 
         * @return builder
         * 
         */
        public Builder alwaysApplyTrigger(String alwaysApplyTrigger) {
            return alwaysApplyTrigger(Output.of(alwaysApplyTrigger));
        }

        /**
         * @param databaseRoleName The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder databaseRoleName(@Nullable Output<String> databaseRoleName) {
            $.databaseRoleName = databaseRoleName;
            return this;
        }

        /**
         * @param databaseRoleName The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder databaseRoleName(String databaseRoleName) {
            return databaseRoleName(Output.of(databaseRoleName));
        }

        /**
         * @param onDatabase The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder onDatabase(@Nullable Output<String> onDatabase) {
            $.onDatabase = onDatabase;
            return this;
        }

        /**
         * @param onDatabase The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder onDatabase(String onDatabase) {
            return onDatabase(Output.of(onDatabase));
        }

        /**
         * @param onSchema Specifies the schema on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onSchema(@Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaArgs> onSchema) {
            $.onSchema = onSchema;
            return this;
        }

        /**
         * @param onSchema Specifies the schema on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onSchema(GrantPrivilegesToDatabaseRoleOnSchemaArgs onSchema) {
            return onSchema(Output.of(onSchema));
        }

        /**
         * @param onSchemaObject Specifies the schema object on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onSchemaObject(@Nullable Output<GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs> onSchemaObject) {
            $.onSchemaObject = onSchemaObject;
            return this;
        }

        /**
         * @param onSchemaObject Specifies the schema object on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onSchemaObject(GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs onSchemaObject) {
            return onSchemaObject(Output.of(onSchemaObject));
        }

        /**
         * @param privileges The privileges to grant on the database role.
         * 
         * @return builder
         * 
         */
        public Builder privileges(@Nullable Output<List<String>> privileges) {
            $.privileges = privileges;
            return this;
        }

        /**
         * @param privileges The privileges to grant on the database role.
         * 
         * @return builder
         * 
         */
        public Builder privileges(List<String> privileges) {
            return privileges(Output.of(privileges));
        }

        /**
         * @param privileges The privileges to grant on the database role.
         * 
         * @return builder
         * 
         */
        public Builder privileges(String... privileges) {
            return privileges(List.of(privileges));
        }

        /**
         * @param withGrantOption (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
         * 
         * @return builder
         * 
         */
        public Builder withGrantOption(@Nullable Output<Boolean> withGrantOption) {
            $.withGrantOption = withGrantOption;
            return this;
        }

        /**
         * @param withGrantOption (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
         * 
         * @return builder
         * 
         */
        public Builder withGrantOption(Boolean withGrantOption) {
            return withGrantOption(Output.of(withGrantOption));
        }

        public GrantPrivilegesToDatabaseRoleState build() {
            return $;
        }
    }

}
