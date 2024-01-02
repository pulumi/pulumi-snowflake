// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCurrentAccountResult {
    /**
     * @return The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
     * 
     */
    private String account;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Snowflake Region; as returned by CURRENT_REGION()
     * 
     */
    private String region;
    /**
     * @return The Snowflake URL.
     * 
     */
    private String url;

    private GetCurrentAccountResult() {}
    /**
     * @return The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
     * 
     */
    public String account() {
        return this.account;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Snowflake Region; as returned by CURRENT_REGION()
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The Snowflake URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String account;
        private String id;
        private String region;
        private String url;
        public Builder() {}
        public Builder(GetCurrentAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder account(String account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetCurrentAccountResult", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCurrentAccountResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetCurrentAccountResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetCurrentAccountResult", "url");
            }
            this.url = url;
            return this;
        }
        public GetCurrentAccountResult build() {
            final var _resultValue = new GetCurrentAccountResult();
            _resultValue.account = account;
            _resultValue.id = id;
            _resultValue.region = region;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
