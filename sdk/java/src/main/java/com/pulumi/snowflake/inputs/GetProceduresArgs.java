// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProceduresArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProceduresArgs Empty = new GetProceduresArgs();

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

    private GetProceduresArgs() {}

    private GetProceduresArgs(GetProceduresArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProceduresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProceduresArgs $;

        public Builder() {
            $ = new GetProceduresArgs();
        }

        public Builder(GetProceduresArgs defaults) {
            $ = new GetProceduresArgs(Objects.requireNonNull(defaults));
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

        public GetProceduresArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
