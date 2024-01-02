// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamsPlainArgs Empty = new GetStreamsPlainArgs();

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

    private GetStreamsPlainArgs() {}

    private GetStreamsPlainArgs(GetStreamsPlainArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamsPlainArgs $;

        public Builder() {
            $ = new GetStreamsPlainArgs();
        }

        public Builder(GetStreamsPlainArgs defaults) {
            $ = new GetStreamsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(String database) {
            $.database = database;
            return this;
        }

        public Builder schema(String schema) {
            $.schema = schema;
            return this;
        }

        public GetStreamsPlainArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GetStreamsPlainArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("GetStreamsPlainArgs", "schema");
            }
            return $;
        }
    }

}
