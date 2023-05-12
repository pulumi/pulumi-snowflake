// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaskingPolicySignatureColumn {
    /**
     * @return Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     * 
     */
    private String name;
    private String type;

    private MaskingPolicySignatureColumn() {}
    /**
     * @return Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     * 
     */
    public String name() {
        return this.name;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaskingPolicySignatureColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(MaskingPolicySignatureColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MaskingPolicySignatureColumn build() {
            final var o = new MaskingPolicySignatureColumn();
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
