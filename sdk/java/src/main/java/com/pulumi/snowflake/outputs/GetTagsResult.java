// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetTagsIn;
import com.pulumi.snowflake.outputs.GetTagsTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTagsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IN clause to filter the list of objects
     * 
     */
    private @Nullable GetTagsIn in;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Holds the aggregated output of all tags details queries.
     * 
     */
    private List<GetTagsTag> tags;

    private GetTagsResult() {}
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
    public Optional<GetTagsIn> in() {
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
     * @return Holds the aggregated output of all tags details queries.
     * 
     */
    public List<GetTagsTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable GetTagsIn in;
        private @Nullable String like;
        private List<GetTagsTag> tags;
        public Builder() {}
        public Builder(GetTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.in = defaults.in;
    	      this.like = defaults.like;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTagsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder in(@Nullable GetTagsIn in) {

            this.in = in;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetTagsTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetTagsResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetTagsTag... tags) {
            return tags(List.of(tags));
        }
        public GetTagsResult build() {
            final var _resultValue = new GetTagsResult();
            _resultValue.id = id;
            _resultValue.in = in;
            _resultValue.like = like;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
