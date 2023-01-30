// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCurrentRoleResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the [primary role](https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#label-access-control-role-enforcement) in use for the current session.
     * 
     */
    private String name;

    private GetCurrentRoleResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the [primary role](https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#label-access-control-role-enforcement) in use for the current session.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentRoleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetCurrentRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetCurrentRoleResult build() {
            final var o = new GetCurrentRoleResult();
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
