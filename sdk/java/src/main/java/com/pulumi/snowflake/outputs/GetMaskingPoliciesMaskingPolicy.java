// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetMaskingPoliciesMaskingPolicyDescribeOutput;
import com.pulumi.snowflake.outputs.GetMaskingPoliciesMaskingPolicyShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMaskingPoliciesMaskingPolicy {
    /**
     * @return Holds the output of DESCRIBE MASKING POLICY.
     * 
     */
    private List<GetMaskingPoliciesMaskingPolicyDescribeOutput> describeOutputs;
    /**
     * @return Holds the output of SHOW MASKING POLICIES.
     * 
     */
    private List<GetMaskingPoliciesMaskingPolicyShowOutput> showOutputs;

    private GetMaskingPoliciesMaskingPolicy() {}
    /**
     * @return Holds the output of DESCRIBE MASKING POLICY.
     * 
     */
    public List<GetMaskingPoliciesMaskingPolicyDescribeOutput> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * @return Holds the output of SHOW MASKING POLICIES.
     * 
     */
    public List<GetMaskingPoliciesMaskingPolicyShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingPoliciesMaskingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetMaskingPoliciesMaskingPolicyDescribeOutput> describeOutputs;
        private List<GetMaskingPoliciesMaskingPolicyShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetMaskingPoliciesMaskingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describeOutputs = defaults.describeOutputs;
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder describeOutputs(List<GetMaskingPoliciesMaskingPolicyDescribeOutput> describeOutputs) {
            if (describeOutputs == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "describeOutputs");
            }
            this.describeOutputs = describeOutputs;
            return this;
        }
        public Builder describeOutputs(GetMaskingPoliciesMaskingPolicyDescribeOutput... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }
        @CustomType.Setter
        public Builder showOutputs(List<GetMaskingPoliciesMaskingPolicyShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicy", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetMaskingPoliciesMaskingPolicyShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetMaskingPoliciesMaskingPolicy build() {
            final var _resultValue = new GetMaskingPoliciesMaskingPolicy();
            _resultValue.describeOutputs = describeOutputs;
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
