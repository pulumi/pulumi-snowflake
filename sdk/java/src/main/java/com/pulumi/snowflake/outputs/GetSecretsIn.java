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
public final class GetSecretsIn {
    /**
     * @return Returns records for the entire account.
     * 
     */
    private @Nullable Boolean account;
    /**
     * @return Returns records for the specified application.
     * 
     */
    private @Nullable String application;
    /**
     * @return Returns records for the specified application package.
     * 
     */
    private @Nullable String applicationPackage;
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

    private GetSecretsIn() {}
    /**
     * @return Returns records for the entire account.
     * 
     */
    public Optional<Boolean> account() {
        return Optional.ofNullable(this.account);
    }
    /**
     * @return Returns records for the specified application.
     * 
     */
    public Optional<String> application() {
        return Optional.ofNullable(this.application);
    }
    /**
     * @return Returns records for the specified application package.
     * 
     */
    public Optional<String> applicationPackage() {
        return Optional.ofNullable(this.applicationPackage);
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

    public static Builder builder(GetSecretsIn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean account;
        private @Nullable String application;
        private @Nullable String applicationPackage;
        private @Nullable String database;
        private @Nullable String schema;
        public Builder() {}
        public Builder(GetSecretsIn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.application = defaults.application;
    	      this.applicationPackage = defaults.applicationPackage;
    	      this.database = defaults.database;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder account(@Nullable Boolean account) {

            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder application(@Nullable String application) {

            this.application = application;
            return this;
        }
        @CustomType.Setter
        public Builder applicationPackage(@Nullable String applicationPackage) {

            this.applicationPackage = applicationPackage;
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
        public GetSecretsIn build() {
            final var _resultValue = new GetSecretsIn();
            _resultValue.account = account;
            _resultValue.application = application;
            _resultValue.applicationPackage = applicationPackage;
            _resultValue.database = database;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
