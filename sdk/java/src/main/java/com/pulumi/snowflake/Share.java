// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ShareArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ShareState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.snowflake.Share;
 * import com.pulumi.snowflake.ShareArgs;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.DatabaseArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var test = new Share("test", ShareArgs.builder()
 *             .name("share_name")
 *             .comment("cool comment")
 *             .accounts("organizationName.accountName")
 *             .build());
 * 
 *         var example = new Database("example", DatabaseArgs.builder()
 *             .name("test")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(test)
 *                 .build());
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
 * $ pulumi import snowflake:index/share:Share example name
 * ```
 * 
 */
@ResourceType(type="snowflake:index/share:Share")
public class Share extends com.pulumi.resources.CustomResource {
    /**
     * A list of accounts to be added to the share. Values should not be the account locator, but in the form of &#39;organization*name.account*name
     * 
     */
    @Export(name="accounts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> accounts;

    /**
     * @return A list of accounts to be added to the share. Values should not be the account locator, but in the form of &#39;organization*name.account*name
     * 
     */
    public Output<Optional<List<String>>> accounts() {
        return Codegen.optional(this.accounts);
    }
    /**
     * Specifies a comment for the managed account.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the managed account.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the identifier for the share; must be unique for the account in which the share is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the share; must be unique for the account in which the share is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Share(java.lang.String name) {
        this(name, ShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Share(java.lang.String name, @Nullable ShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Share(java.lang.String name, @Nullable ShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/share:Share", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Share(java.lang.String name, Output<java.lang.String> id, @Nullable ShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/share:Share", name, state, makeResourceOptions(options, id), false);
    }

    private static ShareArgs makeArgs(@Nullable ShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ShareArgs.Empty : args;
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
    public static Share get(java.lang.String name, Output<java.lang.String> id, @Nullable ShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Share(name, id, state, options);
    }
}
