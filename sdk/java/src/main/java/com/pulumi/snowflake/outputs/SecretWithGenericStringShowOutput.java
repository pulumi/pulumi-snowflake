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
public final class SecretWithGenericStringShowOutput {
    private @Nullable String comment;
    private @Nullable String createdOn;
    private @Nullable String databaseName;
    private @Nullable String name;
    private @Nullable List<String> oauthScopes;
    private @Nullable String owner;
    private @Nullable String ownerRoleType;
    private @Nullable String schemaName;
    private @Nullable String secretType;

    private SecretWithGenericStringShowOutput() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<String> ownerRoleType() {
        return Optional.ofNullable(this.ownerRoleType);
    }
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    public Optional<String> secretType() {
        return Optional.ofNullable(this.secretType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretWithGenericStringShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String createdOn;
        private @Nullable String databaseName;
        private @Nullable String name;
        private @Nullable List<String> oauthScopes;
        private @Nullable String owner;
        private @Nullable String ownerRoleType;
        private @Nullable String schemaName;
        private @Nullable String secretType;
        public Builder() {}
        public Builder(SecretWithGenericStringShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.schemaName = defaults.schemaName;
    	      this.secretType = defaults.secretType;
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
        public Builder name(@Nullable String name) {

            this.name = name;
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
        public Builder ownerRoleType(@Nullable String ownerRoleType) {

            this.ownerRoleType = ownerRoleType;
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
        public SecretWithGenericStringShowOutput build() {
            final var _resultValue = new SecretWithGenericStringShowOutput();
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.name = name;
            _resultValue.oauthScopes = oauthScopes;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.schemaName = schemaName;
            _resultValue.secretType = secretType;
            return _resultValue;
        }
    }
}
