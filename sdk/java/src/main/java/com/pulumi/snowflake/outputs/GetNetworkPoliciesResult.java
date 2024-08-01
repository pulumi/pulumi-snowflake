// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetNetworkPoliciesNetworkPolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    private @Nullable String like;
    /**
     * @return Holds the aggregated output of all network policies details queries.
     * 
     */
    private List<GetNetworkPoliciesNetworkPolicy> networkPolicies;
    /**
     * @return Runs DESC NETWORK POLICY for each network policy returned by SHOW NETWORK POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    private @Nullable Boolean withDescribe;

    private GetNetworkPoliciesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<String> like() {
        return Optional.ofNullable(this.like);
    }
    /**
     * @return Holds the aggregated output of all network policies details queries.
     * 
     */
    public List<GetNetworkPoliciesNetworkPolicy> networkPolicies() {
        return this.networkPolicies;
    }
    /**
     * @return Runs DESC NETWORK POLICY for each network policy returned by SHOW NETWORK POLICIES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String like;
        private List<GetNetworkPoliciesNetworkPolicy> networkPolicies;
        private @Nullable Boolean withDescribe;
        public Builder() {}
        public Builder(GetNetworkPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.like = defaults.like;
    	      this.networkPolicies = defaults.networkPolicies;
    	      this.withDescribe = defaults.withDescribe;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworkPoliciesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder like(@Nullable String like) {

            this.like = like;
            return this;
        }
        @CustomType.Setter
        public Builder networkPolicies(List<GetNetworkPoliciesNetworkPolicy> networkPolicies) {
            if (networkPolicies == null) {
              throw new MissingRequiredPropertyException("GetNetworkPoliciesResult", "networkPolicies");
            }
            this.networkPolicies = networkPolicies;
            return this;
        }
        public Builder networkPolicies(GetNetworkPoliciesNetworkPolicy... networkPolicies) {
            return networkPolicies(List.of(networkPolicies));
        }
        @CustomType.Setter
        public Builder withDescribe(@Nullable Boolean withDescribe) {

            this.withDescribe = withDescribe;
            return this;
        }
        public GetNetworkPoliciesResult build() {
            final var _resultValue = new GetNetworkPoliciesResult();
            _resultValue.id = id;
            _resultValue.like = like;
            _resultValue.networkPolicies = networkPolicies;
            _resultValue.withDescribe = withDescribe;
            return _resultValue;
        }
    }
}
