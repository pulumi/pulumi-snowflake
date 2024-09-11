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


public final class OauthIntegrationForCustomClientsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OauthIntegrationForCustomClientsArgs Empty = new OauthIntegrationForCustomClientsArgs();

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
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies an existing network policy. This network policy controls network traffic that is attempting to exchange an authorization code for an access or refresh token or to use a refresh token to obtain a new access token.
     * 
     */
    @Import(name="networkPolicy")
    private @Nullable Output<String> networkPolicy;

    /**
     * @return Specifies an existing network policy. This network policy controls network traffic that is attempting to exchange an authorization code for an access or refresh token or to use a refresh token to obtain a new access token.
     * 
     */
    public Optional<Output<String>> networkPolicy() {
        return Optional.ofNullable(this.networkPolicy);
    }

    /**
     * If true, allows setting oauth*redirect*uri to a URI not protected by TLS. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="oauthAllowNonTlsRedirectUri")
    private @Nullable Output<String> oauthAllowNonTlsRedirectUri;

    /**
     * @return If true, allows setting oauth*redirect*uri to a URI not protected by TLS. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> oauthAllowNonTlsRedirectUri() {
        return Optional.ofNullable(this.oauthAllowNonTlsRedirectUri);
    }

    @Import(name="oauthClientRsaPublicKey")
    private @Nullable Output<String> oauthClientRsaPublicKey;

    public Optional<Output<String>> oauthClientRsaPublicKey() {
        return Optional.ofNullable(this.oauthClientRsaPublicKey);
    }

    @Import(name="oauthClientRsaPublicKey2")
    private @Nullable Output<String> oauthClientRsaPublicKey2;

    public Optional<Output<String>> oauthClientRsaPublicKey2() {
        return Optional.ofNullable(this.oauthClientRsaPublicKey2);
    }

    /**
     * Specifies the type of client being registered. Snowflake supports both confidential and public clients. Valid options are: `PUBLIC` | `CONFIDENTIAL`.
     * 
     */
    @Import(name="oauthClientType", required=true)
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
    @Import(name="oauthEnforcePkce")
    private @Nullable Output<String> oauthEnforcePkce;

    /**
     * @return Boolean that specifies whether Proof Key for Code Exchange (PKCE) should be required for the integration. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> oauthEnforcePkce() {
        return Optional.ofNullable(this.oauthEnforcePkce);
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

    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
    @Import(name="oauthRedirectUri", required=true)
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

    /**
     * A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
     * 
     */
    @Import(name="preAuthorizedRolesLists")
    private @Nullable Output<List<String>> preAuthorizedRolesLists;

    /**
     * @return A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
     * 
     */
    public Optional<Output<List<String>>> preAuthorizedRolesLists() {
        return Optional.ofNullable(this.preAuthorizedRolesLists);
    }

    private OauthIntegrationForCustomClientsArgs() {}

    private OauthIntegrationForCustomClientsArgs(OauthIntegrationForCustomClientsArgs $) {
        this.blockedRolesLists = $.blockedRolesLists;
        this.comment = $.comment;
        this.enabled = $.enabled;
        this.name = $.name;
        this.networkPolicy = $.networkPolicy;
        this.oauthAllowNonTlsRedirectUri = $.oauthAllowNonTlsRedirectUri;
        this.oauthClientRsaPublicKey = $.oauthClientRsaPublicKey;
        this.oauthClientRsaPublicKey2 = $.oauthClientRsaPublicKey2;
        this.oauthClientType = $.oauthClientType;
        this.oauthEnforcePkce = $.oauthEnforcePkce;
        this.oauthIssueRefreshTokens = $.oauthIssueRefreshTokens;
        this.oauthRedirectUri = $.oauthRedirectUri;
        this.oauthRefreshTokenValidity = $.oauthRefreshTokenValidity;
        this.oauthUseSecondaryRoles = $.oauthUseSecondaryRoles;
        this.preAuthorizedRolesLists = $.preAuthorizedRolesLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIntegrationForCustomClientsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIntegrationForCustomClientsArgs $;

        public Builder() {
            $ = new OauthIntegrationForCustomClientsArgs();
        }

        public Builder(OauthIntegrationForCustomClientsArgs defaults) {
            $ = new OauthIntegrationForCustomClientsArgs(Objects.requireNonNull(defaults));
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
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkPolicy Specifies an existing network policy. This network policy controls network traffic that is attempting to exchange an authorization code for an access or refresh token or to use a refresh token to obtain a new access token.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicy(@Nullable Output<String> networkPolicy) {
            $.networkPolicy = networkPolicy;
            return this;
        }

        /**
         * @param networkPolicy Specifies an existing network policy. This network policy controls network traffic that is attempting to exchange an authorization code for an access or refresh token or to use a refresh token to obtain a new access token.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicy(String networkPolicy) {
            return networkPolicy(Output.of(networkPolicy));
        }

        /**
         * @param oauthAllowNonTlsRedirectUri If true, allows setting oauth*redirect*uri to a URI not protected by TLS. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthAllowNonTlsRedirectUri(@Nullable Output<String> oauthAllowNonTlsRedirectUri) {
            $.oauthAllowNonTlsRedirectUri = oauthAllowNonTlsRedirectUri;
            return this;
        }

        /**
         * @param oauthAllowNonTlsRedirectUri If true, allows setting oauth*redirect*uri to a URI not protected by TLS. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthAllowNonTlsRedirectUri(String oauthAllowNonTlsRedirectUri) {
            return oauthAllowNonTlsRedirectUri(Output.of(oauthAllowNonTlsRedirectUri));
        }

        public Builder oauthClientRsaPublicKey(@Nullable Output<String> oauthClientRsaPublicKey) {
            $.oauthClientRsaPublicKey = oauthClientRsaPublicKey;
            return this;
        }

        public Builder oauthClientRsaPublicKey(String oauthClientRsaPublicKey) {
            return oauthClientRsaPublicKey(Output.of(oauthClientRsaPublicKey));
        }

        public Builder oauthClientRsaPublicKey2(@Nullable Output<String> oauthClientRsaPublicKey2) {
            $.oauthClientRsaPublicKey2 = oauthClientRsaPublicKey2;
            return this;
        }

        public Builder oauthClientRsaPublicKey2(String oauthClientRsaPublicKey2) {
            return oauthClientRsaPublicKey2(Output.of(oauthClientRsaPublicKey2));
        }

        /**
         * @param oauthClientType Specifies the type of client being registered. Snowflake supports both confidential and public clients. Valid options are: `PUBLIC` | `CONFIDENTIAL`.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientType(Output<String> oauthClientType) {
            $.oauthClientType = oauthClientType;
            return this;
        }

        /**
         * @param oauthClientType Specifies the type of client being registered. Snowflake supports both confidential and public clients. Valid options are: `PUBLIC` | `CONFIDENTIAL`.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientType(String oauthClientType) {
            return oauthClientType(Output.of(oauthClientType));
        }

        /**
         * @param oauthEnforcePkce Boolean that specifies whether Proof Key for Code Exchange (PKCE) should be required for the integration. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthEnforcePkce(@Nullable Output<String> oauthEnforcePkce) {
            $.oauthEnforcePkce = oauthEnforcePkce;
            return this;
        }

        /**
         * @param oauthEnforcePkce Boolean that specifies whether Proof Key for Code Exchange (PKCE) should be required for the integration. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthEnforcePkce(String oauthEnforcePkce) {
            return oauthEnforcePkce(Output.of(oauthEnforcePkce));
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

        /**
         * @param oauthRedirectUri Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUri(Output<String> oauthRedirectUri) {
            $.oauthRedirectUri = oauthRedirectUri;
            return this;
        }

        /**
         * @param oauthRedirectUri Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
         * 
         * @return builder
         * 
         */
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

        /**
         * @param preAuthorizedRolesLists A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
         * 
         * @return builder
         * 
         */
        public Builder preAuthorizedRolesLists(@Nullable Output<List<String>> preAuthorizedRolesLists) {
            $.preAuthorizedRolesLists = preAuthorizedRolesLists;
            return this;
        }

        /**
         * @param preAuthorizedRolesLists A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
         * 
         * @return builder
         * 
         */
        public Builder preAuthorizedRolesLists(List<String> preAuthorizedRolesLists) {
            return preAuthorizedRolesLists(Output.of(preAuthorizedRolesLists));
        }

        /**
         * @param preAuthorizedRolesLists A set of Snowflake roles that a user does not need to explicitly consent to using after authenticating.
         * 
         * @return builder
         * 
         */
        public Builder preAuthorizedRolesLists(String... preAuthorizedRolesLists) {
            return preAuthorizedRolesLists(List.of(preAuthorizedRolesLists));
        }

        public OauthIntegrationForCustomClientsArgs build() {
            if ($.blockedRolesLists == null) {
                throw new MissingRequiredPropertyException("OauthIntegrationForCustomClientsArgs", "blockedRolesLists");
            }
            if ($.oauthClientType == null) {
                throw new MissingRequiredPropertyException("OauthIntegrationForCustomClientsArgs", "oauthClientType");
            }
            if ($.oauthRedirectUri == null) {
                throw new MissingRequiredPropertyException("OauthIntegrationForCustomClientsArgs", "oauthRedirectUri");
            }
            return $;
        }
    }

}
