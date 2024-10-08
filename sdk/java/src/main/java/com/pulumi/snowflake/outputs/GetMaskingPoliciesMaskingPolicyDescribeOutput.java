// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetMaskingPoliciesMaskingPolicyDescribeOutputSignature;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMaskingPoliciesMaskingPolicyDescribeOutput {
    private String body;
    private String name;
    private String returnType;
    private List<GetMaskingPoliciesMaskingPolicyDescribeOutputSignature> signatures;

    private GetMaskingPoliciesMaskingPolicyDescribeOutput() {}
    public String body() {
        return this.body;
    }
    public String name() {
        return this.name;
    }
    public String returnType() {
        return this.returnType;
    }
    public List<GetMaskingPoliciesMaskingPolicyDescribeOutputSignature> signatures() {
        return this.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingPoliciesMaskingPolicyDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String body;
        private String name;
        private String returnType;
        private List<GetMaskingPoliciesMaskingPolicyDescribeOutputSignature> signatures;
        public Builder() {}
        public Builder(GetMaskingPoliciesMaskingPolicyDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.name = defaults.name;
    	      this.returnType = defaults.returnType;
    	      this.signatures = defaults.signatures;
        }

        @CustomType.Setter
        public Builder body(String body) {
            if (body == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyDescribeOutput", "body");
            }
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyDescribeOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder returnType(String returnType) {
            if (returnType == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyDescribeOutput", "returnType");
            }
            this.returnType = returnType;
            return this;
        }
        @CustomType.Setter
        public Builder signatures(List<GetMaskingPoliciesMaskingPolicyDescribeOutputSignature> signatures) {
            if (signatures == null) {
              throw new MissingRequiredPropertyException("GetMaskingPoliciesMaskingPolicyDescribeOutput", "signatures");
            }
            this.signatures = signatures;
            return this;
        }
        public Builder signatures(GetMaskingPoliciesMaskingPolicyDescribeOutputSignature... signatures) {
            return signatures(List.of(signatures));
        }
        public GetMaskingPoliciesMaskingPolicyDescribeOutput build() {
            final var _resultValue = new GetMaskingPoliciesMaskingPolicyDescribeOutput();
            _resultValue.body = body;
            _resultValue.name = name;
            _resultValue.returnType = returnType;
            _resultValue.signatures = signatures;
            return _resultValue;
        }
    }
}
