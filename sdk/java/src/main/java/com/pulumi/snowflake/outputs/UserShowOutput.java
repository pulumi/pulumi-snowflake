// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserShowOutput {
    private @Nullable String comment;
    private @Nullable String createdOn;
    private @Nullable String daysToExpiry;
    private @Nullable String defaultNamespace;
    private @Nullable String defaultRole;
    private @Nullable String defaultSecondaryRoles;
    private @Nullable String defaultWarehouse;
    private @Nullable Boolean disabled;
    private @Nullable String displayName;
    private @Nullable String email;
    private @Nullable String expiresAtTime;
    private @Nullable Boolean extAuthnDuo;
    private @Nullable String extAuthnUid;
    private @Nullable String firstName;
    private @Nullable Boolean hasMfa;
    private @Nullable Boolean hasPassword;
    private @Nullable Boolean hasRsaPublicKey;
    private @Nullable String lastName;
    private @Nullable String lastSuccessLogin;
    private @Nullable String lockedUntilTime;
    private @Nullable String loginName;
    private @Nullable String minsToBypassMfa;
    private @Nullable String minsToUnlock;
    private @Nullable Boolean mustChangePassword;
    private @Nullable String name;
    private @Nullable String owner;
    private @Nullable Boolean snowflakeLock;
    private @Nullable String type;

    private UserShowOutput() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<String> daysToExpiry() {
        return Optional.ofNullable(this.daysToExpiry);
    }
    public Optional<String> defaultNamespace() {
        return Optional.ofNullable(this.defaultNamespace);
    }
    public Optional<String> defaultRole() {
        return Optional.ofNullable(this.defaultRole);
    }
    public Optional<String> defaultSecondaryRoles() {
        return Optional.ofNullable(this.defaultSecondaryRoles);
    }
    public Optional<String> defaultWarehouse() {
        return Optional.ofNullable(this.defaultWarehouse);
    }
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    public Optional<String> expiresAtTime() {
        return Optional.ofNullable(this.expiresAtTime);
    }
    public Optional<Boolean> extAuthnDuo() {
        return Optional.ofNullable(this.extAuthnDuo);
    }
    public Optional<String> extAuthnUid() {
        return Optional.ofNullable(this.extAuthnUid);
    }
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    public Optional<Boolean> hasMfa() {
        return Optional.ofNullable(this.hasMfa);
    }
    public Optional<Boolean> hasPassword() {
        return Optional.ofNullable(this.hasPassword);
    }
    public Optional<Boolean> hasRsaPublicKey() {
        return Optional.ofNullable(this.hasRsaPublicKey);
    }
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }
    public Optional<String> lastSuccessLogin() {
        return Optional.ofNullable(this.lastSuccessLogin);
    }
    public Optional<String> lockedUntilTime() {
        return Optional.ofNullable(this.lockedUntilTime);
    }
    public Optional<String> loginName() {
        return Optional.ofNullable(this.loginName);
    }
    public Optional<String> minsToBypassMfa() {
        return Optional.ofNullable(this.minsToBypassMfa);
    }
    public Optional<String> minsToUnlock() {
        return Optional.ofNullable(this.minsToUnlock);
    }
    public Optional<Boolean> mustChangePassword() {
        return Optional.ofNullable(this.mustChangePassword);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<Boolean> snowflakeLock() {
        return Optional.ofNullable(this.snowflakeLock);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String createdOn;
        private @Nullable String daysToExpiry;
        private @Nullable String defaultNamespace;
        private @Nullable String defaultRole;
        private @Nullable String defaultSecondaryRoles;
        private @Nullable String defaultWarehouse;
        private @Nullable Boolean disabled;
        private @Nullable String displayName;
        private @Nullable String email;
        private @Nullable String expiresAtTime;
        private @Nullable Boolean extAuthnDuo;
        private @Nullable String extAuthnUid;
        private @Nullable String firstName;
        private @Nullable Boolean hasMfa;
        private @Nullable Boolean hasPassword;
        private @Nullable Boolean hasRsaPublicKey;
        private @Nullable String lastName;
        private @Nullable String lastSuccessLogin;
        private @Nullable String lockedUntilTime;
        private @Nullable String loginName;
        private @Nullable String minsToBypassMfa;
        private @Nullable String minsToUnlock;
        private @Nullable Boolean mustChangePassword;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable Boolean snowflakeLock;
        private @Nullable String type;
        public Builder() {}
        public Builder(UserShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.daysToExpiry = defaults.daysToExpiry;
    	      this.defaultNamespace = defaults.defaultNamespace;
    	      this.defaultRole = defaults.defaultRole;
    	      this.defaultSecondaryRoles = defaults.defaultSecondaryRoles;
    	      this.defaultWarehouse = defaults.defaultWarehouse;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.expiresAtTime = defaults.expiresAtTime;
    	      this.extAuthnDuo = defaults.extAuthnDuo;
    	      this.extAuthnUid = defaults.extAuthnUid;
    	      this.firstName = defaults.firstName;
    	      this.hasMfa = defaults.hasMfa;
    	      this.hasPassword = defaults.hasPassword;
    	      this.hasRsaPublicKey = defaults.hasRsaPublicKey;
    	      this.lastName = defaults.lastName;
    	      this.lastSuccessLogin = defaults.lastSuccessLogin;
    	      this.lockedUntilTime = defaults.lockedUntilTime;
    	      this.loginName = defaults.loginName;
    	      this.minsToBypassMfa = defaults.minsToBypassMfa;
    	      this.minsToUnlock = defaults.minsToUnlock;
    	      this.mustChangePassword = defaults.mustChangePassword;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.snowflakeLock = defaults.snowflakeLock;
    	      this.type = defaults.type;
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
        public Builder daysToExpiry(@Nullable String daysToExpiry) {

            this.daysToExpiry = daysToExpiry;
            return this;
        }
        @CustomType.Setter
        public Builder defaultNamespace(@Nullable String defaultNamespace) {

            this.defaultNamespace = defaultNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder defaultRole(@Nullable String defaultRole) {

            this.defaultRole = defaultRole;
            return this;
        }
        @CustomType.Setter
        public Builder defaultSecondaryRoles(@Nullable String defaultSecondaryRoles) {

            this.defaultSecondaryRoles = defaultSecondaryRoles;
            return this;
        }
        @CustomType.Setter
        public Builder defaultWarehouse(@Nullable String defaultWarehouse) {

            this.defaultWarehouse = defaultWarehouse;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {

            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder email(@Nullable String email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAtTime(@Nullable String expiresAtTime) {

            this.expiresAtTime = expiresAtTime;
            return this;
        }
        @CustomType.Setter
        public Builder extAuthnDuo(@Nullable Boolean extAuthnDuo) {

            this.extAuthnDuo = extAuthnDuo;
            return this;
        }
        @CustomType.Setter
        public Builder extAuthnUid(@Nullable String extAuthnUid) {

            this.extAuthnUid = extAuthnUid;
            return this;
        }
        @CustomType.Setter
        public Builder firstName(@Nullable String firstName) {

            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder hasMfa(@Nullable Boolean hasMfa) {

            this.hasMfa = hasMfa;
            return this;
        }
        @CustomType.Setter
        public Builder hasPassword(@Nullable Boolean hasPassword) {

            this.hasPassword = hasPassword;
            return this;
        }
        @CustomType.Setter
        public Builder hasRsaPublicKey(@Nullable Boolean hasRsaPublicKey) {

            this.hasRsaPublicKey = hasRsaPublicKey;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(@Nullable String lastName) {

            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuccessLogin(@Nullable String lastSuccessLogin) {

            this.lastSuccessLogin = lastSuccessLogin;
            return this;
        }
        @CustomType.Setter
        public Builder lockedUntilTime(@Nullable String lockedUntilTime) {

            this.lockedUntilTime = lockedUntilTime;
            return this;
        }
        @CustomType.Setter
        public Builder loginName(@Nullable String loginName) {

            this.loginName = loginName;
            return this;
        }
        @CustomType.Setter
        public Builder minsToBypassMfa(@Nullable String minsToBypassMfa) {

            this.minsToBypassMfa = minsToBypassMfa;
            return this;
        }
        @CustomType.Setter
        public Builder minsToUnlock(@Nullable String minsToUnlock) {

            this.minsToUnlock = minsToUnlock;
            return this;
        }
        @CustomType.Setter
        public Builder mustChangePassword(@Nullable Boolean mustChangePassword) {

            this.mustChangePassword = mustChangePassword;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {

            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder snowflakeLock(@Nullable Boolean snowflakeLock) {

            this.snowflakeLock = snowflakeLock;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public UserShowOutput build() {
            final var _resultValue = new UserShowOutput();
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.daysToExpiry = daysToExpiry;
            _resultValue.defaultNamespace = defaultNamespace;
            _resultValue.defaultRole = defaultRole;
            _resultValue.defaultSecondaryRoles = defaultSecondaryRoles;
            _resultValue.defaultWarehouse = defaultWarehouse;
            _resultValue.disabled = disabled;
            _resultValue.displayName = displayName;
            _resultValue.email = email;
            _resultValue.expiresAtTime = expiresAtTime;
            _resultValue.extAuthnDuo = extAuthnDuo;
            _resultValue.extAuthnUid = extAuthnUid;
            _resultValue.firstName = firstName;
            _resultValue.hasMfa = hasMfa;
            _resultValue.hasPassword = hasPassword;
            _resultValue.hasRsaPublicKey = hasRsaPublicKey;
            _resultValue.lastName = lastName;
            _resultValue.lastSuccessLogin = lastSuccessLogin;
            _resultValue.lockedUntilTime = lockedUntilTime;
            _resultValue.loginName = loginName;
            _resultValue.minsToBypassMfa = minsToBypassMfa;
            _resultValue.minsToUnlock = minsToUnlock;
            _resultValue.mustChangePassword = mustChangePassword;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.snowflakeLock = snowflakeLock;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
