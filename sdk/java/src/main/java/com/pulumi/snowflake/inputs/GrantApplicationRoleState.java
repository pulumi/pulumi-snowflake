// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantApplicationRoleState extends com.pulumi.resources.ResourceArgs {

    public static final GrantApplicationRoleState Empty = new GrantApplicationRoleState();

    /**
     * The fully qualified name of the application on which application role will be granted.
     * 
     */
    @Import(name="applicationName")
    private @Nullable Output<String> applicationName;

    /**
     * @return The fully qualified name of the application on which application role will be granted.
     * 
     */
    public Optional<Output<String>> applicationName() {
        return Optional.ofNullable(this.applicationName);
    }

    /**
     * Specifies the identifier for the application role to grant.
     * 
     */
    @Import(name="applicationRoleName")
    private @Nullable Output<String> applicationRoleName;

    /**
     * @return Specifies the identifier for the application role to grant.
     * 
     */
    public Optional<Output<String>> applicationRoleName() {
        return Optional.ofNullable(this.applicationRoleName);
    }

    /**
     * The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
     * 
     */
    @Import(name="parentAccountRoleName")
    private @Nullable Output<String> parentAccountRoleName;

    /**
     * @return The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> parentAccountRoleName() {
        return Optional.ofNullable(this.parentAccountRoleName);
    }

    private GrantApplicationRoleState() {}

    private GrantApplicationRoleState(GrantApplicationRoleState $) {
        this.applicationName = $.applicationName;
        this.applicationRoleName = $.applicationRoleName;
        this.parentAccountRoleName = $.parentAccountRoleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantApplicationRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantApplicationRoleState $;

        public Builder() {
            $ = new GrantApplicationRoleState();
        }

        public Builder(GrantApplicationRoleState defaults) {
            $ = new GrantApplicationRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName The fully qualified name of the application on which application role will be granted.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(@Nullable Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The fully qualified name of the application on which application role will be granted.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param applicationRoleName Specifies the identifier for the application role to grant.
         * 
         * @return builder
         * 
         */
        public Builder applicationRoleName(@Nullable Output<String> applicationRoleName) {
            $.applicationRoleName = applicationRoleName;
            return this;
        }

        /**
         * @param applicationRoleName Specifies the identifier for the application role to grant.
         * 
         * @return builder
         * 
         */
        public Builder applicationRoleName(String applicationRoleName) {
            return applicationRoleName(Output.of(applicationRoleName));
        }

        /**
         * @param parentAccountRoleName The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder parentAccountRoleName(@Nullable Output<String> parentAccountRoleName) {
            $.parentAccountRoleName = parentAccountRoleName;
            return this;
        }

        /**
         * @param parentAccountRoleName The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder parentAccountRoleName(String parentAccountRoleName) {
            return parentAccountRoleName(Output.of(parentAccountRoleName));
        }

        public GrantApplicationRoleState build() {
            return $;
        }
    }

}
