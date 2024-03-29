// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetRolesRole;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRolesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Filters the command output by object name.
     * 
     */
    private @Nullable String pattern;
    /**
     * @return List of all the roles which you can view across your entire account, including the system-defined roles and any custom roles that exist.
     * 
     */
    private List<GetRolesRole> roles;

    private GetRolesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Filters the command output by object name.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    /**
     * @return List of all the roles which you can view across your entire account, including the system-defined roles and any custom roles that exist.
     * 
     */
    public List<GetRolesRole> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String pattern;
        private List<GetRolesRole> roles;
        public Builder() {}
        public Builder(GetRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.pattern = defaults.pattern;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRolesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pattern(@Nullable String pattern) {

            this.pattern = pattern;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<GetRolesRole> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetRolesResult", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(GetRolesRole... roles) {
            return roles(List.of(roles));
        }
        public GetRolesResult build() {
            final var _resultValue = new GetRolesResult();
            _resultValue.id = id;
            _resultValue.pattern = pattern;
            _resultValue.roles = roles;
            return _resultValue;
        }
    }
}
