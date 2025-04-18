// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.SequenceArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.SequenceState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is database name | schema name | sequence name
 * 
 * ```sh
 * $ pulumi import snowflake:index/sequence:Sequence example &#39;dbName|schemaName|sequenceName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/sequence:Sequence")
public class Sequence extends com.pulumi.resources.CustomResource {
    /**
     * (Default: ``) Specifies a comment for the sequence.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return (Default: ``) Specifies a comment for the sequence.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the sequence. Don&#39;t use the | character.
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
     * (Default: `1`) The amount the sequence will increase by each time it is used
     * 
     */
    @Export(name="increment", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> increment;

    /**
     * @return (Default: `1`) The amount the sequence will increase by each time it is used
     * 
     */
    public Output<Optional<Integer>> increment() {
        return Codegen.optional(this.increment);
    }
    /**
     * Specifies the name for the sequence.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name for the sequence.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The increment sequence interval.
     * 
     */
    @Export(name="nextValue", refs={Integer.class}, tree="[0]")
    private Output<Integer> nextValue;

    /**
     * @return The increment sequence interval.
     * 
     */
    public Output<Integer> nextValue() {
        return this.nextValue;
    }
    /**
     * (Default: `ORDER`) The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
     * 
     */
    @Export(name="ordering", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ordering;

    /**
     * @return (Default: `ORDER`) The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
     * 
     */
    public Output<Optional<String>> ordering() {
        return Codegen.optional(this.ordering);
    }
    /**
     * The schema in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the sequence. Don&#39;t use the | character.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Sequence(java.lang.String name) {
        this(name, SequenceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Sequence(java.lang.String name, SequenceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Sequence(java.lang.String name, SequenceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/sequence:Sequence", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Sequence(java.lang.String name, Output<java.lang.String> id, @Nullable SequenceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/sequence:Sequence", name, state, makeResourceOptions(options, id), false);
    }

    private static SequenceArgs makeArgs(SequenceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SequenceArgs.Empty : args;
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
    public static Sequence get(java.lang.String name, Output<java.lang.String> id, @Nullable SequenceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Sequence(name, id, state, options);
    }
}
