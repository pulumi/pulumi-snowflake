// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleOwnershipGrantState extends com.pulumi.resources.ResourceArgs {

    public static final RoleOwnershipGrantState Empty = new RoleOwnershipGrantState();

    /**
     * Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
     * 
     */
    @Import(name="currentGrants")
    private @Nullable Output<String> currentGrants;

    /**
     * @return Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
     * 
     */
    public Optional<Output<String>> currentGrants() {
        return Optional.ofNullable(this.currentGrants);
    }

    /**
     * The name of the role ownership is granted on.
     * 
     */
    @Import(name="onRoleName")
    private @Nullable Output<String> onRoleName;

    /**
     * @return The name of the role ownership is granted on.
     * 
     */
    public Optional<Output<String>> onRoleName() {
        return Optional.ofNullable(this.onRoleName);
    }

    /**
     * The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
     * 
     */
    @Import(name="toRoleName")
    private @Nullable Output<String> toRoleName;

    /**
     * @return The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
     * 
     */
    public Optional<Output<String>> toRoleName() {
        return Optional.ofNullable(this.toRoleName);
    }

    private RoleOwnershipGrantState() {}

    private RoleOwnershipGrantState(RoleOwnershipGrantState $) {
        this.currentGrants = $.currentGrants;
        this.onRoleName = $.onRoleName;
        this.toRoleName = $.toRoleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleOwnershipGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleOwnershipGrantState $;

        public Builder() {
            $ = new RoleOwnershipGrantState();
        }

        public Builder(RoleOwnershipGrantState defaults) {
            $ = new RoleOwnershipGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentGrants Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
         * 
         * @return builder
         * 
         */
        public Builder currentGrants(@Nullable Output<String> currentGrants) {
            $.currentGrants = currentGrants;
            return this;
        }

        /**
         * @param currentGrants Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
         * 
         * @return builder
         * 
         */
        public Builder currentGrants(String currentGrants) {
            return currentGrants(Output.of(currentGrants));
        }

        /**
         * @param onRoleName The name of the role ownership is granted on.
         * 
         * @return builder
         * 
         */
        public Builder onRoleName(@Nullable Output<String> onRoleName) {
            $.onRoleName = onRoleName;
            return this;
        }

        /**
         * @param onRoleName The name of the role ownership is granted on.
         * 
         * @return builder
         * 
         */
        public Builder onRoleName(String onRoleName) {
            return onRoleName(Output.of(onRoleName));
        }

        /**
         * @param toRoleName The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
         * 
         * @return builder
         * 
         */
        public Builder toRoleName(@Nullable Output<String> toRoleName) {
            $.toRoleName = toRoleName;
            return this;
        }

        /**
         * @param toRoleName The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
         * 
         * @return builder
         * 
         */
        public Builder toRoleName(String toRoleName) {
            return toRoleName(Output.of(toRoleName));
        }

        public RoleOwnershipGrantState build() {
            return $;
        }
    }

}
