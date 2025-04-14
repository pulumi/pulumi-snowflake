// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.OauthIntegrationForPartnerApplicationsDescribeOutputArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForPartnerApplicationsRelatedParameterArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForPartnerApplicationsShowOutputArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthIntegrationForPartnerApplicationsState extends com.pulumi.resources.ResourceArgs {

    public static final OauthIntegrationForPartnerApplicationsState Empty = new OauthIntegrationForPartnerApplicationsState();

    /**
     * A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
     * 
     */
    @Import(name="blockedRolesLists")
    private @Nullable Output<List<String>> blockedRolesLists;

    /**
     * @return A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<List<String>>> blockedRolesLists() {
        return Optional.ofNullable(this.blockedRolesLists);
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
     * Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Import(name="describeOutputs")
    private @Nullable Output<List<OauthIntegrationForPartnerApplicationsDescribeOutputArgs>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Optional<Output<List<OauthIntegrationForPartnerApplicationsDescribeOutputArgs>>> describeOutputs() {
        return Optional.ofNullable(this.describeOutputs);
    }

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<String> enabled;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     * 
     */
    @Import(name="oauthClient")
    private @Nullable Output<String> oauthClient;

    /**
     * @return Creates an OAuth interface between Snowflake and a partner application. Valid options are: `LOOKER` | `TABLEAU_DESKTOP` | `TABLEAU_SERVER`.
     * 
     */
    public Optional<Output<String>> oauthClient() {
        return Optional.ofNullable(this.oauthClient);
    }

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="oauthIssueRefreshTokens")
    private @Nullable Output<String> oauthIssueRefreshTokens;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> oauthIssueRefreshTokens() {
        return Optional.ofNullable(this.oauthIssueRefreshTokens);
    }

    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
     * 
     */
    @Import(name="oauthRedirectUri")
    private @Nullable Output<String> oauthRedirectUri;

    /**
     * @return Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
     * 
     */
    public Optional<Output<String>> oauthRedirectUri() {
        return Optional.ofNullable(this.oauthRedirectUri);
    }

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    @Import(name="oauthRefreshTokenValidity")
    private @Nullable Output<Integer> oauthRefreshTokenValidity;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
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
     * Parameters related to this security integration.
     * 
     */
    @Import(name="relatedParameters")
    private @Nullable Output<List<OauthIntegrationForPartnerApplicationsRelatedParameterArgs>> relatedParameters;

    /**
     * @return Parameters related to this security integration.
     * 
     */
    public Optional<Output<List<OauthIntegrationForPartnerApplicationsRelatedParameterArgs>>> relatedParameters() {
        return Optional.ofNullable(this.relatedParameters);
    }

    /**
     * Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<OauthIntegrationForPartnerApplicationsShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
     * 
     */
    public Optional<Output<List<OauthIntegrationForPartnerApplicationsShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    private OauthIntegrationForPartnerApplicationsState() {}

    private OauthIntegrationForPartnerApplicationsState(OauthIntegrationForPartnerApplicationsState $) {
        this.blockedRolesLists = $.blockedRolesLists;
        this.comment = $.comment;
        this.describeOutputs = $.describeOutputs;
        this.enabled = $.enabled;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.name = $.name;
        this.oauthClient = $.oauthClient;
        this.oauthIssueRefreshTokens = $.oauthIssueRefreshTokens;
        this.oauthRedirectUri = $.oauthRedirectUri;
        this.oauthRefreshTokenValidity = $.oauthRefreshTokenValidity;
        this.oauthUseSecondaryRoles = $.oauthUseSecondaryRoles;
        this.relatedParameters = $.relatedParameters;
        this.showOutputs = $.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIntegrationForPartnerApplicationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIntegrationForPartnerApplicationsState $;

        public Builder() {
            $ = new OauthIntegrationForPartnerApplicationsState();
        }

        public Builder(OauthIntegrationForPartnerApplicationsState defaults) {
            $ = new OauthIntegrationForPartnerApplicationsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockedRolesLists A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(@Nullable Output<List<String>> blockedRolesLists) {
            $.blockedRolesLists = blockedRolesLists;
            return this;
        }

        /**
         * @param blockedRolesLists A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(List<String> blockedRolesLists) {
            return blockedRolesLists(Output.of(blockedRolesLists));
        }

        /**
         * @param blockedRolesLists A set of Snowflake roles that a user cannot explicitly consent to using after authenticating. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
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
         * @param describeOutputs Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(@Nullable Output<List<OauthIntegrationForPartnerApplicationsDescribeOutputArgs>> describeOutputs) {
            $.describeOutputs = describeOutputs;
            return this;
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(List<OauthIntegrationForPartnerApplicationsDescribeOutputArgs> describeOutputs) {
            return describeOutputs(Output.of(describeOutputs));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(OauthIntegrationForPartnerApplicationsDescribeOutputArgs... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }

        /**
         * @param enabled (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<String> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this OAuth integration is enabled or disabled. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder enabled(String enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
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
        public Builder oauthClient(@Nullable Output<String> oauthClient) {
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
         * @param oauthIssueRefreshTokens (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthIssueRefreshTokens(@Nullable Output<String> oauthIssueRefreshTokens) {
            $.oauthIssueRefreshTokens = oauthIssueRefreshTokens;
            return this;
        }

        /**
         * @param oauthIssueRefreshTokens (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder oauthIssueRefreshTokens(String oauthIssueRefreshTokens) {
            return oauthIssueRefreshTokens(Output.of(oauthIssueRefreshTokens));
        }

        /**
         * @param oauthRedirectUri Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUri(@Nullable Output<String> oauthRedirectUri) {
            $.oauthRedirectUri = oauthRedirectUri;
            return this;
        }

        /**
         * @param oauthRedirectUri Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI. The field should be only set when OAUTH_CLIENT = LOOKER. In any other case the field should be left out empty.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUri(String oauthRedirectUri) {
            return oauthRedirectUri(Output.of(oauthRedirectUri));
        }

        /**
         * @param oauthRefreshTokenValidity (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(@Nullable Output<Integer> oauthRefreshTokenValidity) {
            $.oauthRefreshTokenValidity = oauthRefreshTokenValidity;
            return this;
        }

        /**
         * @param oauthRefreshTokenValidity (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
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
         * @param relatedParameters Parameters related to this security integration.
         * 
         * @return builder
         * 
         */
        public Builder relatedParameters(@Nullable Output<List<OauthIntegrationForPartnerApplicationsRelatedParameterArgs>> relatedParameters) {
            $.relatedParameters = relatedParameters;
            return this;
        }

        /**
         * @param relatedParameters Parameters related to this security integration.
         * 
         * @return builder
         * 
         */
        public Builder relatedParameters(List<OauthIntegrationForPartnerApplicationsRelatedParameterArgs> relatedParameters) {
            return relatedParameters(Output.of(relatedParameters));
        }

        /**
         * @param relatedParameters Parameters related to this security integration.
         * 
         * @return builder
         * 
         */
        public Builder relatedParameters(OauthIntegrationForPartnerApplicationsRelatedParameterArgs... relatedParameters) {
            return relatedParameters(List.of(relatedParameters));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<OauthIntegrationForPartnerApplicationsShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<OauthIntegrationForPartnerApplicationsShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(OauthIntegrationForPartnerApplicationsShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        public OauthIntegrationForPartnerApplicationsState build() {
            return $;
        }
    }

}
