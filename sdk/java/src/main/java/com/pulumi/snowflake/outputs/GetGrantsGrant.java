// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGrantsGrant {
    private String createdOn;
    private Boolean grantOption;
    private String grantedBy;
    private String grantedOn;
    private String grantedTo;
    private String granteeName;
    private String name;
    private String privilege;

    private GetGrantsGrant() {}
    public String createdOn() {
        return this.createdOn;
    }
    public Boolean grantOption() {
        return this.grantOption;
    }
    public String grantedBy() {
        return this.grantedBy;
    }
    public String grantedOn() {
        return this.grantedOn;
    }
    public String grantedTo() {
        return this.grantedTo;
    }
    public String granteeName() {
        return this.granteeName;
    }
    public String name() {
        return this.name;
    }
    public String privilege() {
        return this.privilege;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrantsGrant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private Boolean grantOption;
        private String grantedBy;
        private String grantedOn;
        private String grantedTo;
        private String granteeName;
        private String name;
        private String privilege;
        public Builder() {}
        public Builder(GetGrantsGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.grantOption = defaults.grantOption;
    	      this.grantedBy = defaults.grantedBy;
    	      this.grantedOn = defaults.grantedOn;
    	      this.grantedTo = defaults.grantedTo;
    	      this.granteeName = defaults.granteeName;
    	      this.name = defaults.name;
    	      this.privilege = defaults.privilege;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder grantOption(Boolean grantOption) {
            if (grantOption == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "grantOption");
            }
            this.grantOption = grantOption;
            return this;
        }
        @CustomType.Setter
        public Builder grantedBy(String grantedBy) {
            if (grantedBy == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "grantedBy");
            }
            this.grantedBy = grantedBy;
            return this;
        }
        @CustomType.Setter
        public Builder grantedOn(String grantedOn) {
            if (grantedOn == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "grantedOn");
            }
            this.grantedOn = grantedOn;
            return this;
        }
        @CustomType.Setter
        public Builder grantedTo(String grantedTo) {
            if (grantedTo == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "grantedTo");
            }
            this.grantedTo = grantedTo;
            return this;
        }
        @CustomType.Setter
        public Builder granteeName(String granteeName) {
            if (granteeName == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "granteeName");
            }
            this.granteeName = granteeName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privilege(String privilege) {
            if (privilege == null) {
              throw new MissingRequiredPropertyException("GetGrantsGrant", "privilege");
            }
            this.privilege = privilege;
            return this;
        }
        public GetGrantsGrant build() {
            final var _resultValue = new GetGrantsGrant();
            _resultValue.createdOn = createdOn;
            _resultValue.grantOption = grantOption;
            _resultValue.grantedBy = grantedBy;
            _resultValue.grantedOn = grantedOn;
            _resultValue.grantedTo = grantedTo;
            _resultValue.granteeName = granteeName;
            _resultValue.name = name;
            _resultValue.privilege = privilege;
            return _resultValue;
        }
    }
}
