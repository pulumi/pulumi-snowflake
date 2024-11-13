// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.SecondaryConnectionArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.SecondaryConnectionState;
import com.pulumi.snowflake.outputs.SecondaryConnectionShowOutput;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/secondaryConnection:SecondaryConnection example &#39;secondary_connection_name&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/secondaryConnection:SecondaryConnection")
public class SecondaryConnection extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
     * 
     */
    @Export(name="asReplicaOf", refs={String.class}, tree="[0]")
    private Output<String> asReplicaOf;

    /**
     * @return Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
     * 
     */
    public Output<String> asReplicaOf() {
        return this.asReplicaOf;
    }
    /**
     * Specifies a comment for the secondary connection.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the secondary connection.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
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
     * Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
     * 
     */
    @Export(name="isPrimary", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isPrimary;

    /**
     * @return Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
     * 
     */
    public Output<Boolean> isPrimary() {
        return this.isPrimary;
    }
    /**
     * String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `&#34;`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Outputs the result of `SHOW CONNECTIONS` for the given connection.
     * 
     */
    @Export(name="showOutputs", refs={List.class,SecondaryConnectionShowOutput.class}, tree="[0,1]")
    private Output<List<SecondaryConnectionShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW CONNECTIONS` for the given connection.
     * 
     */
    public Output<List<SecondaryConnectionShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecondaryConnection(java.lang.String name) {
        this(name, SecondaryConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecondaryConnection(java.lang.String name, SecondaryConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecondaryConnection(java.lang.String name, SecondaryConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/secondaryConnection:SecondaryConnection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecondaryConnection(java.lang.String name, Output<java.lang.String> id, @Nullable SecondaryConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/secondaryConnection:SecondaryConnection", name, state, makeResourceOptions(options, id), false);
    }

    private static SecondaryConnectionArgs makeArgs(SecondaryConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecondaryConnectionArgs.Empty : args;
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
    public static SecondaryConnection get(java.lang.String name, Output<java.lang.String> id, @Nullable SecondaryConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecondaryConnection(name, id, state, options);
    }
}
