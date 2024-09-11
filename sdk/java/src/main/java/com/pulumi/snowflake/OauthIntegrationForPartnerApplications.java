// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.OauthIntegrationForPartnerApplicationsArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.OauthIntegrationForPartnerApplicationsState;
import com.pulumi.snowflake.outputs.OauthIntegrationForPartnerApplicationsDescribeOutput;
import com.pulumi.snowflake.outputs.OauthIntegrationForPartnerApplicationsShowOutput;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications example &#34;name&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications")
public class OauthIntegrationForPartnerApplications extends com.pulumi.resources.CustomResource {
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
    @Export(name="describeOutputs", refs={List.class,OauthIntegrationForPartnerApplicationsDescribeOutput.class}, tree="[0,1]")
    private Output<List<OauthIntegrationForPartnerApplicationsDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Output<List<OauthIntegrationForPartnerApplicationsDescribeOutput>> describeOutputs() {
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
     * Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     * 
     */
    @Export(name="oauthClient", refs={String.class}, tree="[0]")
    private Output<String> oauthClient;

    /**
     * @return Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     * 
     */
    public Output<String> oauthClient() {
        return this.oauthClient;
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
    @Export(name="oauthRedirectUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthRedirectUri;

    public Output<Optional<String>> oauthRedirectUri() {
        return Codegen.optional(this.oauthRedirectUri);
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
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Export(name="showOutputs", refs={List.class,OauthIntegrationForPartnerApplicationsShowOutput.class}, tree="[0,1]")
    private Output<List<OauthIntegrationForPartnerApplicationsShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Output<List<OauthIntegrationForPartnerApplicationsShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OauthIntegrationForPartnerApplications(java.lang.String name) {
        this(name, OauthIntegrationForPartnerApplicationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OauthIntegrationForPartnerApplications(java.lang.String name, OauthIntegrationForPartnerApplicationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OauthIntegrationForPartnerApplications(java.lang.String name, OauthIntegrationForPartnerApplicationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OauthIntegrationForPartnerApplications(java.lang.String name, Output<java.lang.String> id, @Nullable OauthIntegrationForPartnerApplicationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications", name, state, makeResourceOptions(options, id), false);
    }

    private static OauthIntegrationForPartnerApplicationsArgs makeArgs(OauthIntegrationForPartnerApplicationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OauthIntegrationForPartnerApplicationsArgs.Empty : args;
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
    public static OauthIntegrationForPartnerApplications get(java.lang.String name, Output<java.lang.String> id, @Nullable OauthIntegrationForPartnerApplicationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OauthIntegrationForPartnerApplications(name, id, state, options);
    }
}
