// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.UserGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.UserGrantState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.UserGrant;
 * import com.pulumi.snowflake.UserGrantArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var grant = new UserGrant(&#34;grant&#34;, UserGrantArgs.builder()        
 *             .privilege(&#34;MONITOR&#34;)
 *             .roles(            
 *                 &#34;role1&#34;,
 *                 &#34;role2&#34;)
 *             .userName(&#34;user&#34;)
 *             .withGrantOption(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is username | privilege | with_grant_option |roles
 * 
 * ```sh
 *  $ pulumi import snowflake:index/userGrant:UserGrant example &#39;USERNAME|MONITOR|false|role1,role2&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/userGrant:UserGrant")
public class UserGrant extends com.pulumi.resources.CustomResource {
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    @Export(name="enableMultipleGrants", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableMultipleGrants;

    /**
     * @return When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    public Output<Optional<Boolean>> enableMultipleGrants() {
        return Codegen.optional(this.enableMultipleGrants);
    }
    /**
     * The privilege to grant on the user.
     * 
     */
    @Export(name="privilege", type=String.class, parameters={})
    private Output<String> privilege;

    /**
     * @return The privilege to grant on the user.
     * 
     */
    public Output<String> privilege() {
        return this.privilege;
    }
    /**
     * Grants privilege to these roles.
     * 
     */
    @Export(name="roles", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<Optional<List<String>>> roles() {
        return Codegen.optional(this.roles);
    }
    /**
     * The name of the user on which to grant privileges.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The name of the user on which to grant privileges.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Export(name="withGrantOption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> withGrantOption;

    /**
     * @return When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Output<Optional<Boolean>> withGrantOption() {
        return Codegen.optional(this.withGrantOption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGrant(String name) {
        this(name, UserGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGrant(String name, UserGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGrant(String name, UserGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/userGrant:UserGrant", name, args == null ? UserGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGrant(String name, Output<String> id, @Nullable UserGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/userGrant:UserGrant", name, state, makeResourceOptions(options, id));
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
    public static UserGrant get(String name, Output<String> id, @Nullable UserGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGrant(name, id, state, options);
    }
}
