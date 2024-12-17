// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ViewRowAccessPolicy {
    /**
     * @return Defines which columns are affected by the policy.
     * 
     */
    private List<String> ons;
    /**
     * @return Row access policy name. For more information about this resource, see docs.
     * 
     */
    private String policyName;

    private ViewRowAccessPolicy() {}
    /**
     * @return Defines which columns are affected by the policy.
     * 
     */
    public List<String> ons() {
        return this.ons;
    }
    /**
     * @return Row access policy name. For more information about this resource, see docs.
     * 
     */
    public String policyName() {
        return this.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewRowAccessPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ons;
        private String policyName;
        public Builder() {}
        public Builder(ViewRowAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ons = defaults.ons;
    	      this.policyName = defaults.policyName;
        }

        @CustomType.Setter
        public Builder ons(List<String> ons) {
            if (ons == null) {
              throw new MissingRequiredPropertyException("ViewRowAccessPolicy", "ons");
            }
            this.ons = ons;
            return this;
        }
        public Builder ons(String... ons) {
            return ons(List.of(ons));
        }
        @CustomType.Setter
        public Builder policyName(String policyName) {
            if (policyName == null) {
              throw new MissingRequiredPropertyException("ViewRowAccessPolicy", "policyName");
            }
            this.policyName = policyName;
            return this;
        }
        public ViewRowAccessPolicy build() {
            final var _resultValue = new ViewRowAccessPolicy();
            _resultValue.ons = ons;
            _resultValue.policyName = policyName;
            return _resultValue;
        }
    }
}
