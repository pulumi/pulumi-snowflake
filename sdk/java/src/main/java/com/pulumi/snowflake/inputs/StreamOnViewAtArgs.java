// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamOnViewAtArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamOnViewAtArgs Empty = new StreamOnViewAtArgs();

    /**
     * Specifies the difference in seconds from the current time to use for Time Travel, in the form -N where N can be an integer or arithmetic expression (e.g. -120 is 120 seconds, -30*60 is 1800 seconds or 30 minutes).
     * 
     */
    @Import(name="offset")
    private @Nullable Output<String> offset;

    /**
     * @return Specifies the difference in seconds from the current time to use for Time Travel, in the form -N where N can be an integer or arithmetic expression (e.g. -120 is 120 seconds, -30*60 is 1800 seconds or 30 minutes).
     * 
     */
    public Optional<Output<String>> offset() {
        return Optional.ofNullable(this.offset);
    }

    /**
     * Specifies the query ID of a statement to use as the reference point for Time Travel. This parameter supports any statement of one of the following types: DML (e.g. INSERT, UPDATE, DELETE), TCL (BEGIN, COMMIT transaction), SELECT.
     * 
     */
    @Import(name="statement")
    private @Nullable Output<String> statement;

    /**
     * @return Specifies the query ID of a statement to use as the reference point for Time Travel. This parameter supports any statement of one of the following types: DML (e.g. INSERT, UPDATE, DELETE), TCL (BEGIN, COMMIT transaction), SELECT.
     * 
     */
    public Optional<Output<String>> statement() {
        return Optional.ofNullable(this.statement);
    }

    /**
     * Specifies the identifier (i.e. name) for an existing stream on the queried table or view. The current offset in the stream is used as the AT point in time for returning change data for the source object.
     * 
     */
    @Import(name="stream")
    private @Nullable Output<String> stream;

    /**
     * @return Specifies the identifier (i.e. name) for an existing stream on the queried table or view. The current offset in the stream is used as the AT point in time for returning change data for the source object.
     * 
     */
    public Optional<Output<String>> stream() {
        return Optional.ofNullable(this.stream);
    }

    /**
     * Specifies an exact date and time to use for Time Travel. The value must be explicitly cast to a TIMESTAMP, TIMESTAMP*LTZ, TIMESTAMP*NTZ, or TIMESTAMP_TZ data type.
     * 
     */
    @Import(name="timestamp")
    private @Nullable Output<String> timestamp;

    /**
     * @return Specifies an exact date and time to use for Time Travel. The value must be explicitly cast to a TIMESTAMP, TIMESTAMP*LTZ, TIMESTAMP*NTZ, or TIMESTAMP_TZ data type.
     * 
     */
    public Optional<Output<String>> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    private StreamOnViewAtArgs() {}

    private StreamOnViewAtArgs(StreamOnViewAtArgs $) {
        this.offset = $.offset;
        this.statement = $.statement;
        this.stream = $.stream;
        this.timestamp = $.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamOnViewAtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamOnViewAtArgs $;

        public Builder() {
            $ = new StreamOnViewAtArgs();
        }

        public Builder(StreamOnViewAtArgs defaults) {
            $ = new StreamOnViewAtArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offset Specifies the difference in seconds from the current time to use for Time Travel, in the form -N where N can be an integer or arithmetic expression (e.g. -120 is 120 seconds, -30*60 is 1800 seconds or 30 minutes).
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Output<String> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset Specifies the difference in seconds from the current time to use for Time Travel, in the form -N where N can be an integer or arithmetic expression (e.g. -120 is 120 seconds, -30*60 is 1800 seconds or 30 minutes).
         * 
         * @return builder
         * 
         */
        public Builder offset(String offset) {
            return offset(Output.of(offset));
        }

        /**
         * @param statement Specifies the query ID of a statement to use as the reference point for Time Travel. This parameter supports any statement of one of the following types: DML (e.g. INSERT, UPDATE, DELETE), TCL (BEGIN, COMMIT transaction), SELECT.
         * 
         * @return builder
         * 
         */
        public Builder statement(@Nullable Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement Specifies the query ID of a statement to use as the reference point for Time Travel. This parameter supports any statement of one of the following types: DML (e.g. INSERT, UPDATE, DELETE), TCL (BEGIN, COMMIT transaction), SELECT.
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param stream Specifies the identifier (i.e. name) for an existing stream on the queried table or view. The current offset in the stream is used as the AT point in time for returning change data for the source object.
         * 
         * @return builder
         * 
         */
        public Builder stream(@Nullable Output<String> stream) {
            $.stream = stream;
            return this;
        }

        /**
         * @param stream Specifies the identifier (i.e. name) for an existing stream on the queried table or view. The current offset in the stream is used as the AT point in time for returning change data for the source object.
         * 
         * @return builder
         * 
         */
        public Builder stream(String stream) {
            return stream(Output.of(stream));
        }

        /**
         * @param timestamp Specifies an exact date and time to use for Time Travel. The value must be explicitly cast to a TIMESTAMP, TIMESTAMP*LTZ, TIMESTAMP*NTZ, or TIMESTAMP_TZ data type.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(@Nullable Output<String> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param timestamp Specifies an exact date and time to use for Time Travel. The value must be explicitly cast to a TIMESTAMP, TIMESTAMP*LTZ, TIMESTAMP*NTZ, or TIMESTAMP_TZ data type.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(String timestamp) {
            return timestamp(Output.of(timestamp));
        }

        public StreamOnViewAtArgs build() {
            return $;
        }
    }

}