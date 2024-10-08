// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.MaskingPolicyDescribeOutputSignature;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaskingPolicyDescribeOutput {
    private @Nullable String body;
    private @Nullable String name;
    private @Nullable String returnType;
    private @Nullable List<MaskingPolicyDescribeOutputSignature> signatures;

    private MaskingPolicyDescribeOutput() {}
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> returnType() {
        return Optional.ofNullable(this.returnType);
    }
    public List<MaskingPolicyDescribeOutputSignature> signatures() {
        return this.signatures == null ? List.of() : this.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaskingPolicyDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String body;
        private @Nullable String name;
        private @Nullable String returnType;
        private @Nullable List<MaskingPolicyDescribeOutputSignature> signatures;
        public Builder() {}
        public Builder(MaskingPolicyDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.name = defaults.name;
    	      this.returnType = defaults.returnType;
    	      this.signatures = defaults.signatures;
        }

        @CustomType.Setter
        public Builder body(@Nullable String body) {

            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder returnType(@Nullable String returnType) {

            this.returnType = returnType;
            return this;
        }
        @CustomType.Setter
        public Builder signatures(@Nullable List<MaskingPolicyDescribeOutputSignature> signatures) {

            this.signatures = signatures;
            return this;
        }
        public Builder signatures(MaskingPolicyDescribeOutputSignature... signatures) {
            return signatures(List.of(signatures));
        }
        public MaskingPolicyDescribeOutput build() {
            final var _resultValue = new MaskingPolicyDescribeOutput();
            _resultValue.body = body;
            _resultValue.name = name;
            _resultValue.returnType = returnType;
            _resultValue.signatures = signatures;
            return _resultValue;
        }
    }
}
