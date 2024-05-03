// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableGrantState extends com.pulumi.resources.ResourceArgs {

    public static final TableGrantState Empty = new TableGrantState();

    /**
     * The name of the database containing the current or future tables on which to grant privileges.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future tables on which to grant privileges.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    @Import(name="enableMultipleGrants")
    private @Nullable Output<Boolean> enableMultipleGrants;

    public Optional<Output<Boolean>> enableMultipleGrants() {
        return Optional.ofNullable(this.enableMultipleGrants);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    @Import(name="onAll")
    private @Nullable Output<Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    public Optional<Output<Boolean>> onAll() {
        return Optional.ofNullable(this.onAll);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    @Import(name="onFuture")
    private @Nullable Output<Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    public Optional<Output<Boolean>> onFuture() {
        return Optional.ofNullable(this.onFuture);
    }

    /**
     * The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
     * 
     */
    public Optional<Output<String>> privilege() {
        return Optional.ofNullable(this.privilege);
    }

    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     * 
     */
    @Import(name="revertOwnershipToRoleName")
    private @Nullable Output<String> revertOwnershipToRoleName;

    /**
     * @return The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     * 
     */
    public Optional<Output<String>> revertOwnershipToRoleName() {
        return Optional.ofNullable(this.revertOwnershipToRoleName);
    }

    /**
     * Grants privilege to these roles.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The name of the schema containing the current or future tables on which to grant privileges.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema containing the current or future tables on which to grant privileges.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * Grants privilege to these shares (only valid if on*future or on*all are unset).
     * 
     */
    @Import(name="shares")
    private @Nullable Output<List<String>> shares;

    /**
     * @return Grants privilege to these shares (only valid if on*future or on*all are unset).
     * 
     */
    public Optional<Output<List<String>>> shares() {
        return Optional.ofNullable(this.shares);
    }

    /**
     * The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    /**
     * @return The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
     * 
     */
    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Import(name="withGrantOption")
    private @Nullable Output<Boolean> withGrantOption;

    /**
     * @return When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Optional<Output<Boolean>> withGrantOption() {
        return Optional.ofNullable(this.withGrantOption);
    }

    private TableGrantState() {}

    private TableGrantState(TableGrantState $) {
        this.databaseName = $.databaseName;
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.onAll = $.onAll;
        this.onFuture = $.onFuture;
        this.privilege = $.privilege;
        this.revertOwnershipToRoleName = $.revertOwnershipToRoleName;
        this.roles = $.roles;
        this.schemaName = $.schemaName;
        this.shares = $.shares;
        this.tableName = $.tableName;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableGrantState $;

        public Builder() {
            $ = new TableGrantState();
        }

        public Builder(TableGrantState defaults) {
            $ = new TableGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database containing the current or future tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database containing the current or future tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder enableMultipleGrants(@Nullable Output<Boolean> enableMultipleGrants) {
            $.enableMultipleGrants = enableMultipleGrants;
            return this;
        }

        public Builder enableMultipleGrants(Boolean enableMultipleGrants) {
            return enableMultipleGrants(Output.of(enableMultipleGrants));
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(@Nullable Output<Boolean> onAll) {
            $.onAll = onAll;
            return this;
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(Boolean onAll) {
            return onAll(Output.of(onAll));
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(@Nullable Output<Boolean> onFuture) {
            $.onFuture = onFuture;
            return this;
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(Boolean onFuture) {
            return onFuture(Output.of(onFuture));
        }

        /**
         * @param privilege The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
         * 
         * @return builder
         * 
         */
        public Builder privilege(String privilege) {
            return privilege(Output.of(privilege));
        }

        /**
         * @param revertOwnershipToRoleName The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
         * 
         * @return builder
         * 
         */
        public Builder revertOwnershipToRoleName(@Nullable Output<String> revertOwnershipToRoleName) {
            $.revertOwnershipToRoleName = revertOwnershipToRoleName;
            return this;
        }

        /**
         * @param revertOwnershipToRoleName The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
         * 
         * @return builder
         * 
         */
        public Builder revertOwnershipToRoleName(String revertOwnershipToRoleName) {
            return revertOwnershipToRoleName(Output.of(revertOwnershipToRoleName));
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param schemaName The name of the schema containing the current or future tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema containing the current or future tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param shares Grants privilege to these shares (only valid if on*future or on*all are unset).
         * 
         * @return builder
         * 
         */
        public Builder shares(@Nullable Output<List<String>> shares) {
            $.shares = shares;
            return this;
        }

        /**
         * @param shares Grants privilege to these shares (only valid if on*future or on*all are unset).
         * 
         * @return builder
         * 
         */
        public Builder shares(List<String> shares) {
            return shares(Output.of(shares));
        }

        /**
         * @param shares Grants privilege to these shares (only valid if on*future or on*all are unset).
         * 
         * @return builder
         * 
         */
        public Builder shares(String... shares) {
            return shares(List.of(shares));
        }

        /**
         * @param tableName The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
         * 
         * @return builder
         * 
         */
        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        /**
         * @param withGrantOption When this is set to true, allows the recipient role to grant the privileges to other roles.
         * 
         * @return builder
         * 
         */
        public Builder withGrantOption(@Nullable Output<Boolean> withGrantOption) {
            $.withGrantOption = withGrantOption;
            return this;
        }

        /**
         * @param withGrantOption When this is set to true, allows the recipient role to grant the privileges to other roles.
         * 
         * @return builder
         * 
         */
        public Builder withGrantOption(Boolean withGrantOption) {
            return withGrantOption(Output.of(withGrantOption));
        }

        public TableGrantState build() {
            return $;
        }
    }

}
