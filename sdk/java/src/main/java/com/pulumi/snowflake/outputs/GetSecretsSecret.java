// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetSecretsSecretDescribeOutput;
import com.pulumi.snowflake.outputs.GetSecretsSecretShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecretsSecret {
    /**
     * @return Holds the output of DESCRIBE SECRET.
     * 
     */
    private List<GetSecretsSecretDescribeOutput> describeOutputs;
    /**
     * @return Holds the output of SHOW SECRETS.
     * 
     */
    private List<GetSecretsSecretShowOutput> showOutputs;

    private GetSecretsSecret() {}
    /**
     * @return Holds the output of DESCRIBE SECRET.
     * 
     */
    public List<GetSecretsSecretDescribeOutput> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * @return Holds the output of SHOW SECRETS.
     * 
     */
    public List<GetSecretsSecretShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSecretsSecretDescribeOutput> describeOutputs;
        private List<GetSecretsSecretShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetSecretsSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describeOutputs = defaults.describeOutputs;
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder describeOutputs(List<GetSecretsSecretDescribeOutput> describeOutputs) {
            if (describeOutputs == null) {
              throw new MissingRequiredPropertyException("GetSecretsSecret", "describeOutputs");
            }
            this.describeOutputs = describeOutputs;
            return this;
        }
        public Builder describeOutputs(GetSecretsSecretDescribeOutput... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }
        @CustomType.Setter
        public Builder showOutputs(List<GetSecretsSecretShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetSecretsSecret", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetSecretsSecretShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetSecretsSecret build() {
            final var _resultValue = new GetSecretsSecret();
            _resultValue.describeOutputs = describeOutputs;
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
