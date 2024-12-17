// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.SecretWithBasicAuthenticationDescribeOutputArgs;
import com.pulumi.snowflake.inputs.SecretWithBasicAuthenticationShowOutputArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretWithBasicAuthenticationState extends com.pulumi.resources.ResourceArgs {

    public static final SecretWithBasicAuthenticationState Empty = new SecretWithBasicAuthenticationState();

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
     * The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Outputs the result of `DESCRIBE SECRET` for the given secret.
     * 
     */
    @Import(name="describeOutputs")
    private @Nullable Output<List<SecretWithBasicAuthenticationDescribeOutputArgs>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE SECRET` for the given secret.
     * 
     */
    public Optional<Output<List<SecretWithBasicAuthenticationDescribeOutputArgs>>> describeOutputs() {
        return Optional.ofNullable(this.describeOutputs);
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
     * String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     * 
     */
    @Import(name="secretType")
    private @Nullable Output<String> secretType;

    /**
     * @return Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
     * 
     */
    public Optional<Output<String>> secretType() {
        return Optional.ofNullable(this.secretType);
    }

    /**
     * Outputs the result of `SHOW SECRETS` for the given secret.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<SecretWithBasicAuthenticationShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW SECRETS` for the given secret.
     * 
     */
    public Optional<Output<List<SecretWithBasicAuthenticationShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    /**
     * Specifies the username value to store in the secret.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Specifies the username value to store in the secret.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private SecretWithBasicAuthenticationState() {}

    private SecretWithBasicAuthenticationState(SecretWithBasicAuthenticationState $) {
        this.comment = $.comment;
        this.database = $.database;
        this.describeOutputs = $.describeOutputs;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.name = $.name;
        this.password = $.password;
        this.schema = $.schema;
        this.secretType = $.secretType;
        this.showOutputs = $.showOutputs;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretWithBasicAuthenticationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretWithBasicAuthenticationState $;

        public Builder() {
            $ = new SecretWithBasicAuthenticationState();
        }

        public Builder(SecretWithBasicAuthenticationState defaults) {
            $ = new SecretWithBasicAuthenticationState(Objects.requireNonNull(defaults));
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
         * @param database The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECRET` for the given secret.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(@Nullable Output<List<SecretWithBasicAuthenticationDescribeOutputArgs>> describeOutputs) {
            $.describeOutputs = describeOutputs;
            return this;
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECRET` for the given secret.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(List<SecretWithBasicAuthenticationDescribeOutputArgs> describeOutputs) {
            return describeOutputs(Output.of(describeOutputs));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE SECRET` for the given secret.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(SecretWithBasicAuthenticationDescribeOutputArgs... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
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
         * @param name String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param schema The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param secretType Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
         * 
         * @return builder
         * 
         */
        public Builder secretType(@Nullable Output<String> secretType) {
            $.secretType = secretType;
            return this;
        }

        /**
         * @param secretType Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
         * 
         * @return builder
         * 
         */
        public Builder secretType(String secretType) {
            return secretType(Output.of(secretType));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECRETS` for the given secret.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<SecretWithBasicAuthenticationShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECRETS` for the given secret.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<SecretWithBasicAuthenticationShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW SECRETS` for the given secret.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(SecretWithBasicAuthenticationShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        /**
         * @param username Specifies the username value to store in the secret.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
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

        public SecretWithBasicAuthenticationState build() {
            return $;
        }
    }

}
