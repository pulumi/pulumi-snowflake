// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.StreamOnTableArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.StreamOnTableState;
import com.pulumi.snowflake.outputs.StreamOnTableAt;
import com.pulumi.snowflake.outputs.StreamOnTableBefore;
import com.pulumi.snowflake.outputs.StreamOnTableDescribeOutput;
import com.pulumi.snowflake.outputs.StreamOnTableShowOutput;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/streamOnTable:StreamOnTable example &#39;&#34;&lt;database_name&gt;&#34;.&#34;&lt;schema_name&gt;&#34;.&#34;&lt;stream_name&gt;&#34;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/streamOnTable:StreamOnTable")
public class StreamOnTable extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether this is an append-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="appendOnly", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> appendOnly;

    /**
     * @return Specifies whether this is an append-only stream. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> appendOnly() {
        return Codegen.optional(this.appendOnly);
    }
    @Export(name="at", refs={StreamOnTableAt.class}, tree="[0]")
    private Output</* @Nullable */ StreamOnTableAt> at;

    public Output<Optional<StreamOnTableAt>> at() {
        return Codegen.optional(this.at);
    }
    @Export(name="before", refs={StreamOnTableBefore.class}, tree="[0]")
    private Output</* @Nullable */ StreamOnTableBefore> before;

    public Output<Optional<StreamOnTableBefore>> before() {
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
    /**
     * Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     * 
     */
    @Export(name="copyGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyGrants;

    /**
     * @return Retains the access permissions from the original stream when a stream is recreated using the OR REPLACE clause. That is sometimes used when the provider detects changes for fields that can not be changed by ALTER. This value will not have any effect when creating a new stream.
     * 
     */
    public Output<Optional<Boolean>> copyGrants() {
        return Codegen.optional(this.copyGrants);
    }
    /**
     * The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,StreamOnTableDescribeOutput.class}, tree="[0,1]")
    private Output<List<StreamOnTableDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE STREAM` for the given stream.
     * 
     */
    public Output<List<StreamOnTableDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
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
     * Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the stream. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    @Export(name="showInitialRows", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> showInitialRows;

    public Output<Optional<String>> showInitialRows() {
        return Codegen.optional(this.showInitialRows);
    }
    /**
     * Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    @Export(name="showOutputs", refs={List.class,StreamOnTableShowOutput.class}, tree="[0,1]")
    private Output<List<StreamOnTableShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW STREAMS` for the given stream.
     * 
     */
    public Output<List<StreamOnTableShowOutput>> showOutputs() {
        return this.showOutputs;
    }
    /**
     * Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Export(name="table", refs={String.class}, tree="[0]")
    private Output<String> table;

    /**
     * @return Specifies an identifier for the table the stream will monitor. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Output<String> table() {
        return this.table;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamOnTable(java.lang.String name) {
        this(name, StreamOnTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamOnTable(java.lang.String name, StreamOnTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamOnTable(java.lang.String name, StreamOnTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/streamOnTable:StreamOnTable", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamOnTable(java.lang.String name, Output<java.lang.String> id, @Nullable StreamOnTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/streamOnTable:StreamOnTable", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamOnTableArgs makeArgs(StreamOnTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamOnTableArgs.Empty : args;
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
    public static StreamOnTable get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamOnTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamOnTable(name, id, state, options);
    }
}
