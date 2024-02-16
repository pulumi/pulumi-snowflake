// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPasswordPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final UserPasswordPolicyAttachmentState Empty = new UserPasswordPolicyAttachmentState();

    /**
     * Fully qualified name of the password policy
     * 
     */
    @Import(name="passwordPolicyName")
    private @Nullable Output<String> passwordPolicyName;

    /**
     * @return Fully qualified name of the password policy
     * 
     */
    public Optional<Output<String>> passwordPolicyName() {
        return Optional.ofNullable(this.passwordPolicyName);
    }

    /**
     * User name of the user you want to attach the password policy to
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return User name of the user you want to attach the password policy to
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private UserPasswordPolicyAttachmentState() {}

    private UserPasswordPolicyAttachmentState(UserPasswordPolicyAttachmentState $) {
        this.passwordPolicyName = $.passwordPolicyName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPasswordPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPasswordPolicyAttachmentState $;

        public Builder() {
            $ = new UserPasswordPolicyAttachmentState();
        }

        public Builder(UserPasswordPolicyAttachmentState defaults) {
            $ = new UserPasswordPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param passwordPolicyName Fully qualified name of the password policy
         * 
         * @return builder
         * 
         */
        public Builder passwordPolicyName(@Nullable Output<String> passwordPolicyName) {
            $.passwordPolicyName = passwordPolicyName;
            return this;
        }

        /**
         * @param passwordPolicyName Fully qualified name of the password policy
         * 
         * @return builder
         * 
         */
        public Builder passwordPolicyName(String passwordPolicyName) {
            return passwordPolicyName(Output.of(passwordPolicyName));
        }

        /**
         * @param userName User name of the user you want to attach the password policy to
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName User name of the user you want to attach the password policy to
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public UserPasswordPolicyAttachmentState build() {
            return $;
        }
    }

}
