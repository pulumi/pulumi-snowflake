// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SequenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SequenceArgs Empty = new SequenceArgs();

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
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    public Output<String> database() {
        return this.database;
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
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private SequenceArgs() {}

    private SequenceArgs(SequenceArgs $) {
        this.comment = $.comment;
        this.database = $.database;
        this.increment = $.increment;
        this.name = $.name;
        this.ordering = $.ordering;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SequenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SequenceArgs $;

        public Builder() {
            $ = new SequenceArgs();
        }

        public Builder(SequenceArgs defaults) {
            $ = new SequenceArgs(Objects.requireNonNull(defaults));
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
        public Builder database(Output<String> database) {
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
        public Builder schema(Output<String> schema) {
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

        public SequenceArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("SequenceArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("SequenceArgs", "schema");
            }
            return $;
        }
    }

}
