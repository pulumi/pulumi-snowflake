// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList {
    private String default_;
    private String name;
    private String type;
    private String value;

    private GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList() {}
    public String default_() {
        return this.default_;
    }
    public String name() {
        return this.name;
    }
    public String type() {
        return this.type;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String default_;
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("default")
        public Builder default_(String default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList", "value");
            }
            this.value = value;
            return this;
        }
        public GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList build() {
            final var _resultValue = new GetSecurityIntegrationsSecurityIntegrationDescribeOutputExternalOauthAudienceList();
            _resultValue.default_ = default_;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
