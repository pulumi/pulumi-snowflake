// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.StreamOnExternalTableArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.StreamOnExternalTableState;
import com.pulumi.snowflake.outputs.StreamOnExternalTableAt;
import com.pulumi.snowflake.outputs.StreamOnExternalTableBefore;
import com.pulumi.snowflake.outputs.StreamOnExternalTableDescribeOutput;
import com.pulumi.snowflake.outputs.StreamOnExternalTableShowOutput;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/streamOnExternalTable:StreamOnExternalTable example &#39;&#34;&lt;database_name&gt;&#34;.&#34;&lt;schema_name&gt;&#34;.&#34;&lt;stream_name&gt;&#34;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/streamOnExternalTable:StreamOnExternalTable")
public class StreamOnExternalTable extends com.pulumi.resources.CustomResource {
    @Export(name="at", refs={StreamOnExternalTableAt.class}, tree="[0]")
    private Output</* @Nullable */ StreamOnExternalTableAt> at;

    public Output<Optional<StreamOnExternalTableAt>> at() {
        return Codegen.optional(this.at);
    }
    @Export(name="before", refs={StreamOnExternalTableBefore.class}, tree="[0]")
    private Output</* @Nullable */ StreamOnExternalTableBefore> before;

    public Output<Optional<StreamOnExternalTableBefore>> before() {
        return Codegen.optional(this.before);
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
    @Export(name="copyGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyGrants;

    public Output<Optional<Boolean>> copyGrants() {
        return Codegen.optional(this.copyGrants);
    }
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,StreamOnExternalTableDescribeOutput.class}, tree="[0,1]")
    private Output<List<StreamOnExternalTableDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    public Output<List<StreamOnExternalTableDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`. For more information about this resource, see docs.
     * 
     */
    @Export(name="externalTable", refs={String.class}, tree="[0]")
    private Output<String> externalTable;

    /**
     * @return Specifies an identifier for the external table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`. For more information about this resource, see docs.
     * 
     */
    public Output<String> externalTable() {
        return this.externalTable;
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
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an insert-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="insertOnly", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> insertOnly;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether this is an insert-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> insertOnly() {
        return Codegen.optional(this.insertOnly);
    }
    /**
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    @Export(name="showOutputs", refs={List.class,StreamOnExternalTableShowOutput.class}, tree="[0,1]")
    private Output<List<StreamOnExternalTableShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    public Output<List<StreamOnExternalTableShowOutput>> showOutputs() {
        return this.showOutputs;
    }
    @Export(name="stale", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> stale;

    public Output<Boolean> stale() {
        return this.stale;
    }
    /**
     * Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
     * 
     */
    @Export(name="streamType", refs={String.class}, tree="[0]")
    private Output<String> streamType;

    /**
     * @return Specifies a type for the stream. This field is used for checking external changes and recreating the resources if needed.
     * 
     */
    public Output<String> streamType() {
        return this.streamType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamOnExternalTable(java.lang.String name) {
        this(name, StreamOnExternalTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamOnExternalTable(java.lang.String name, StreamOnExternalTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamOnExternalTable(java.lang.String name, StreamOnExternalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/streamOnExternalTable:StreamOnExternalTable", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamOnExternalTable(java.lang.String name, Output<java.lang.String> id, @Nullable StreamOnExternalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/streamOnExternalTable:StreamOnExternalTable", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamOnExternalTableArgs makeArgs(StreamOnExternalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamOnExternalTableArgs.Empty : args;
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
    public static StreamOnExternalTable get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamOnExternalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamOnExternalTable(name, id, state, options);
    }
}
