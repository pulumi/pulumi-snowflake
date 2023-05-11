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


public final class NetworkPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyAttachmentState Empty = new NetworkPolicyAttachmentState();

    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     * 
     */
    @Import(name="networkPolicyName")
    private @Nullable Output<String> networkPolicyName;

    /**
     * @return Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     * 
     */
    public Optional<Output<String>> networkPolicyName() {
        return Optional.ofNullable(this.networkPolicyName);
    }

    /**
     * Specifies whether the network policy should be applied globally to your Snowflake account\n\n\n\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\n\n\n\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user&#39;s responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
     * 
     */
    @Import(name="setForAccount")
    private @Nullable Output<Boolean> setForAccount;

    /**
     * @return Specifies whether the network policy should be applied globally to your Snowflake account\n\n\n\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\n\n\n\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user&#39;s responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
     * 
     */
    public Optional<Output<Boolean>> setForAccount() {
        return Optional.ofNullable(this.setForAccount);
    }

    /**
     * Specifies which users the network policy should be attached to
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<String>> users;

    /**
     * @return Specifies which users the network policy should be attached to
     * 
     */
    public Optional<Output<List<String>>> users() {
        return Optional.ofNullable(this.users);
    }

    private NetworkPolicyAttachmentState() {}

    private NetworkPolicyAttachmentState(NetworkPolicyAttachmentState $) {
        this.networkPolicyName = $.networkPolicyName;
        this.setForAccount = $.setForAccount;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyAttachmentState $;

        public Builder() {
            $ = new NetworkPolicyAttachmentState();
        }

        public Builder(NetworkPolicyAttachmentState defaults) {
            $ = new NetworkPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkPolicyName Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyName(@Nullable Output<String> networkPolicyName) {
            $.networkPolicyName = networkPolicyName;
            return this;
        }

        /**
         * @param networkPolicyName Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyName(String networkPolicyName) {
            return networkPolicyName(Output.of(networkPolicyName));
        }

        /**
         * @param setForAccount Specifies whether the network policy should be applied globally to your Snowflake account\n\n\n\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\n\n\n\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user&#39;s responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
         * 
         * @return builder
         * 
         */
        public Builder setForAccount(@Nullable Output<Boolean> setForAccount) {
            $.setForAccount = setForAccount;
            return this;
        }

        /**
         * @param setForAccount Specifies whether the network policy should be applied globally to your Snowflake account\n\n\n\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\n\n\n\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user&#39;s responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
         * 
         * @return builder
         * 
         */
        public Builder setForAccount(Boolean setForAccount) {
            return setForAccount(Output.of(setForAccount));
        }

        /**
         * @param users Specifies which users the network policy should be attached to
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users Specifies which users the network policy should be attached to
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users Specifies which users the network policy should be attached to
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public NetworkPolicyAttachmentState build() {
            return $;
        }
    }

}
