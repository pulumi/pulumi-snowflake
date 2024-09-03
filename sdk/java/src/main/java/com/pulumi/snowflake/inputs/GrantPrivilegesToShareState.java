// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantPrivilegesToShareState extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToShareState Empty = new GrantPrivilegesToShareState();

    /**
     * The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     * 
     */
    @Import(name="onAllTablesInSchema")
    private @Nullable Output<String> onAllTablesInSchema;

    /**
     * @return The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     * 
     */
    public Optional<Output<String>> onAllTablesInSchema() {
        return Optional.ofNullable(this.onAllTablesInSchema);
    }

    /**
     * The fully qualified name of the database on which privileges will be granted.
     * 
     */
    @Import(name="onDatabase")
    private @Nullable Output<String> onDatabase;

    /**
     * @return The fully qualified name of the database on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> onDatabase() {
        return Optional.ofNullable(this.onDatabase);
    }

    /**
     * The fully qualified name of the schema on which privileges will be granted.
     * 
     */
    @Import(name="onSchema")
    private @Nullable Output<String> onSchema;

    /**
     * @return The fully qualified name of the schema on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> onSchema() {
        return Optional.ofNullable(this.onSchema);
    }

    /**
     * The fully qualified name of the table on which privileges will be granted.
     * 
     */
    @Import(name="onTable")
    private @Nullable Output<String> onTable;

    /**
     * @return The fully qualified name of the table on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> onTable() {
        return Optional.ofNullable(this.onTable);
    }

    /**
     * The fully qualified name of the tag on which privileges will be granted.
     * 
     */
    @Import(name="onTag")
    private @Nullable Output<String> onTag;

    /**
     * @return The fully qualified name of the tag on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> onTag() {
        return Optional.ofNullable(this.onTag);
    }

    /**
     * The fully qualified name of the view on which privileges will be granted.
     * 
     */
    @Import(name="onView")
    private @Nullable Output<String> onView;

    /**
     * @return The fully qualified name of the view on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> onView() {
        return Optional.ofNullable(this.onView);
    }

    /**
     * The privileges to grant on the share. See available list of privileges: [https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax)
     * 
     */
    @Import(name="privileges")
    private @Nullable Output<List<String>> privileges;

    /**
     * @return The privileges to grant on the share. See available list of privileges: [https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax)
     * 
     */
    public Optional<Output<List<String>>> privileges() {
        return Optional.ofNullable(this.privileges);
    }

    /**
     * The fully qualified name of the share on which privileges will be granted.
     * 
     */
    @Import(name="toShare")
    private @Nullable Output<String> toShare;

    /**
     * @return The fully qualified name of the share on which privileges will be granted.
     * 
     */
    public Optional<Output<String>> toShare() {
        return Optional.ofNullable(this.toShare);
    }

    private GrantPrivilegesToShareState() {}

    private GrantPrivilegesToShareState(GrantPrivilegesToShareState $) {
        this.onAllTablesInSchema = $.onAllTablesInSchema;
        this.onDatabase = $.onDatabase;
        this.onSchema = $.onSchema;
        this.onTable = $.onTable;
        this.onTag = $.onTag;
        this.onView = $.onView;
        this.privileges = $.privileges;
        this.toShare = $.toShare;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToShareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToShareState $;

        public Builder() {
            $ = new GrantPrivilegesToShareState();
        }

        public Builder(GrantPrivilegesToShareState defaults) {
            $ = new GrantPrivilegesToShareState(Objects.requireNonNull(defaults));
        }

        /**
         * @param onAllTablesInSchema The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
         * 
         * @return builder
         * 
         */
        public Builder onAllTablesInSchema(@Nullable Output<String> onAllTablesInSchema) {
            $.onAllTablesInSchema = onAllTablesInSchema;
            return this;
        }

        /**
         * @param onAllTablesInSchema The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
         * 
         * @return builder
         * 
         */
        public Builder onAllTablesInSchema(String onAllTablesInSchema) {
            return onAllTablesInSchema(Output.of(onAllTablesInSchema));
        }

        /**
         * @param onDatabase The fully qualified name of the database on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onDatabase(@Nullable Output<String> onDatabase) {
            $.onDatabase = onDatabase;
            return this;
        }

        /**
         * @param onDatabase The fully qualified name of the database on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onDatabase(String onDatabase) {
            return onDatabase(Output.of(onDatabase));
        }

        /**
         * @param onSchema The fully qualified name of the schema on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onSchema(@Nullable Output<String> onSchema) {
            $.onSchema = onSchema;
            return this;
        }

        /**
         * @param onSchema The fully qualified name of the schema on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onSchema(String onSchema) {
            return onSchema(Output.of(onSchema));
        }

        /**
         * @param onTable The fully qualified name of the table on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onTable(@Nullable Output<String> onTable) {
            $.onTable = onTable;
            return this;
        }

        /**
         * @param onTable The fully qualified name of the table on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onTable(String onTable) {
            return onTable(Output.of(onTable));
        }

        /**
         * @param onTag The fully qualified name of the tag on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onTag(@Nullable Output<String> onTag) {
            $.onTag = onTag;
            return this;
        }

        /**
         * @param onTag The fully qualified name of the tag on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onTag(String onTag) {
            return onTag(Output.of(onTag));
        }

        /**
         * @param onView The fully qualified name of the view on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onView(@Nullable Output<String> onView) {
            $.onView = onView;
            return this;
        }

        /**
         * @param onView The fully qualified name of the view on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder onView(String onView) {
            return onView(Output.of(onView));
        }

        /**
         * @param privileges The privileges to grant on the share. See available list of privileges: [https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax)
         * 
         * @return builder
         * 
         */
        public Builder privileges(@Nullable Output<List<String>> privileges) {
            $.privileges = privileges;
            return this;
        }

        /**
         * @param privileges The privileges to grant on the share. See available list of privileges: [https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax)
         * 
         * @return builder
         * 
         */
        public Builder privileges(List<String> privileges) {
            return privileges(Output.of(privileges));
        }

        /**
         * @param privileges The privileges to grant on the share. See available list of privileges: [https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax)
         * 
         * @return builder
         * 
         */
        public Builder privileges(String... privileges) {
            return privileges(List.of(privileges));
        }

        /**
         * @param toShare The fully qualified name of the share on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder toShare(@Nullable Output<String> toShare) {
            $.toShare = toShare;
            return this;
        }

        /**
         * @param toShare The fully qualified name of the share on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder toShare(String toShare) {
            return toShare(Output.of(toShare));
        }

        public GrantPrivilegesToShareState build() {
            return $;
        }
    }

}
