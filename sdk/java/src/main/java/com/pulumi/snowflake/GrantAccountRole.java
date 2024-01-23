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
 * ## Example Usage
 * ### grant account role to account role
 * ##################################
 * 
 * resource &#34;snowflake_role&#34; &#34;role&#34; {
 *   name = var.role_name
 * }
 * 
 * resource &#34;snowflake_role&#34; &#34;parent_role&#34; {
 *   name = var.parent_role_name
 * }
 * 
 * resource &#34;snowflake_grant_account_role&#34; &#34;g&#34; {
 *   role_name        = snowflake_role.role.name
 *   parent_role_name = snowflake_role.parent_role.name
 * }
 * 
 * ##################################
 * 
 * ## Import
 * 
 * format is role_name (string) | grantee_object_type (ROLE|USER) | grantee_name (string)
 * 
 * ```sh
 *  $ pulumi import snowflake:index/grantAccountRole:GrantAccountRole &#34;\&#34;test_role\&#34;|ROLE|\&#34;test_parent_role\&#34;&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantAccountRole:GrantAccountRole")
public class GrantAccountRole extends com.pulumi.resources.CustomResource {
    /**
     * The fully qualified name of the parent role which will create a parent-child relationship between the roles.
     * 
     */
    @Export(name="parentRoleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parentRoleName;

    /**
     * @return The fully qualified name of the parent role which will create a parent-child relationship between the roles.
     * 
     */
    public Output<Optional<String>> parentRoleName() {
        return Codegen.optional(this.parentRoleName);
    }
    /**
     * The fully qualified name of the role which will be granted to the user or parent role.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return The fully qualified name of the role which will be granted to the user or parent role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * The fully qualified name of the user on which specified role will be granted.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userName;

    /**
     * @return The fully qualified name of the user on which specified role will be granted.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrantAccountRole(String name) {
        this(name, GrantAccountRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantAccountRole(String name, GrantAccountRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantAccountRole(String name, GrantAccountRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantAccountRole:GrantAccountRole", name, args == null ? GrantAccountRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrantAccountRole(String name, Output<String> id, @Nullable GrantAccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantAccountRole:GrantAccountRole", name, state, makeResourceOptions(options, id));
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
    public static GrantAccountRole get(String name, Output<String> id, @Nullable GrantAccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantAccountRole(name, id, state, options);
    }
}
