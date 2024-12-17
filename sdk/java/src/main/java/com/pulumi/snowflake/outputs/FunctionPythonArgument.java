// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionPythonArgument {
    /**
     * @return The argument type.
     * 
     */
    private String argDataType;
    private @Nullable String argDefaultValue;
    /**
     * @return The argument name.
     * 
     */
    private String argName;

    private FunctionPythonArgument() {}
    /**
     * @return The argument type.
     * 
     */
    public String argDataType() {
        return this.argDataType;
    }
    public Optional<String> argDefaultValue() {
        return Optional.ofNullable(this.argDefaultValue);
    }
    /**
     * @return The argument name.
     * 
     */
    public String argName() {
        return this.argName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionPythonArgument defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String argDataType;
        private @Nullable String argDefaultValue;
        private String argName;
        public Builder() {}
        public Builder(FunctionPythonArgument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argDataType = defaults.argDataType;
    	      this.argDefaultValue = defaults.argDefaultValue;
    	      this.argName = defaults.argName;
        }

        @CustomType.Setter
        public Builder argDataType(String argDataType) {
            if (argDataType == null) {
              throw new MissingRequiredPropertyException("FunctionPythonArgument", "argDataType");
            }
            this.argDataType = argDataType;
            return this;
        }
        @CustomType.Setter
        public Builder argDefaultValue(@Nullable String argDefaultValue) {

            this.argDefaultValue = argDefaultValue;
            return this;
        }
        @CustomType.Setter
        public Builder argName(String argName) {
            if (argName == null) {
              throw new MissingRequiredPropertyException("FunctionPythonArgument", "argName");
            }
            this.argName = argName;
            return this;
        }
        public FunctionPythonArgument build() {
            final var _resultValue = new FunctionPythonArgument();
            _resultValue.argDataType = argDataType;
            _resultValue.argDefaultValue = argDefaultValue;
            _resultValue.argName = argName;
            return _resultValue;
        }
    }
}
