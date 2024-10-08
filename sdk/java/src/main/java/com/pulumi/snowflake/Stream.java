// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.StreamArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.StreamState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is database name | schema name | stream name
 * 
 * ```sh
 * $ pulumi import snowflake:index/stream:Stream example &#39;dbName|schemaName|streamName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/stream:Stream")
public class Stream extends com.pulumi.resources.CustomResource {
    /**
     * Type of the stream that will be created.
     * 
     */
    @Export(name="appendOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> appendOnly;

    /**
     * @return Type of the stream that will be created.
     * 
     */
    public Output<Optional<Boolean>> appendOnly() {
        return Codegen.optional(this.appendOnly);
    }
    /**
     * Specifies a comment for the stream.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the stream.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the stream.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the stream.
     * 
     */
    public Output<String> database() {
        return this.database;
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
     * Create an insert only stream type.
     * 
     */
    @Export(name="insertOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> insertOnly;

    /**
     * @return Create an insert only stream type.
     * 
     */
    public Output<Optional<Boolean>> insertOnly() {
        return Codegen.optional(this.insertOnly);
    }
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies an identifier for the stage the stream will monitor.
     * 
     */
    @Export(name="onStage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onStage;

    /**
     * @return Specifies an identifier for the stage the stream will monitor.
     * 
     */
    public Output<Optional<String>> onStage() {
        return Codegen.optional(this.onStage);
    }
    /**
     * Specifies an identifier for the table the stream will monitor.
     * 
     */
    @Export(name="onTable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onTable;

    /**
     * @return Specifies an identifier for the table the stream will monitor.
     * 
     */
    public Output<Optional<String>> onTable() {
        return Codegen.optional(this.onTable);
    }
    /**
     * Specifies an identifier for the view the stream will monitor.
     * 
     */
    @Export(name="onView", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onView;

    /**
     * @return Specifies an identifier for the view the stream will monitor.
     * 
     */
    public Output<Optional<String>> onView() {
        return Codegen.optional(this.onView);
    }
    /**
     * Name of the role that owns the stream.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Name of the role that owns the stream.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The schema in which to create the stream.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the stream.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     * 
     */
    @Export(name="showInitialRows", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> showInitialRows;

    /**
     * @return Specifies whether to return all existing rows in the source table as row inserts the first time the stream is consumed.
     * 
     */
    public Output<Optional<Boolean>> showInitialRows() {
        return Codegen.optional(this.showInitialRows);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stream(java.lang.String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(java.lang.String name, StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(java.lang.String name, StreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stream:Stream", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Stream(java.lang.String name, Output<java.lang.String> id, @Nullable StreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stream:Stream", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamArgs makeArgs(StreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamArgs.Empty : args;
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
    public static Stream get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, state, options);
    }
}
