// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalOauthIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalOauthIntegrationArgs Empty = new ExternalOauthIntegrationArgs();

    /**
     * Specifies the list of roles that the client can set as the primary role.
     * 
     */
    @Import(name="allowedRoles")
    private @Nullable Output<List<String>> allowedRoles;

    /**
     * @return Specifies the list of roles that the client can set as the primary role.
     * 
     */
    public Optional<Output<List<String>>> allowedRoles() {
        return Optional.ofNullable(this.allowedRoles);
    }

    /**
     * Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
     * 
     */
    @Import(name="anyRoleMode")
    private @Nullable Output<String> anyRoleMode;

    /**
     * @return Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
     * 
     */
    public Optional<Output<String>> anyRoleMode() {
        return Optional.ofNullable(this.anyRoleMode);
    }

    /**
     * Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
     * 
     */
    @Import(name="audienceUrls")
    private @Nullable Output<List<String>> audienceUrls;

    /**
     * @return Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
     * 
     */
    public Optional<Output<List<String>>> audienceUrls() {
        return Optional.ofNullable(this.audienceUrls);
    }

    /**
     * Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     * 
     */
    @Import(name="blockedRoles")
    private @Nullable Output<List<String>> blockedRoles;

    /**
     * @return Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     * 
     */
    public Optional<Output<List<String>>> blockedRoles() {
        return Optional.ofNullable(this.blockedRoles);
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
     * Specifies the URL to define the OAuth 2.0 authorization server.
     * 
     */
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    /**
     * @return Specifies the URL to define the OAuth 2.0 authorization server.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }

    /**
     * Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
     * 
     */
    @Import(name="jwsKeysUrls")
    private @Nullable Output<List<String>> jwsKeysUrls;

    /**
     * @return Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
     * 
     */
    public Optional<Output<List<String>>> jwsKeysUrls() {
        return Optional.ofNullable(this.jwsKeysUrls);
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

    /**
     * Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
     * 
     */
    @Import(name="rsaPublicKey")
    private @Nullable Output<String> rsaPublicKey;

    /**
     * @return Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
     * 
     */
    public Optional<Output<String>> rsaPublicKey() {
        return Optional.ofNullable(this.rsaPublicKey);
    }

    /**
     * Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
     * 
     */
    @Import(name="rsaPublicKey2")
    private @Nullable Output<String> rsaPublicKey2;

    /**
     * @return Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
     * 
     */
    public Optional<Output<String>> rsaPublicKey2() {
        return Optional.ofNullable(this.rsaPublicKey2);
    }

    /**
     * Specifies the scope delimiter in the authorization token.
     * 
     */
    @Import(name="scopeDelimiter")
    private @Nullable Output<String> scopeDelimiter;

    /**
     * @return Specifies the scope delimiter in the authorization token.
     * 
     */
    public Optional<Output<String>> scopeDelimiter() {
        return Optional.ofNullable(this.scopeDelimiter);
    }

    /**
     * Specifies the access token claim to map the access token to an account role.
     * 
     */
    @Import(name="scopeMappingAttribute")
    private @Nullable Output<String> scopeMappingAttribute;

    /**
     * @return Specifies the access token claim to map the access token to an account role.
     * 
     */
    public Optional<Output<String>> scopeMappingAttribute() {
        return Optional.ofNullable(this.scopeMappingAttribute);
    }

    /**
     * Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
     * 
     */
    @Import(name="snowflakeUserMappingAttribute", required=true)
    private Output<String> snowflakeUserMappingAttribute;

    /**
     * @return Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
     * 
     */
    public Output<String> snowflakeUserMappingAttribute() {
        return this.snowflakeUserMappingAttribute;
    }

    /**
     * Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
     * 
     */
    @Import(name="tokenUserMappingClaims", required=true)
    private Output<List<String>> tokenUserMappingClaims;

    /**
     * @return Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
     * 
     */
    public Output<List<String>> tokenUserMappingClaims() {
        return this.tokenUserMappingClaims;
    }

    /**
     * Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ExternalOauthIntegrationArgs() {}

    private ExternalOauthIntegrationArgs(ExternalOauthIntegrationArgs $) {
        this.allowedRoles = $.allowedRoles;
        this.anyRoleMode = $.anyRoleMode;
        this.audienceUrls = $.audienceUrls;
        this.blockedRoles = $.blockedRoles;
        this.comment = $.comment;
        this.enabled = $.enabled;
        this.issuer = $.issuer;
        this.jwsKeysUrls = $.jwsKeysUrls;
        this.name = $.name;
        this.rsaPublicKey = $.rsaPublicKey;
        this.rsaPublicKey2 = $.rsaPublicKey2;
        this.scopeDelimiter = $.scopeDelimiter;
        this.scopeMappingAttribute = $.scopeMappingAttribute;
        this.snowflakeUserMappingAttribute = $.snowflakeUserMappingAttribute;
        this.tokenUserMappingClaims = $.tokenUserMappingClaims;
        this.type = $.type;
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
         * @param allowedRoles Specifies the list of roles that the client can set as the primary role.
         * 
         * @return builder
         * 
         */
        public Builder allowedRoles(@Nullable Output<List<String>> allowedRoles) {
            $.allowedRoles = allowedRoles;
            return this;
        }

        /**
         * @param allowedRoles Specifies the list of roles that the client can set as the primary role.
         * 
         * @return builder
         * 
         */
        public Builder allowedRoles(List<String> allowedRoles) {
            return allowedRoles(Output.of(allowedRoles));
        }

        /**
         * @param allowedRoles Specifies the list of roles that the client can set as the primary role.
         * 
         * @return builder
         * 
         */
        public Builder allowedRoles(String... allowedRoles) {
            return allowedRoles(List.of(allowedRoles));
        }

        /**
         * @param anyRoleMode Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
         * 
         * @return builder
         * 
         */
        public Builder anyRoleMode(@Nullable Output<String> anyRoleMode) {
            $.anyRoleMode = anyRoleMode;
            return this;
        }

        /**
         * @param anyRoleMode Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token.
         * 
         * @return builder
         * 
         */
        public Builder anyRoleMode(String anyRoleMode) {
            return anyRoleMode(Output.of(anyRoleMode));
        }

        /**
         * @param audienceUrls Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
         * 
         * @return builder
         * 
         */
        public Builder audienceUrls(@Nullable Output<List<String>> audienceUrls) {
            $.audienceUrls = audienceUrls;
            return this;
        }

        /**
         * @param audienceUrls Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
         * 
         * @return builder
         * 
         */
        public Builder audienceUrls(List<String> audienceUrls) {
            return audienceUrls(Output.of(audienceUrls));
        }

        /**
         * @param audienceUrls Specifies additional values that can be used for the access token&#39;s audience validation on top of using the Customer&#39;s Snowflake Account URL
         * 
         * @return builder
         * 
         */
        public Builder audienceUrls(String... audienceUrls) {
            return audienceUrls(List.of(audienceUrls));
        }

        /**
         * @param blockedRoles Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
         * 
         * @return builder
         * 
         */
        public Builder blockedRoles(@Nullable Output<List<String>> blockedRoles) {
            $.blockedRoles = blockedRoles;
            return this;
        }

        /**
         * @param blockedRoles Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
         * 
         * @return builder
         * 
         */
        public Builder blockedRoles(List<String> blockedRoles) {
            return blockedRoles(Output.of(blockedRoles));
        }

        /**
         * @param blockedRoles Specifies the list of roles that a client cannot set as the primary role. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
         * 
         * @return builder
         * 
         */
        public Builder blockedRoles(String... blockedRoles) {
            return blockedRoles(List.of(blockedRoles));
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
         * @param issuer Specifies the URL to define the OAuth 2.0 authorization server.
         * 
         * @return builder
         * 
         */
        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer Specifies the URL to define the OAuth 2.0 authorization server.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param jwsKeysUrls Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
         * 
         * @return builder
         * 
         */
        public Builder jwsKeysUrls(@Nullable Output<List<String>> jwsKeysUrls) {
            $.jwsKeysUrls = jwsKeysUrls;
            return this;
        }

        /**
         * @param jwsKeysUrls Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
         * 
         * @return builder
         * 
         */
        public Builder jwsKeysUrls(List<String> jwsKeysUrls) {
            return jwsKeysUrls(Output.of(jwsKeysUrls));
        }

        /**
         * @param jwsKeysUrls Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3.
         * 
         * @return builder
         * 
         */
        public Builder jwsKeysUrls(String... jwsKeysUrls) {
            return jwsKeysUrls(List.of(jwsKeysUrls));
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

        /**
         * @param rsaPublicKey Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
         * 
         * @return builder
         * 
         */
        public Builder rsaPublicKey(@Nullable Output<String> rsaPublicKey) {
            $.rsaPublicKey = rsaPublicKey;
            return this;
        }

        /**
         * @param rsaPublicKey Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers.
         * 
         * @return builder
         * 
         */
        public Builder rsaPublicKey(String rsaPublicKey) {
            return rsaPublicKey(Output.of(rsaPublicKey));
        }

        /**
         * @param rsaPublicKey2 Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
         * 
         * @return builder
         * 
         */
        public Builder rsaPublicKey2(@Nullable Output<String> rsaPublicKey2) {
            $.rsaPublicKey2 = rsaPublicKey2;
            return this;
        }

        /**
         * @param rsaPublicKey2 Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation.
         * 
         * @return builder
         * 
         */
        public Builder rsaPublicKey2(String rsaPublicKey2) {
            return rsaPublicKey2(Output.of(rsaPublicKey2));
        }

        /**
         * @param scopeDelimiter Specifies the scope delimiter in the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder scopeDelimiter(@Nullable Output<String> scopeDelimiter) {
            $.scopeDelimiter = scopeDelimiter;
            return this;
        }

        /**
         * @param scopeDelimiter Specifies the scope delimiter in the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder scopeDelimiter(String scopeDelimiter) {
            return scopeDelimiter(Output.of(scopeDelimiter));
        }

        /**
         * @param scopeMappingAttribute Specifies the access token claim to map the access token to an account role.
         * 
         * @return builder
         * 
         */
        public Builder scopeMappingAttribute(@Nullable Output<String> scopeMappingAttribute) {
            $.scopeMappingAttribute = scopeMappingAttribute;
            return this;
        }

        /**
         * @param scopeMappingAttribute Specifies the access token claim to map the access token to an account role.
         * 
         * @return builder
         * 
         */
        public Builder scopeMappingAttribute(String scopeMappingAttribute) {
            return scopeMappingAttribute(Output.of(scopeMappingAttribute));
        }

        /**
         * @param snowflakeUserMappingAttribute Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
         * 
         * @return builder
         * 
         */
        public Builder snowflakeUserMappingAttribute(Output<String> snowflakeUserMappingAttribute) {
            $.snowflakeUserMappingAttribute = snowflakeUserMappingAttribute;
            return this;
        }

        /**
         * @param snowflakeUserMappingAttribute Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record.
         * 
         * @return builder
         * 
         */
        public Builder snowflakeUserMappingAttribute(String snowflakeUserMappingAttribute) {
            return snowflakeUserMappingAttribute(Output.of(snowflakeUserMappingAttribute));
        }

        /**
         * @param tokenUserMappingClaims Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
         * 
         * @return builder
         * 
         */
        public Builder tokenUserMappingClaims(Output<List<String>> tokenUserMappingClaims) {
            $.tokenUserMappingClaims = tokenUserMappingClaims;
            return this;
        }

        /**
         * @param tokenUserMappingClaims Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
         * 
         * @return builder
         * 
         */
        public Builder tokenUserMappingClaims(List<String> tokenUserMappingClaims) {
            return tokenUserMappingClaims(Output.of(tokenUserMappingClaims));
        }

        /**
         * @param tokenUserMappingClaims Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record.
         * 
         * @return builder
         * 
         */
        public Builder tokenUserMappingClaims(String... tokenUserMappingClaims) {
            return tokenUserMappingClaims(List.of(tokenUserMappingClaims));
        }

        /**
         * @param type Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ExternalOauthIntegrationArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.snowflakeUserMappingAttribute = Objects.requireNonNull($.snowflakeUserMappingAttribute, "expected parameter 'snowflakeUserMappingAttribute' to be non-null");
            $.tokenUserMappingClaims = Objects.requireNonNull($.tokenUserMappingClaims, "expected parameter 'tokenUserMappingClaims' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
