// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretWithAuthorizationCodeGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretWithAuthorizationCodeGrantArgs Empty = new SecretWithAuthorizationCodeGrantArgs();

    /**
     * Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
     * 
     */
    @Import(name="apiAuthentication", required=true)
    private Output<String> apiAuthentication;

    /**
     * @return Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
     * 
     */
    public Output<String> apiAuthentication() {
        return this.apiAuthentication;
    }

    /**
     * Specifies a comment for the secret.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the secret.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="oauthRefreshToken", required=true)
    private Output<String> oauthRefreshToken;

    public Output<String> oauthRefreshToken() {
        return this.oauthRefreshToken;
    }

    /**
     * Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
     * 
     */
    @Import(name="oauthRefreshTokenExpiryTime", required=true)
    private Output<String> oauthRefreshTokenExpiryTime;

    /**
     * @return Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
     * 
     */
    public Output<String> oauthRefreshTokenExpiryTime() {
        return this.oauthRefreshTokenExpiryTime;
    }

    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private SecretWithAuthorizationCodeGrantArgs() {}

    private SecretWithAuthorizationCodeGrantArgs(SecretWithAuthorizationCodeGrantArgs $) {
        this.apiAuthentication = $.apiAuthentication;
        this.comment = $.comment;
        this.database = $.database;
        this.name = $.name;
        this.oauthRefreshToken = $.oauthRefreshToken;
        this.oauthRefreshTokenExpiryTime = $.oauthRefreshTokenExpiryTime;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretWithAuthorizationCodeGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretWithAuthorizationCodeGrantArgs $;

        public Builder() {
            $ = new SecretWithAuthorizationCodeGrantArgs();
        }

        public Builder(SecretWithAuthorizationCodeGrantArgs defaults) {
            $ = new SecretWithAuthorizationCodeGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiAuthentication Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
         * 
         * @return builder
         * 
         */
        public Builder apiAuthentication(Output<String> apiAuthentication) {
            $.apiAuthentication = apiAuthentication;
            return this;
        }

        /**
         * @param apiAuthentication Specifies the name value of the Snowflake security integration that connects Snowflake to an external service.
         * 
         * @return builder
         * 
         */
        public Builder apiAuthentication(String apiAuthentication) {
            return apiAuthentication(Output.of(apiAuthentication));
        }

        /**
         * @param comment Specifies a comment for the secret.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the secret.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder oauthRefreshToken(Output<String> oauthRefreshToken) {
            $.oauthRefreshToken = oauthRefreshToken;
            return this;
        }

        public Builder oauthRefreshToken(String oauthRefreshToken) {
            return oauthRefreshToken(Output.of(oauthRefreshToken));
        }

        /**
         * @param oauthRefreshTokenExpiryTime Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenExpiryTime(Output<String> oauthRefreshTokenExpiryTime) {
            $.oauthRefreshTokenExpiryTime = oauthRefreshTokenExpiryTime;
            return this;
        }

        /**
         * @param oauthRefreshTokenExpiryTime Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenExpiryTime(String oauthRefreshTokenExpiryTime) {
            return oauthRefreshTokenExpiryTime(Output.of(oauthRefreshTokenExpiryTime));
        }

        /**
         * @param schema The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public SecretWithAuthorizationCodeGrantArgs build() {
            if ($.apiAuthentication == null) {
                throw new MissingRequiredPropertyException("SecretWithAuthorizationCodeGrantArgs", "apiAuthentication");
            }
            if ($.database == null) {
                throw new MissingRequiredPropertyException("SecretWithAuthorizationCodeGrantArgs", "database");
            }
            if ($.oauthRefreshToken == null) {
                throw new MissingRequiredPropertyException("SecretWithAuthorizationCodeGrantArgs", "oauthRefreshToken");
            }
            if ($.oauthRefreshTokenExpiryTime == null) {
                throw new MissingRequiredPropertyException("SecretWithAuthorizationCodeGrantArgs", "oauthRefreshTokenExpiryTime");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("SecretWithAuthorizationCodeGrantArgs", "schema");
            }
            return $;
        }
    }

}