// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetSharesShare;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSharesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Filters the command output by object name.
     * 
     */
    private @Nullable String pattern;
    /**
     * @return List of all the shares available in the system.
     * 
     */
    private List<GetSharesShare> shares;

    private GetSharesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Filters the command output by object name.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    /**
     * @return List of all the shares available in the system.
     * 
     */
    public List<GetSharesShare> shares() {
        return this.shares;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String pattern;
        private List<GetSharesShare> shares;
        public Builder() {}
        public Builder(GetSharesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.pattern = defaults.pattern;
    	      this.shares = defaults.shares;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder pattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }
        @CustomType.Setter
        public Builder shares(List<GetSharesShare> shares) {
            this.shares = Objects.requireNonNull(shares);
            return this;
        }
        public Builder shares(GetSharesShare... shares) {
            return shares(List.of(shares));
        }
        public GetSharesResult build() {
            final var _resultValue = new GetSharesResult();
            _resultValue.id = id;
            _resultValue.pattern = pattern;
            _resultValue.shares = shares;
            return _resultValue;
        }
    }
}
