// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationGrantArgs Empty = new IntegrationGrantArgs();

    @Import(name="enableMultipleGrants")
    private @Nullable Output<Boolean> enableMultipleGrants;

    public Optional<Output<Boolean>> enableMultipleGrants() {
        return Optional.ofNullable(this.enableMultipleGrants);
    }

    /**
     * Identifier for the integration; must be unique for your account.
     * 
     */
    @Import(name="integrationName", required=true)
    private Output<String> integrationName;

    /**
     * @return Identifier for the integration; must be unique for your account.
     * 
     */
    public Output<String> integrationName() {
        return this.integrationName;
    }

    /**
     * The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
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

    private IntegrationGrantArgs() {}

    private IntegrationGrantArgs(IntegrationGrantArgs $) {
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.integrationName = $.integrationName;
        this.privilege = $.privilege;
        this.revertOwnershipToRoleName = $.revertOwnershipToRoleName;
        this.roles = $.roles;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationGrantArgs $;

        public Builder() {
            $ = new IntegrationGrantArgs();
        }

        public Builder(IntegrationGrantArgs defaults) {
            $ = new IntegrationGrantArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableMultipleGrants(@Nullable Output<Boolean> enableMultipleGrants) {
            $.enableMultipleGrants = enableMultipleGrants;
            return this;
        }

        public Builder enableMultipleGrants(Boolean enableMultipleGrants) {
            return enableMultipleGrants(Output.of(enableMultipleGrants));
        }

        /**
         * @param integrationName Identifier for the integration; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder integrationName(Output<String> integrationName) {
            $.integrationName = integrationName;
            return this;
        }

        /**
         * @param integrationName Identifier for the integration; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder integrationName(String integrationName) {
            return integrationName(Output.of(integrationName));
        }

        /**
         * @param privilege The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
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

        public IntegrationGrantArgs build() {
            if ($.integrationName == null) {
                throw new MissingRequiredPropertyException("IntegrationGrantArgs", "integrationName");
            }
            return $;
        }
    }

}
