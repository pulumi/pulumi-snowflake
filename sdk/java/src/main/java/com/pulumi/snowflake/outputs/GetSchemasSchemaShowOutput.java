// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemasSchemaShowOutput {
    private String comment;
    private String createdOn;
    private String databaseName;
    private String droppedOn;
    private Boolean isCurrent;
    private Boolean isDefault;
    private String name;
    private String options;
    private String owner;
    private String ownerRoleType;
    private String retentionTime;

    private GetSchemasSchemaShowOutput() {}
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public String droppedOn() {
        return this.droppedOn;
    }
    public Boolean isCurrent() {
        return this.isCurrent;
    }
    public Boolean isDefault() {
        return this.isDefault;
    }
    public String name() {
        return this.name;
    }
    public String options() {
        return this.options;
    }
    public String owner() {
        return this.owner;
    }
    public String ownerRoleType() {
        return this.ownerRoleType;
    }
    public String retentionTime() {
        return this.retentionTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemasSchemaShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String createdOn;
        private String databaseName;
        private String droppedOn;
        private Boolean isCurrent;
        private Boolean isDefault;
        private String name;
        private String options;
        private String owner;
        private String ownerRoleType;
        private String retentionTime;
        public Builder() {}
        public Builder(GetSchemasSchemaShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.droppedOn = defaults.droppedOn;
    	      this.isCurrent = defaults.isCurrent;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.retentionTime = defaults.retentionTime;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder droppedOn(String droppedOn) {
            if (droppedOn == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "droppedOn");
            }
            this.droppedOn = droppedOn;
            return this;
        }
        @CustomType.Setter
        public Builder isCurrent(Boolean isCurrent) {
            if (isCurrent == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "isCurrent");
            }
            this.isCurrent = isCurrent;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            if (isDefault == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "isDefault");
            }
            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder options(String options) {
            if (options == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "options");
            }
            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(String ownerRoleType) {
            if (ownerRoleType == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "ownerRoleType");
            }
            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder retentionTime(String retentionTime) {
            if (retentionTime == null) {
              throw new MissingRequiredPropertyException("GetSchemasSchemaShowOutput", "retentionTime");
            }
            this.retentionTime = retentionTime;
            return this;
        }
        public GetSchemasSchemaShowOutput build() {
            final var _resultValue = new GetSchemasSchemaShowOutput();
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.droppedOn = droppedOn;
            _resultValue.isCurrent = isCurrent;
            _resultValue.isDefault = isDefault;
            _resultValue.name = name;
            _resultValue.options = options;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.retentionTime = retentionTime;
            return _resultValue;
        }
    }
}
