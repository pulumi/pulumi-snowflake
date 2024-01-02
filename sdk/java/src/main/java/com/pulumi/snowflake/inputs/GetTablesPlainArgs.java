// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTablesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTablesPlainArgs Empty = new GetTablesPlainArgs();

    @Import(name="database", required=true)
    private String database;

    public String database() {
        return this.database;
    }

    @Import(name="schema", required=true)
    private String schema;

    public String schema() {
        return this.schema;
    }

    private GetTablesPlainArgs() {}

    private GetTablesPlainArgs(GetTablesPlainArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTablesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTablesPlainArgs $;

        public Builder() {
            $ = new GetTablesPlainArgs();
        }

        public Builder(GetTablesPlainArgs defaults) {
            $ = new GetTablesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(String database) {
            $.database = database;
            return this;
        }

        public Builder schema(String schema) {
            $.schema = schema;
            return this;
        }

        public GetTablesPlainArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GetTablesPlainArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("GetTablesPlainArgs", "schema");
            }
            return $;
        }
    }

}
