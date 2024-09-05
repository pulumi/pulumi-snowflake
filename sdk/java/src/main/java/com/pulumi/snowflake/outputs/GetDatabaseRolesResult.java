// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetDatabaseRolesDatabaseRole;
import com.pulumi.snowflake.outputs.GetDatabaseRolesLimit;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseRolesResult {
    /**
     * @return Holds the aggregated output of all database role details queries.
     * 
     */
    private List<GetDatabaseRolesDatabaseRole> databaseRoles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The database from which to return the database roles from.
     * 
     */
    private String inDatabase;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    private @Nullable GetDatabaseRolesLimit limit;

    private GetDatabaseRolesResult() {}
    /**
     * @return Holds the aggregated output of all database role details queries.
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
    /**
     * @return The database from which to return the database roles from.
     * 
     */
    public String inDatabase() {
        return this.inDatabase;
    }
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<String> like() {
        return Optional.ofNullable(this.like);
    }
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetDatabaseRolesLimit> limit() {
        return Optional.ofNullable(this.limit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatabaseRolesDatabaseRole> databaseRoles;
        private String id;
        private String inDatabase;
        private @Nullable String like;
        private @Nullable GetDatabaseRolesLimit limit;
        public Builder() {}
        public Builder(GetDatabaseRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseRoles = defaults.databaseRoles;
    	      this.id = defaults.id;
    	      this.inDatabase = defaults.inDatabase;
    	      this.like = defaults.like;
    	      this.limit = defaults.limit;
        }

        @CustomType.Setter
        public Builder databaseRoles(List<GetDatabaseRolesDatabaseRole> databaseRoles) {
            if (databaseRoles == null) {
              throw new MissingRequiredPropertyException("GetDatabaseRolesResult", "databaseRoles");
            }
            this.databaseRoles = databaseRoles;
            return this;
        }
        public Builder databaseRoles(GetDatabaseRolesDatabaseRole... databaseRoles) {
            return databaseRoles(List.of(databaseRoles));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabaseRolesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder inDatabase(String inDatabase) {
            if (inDatabase == null) {
              throw new MissingRequiredPropertyException("GetDatabaseRolesResult", "inDatabase");
            }
            this.inDatabase = inDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable GetDatabaseRolesLimit limit) {

            this.limit = limit;
            return this;
        }
        public GetDatabaseRolesResult build() {
            final var _resultValue = new GetDatabaseRolesResult();
            _resultValue.databaseRoles = databaseRoles;
            _resultValue.id = id;
            _resultValue.inDatabase = inDatabase;
            _resultValue.like = like;
            _resultValue.limit = limit;
            return _resultValue;
        }
    }
}
