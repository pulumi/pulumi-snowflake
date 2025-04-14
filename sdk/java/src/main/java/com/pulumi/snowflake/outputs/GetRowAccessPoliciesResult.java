// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetRowAccessPoliciesIn;
import com.pulumi.snowflake.outputs.GetRowAccessPoliciesLimit;
import com.pulumi.snowflake.outputs.GetRowAccessPoliciesRowAccessPolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRowAccessPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IN clause to filter the list of row access policies
     * 
     */
    private @Nullable GetRowAccessPoliciesIn in;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
     * 
     */
    private @Nullable GetRowAccessPoliciesLimit limit;
    /**
     * @return Holds the aggregated output of all views details queries.
     * 
     */
    private List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies;
    /**
     * @return (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    private @Nullable Boolean withDescribe;

    private GetRowAccessPoliciesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IN clause to filter the list of row access policies
     * 
     */
    public Optional<GetRowAccessPoliciesIn> in() {
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
    public Optional<GetRowAccessPoliciesLimit> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Holds the aggregated output of all views details queries.
     * 
     */
    public List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies() {
        return this.rowAccessPolicies;
    }
    /**
     * @return (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRowAccessPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable GetRowAccessPoliciesIn in;
        private @Nullable String like;
        private @Nullable GetRowAccessPoliciesLimit limit;
        private List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies;
        private @Nullable Boolean withDescribe;
        public Builder() {}
        public Builder(GetRowAccessPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.in = defaults.in;
    	      this.like = defaults.like;
    	      this.limit = defaults.limit;
    	      this.rowAccessPolicies = defaults.rowAccessPolicies;
    	      this.withDescribe = defaults.withDescribe;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRowAccessPoliciesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder in(@Nullable GetRowAccessPoliciesIn in) {

            this.in = in;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable GetRowAccessPoliciesLimit limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder rowAccessPolicies(List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies) {
            if (rowAccessPolicies == null) {
              throw new MissingRequiredPropertyException("GetRowAccessPoliciesResult", "rowAccessPolicies");
            }
            this.rowAccessPolicies = rowAccessPolicies;
            return this;
        }
        public Builder rowAccessPolicies(GetRowAccessPoliciesRowAccessPolicy... rowAccessPolicies) {
            return rowAccessPolicies(List.of(rowAccessPolicies));
        }
        @CustomType.Setter
        public Builder withDescribe(@Nullable Boolean withDescribe) {

            this.withDescribe = withDescribe;
            return this;
        }
        public GetRowAccessPoliciesResult build() {
            final var _resultValue = new GetRowAccessPoliciesResult();
            _resultValue.id = id;
            _resultValue.in = in;
            _resultValue.like = like;
            _resultValue.limit = limit;
            _resultValue.rowAccessPolicies = rowAccessPolicies;
            _resultValue.withDescribe = withDescribe;
            return _resultValue;
        }
    }
}
