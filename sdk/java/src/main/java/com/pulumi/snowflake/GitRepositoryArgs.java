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


public final class GitRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitRepositoryArgs Empty = new GitRepositoryArgs();

    /**
     * Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
     * 
     */
    @Import(name="apiIntegration", required=true)
    private Output<String> apiIntegration;

    /**
     * @return Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
     * 
     */
    public Output<String> apiIntegration() {
        return this.apiIntegration;
    }

    /**
     * Specifies a comment for the git repository.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the git repository.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the Snowflake secret fully qualified name (e.g `&#34;\&#34;&lt;db_name&gt;\&#34;.\&#34;&lt;schema_name&gt;\&#34;.\&#34;&lt;secret_name&gt;\&#34;&#34;`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
     * 
     */
    @Import(name="gitCredentials")
    private @Nullable Output<String> gitCredentials;

    /**
     * @return Specifies the Snowflake secret fully qualified name (e.g `&#34;\&#34;&lt;db_name&gt;\&#34;.\&#34;&lt;schema_name&gt;\&#34;.\&#34;&lt;secret_name&gt;\&#34;&#34;`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
     * 
     */
    public Optional<Output<String>> gitCredentials() {
        return Optional.ofNullable(this.gitCredentials);
    }

    /**
     * Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
     * 
     */
    @Import(name="origin", required=true)
    private Output<String> origin;

    /**
     * @return Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }

    /**
     * The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private GitRepositoryArgs() {}

    private GitRepositoryArgs(GitRepositoryArgs $) {
        this.apiIntegration = $.apiIntegration;
        this.comment = $.comment;
        this.database = $.database;
        this.gitCredentials = $.gitCredentials;
        this.name = $.name;
        this.origin = $.origin;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitRepositoryArgs $;

        public Builder() {
            $ = new GitRepositoryArgs();
        }

        public Builder(GitRepositoryArgs defaults) {
            $ = new GitRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiIntegration Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
         * 
         * @return builder
         * 
         */
        public Builder apiIntegration(Output<String> apiIntegration) {
            $.apiIntegration = apiIntegration;
            return this;
        }

        /**
         * @param apiIntegration Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
         * 
         * @return builder
         * 
         */
        public Builder apiIntegration(String apiIntegration) {
            return apiIntegration(Output.of(apiIntegration));
        }

        /**
         * @param comment Specifies a comment for the git repository.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the git repository.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param gitCredentials Specifies the Snowflake secret fully qualified name (e.g `&#34;\&#34;&lt;db_name&gt;\&#34;.\&#34;&lt;schema_name&gt;\&#34;.\&#34;&lt;secret_name&gt;\&#34;&#34;`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
         * 
         * @return builder
         * 
         */
        public Builder gitCredentials(@Nullable Output<String> gitCredentials) {
            $.gitCredentials = gitCredentials;
            return this;
        }

        /**
         * @param gitCredentials Specifies the Snowflake secret fully qualified name (e.g `&#34;\&#34;&lt;db_name&gt;\&#34;.\&#34;&lt;schema_name&gt;\&#34;.\&#34;&lt;secret_name&gt;\&#34;&#34;`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
         * 
         * @return builder
         * 
         */
        public Builder gitCredentials(String gitCredentials) {
            return gitCredentials(Output.of(gitCredentials));
        }

        /**
         * @param name Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param origin Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder origin(Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param schema The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public GitRepositoryArgs build() {
            if ($.apiIntegration == null) {
                throw new MissingRequiredPropertyException("GitRepositoryArgs", "apiIntegration");
            }
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GitRepositoryArgs", "database");
            }
            if ($.origin == null) {
                throw new MissingRequiredPropertyException("GitRepositoryArgs", "origin");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("GitRepositoryArgs", "schema");
            }
            return $;
        }
    }

}
