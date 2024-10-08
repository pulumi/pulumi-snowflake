// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUsersUserShowOutput {
    private String comment;
    private String createdOn;
    private String daysToExpiry;
    private String defaultNamespace;
    private String defaultRole;
    private String defaultSecondaryRoles;
    private String defaultWarehouse;
    private Boolean disabled;
    private String displayName;
    private String email;
    private String expiresAtTime;
    private Boolean extAuthnDuo;
    private String extAuthnUid;
    private String firstName;
    private Boolean hasMfa;
    private Boolean hasPassword;
    private Boolean hasRsaPublicKey;
    private String lastName;
    private String lastSuccessLogin;
    private String lockedUntilTime;
    private String loginName;
    private String minsToBypassMfa;
    private String minsToUnlock;
    private Boolean mustChangePassword;
    private String name;
    private String owner;
    private Boolean snowflakeLock;
    private String type;

    private GetUsersUserShowOutput() {}
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String daysToExpiry() {
        return this.daysToExpiry;
    }
    public String defaultNamespace() {
        return this.defaultNamespace;
    }
    public String defaultRole() {
        return this.defaultRole;
    }
    public String defaultSecondaryRoles() {
        return this.defaultSecondaryRoles;
    }
    public String defaultWarehouse() {
        return this.defaultWarehouse;
    }
    public Boolean disabled() {
        return this.disabled;
    }
    public String displayName() {
        return this.displayName;
    }
    public String email() {
        return this.email;
    }
    public String expiresAtTime() {
        return this.expiresAtTime;
    }
    public Boolean extAuthnDuo() {
        return this.extAuthnDuo;
    }
    public String extAuthnUid() {
        return this.extAuthnUid;
    }
    public String firstName() {
        return this.firstName;
    }
    public Boolean hasMfa() {
        return this.hasMfa;
    }
    public Boolean hasPassword() {
        return this.hasPassword;
    }
    public Boolean hasRsaPublicKey() {
        return this.hasRsaPublicKey;
    }
    public String lastName() {
        return this.lastName;
    }
    public String lastSuccessLogin() {
        return this.lastSuccessLogin;
    }
    public String lockedUntilTime() {
        return this.lockedUntilTime;
    }
    public String loginName() {
        return this.loginName;
    }
    public String minsToBypassMfa() {
        return this.minsToBypassMfa;
    }
    public String minsToUnlock() {
        return this.minsToUnlock;
    }
    public Boolean mustChangePassword() {
        return this.mustChangePassword;
    }
    public String name() {
        return this.name;
    }
    public String owner() {
        return this.owner;
    }
    public Boolean snowflakeLock() {
        return this.snowflakeLock;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersUserShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String createdOn;
        private String daysToExpiry;
        private String defaultNamespace;
        private String defaultRole;
        private String defaultSecondaryRoles;
        private String defaultWarehouse;
        private Boolean disabled;
        private String displayName;
        private String email;
        private String expiresAtTime;
        private Boolean extAuthnDuo;
        private String extAuthnUid;
        private String firstName;
        private Boolean hasMfa;
        private Boolean hasPassword;
        private Boolean hasRsaPublicKey;
        private String lastName;
        private String lastSuccessLogin;
        private String lockedUntilTime;
        private String loginName;
        private String minsToBypassMfa;
        private String minsToUnlock;
        private Boolean mustChangePassword;
        private String name;
        private String owner;
        private Boolean snowflakeLock;
        private String type;
        public Builder() {}
        public Builder(GetUsersUserShowOutput defaults) {
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
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder daysToExpiry(String daysToExpiry) {
            if (daysToExpiry == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "daysToExpiry");
            }
            this.daysToExpiry = daysToExpiry;
            return this;
        }
        @CustomType.Setter
        public Builder defaultNamespace(String defaultNamespace) {
            if (defaultNamespace == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "defaultNamespace");
            }
            this.defaultNamespace = defaultNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder defaultRole(String defaultRole) {
            if (defaultRole == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "defaultRole");
            }
            this.defaultRole = defaultRole;
            return this;
        }
        @CustomType.Setter
        public Builder defaultSecondaryRoles(String defaultSecondaryRoles) {
            if (defaultSecondaryRoles == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "defaultSecondaryRoles");
            }
            this.defaultSecondaryRoles = defaultSecondaryRoles;
            return this;
        }
        @CustomType.Setter
        public Builder defaultWarehouse(String defaultWarehouse) {
            if (defaultWarehouse == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "defaultWarehouse");
            }
            this.defaultWarehouse = defaultWarehouse;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAtTime(String expiresAtTime) {
            if (expiresAtTime == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "expiresAtTime");
            }
            this.expiresAtTime = expiresAtTime;
            return this;
        }
        @CustomType.Setter
        public Builder extAuthnDuo(Boolean extAuthnDuo) {
            if (extAuthnDuo == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "extAuthnDuo");
            }
            this.extAuthnDuo = extAuthnDuo;
            return this;
        }
        @CustomType.Setter
        public Builder extAuthnUid(String extAuthnUid) {
            if (extAuthnUid == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "extAuthnUid");
            }
            this.extAuthnUid = extAuthnUid;
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            if (firstName == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "firstName");
            }
            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder hasMfa(Boolean hasMfa) {
            if (hasMfa == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "hasMfa");
            }
            this.hasMfa = hasMfa;
            return this;
        }
        @CustomType.Setter
        public Builder hasPassword(Boolean hasPassword) {
            if (hasPassword == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "hasPassword");
            }
            this.hasPassword = hasPassword;
            return this;
        }
        @CustomType.Setter
        public Builder hasRsaPublicKey(Boolean hasRsaPublicKey) {
            if (hasRsaPublicKey == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "hasRsaPublicKey");
            }
            this.hasRsaPublicKey = hasRsaPublicKey;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            if (lastName == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "lastName");
            }
            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuccessLogin(String lastSuccessLogin) {
            if (lastSuccessLogin == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "lastSuccessLogin");
            }
            this.lastSuccessLogin = lastSuccessLogin;
            return this;
        }
        @CustomType.Setter
        public Builder lockedUntilTime(String lockedUntilTime) {
            if (lockedUntilTime == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "lockedUntilTime");
            }
            this.lockedUntilTime = lockedUntilTime;
            return this;
        }
        @CustomType.Setter
        public Builder loginName(String loginName) {
            if (loginName == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "loginName");
            }
            this.loginName = loginName;
            return this;
        }
        @CustomType.Setter
        public Builder minsToBypassMfa(String minsToBypassMfa) {
            if (minsToBypassMfa == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "minsToBypassMfa");
            }
            this.minsToBypassMfa = minsToBypassMfa;
            return this;
        }
        @CustomType.Setter
        public Builder minsToUnlock(String minsToUnlock) {
            if (minsToUnlock == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "minsToUnlock");
            }
            this.minsToUnlock = minsToUnlock;
            return this;
        }
        @CustomType.Setter
        public Builder mustChangePassword(Boolean mustChangePassword) {
            if (mustChangePassword == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "mustChangePassword");
            }
            this.mustChangePassword = mustChangePassword;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder snowflakeLock(Boolean snowflakeLock) {
            if (snowflakeLock == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "snowflakeLock");
            }
            this.snowflakeLock = snowflakeLock;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetUsersUserShowOutput", "type");
            }
            this.type = type;
            return this;
        }
        public GetUsersUserShowOutput build() {
            final var _resultValue = new GetUsersUserShowOutput();
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
