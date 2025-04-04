// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExecuteState extends com.pulumi.resources.ResourceArgs {

    public static final ExecuteState Empty = new ExecuteState();

    /**
     * SQL statement to execute. Forces recreation of resource on change.
     * 
     */
    @Import(name="execute")
    private @Nullable Output<String> execute;

    /**
     * @return SQL statement to execute. Forces recreation of resource on change.
     * 
     */
    public Optional<Output<String>> execute() {
        return Optional.ofNullable(this.execute);
    }

    /**
     * Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
     * 
     */
    @Import(name="queryResults")
    private @Nullable Output<List<Map<String,String>>> queryResults;

    /**
     * @return List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
     * 
     */
    public Optional<Output<List<Map<String,String>>>> queryResults() {
        return Optional.ofNullable(this.queryResults);
    }

    /**
     * SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     * 
     */
    @Import(name="revert")
    private @Nullable Output<String> revert;

    /**
     * @return SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     * 
     */
    public Optional<Output<String>> revert() {
        return Optional.ofNullable(this.revert);
    }

    private ExecuteState() {}

    private ExecuteState(ExecuteState $) {
        this.execute = $.execute;
        this.query = $.query;
        this.queryResults = $.queryResults;
        this.revert = $.revert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecuteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecuteState $;

        public Builder() {
            $ = new ExecuteState();
        }

        public Builder(ExecuteState defaults) {
            $ = new ExecuteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param execute SQL statement to execute. Forces recreation of resource on change.
         * 
         * @return builder
         * 
         */
        public Builder execute(@Nullable Output<String> execute) {
            $.execute = execute;
            return this;
        }

        /**
         * @param execute SQL statement to execute. Forces recreation of resource on change.
         * 
         * @return builder
         * 
         */
        public Builder execute(String execute) {
            return execute(Output.of(execute));
        }

        /**
         * @param query Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param queryResults List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
         * 
         * @return builder
         * 
         */
        public Builder queryResults(@Nullable Output<List<Map<String,String>>> queryResults) {
            $.queryResults = queryResults;
            return this;
        }

        /**
         * @param queryResults List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
         * 
         * @return builder
         * 
         */
        public Builder queryResults(List<Map<String,String>> queryResults) {
            return queryResults(Output.of(queryResults));
        }

        /**
         * @param queryResults List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
         * 
         * @return builder
         * 
         */
        public Builder queryResults(Map<String,String>... queryResults) {
            return queryResults(List.of(queryResults));
        }

        /**
         * @param revert SQL statement to revert the execute statement. Invoked when resource is being destroyed.
         * 
         * @return builder
         * 
         */
        public Builder revert(@Nullable Output<String> revert) {
            $.revert = revert;
            return this;
        }

        /**
         * @param revert SQL statement to revert the execute statement. Invoked when resource is being destroyed.
         * 
         * @return builder
         * 
         */
        public Builder revert(String revert) {
            return revert(Output.of(revert));
        }

        public ExecuteState build() {
            return $;
        }
    }

}
