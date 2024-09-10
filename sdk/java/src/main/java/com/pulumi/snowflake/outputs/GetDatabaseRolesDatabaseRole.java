// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetDatabaseRolesDatabaseRoleShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseRolesDatabaseRole {
    /**
     * @return Holds the output of SHOW DATABASE ROLES.
     * 
     */
    private List<GetDatabaseRolesDatabaseRoleShowOutput> showOutputs;

    private GetDatabaseRolesDatabaseRole() {}
    /**
     * @return Holds the output of SHOW DATABASE ROLES.
     * 
     */
    public List<GetDatabaseRolesDatabaseRoleShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseRolesDatabaseRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatabaseRolesDatabaseRoleShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetDatabaseRolesDatabaseRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder showOutputs(List<GetDatabaseRolesDatabaseRoleShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetDatabaseRolesDatabaseRole", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetDatabaseRolesDatabaseRoleShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetDatabaseRolesDatabaseRole build() {
            final var _resultValue = new GetDatabaseRolesDatabaseRole();
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
