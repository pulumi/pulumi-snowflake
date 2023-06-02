// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasesPlainArgs Empty = new GetDatabasesPlainArgs();

    /**
     * Optionally includes dropped databases that have not yet been purged The output also includes an additional `dropped_on` column
     * 
     */
    @Import(name="history")
    private @Nullable Boolean history;

    /**
     * @return Optionally includes dropped databases that have not yet been purged The output also includes an additional `dropped_on` column
     * 
     */
    public Optional<Boolean> history() {
        return Optional.ofNullable(this.history);
    }

    /**
     * Optionally filters the databases by a pattern
     * 
     */
    @Import(name="pattern")
    private @Nullable String pattern;

    /**
     * @return Optionally filters the databases by a pattern
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * Optionally filters the databases by a pattern
     * 
     */
    @Import(name="startsWith")
    private @Nullable String startsWith;

    /**
     * @return Optionally filters the databases by a pattern
     * 
     */
    public Optional<String> startsWith() {
        return Optional.ofNullable(this.startsWith);
    }

    /**
     * Optionally returns only the columns `created_on` and `name` in the results
     * 
     */
    @Import(name="terse")
    private @Nullable Boolean terse;

    /**
     * @return Optionally returns only the columns `created_on` and `name` in the results
     * 
     */
    public Optional<Boolean> terse() {
        return Optional.ofNullable(this.terse);
    }

    private GetDatabasesPlainArgs() {}

    private GetDatabasesPlainArgs(GetDatabasesPlainArgs $) {
        this.history = $.history;
        this.pattern = $.pattern;
        this.startsWith = $.startsWith;
        this.terse = $.terse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasesPlainArgs $;

        public Builder() {
            $ = new GetDatabasesPlainArgs();
        }

        public Builder(GetDatabasesPlainArgs defaults) {
            $ = new GetDatabasesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param history Optionally includes dropped databases that have not yet been purged The output also includes an additional `dropped_on` column
         * 
         * @return builder
         * 
         */
        public Builder history(@Nullable Boolean history) {
            $.history = history;
            return this;
        }

        /**
         * @param pattern Optionally filters the databases by a pattern
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable String pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param startsWith Optionally filters the databases by a pattern
         * 
         * @return builder
         * 
         */
        public Builder startsWith(@Nullable String startsWith) {
            $.startsWith = startsWith;
            return this;
        }

        /**
         * @param terse Optionally returns only the columns `created_on` and `name` in the results
         * 
         * @return builder
         * 
         */
        public Builder terse(@Nullable Boolean terse) {
            $.terse = terse;
            return this;
        }

        public GetDatabasesPlainArgs build() {
            return $;
        }
    }

}
