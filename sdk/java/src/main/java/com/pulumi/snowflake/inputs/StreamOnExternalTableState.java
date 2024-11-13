// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.StreamOnExternalTableAtArgs;
import com.pulumi.snowflake.inputs.StreamOnExternalTableBeforeArgs;
import com.pulumi.snowflake.inputs.StreamOnExternalTableDescribeOutputArgs;
import com.pulumi.snowflake.inputs.StreamOnExternalTableShowOutputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamOnExternalTableState extends com.pulumi.resources.ResourceArgs {

    public static final StreamOnExternalTableState Empty = new StreamOnExternalTableState();

    @Import(name="at")
    private @Nullable Output<StreamOnExternalTableAtArgs> at;

    public Optional<Output<StreamOnExternalTableAtArgs>> at() {
        return Optional.ofNullable(this.at);
    }

    @Import(name="before")
    private @Nullable Output<StreamOnExternalTableBeforeArgs> before;

    public Optional<Output<StreamOnExternalTableBeforeArgs>> before() {
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

    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     * 
     */
    @Import(name="copyGrants")
    private @Nullable Output<Boolean> copyGrants;

    /**
     * @return Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     * 
     */
    public Optional<Output<Boolean>> copyGrants() {
        return Optional.ofNullable(this.copyGrants);
    }

    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
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
    private @Nullable Output<List<StreamOnExternalTableDescribeOutputArgs>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    public Optional<Output<List<StreamOnExternalTableDescribeOutputArgs>>> describeOutputs() {
        return Optional.ofNullable(this.describeOutputs);
    }

    /**
     * Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="externalTable")
    private @Nullable Output<String> externalTable;

    /**
     * @return Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Optional<Output<String>> externalTable() {
        return Optional.ofNullable(this.externalTable);
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
     * Specifies whether this is an insert-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="insertOnly")
    private @Nullable Output<String> insertOnly;

    /**
     * @return Specifies whether this is an insert-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> insertOnly() {
        return Optional.ofNullable(this.insertOnly);
    }

    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<StreamOnExternalTableShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    public Optional<Output<List<StreamOnExternalTableShowOutputArgs>>> showOutputs() {
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

    private StreamOnExternalTableState() {}

    private StreamOnExternalTableState(StreamOnExternalTableState $) {
        this.at = $.at;
        this.before = $.before;
        this.comment = $.comment;
        this.copyGrants = $.copyGrants;
        this.database = $.database;
        this.describeOutputs = $.describeOutputs;
        this.externalTable = $.externalTable;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.insertOnly = $.insertOnly;
        this.name = $.name;
        this.schema = $.schema;
        this.showOutputs = $.showOutputs;
        this.stale = $.stale;
        this.streamType = $.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamOnExternalTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamOnExternalTableState $;

        public Builder() {
            $ = new StreamOnExternalTableState();
        }

        public Builder(StreamOnExternalTableState defaults) {
            $ = new StreamOnExternalTableState(Objects.requireNonNull(defaults));
        }

        public Builder at(@Nullable Output<StreamOnExternalTableAtArgs> at) {
            $.at = at;
            return this;
        }

        public Builder at(StreamOnExternalTableAtArgs at) {
            return at(Output.of(at));
        }

        public Builder before(@Nullable Output<StreamOnExternalTableBeforeArgs> before) {
            $.before = before;
            return this;
        }

        public Builder before(StreamOnExternalTableBeforeArgs before) {
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

        /**
         * @param copyGrants Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(@Nullable Output<Boolean> copyGrants) {
            $.copyGrants = copyGrants;
            return this;
        }

        /**
         * @param copyGrants Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(Boolean copyGrants) {
            return copyGrants(Output.of(copyGrants));
        }

        /**
         * @param database The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
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
        public Builder describeOutputs(@Nullable Output<List<StreamOnExternalTableDescribeOutputArgs>> describeOutputs) {
            $.describeOutputs = describeOutputs;
            return this;
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAM` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(List<StreamOnExternalTableDescribeOutputArgs> describeOutputs) {
            return describeOutputs(Output.of(describeOutputs));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAM` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(StreamOnExternalTableDescribeOutputArgs... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }

        /**
         * @param externalTable Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder externalTable(@Nullable Output<String> externalTable) {
            $.externalTable = externalTable;
            return this;
        }

        /**
         * @param externalTable Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder externalTable(String externalTable) {
            return externalTable(Output.of(externalTable));
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
         * @param insertOnly Specifies whether this is an insert-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder insertOnly(@Nullable Output<String> insertOnly) {
            $.insertOnly = insertOnly;
            return this;
        }

        /**
         * @param insertOnly Specifies whether this is an insert-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder insertOnly(String insertOnly) {
            return insertOnly(Output.of(insertOnly));
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMS` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<StreamOnExternalTableShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMS` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<StreamOnExternalTableShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMS` for the given stream.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(StreamOnExternalTableShowOutputArgs... showOutputs) {
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

        public StreamOnExternalTableState build() {
            return $;
        }
    }

}
