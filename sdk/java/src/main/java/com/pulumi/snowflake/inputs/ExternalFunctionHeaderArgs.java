// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ExternalFunctionHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalFunctionHeaderArgs Empty = new ExternalFunctionHeaderArgs();

    /**
     * Header name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Header name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Header value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Header value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ExternalFunctionHeaderArgs() {}

    private ExternalFunctionHeaderArgs(ExternalFunctionHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalFunctionHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalFunctionHeaderArgs $;

        public Builder() {
            $ = new ExternalFunctionHeaderArgs();
        }

        public Builder(ExternalFunctionHeaderArgs defaults) {
            $ = new ExternalFunctionHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Header name
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Header name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Header value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Header value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ExternalFunctionHeaderArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ExternalFunctionHeaderArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ExternalFunctionHeaderArgs", "value");
            }
            return $;
        }
    }

}
