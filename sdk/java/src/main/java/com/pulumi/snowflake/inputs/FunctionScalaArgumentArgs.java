// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionScalaArgumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionScalaArgumentArgs Empty = new FunctionScalaArgumentArgs();

    /**
     * The argument type.
     * 
     */
    @Import(name="argDataType", required=true)
    private Output<String> argDataType;

    /**
     * @return The argument type.
     * 
     */
    public Output<String> argDataType() {
        return this.argDataType;
    }

    @Import(name="argDefaultValue")
    private @Nullable Output<String> argDefaultValue;

    public Optional<Output<String>> argDefaultValue() {
        return Optional.ofNullable(this.argDefaultValue);
    }

    /**
     * The argument name.
     * 
     */
    @Import(name="argName", required=true)
    private Output<String> argName;

    /**
     * @return The argument name.
     * 
     */
    public Output<String> argName() {
        return this.argName;
    }

    private FunctionScalaArgumentArgs() {}

    private FunctionScalaArgumentArgs(FunctionScalaArgumentArgs $) {
        this.argDataType = $.argDataType;
        this.argDefaultValue = $.argDefaultValue;
        this.argName = $.argName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionScalaArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionScalaArgumentArgs $;

        public Builder() {
            $ = new FunctionScalaArgumentArgs();
        }

        public Builder(FunctionScalaArgumentArgs defaults) {
            $ = new FunctionScalaArgumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param argDataType The argument type.
         * 
         * @return builder
         * 
         */
        public Builder argDataType(Output<String> argDataType) {
            $.argDataType = argDataType;
            return this;
        }

        /**
         * @param argDataType The argument type.
         * 
         * @return builder
         * 
         */
        public Builder argDataType(String argDataType) {
            return argDataType(Output.of(argDataType));
        }

        public Builder argDefaultValue(@Nullable Output<String> argDefaultValue) {
            $.argDefaultValue = argDefaultValue;
            return this;
        }

        public Builder argDefaultValue(String argDefaultValue) {
            return argDefaultValue(Output.of(argDefaultValue));
        }

        /**
         * @param argName The argument name.
         * 
         * @return builder
         * 
         */
        public Builder argName(Output<String> argName) {
            $.argName = argName;
            return this;
        }

        /**
         * @param argName The argument name.
         * 
         * @return builder
         * 
         */
        public Builder argName(String argName) {
            return argName(Output.of(argName));
        }

        public FunctionScalaArgumentArgs build() {
            if ($.argDataType == null) {
                throw new MissingRequiredPropertyException("FunctionScalaArgumentArgs", "argDataType");
            }
            if ($.argName == null) {
                throw new MissingRequiredPropertyException("FunctionScalaArgumentArgs", "argName");
            }
            return $;
        }
    }

}