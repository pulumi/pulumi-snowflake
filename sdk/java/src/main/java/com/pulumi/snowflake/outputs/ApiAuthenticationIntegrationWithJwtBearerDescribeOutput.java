// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputAuthType;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputComment;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputEnabled;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAccessTokenValidity;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAllowedScope;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAuthorizationEndpoint;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientAuthMethod;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientId;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthGrant;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthRefreshTokenValidity;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthTokenEndpoint;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutputParentIntegration;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiAuthenticationIntegrationWithJwtBearerDescribeOutput {
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputAuthType> authTypes;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputComment> comments;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputEnabled> enableds;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAccessTokenValidity> oauthAccessTokenValidities;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAllowedScope> oauthAllowedScopes;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientAuthMethod> oauthClientAuthMethods;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientId> oauthClientIds;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthGrant> oauthGrants;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints;
    private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputParentIntegration> parentIntegrations;

    private ApiAuthenticationIntegrationWithJwtBearerDescribeOutput() {}
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputAuthType> authTypes() {
        return this.authTypes == null ? List.of() : this.authTypes;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputComment> comments() {
        return this.comments == null ? List.of() : this.comments;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputEnabled> enableds() {
        return this.enableds == null ? List.of() : this.enableds;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAccessTokenValidity> oauthAccessTokenValidities() {
        return this.oauthAccessTokenValidities == null ? List.of() : this.oauthAccessTokenValidities;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAllowedScope> oauthAllowedScopes() {
        return this.oauthAllowedScopes == null ? List.of() : this.oauthAllowedScopes;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints() {
        return this.oauthAuthorizationEndpoints == null ? List.of() : this.oauthAuthorizationEndpoints;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientAuthMethod> oauthClientAuthMethods() {
        return this.oauthClientAuthMethods == null ? List.of() : this.oauthClientAuthMethods;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientId> oauthClientIds() {
        return this.oauthClientIds == null ? List.of() : this.oauthClientIds;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthGrant> oauthGrants() {
        return this.oauthGrants == null ? List.of() : this.oauthGrants;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities() {
        return this.oauthRefreshTokenValidities == null ? List.of() : this.oauthRefreshTokenValidities;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints() {
        return this.oauthTokenEndpoints == null ? List.of() : this.oauthTokenEndpoints;
    }
    public List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputParentIntegration> parentIntegrations() {
        return this.parentIntegrations == null ? List.of() : this.parentIntegrations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiAuthenticationIntegrationWithJwtBearerDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputAuthType> authTypes;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputComment> comments;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputEnabled> enableds;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAccessTokenValidity> oauthAccessTokenValidities;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAllowedScope> oauthAllowedScopes;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientAuthMethod> oauthClientAuthMethods;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientId> oauthClientIds;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthGrant> oauthGrants;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints;
        private @Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputParentIntegration> parentIntegrations;
        public Builder() {}
        public Builder(ApiAuthenticationIntegrationWithJwtBearerDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTypes = defaults.authTypes;
    	      this.comments = defaults.comments;
    	      this.enableds = defaults.enableds;
    	      this.oauthAccessTokenValidities = defaults.oauthAccessTokenValidities;
    	      this.oauthAllowedScopes = defaults.oauthAllowedScopes;
    	      this.oauthAuthorizationEndpoints = defaults.oauthAuthorizationEndpoints;
    	      this.oauthClientAuthMethods = defaults.oauthClientAuthMethods;
    	      this.oauthClientIds = defaults.oauthClientIds;
    	      this.oauthGrants = defaults.oauthGrants;
    	      this.oauthRefreshTokenValidities = defaults.oauthRefreshTokenValidities;
    	      this.oauthTokenEndpoints = defaults.oauthTokenEndpoints;
    	      this.parentIntegrations = defaults.parentIntegrations;
        }

        @CustomType.Setter
        public Builder authTypes(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputAuthType> authTypes) {

            this.authTypes = authTypes;
            return this;
        }
        public Builder authTypes(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputAuthType... authTypes) {
            return authTypes(List.of(authTypes));
        }
        @CustomType.Setter
        public Builder comments(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputComment> comments) {

            this.comments = comments;
            return this;
        }
        public Builder comments(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputComment... comments) {
            return comments(List.of(comments));
        }
        @CustomType.Setter
        public Builder enableds(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputEnabled> enableds) {

            this.enableds = enableds;
            return this;
        }
        public Builder enableds(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputEnabled... enableds) {
            return enableds(List.of(enableds));
        }
        @CustomType.Setter
        public Builder oauthAccessTokenValidities(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAccessTokenValidity> oauthAccessTokenValidities) {

            this.oauthAccessTokenValidities = oauthAccessTokenValidities;
            return this;
        }
        public Builder oauthAccessTokenValidities(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAccessTokenValidity... oauthAccessTokenValidities) {
            return oauthAccessTokenValidities(List.of(oauthAccessTokenValidities));
        }
        @CustomType.Setter
        public Builder oauthAllowedScopes(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAllowedScope> oauthAllowedScopes) {

            this.oauthAllowedScopes = oauthAllowedScopes;
            return this;
        }
        public Builder oauthAllowedScopes(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAllowedScope... oauthAllowedScopes) {
            return oauthAllowedScopes(List.of(oauthAllowedScopes));
        }
        @CustomType.Setter
        public Builder oauthAuthorizationEndpoints(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints) {

            this.oauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            return this;
        }
        public Builder oauthAuthorizationEndpoints(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthAuthorizationEndpoint... oauthAuthorizationEndpoints) {
            return oauthAuthorizationEndpoints(List.of(oauthAuthorizationEndpoints));
        }
        @CustomType.Setter
        public Builder oauthClientAuthMethods(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientAuthMethod> oauthClientAuthMethods) {

            this.oauthClientAuthMethods = oauthClientAuthMethods;
            return this;
        }
        public Builder oauthClientAuthMethods(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientAuthMethod... oauthClientAuthMethods) {
            return oauthClientAuthMethods(List.of(oauthClientAuthMethods));
        }
        @CustomType.Setter
        public Builder oauthClientIds(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientId> oauthClientIds) {

            this.oauthClientIds = oauthClientIds;
            return this;
        }
        public Builder oauthClientIds(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthClientId... oauthClientIds) {
            return oauthClientIds(List.of(oauthClientIds));
        }
        @CustomType.Setter
        public Builder oauthGrants(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthGrant> oauthGrants) {

            this.oauthGrants = oauthGrants;
            return this;
        }
        public Builder oauthGrants(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthGrant... oauthGrants) {
            return oauthGrants(List.of(oauthGrants));
        }
        @CustomType.Setter
        public Builder oauthRefreshTokenValidities(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities) {

            this.oauthRefreshTokenValidities = oauthRefreshTokenValidities;
            return this;
        }
        public Builder oauthRefreshTokenValidities(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthRefreshTokenValidity... oauthRefreshTokenValidities) {
            return oauthRefreshTokenValidities(List.of(oauthRefreshTokenValidities));
        }
        @CustomType.Setter
        public Builder oauthTokenEndpoints(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints) {

            this.oauthTokenEndpoints = oauthTokenEndpoints;
            return this;
        }
        public Builder oauthTokenEndpoints(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputOauthTokenEndpoint... oauthTokenEndpoints) {
            return oauthTokenEndpoints(List.of(oauthTokenEndpoints));
        }
        @CustomType.Setter
        public Builder parentIntegrations(@Nullable List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutputParentIntegration> parentIntegrations) {

            this.parentIntegrations = parentIntegrations;
            return this;
        }
        public Builder parentIntegrations(ApiAuthenticationIntegrationWithJwtBearerDescribeOutputParentIntegration... parentIntegrations) {
            return parentIntegrations(List.of(parentIntegrations));
        }
        public ApiAuthenticationIntegrationWithJwtBearerDescribeOutput build() {
            final var _resultValue = new ApiAuthenticationIntegrationWithJwtBearerDescribeOutput();
            _resultValue.authTypes = authTypes;
            _resultValue.comments = comments;
            _resultValue.enableds = enableds;
            _resultValue.oauthAccessTokenValidities = oauthAccessTokenValidities;
            _resultValue.oauthAllowedScopes = oauthAllowedScopes;
            _resultValue.oauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            _resultValue.oauthClientAuthMethods = oauthClientAuthMethods;
            _resultValue.oauthClientIds = oauthClientIds;
            _resultValue.oauthGrants = oauthGrants;
            _resultValue.oauthRefreshTokenValidities = oauthRefreshTokenValidities;
            _resultValue.oauthTokenEndpoints = oauthTokenEndpoints;
            _resultValue.parentIntegrations = parentIntegrations;
            return _resultValue;
        }
    }
}