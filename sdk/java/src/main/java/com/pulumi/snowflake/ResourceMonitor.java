// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ResourceMonitorArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ResourceMonitorState;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.snowflake.ResourceMonitor;
 * import com.pulumi.snowflake.ResourceMonitorArgs;
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
 *         var monitor = new ResourceMonitor("monitor", ResourceMonitorArgs.builder()
 *             .name("monitor")
 *             .creditQuota(100)
 *             .frequency("DAILY")
 *             .startTimestamp("2020-12-07 00:00")
 *             .endTimestamp("2021-12-07 00:00")
 *             .notifyTriggers(            
 *                 40,
 *                 50)
 *             .suspendTriggers(50)
 *             .suspendImmediateTriggers(90)
 *             .notifyUsers(            
 *                 "USERONE",
 *                 "USERTWO")
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
 * format is the resource monitor name
 * 
 * ```sh
 * $ pulumi import snowflake:index/resourceMonitor:ResourceMonitor example &#39;resourceMonitorName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/resourceMonitor:ResourceMonitor")
public class ResourceMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The number of credits allocated monthly to the resource monitor.
     * 
     */
    @Export(name="creditQuota", refs={Integer.class}, tree="[0]")
    private Output<Integer> creditQuota;

    /**
     * @return The number of credits allocated monthly to the resource monitor.
     * 
     */
    public Output<Integer> creditQuota() {
        return this.creditQuota;
    }
    /**
     * The date and time when the resource monitor suspends the assigned warehouses.
     * 
     */
    @Export(name="endTimestamp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endTimestamp;

    /**
     * @return The date and time when the resource monitor suspends the assigned warehouses.
     * 
     */
    public Output<Optional<String>> endTimestamp() {
        return Codegen.optional(this.endTimestamp);
    }
    /**
     * The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
     * 
     */
    @Export(name="frequency", refs={String.class}, tree="[0]")
    private Output<String> frequency;

    /**
     * @return The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
     * 
     */
    public Output<String> frequency() {
        return this.frequency;
    }
    /**
     * Identifier for the resource monitor; must be unique for your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier for the resource monitor; must be unique for your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of percentage thresholds at which to send an alert to subscribed users.
     * 
     */
    @Export(name="notifyTriggers", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> notifyTriggers;

    /**
     * @return A list of percentage thresholds at which to send an alert to subscribed users.
     * 
     */
    public Output<Optional<List<Integer>>> notifyTriggers() {
        return Codegen.optional(this.notifyTriggers);
    }
    /**
     * Specifies the list of users to receive email notifications on resource monitors.
     * 
     */
    @Export(name="notifyUsers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> notifyUsers;

    /**
     * @return Specifies the list of users to receive email notifications on resource monitors.
     * 
     */
    public Output<Optional<List<String>>> notifyUsers() {
        return Codegen.optional(this.notifyUsers);
    }
    /**
     * Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
     * 
     */
    @Export(name="setForAccount", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> setForAccount;

    /**
     * @return Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
     * 
     */
    public Output<Optional<Boolean>> setForAccount() {
        return Codegen.optional(this.setForAccount);
    }
    /**
     * The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
     * 
     */
    @Export(name="startTimestamp", refs={String.class}, tree="[0]")
    private Output<String> startTimestamp;

    /**
     * @return The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
     * 
     */
    public Output<String> startTimestamp() {
        return this.startTimestamp;
    }
    /**
     * The number that represents the percentage threshold at which to immediately suspend all warehouses.
     * 
     */
    @Export(name="suspendImmediateTrigger", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> suspendImmediateTrigger;

    /**
     * @return The number that represents the percentage threshold at which to immediately suspend all warehouses.
     * 
     */
    public Output<Optional<Integer>> suspendImmediateTrigger() {
        return Codegen.optional(this.suspendImmediateTrigger);
    }
    /**
     * A list of percentage thresholds at which to suspend all warehouses.
     * 
     * @deprecated
     * Use suspend_immediate_trigger instead
     * 
     */
    @Deprecated /* Use suspend_immediate_trigger instead */
    @Export(name="suspendImmediateTriggers", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> suspendImmediateTriggers;

    /**
     * @return A list of percentage thresholds at which to suspend all warehouses.
     * 
     */
    public Output<Optional<List<Integer>>> suspendImmediateTriggers() {
        return Codegen.optional(this.suspendImmediateTriggers);
    }
    /**
     * The number that represents the percentage threshold at which to suspend all warehouses.
     * 
     */
    @Export(name="suspendTrigger", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> suspendTrigger;

    /**
     * @return The number that represents the percentage threshold at which to suspend all warehouses.
     * 
     */
    public Output<Optional<Integer>> suspendTrigger() {
        return Codegen.optional(this.suspendTrigger);
    }
    /**
     * A list of percentage thresholds at which to suspend all warehouses.
     * 
     * @deprecated
     * Use suspend_trigger instead
     * 
     */
    @Deprecated /* Use suspend_trigger instead */
    @Export(name="suspendTriggers", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> suspendTriggers;

    /**
     * @return A list of percentage thresholds at which to suspend all warehouses.
     * 
     */
    public Output<Optional<List<Integer>>> suspendTriggers() {
        return Codegen.optional(this.suspendTriggers);
    }
    /**
     * A list of warehouses to apply the resource monitor to.
     * 
     */
    @Export(name="warehouses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> warehouses;

    /**
     * @return A list of warehouses to apply the resource monitor to.
     * 
     */
    public Output<Optional<List<String>>> warehouses() {
        return Codegen.optional(this.warehouses);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceMonitor(String name) {
        this(name, ResourceMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceMonitor(String name, @Nullable ResourceMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceMonitor(String name, @Nullable ResourceMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/resourceMonitor:ResourceMonitor", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceMonitor(String name, Output<String> id, @Nullable ResourceMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/resourceMonitor:ResourceMonitor", name, state, makeResourceOptions(options, id));
    }

    private static ResourceMonitorArgs makeArgs(@Nullable ResourceMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResourceMonitorArgs.Empty : args;
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
    public static ResourceMonitor get(String name, Output<String> id, @Nullable ResourceMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceMonitor(name, id, state, options);
    }
}
