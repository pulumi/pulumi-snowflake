// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ViewAggregationPolicy {
    /**
     * @return Defines which columns uniquely identify an entity within the view.
     * 
     */
    private @Nullable List<String> entityKeys;
    /**
     * @return Aggregation policy name.
     * 
     */
    private String policyName;

    private ViewAggregationPolicy() {}
    /**
     * @return Defines which columns uniquely identify an entity within the view.
     * 
     */
    public List<String> entityKeys() {
        return this.entityKeys == null ? List.of() : this.entityKeys;
    }
    /**
     * @return Aggregation policy name.
     * 
     */
    public String policyName() {
        return this.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewAggregationPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> entityKeys;
        private String policyName;
        public Builder() {}
        public Builder(ViewAggregationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityKeys = defaults.entityKeys;
    	      this.policyName = defaults.policyName;
        }

        @CustomType.Setter
        public Builder entityKeys(@Nullable List<String> entityKeys) {

            this.entityKeys = entityKeys;
            return this;
        }
        public Builder entityKeys(String... entityKeys) {
            return entityKeys(List.of(entityKeys));
        }
        @CustomType.Setter
        public Builder policyName(String policyName) {
            if (policyName == null) {
              throw new MissingRequiredPropertyException("ViewAggregationPolicy", "policyName");
            }
            this.policyName = policyName;
            return this;
        }
        public ViewAggregationPolicy build() {
            final var _resultValue = new ViewAggregationPolicy();
            _resultValue.entityKeys = entityKeys;
            _resultValue.policyName = policyName;
            return _resultValue;
        }
    }
}
