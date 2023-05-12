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


public final class FunctionGrantState extends com.pulumi.resources.ResourceArgs {

    public static final FunctionGrantState Empty = new FunctionGrantState();

    /**
     * List of the argument data types for the function (must be present if function has arguments and function_name is present)
     * 
     */
    @Import(name="argumentDataTypes")
    private @Nullable Output<List<String>> argumentDataTypes;

    /**
     * @return List of the argument data types for the function (must be present if function has arguments and function_name is present)
     * 
     */
    public Optional<Output<List<String>>> argumentDataTypes() {
        return Optional.ofNullable(this.argumentDataTypes);
    }

    /**
     * The name of the database containing the current or future functions on which to grant privileges.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future functions on which to grant privileges.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
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
     * The name of the function on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Import(name="functionName")
    private @Nullable Output<String> functionName;

    /**
     * @return The name of the function on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Optional<Output<String>> functionName() {
        return Optional.ofNullable(this.functionName);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
     * 
     */
    @Import(name="onAll")
    private @Nullable Output<Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
     * 
     */
    public Optional<Output<Boolean>> onAll() {
        return Optional.ofNullable(this.onAll);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
     * 
     */
    @Import(name="onFuture")
    private @Nullable Output<Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
     * 
     */
    public Optional<Output<Boolean>> onFuture() {
        return Optional.ofNullable(this.onFuture);
    }

    /**
     * The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
     * 
     */
    public Optional<Output<String>> privilege() {
        return Optional.ofNullable(this.privilege);
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
     * The name of the schema containing the current or future functions on which to grant privileges.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema containing the current or future functions on which to grant privileges.
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

    private FunctionGrantState() {}

    private FunctionGrantState(FunctionGrantState $) {
        this.argumentDataTypes = $.argumentDataTypes;
        this.databaseName = $.databaseName;
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.functionName = $.functionName;
        this.onAll = $.onAll;
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
    public static Builder builder(FunctionGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionGrantState $;

        public Builder() {
            $ = new FunctionGrantState();
        }

        public Builder(FunctionGrantState defaults) {
            $ = new FunctionGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param argumentDataTypes List of the argument data types for the function (must be present if function has arguments and function_name is present)
         * 
         * @return builder
         * 
         */
        public Builder argumentDataTypes(@Nullable Output<List<String>> argumentDataTypes) {
            $.argumentDataTypes = argumentDataTypes;
            return this;
        }

        /**
         * @param argumentDataTypes List of the argument data types for the function (must be present if function has arguments and function_name is present)
         * 
         * @return builder
         * 
         */
        public Builder argumentDataTypes(List<String> argumentDataTypes) {
            return argumentDataTypes(Output.of(argumentDataTypes));
        }

        /**
         * @param argumentDataTypes List of the argument data types for the function (must be present if function has arguments and function_name is present)
         * 
         * @return builder
         * 
         */
        public Builder argumentDataTypes(String... argumentDataTypes) {
            return argumentDataTypes(List.of(argumentDataTypes));
        }

        /**
         * @param databaseName The name of the database containing the current or future functions on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database containing the current or future functions on which to grant privileges.
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
         * @param functionName The name of the function on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder functionName(@Nullable Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName The name of the function on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(@Nullable Output<Boolean> onAll) {
            $.onAll = onAll;
            return this;
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(Boolean onAll) {
            return onAll(Output.of(onAll));
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(@Nullable Output<Boolean> onFuture) {
            $.onFuture = onFuture;
            return this;
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(Boolean onFuture) {
            return onFuture(Output.of(onFuture));
        }

        /**
         * @param privilege The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
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
         * @param schemaName The name of the schema containing the current or future functions on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema containing the current or future functions on which to grant privileges.
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

        public FunctionGrantState build() {
            return $;
        }
    }

}
