// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.AccountRoleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.AccountRoleState;
import com.pulumi.snowflake.outputs.AccountRoleShowOutput;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 * 
 * The resource is used for role management, where roles can be assigned privileges and, in turn, granted to users and other roles. When granted to roles they can create hierarchies of privilege structures. For more details, refer to the [official documentation](https://docs.snowflake.com/en/user-guide/security-access-control-overview).
 * 
 * ## Minimal
 * 
 * resource &#34;snowflake.AccountRole&#34; &#34;minimal&#34; {
 *   name = &#34;role_name&#34;
 * }
 * 
 * ## Complete (with every optional set)
 * 
 * resource &#34;snowflake.AccountRole&#34; &#34;complete&#34; {
 *   name    = &#34;role_name&#34;
 *   comment = &#34;my account role&#34;
 * }
 * 
 */
@ResourceType(type="snowflake:index/accountRole:AccountRole")
public class AccountRole extends com.pulumi.resources.CustomResource {
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Outputs the result of `SHOW ROLES` for the given role.
     * 
     */
    @Export(name="showOutputs", refs={List.class,AccountRoleShowOutput.class}, tree="[0,1]")
    private Output<List<AccountRoleShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW ROLES` for the given role.
     * 
     */
    public Output<List<AccountRoleShowOutput>> showOutputs() {
        return this.showOutputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountRole(String name) {
        this(name, AccountRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountRole(String name, @Nullable AccountRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountRole(String name, @Nullable AccountRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/accountRole:AccountRole", name, args == null ? AccountRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountRole(String name, Output<String> id, @Nullable AccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/accountRole:AccountRole", name, state, makeResourceOptions(options, id));
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
    public static AccountRole get(String name, Output<String> id, @Nullable AccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountRole(name, id, state, options);
    }
}
