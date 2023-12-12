// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemGenerateScimAccessTokenResult {
    /**
     * @return SCIM Access Token
     * 
     */
    private String accessToken;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return SCIM Integration Name
     * 
     */
    private String integrationName;

    private GetSystemGenerateScimAccessTokenResult() {}
    /**
     * @return SCIM Access Token
     * 
     */
    public String accessToken() {
        return this.accessToken;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return SCIM Integration Name
     * 
     */
    public String integrationName() {
        return this.integrationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemGenerateScimAccessTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessToken;
        private String id;
        private String integrationName;
        public Builder() {}
        public Builder(GetSystemGenerateScimAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.id = defaults.id;
    	      this.integrationName = defaults.integrationName;
        }

        @CustomType.Setter
        public Builder accessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder integrationName(String integrationName) {
            this.integrationName = Objects.requireNonNull(integrationName);
            return this;
        }
        public GetSystemGenerateScimAccessTokenResult build() {
            final var _resultValue = new GetSystemGenerateScimAccessTokenResult();
            _resultValue.accessToken = accessToken;
            _resultValue.id = id;
            _resultValue.integrationName = integrationName;
            return _resultValue;
        }
    }
}
