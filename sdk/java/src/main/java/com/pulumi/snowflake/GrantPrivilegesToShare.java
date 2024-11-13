// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.GrantPrivilegesToShareArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.GrantPrivilegesToShareState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### OnView
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare example &#39;&lt;share_name&gt;|&lt;privileges&gt;|OnView|&lt;database_name&gt;.&lt;schema_name&gt;.&lt;view_name&gt;&#39;`
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare")
public class GrantPrivilegesToShare extends com.pulumi.resources.CustomResource {
    /**
     * The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     * 
     */
    @Export(name="onAllTablesInSchema", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onAllTablesInSchema;

    /**
     * @return The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     * 
     */
    public Output<Optional<String>> onAllTablesInSchema() {
        return Codegen.optional(this.onAllTablesInSchema);
    }
    /**
     * The fully qualified name of the database on which privileges will be granted.
     * 
     */
    @Export(name="onDatabase", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onDatabase;

    /**
     * @return The fully qualified name of the database on which privileges will be granted.
     * 
     */
    public Output<Optional<String>> onDatabase() {
        return Codegen.optional(this.onDatabase);
    }
    /**
     * The fully qualified name of the function on which privileges will be granted.
     * 
     */
    @Export(name="onFunction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onFunction;

    /**
     * @return The fully qualified name of the function on which privileges will be granted.
     * 
     */
    public Output<Optional<String>> onFunction() {
        return Codegen.optional(this.onFunction);
    }
    /**
     * The fully qualified name of the schema on which privileges will be granted.
     * 
     */
    @Export(name="onSchema", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onSchema;

    /**
     * @return The fully qualified name of the schema on which privileges will be granted.
     * 
     */
    public Output<Optional<String>> onSchema() {
        return Codegen.optional(this.onSchema);
    }
    /**
     * The fully qualified name of the table on which privileges will be granted.
     * 
     */
    @Export(name="onTable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onTable;

    /**
     * @return The fully qualified name of the table on which privileges will be granted.
     * 
     */
    public Output<Optional<String>> onTable() {
        return Codegen.optional(this.onTable);
    }
    /**
     * The fully qualified name of the tag on which privileges will be granted.
     * 
     */
    @Export(name="onTag", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onTag;

    /**
     * @return The fully qualified name of the tag on which privileges will be granted.
     * 
     */
    public Output<Optional<String>> onTag() {
        return Codegen.optional(this.onTag);
    }
    /**
     * The fully qualified name of the view on which privileges will be granted.
     * 
     */
    @Export(name="onView", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onView;

    /**
     * @return The fully qualified name of the view on which privileges will be granted.
     * 
     */
    public Output<Optional<String>> onView() {
        return Codegen.optional(this.onView);
    }
    /**
     * The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
     * 
     */
    @Export(name="privileges", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privileges;

    /**
     * @return The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
     * 
     */
    public Output<List<String>> privileges() {
        return this.privileges;
    }
    /**
     * The fully qualified name of the share on which privileges will be granted.
     * 
     */
    @Export(name="toShare", refs={String.class}, tree="[0]")
    private Output<String> toShare;

    /**
     * @return The fully qualified name of the share on which privileges will be granted.
     * 
     */
    public Output<String> toShare() {
        return this.toShare;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrantPrivilegesToShare(java.lang.String name) {
        this(name, GrantPrivilegesToShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantPrivilegesToShare(java.lang.String name, GrantPrivilegesToShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantPrivilegesToShare(java.lang.String name, GrantPrivilegesToShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GrantPrivilegesToShare(java.lang.String name, Output<java.lang.String> id, @Nullable GrantPrivilegesToShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare", name, state, makeResourceOptions(options, id), false);
    }

    private static GrantPrivilegesToShareArgs makeArgs(GrantPrivilegesToShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GrantPrivilegesToShareArgs.Empty : args;
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
    public static GrantPrivilegesToShare get(java.lang.String name, Output<java.lang.String> id, @Nullable GrantPrivilegesToShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantPrivilegesToShare(name, id, state, options);
    }
}
