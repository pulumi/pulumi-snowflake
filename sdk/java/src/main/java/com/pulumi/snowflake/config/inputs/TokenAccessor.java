// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.config.inputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TokenAccessor {
    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String refreshToken;
    private String tokenEndpoint;

    private TokenAccessor() {}
    public String clientId() {
        return this.clientId;
    }
    public String clientSecret() {
        return this.clientSecret;
    }
    public String redirectUri() {
        return this.redirectUri;
    }
    public String refreshToken() {
        return this.refreshToken;
    }
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenAccessor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String clientSecret;
        private String redirectUri;
        private String refreshToken;
        private String tokenEndpoint;
        public Builder() {}
        public Builder(TokenAccessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.redirectUri = defaults.redirectUri;
    	      this.refreshToken = defaults.refreshToken;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("TokenAccessor", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            if (clientSecret == null) {
              throw new MissingRequiredPropertyException("TokenAccessor", "clientSecret");
            }
            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder redirectUri(String redirectUri) {
            if (redirectUri == null) {
              throw new MissingRequiredPropertyException("TokenAccessor", "redirectUri");
            }
            this.redirectUri = redirectUri;
            return this;
        }
        @CustomType.Setter
        public Builder refreshToken(String refreshToken) {
            if (refreshToken == null) {
              throw new MissingRequiredPropertyException("TokenAccessor", "refreshToken");
            }
            this.refreshToken = refreshToken;
            return this;
        }
        @CustomType.Setter
        public Builder tokenEndpoint(String tokenEndpoint) {
            if (tokenEndpoint == null) {
              throw new MissingRequiredPropertyException("TokenAccessor", "tokenEndpoint");
            }
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public TokenAccessor build() {
            final var _resultValue = new TokenAccessor();
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.redirectUri = redirectUri;
            _resultValue.refreshToken = refreshToken;
            _resultValue.tokenEndpoint = tokenEndpoint;
            return _resultValue;
        }
    }
}
