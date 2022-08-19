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


public final class StageGrantState extends com.pulumi.resources.ResourceArgs {

    public static final StageGrantState Empty = new StageGrantState();

    /**
     * The name of the database containing the current stage on which to grant privileges.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The name of the database containing the current stage on which to grant privileges.
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
     * When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
     * 
     */
    @Import(name="onFuture")
    private @Nullable Output<Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
     * 
     */
    public Optional<Output<Boolean>> onFuture() {
        return Optional.ofNullable(this.onFuture);
    }

    /**
     * The privilege to grant on the stage.
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the stage.
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
     * The name of the schema containing the current stage on which to grant privileges.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema containing the current stage on which to grant privileges.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * The name of the stage on which to grant privilege (only valid if on_future is false).
     * 
     */
    @Import(name="stageName")
    private @Nullable Output<String> stageName;

    /**
     * @return The name of the stage on which to grant privilege (only valid if on_future is false).
     * 
     */
    public Optional<Output<String>> stageName() {
        return Optional.ofNullable(this.stageName);
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

    private StageGrantState() {}

    private StageGrantState(StageGrantState $) {
        this.databaseName = $.databaseName;
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.onFuture = $.onFuture;
        this.privilege = $.privilege;
        this.roles = $.roles;
        this.schemaName = $.schemaName;
        this.stageName = $.stageName;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageGrantState $;

        public Builder() {
            $ = new StageGrantState();
        }

        public Builder(StageGrantState defaults) {
            $ = new StageGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database containing the current stage on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database containing the current stage on which to grant privileges.
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
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(@Nullable Output<Boolean> onFuture) {
            $.onFuture = onFuture;
            return this;
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(Boolean onFuture) {
            return onFuture(Output.of(onFuture));
        }

        /**
         * @param privilege The privilege to grant on the stage.
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the stage.
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
         * @param schemaName The name of the schema containing the current stage on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema containing the current stage on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param stageName The name of the stage on which to grant privilege (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder stageName(@Nullable Output<String> stageName) {
            $.stageName = stageName;
            return this;
        }

        /**
         * @param stageName The name of the stage on which to grant privilege (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            return stageName(Output.of(stageName));
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

        public StageGrantState build() {
            return $;
        }
    }

}
