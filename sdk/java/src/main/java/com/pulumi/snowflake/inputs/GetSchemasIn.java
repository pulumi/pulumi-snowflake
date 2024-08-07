// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemasIn extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemasIn Empty = new GetSchemasIn();

    /**
     * Returns records for the entire account.
     * 
     */
    @Import(name="account")
    private @Nullable Boolean account;

    /**
     * @return Returns records for the entire account.
     * 
     */
    public Optional<Boolean> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Returns records for the specified application.
     * 
     */
    @Import(name="application")
    private @Nullable String application;

    /**
     * @return Returns records for the specified application.
     * 
     */
    public Optional<String> application() {
        return Optional.ofNullable(this.application);
    }

    /**
     * Returns records for the specified application package.
     * 
     */
    @Import(name="applicationPackage")
    private @Nullable String applicationPackage;

    /**
     * @return Returns records for the specified application package.
     * 
     */
    public Optional<String> applicationPackage() {
        return Optional.ofNullable(this.applicationPackage);
    }

    /**
     * Returns records for the current database in use or for a specified database (db_name).
     * 
     */
    @Import(name="database")
    private @Nullable String database;

    /**
     * @return Returns records for the current database in use or for a specified database (db_name).
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }

    private GetSchemasIn() {}

    private GetSchemasIn(GetSchemasIn $) {
        this.account = $.account;
        this.application = $.application;
        this.applicationPackage = $.applicationPackage;
        this.database = $.database;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemasIn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemasIn $;

        public Builder() {
            $ = new GetSchemasIn();
        }

        public Builder(GetSchemasIn defaults) {
            $ = new GetSchemasIn(Objects.requireNonNull(defaults));
        }

        /**
         * @param account Returns records for the entire account.
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Boolean account) {
            $.account = account;
            return this;
        }

        /**
         * @param application Returns records for the specified application.
         * 
         * @return builder
         * 
         */
        public Builder application(@Nullable String application) {
            $.application = application;
            return this;
        }

        /**
         * @param applicationPackage Returns records for the specified application package.
         * 
         * @return builder
         * 
         */
        public Builder applicationPackage(@Nullable String applicationPackage) {
            $.applicationPackage = applicationPackage;
            return this;
        }

        /**
         * @param database Returns records for the current database in use or for a specified database (db_name).
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable String database) {
            $.database = database;
            return this;
        }

        public GetSchemasIn build() {
            return $;
        }
    }

}
