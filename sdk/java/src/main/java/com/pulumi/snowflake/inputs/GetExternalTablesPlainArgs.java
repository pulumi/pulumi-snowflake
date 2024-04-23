// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetExternalTablesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalTablesPlainArgs Empty = new GetExternalTablesPlainArgs();

    /**
     * The database from which to return the schemas from.
     * 
     */
    @Import(name="database", required=true)
    private String database;

    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }

    /**
     * The schema from which to return the external tables from.
     * 
     */
    @Import(name="schema", required=true)
    private String schema;

    /**
     * @return The schema from which to return the external tables from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    private GetExternalTablesPlainArgs() {}

    private GetExternalTablesPlainArgs(GetExternalTablesPlainArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalTablesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalTablesPlainArgs $;

        public Builder() {
            $ = new GetExternalTablesPlainArgs();
        }

        public Builder(GetExternalTablesPlainArgs defaults) {
            $ = new GetExternalTablesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database from which to return the schemas from.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            $.database = database;
            return this;
        }

        /**
         * @param schema The schema from which to return the external tables from.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            $.schema = schema;
            return this;
        }

        public GetExternalTablesPlainArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GetExternalTablesPlainArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("GetExternalTablesPlainArgs", "schema");
            }
            return $;
        }
    }

}
