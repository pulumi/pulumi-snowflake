// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetDatabaseRolesDatabaseRole;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseRolesResult {
    /**
     * @return The database from which to return the database roles from.
     * 
     */
    private String database;
    /**
     * @return Lists all the database roles in a specified database.
     * 
     */
    private List<GetDatabaseRolesDatabaseRole> databaseRoles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetDatabaseRolesResult() {}
    /**
     * @return The database from which to return the database roles from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Lists all the database roles in a specified database.
     * 
     */
    public List<GetDatabaseRolesDatabaseRole> databaseRoles() {
        return this.databaseRoles;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private List<GetDatabaseRolesDatabaseRole> databaseRoles;
        private String id;
        public Builder() {}
        public Builder(GetDatabaseRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.databaseRoles = defaults.databaseRoles;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder databaseRoles(List<GetDatabaseRolesDatabaseRole> databaseRoles) {
            this.databaseRoles = Objects.requireNonNull(databaseRoles);
            return this;
        }
        public Builder databaseRoles(GetDatabaseRolesDatabaseRole... databaseRoles) {
            return databaseRoles(List.of(databaseRoles));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetDatabaseRolesResult build() {
            final var o = new GetDatabaseRolesResult();
            o.database = database;
            o.databaseRoles = databaseRoles;
            o.id = id;
            return o;
        }
    }
}
