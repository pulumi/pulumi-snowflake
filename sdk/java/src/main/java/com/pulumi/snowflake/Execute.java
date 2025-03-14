// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ExecuteArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ExecuteState;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/execute:Execute example &#39;&lt;random_uuid&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/execute:Execute")
public class Execute extends com.pulumi.resources.CustomResource {
    /**
     * SQL statement to execute. Forces recreation of resource on change.
     * 
     */
    @Export(name="execute", refs={String.class}, tree="[0]")
    private Output<String> execute;

    /**
     * @return SQL statement to execute. Forces recreation of resource on change.
     * 
     */
    public Output<String> execute() {
        return this.execute;
    }
    /**
     * Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
     * 
     */
    @Export(name="query", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> query;

    /**
     * @return Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
     * 
     */
    public Output<Optional<String>> query() {
        return Codegen.optional(this.query);
    }
    /**
     * List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
     * 
     */
    @Export(name="queryResults", refs={List.class,Map.class,String.class}, tree="[0,[1,2,2]]")
    private Output<List<Map<String,String>>> queryResults;

    /**
     * @return List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
     * 
     */
    public Output<List<Map<String,String>>> queryResults() {
        return this.queryResults;
    }
    /**
     * SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     * 
     */
    @Export(name="revert", refs={String.class}, tree="[0]")
    private Output<String> revert;

    /**
     * @return SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     * 
     */
    public Output<String> revert() {
        return this.revert;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Execute(java.lang.String name) {
        this(name, ExecuteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Execute(java.lang.String name, ExecuteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Execute(java.lang.String name, ExecuteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/execute:Execute", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Execute(java.lang.String name, Output<java.lang.String> id, @Nullable ExecuteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/execute:Execute", name, state, makeResourceOptions(options, id), false);
    }

    private static ExecuteArgs makeArgs(ExecuteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ExecuteArgs.Empty : args;
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
    public static Execute get(java.lang.String name, Output<java.lang.String> id, @Nullable ExecuteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Execute(name, id, state, options);
    }
}
