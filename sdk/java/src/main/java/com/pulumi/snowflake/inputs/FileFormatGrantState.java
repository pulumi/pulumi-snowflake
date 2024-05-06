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


public final class FileFormatGrantState extends com.pulumi.resources.ResourceArgs {

    public static final FileFormatGrantState Empty = new FileFormatGrantState();

    /**
     * The name of the database containing the current or future file formats on which to grant privileges.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future file formats on which to grant privileges.
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
     * The name of the file format on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Import(name="fileFormatName")
    private @Nullable Output<String> fileFormatName;

    /**
     * @return The name of the file format on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Optional<Output<String>> fileFormatName() {
        return Optional.ofNullable(this.fileFormatName);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
     * 
     */
    @Import(name="onAll")
    private @Nullable Output<Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
     * 
     */
    public Optional<Output<Boolean>> onAll() {
        return Optional.ofNullable(this.onAll);
    }

    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
     * 
     */
    @Import(name="onFuture")
    private @Nullable Output<Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
     * 
     */
    public Optional<Output<Boolean>> onFuture() {
        return Optional.ofNullable(this.onFuture);
    }

    /**
     * The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
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
     * The name of the schema containing the current or future file formats on which to grant privileges.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema containing the current or future file formats on which to grant privileges.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
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

    private FileFormatGrantState() {}

    private FileFormatGrantState(FileFormatGrantState $) {
        this.databaseName = $.databaseName;
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.fileFormatName = $.fileFormatName;
        this.onAll = $.onAll;
        this.onFuture = $.onFuture;
        this.privilege = $.privilege;
        this.revertOwnershipToRoleName = $.revertOwnershipToRoleName;
        this.roles = $.roles;
        this.schemaName = $.schemaName;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileFormatGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileFormatGrantState $;

        public Builder() {
            $ = new FileFormatGrantState();
        }

        public Builder(FileFormatGrantState defaults) {
            $ = new FileFormatGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database containing the current or future file formats on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database containing the current or future file formats on which to grant privileges.
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
         * @param fileFormatName The name of the file format on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder fileFormatName(@Nullable Output<String> fileFormatName) {
            $.fileFormatName = fileFormatName;
            return this;
        }

        /**
         * @param fileFormatName The name of the file format on which to grant privileges immediately (only valid if on_future is false).
         * 
         * @return builder
         * 
         */
        public Builder fileFormatName(String fileFormatName) {
            return fileFormatName(Output.of(fileFormatName));
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(@Nullable Output<Boolean> onAll) {
            $.onAll = onAll;
            return this;
        }

        /**
         * @param onAll When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
         * 
         * @return builder
         * 
         */
        public Builder onAll(Boolean onAll) {
            return onAll(Output.of(onAll));
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(@Nullable Output<Boolean> onFuture) {
            $.onFuture = onFuture;
            return this;
        }

        /**
         * @param onFuture When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
         * 
         * @return builder
         * 
         */
        public Builder onFuture(Boolean onFuture) {
            return onFuture(Output.of(onFuture));
        }

        /**
         * @param privilege The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
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
         * @param schemaName The name of the schema containing the current or future file formats on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema containing the current or future file formats on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
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

        public FileFormatGrantState build() {
            return $;
        }
    }

}
