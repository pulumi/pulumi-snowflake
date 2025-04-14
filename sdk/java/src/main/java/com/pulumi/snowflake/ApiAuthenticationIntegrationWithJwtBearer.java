// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ApiAuthenticationIntegrationWithJwtBearerArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ApiAuthenticationIntegrationWithJwtBearerState;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerDescribeOutput;
import com.pulumi.snowflake.outputs.ApiAuthenticationIntegrationWithJwtBearerShowOutput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer example &#39;&#34;&lt;integration_name&gt;&#34;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer")
public class ApiAuthenticationIntegrationWithJwtBearer extends com.pulumi.resources.CustomResource {
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
    @Export(name="describeOutputs", refs={List.class,ApiAuthenticationIntegrationWithJwtBearerDescribeOutput.class}, tree="[0,1]")
    private Output<List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    public Output<List<ApiAuthenticationIntegrationWithJwtBearerDescribeOutput>> describeOutputs() {
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
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Export(name="fullyQualifiedName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     * 
     */
    @Export(name="oauthAccessTokenValidity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> oauthAccessTokenValidity;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
     * 
     */
    public Output<Optional<Integer>> oauthAccessTokenValidity() {
        return Codegen.optional(this.oauthAccessTokenValidity);
    }
    @Export(name="oauthAssertionIssuer", refs={String.class}, tree="[0]")
    private Output<String> oauthAssertionIssuer;

    public Output<String> oauthAssertionIssuer() {
        return this.oauthAssertionIssuer;
    }
    /**
     * Specifies the URL for authenticating to the external service.
     * 
     */
    @Export(name="oauthAuthorizationEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthAuthorizationEndpoint;

    /**
     * @return Specifies the URL for authenticating to the external service.
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
    @Export(name="oauthClientSecret", refs={String.class}, tree="[0]")
    private Output<String> oauthClientSecret;

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
    @Export(name="showOutputs", refs={List.class,ApiAuthenticationIntegrationWithJwtBearerShowOutput.class}, tree="[0,1]")
    private Output<List<ApiAuthenticationIntegrationWithJwtBearerShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
     * 
     */
    public Output<List<ApiAuthenticationIntegrationWithJwtBearerShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiAuthenticationIntegrationWithJwtBearer(java.lang.String name) {
        this(name, ApiAuthenticationIntegrationWithJwtBearerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiAuthenticationIntegrationWithJwtBearer(java.lang.String name, ApiAuthenticationIntegrationWithJwtBearerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiAuthenticationIntegrationWithJwtBearer(java.lang.String name, ApiAuthenticationIntegrationWithJwtBearerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ApiAuthenticationIntegrationWithJwtBearer(java.lang.String name, Output<java.lang.String> id, @Nullable ApiAuthenticationIntegrationWithJwtBearerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/apiAuthenticationIntegrationWithJwtBearer:ApiAuthenticationIntegrationWithJwtBearer", name, state, makeResourceOptions(options, id), false);
    }

    private static ApiAuthenticationIntegrationWithJwtBearerArgs makeArgs(ApiAuthenticationIntegrationWithJwtBearerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApiAuthenticationIntegrationWithJwtBearerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static ApiAuthenticationIntegrationWithJwtBearer get(java.lang.String name, Output<java.lang.String> id, @Nullable ApiAuthenticationIntegrationWithJwtBearerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiAuthenticationIntegrationWithJwtBearer(name, id, state, options);
    }
}
