// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDynamicTablesLikeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDynamicTablesLikeArgs Empty = new GetDynamicTablesLikeArgs();

    /**
     * Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    /**
     * @return Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }

    private GetDynamicTablesLikeArgs() {}

    private GetDynamicTablesLikeArgs(GetDynamicTablesLikeArgs $) {
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDynamicTablesLikeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDynamicTablesLikeArgs $;

        public Builder() {
            $ = new GetDynamicTablesLikeArgs();
        }

        public Builder(GetDynamicTablesLikeArgs defaults) {
            $ = new GetDynamicTablesLikeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
         * 
         * @return builder
         * 
         */
        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public GetDynamicTablesLikeArgs build() {
            if ($.pattern == null) {
                throw new MissingRequiredPropertyException("GetDynamicTablesLikeArgs", "pattern");
            }
            return $;
        }
    }

}
