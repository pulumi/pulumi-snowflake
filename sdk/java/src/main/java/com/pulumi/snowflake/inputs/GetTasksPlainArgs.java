// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTasksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTasksPlainArgs Empty = new GetTasksPlainArgs();

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

    private GetTasksPlainArgs() {}

    private GetTasksPlainArgs(GetTasksPlainArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTasksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTasksPlainArgs $;

        public Builder() {
            $ = new GetTasksPlainArgs();
        }

        public Builder(GetTasksPlainArgs defaults) {
            $ = new GetTasksPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(String database) {
            $.database = database;
            return this;
        }

        public Builder schema(String schema) {
            $.schema = schema;
            return this;
        }

        public GetTasksPlainArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
