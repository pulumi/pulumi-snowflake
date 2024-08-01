// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetCortexSearchServicesCortexSearchService;
import com.pulumi.snowflake.outputs.GetCortexSearchServicesIn;
import com.pulumi.snowflake.outputs.GetCortexSearchServicesLimit;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCortexSearchServicesResult {
    /**
     * @return Holds the output of SHOW CORTEX SEARCH SERVICES.
     * 
     */
    private List<GetCortexSearchServicesCortexSearchService> cortexSearchServices;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IN clause to filter the list of cortex search services.
     * 
     */
    private @Nullable GetCortexSearchServicesIn in;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    private @Nullable GetCortexSearchServicesLimit limit;
    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    private @Nullable String startsWith;

    private GetCortexSearchServicesResult() {}
    /**
     * @return Holds the output of SHOW CORTEX SEARCH SERVICES.
     * 
     */
    public List<GetCortexSearchServicesCortexSearchService> cortexSearchServices() {
        return this.cortexSearchServices;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IN clause to filter the list of cortex search services.
     * 
     */
    public Optional<GetCortexSearchServicesIn> in() {
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
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    public Optional<GetCortexSearchServicesLimit> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Filters the output with **case-sensitive** characters indicating the beginning of the object name.
     * 
     */
    public Optional<String> startsWith() {
        return Optional.ofNullable(this.startsWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCortexSearchServicesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCortexSearchServicesCortexSearchService> cortexSearchServices;
        private String id;
        private @Nullable GetCortexSearchServicesIn in;
        private @Nullable String like;
        private @Nullable GetCortexSearchServicesLimit limit;
        private @Nullable String startsWith;
        public Builder() {}
        public Builder(GetCortexSearchServicesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cortexSearchServices = defaults.cortexSearchServices;
    	      this.id = defaults.id;
    	      this.in = defaults.in;
    	      this.like = defaults.like;
    	      this.limit = defaults.limit;
    	      this.startsWith = defaults.startsWith;
        }

        @CustomType.Setter
        public Builder cortexSearchServices(List<GetCortexSearchServicesCortexSearchService> cortexSearchServices) {
            if (cortexSearchServices == null) {
              throw new MissingRequiredPropertyException("GetCortexSearchServicesResult", "cortexSearchServices");
            }
            this.cortexSearchServices = cortexSearchServices;
            return this;
        }
        public Builder cortexSearchServices(GetCortexSearchServicesCortexSearchService... cortexSearchServices) {
            return cortexSearchServices(List.of(cortexSearchServices));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCortexSearchServicesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder in(@Nullable GetCortexSearchServicesIn in) {

            this.in = in;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable GetCortexSearchServicesLimit limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder startsWith(@Nullable String startsWith) {

            this.startsWith = startsWith;
            return this;
        }
        public GetCortexSearchServicesResult build() {
            final var _resultValue = new GetCortexSearchServicesResult();
            _resultValue.cortexSearchServices = cortexSearchServices;
            _resultValue.id = id;
            _resultValue.in = in;
            _resultValue.like = like;
            _resultValue.limit = limit;
            _resultValue.startsWith = startsWith;
            return _resultValue;
        }
    }
}
