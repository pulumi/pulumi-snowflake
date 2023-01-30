// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalTableGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalTableGrantArgs Empty = new ExternalTableGrantArgs();

    /**
     * The name of the database containing the current or future external tables on which to grant privileges.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future external tables on which to grant privileges.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    @Import(name="enableMultipleGrants")
    private @Nullable Output<Boolean> enableMultipleGrants;

    /**
     * @return When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    public Optional<Output<Boolean>> enableMultipleGrants() {
        return Optional.ofNullable(this.enableMultipleGrants);
    }

    /**
     * The name of the external table on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Import(name="externalTableName")
    private @Nullable Output<String> externalTableName;

    /**
     * @return The name of the external table on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Optional<Output<String>> externalTableName() {
        return Optional.ofNullable(this.externalTableName);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
     * 
     */
    @Import(name="onFuture")
    private @Nullable Output<Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
     * 
     */
    public Optional<Output<Boolean>> onFuture() {
        return Optional.ofNullable(this.onFuture);
    }

    /**
     * The privilege to grant on the current or future external table.
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the current or future external table.
     * 
     */
    public Optional<Output<String>> privilege() {
        return Optional.ofNullable(this.privilege);
    }

    /**
     * Grants privilege to these roles.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }

    /**
     * The name of the schema containing the current or future external tables on which to grant privileges.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema containing the current or future external tables on which to grant privileges.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * Grants privilege to these shares (only valid if on_future is false).
     * 
     */
    @Import(name="shares")
    private @Nullable Output<List<String>> shares;

    /**
     * @return Grants privilege to these shares (only valid if on_future is false).
     * 
     */
    public Optional<Output<List<String>>> shares() {
        return Optional.ofNullable(this.shares);
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

    private ExternalTableGrantArgs() {}

    private ExternalTableGrantArgs(ExternalTableGrantArgs $) {
        this.databaseName = $.databaseName;
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.externalTableName = $.externalTableName;
        this.onFuture = $.onFuture;
        this.privilege = $.privilege;
        this.roles = $.roles;
        this.schemaName = $.schemaName;
        this.shares = $.shares;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalTableGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalTableGrantArgs $;

        public Builder() {
            $ = new ExternalTableGrantArgs();
        }

        public Builder(ExternalTableGrantArgs defaults) {
            $ = new ExternalTableGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database containing the current or future external tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database containing the current or future external tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param enableMultipleGrants When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
         * grants applied to roles and objects outside Terraform.
         * 
         * @return builder
         * 
         */
        public Builder enableMultipleGrants(@Nullable Output<Boolean> enableMultipleGrants) {
            $.enableMultipleGrants = enableMultipleGrants;
            return this;
        }

        /**
         * @param enableMultipleGrants When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
         * grants applied to roles and objects outside Terraform.
         * 
         * @return builder
         * 
         */
        public Builder enableMultipleGrants(Boolean enableMultipleGrants) {
            return enableMultipleGrants(Output.of(enableMultipleGrants));
        }

        /**
         * @param externalTableName The name of the external table on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder externalTableName(@Nullable Output<String> externalTableName) {
            $.externalTableName = externalTableName;
            return this;
        }

        /**
         * @param externalTableName The name of the external table on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder externalTableName(String externalTableName) {
            return externalTableName(Output.of(externalTableName));
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(@Nullable Output<Boolean> onFuture) {
            $.onFuture = onFuture;
            return this;
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on_future.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(Boolean onFuture) {
            return onFuture(Output.of(onFuture));
        }

        /**
         * @param privilege The privilege to grant on the current or future external table.
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the current or future external table.
         * 
         * @return builder
         * 
         */
        public Builder privilege(String privilege) {
            return privilege(Output.of(privilege));
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<String>> roles) {
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
         * @param schemaName The name of the schema containing the current or future external tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema containing the current or future external tables on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param shares Grants privilege to these shares (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder shares(@Nullable Output<List<String>> shares) {
            $.shares = shares;
            return this;
        }

        /**
         * @param shares Grants privilege to these shares (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder shares(List<String> shares) {
            return shares(Output.of(shares));
        }

        /**
         * @param shares Grants privilege to these shares (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder shares(String... shares) {
            return shares(List.of(shares));
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

        public ExternalTableGrantArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            return $;
        }
    }

}
