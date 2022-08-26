// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.WarehouseArgs;
import com.pulumi.snowflake.inputs.WarehouseState;
import com.pulumi.snowflake.outputs.WarehouseTag;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.snowflake.Warehouse;
 * import com.pulumi.snowflake.WarehouseArgs;
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
 *         var warehouse = new Warehouse(&#34;warehouse&#34;, WarehouseArgs.builder()        
 *             .comment(&#34;foo&#34;)
 *             .warehouseSize(&#34;small&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import snowflake:index/warehouse:Warehouse example warehouseName
 * ```
 * 
 */
@ResourceType(type="snowflake:index/warehouse:Warehouse")
public class Warehouse extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     * 
     */
    @Export(name="autoResume", type=Boolean.class, parameters={})
    private Output<Boolean> autoResume;

    /**
     * @return Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     * 
     */
    public Output<Boolean> autoResume() {
        return this.autoResume;
    }
    /**
     * Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     * 
     */
    @Export(name="autoSuspend", type=Integer.class, parameters={})
    private Output<Integer> autoSuspend;

    /**
     * @return Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     * 
     */
    public Output<Integer> autoSuspend() {
        return this.autoSuspend;
    }
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     * 
     */
    @Export(name="initiallySuspended", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> initiallySuspended;

    /**
     * @return Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     * 
     */
    public Output<Optional<Boolean>> initiallySuspended() {
        return Codegen.optional(this.initiallySuspended);
    }
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     * 
     */
    @Export(name="maxClusterCount", type=Integer.class, parameters={})
    private Output<Integer> maxClusterCount;

    /**
     * @return Specifies the maximum number of server clusters for the warehouse.
     * 
     */
    public Output<Integer> maxClusterCount() {
        return this.maxClusterCount;
    }
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     * 
     */
    @Export(name="maxConcurrencyLevel", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxConcurrencyLevel;

    /**
     * @return Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     * 
     */
    public Output<Optional<Integer>> maxConcurrencyLevel() {
        return Codegen.optional(this.maxConcurrencyLevel);
    }
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     * 
     */
    @Export(name="minClusterCount", type=Integer.class, parameters={})
    private Output<Integer> minClusterCount;

    /**
     * @return Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     * 
     */
    public Output<Integer> minClusterCount() {
        return this.minClusterCount;
    }
    /**
     * Identifier for the virtual warehouse; must be unique for your account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Identifier for the virtual warehouse; must be unique for your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     * 
     */
    @Export(name="resourceMonitor", type=String.class, parameters={})
    private Output<String> resourceMonitor;

    /**
     * @return Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     * 
     */
    public Output<String> resourceMonitor() {
        return this.resourceMonitor;
    }
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     * 
     */
    @Export(name="scalingPolicy", type=String.class, parameters={})
    private Output<String> scalingPolicy;

    /**
     * @return Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     * 
     */
    public Output<String> scalingPolicy() {
        return this.scalingPolicy;
    }
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     * 
     */
    @Export(name="statementQueuedTimeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> statementQueuedTimeoutInSeconds;

    /**
     * @return Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     * 
     */
    public Output<Optional<Integer>> statementQueuedTimeoutInSeconds() {
        return Codegen.optional(this.statementQueuedTimeoutInSeconds);
    }
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     * 
     */
    @Export(name="statementTimeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> statementTimeoutInSeconds;

    /**
     * @return Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     * 
     */
    public Output<Optional<Integer>> statementTimeoutInSeconds() {
        return Codegen.optional(this.statementTimeoutInSeconds);
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", type=List.class, parameters={WarehouseTag.class})
    private Output</* @Nullable */ List<WarehouseTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<WarehouseTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     * 
     */
    @Export(name="waitForProvisioning", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForProvisioning;

    /**
     * @return Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     * 
     */
    public Output<Optional<Boolean>> waitForProvisioning() {
        return Codegen.optional(this.waitForProvisioning);
    }
    /**
     * Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     * 
     */
    @Export(name="warehouseSize", type=String.class, parameters={})
    private Output<String> warehouseSize;

    /**
     * @return Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     * 
     */
    public Output<String> warehouseSize() {
        return this.warehouseSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Warehouse(String name) {
        this(name, WarehouseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Warehouse(String name, @Nullable WarehouseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Warehouse(String name, @Nullable WarehouseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/warehouse:Warehouse", name, args == null ? WarehouseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Warehouse(String name, Output<String> id, @Nullable WarehouseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/warehouse:Warehouse", name, state, makeResourceOptions(options, id));
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
    public static Warehouse get(String name, Output<String> id, @Nullable WarehouseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Warehouse(name, id, state, options);
    }
}
