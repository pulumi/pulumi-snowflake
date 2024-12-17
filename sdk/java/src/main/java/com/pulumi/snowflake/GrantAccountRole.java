// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.GrantAccountRoleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.GrantAccountRoleState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is role_name (string) | grantee_object_type (ROLE|USER) | grantee_name (string)
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantAccountRole:GrantAccountRole example &#39;&#34;test_role&#34;|ROLE|&#34;test_parent_role&#34;&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantAccountRole:GrantAccountRole")
public class GrantAccountRole extends com.pulumi.resources.CustomResource {
    /**
     * The fully qualified name of the parent role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     * 
     */
    @Export(name="parentRoleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parentRoleName;

    /**
     * @return The fully qualified name of the parent role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     * 
     */
    public Output<Optional<String>> parentRoleName() {
        return Codegen.optional(this.parentRoleName);
    }
    /**
     * The fully qualified name of the role which will be granted to the user or parent role. For more information about this resource, see docs.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return The fully qualified name of the role which will be granted to the user or parent role. For more information about this resource, see docs.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * The fully qualified name of the user on which specified role will be granted. For more information about this resource, see docs.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userName;

    /**
     * @return The fully qualified name of the user on which specified role will be granted. For more information about this resource, see docs.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrantAccountRole(java.lang.String name) {
        this(name, GrantAccountRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantAccountRole(java.lang.String name, GrantAccountRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantAccountRole(java.lang.String name, GrantAccountRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantAccountRole:GrantAccountRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GrantAccountRole(java.lang.String name, Output<java.lang.String> id, @Nullable GrantAccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantAccountRole:GrantAccountRole", name, state, makeResourceOptions(options, id), false);
    }

    private static GrantAccountRoleArgs makeArgs(GrantAccountRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GrantAccountRoleArgs.Empty : args;
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
    public static GrantAccountRole get(java.lang.String name, Output<java.lang.String> id, @Nullable GrantAccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantAccountRole(name, id, state, options);
    }
}
