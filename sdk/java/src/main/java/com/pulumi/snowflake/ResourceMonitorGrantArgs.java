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


public final class ResourceMonitorGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceMonitorGrantArgs Empty = new ResourceMonitorGrantArgs();

    @Import(name="enableMultipleGrants")
    private @Nullable Output<Boolean> enableMultipleGrants;

    public Optional<Output<Boolean>> enableMultipleGrants() {
        return Optional.ofNullable(this.enableMultipleGrants);
    }

    /**
     * Identifier for the resource monitor; must be unique for your account.
     * 
     */
    @Import(name="monitorName", required=true)
    private Output<String> monitorName;

    /**
     * @return Identifier for the resource monitor; must be unique for your account.
     * 
     */
    public Output<String> monitorName() {
        return this.monitorName;
    }

    /**
     * The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    @Import(name="privilege")
    private @Nullable Output<String> privilege;

    /**
     * @return The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
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

    private ResourceMonitorGrantArgs() {}

    private ResourceMonitorGrantArgs(ResourceMonitorGrantArgs $) {
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.monitorName = $.monitorName;
        this.privilege = $.privilege;
        this.roles = $.roles;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceMonitorGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceMonitorGrantArgs $;

        public Builder() {
            $ = new ResourceMonitorGrantArgs();
        }

        public Builder(ResourceMonitorGrantArgs defaults) {
            $ = new ResourceMonitorGrantArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableMultipleGrants(@Nullable Output<Boolean> enableMultipleGrants) {
            $.enableMultipleGrants = enableMultipleGrants;
            return this;
        }

        public Builder enableMultipleGrants(Boolean enableMultipleGrants) {
            return enableMultipleGrants(Output.of(enableMultipleGrants));
        }

        /**
         * @param monitorName Identifier for the resource monitor; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder monitorName(Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param monitorName Identifier for the resource monitor; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        /**
         * @param privilege The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
         * 
         * @return builder
         * 
         */
        public Builder privilege(@Nullable Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
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

        public ResourceMonitorGrantArgs build() {
            if ($.monitorName == null) {
                throw new MissingRequiredPropertyException("ResourceMonitorGrantArgs", "monitorName");
            }
            return $;
        }
    }

}
