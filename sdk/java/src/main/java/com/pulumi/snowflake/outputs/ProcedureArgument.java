// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ProcedureArgument {
    /**
     * @return The argument name
     * 
     */
    private String name;
    /**
     * @return The argument type
     * 
     */
    private String type;

    private ProcedureArgument() {}
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

    public static Builder builder(ProcedureArgument defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(ProcedureArgument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ProcedureArgument", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ProcedureArgument", "type");
            }
            this.type = type;
            return this;
        }
        public ProcedureArgument build() {
            final var _resultValue = new ProcedureArgument();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
