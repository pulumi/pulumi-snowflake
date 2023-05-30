// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertsPlainArgs Empty = new GetAlertsPlainArgs();

    /**
     * The database from which to return the alerts from.
     * 
     */
    @Import(name="database")
    private @Nullable String database;

    /**
     * @return The database from which to return the alerts from.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Filters the command output by object name.
     * 
     */
    @Import(name="pattern")
    private @Nullable String pattern;

    /**
     * @return Filters the command output by object name.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * The schema from which to return the alerts from.
     * 
     */
    @Import(name="schema")
    private @Nullable String schema;

    /**
     * @return The schema from which to return the alerts from.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }

    private GetAlertsPlainArgs() {}

    private GetAlertsPlainArgs(GetAlertsPlainArgs $) {
        this.database = $.database;
        this.pattern = $.pattern;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertsPlainArgs $;

        public Builder() {
            $ = new GetAlertsPlainArgs();
        }

        public Builder(GetAlertsPlainArgs defaults) {
            $ = new GetAlertsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database from which to return the alerts from.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable String database) {
            $.database = database;
            return this;
        }

        /**
         * @param pattern Filters the command output by object name.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable String pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param schema The schema from which to return the alerts from.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable String schema) {
            $.schema = schema;
            return this;
        }

        public GetAlertsPlainArgs build() {
            return $;
        }
    }

}
