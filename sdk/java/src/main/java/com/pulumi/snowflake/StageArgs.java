// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.StageTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StageArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageArgs Empty = new StageArgs();

    /**
     * A unique ID assigned to the specific stage. The ID has the following format: &amp;lt;snowflakeAccount&amp;gt;*SFCRole=&amp;lt;snowflakeRoleId&amp;gt;*&amp;lt;randomId&amp;gt;
     * 
     */
    @Import(name="awsExternalId")
    private @Nullable Output<String> awsExternalId;

    /**
     * @return A unique ID assigned to the specific stage. The ID has the following format: &amp;lt;snowflakeAccount&amp;gt;*SFCRole=&amp;lt;snowflakeRoleId&amp;gt;*&amp;lt;randomId&amp;gt;
     * 
     */
    public Optional<Output<String>> awsExternalId() {
        return Optional.ofNullable(this.awsExternalId);
    }

    /**
     * Specifies a comment for the stage.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the stage.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies the copy options for the stage.
     * 
     */
    @Import(name="copyOptions")
    private @Nullable Output<String> copyOptions;

    /**
     * @return Specifies the copy options for the stage.
     * 
     */
    public Optional<Output<String>> copyOptions() {
        return Optional.ofNullable(this.copyOptions);
    }

    /**
     * Specifies the credentials for the stage.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<String> credentials;

    /**
     * @return Specifies the credentials for the stage.
     * 
     */
    public Optional<Output<String>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The database in which to create the stage.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the stage.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the directory settings for the stage.
     * 
     */
    @Import(name="directory")
    private @Nullable Output<String> directory;

    /**
     * @return Specifies the directory settings for the stage.
     * 
     */
    public Optional<Output<String>> directory() {
        return Optional.ofNullable(this.directory);
    }

    /**
     * Specifies the encryption settings for the stage.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<String> encryption;

    /**
     * @return Specifies the encryption settings for the stage.
     * 
     */
    public Optional<Output<String>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * Specifies the file format for the stage.
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    /**
     * @return Specifies the file format for the stage.
     * 
     */
    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the stage.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the stage.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
     * 
     */
    @Import(name="snowflakeIamUser")
    private @Nullable Output<String> snowflakeIamUser;

    /**
     * @return An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
     * 
     */
    public Optional<Output<String>> snowflakeIamUser() {
        return Optional.ofNullable(this.snowflakeIamUser);
    }

    /**
     * Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     * 
     */
    @Import(name="storageIntegration")
    private @Nullable Output<String> storageIntegration;

    /**
     * @return Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     * 
     */
    public Optional<Output<String>> storageIntegration() {
        return Optional.ofNullable(this.storageIntegration);
    }

    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Import(name="tags")
    private @Nullable Output<List<StageTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    public Optional<Output<List<StageTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the URL for the stage.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Specifies the URL for the stage.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private StageArgs() {}

    private StageArgs(StageArgs $) {
        this.awsExternalId = $.awsExternalId;
        this.comment = $.comment;
        this.copyOptions = $.copyOptions;
        this.credentials = $.credentials;
        this.database = $.database;
        this.directory = $.directory;
        this.encryption = $.encryption;
        this.fileFormat = $.fileFormat;
        this.name = $.name;
        this.schema = $.schema;
        this.snowflakeIamUser = $.snowflakeIamUser;
        this.storageIntegration = $.storageIntegration;
        this.tags = $.tags;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageArgs $;

        public Builder() {
            $ = new StageArgs();
        }

        public Builder(StageArgs defaults) {
            $ = new StageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsExternalId A unique ID assigned to the specific stage. The ID has the following format: &amp;lt;snowflakeAccount&amp;gt;*SFCRole=&amp;lt;snowflakeRoleId&amp;gt;*&amp;lt;randomId&amp;gt;
         * 
         * @return builder
         * 
         */
        public Builder awsExternalId(@Nullable Output<String> awsExternalId) {
            $.awsExternalId = awsExternalId;
            return this;
        }

        /**
         * @param awsExternalId A unique ID assigned to the specific stage. The ID has the following format: &amp;lt;snowflakeAccount&amp;gt;*SFCRole=&amp;lt;snowflakeRoleId&amp;gt;*&amp;lt;randomId&amp;gt;
         * 
         * @return builder
         * 
         */
        public Builder awsExternalId(String awsExternalId) {
            return awsExternalId(Output.of(awsExternalId));
        }

        /**
         * @param comment Specifies a comment for the stage.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the stage.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param copyOptions Specifies the copy options for the stage.
         * 
         * @return builder
         * 
         */
        public Builder copyOptions(@Nullable Output<String> copyOptions) {
            $.copyOptions = copyOptions;
            return this;
        }

        /**
         * @param copyOptions Specifies the copy options for the stage.
         * 
         * @return builder
         * 
         */
        public Builder copyOptions(String copyOptions) {
            return copyOptions(Output.of(copyOptions));
        }

        /**
         * @param credentials Specifies the credentials for the stage.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<String> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Specifies the credentials for the stage.
         * 
         * @return builder
         * 
         */
        public Builder credentials(String credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param database The database in which to create the stage.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the stage.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param directory Specifies the directory settings for the stage.
         * 
         * @return builder
         * 
         */
        public Builder directory(@Nullable Output<String> directory) {
            $.directory = directory;
            return this;
        }

        /**
         * @param directory Specifies the directory settings for the stage.
         * 
         * @return builder
         * 
         */
        public Builder directory(String directory) {
            return directory(Output.of(directory));
        }

        /**
         * @param encryption Specifies the encryption settings for the stage.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<String> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption Specifies the encryption settings for the stage.
         * 
         * @return builder
         * 
         */
        public Builder encryption(String encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param fileFormat Specifies the file format for the stage.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        /**
         * @param fileFormat Specifies the file format for the stage.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        /**
         * @param name Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the stage.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the stage.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param snowflakeIamUser An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
         * 
         * @return builder
         * 
         */
        public Builder snowflakeIamUser(@Nullable Output<String> snowflakeIamUser) {
            $.snowflakeIamUser = snowflakeIamUser;
            return this;
        }

        /**
         * @param snowflakeIamUser An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
         * 
         * @return builder
         * 
         */
        public Builder snowflakeIamUser(String snowflakeIamUser) {
            return snowflakeIamUser(Output.of(snowflakeIamUser));
        }

        /**
         * @param storageIntegration Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
         * 
         * @return builder
         * 
         */
        public Builder storageIntegration(@Nullable Output<String> storageIntegration) {
            $.storageIntegration = storageIntegration;
            return this;
        }

        /**
         * @param storageIntegration Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
         * 
         * @return builder
         * 
         */
        public Builder storageIntegration(String storageIntegration) {
            return storageIntegration(Output.of(storageIntegration));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(@Nullable Output<List<StageTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(List<StageTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(StageTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param url Specifies the URL for the stage.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Specifies the URL for the stage.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public StageArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("StageArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("StageArgs", "schema");
            }
            return $;
        }
    }

}
