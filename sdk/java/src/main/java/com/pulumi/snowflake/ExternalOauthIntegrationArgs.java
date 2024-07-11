// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalOauthIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalOauthIntegrationArgs Empty = new ExternalOauthIntegrationArgs();

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
     * Specifies whether to initiate operation of the integration or suspend it.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether to initiate operation of the integration or suspend it.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Specifies the list of roles that the client can set as the primary role.
     * 
     */
    @Import(name="externalOauthAllowedRolesLists")
    private @Nullable Output<List<String>> externalOauthAllowedRolesLists;

    /**
     * @return Specifies the list of roles that the client can set as the primary role.
     * 
     */
    public Optional<Output<List<String>>> externalOauthAllowedRolesLists() {
        return Optional.ofNullable(this.externalOauthAllowedRolesLists);
    }

    /**
     * Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
     * 
     */
    @Import(name="externalOauthAnyRoleMode")
    private @Nullable Output<String> externalOauthAnyRoleMode;

    /**
     * @return Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
     * 
     */
    public Optional<Output<String>> externalOauthAnyRoleMode() {
        return Optional.ofNullable(this.externalOauthAnyRoleMode);
    }

    /**
     * Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
     * 
     */
    @Import(name="externalOauthAudienceLists")
    private @Nullable Output<List<String>> externalOauthAudienceLists;

    /**
     * @return Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
     * 
     */
    public Optional<Output<List<String>>> externalOauthAudienceLists() {
        return Optional.ofNullable(this.externalOauthAudienceLists);
    }

    /**
     * Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
     * 
     */
    @Import(name="externalOauthBlockedRolesLists")
    private @Nullable Output<List<String>> externalOauthBlockedRolesLists;

    /**
     * @return Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
     * 
     */
    public Optional<Output<List<String>>> externalOauthBlockedRolesLists() {
        return Optional.ofNullable(this.externalOauthBlockedRolesLists);
    }

    /**
     * Specifies the URL to define the OAuth 2.0 authorization server.
     * 
     */
    @Import(name="externalOauthIssuer", required=true)
    private Output<String> externalOauthIssuer;

    /**
     * @return Specifies the URL to define the OAuth 2.0 authorization server.
     * 
     */
    public Output<String> externalOauthIssuer() {
        return this.externalOauthIssuer;
    }

    /**
     * Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
     * 
     */
    @Import(name="externalOauthJwsKeysUrls")
    private @Nullable Output<List<String>> externalOauthJwsKeysUrls;

    /**
     * @return Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
     * 
     */
    public Optional<Output<List<String>>> externalOauthJwsKeysUrls() {
        return Optional.ofNullable(this.externalOauthJwsKeysUrls);
    }

    /**
     * Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
     * 
     */
    @Import(name="externalOauthRsaPublicKey")
    private @Nullable Output<String> externalOauthRsaPublicKey;

    /**
     * @return Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
     * 
     */
    public Optional<Output<String>> externalOauthRsaPublicKey() {
        return Optional.ofNullable(this.externalOauthRsaPublicKey);
    }

    /**
     * Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
     * 
     */
    @Import(name="externalOauthRsaPublicKey2")
    private @Nullable Output<String> externalOauthRsaPublicKey2;

    /**
     * @return Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
     * 
     */
    public Optional<Output<String>> externalOauthRsaPublicKey2() {
        return Optional.ofNullable(this.externalOauthRsaPublicKey2);
    }

    /**
     * Specifies the scope delimiter in the authorization token.
     * 
     */
    @Import(name="externalOauthScopeDelimiter")
    private @Nullable Output<String> externalOauthScopeDelimiter;

    /**
     * @return Specifies the scope delimiter in the authorization token.
     * 
     */
    public Optional<Output<String>> externalOauthScopeDelimiter() {
        return Optional.ofNullable(this.externalOauthScopeDelimiter);
    }

    /**
     * Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
     * 
     */
    @Import(name="externalOauthScopeMappingAttribute")
    private @Nullable Output<String> externalOauthScopeMappingAttribute;

    /**
     * @return Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
     * 
     */
    public Optional<Output<String>> externalOauthScopeMappingAttribute() {
        return Optional.ofNullable(this.externalOauthScopeMappingAttribute);
    }

    /**
     * Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
     * 
     */
    @Import(name="externalOauthSnowflakeUserMappingAttribute", required=true)
    private Output<String> externalOauthSnowflakeUserMappingAttribute;

    /**
     * @return Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
     * 
     */
    public Output<String> externalOauthSnowflakeUserMappingAttribute() {
        return this.externalOauthSnowflakeUserMappingAttribute;
    }

    /**
     * Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
     * 
     */
    @Import(name="externalOauthTokenUserMappingClaims", required=true)
    private Output<List<String>> externalOauthTokenUserMappingClaims;

    /**
     * @return Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
     * 
     */
    public Output<List<String>> externalOauthTokenUserMappingClaims() {
        return this.externalOauthTokenUserMappingClaims;
    }

    /**
     * Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
     * 
     */
    @Import(name="externalOauthType", required=true)
    private Output<String> externalOauthType;

    /**
     * @return Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
     * 
     */
    public Output<String> externalOauthType() {
        return this.externalOauthType;
    }

    /**
     * Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ExternalOauthIntegrationArgs() {}

    private ExternalOauthIntegrationArgs(ExternalOauthIntegrationArgs $) {
        this.comment = $.comment;
        this.enabled = $.enabled;
        this.externalOauthAllowedRolesLists = $.externalOauthAllowedRolesLists;
        this.externalOauthAnyRoleMode = $.externalOauthAnyRoleMode;
        this.externalOauthAudienceLists = $.externalOauthAudienceLists;
        this.externalOauthBlockedRolesLists = $.externalOauthBlockedRolesLists;
        this.externalOauthIssuer = $.externalOauthIssuer;
        this.externalOauthJwsKeysUrls = $.externalOauthJwsKeysUrls;
        this.externalOauthRsaPublicKey = $.externalOauthRsaPublicKey;
        this.externalOauthRsaPublicKey2 = $.externalOauthRsaPublicKey2;
        this.externalOauthScopeDelimiter = $.externalOauthScopeDelimiter;
        this.externalOauthScopeMappingAttribute = $.externalOauthScopeMappingAttribute;
        this.externalOauthSnowflakeUserMappingAttribute = $.externalOauthSnowflakeUserMappingAttribute;
        this.externalOauthTokenUserMappingClaims = $.externalOauthTokenUserMappingClaims;
        this.externalOauthType = $.externalOauthType;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalOauthIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalOauthIntegrationArgs $;

        public Builder() {
            $ = new ExternalOauthIntegrationArgs();
        }

        public Builder(ExternalOauthIntegrationArgs defaults) {
            $ = new ExternalOauthIntegrationArgs(Objects.requireNonNull(defaults));
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
         * @param enabled Specifies whether to initiate operation of the integration or suspend it.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether to initiate operation of the integration or suspend it.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param externalOauthAllowedRolesLists Specifies the list of roles that the client can set as the primary role.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAllowedRolesLists(@Nullable Output<List<String>> externalOauthAllowedRolesLists) {
            $.externalOauthAllowedRolesLists = externalOauthAllowedRolesLists;
            return this;
        }

        /**
         * @param externalOauthAllowedRolesLists Specifies the list of roles that the client can set as the primary role.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAllowedRolesLists(List<String> externalOauthAllowedRolesLists) {
            return externalOauthAllowedRolesLists(Output.of(externalOauthAllowedRolesLists));
        }

        /**
         * @param externalOauthAllowedRolesLists Specifies the list of roles that the client can set as the primary role.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAllowedRolesLists(String... externalOauthAllowedRolesLists) {
            return externalOauthAllowedRolesLists(List.of(externalOauthAllowedRolesLists));
        }

        /**
         * @param externalOauthAnyRoleMode Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAnyRoleMode(@Nullable Output<String> externalOauthAnyRoleMode) {
            $.externalOauthAnyRoleMode = externalOauthAnyRoleMode;
            return this;
        }

        /**
         * @param externalOauthAnyRoleMode Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAnyRoleMode(String externalOauthAnyRoleMode) {
            return externalOauthAnyRoleMode(Output.of(externalOauthAnyRoleMode));
        }

        /**
         * @param externalOauthAudienceLists Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAudienceLists(@Nullable Output<List<String>> externalOauthAudienceLists) {
            $.externalOauthAudienceLists = externalOauthAudienceLists;
            return this;
        }

        /**
         * @param externalOauthAudienceLists Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAudienceLists(List<String> externalOauthAudienceLists) {
            return externalOauthAudienceLists(Output.of(externalOauthAudienceLists));
        }

        /**
         * @param externalOauthAudienceLists Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
         * 
         * @return builder
         * 
         */
        public Builder externalOauthAudienceLists(String... externalOauthAudienceLists) {
            return externalOauthAudienceLists(List.of(externalOauthAudienceLists));
        }

        /**
         * @param externalOauthBlockedRolesLists Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthBlockedRolesLists(@Nullable Output<List<String>> externalOauthBlockedRolesLists) {
            $.externalOauthBlockedRolesLists = externalOauthBlockedRolesLists;
            return this;
        }

        /**
         * @param externalOauthBlockedRolesLists Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthBlockedRolesLists(List<String> externalOauthBlockedRolesLists) {
            return externalOauthBlockedRolesLists(Output.of(externalOauthBlockedRolesLists));
        }

        /**
         * @param externalOauthBlockedRolesLists Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthBlockedRolesLists(String... externalOauthBlockedRolesLists) {
            return externalOauthBlockedRolesLists(List.of(externalOauthBlockedRolesLists));
        }

        /**
         * @param externalOauthIssuer Specifies the URL to define the OAuth 2.0 authorization server.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthIssuer(Output<String> externalOauthIssuer) {
            $.externalOauthIssuer = externalOauthIssuer;
            return this;
        }

        /**
         * @param externalOauthIssuer Specifies the URL to define the OAuth 2.0 authorization server.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthIssuer(String externalOauthIssuer) {
            return externalOauthIssuer(Output.of(externalOauthIssuer));
        }

        /**
         * @param externalOauthJwsKeysUrls Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthJwsKeysUrls(@Nullable Output<List<String>> externalOauthJwsKeysUrls) {
            $.externalOauthJwsKeysUrls = externalOauthJwsKeysUrls;
            return this;
        }

        /**
         * @param externalOauthJwsKeysUrls Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthJwsKeysUrls(List<String> externalOauthJwsKeysUrls) {
            return externalOauthJwsKeysUrls(Output.of(externalOauthJwsKeysUrls));
        }

        /**
         * @param externalOauthJwsKeysUrls Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthJwsKeysUrls(String... externalOauthJwsKeysUrls) {
            return externalOauthJwsKeysUrls(List.of(externalOauthJwsKeysUrls));
        }

        /**
         * @param externalOauthRsaPublicKey Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthRsaPublicKey(@Nullable Output<String> externalOauthRsaPublicKey) {
            $.externalOauthRsaPublicKey = externalOauthRsaPublicKey;
            return this;
        }

        /**
         * @param externalOauthRsaPublicKey Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthRsaPublicKey(String externalOauthRsaPublicKey) {
            return externalOauthRsaPublicKey(Output.of(externalOauthRsaPublicKey));
        }

        /**
         * @param externalOauthRsaPublicKey2 Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthRsaPublicKey2(@Nullable Output<String> externalOauthRsaPublicKey2) {
            $.externalOauthRsaPublicKey2 = externalOauthRsaPublicKey2;
            return this;
        }

        /**
         * @param externalOauthRsaPublicKey2 Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthRsaPublicKey2(String externalOauthRsaPublicKey2) {
            return externalOauthRsaPublicKey2(Output.of(externalOauthRsaPublicKey2));
        }

        /**
         * @param externalOauthScopeDelimiter Specifies the scope delimiter in the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthScopeDelimiter(@Nullable Output<String> externalOauthScopeDelimiter) {
            $.externalOauthScopeDelimiter = externalOauthScopeDelimiter;
            return this;
        }

        /**
         * @param externalOauthScopeDelimiter Specifies the scope delimiter in the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthScopeDelimiter(String externalOauthScopeDelimiter) {
            return externalOauthScopeDelimiter(Output.of(externalOauthScopeDelimiter));
        }

        /**
         * @param externalOauthScopeMappingAttribute Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthScopeMappingAttribute(@Nullable Output<String> externalOauthScopeMappingAttribute) {
            $.externalOauthScopeMappingAttribute = externalOauthScopeMappingAttribute;
            return this;
        }

        /**
         * @param externalOauthScopeMappingAttribute Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthScopeMappingAttribute(String externalOauthScopeMappingAttribute) {
            return externalOauthScopeMappingAttribute(Output.of(externalOauthScopeMappingAttribute));
        }

        /**
         * @param externalOauthSnowflakeUserMappingAttribute Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthSnowflakeUserMappingAttribute(Output<String> externalOauthSnowflakeUserMappingAttribute) {
            $.externalOauthSnowflakeUserMappingAttribute = externalOauthSnowflakeUserMappingAttribute;
            return this;
        }

        /**
         * @param externalOauthSnowflakeUserMappingAttribute Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthSnowflakeUserMappingAttribute(String externalOauthSnowflakeUserMappingAttribute) {
            return externalOauthSnowflakeUserMappingAttribute(Output.of(externalOauthSnowflakeUserMappingAttribute));
        }

        /**
         * @param externalOauthTokenUserMappingClaims Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthTokenUserMappingClaims(Output<List<String>> externalOauthTokenUserMappingClaims) {
            $.externalOauthTokenUserMappingClaims = externalOauthTokenUserMappingClaims;
            return this;
        }

        /**
         * @param externalOauthTokenUserMappingClaims Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthTokenUserMappingClaims(List<String> externalOauthTokenUserMappingClaims) {
            return externalOauthTokenUserMappingClaims(Output.of(externalOauthTokenUserMappingClaims));
        }

        /**
         * @param externalOauthTokenUserMappingClaims Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthTokenUserMappingClaims(String... externalOauthTokenUserMappingClaims) {
            return externalOauthTokenUserMappingClaims(List.of(externalOauthTokenUserMappingClaims));
        }

        /**
         * @param externalOauthType Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthType(Output<String> externalOauthType) {
            $.externalOauthType = externalOauthType;
            return this;
        }

        /**
         * @param externalOauthType Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder externalOauthType(String externalOauthType) {
            return externalOauthType(Output.of(externalOauthType));
        }

        /**
         * @param name Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ExternalOauthIntegrationArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ExternalOauthIntegrationArgs", "enabled");
            }
            if ($.externalOauthIssuer == null) {
                throw new MissingRequiredPropertyException("ExternalOauthIntegrationArgs", "externalOauthIssuer");
            }
            if ($.externalOauthSnowflakeUserMappingAttribute == null) {
                throw new MissingRequiredPropertyException("ExternalOauthIntegrationArgs", "externalOauthSnowflakeUserMappingAttribute");
            }
            if ($.externalOauthTokenUserMappingClaims == null) {
                throw new MissingRequiredPropertyException("ExternalOauthIntegrationArgs", "externalOauthTokenUserMappingClaims");
            }
            if ($.externalOauthType == null) {
                throw new MissingRequiredPropertyException("ExternalOauthIntegrationArgs", "externalOauthType");
            }
            return $;
        }
    }

}
