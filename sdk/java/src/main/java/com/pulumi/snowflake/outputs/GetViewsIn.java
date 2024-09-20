// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetViewsIn {
    /**
     * @return Returns records for the entire account.
     * 
     */
    private @Nullable Boolean account;
    /**
     * @return Returns records for the current database in use or for a specified database.
     * 
     */
    private @Nullable String database;
    /**
     * @return Returns records for the current schema in use or a specified schema. Use fully qualified name.
     * 
     */
    private @Nullable String schema;

    private GetViewsIn() {}
    /**
     * @return Returns records for the entire account.
     * 
     */
    public Optional<Boolean> account() {
        return Optional.ofNullable(this.account);
    }
    /**
     * @return Returns records for the current database in use or for a specified database.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * @return Returns records for the current schema in use or a specified schema. Use fully qualified name.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetViewsIn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean account;
        private @Nullable String database;
        private @Nullable String schema;
        public Builder() {}
        public Builder(GetViewsIn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.database = defaults.database;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder account(@Nullable Boolean account) {

            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder database(@Nullable String database) {

            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable String schema) {

            this.schema = schema;
            return this;
        }
        public GetViewsIn build() {
            final var _resultValue = new GetViewsIn();
            _resultValue.account = account;
            _resultValue.database = database;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}