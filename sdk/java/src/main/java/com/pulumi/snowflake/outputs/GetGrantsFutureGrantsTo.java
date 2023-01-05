// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGrantsFutureGrantsTo {
    /**
     * @return Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the role.
     * 
     */
    private String role;

    private GetGrantsFutureGrantsTo() {}
    /**
     * @return Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the role.
     * 
     */
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrantsFutureGrantsTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String role;
        public Builder() {}
        public Builder(GetGrantsFutureGrantsTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GetGrantsFutureGrantsTo build() {
            final var o = new GetGrantsFutureGrantsTo();
            o.role = role;
            return o;
        }
    }
}
