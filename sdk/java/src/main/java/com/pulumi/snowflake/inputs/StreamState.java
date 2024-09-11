// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamState extends com.pulumi.resources.ResourceArgs {

    public static final StreamState Empty = new StreamState();

    /**
     * Type of the stream that will be created.
     * 
     */
    @Import(name="appendOnly")
    private @Nullable Output<Boolean> appendOnly;

    /**
     * @return Type of the stream that will be created.
     * 
     */
    public Optional<Output<Boolean>> appendOnly() {
        return Optional.ofNullable(this.appendOnly);
    }

    /**
     * Specifies a comment for the stream.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the stream.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the stream.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the stream.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Create an insert only stream type.
     * 
     */
    @Import(name="insertOnly")
    private @Nullable Output<Boolean> insertOnly;

    /**
     * @return Create an insert only stream type.
     * 
     */
    public Optional<Output<Boolean>> insertOnly() {
        return Optional.ofNullable(this.insertOnly);
    }

    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies an identifier for the stage the stream will monitor.
     * 
     */
    @Import(name="onStage")
    private @Nullable Output<String> onStage;

    /**
     * @return Specifies an identifier for the stage the stream will monitor.
     * 
     */
    public Optional<Output<String>> onStage() {
        return Optional.ofNullable(this.onStage);
    }

    /**
     * Specifies an identifier for the table the stream will monitor.
     * 
     */
    @Import(name="onTable")
    private @Nullable Output<String> onTable;

    /**
     * @return Specifies an identifier for the table the stream will monitor.
     * 
     */
    public Optional<Output<String>> onTable() {
        return Optional.ofNullable(this.onTable);
    }

    /**
     * Specifies an identifier for the view the stream will monitor.
     * 
     */
    @Import(name="onView")
    private @Nullable Output<String> onView;

    /**
     * @return Specifies an identifier for the view the stream will monitor.
     * 
     */
    public Optional<Output<String>> onView() {
        return Optional.ofNullable(this.onView);
    }

    /**
     * Name of the role that owns the stream.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Name of the role that owns the stream.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The schema in which to create the stream.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the stream.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     * 
     */
    @Import(name="showInitialRows")
    private @Nullable Output<Boolean> showInitialRows;

    /**
     * @return Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     * 
     */
    public Optional<Output<Boolean>> showInitialRows() {
        return Optional.ofNullable(this.showInitialRows);
    }

    private StreamState() {}

    private StreamState(StreamState $) {
        this.appendOnly = $.appendOnly;
        this.comment = $.comment;
        this.database = $.database;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.insertOnly = $.insertOnly;
        this.name = $.name;
        this.onStage = $.onStage;
        this.onTable = $.onTable;
        this.onView = $.onView;
        this.owner = $.owner;
        this.schema = $.schema;
        this.showInitialRows = $.showInitialRows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamState $;

        public Builder() {
            $ = new StreamState();
        }

        public Builder(StreamState defaults) {
            $ = new StreamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appendOnly Type of the stream that will be created.
         * 
         * @return builder
         * 
         */
        public Builder appendOnly(@Nullable Output<Boolean> appendOnly) {
            $.appendOnly = appendOnly;
            return this;
        }

        /**
         * @param appendOnly Type of the stream that will be created.
         * 
         * @return builder
         * 
         */
        public Builder appendOnly(Boolean appendOnly) {
            return appendOnly(Output.of(appendOnly));
        }

        /**
         * @param comment Specifies a comment for the stream.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the stream.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the stream.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the stream.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param insertOnly Create an insert only stream type.
         * 
         * @return builder
         * 
         */
        public Builder insertOnly(@Nullable Output<Boolean> insertOnly) {
            $.insertOnly = insertOnly;
            return this;
        }

        /**
         * @param insertOnly Create an insert only stream type.
         * 
         * @return builder
         * 
         */
        public Builder insertOnly(Boolean insertOnly) {
            return insertOnly(Output.of(insertOnly));
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onStage Specifies an identifier for the stage the stream will monitor.
         * 
         * @return builder
         * 
         */
        public Builder onStage(@Nullable Output<String> onStage) {
            $.onStage = onStage;
            return this;
        }

        /**
         * @param onStage Specifies an identifier for the stage the stream will monitor.
         * 
         * @return builder
         * 
         */
        public Builder onStage(String onStage) {
            return onStage(Output.of(onStage));
        }

        /**
         * @param onTable Specifies an identifier for the table the stream will monitor.
         * 
         * @return builder
         * 
         */
        public Builder onTable(@Nullable Output<String> onTable) {
            $.onTable = onTable;
            return this;
        }

        /**
         * @param onTable Specifies an identifier for the table the stream will monitor.
         * 
         * @return builder
         * 
         */
        public Builder onTable(String onTable) {
            return onTable(Output.of(onTable));
        }

        /**
         * @param onView Specifies an identifier for the view the stream will monitor.
         * 
         * @return builder
         * 
         */
        public Builder onView(@Nullable Output<String> onView) {
            $.onView = onView;
            return this;
        }

        /**
         * @param onView Specifies an identifier for the view the stream will monitor.
         * 
         * @return builder
         * 
         */
        public Builder onView(String onView) {
            return onView(Output.of(onView));
        }

        /**
         * @param owner Name of the role that owns the stream.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Name of the role that owns the stream.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param schema The schema in which to create the stream.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the stream.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param showInitialRows Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
         * 
         * @return builder
         * 
         */
        public Builder showInitialRows(@Nullable Output<Boolean> showInitialRows) {
            $.showInitialRows = showInitialRows;
            return this;
        }

        /**
         * @param showInitialRows Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
         * 
         * @return builder
         * 
         */
        public Builder showInitialRows(Boolean showInitialRows) {
            return showInitialRows(Output.of(showInitialRows));
        }

        public StreamState build() {
            return $;
        }
    }

}
