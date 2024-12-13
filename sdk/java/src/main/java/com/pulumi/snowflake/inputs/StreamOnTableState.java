// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.StreamOnTableAtArgs;
import com.pulumi.snowflake.inputs.StreamOnTableBeforeArgs;
import com.pulumi.snowflake.inputs.StreamOnTableDescribeOutputArgs;
import com.pulumi.snowflake.inputs.StreamOnTableShowOutputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamOnTableState extends com.pulumi.resources.ResourceArgs {

    public static final StreamOnTableState Empty = new StreamOnTableState();

    /**
     * Specifies whether this is an append-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="appendOnly")
    private @Nullable Output<String> appendOnly;

    /**
     * @return Specifies whether this is an append-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> appendOnly() {
        return Optional.ofNullable(this.appendOnly);
    }

    @Import(name="at")
    private @Nullable Output<StreamOnTableAtArgs> at;

    public Optional<Output<StreamOnTableAtArgs>> at() {
        return Optional.ofNullable(this.at);
    }

    @Import(name="before")
    private @Nullable Output<StreamOnTableBeforeArgs> before;

    public Optional<Output<StreamOnTableBeforeArgs>> before() {
        return Optional.ofNullable(this.before);
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

    @Import(name="copyGrants")
    private @Nullable Output<Boolean> copyGrants;

    public Optional<Output<Boolean>> copyGrants() {
        return Optional.ofNullable(this.copyGrants);
    }

    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    @Import(name="describeOutputs")
    private @Nullable Output<List<StreamOnTableDescribeOutputArgs>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    public Optional<Output<List<StreamOnTableDescribeOutputArgs>>> describeOutputs() {
        return Optional.ofNullable(this.describeOutputs);
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
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    @Import(name="showInitialRows")
    private @Nullable Output<String> showInitialRows;

    public Optional<Output<String>> showInitialRows() {
        return Optional.ofNullable(this.showInitialRows);
    }

    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<StreamOnTableShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    public Optional<Output<List<StreamOnTableShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    @Import(name="stale")
    private @Nullable Output<Boolean> stale;

    public Optional<Output<Boolean>> stale() {
        return Optional.ofNullable(this.stale);
    }

    /**
     * Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
     * 
     */
    @Import(name="streamType")
    private @Nullable Output<String> streamType;

    /**
     * @return Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
     * 
     */
    public Optional<Output<String>> streamType() {
        return Optional.ofNullable(this.streamType);
    }

    /**
     * Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`. For more information about this resource, see docs.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private StreamOnTableState() {}

    private StreamOnTableState(StreamOnTableState $) {
        this.appendOnly = $.appendOnly;
        this.at = $.at;
        this.before = $.before;
        this.comment = $.comment;
        this.copyGrants = $.copyGrants;
        this.database = $.database;
        this.describeOutputs = $.describeOutputs;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.name = $.name;
        this.schema = $.schema;
        this.showInitialRows = $.showInitialRows;
        this.showOutputs = $.showOutputs;
        this.stale = $.stale;
        this.streamType = $.streamType;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamOnTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamOnTableState $;

        public Builder() {
            $ = new StreamOnTableState();
        }

        public Builder(StreamOnTableState defaults) {
            $ = new StreamOnTableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appendOnly Specifies whether this is an append-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder appendOnly(@Nullable Output<String> appendOnly) {
            $.appendOnly = appendOnly;
            return this;
        }

        /**
         * @param appendOnly Specifies whether this is an append-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder appendOnly(String appendOnly) {
            return appendOnly(Output.of(appendOnly));
        }

        public Builder at(@Nullable Output<StreamOnTableAtArgs> at) {
            $.at = at;
            return this;
        }

        public Builder at(StreamOnTableAtArgs at) {
            return at(Output.of(at));
        }

        public Builder before(@Nullable Output<StreamOnTableBeforeArgs> before) {
            $.before = before;
            return this;
        }

        public Builder before(StreamOnTableBeforeArgs before) {
            return before(Output.of(before));
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

        public Builder copyGrants(@Nullable Output<Boolean> copyGrants) {
            $.copyGrants = copyGrants;
            return this;
        }

        public Builder copyGrants(Boolean copyGrants) {
            return copyGrants(Output.of(copyGrants));
        }

        /**
         * @param database The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAM` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(@Nullable Output<List<StreamOnTableDescribeOutputArgs>> describeOutputs) {
            $.describeOutputs = describeOutputs;
            return this;
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAM` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(List<StreamOnTableDescribeOutputArgs> describeOutputs) {
            return describeOutputs(Output.of(describeOutputs));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAM` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(StreamOnTableDescribeOutputArgs... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
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
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public Builder showInitialRows(@Nullable Output<String> showInitialRows) {
            $.showInitialRows = showInitialRows;
            return this;
        }

        public Builder showInitialRows(String showInitialRows) {
            return showInitialRows(Output.of(showInitialRows));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMS` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<StreamOnTableShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMS` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<StreamOnTableShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMS` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(StreamOnTableShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        public Builder stale(@Nullable Output<Boolean> stale) {
            $.stale = stale;
            return this;
        }

        public Builder stale(Boolean stale) {
            return stale(Output.of(stale));
        }

        /**
         * @param streamType Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
         * 
         * @return builder
         * 
         */
        public Builder streamType(@Nullable Output<String> streamType) {
            $.streamType = streamType;
            return this;
        }

        /**
         * @param streamType Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
         * 
         * @return builder
         * 
         */
        public Builder streamType(String streamType) {
            return streamType(Output.of(streamType));
        }

        /**
         * @param table Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public StreamOnTableState build() {
            return $;
        }
    }

}
