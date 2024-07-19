// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantState;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutput;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithAuthorizationCodeGrantShowOutput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/apiAuthenticationIntegrationWithAuthorizationCodeGrant:ApiAuthenticationIntegrationWithAuthorizationCodeGrant example &#34;name&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/apiAuthenticationIntegrationWithAuthorizationCodeGrant:ApiAuthenticationIntegrationWithAuthorizationCodeGrant")
public class ApiAuthenticationIntegrationWithAuthorizationCodeGrant extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the integration.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the integration.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutput.class}, tree="[0,1]")
    private Output<List<ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    public Output<List<ApiAuthenticationIntegrationWithAuthorizationCodeGrantDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * Specifies whether this security integration is enabled or disabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether this security integration is enabled or disabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Specifies the identifier (i.e. name) for the integration. This value must be unique in your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the integration. This value must be unique in your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     * 
     */
    @Export(name="oauthAccessTokenValidity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> oauthAccessTokenValidity;

    /**
     * @return Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     * 
     */
    public Output<Optional<Integer>> oauthAccessTokenValidity() {
        return Codegen.optional(this.oauthAccessTokenValidity);
    }
    /**
     * Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     * 
     */
    @Export(name="oauthAllowedScopes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> oauthAllowedScopes;

    /**
     * @return Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
     * 
     */
    public Output<Optional<List<String>>> oauthAllowedScopes() {
        return Codegen.optional(this.oauthAllowedScopes);
    }
    /**
     * Specifies the URL for authenticating to the external service. If removed from the config, the resource is recreated.
     * 
     */
    @Export(name="oauthAuthorizationEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthAuthorizationEndpoint;

    /**
     * @return Specifies the URL for authenticating to the external service. If removed from the config, the resource is recreated.
     * 
     */
    public Output<Optional<String>> oauthAuthorizationEndpoint() {
        return Codegen.optional(this.oauthAuthorizationEndpoint);
    }
    /**
     * Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     * 
     */
    @Export(name="oauthClientAuthMethod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthClientAuthMethod;

    /**
     * @return Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
     * 
     */
    public Output<Optional<String>> oauthClientAuthMethod() {
        return Codegen.optional(this.oauthClientAuthMethod);
    }
    /**
     * Specifies the client ID for the OAuth application in the external service.
     * 
     */
    @Export(name="oauthClientId", refs={String.class}, tree="[0]")
    private Output<String> oauthClientId;

    /**
     * @return Specifies the client ID for the OAuth application in the external service.
     * 
     */
    public Output<String> oauthClientId() {
        return this.oauthClientId;
    }
    /**
     * Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
     * 
     */
    @Export(name="oauthClientSecret", refs={String.class}, tree="[0]")
    private Output<String> oauthClientSecret;

    /**
     * @return Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
     * 
     */
    public Output<String> oauthClientSecret() {
        return this.oauthClientSecret;
    }
    /**
     * Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     * 
     */
    @Export(name="oauthRefreshTokenValidity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> oauthRefreshTokenValidity;

    /**
     * @return Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
     * 
     */
    public Output<Optional<Integer>> oauthRefreshTokenValidity() {
        return Codegen.optional(this.oauthRefreshTokenValidity);
    }
    /**
     * Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     * 
     */
    @Export(name="oauthTokenEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthTokenEndpoint;

    /**
     * @return Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
     * 
     */
    public Output<Optional<String>> oauthTokenEndpoint() {
        return Codegen.optional(this.oauthTokenEndpoint);
    }
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    @Export(name="showOutputs", refs={List.class,ApiAuthenticationIntegrationWithAuthorizationCodeGrantShowOutput.class}, tree="[0,1]")
    private Output<List<ApiAuthenticationIntegrationWithAuthorizationCodeGrantShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    public Output<List<ApiAuthenticationIntegrationWithAuthorizationCodeGrantShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiAuthenticationIntegrationWithAuthorizationCodeGrant(String name) {
        this(name, ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiAuthenticationIntegrationWithAuthorizationCodeGrant(String name, ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiAuthenticationIntegrationWithAuthorizationCodeGrant(String name, ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/apiAuthenticationIntegrationWithAuthorizationCodeGrant:ApiAuthenticationIntegrationWithAuthorizationCodeGrant", name, args == null ? ApiAuthenticationIntegrationWithAuthorizationCodeGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiAuthenticationIntegrationWithAuthorizationCodeGrant(String name, Output<String> id, @Nullable ApiAuthenticationIntegrationWithAuthorizationCodeGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/apiAuthenticationIntegrationWithAuthorizationCodeGrant:ApiAuthenticationIntegrationWithAuthorizationCodeGrant", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiAuthenticationIntegrationWithAuthorizationCodeGrant get(String name, Output<String> id, @Nullable ApiAuthenticationIntegrationWithAuthorizationCodeGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiAuthenticationIntegrationWithAuthorizationCodeGrant(name, id, state, options);
    }
}