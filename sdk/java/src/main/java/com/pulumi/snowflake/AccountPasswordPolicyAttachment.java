// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.AccountPasswordPolicyAttachmentArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.AccountPasswordPolicyAttachmentState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Specifies the password policy to use for the current account. To set the password policy of a different account, use a provider alias.
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
 * import com.pulumi.snowflake.PasswordPolicy;
 * import com.pulumi.snowflake.PasswordPolicyArgs;
 * import com.pulumi.snowflake.AccountPasswordPolicyAttachment;
 * import com.pulumi.snowflake.AccountPasswordPolicyAttachmentArgs;
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
 *         var default_ = new PasswordPolicy("default", PasswordPolicyArgs.builder()
 *             .database("prod")
 *             .schema("security")
 *             .name("default_policy")
 *             .build());
 * 
 *         var attachment = new AccountPasswordPolicyAttachment("attachment", AccountPasswordPolicyAttachmentArgs.builder()
 *             .passwordPolicy(default_.qualifiedName())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment")
public class AccountPasswordPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Qualified name (`&#34;db&#34;.&#34;schema&#34;.&#34;policy_name&#34;`) of the password policy to apply to the current account.
     * 
     */
    @Export(name="passwordPolicy", refs={String.class}, tree="[0]")
    private Output<String> passwordPolicy;

    /**
     * @return Qualified name (`&#34;db&#34;.&#34;schema&#34;.&#34;policy_name&#34;`) of the password policy to apply to the current account.
     * 
     */
    public Output<String> passwordPolicy() {
        return this.passwordPolicy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountPasswordPolicyAttachment(String name) {
        this(name, AccountPasswordPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountPasswordPolicyAttachment(String name, AccountPasswordPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountPasswordPolicyAttachment(String name, AccountPasswordPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private AccountPasswordPolicyAttachment(String name, Output<String> id, @Nullable AccountPasswordPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment", name, state, makeResourceOptions(options, id));
    }

    private static AccountPasswordPolicyAttachmentArgs makeArgs(AccountPasswordPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountPasswordPolicyAttachmentArgs.Empty : args;
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
    public static AccountPasswordPolicyAttachment get(String name, Output<String> id, @Nullable AccountPasswordPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountPasswordPolicyAttachment(name, id, state, options);
    }
}
