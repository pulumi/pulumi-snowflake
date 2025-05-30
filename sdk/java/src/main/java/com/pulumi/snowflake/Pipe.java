// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.PipeArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.PipeState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is database name | schema name | pipe name
 * 
 * ```sh
 * $ pulumi import snowflake:index/pipe:Pipe example &#39;dbName|schemaName|pipeName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/pipe:Pipe")
public class Pipe extends com.pulumi.resources.CustomResource {
    /**
     * (Default: `false`) Specifies a auto_ingest param for the pipe.
     * 
     */
    @Export(name="autoIngest", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoIngest;

    /**
     * @return (Default: `false`) Specifies a auto_ingest param for the pipe.
     * 
     */
    public Output<Optional<Boolean>> autoIngest() {
        return Codegen.optional(this.autoIngest);
    }
    /**
     * Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     * 
     */
    @Export(name="awsSnsTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSnsTopicArn;

    /**
     * @return Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     * 
     */
    public Output<Optional<String>> awsSnsTopicArn() {
        return Codegen.optional(this.awsSnsTopicArn);
    }
    /**
     * Specifies a comment for the pipe.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the pipe.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the copy statement for the pipe.
     * 
     */
    @Export(name="copyStatement", refs={String.class}, tree="[0]")
    private Output<String> copyStatement;

    /**
     * @return Specifies the copy statement for the pipe.
     * 
     */
    public Output<String> copyStatement() {
        return this.copyStatement;
    }
    /**
     * The database in which to create the pipe.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the pipe.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies the name of the notification integration used for error notifications.
     * 
     */
    @Export(name="errorIntegration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> errorIntegration;

    /**
     * @return Specifies the name of the notification integration used for error notifications.
     * 
     */
    public Output<Optional<String>> errorIntegration() {
        return Codegen.optional(this.errorIntegration);
    }
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Export(name="fullyQualifiedName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * Specifies an integration for the pipe.
     * 
     */
    @Export(name="integration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> integration;

    /**
     * @return Specifies an integration for the pipe.
     * 
     */
    public Output<Optional<String>> integration() {
        return Codegen.optional(this.integration);
    }
    /**
     * Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
     * 
     */
    @Export(name="notificationChannel", refs={String.class}, tree="[0]")
    private Output<String> notificationChannel;

    /**
     * @return Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
     * 
     */
    public Output<String> notificationChannel() {
        return this.notificationChannel;
    }
    /**
     * Name of the role that owns the pipe.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Name of the role that owns the pipe.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The schema in which to create the pipe.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the pipe.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipe(java.lang.String name) {
        this(name, PipeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipe(java.lang.String name, PipeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipe(java.lang.String name, PipeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/pipe:Pipe", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Pipe(java.lang.String name, Output<java.lang.String> id, @Nullable PipeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/pipe:Pipe", name, state, makeResourceOptions(options, id), false);
    }

    private static PipeArgs makeArgs(PipeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PipeArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Pipe get(java.lang.String name, Output<java.lang.String> id, @Nullable PipeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipe(name, id, state, options);
    }
}
