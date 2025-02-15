// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountAuthenticationPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final AccountAuthenticationPolicyAttachmentState Empty = new AccountAuthenticationPolicyAttachmentState();

    /**
     * Qualified name (`&#34;db&#34;.&#34;schema&#34;.&#34;policy_name&#34;`) of the authentication policy to apply to the current account.
     * 
     */
    @Import(name="authenticationPolicy")
    private @Nullable Output<String> authenticationPolicy;

    /**
     * @return Qualified name (`&#34;db&#34;.&#34;schema&#34;.&#34;policy_name&#34;`) of the authentication policy to apply to the current account.
     * 
     */
    public Optional<Output<String>> authenticationPolicy() {
        return Optional.ofNullable(this.authenticationPolicy);
    }

    private AccountAuthenticationPolicyAttachmentState() {}

    private AccountAuthenticationPolicyAttachmentState(AccountAuthenticationPolicyAttachmentState $) {
        this.authenticationPolicy = $.authenticationPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountAuthenticationPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountAuthenticationPolicyAttachmentState $;

        public Builder() {
            $ = new AccountAuthenticationPolicyAttachmentState();
        }

        public Builder(AccountAuthenticationPolicyAttachmentState defaults) {
            $ = new AccountAuthenticationPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationPolicy Qualified name (`&#34;db&#34;.&#34;schema&#34;.&#34;policy_name&#34;`) of the authentication policy to apply to the current account.
         * 
         * @return builder
         * 
         */
        public Builder authenticationPolicy(@Nullable Output<String> authenticationPolicy) {
            $.authenticationPolicy = authenticationPolicy;
            return this;
        }

        /**
         * @param authenticationPolicy Qualified name (`&#34;db&#34;.&#34;schema&#34;.&#34;policy_name&#34;`) of the authentication policy to apply to the current account.
         * 
         * @return builder
         * 
         */
        public Builder authenticationPolicy(String authenticationPolicy) {
            return authenticationPolicy(Output.of(authenticationPolicy));
        }

        public AccountAuthenticationPolicyAttachmentState build() {
            return $;
        }
    }

}
