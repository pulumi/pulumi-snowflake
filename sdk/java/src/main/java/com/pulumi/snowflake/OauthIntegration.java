// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.OauthIntegrationArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.OauthIntegrationState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.OauthIntegration;
 * import com.pulumi.snowflake.OauthIntegrationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tableauDesktop = new OauthIntegration("tableauDesktop", OauthIntegrationArgs.builder()
 *             .name("TABLEAU_DESKTOP")
 *             .oauthClient("TABLEAU_DESKTOP")
 *             .enabled(true)
 *             .oauthIssueRefreshTokens(true)
 *             .oauthRefreshTokenValidity(3600)
 *             .blockedRolesLists("SYSADMIN")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/oauthIntegration:OauthIntegration example name
 * ```
 * 
 */
@ResourceType(type="snowflake:index/oauthIntegration:OauthIntegration")
public class OauthIntegration extends com.pulumi.resources.CustomResource {
    /**
     * List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     * 
     */
    @Export(name="blockedRolesLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> blockedRolesLists;

    /**
     * @return List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     * 
     */
    public Output<Optional<List<String>>> blockedRolesLists() {
        return Codegen.optional(this.blockedRolesLists);
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
     * Date and time when the OAuth integration was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Date and time when the OAuth integration was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Specifies whether this OAuth integration is enabled or disabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether this OAuth integration is enabled or disabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the OAuth client type.
     * 
     */
    @Export(name="oauthClient", refs={String.class}, tree="[0]")
    private Output<String> oauthClient;

    /**
     * @return Specifies the OAuth client type.
     * 
     */
    public Output<String> oauthClient() {
        return this.oauthClient;
    }
    /**
     * Specifies the type of client being registered. Snowflake supports both confidential and public clients.
     * 
     */
    @Export(name="oauthClientType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthClientType;

    /**
     * @return Specifies the type of client being registered. Snowflake supports both confidential and public clients.
     * 
     */
    public Output<Optional<String>> oauthClientType() {
        return Codegen.optional(this.oauthClientType);
    }
    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     * 
     */
    @Export(name="oauthIssueRefreshTokens", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> oauthIssueRefreshTokens;

    /**
     * @return Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     * 
     */
    public Output<Optional<Boolean>> oauthIssueRefreshTokens() {
        return Codegen.optional(this.oauthIssueRefreshTokens);
    }
    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
    @Export(name="oauthRedirectUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthRedirectUri;

    /**
     * @return Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
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
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     * 
     */
    @Export(name="oauthUseSecondaryRoles", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthUseSecondaryRoles;

    /**
     * @return Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     * 
     */
    public Output<Optional<String>> oauthUseSecondaryRoles() {
        return Codegen.optional(this.oauthUseSecondaryRoles);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OauthIntegration(String name) {
        this(name, OauthIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OauthIntegration(String name, OauthIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OauthIntegration(String name, OauthIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/oauthIntegration:OauthIntegration", name, args == null ? OauthIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OauthIntegration(String name, Output<String> id, @Nullable OauthIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/oauthIntegration:OauthIntegration", name, state, makeResourceOptions(options, id));
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
    public static OauthIntegration get(String name, Output<String> id, @Nullable OauthIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OauthIntegration(name, id, state, options);
    }
}
