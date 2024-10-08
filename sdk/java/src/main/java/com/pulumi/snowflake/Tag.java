// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.TagArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.TagState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is database name | schema name | tag name
 * 
 * ```sh
 * $ pulumi import snowflake:index/tag:Tag example &#39;dbName|schemaName|tagName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * List of allowed values for the tag.
     * 
     */
    @Export(name="allowedValues", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedValues;

    /**
     * @return List of allowed values for the tag.
     * 
     */
    public Output<Optional<List<String>>> allowedValues() {
        return Codegen.optional(this.allowedValues);
    }
    /**
     * Specifies a comment for the tag.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the tag.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the tag.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the tag.
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
     * Specifies the identifier for the tag; must be unique for the database in which the tag is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the tag; must be unique for the database in which the tag is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The schema in which to create the tag.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the tag.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(java.lang.String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(java.lang.String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(java.lang.String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tag:Tag", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Tag(java.lang.String name, Output<java.lang.String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tag:Tag", name, state, makeResourceOptions(options, id), false);
    }

    private static TagArgs makeArgs(TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TagArgs.Empty : args;
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
    public static Tag get(java.lang.String name, Output<java.lang.String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
