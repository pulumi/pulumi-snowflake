// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetExternalTablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalTablesArgs Empty = new GetExternalTablesArgs();

    @Import(name="database", required=true)
    private Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    @Import(name="schema", required=true)
    private Output<String> schema;

    public Output<String> schema() {
        return this.schema;
    }

    private GetExternalTablesArgs() {}

    private GetExternalTablesArgs(GetExternalTablesArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalTablesArgs $;

        public Builder() {
            $ = new GetExternalTablesArgs();
        }

        public Builder(GetExternalTablesArgs defaults) {
            $ = new GetExternalTablesArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public GetExternalTablesArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GetExternalTablesArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("GetExternalTablesArgs", "schema");
            }
            return $;
        }
    }

}
