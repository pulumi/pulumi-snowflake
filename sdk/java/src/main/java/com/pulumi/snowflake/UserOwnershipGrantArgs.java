// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserOwnershipGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserOwnershipGrantArgs Empty = new UserOwnershipGrantArgs();

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
     * The name of the user ownership is granted on.
     * 
     */
    @Import(name="onUserName", required=true)
    private Output<String> onUserName;

    /**
     * @return The name of the user ownership is granted on.
     * 
     */
    public Output<String> onUserName() {
        return this.onUserName;
    }

    /**
     * The name of the role to revert ownership to on destroy.
     * 
     */
    @Import(name="revertOwnershipToRoleName")
    private @Nullable Output<String> revertOwnershipToRoleName;

    /**
     * @return The name of the role to revert ownership to on destroy.
     * 
     */
    public Optional<Output<String>> revertOwnershipToRoleName() {
        return Optional.ofNullable(this.revertOwnershipToRoleName);
    }

    @Import(name="toRoleName", required=true)
    private Output<String> toRoleName;

    public Output<String> toRoleName() {
        return this.toRoleName;
    }

    private UserOwnershipGrantArgs() {}

    private UserOwnershipGrantArgs(UserOwnershipGrantArgs $) {
        this.currentGrants = $.currentGrants;
        this.onUserName = $.onUserName;
        this.revertOwnershipToRoleName = $.revertOwnershipToRoleName;
        this.toRoleName = $.toRoleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserOwnershipGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserOwnershipGrantArgs $;

        public Builder() {
            $ = new UserOwnershipGrantArgs();
        }

        public Builder(UserOwnershipGrantArgs defaults) {
            $ = new UserOwnershipGrantArgs(Objects.requireNonNull(defaults));
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
         * @param onUserName The name of the user ownership is granted on.
         * 
         * @return builder
         * 
         */
        public Builder onUserName(Output<String> onUserName) {
            $.onUserName = onUserName;
            return this;
        }

        /**
         * @param onUserName The name of the user ownership is granted on.
         * 
         * @return builder
         * 
         */
        public Builder onUserName(String onUserName) {
            return onUserName(Output.of(onUserName));
        }

        /**
         * @param revertOwnershipToRoleName The name of the role to revert ownership to on destroy.
         * 
         * @return builder
         * 
         */
        public Builder revertOwnershipToRoleName(@Nullable Output<String> revertOwnershipToRoleName) {
            $.revertOwnershipToRoleName = revertOwnershipToRoleName;
            return this;
        }

        /**
         * @param revertOwnershipToRoleName The name of the role to revert ownership to on destroy.
         * 
         * @return builder
         * 
         */
        public Builder revertOwnershipToRoleName(String revertOwnershipToRoleName) {
            return revertOwnershipToRoleName(Output.of(revertOwnershipToRoleName));
        }

        public Builder toRoleName(Output<String> toRoleName) {
            $.toRoleName = toRoleName;
            return this;
        }

        public Builder toRoleName(String toRoleName) {
            return toRoleName(Output.of(toRoleName));
        }

        public UserOwnershipGrantArgs build() {
            if ($.onUserName == null) {
                throw new MissingRequiredPropertyException("UserOwnershipGrantArgs", "onUserName");
            }
            if ($.toRoleName == null) {
                throw new MissingRequiredPropertyException("UserOwnershipGrantArgs", "toRoleName");
            }
            return $;
        }
    }

}
