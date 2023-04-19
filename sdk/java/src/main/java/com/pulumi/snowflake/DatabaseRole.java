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
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="snowflake:index/databaseRole:DatabaseRole")
public class DatabaseRole extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the database role.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the database role.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the database role.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database in which to create the database role.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies the identifier for the database role.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the identifier for the database role.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseRole(String name) {
        this(name, DatabaseRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseRole(String name, DatabaseRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseRole(String name, DatabaseRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/databaseRole:DatabaseRole", name, args == null ? DatabaseRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseRole(String name, Output<String> id, @Nullable DatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/databaseRole:DatabaseRole", name, state, makeResourceOptions(options, id));
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
    public static DatabaseRole get(String name, Output<String> id, @Nullable DatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseRole(name, id, state, options);
    }
}
