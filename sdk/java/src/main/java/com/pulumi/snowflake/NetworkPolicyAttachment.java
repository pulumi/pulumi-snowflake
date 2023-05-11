// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.NetworkPolicyAttachmentArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.NetworkPolicyAttachmentState;
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
 * import com.pulumi.snowflake.NetworkPolicyAttachment;
 * import com.pulumi.snowflake.NetworkPolicyAttachmentArgs;
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
 *         var attach = new NetworkPolicyAttachment(&#34;attach&#34;, NetworkPolicyAttachmentArgs.builder()        
 *             .networkPolicyName(&#34;policy&#34;)
 *             .setForAccount(false)
 *             .users(            
 *                 &#34;user1&#34;,
 *                 &#34;user2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment example attachment_policyname
 * ```
 * 
 */
@ResourceType(type="snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment")
public class NetworkPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     * 
     */
    @Export(name="networkPolicyName", type=String.class, parameters={})
    private Output<String> networkPolicyName;

    /**
     * @return Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     * 
     */
    public Output<String> networkPolicyName() {
        return this.networkPolicyName;
    }
    /**
     * Specifies whether the network policy should be applied globally to your Snowflake account\n\n\n\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\n\n\n\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user&#39;s responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
     * 
     */
    @Export(name="setForAccount", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> setForAccount;

    /**
     * @return Specifies whether the network policy should be applied globally to your Snowflake account\n\n\n\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\n\n\n\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user&#39;s responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
     * 
     */
    public Output<Optional<Boolean>> setForAccount() {
        return Codegen.optional(this.setForAccount);
    }
    /**
     * Specifies which users the network policy should be attached to
     * 
     */
    @Export(name="users", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> users;

    /**
     * @return Specifies which users the network policy should be attached to
     * 
     */
    public Output<Optional<List<String>>> users() {
        return Codegen.optional(this.users);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkPolicyAttachment(String name) {
        this(name, NetworkPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkPolicyAttachment(String name, NetworkPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkPolicyAttachment(String name, NetworkPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment", name, args == null ? NetworkPolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkPolicyAttachment(String name, Output<String> id, @Nullable NetworkPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static NetworkPolicyAttachment get(String name, Output<String> id, @Nullable NetworkPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPolicyAttachment(name, id, state, options);
    }
}
