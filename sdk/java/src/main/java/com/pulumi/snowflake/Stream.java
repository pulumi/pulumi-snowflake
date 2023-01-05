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
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Stream;
 * import com.pulumi.snowflake.StreamArgs;
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
 *         var stream = new Stream(&#34;stream&#34;, StreamArgs.builder()        
 *             .appendOnly(false)
 *             .comment(&#34;A stream.&#34;)
 *             .database(&#34;database&#34;)
 *             .insertOnly(false)
 *             .onTable(&#34;table&#34;)
 *             .owner(&#34;role1&#34;)
 *             .schema(&#34;schema&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is database name | schema name | stream name
 * 
 * ```sh
 *  $ pulumi import snowflake:index/stream:Stream example &#39;dbName|schemaName|streamName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/stream:Stream")
public class Stream extends com.pulumi.resources.CustomResource {
    /**
     * Type of the stream that will be created.
     * 
     */
    @Export(name="appendOnly", type=Boolean.class, parameters={})
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
    @Export(name="comment", type=String.class, parameters={})
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
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database in which to create the stream.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Create an insert only stream type.
     * 
     */
    @Export(name="insertOnly", type=Boolean.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the identifier for the stream; must be unique for the database and schema in which the stream is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the table the stream will monitor.
     * 
     */
    @Export(name="onTable", type=String.class, parameters={})
    private Output</* @Nullable */ String> onTable;

    /**
     * @return Name of the table the stream will monitor.
     * 
     */
    public Output<Optional<String>> onTable() {
        return Codegen.optional(this.onTable);
    }
    /**
     * Name of the view the stream will monitor.
     * 
     */
    @Export(name="onView", type=String.class, parameters={})
    private Output</* @Nullable */ String> onView;

    /**
     * @return Name of the view the stream will monitor.
     * 
     */
    public Output<Optional<String>> onView() {
        return Codegen.optional(this.onView);
    }
    /**
     * Name of the role that owns the stream.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
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
    @Export(name="schema", type=String.class, parameters={})
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
    @Export(name="showInitialRows", type=Boolean.class, parameters={})
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
    public Stream(String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(String name, StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, StreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stream:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stream(String name, Output<String> id, @Nullable StreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stream:Stream", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Stream get(String name, Output<String> id, @Nullable StreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, state, options);
    }
}
