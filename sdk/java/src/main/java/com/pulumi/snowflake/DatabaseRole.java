// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.DatabaseRoleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.DatabaseRoleState;
import com.pulumi.snowflake.outputs.DatabaseRoleShowOutput;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/databaseRole:DatabaseRole example &#39;&#34;&lt;database_name&gt;&#34;.&#34;&lt;database_role_name&gt;&#34;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/databaseRole:DatabaseRole")
public class DatabaseRole extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the database role.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the database role.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
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
     * Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Outputs the result of `SHOW DATABASE ROLES` for the given database role. Note that this value will be only recomputed whenever comment field changes.
     * 
     */
    @Export(name="showOutputs", refs={List.class,DatabaseRoleShowOutput.class}, tree="[0,1]")
    private Output<List<DatabaseRoleShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW DATABASE ROLES` for the given database role. Note that this value will be only recomputed whenever comment field changes.
     * 
     */
    public Output<List<DatabaseRoleShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseRole(java.lang.String name) {
        this(name, DatabaseRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseRole(java.lang.String name, DatabaseRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseRole(java.lang.String name, DatabaseRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/databaseRole:DatabaseRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabaseRole(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/databaseRole:DatabaseRole", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseRoleArgs makeArgs(DatabaseRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseRoleArgs.Empty : args;
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
    public static DatabaseRole get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseRole(name, id, state, options);
    }
}
