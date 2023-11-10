// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDynamicTablesLimit {
    /**
     * @return The optional FROM &#39;name_string&#39; subclause effectively serves as a “cursor” for the results. This enables fetching the specified number of rows following the first row whose object name matches the specified string
     * 
     */
    private @Nullable String from;
    /**
     * @return Specifies the maximum number of rows to return.
     * 
     */
    private @Nullable Integer rows;

    private GetDynamicTablesLimit() {}
    /**
     * @return The optional FROM &#39;name_string&#39; subclause effectively serves as a “cursor” for the results. This enables fetching the specified number of rows following the first row whose object name matches the specified string
     * 
     */
    public Optional<String> from() {
        return Optional.ofNullable(this.from);
    }
    /**
     * @return Specifies the maximum number of rows to return.
     * 
     */
    public Optional<Integer> rows() {
        return Optional.ofNullable(this.rows);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDynamicTablesLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String from;
        private @Nullable Integer rows;
        public Builder() {}
        public Builder(GetDynamicTablesLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.rows = defaults.rows;
        }

        @CustomType.Setter
        public Builder from(@Nullable String from) {
            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder rows(@Nullable Integer rows) {
            this.rows = rows;
            return this;
        }
        public GetDynamicTablesLimit build() {
            final var o = new GetDynamicTablesLimit();
            o.from = from;
            o.rows = rows;
            return o;
        }
    }
}