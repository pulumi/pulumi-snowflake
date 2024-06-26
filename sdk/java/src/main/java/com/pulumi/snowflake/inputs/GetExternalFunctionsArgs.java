// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalFunctionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalFunctionsArgs Empty = new GetExternalFunctionsArgs();

    /**
     * The database from which to return the schemas from.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The schema from which to return the external functions from.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema from which to return the external functions from.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private GetExternalFunctionsArgs() {}

    private GetExternalFunctionsArgs(GetExternalFunctionsArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalFunctionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalFunctionsArgs $;

        public Builder() {
            $ = new GetExternalFunctionsArgs();
        }

        public Builder(GetExternalFunctionsArgs defaults) {
            $ = new GetExternalFunctionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database from which to return the schemas from.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database from which to return the schemas from.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param schema The schema from which to return the external functions from.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema from which to return the external functions from.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public GetExternalFunctionsArgs build() {
            return $;
        }
    }

}
