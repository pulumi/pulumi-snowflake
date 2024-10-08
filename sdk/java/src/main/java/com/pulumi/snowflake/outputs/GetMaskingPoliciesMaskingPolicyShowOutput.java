// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMaskingPoliciesMaskingPolicyShowOutput {
    private String comment;
    private String createdOn;
    private String databaseName;
    private Boolean exemptOtherPolicies;
    private String kind;
    private String name;
    private String owner;
    private String ownerRoleType;
    private String schemaName;

    private GetMaskingPoliciesMaskingPolicyShowOutput() {}
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public Boolean exemptOtherPolicies() {
        return this.exemptOtherPolicies;
    }
    public String kind() {
        return this.kind;
    }
    public String name() {
        return this.name;
    }
    public String owner() {
        return this.owner;
    }
    public String ownerRoleType() {
        return this.ownerRoleType;
    }
    public String schemaName() {
        return this.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingPoliciesMaskingPolicyShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String createdOn;
        private String databaseName;
        private Boolean exemptOtherPolicies;
        private String kind;
        private String name;
        private String owner;
        private String ownerRoleType;
        private String schemaName;
        public Builder() {}
        public Builder(GetMaskingPoliciesMaskingPolicyShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.exemptOtherPolicies = defaults.exemptOtherPolicies;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.schemaName = defaults.schemaName;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder exemptOtherPolicies(Boolean exemptOtherPolicies) {
            if (exemptOtherPolicies == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "exemptOtherPolicies");
            }
            this.exemptOtherPolicies = exemptOtherPolicies;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(String ownerRoleType) {
            if (ownerRoleType == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "ownerRoleType");
            }
            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            if (schemaName == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyShowOutput", "schemaName");
            }
            this.schemaName = schemaName;
            return this;
        }
        public GetMaskingPoliciesMaskingPolicyShowOutput build() {
            final var _resultValue = new GetMaskingPoliciesMaskingPolicyShowOutput();
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.exemptOtherPolicies = exemptOtherPolicies;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.schemaName = schemaName;
            return _resultValue;
        }
    }
}
