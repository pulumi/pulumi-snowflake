// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDynamicTablesLike extends com.pulumi.resources.InvokeArgs {

    public static final GetDynamicTablesLike Empty = new GetDynamicTablesLike();

    /**
     * Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     * 
     */
    @Import(name="pattern", required=true)
    private String pattern;

    /**
     * @return Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     * 
     */
    public String pattern() {
        return this.pattern;
    }

    private GetDynamicTablesLike() {}

    private GetDynamicTablesLike(GetDynamicTablesLike $) {
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDynamicTablesLike defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDynamicTablesLike $;

        public Builder() {
            $ = new GetDynamicTablesLike();
        }

        public Builder(GetDynamicTablesLike defaults) {
            $ = new GetDynamicTablesLike(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            $.pattern = pattern;
            return this;
        }

        public GetDynamicTablesLike build() {
            if ($.pattern == null) {
                throw new MissingRequiredPropertyException("GetDynamicTablesLike", "pattern");
            }
            return $;
        }
    }

}
