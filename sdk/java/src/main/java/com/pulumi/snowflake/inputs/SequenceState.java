// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SequenceState extends com.pulumi.resources.ResourceArgs {

    public static final SequenceState Empty = new SequenceState();

    /**
     * (Default: ``) Specifies a comment for the sequence.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return (Default: ``) Specifies a comment for the sequence.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the sequence. Don&#39;t use the | character.
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
     * (Default: `1`) The amount the sequence will increase by each time it is used
     * 
     */
    @Import(name="increment")
    private @Nullable Output<Integer> increment;

    /**
     * @return (Default: `1`) The amount the sequence will increase by each time it is used
     * 
     */
    public Optional<Output<Integer>> increment() {
        return Optional.ofNullable(this.increment);
    }

    /**
     * Specifies the name for the sequence.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name for the sequence.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The increment sequence interval.
     * 
     */
    @Import(name="nextValue")
    private @Nullable Output<Integer> nextValue;

    /**
     * @return The increment sequence interval.
     * 
     */
    public Optional<Output<Integer>> nextValue() {
        return Optional.ofNullable(this.nextValue);
    }

    /**
     * (Default: `ORDER`) The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
     * 
     */
    @Import(name="ordering")
    private @Nullable Output<String> ordering;

    /**
     * @return (Default: `ORDER`) The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
     * 
     */
    public Optional<Output<String>> ordering() {
        return Optional.ofNullable(this.ordering);
    }

    /**
     * The schema in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private SequenceState() {}

    private SequenceState(SequenceState $) {
        this.comment = $.comment;
        this.database = $.database;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.increment = $.increment;
        this.name = $.name;
        this.nextValue = $.nextValue;
        this.ordering = $.ordering;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SequenceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SequenceState $;

        public Builder() {
            $ = new SequenceState();
        }

        public Builder(SequenceState defaults) {
            $ = new SequenceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment (Default: ``) Specifies a comment for the sequence.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment (Default: ``) Specifies a comment for the sequence.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the sequence. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the sequence. Don&#39;t use the | character.
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
         * @param increment (Default: `1`) The amount the sequence will increase by each time it is used
         * 
         * @return builder
         * 
         */
        public Builder increment(@Nullable Output<Integer> increment) {
            $.increment = increment;
            return this;
        }

        /**
         * @param increment (Default: `1`) The amount the sequence will increase by each time it is used
         * 
         * @return builder
         * 
         */
        public Builder increment(Integer increment) {
            return increment(Output.of(increment));
        }

        /**
         * @param name Specifies the name for the sequence.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name for the sequence.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nextValue The increment sequence interval.
         * 
         * @return builder
         * 
         */
        public Builder nextValue(@Nullable Output<Integer> nextValue) {
            $.nextValue = nextValue;
            return this;
        }

        /**
         * @param nextValue The increment sequence interval.
         * 
         * @return builder
         * 
         */
        public Builder nextValue(Integer nextValue) {
            return nextValue(Output.of(nextValue));
        }

        /**
         * @param ordering (Default: `ORDER`) The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
         * 
         * @return builder
         * 
         */
        public Builder ordering(@Nullable Output<String> ordering) {
            $.ordering = ordering;
            return this;
        }

        /**
         * @param ordering (Default: `ORDER`) The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
         * 
         * @return builder
         * 
         */
        public Builder ordering(String ordering) {
            return ordering(Output.of(ordering));
        }

        /**
         * @param schema The schema in which to create the sequence. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the sequence. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public SequenceState build() {
            return $;
        }
    }

}
