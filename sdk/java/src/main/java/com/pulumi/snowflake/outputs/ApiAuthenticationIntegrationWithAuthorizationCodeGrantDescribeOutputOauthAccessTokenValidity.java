// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutputOauthAccessTokenValidity {
    private @Nullable String default_;
    private @Nullable String name;
    private @Nullable String type;
    private @Nullable String value;

    private ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutputOauthAccessTokenValidity() {}
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutputOauthAccessTokenValidity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String default_;
        private @Nullable String name;
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutputOauthAccessTokenValidity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {

            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutputOauthAccessTokenValidity build() {
            final var _resultValue = new ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutputOauthAccessTokenValidity();
            _resultValue.default_ = default_;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
