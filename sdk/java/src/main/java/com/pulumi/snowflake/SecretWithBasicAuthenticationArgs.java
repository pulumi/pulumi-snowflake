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


public final class SecretWithBasicAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretWithBasicAuthenticationArgs Empty = new SecretWithBasicAuthenticationArgs();

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

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
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

    /**
     * Specifies the username value to store in the secret.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Specifies the username value to store in the secret.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private SecretWithBasicAuthenticationArgs() {}

    private SecretWithBasicAuthenticationArgs(SecretWithBasicAuthenticationArgs $) {
        this.comment = $.comment;
        this.database = $.database;
        this.name = $.name;
        this.password = $.password;
        this.schema = $.schema;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretWithBasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretWithBasicAuthenticationArgs $;

        public Builder() {
            $ = new SecretWithBasicAuthenticationArgs();
        }

        public Builder(SecretWithBasicAuthenticationArgs defaults) {
            $ = new SecretWithBasicAuthenticationArgs(Objects.requireNonNull(defaults));
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

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
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

        /**
         * @param username Specifies the username value to store in the secret.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Specifies the username value to store in the secret.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SecretWithBasicAuthenticationArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("SecretWithBasicAuthenticationArgs", "database");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("SecretWithBasicAuthenticationArgs", "password");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("SecretWithBasicAuthenticationArgs", "schema");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("SecretWithBasicAuthenticationArgs", "username");
            }
            return $;
        }
    }

}
