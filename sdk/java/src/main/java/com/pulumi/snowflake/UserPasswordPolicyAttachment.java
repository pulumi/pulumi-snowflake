// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.UserPasswordPolicyAttachmentArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.UserPasswordPolicyAttachmentState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Specifies the password policy to use for a certain user.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.User;
 * import com.pulumi.snowflake.UserArgs;
 * import com.pulumi.snowflake.PasswordPolicy;
 * import com.pulumi.snowflake.PasswordPolicyArgs;
 * import com.pulumi.snowflake.UserPasswordPolicyAttachment;
 * import com.pulumi.snowflake.UserPasswordPolicyAttachmentArgs;
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
 *         var user = new User("user", UserArgs.builder()
 *             .name("USER_NAME")
 *             .build());
 * 
 *         var pp = new PasswordPolicy("pp", PasswordPolicyArgs.builder()
 *             .database("prod")
 *             .schema("security")
 *             .name("default_policy")
 *             .build());
 * 
 *         var ppa = new UserPasswordPolicyAttachment("ppa", UserPasswordPolicyAttachmentArgs.builder()
 *             .passwordPolicyName(Output.tuple(pp.database(), pp.schema(), pp.name()).applyValue(values -> {
 *                 var database = values.t1;
 *                 var schema = values.t2;
 *                 var name = values.t3;
 *                 return String.format("\"%s\".\"%s\".\"%s\"", database,schema,name);
 *             }))
 *             .userName(user.name())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment example &#34;MY_DATABASE|MY_SCHEMA|PASSWORD_POLICY_NAME|USER_NAME&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment")
public class UserPasswordPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Fully qualified name of the password policy
     * 
     */
    @Export(name="passwordPolicyName", refs={String.class}, tree="[0]")
    private Output<String> passwordPolicyName;

    /**
     * @return Fully qualified name of the password policy
     * 
     */
    public Output<String> passwordPolicyName() {
        return this.passwordPolicyName;
    }
    /**
     * User name of the user you want to attach the password policy to
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return User name of the user you want to attach the password policy to
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPasswordPolicyAttachment(java.lang.String name) {
        this(name, UserPasswordPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPasswordPolicyAttachment(java.lang.String name, UserPasswordPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPasswordPolicyAttachment(java.lang.String name, UserPasswordPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private UserPasswordPolicyAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable UserPasswordPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static UserPasswordPolicyAttachmentArgs makeArgs(UserPasswordPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserPasswordPolicyAttachmentArgs.Empty : args;
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
    public static UserPasswordPolicyAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable UserPasswordPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPasswordPolicyAttachment(name, id, state, options);
    }
}
