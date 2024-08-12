// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.StageArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.StageState;
import com.pulumi.snowflake.outputs.StageTag;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Stage;
 * import com.pulumi.snowflake.StageArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleStage = new Stage("exampleStage", StageArgs.builder()
 *             .name("EXAMPLE_STAGE")
 *             .url("s3://com.example.bucket/prefix")
 *             .database("EXAMPLE_DB")
 *             .schema("EXAMPLE_SCHEMA")
 *             .credentials(String.format("AWS_KEY_ID='%s' AWS_SECRET_KEY='%s'", exampleAwsKeyId,exampleAwsSecretKey))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * format is database name | schema name | stage name
 * 
 * ```sh
 * $ pulumi import snowflake:index/stage:Stage example &#39;dbName|schemaName|stageName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/stage:Stage")
public class Stage extends com.pulumi.resources.CustomResource {
    /**
     * A unique ID assigned to the specific stage. The ID has the following format: &amp;lt;snowflakeAccount&amp;gt;*SFCRole=&amp;lt;snowflakeRoleId&amp;gt;*&amp;lt;randomId&amp;gt;
     * 
     */
    @Export(name="awsExternalId", refs={String.class}, tree="[0]")
    private Output<String> awsExternalId;

    /**
     * @return A unique ID assigned to the specific stage. The ID has the following format: &amp;lt;snowflakeAccount&amp;gt;*SFCRole=&amp;lt;snowflakeRoleId&amp;gt;*&amp;lt;randomId&amp;gt;
     * 
     */
    public Output<String> awsExternalId() {
        return this.awsExternalId;
    }
    /**
     * Specifies a comment for the stage.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the stage.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the copy options for the stage.
     * 
     */
    @Export(name="copyOptions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> copyOptions;

    /**
     * @return Specifies the copy options for the stage.
     * 
     */
    public Output<Optional<String>> copyOptions() {
        return Codegen.optional(this.copyOptions);
    }
    /**
     * Specifies the credentials for the stage.
     * 
     */
    @Export(name="credentials", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> credentials;

    /**
     * @return Specifies the credentials for the stage.
     * 
     */
    public Output<Optional<String>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The database in which to create the stage.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
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
    @Export(name="directory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directory;

    /**
     * @return Specifies the directory settings for the stage.
     * 
     */
    public Output<Optional<String>> directory() {
        return Codegen.optional(this.directory);
    }
    /**
     * Specifies the encryption settings for the stage.
     * 
     */
    @Export(name="encryption", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> encryption;

    /**
     * @return Specifies the encryption settings for the stage.
     * 
     */
    public Output<Optional<String>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * Specifies the file format for the stage.
     * 
     */
    @Export(name="fileFormat", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fileFormat;

    /**
     * @return Specifies the file format for the stage.
     * 
     */
    public Output<Optional<String>> fileFormat() {
        return Codegen.optional(this.fileFormat);
    }
    /**
     * Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The schema in which to create the stage.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
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
    @Export(name="snowflakeIamUser", refs={String.class}, tree="[0]")
    private Output<String> snowflakeIamUser;

    /**
     * @return An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
     * 
     */
    public Output<String> snowflakeIamUser() {
        return this.snowflakeIamUser;
    }
    /**
     * Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     * 
     */
    @Export(name="storageIntegration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageIntegration;

    /**
     * @return Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     * 
     */
    public Output<Optional<String>> storageIntegration() {
        return Codegen.optional(this.storageIntegration);
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", refs={List.class,StageTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StageTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<StageTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the URL for the stage.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> url;

    /**
     * @return Specifies the URL for the stage.
     * 
     */
    public Output<Optional<String>> url() {
        return Codegen.optional(this.url);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stage(java.lang.String name) {
        this(name, StageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stage(java.lang.String name, StageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stage(java.lang.String name, StageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stage:Stage", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Stage(java.lang.String name, Output<java.lang.String> id, @Nullable StageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stage:Stage", name, state, makeResourceOptions(options, id), false);
    }

    private static StageArgs makeArgs(StageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StageArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "credentials"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Stage get(java.lang.String name, Output<java.lang.String> id, @Nullable StageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stage(name, id, state, options);
    }
}
