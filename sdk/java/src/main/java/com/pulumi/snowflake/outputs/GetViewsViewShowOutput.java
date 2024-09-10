// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetViewsViewShowOutput {
    private String changeTracking;
    private String comment;
    private String createdOn;
    private String databaseName;
    private Boolean isMaterialized;
    private Boolean isSecure;
    private String kind;
    private String name;
    private String owner;
    private String ownerRoleType;
    private String reserved;
    private String schemaName;
    private String text;

    private GetViewsViewShowOutput() {}
    public String changeTracking() {
        return this.changeTracking;
    }
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public Boolean isMaterialized() {
        return this.isMaterialized;
    }
    public Boolean isSecure() {
        return this.isSecure;
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
    public String reserved() {
        return this.reserved;
    }
    public String schemaName() {
        return this.schemaName;
    }
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetViewsViewShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String changeTracking;
        private String comment;
        private String createdOn;
        private String databaseName;
        private Boolean isMaterialized;
        private Boolean isSecure;
        private String kind;
        private String name;
        private String owner;
        private String ownerRoleType;
        private String reserved;
        private String schemaName;
        private String text;
        public Builder() {}
        public Builder(GetViewsViewShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeTracking = defaults.changeTracking;
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.isMaterialized = defaults.isMaterialized;
    	      this.isSecure = defaults.isSecure;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.reserved = defaults.reserved;
    	      this.schemaName = defaults.schemaName;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder changeTracking(String changeTracking) {
            if (changeTracking == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "changeTracking");
            }
            this.changeTracking = changeTracking;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder isMaterialized(Boolean isMaterialized) {
            if (isMaterialized == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "isMaterialized");
            }
            this.isMaterialized = isMaterialized;
            return this;
        }
        @CustomType.Setter
        public Builder isSecure(Boolean isSecure) {
            if (isSecure == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "isSecure");
            }
            this.isSecure = isSecure;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(String ownerRoleType) {
            if (ownerRoleType == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "ownerRoleType");
            }
            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder reserved(String reserved) {
            if (reserved == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "reserved");
            }
            this.reserved = reserved;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            if (schemaName == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "schemaName");
            }
            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            if (text == null) {
              throw new MissingRequiredPropertyException("GetViewsViewShowOutput", "text");
            }
            this.text = text;
            return this;
        }
        public GetViewsViewShowOutput build() {
            final var _resultValue = new GetViewsViewShowOutput();
            _resultValue.changeTracking = changeTracking;
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.isMaterialized = isMaterialized;
            _resultValue.isSecure = isSecure;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.reserved = reserved;
            _resultValue.schemaName = schemaName;
            _resultValue.text = text;
            return _resultValue;
        }
    }
}
