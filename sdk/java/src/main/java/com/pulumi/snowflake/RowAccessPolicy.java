// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.RowAccessPolicyArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.RowAccessPolicyState;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is database name | schema name | policy name
 * 
 * ```sh
 * $ pulumi import snowflake:index/rowAccessPolicy:RowAccessPolicy example &#39;dbName|schemaName|policyName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/rowAccessPolicy:RowAccessPolicy")
public class RowAccessPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the row access policy.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the row access policy.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the row access policy.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the row access policy.
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
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     * 
     */
    @Export(name="rowAccessExpression", refs={String.class}, tree="[0]")
    private Output<String> rowAccessExpression;

    /**
     * @return Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     * 
     */
    public Output<String> rowAccessExpression() {
        return this.rowAccessExpression;
    }
    /**
     * The schema in which to create the row access policy.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the row access policy.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     * 
     */
    @Export(name="signature", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> signature;

    /**
     * @return Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     * 
     */
    public Output<Map<String,String>> signature() {
        return this.signature;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RowAccessPolicy(java.lang.String name) {
        this(name, RowAccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RowAccessPolicy(java.lang.String name, RowAccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RowAccessPolicy(java.lang.String name, RowAccessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/rowAccessPolicy:RowAccessPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RowAccessPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable RowAccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/rowAccessPolicy:RowAccessPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static RowAccessPolicyArgs makeArgs(RowAccessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RowAccessPolicyArgs.Empty : args;
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
    public static RowAccessPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable RowAccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RowAccessPolicy(name, id, state, options);
    }
}
