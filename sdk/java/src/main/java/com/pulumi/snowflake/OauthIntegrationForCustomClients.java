// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.OauthIntegrationForCustomClientsArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsState;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutput;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsShowOutput;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/oauthIntegrationForCustomClients:OauthIntegrationForCustomClients example &#34;name&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/oauthIntegrationForCustomClients:OauthIntegrationForCustomClients")
public class OauthIntegrationForCustomClients extends com.pulumi.resources.CustomResource {
    /**
     * A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
     * 
     */
    @Export(name="blockedRolesLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> blockedRolesLists;

    /**
     * @return A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
     * 
     */
    public Output<List<String>> blockedRolesLists() {
        return this.blockedRolesLists;
    }
    /**
     * Specifies a comment for the OAuth integration.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the OAuth integration.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,OauthIntegrationForCustomClientsDescribeOutput.class}, tree="[0,1]")
    private Output<List<OauthIntegrationForCustomClientsDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Output<List<OauthIntegrationForCustomClientsDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="enabled", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enabled;

    /**
     * @return Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> enabled() {
        return Codegen.optional(this.enabled);
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
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies an existing network policy. This network policy controls network traffic that is attempting to exchange an authorization code for an access or refresh token or to use a refresh token to obtain a new access token.
     * 
     */
    @Export(name="networkPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkPolicy;

    /**
     * @return Specifies an existing network policy. This network policy controls network traffic that is attempting to exchange an authorization code for an access or refresh token or to use a refresh token to obtain a new access token.
     * 
     */
    public Output<Optional<String>> networkPolicy() {
        return Codegen.optional(this.networkPolicy);
    }
    /**
     * If true, allows setting oauth*redirect*uri to a URI not protected by TLS. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="oauthAllowNonTlsRedirectUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthAllowNonTlsRedirectUri;

    /**
     * @return If true, allows setting oauth*redirect*uri to a URI not protected by TLS. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> oauthAllowNonTlsRedirectUri() {
        return Codegen.optional(this.oauthAllowNonTlsRedirectUri);
    }
    @Export(name="oauthClientRsaPublicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthClientRsaPublicKey;

    public Output<Optional<String>> oauthClientRsaPublicKey() {
        return Codegen.optional(this.oauthClientRsaPublicKey);
    }
    @Export(name="oauthClientRsaPublicKey2", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthClientRsaPublicKey2;

    public Output<Optional<String>> oauthClientRsaPublicKey2() {
        return Codegen.optional(this.oauthClientRsaPublicKey2);
    }
    /**
     * Specifies the type of client being registered. Snowflake supports both confidential and public clients. Valid options are: `PUBLIC` | `CONFIDENTIAL`.
     * 
     */
    @Export(name="oauthClientType", refs={String.class}, tree="[0]")
    private Output<String> oauthClientType;

    /**
     * @return Specifies the type of client being registered. Snowflake supports both confidential and public clients. Valid options are: `PUBLIC` | `CONFIDENTIAL`.
     * 
     */
    public Output<String> oauthClientType() {
        return this.oauthClientType;
    }
    /**
     * Boolean that specifies whether Proof Key for Code Exchange (PKCE) should be required for the integration. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="oauthEnforcePkce", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthEnforcePkce;

    /**
     * @return Boolean that specifies whether Proof Key for Code Exchange (PKCE) should be required for the integration. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> oauthEnforcePkce() {
        return Codegen.optional(this.oauthEnforcePkce);
    }
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="oauthIssueRefreshTokens", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthIssueRefreshTokens;

    /**
     * @return Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> oauthIssueRefreshTokens() {
        return Codegen.optional(this.oauthIssueRefreshTokens);
    }
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
    @Export(name="oauthRedirectUri", refs={String.class}, tree="[0]")
    private Output<String> oauthRedirectUri;

    /**
     * @return Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
    public Output<String> oauthRedirectUri() {
        return this.oauthRedirectUri;
    }
    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    @Export(name="oauthRefreshTokenValidity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> oauthRefreshTokenValidity;

    /**
     * @return Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    public Output<Optional<Integer>> oauthRefreshTokenValidity() {
        return Codegen.optional(this.oauthRefreshTokenValidity);
    }
    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     * 
     */
    @Export(name="oauthUseSecondaryRoles", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthUseSecondaryRoles;

    /**
     * @return Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     * 
     */
    public Output<Optional<String>> oauthUseSecondaryRoles() {
        return Codegen.optional(this.oauthUseSecondaryRoles);
    }
    /**
     * A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
     * 
     */
    @Export(name="preAuthorizedRolesLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> preAuthorizedRolesLists;

    /**
     * @return A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
     * 
     */
    public Output<Optional<List<String>>> preAuthorizedRolesLists() {
        return Codegen.optional(this.preAuthorizedRolesLists);
    }
    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Export(name="showOutputs", refs={List.class,OauthIntegrationForCustomClientsShowOutput.class}, tree="[0,1]")
    private Output<List<OauthIntegrationForCustomClientsShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Output<List<OauthIntegrationForCustomClientsShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OauthIntegrationForCustomClients(java.lang.String name) {
        this(name, OauthIntegrationForCustomClientsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OauthIntegrationForCustomClients(java.lang.String name, OauthIntegrationForCustomClientsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OauthIntegrationForCustomClients(java.lang.String name, OauthIntegrationForCustomClientsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/oauthIntegrationForCustomClients:OauthIntegrationForCustomClients", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OauthIntegrationForCustomClients(java.lang.String name, Output<java.lang.String> id, @Nullable OauthIntegrationForCustomClientsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/oauthIntegrationForCustomClients:OauthIntegrationForCustomClients", name, state, makeResourceOptions(options, id), false);
    }

    private static OauthIntegrationForCustomClientsArgs makeArgs(OauthIntegrationForCustomClientsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OauthIntegrationForCustomClientsArgs.Empty : args;
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
    public static OauthIntegrationForCustomClients get(java.lang.String name, Output<java.lang.String> id, @Nullable OauthIntegrationForCustomClientsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OauthIntegrationForCustomClients(name, id, state, options);
    }
}
