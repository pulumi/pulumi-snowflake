// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionArgument {
    /**
     * @return The argument name
     * 
     */
    private final String name;
    /**
     * @return The argument type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FunctionArgument(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return The argument name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The argument type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgument defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FunctionArgument build() {
            return new FunctionArgument(name, type);
        }
    }
}
