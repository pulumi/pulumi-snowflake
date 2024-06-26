// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGrantsFutureGrantsInArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGrantsFutureGrantsInArgs Empty = new GetGrantsFutureGrantsInArgs();

    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role. Schema must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;schema*name&amp;gt;&#34;).
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role. Schema must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;schema*name&amp;gt;&#34;).
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private GetGrantsFutureGrantsInArgs() {}

    private GetGrantsFutureGrantsInArgs(GetGrantsFutureGrantsInArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGrantsFutureGrantsInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGrantsFutureGrantsInArgs $;

        public Builder() {
            $ = new GetGrantsFutureGrantsInArgs();
        }

        public Builder(GetGrantsFutureGrantsInArgs defaults) {
            $ = new GetGrantsFutureGrantsInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param schema Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role. Schema must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;schema*name&amp;gt;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role. Schema must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;schema*name&amp;gt;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public GetGrantsFutureGrantsInArgs build() {
            return $;
        }
    }

}
