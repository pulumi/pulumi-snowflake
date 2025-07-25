// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetStreamsIn;
import com.pulumi.snowflake.outputs.GetStreamsLimit;
import com.pulumi.snowflake.outputs.GetStreamsStream;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IN clause to filter the list of objects
     * 
     */
    private @Nullable GetStreamsIn in;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    private @Nullable GetStreamsLimit limit;
    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    private @Nullable String startsWith;
    /**
     * @return Holds the aggregated output of all streams details queries.
     * 
     */
    private List<GetStreamsStream> streams;
    /**
     * @return (Default: `true`) Runs DESC STREAM for each user returned by SHOW STREAMS. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    private @Nullable Boolean withDescribe;

    private GetStreamsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IN clause to filter the list of objects
     * 
     */
    public Optional<GetStreamsIn> in() {
        return Optional.ofNullable(this.in);
    }
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<String> like() {
        return Optional.ofNullable(this.like);
    }
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetStreamsLimit> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    public Optional<String> startsWith() {
        return Optional.ofNullable(this.startsWith);
    }
    /**
     * @return Holds the aggregated output of all streams details queries.
     * 
     */
    public List<GetStreamsStream> streams() {
        return this.streams;
    }
    /**
     * @return (Default: `true`) Runs DESC STREAM for each user returned by SHOW STREAMS. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable GetStreamsIn in;
        private @Nullable String like;
        private @Nullable GetStreamsLimit limit;
        private @Nullable String startsWith;
        private List<GetStreamsStream> streams;
        private @Nullable Boolean withDescribe;
        public Builder() {}
        public Builder(GetStreamsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.in = defaults.in;
    	      this.like = defaults.like;
    	      this.limit = defaults.limit;
    	      this.startsWith = defaults.startsWith;
    	      this.streams = defaults.streams;
    	      this.withDescribe = defaults.withDescribe;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder in(@Nullable GetStreamsIn in) {

            this.in = in;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable GetStreamsLimit limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder startsWith(@Nullable String startsWith) {

            this.startsWith = startsWith;
            return this;
        }
        @CustomType.Setter
        public Builder streams(List<GetStreamsStream> streams) {
            if (streams == null) {
              throw new MissingRequiredPropertyException("GetStreamsResult", "streams");
            }
            this.streams = streams;
            return this;
        }
        public Builder streams(GetStreamsStream... streams) {
            return streams(List.of(streams));
        }
        @CustomType.Setter
        public Builder withDescribe(@Nullable Boolean withDescribe) {

            this.withDescribe = withDescribe;
            return this;
        }
        public GetStreamsResult build() {
            final var _resultValue = new GetStreamsResult();
            _resultValue.id = id;
            _resultValue.in = in;
            _resultValue.like = like;
            _resultValue.limit = limit;
            _resultValue.startsWith = startsWith;
            _resultValue.streams = streams;
            _resultValue.withDescribe = withDescribe;
            return _resultValue;
        }
    }
}
