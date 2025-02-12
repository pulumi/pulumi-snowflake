// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationPolicyDescribeOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationPolicyDescribeOutputArgs Empty = new AuthenticationPolicyDescribeOutputArgs();

    @Import(name="authenticationMethods")
    private @Nullable Output<String> authenticationMethods;

    public Optional<Output<String>> authenticationMethods() {
        return Optional.ofNullable(this.authenticationMethods);
    }

    @Import(name="clientTypes")
    private @Nullable Output<String> clientTypes;

    public Optional<Output<String>> clientTypes() {
        return Optional.ofNullable(this.clientTypes);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="mfaAuthenticationMethods")
    private @Nullable Output<String> mfaAuthenticationMethods;

    public Optional<Output<String>> mfaAuthenticationMethods() {
        return Optional.ofNullable(this.mfaAuthenticationMethods);
    }

    @Import(name="mfaEnrollment")
    private @Nullable Output<String> mfaEnrollment;

    public Optional<Output<String>> mfaEnrollment() {
        return Optional.ofNullable(this.mfaEnrollment);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="owner")
    private @Nullable Output<String> owner;

    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    @Import(name="securityIntegrations")
    private @Nullable Output<String> securityIntegrations;

    public Optional<Output<String>> securityIntegrations() {
        return Optional.ofNullable(this.securityIntegrations);
    }

    private AuthenticationPolicyDescribeOutputArgs() {}

    private AuthenticationPolicyDescribeOutputArgs(AuthenticationPolicyDescribeOutputArgs $) {
        this.authenticationMethods = $.authenticationMethods;
        this.clientTypes = $.clientTypes;
        this.comment = $.comment;
        this.mfaAuthenticationMethods = $.mfaAuthenticationMethods;
        this.mfaEnrollment = $.mfaEnrollment;
        this.name = $.name;
        this.owner = $.owner;
        this.securityIntegrations = $.securityIntegrations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationPolicyDescribeOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationPolicyDescribeOutputArgs $;

        public Builder() {
            $ = new AuthenticationPolicyDescribeOutputArgs();
        }

        public Builder(AuthenticationPolicyDescribeOutputArgs defaults) {
            $ = new AuthenticationPolicyDescribeOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationMethods(@Nullable Output<String> authenticationMethods) {
            $.authenticationMethods = authenticationMethods;
            return this;
        }

        public Builder authenticationMethods(String authenticationMethods) {
            return authenticationMethods(Output.of(authenticationMethods));
        }

        public Builder clientTypes(@Nullable Output<String> clientTypes) {
            $.clientTypes = clientTypes;
            return this;
        }

        public Builder clientTypes(String clientTypes) {
            return clientTypes(Output.of(clientTypes));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder mfaAuthenticationMethods(@Nullable Output<String> mfaAuthenticationMethods) {
            $.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }

        public Builder mfaAuthenticationMethods(String mfaAuthenticationMethods) {
            return mfaAuthenticationMethods(Output.of(mfaAuthenticationMethods));
        }

        public Builder mfaEnrollment(@Nullable Output<String> mfaEnrollment) {
            $.mfaEnrollment = mfaEnrollment;
            return this;
        }

        public Builder mfaEnrollment(String mfaEnrollment) {
            return mfaEnrollment(Output.of(mfaEnrollment));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public Builder securityIntegrations(@Nullable Output<String> securityIntegrations) {
            $.securityIntegrations = securityIntegrations;
            return this;
        }

        public Builder securityIntegrations(String securityIntegrations) {
            return securityIntegrations(Output.of(securityIntegrations));
        }

        public AuthenticationPolicyDescribeOutputArgs build() {
            return $;
        }
    }

}
