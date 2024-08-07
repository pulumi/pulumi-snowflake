// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemasInArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSchemasInArgs Empty = new GetSchemasInArgs();

    /**
     * Returns records for the entire account.
     * 
     */
    @Import(name="account")
    private @Nullable Output<Boolean> account;

    /**
     * @return Returns records for the entire account.
     * 
     */
    public Optional<Output<Boolean>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Returns records for the specified application.
     * 
     */
    @Import(name="application")
    private @Nullable Output<String> application;

    /**
     * @return Returns records for the specified application.
     * 
     */
    public Optional<Output<String>> application() {
        return Optional.ofNullable(this.application);
    }

    /**
     * Returns records for the specified application package.
     * 
     */
    @Import(name="applicationPackage")
    private @Nullable Output<String> applicationPackage;

    /**
     * @return Returns records for the specified application package.
     * 
     */
    public Optional<Output<String>> applicationPackage() {
        return Optional.ofNullable(this.applicationPackage);
    }

    /**
     * Returns records for the current database in use or for a specified database (db_name).
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Returns records for the current database in use or for a specified database (db_name).
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    private GetSchemasInArgs() {}

    private GetSchemasInArgs(GetSchemasInArgs $) {
        this.account = $.account;
        this.application = $.application;
        this.applicationPackage = $.applicationPackage;
        this.database = $.database;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemasInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemasInArgs $;

        public Builder() {
            $ = new GetSchemasInArgs();
        }

        public Builder(GetSchemasInArgs defaults) {
            $ = new GetSchemasInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account Returns records for the entire account.
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<Boolean> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Returns records for the entire account.
         * 
         * @return builder
         * 
         */
        public Builder account(Boolean account) {
            return account(Output.of(account));
        }

        /**
         * @param application Returns records for the specified application.
         * 
         * @return builder
         * 
         */
        public Builder application(@Nullable Output<String> application) {
            $.application = application;
            return this;
        }

        /**
         * @param application Returns records for the specified application.
         * 
         * @return builder
         * 
         */
        public Builder application(String application) {
            return application(Output.of(application));
        }

        /**
         * @param applicationPackage Returns records for the specified application package.
         * 
         * @return builder
         * 
         */
        public Builder applicationPackage(@Nullable Output<String> applicationPackage) {
            $.applicationPackage = applicationPackage;
            return this;
        }

        /**
         * @param applicationPackage Returns records for the specified application package.
         * 
         * @return builder
         * 
         */
        public Builder applicationPackage(String applicationPackage) {
            return applicationPackage(Output.of(applicationPackage));
        }

        /**
         * @param database Returns records for the current database in use or for a specified database (db_name).
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Returns records for the current database in use or for a specified database (db_name).
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        public GetSchemasInArgs build() {
            return $;
        }
    }

}
