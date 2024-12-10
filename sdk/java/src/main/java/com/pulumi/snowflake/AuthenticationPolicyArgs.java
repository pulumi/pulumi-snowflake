// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationPolicyArgs Empty = new AuthenticationPolicyArgs();

    /**
     * A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
     * 
     */
    @Import(name="authenticationMethods")
    private @Nullable Output<List<String>> authenticationMethods;

    /**
     * @return A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
     * 
     */
    public Optional<Output<List<String>>> authenticationMethods() {
        return Optional.ofNullable(this.authenticationMethods);
    }

    /**
     * A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
     * 
     */
    @Import(name="clientTypes")
    private @Nullable Output<List<String>> clientTypes;

    /**
     * @return A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
     * 
     */
    public Optional<Output<List<String>>> clientTypes() {
        return Optional.ofNullable(this.clientTypes);
    }

    /**
     * Specifies a comment for the authentication policy.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the authentication policy.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
     * 
     */
    @Import(name="mfaAuthenticationMethods")
    private @Nullable Output<List<String>> mfaAuthenticationMethods;

    /**
     * @return A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
     * 
     */
    public Optional<Output<List<String>>> mfaAuthenticationMethods() {
        return Optional.ofNullable(this.mfaAuthenticationMethods);
    }

    /**
     * Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
     * 
     */
    @Import(name="mfaEnrollment")
    private @Nullable Output<String> mfaEnrollment;

    /**
     * @return Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
     * 
     */
    public Optional<Output<String>> mfaEnrollment() {
        return Optional.ofNullable(this.mfaEnrollment);
    }

    /**
     * Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
     * 
     */
    @Import(name="securityIntegrations")
    private @Nullable Output<List<String>> securityIntegrations;

    /**
     * @return A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
     * 
     */
    public Optional<Output<List<String>>> securityIntegrations() {
        return Optional.ofNullable(this.securityIntegrations);
    }

    private AuthenticationPolicyArgs() {}

    private AuthenticationPolicyArgs(AuthenticationPolicyArgs $) {
        this.authenticationMethods = $.authenticationMethods;
        this.clientTypes = $.clientTypes;
        this.comment = $.comment;
        this.database = $.database;
        this.mfaAuthenticationMethods = $.mfaAuthenticationMethods;
        this.mfaEnrollment = $.mfaEnrollment;
        this.name = $.name;
        this.schema = $.schema;
        this.securityIntegrations = $.securityIntegrations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationPolicyArgs $;

        public Builder() {
            $ = new AuthenticationPolicyArgs();
        }

        public Builder(AuthenticationPolicyArgs defaults) {
            $ = new AuthenticationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMethods A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethods(@Nullable Output<List<String>> authenticationMethods) {
            $.authenticationMethods = authenticationMethods;
            return this;
        }

        /**
         * @param authenticationMethods A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethods(List<String> authenticationMethods) {
            return authenticationMethods(Output.of(authenticationMethods));
        }

        /**
         * @param authenticationMethods A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethods(String... authenticationMethods) {
            return authenticationMethods(List.of(authenticationMethods));
        }

        /**
         * @param clientTypes A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
         * 
         * @return builder
         * 
         */
        public Builder clientTypes(@Nullable Output<List<String>> clientTypes) {
            $.clientTypes = clientTypes;
            return this;
        }

        /**
         * @param clientTypes A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
         * 
         * @return builder
         * 
         */
        public Builder clientTypes(List<String> clientTypes) {
            return clientTypes(Output.of(clientTypes));
        }

        /**
         * @param clientTypes A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
         * 
         * @return builder
         * 
         */
        public Builder clientTypes(String... clientTypes) {
            return clientTypes(List.of(clientTypes));
        }

        /**
         * @param comment Specifies a comment for the authentication policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the authentication policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param mfaAuthenticationMethods A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
         * 
         * @return builder
         * 
         */
        public Builder mfaAuthenticationMethods(@Nullable Output<List<String>> mfaAuthenticationMethods) {
            $.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }

        /**
         * @param mfaAuthenticationMethods A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
         * 
         * @return builder
         * 
         */
        public Builder mfaAuthenticationMethods(List<String> mfaAuthenticationMethods) {
            return mfaAuthenticationMethods(Output.of(mfaAuthenticationMethods));
        }

        /**
         * @param mfaAuthenticationMethods A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
         * 
         * @return builder
         * 
         */
        public Builder mfaAuthenticationMethods(String... mfaAuthenticationMethods) {
            return mfaAuthenticationMethods(List.of(mfaAuthenticationMethods));
        }

        /**
         * @param mfaEnrollment Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
         * 
         * @return builder
         * 
         */
        public Builder mfaEnrollment(@Nullable Output<String> mfaEnrollment) {
            $.mfaEnrollment = mfaEnrollment;
            return this;
        }

        /**
         * @param mfaEnrollment Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
         * 
         * @return builder
         * 
         */
        public Builder mfaEnrollment(String mfaEnrollment) {
            return mfaEnrollment(Output.of(mfaEnrollment));
        }

        /**
         * @param name Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param securityIntegrations A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
         * 
         * @return builder
         * 
         */
        public Builder securityIntegrations(@Nullable Output<List<String>> securityIntegrations) {
            $.securityIntegrations = securityIntegrations;
            return this;
        }

        /**
         * @param securityIntegrations A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
         * 
         * @return builder
         * 
         */
        public Builder securityIntegrations(List<String> securityIntegrations) {
            return securityIntegrations(Output.of(securityIntegrations));
        }

        /**
         * @param securityIntegrations A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
         * 
         * @return builder
         * 
         */
        public Builder securityIntegrations(String... securityIntegrations) {
            return securityIntegrations(List.of(securityIntegrations));
        }

        public AuthenticationPolicyArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("AuthenticationPolicyArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("AuthenticationPolicyArgs", "schema");
            }
            return $;
        }
    }

}