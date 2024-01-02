// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrantPrivilegesToRoleOnAccountObject {
    /**
     * @return The fully qualified name of the object on which privileges will be granted.
     * 
     */
    private String objectName;
    /**
     * @return The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     * 
     */
    private String objectType;

    private GrantPrivilegesToRoleOnAccountObject() {}
    /**
     * @return The fully qualified name of the object on which privileges will be granted.
     * 
     */
    public String objectName() {
        return this.objectName;
    }
    /**
     * @return The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     * 
     */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantPrivilegesToRoleOnAccountObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String objectName;
        private String objectType;
        public Builder() {}
        public Builder(GrantPrivilegesToRoleOnAccountObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectName = defaults.objectName;
    	      this.objectType = defaults.objectType;
        }

        @CustomType.Setter
        public Builder objectName(String objectName) {
            if (objectName == null) {
              throw new MissingRequiredPropertyException("GrantPrivilegesToRoleOnAccountObject", "objectName");
            }
            this.objectName = objectName;
            return this;
        }
        @CustomType.Setter
        public Builder objectType(String objectType) {
            if (objectType == null) {
              throw new MissingRequiredPropertyException("GrantPrivilegesToRoleOnAccountObject", "objectType");
            }
            this.objectType = objectType;
            return this;
        }
        public GrantPrivilegesToRoleOnAccountObject build() {
            final var _resultValue = new GrantPrivilegesToRoleOnAccountObject();
            _resultValue.objectName = objectName;
            _resultValue.objectType = objectType;
            return _resultValue;
        }
    }
}
