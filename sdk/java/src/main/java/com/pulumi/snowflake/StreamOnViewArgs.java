// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.StreamOnViewAtArgs;
import com.pulumi.snowflake.inputs.StreamOnViewBeforeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamOnViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamOnViewArgs Empty = new StreamOnViewArgs();

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
    private @Nullable Output<StreamOnViewAtArgs> at;

    public Optional<Output<StreamOnViewAtArgs>> at() {
        return Optional.ofNullable(this.at);
    }

    @Import(name="before")
    private @Nullable Output<StreamOnViewBeforeArgs> before;

    public Optional<Output<StreamOnViewBeforeArgs>> before() {
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
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    @Import(name="showInitialRows")
    private @Nullable Output<String> showInitialRows;

    public Optional<Output<String>> showInitialRows() {
        return Optional.ofNullable(this.showInitialRows);
    }

    /**
     * Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="view", required=true)
    private Output<String> view;

    /**
     * @return Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> view() {
        return this.view;
    }

    private StreamOnViewArgs() {}

    private StreamOnViewArgs(StreamOnViewArgs $) {
        this.appendOnly = $.appendOnly;
        this.at = $.at;
        this.before = $.before;
        this.comment = $.comment;
        this.copyGrants = $.copyGrants;
        this.database = $.database;
        this.name = $.name;
        this.schema = $.schema;
        this.showInitialRows = $.showInitialRows;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamOnViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamOnViewArgs $;

        public Builder() {
            $ = new StreamOnViewArgs();
        }

        public Builder(StreamOnViewArgs defaults) {
            $ = new StreamOnViewArgs(Objects.requireNonNull(defaults));
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

        public Builder at(@Nullable Output<StreamOnViewAtArgs> at) {
            $.at = at;
            return this;
        }

        public Builder at(StreamOnViewAtArgs at) {
            return at(Output.of(at));
        }

        public Builder before(@Nullable Output<StreamOnViewBeforeArgs> before) {
            $.before = before;
            return this;
        }

        public Builder before(StreamOnViewBeforeArgs before) {
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
         * @param database The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
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
         * @param view Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder view(Output<String> view) {
            $.view = view;
            return this;
        }

        /**
         * @param view Specifies an identifier for the view the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder view(String view) {
            return view(Output.of(view));
        }

        public StreamOnViewArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("StreamOnViewArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("StreamOnViewArgs", "schema");
            }
            if ($.view == null) {
                throw new MissingRequiredPropertyException("StreamOnViewArgs", "view");
            }
            return $;
        }
    }

}
