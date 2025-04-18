// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretWithClientCredentialsDescribeOutput {
    private @Nullable String comment;
    private @Nullable String createdOn;
    private @Nullable String databaseName;
    private @Nullable String integrationName;
    private @Nullable String name;
    private @Nullable String oauthAccessTokenExpiryTime;
    private @Nullable String oauthRefreshTokenExpiryTime;
    private @Nullable List<String> oauthScopes;
    private @Nullable String owner;
    private @Nullable String schemaName;
    private @Nullable String secretType;
    private @Nullable String username;

    private SecretWithClientCredentialsDescribeOutput() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    public Optional<String> integrationName() {
        return Optional.ofNullable(this.integrationName);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> oauthAccessTokenExpiryTime() {
        return Optional.ofNullable(this.oauthAccessTokenExpiryTime);
    }
    public Optional<String> oauthRefreshTokenExpiryTime() {
        return Optional.ofNullable(this.oauthRefreshTokenExpiryTime);
    }
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    public Optional<String> secretType() {
        return Optional.ofNullable(this.secretType);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretWithClientCredentialsDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String createdOn;
        private @Nullable String databaseName;
        private @Nullable String integrationName;
        private @Nullable String name;
        private @Nullable String oauthAccessTokenExpiryTime;
        private @Nullable String oauthRefreshTokenExpiryTime;
        private @Nullable List<String> oauthScopes;
        private @Nullable String owner;
        private @Nullable String schemaName;
        private @Nullable String secretType;
        private @Nullable String username;
        public Builder() {}
        public Builder(SecretWithClientCredentialsDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.integrationName = defaults.integrationName;
    	      this.name = defaults.name;
    	      this.oauthAccessTokenExpiryTime = defaults.oauthAccessTokenExpiryTime;
    	      this.oauthRefreshTokenExpiryTime = defaults.oauthRefreshTokenExpiryTime;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.owner = defaults.owner;
    	      this.schemaName = defaults.schemaName;
    	      this.secretType = defaults.secretType;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {

            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder integrationName(@Nullable String integrationName) {

            this.integrationName = integrationName;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder oauthAccessTokenExpiryTime(@Nullable String oauthAccessTokenExpiryTime) {

            this.oauthAccessTokenExpiryTime = oauthAccessTokenExpiryTime;
            return this;
        }
        @CustomType.Setter
        public Builder oauthRefreshTokenExpiryTime(@Nullable String oauthRefreshTokenExpiryTime) {

            this.oauthRefreshTokenExpiryTime = oauthRefreshTokenExpiryTime;
            return this;
        }
        @CustomType.Setter
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {

            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {

            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(@Nullable String schemaName) {

            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder secretType(@Nullable String secretType) {

            this.secretType = secretType;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public SecretWithClientCredentialsDescribeOutput build() {
            final var _resultValue = new SecretWithClientCredentialsDescribeOutput();
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.integrationName = integrationName;
            _resultValue.name = name;
            _resultValue.oauthAccessTokenExpiryTime = oauthAccessTokenExpiryTime;
            _resultValue.oauthRefreshTokenExpiryTime = oauthRefreshTokenExpiryTime;
            _resultValue.oauthScopes = oauthScopes;
            _resultValue.owner = owner;
            _resultValue.schemaName = schemaName;
            _resultValue.secretType = secretType;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
