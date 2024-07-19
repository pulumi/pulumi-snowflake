// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs;
import com.pulumi.snowflake.inputs.ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiAuthenticationIntegrationWithClientCredentialsState extends com.pulumi.resources.ResourceArgs {

    public static final ApiAuthenticationIntegrationWithClientCredentialsState Empty = new ApiAuthenticationIntegrationWithClientCredentialsState();

    /**
     * Specifies a comment for the integration.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the integration.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    @Import(name="describeOutputs")
    private @Nullable Output<List<ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    public Optional<Output<List<ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs>>> describeOutputs() {
        return Optional.ofNullable(this.describeOutputs);
    }

    /**
     * Specifies whether this security integration is enabled or disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether this security integration is enabled or disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the identifier (i.e. name) for the integration. This value must be unique in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the integration. This value must be unique in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     * 
     */
    @Import(name="oauthAccessTokenValidity")
    private @Nullable Output<Integer> oauthAccessTokenValidity;

    /**
     * @return Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     * 
     */
    public Optional<Output<Integer>> oauthAccessTokenValidity() {
        return Optional.ofNullable(this.oauthAccessTokenValidity);
    }

    /**
     * Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     * 
     */
    @Import(name="oauthAllowedScopes")
    private @Nullable Output<List<String>> oauthAllowedScopes;

    /**
     * @return Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     * 
     */
    public Optional<Output<List<String>>> oauthAllowedScopes() {
        return Optional.ofNullable(this.oauthAllowedScopes);
    }

    /**
     * Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     * 
     */
    @Import(name="oauthClientAuthMethod")
    private @Nullable Output<String> oauthClientAuthMethod;

    /**
     * @return Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     * 
     */
    public Optional<Output<String>> oauthClientAuthMethod() {
        return Optional.ofNullable(this.oauthClientAuthMethod);
    }

    /**
     * Specifies the client ID for the OAuth application in the external service.
     * 
     */
    @Import(name="oauthClientId")
    private @Nullable Output<String> oauthClientId;

    /**
     * @return Specifies the client ID for the OAuth application in the external service.
     * 
     */
    public Optional<Output<String>> oauthClientId() {
        return Optional.ofNullable(this.oauthClientId);
    }

    /**
     * Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
     * 
     */
    @Import(name="oauthClientSecret")
    private @Nullable Output<String> oauthClientSecret;

    /**
     * @return Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
     * 
     */
    public Optional<Output<String>> oauthClientSecret() {
        return Optional.ofNullable(this.oauthClientSecret);
    }

    /**
     * Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     * 
     */
    @Import(name="oauthRefreshTokenValidity")
    private @Nullable Output<Integer> oauthRefreshTokenValidity;

    /**
     * @return Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     * 
     */
    public Optional<Output<Integer>> oauthRefreshTokenValidity() {
        return Optional.ofNullable(this.oauthRefreshTokenValidity);
    }

    /**
     * Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     * 
     */
    @Import(name="oauthTokenEndpoint")
    private @Nullable Output<String> oauthTokenEndpoint;

    /**
     * @return Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     * 
     */
    public Optional<Output<String>> oauthTokenEndpoint() {
        return Optional.ofNullable(this.oauthTokenEndpoint);
    }

    /**
     * Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    public Optional<Output<List<ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    private ApiAuthenticationIntegrationWithClientCredentialsState() {}

    private ApiAuthenticationIntegrationWithClientCredentialsState(ApiAuthenticationIntegrationWithClientCredentialsState $) {
        this.comment = $.comment;
        this.describeOutputs = $.describeOutputs;
        this.enabled = $.enabled;
        this.name = $.name;
        this.oauthAccessTokenValidity = $.oauthAccessTokenValidity;
        this.oauthAllowedScopes = $.oauthAllowedScopes;
        this.oauthClientAuthMethod = $.oauthClientAuthMethod;
        this.oauthClientId = $.oauthClientId;
        this.oauthClientSecret = $.oauthClientSecret;
        this.oauthRefreshTokenValidity = $.oauthRefreshTokenValidity;
        this.oauthTokenEndpoint = $.oauthTokenEndpoint;
        this.showOutputs = $.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiAuthenticationIntegrationWithClientCredentialsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiAuthenticationIntegrationWithClientCredentialsState $;

        public Builder() {
            $ = new ApiAuthenticationIntegrationWithClientCredentialsState();
        }

        public Builder(ApiAuthenticationIntegrationWithClientCredentialsState defaults) {
            $ = new ApiAuthenticationIntegrationWithClientCredentialsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(@Nullable Output<List<ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs>> describeOutputs) {
            $.describeOutputs = describeOutputs;
            return this;
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(List<ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs> describeOutputs) {
            return describeOutputs(Output.of(describeOutputs));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }

        /**
         * @param enabled Specifies whether this security integration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether this security integration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the identifier (i.e. name) for the integration. This value must be unique in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier (i.e. name) for the integration. This value must be unique in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oauthAccessTokenValidity Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
         * 
         * @return builder
         * 
         */
        public Builder oauthAccessTokenValidity(@Nullable Output<Integer> oauthAccessTokenValidity) {
            $.oauthAccessTokenValidity = oauthAccessTokenValidity;
            return this;
        }

        /**
         * @param oauthAccessTokenValidity Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
         * 
         * @return builder
         * 
         */
        public Builder oauthAccessTokenValidity(Integer oauthAccessTokenValidity) {
            return oauthAccessTokenValidity(Output.of(oauthAccessTokenValidity));
        }

        /**
         * @param oauthAllowedScopes Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
         * 
         * @return builder
         * 
         */
        public Builder oauthAllowedScopes(@Nullable Output<List<String>> oauthAllowedScopes) {
            $.oauthAllowedScopes = oauthAllowedScopes;
            return this;
        }

        /**
         * @param oauthAllowedScopes Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
         * 
         * @return builder
         * 
         */
        public Builder oauthAllowedScopes(List<String> oauthAllowedScopes) {
            return oauthAllowedScopes(Output.of(oauthAllowedScopes));
        }

        /**
         * @param oauthAllowedScopes Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
         * 
         * @return builder
         * 
         */
        public Builder oauthAllowedScopes(String... oauthAllowedScopes) {
            return oauthAllowedScopes(List.of(oauthAllowedScopes));
        }

        /**
         * @param oauthClientAuthMethod Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientAuthMethod(@Nullable Output<String> oauthClientAuthMethod) {
            $.oauthClientAuthMethod = oauthClientAuthMethod;
            return this;
        }

        /**
         * @param oauthClientAuthMethod Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientAuthMethod(String oauthClientAuthMethod) {
            return oauthClientAuthMethod(Output.of(oauthClientAuthMethod));
        }

        /**
         * @param oauthClientId Specifies the client ID for the OAuth application in the external service.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientId(@Nullable Output<String> oauthClientId) {
            $.oauthClientId = oauthClientId;
            return this;
        }

        /**
         * @param oauthClientId Specifies the client ID for the OAuth application in the external service.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientId(String oauthClientId) {
            return oauthClientId(Output.of(oauthClientId));
        }

        /**
         * @param oauthClientSecret Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientSecret(@Nullable Output<String> oauthClientSecret) {
            $.oauthClientSecret = oauthClientSecret;
            return this;
        }

        /**
         * @param oauthClientSecret Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientSecret(String oauthClientSecret) {
            return oauthClientSecret(Output.of(oauthClientSecret));
        }

        /**
         * @param oauthRefreshTokenValidity Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(@Nullable Output<Integer> oauthRefreshTokenValidity) {
            $.oauthRefreshTokenValidity = oauthRefreshTokenValidity;
            return this;
        }

        /**
         * @param oauthRefreshTokenValidity Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(Integer oauthRefreshTokenValidity) {
            return oauthRefreshTokenValidity(Output.of(oauthRefreshTokenValidity));
        }

        /**
         * @param oauthTokenEndpoint Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder oauthTokenEndpoint(@Nullable Output<String> oauthTokenEndpoint) {
            $.oauthTokenEndpoint = oauthTokenEndpoint;
            return this;
        }

        /**
         * @param oauthTokenEndpoint Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder oauthTokenEndpoint(String oauthTokenEndpoint) {
            return oauthTokenEndpoint(Output.of(oauthTokenEndpoint));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        public ApiAuthenticationIntegrationWithClientCredentialsState build() {
            return $;
        }
    }

}