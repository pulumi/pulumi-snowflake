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


public final class SequenceGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final SequenceGrantArgs Empty = new SequenceGrantArgs();

    /**
     * The name of the database containing the current or future sequences on which to grant privileges.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future sequences on which to grant privileges.
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
     * When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    @Import(name="onAll")
    private @Nullable Output<Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    public Optional<Output<Boolean>> onAll() {
        return Optional.ofNullable(this.onAll);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    @Import(name="onFuture")
    private @Nullable Output<Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    public Optional<Output<Boolean>> onFuture() {
        return Optional.ofNullable(this.onFuture);
    }

    /**
     * The privilege to grant on the current or future sequence.
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the current or future sequence.
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
     * The name of the schema containing the current or future sequences on which to grant privileges.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema containing the current or future sequences on which to grant privileges.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * The name of the sequence on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Import(name="sequenceName")
    private @Nullable Output<String> sequenceName;

    /**
     * @return The name of the sequence on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Optional<Output<String>> sequenceName() {
        return Optional.ofNullable(this.sequenceName);
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

    private SequenceGrantArgs() {}

    private SequenceGrantArgs(SequenceGrantArgs $) {
        this.databaseName = $.databaseName;
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.onAll = $.onAll;
        this.onFuture = $.onFuture;
        this.privilege = $.privilege;
        this.roles = $.roles;
        this.schemaName = $.schemaName;
        this.sequenceName = $.sequenceName;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SequenceGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SequenceGrantArgs $;

        public Builder() {
            $ = new SequenceGrantArgs();
        }

        public Builder(SequenceGrantArgs defaults) {
            $ = new SequenceGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database containing the current or future sequences on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database containing the current or future sequences on which to grant privileges.
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
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(@Nullable Output<Boolean> onAll) {
            $.onAll = onAll;
            return this;
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all sequences in the given schema. When this is true and no schema*name is provided apply this grant on all sequences in the given database. The sequence*name field must be unset in order to use on*all. Cannot be used together with on_future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(Boolean onAll) {
            return onAll(Output.of(onAll));
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(@Nullable Output<Boolean> onFuture) {
            $.onFuture = onFuture;
            return this;
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future sequences in the given schema. When this is true and no schema*name is provided apply this grant on all future sequences in the given database. The sequence*name field must be unset in order to use on*future. Cannot be used together with on_all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(Boolean onFuture) {
            return onFuture(Output.of(onFuture));
        }

        /**
         * @param privilege The privilege to grant on the current or future sequence.
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the current or future sequence.
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
         * @param schemaName The name of the schema containing the current or future sequences on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema containing the current or future sequences on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param sequenceName The name of the sequence on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder sequenceName(@Nullable Output<String> sequenceName) {
            $.sequenceName = sequenceName;
            return this;
        }

        /**
         * @param sequenceName The name of the sequence on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder sequenceName(String sequenceName) {
            return sequenceName(Output.of(sequenceName));
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

        public SequenceGrantArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            return $;
        }
    }

}
