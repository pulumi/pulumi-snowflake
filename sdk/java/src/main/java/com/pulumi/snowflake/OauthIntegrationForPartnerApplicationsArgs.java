// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthIntegrationForPartnerApplicationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OauthIntegrationForPartnerApplicationsArgs Empty = new OauthIntegrationForPartnerApplicationsArgs();

    /**
     * A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
     * 
     */
    @Import(name="blockedRolesLists", required=true)
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
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the OAuth integration.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<String> enabled;

    /**
     * @return Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     * 
     */
    @Import(name="oauthClient", required=true)
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
    @Import(name="oauthIssueRefreshTokens")
    private @Nullable Output<String> oauthIssueRefreshTokens;

    /**
     * @return Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> oauthIssueRefreshTokens() {
        return Optional.ofNullable(this.oauthIssueRefreshTokens);
    }

    @Import(name="oauthRedirectUri")
    private @Nullable Output<String> oauthRedirectUri;

    public Optional<Output<String>> oauthRedirectUri() {
        return Optional.ofNullable(this.oauthRedirectUri);
    }

    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    @Import(name="oauthRefreshTokenValidity")
    private @Nullable Output<Integer> oauthRefreshTokenValidity;

    /**
     * @return Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    public Optional<Output<Integer>> oauthRefreshTokenValidity() {
        return Optional.ofNullable(this.oauthRefreshTokenValidity);
    }

    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     * 
     */
    @Import(name="oauthUseSecondaryRoles")
    private @Nullable Output<String> oauthUseSecondaryRoles;

    /**
     * @return Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
     * 
     */
    public Optional<Output<String>> oauthUseSecondaryRoles() {
        return Optional.ofNullable(this.oauthUseSecondaryRoles);
    }

    private OauthIntegrationForPartnerApplicationsArgs() {}

    private OauthIntegrationForPartnerApplicationsArgs(OauthIntegrationForPartnerApplicationsArgs $) {
        this.blockedRolesLists = $.blockedRolesLists;
        this.comment = $.comment;
        this.enabled = $.enabled;
        this.name = $.name;
        this.oauthClient = $.oauthClient;
        this.oauthIssueRefreshTokens = $.oauthIssueRefreshTokens;
        this.oauthRedirectUri = $.oauthRedirectUri;
        this.oauthRefreshTokenValidity = $.oauthRefreshTokenValidity;
        this.oauthUseSecondaryRoles = $.oauthUseSecondaryRoles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIntegrationForPartnerApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIntegrationForPartnerApplicationsArgs $;

        public Builder() {
            $ = new OauthIntegrationForPartnerApplicationsArgs();
        }

        public Builder(OauthIntegrationForPartnerApplicationsArgs defaults) {
            $ = new OauthIntegrationForPartnerApplicationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockedRolesLists A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(Output<List<String>> blockedRolesLists) {
            $.blockedRolesLists = blockedRolesLists;
            return this;
        }

        /**
         * @param blockedRolesLists A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(List<String> blockedRolesLists) {
            return blockedRolesLists(Output.of(blockedRolesLists));
        }

        /**
         * @param blockedRolesLists A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(String... blockedRolesLists) {
            return blockedRolesLists(List.of(blockedRolesLists));
        }

        /**
         * @param comment Specifies a comment for the OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param enabled Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<String> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder enabled(String enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oauthClient Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
         * 
         * @return builder
         * 
         */
        public Builder oauthClient(Output<String> oauthClient) {
            $.oauthClient = oauthClient;
            return this;
        }

        /**
         * @param oauthClient Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
         * 
         * @return builder
         * 
         */
        public Builder oauthClient(String oauthClient) {
            return oauthClient(Output.of(oauthClient));
        }

        /**
         * @param oauthIssueRefreshTokens Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthIssueRefreshTokens(@Nullable Output<String> oauthIssueRefreshTokens) {
            $.oauthIssueRefreshTokens = oauthIssueRefreshTokens;
            return this;
        }

        /**
         * @param oauthIssueRefreshTokens Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthIssueRefreshTokens(String oauthIssueRefreshTokens) {
            return oauthIssueRefreshTokens(Output.of(oauthIssueRefreshTokens));
        }

        public Builder oauthRedirectUri(@Nullable Output<String> oauthRedirectUri) {
            $.oauthRedirectUri = oauthRedirectUri;
            return this;
        }

        public Builder oauthRedirectUri(String oauthRedirectUri) {
            return oauthRedirectUri(Output.of(oauthRedirectUri));
        }

        /**
         * @param oauthRefreshTokenValidity Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(@Nullable Output<Integer> oauthRefreshTokenValidity) {
            $.oauthRefreshTokenValidity = oauthRefreshTokenValidity;
            return this;
        }

        /**
         * @param oauthRefreshTokenValidity Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(Integer oauthRefreshTokenValidity) {
            return oauthRefreshTokenValidity(Output.of(oauthRefreshTokenValidity));
        }

        /**
         * @param oauthUseSecondaryRoles Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder oauthUseSecondaryRoles(@Nullable Output<String> oauthUseSecondaryRoles) {
            $.oauthUseSecondaryRoles = oauthUseSecondaryRoles;
            return this;
        }

        /**
         * @param oauthUseSecondaryRoles Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: `IMPLICIT` | `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder oauthUseSecondaryRoles(String oauthUseSecondaryRoles) {
            return oauthUseSecondaryRoles(Output.of(oauthUseSecondaryRoles));
        }

        public OauthIntegrationForPartnerApplicationsArgs build() {
            if ($.blockedRolesLists == null) {
                throw new MissingRequiredPropertyException("OauthIntegrationForPartnerApplicationsArgs", "blockedRolesLists");
            }
            if ($.oauthClient == null) {
                throw new MissingRequiredPropertyException("OauthIntegrationForPartnerApplicationsArgs", "oauthClient");
            }
            return $;
        }
    }

}
