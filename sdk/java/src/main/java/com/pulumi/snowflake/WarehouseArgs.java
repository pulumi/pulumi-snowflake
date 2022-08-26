// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.WarehouseTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WarehouseArgs extends com.pulumi.resources.ResourceArgs {

    public static final WarehouseArgs Empty = new WarehouseArgs();

    /**
     * Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     * 
     */
    @Import(name="autoResume")
    private @Nullable Output<Boolean> autoResume;

    /**
     * @return Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     * 
     */
    public Optional<Output<Boolean>> autoResume() {
        return Optional.ofNullable(this.autoResume);
    }

    /**
     * Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     * 
     */
    @Import(name="autoSuspend")
    private @Nullable Output<Integer> autoSuspend;

    /**
     * @return Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     * 
     */
    public Optional<Output<Integer>> autoSuspend() {
        return Optional.ofNullable(this.autoSuspend);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     * 
     */
    @Import(name="initiallySuspended")
    private @Nullable Output<Boolean> initiallySuspended;

    /**
     * @return Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     * 
     */
    public Optional<Output<Boolean>> initiallySuspended() {
        return Optional.ofNullable(this.initiallySuspended);
    }

    /**
     * Specifies the maximum number of server clusters for the warehouse.
     * 
     */
    @Import(name="maxClusterCount")
    private @Nullable Output<Integer> maxClusterCount;

    /**
     * @return Specifies the maximum number of server clusters for the warehouse.
     * 
     */
    public Optional<Output<Integer>> maxClusterCount() {
        return Optional.ofNullable(this.maxClusterCount);
    }

    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     * 
     */
    @Import(name="maxConcurrencyLevel")
    private @Nullable Output<Integer> maxConcurrencyLevel;

    /**
     * @return Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     * 
     */
    public Optional<Output<Integer>> maxConcurrencyLevel() {
        return Optional.ofNullable(this.maxConcurrencyLevel);
    }

    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     * 
     */
    @Import(name="minClusterCount")
    private @Nullable Output<Integer> minClusterCount;

    /**
     * @return Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     * 
     */
    public Optional<Output<Integer>> minClusterCount() {
        return Optional.ofNullable(this.minClusterCount);
    }

    /**
     * Identifier for the virtual warehouse; must be unique for your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier for the virtual warehouse; must be unique for your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     * 
     */
    @Import(name="resourceMonitor")
    private @Nullable Output<String> resourceMonitor;

    /**
     * @return Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     * 
     */
    public Optional<Output<String>> resourceMonitor() {
        return Optional.ofNullable(this.resourceMonitor);
    }

    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     * 
     */
    @Import(name="scalingPolicy")
    private @Nullable Output<String> scalingPolicy;

    /**
     * @return Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     * 
     */
    public Optional<Output<String>> scalingPolicy() {
        return Optional.ofNullable(this.scalingPolicy);
    }

    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     * 
     */
    @Import(name="statementQueuedTimeoutInSeconds")
    private @Nullable Output<Integer> statementQueuedTimeoutInSeconds;

    /**
     * @return Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     * 
     */
    public Optional<Output<Integer>> statementQueuedTimeoutInSeconds() {
        return Optional.ofNullable(this.statementQueuedTimeoutInSeconds);
    }

    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     * 
     */
    @Import(name="statementTimeoutInSeconds")
    private @Nullable Output<Integer> statementTimeoutInSeconds;

    /**
     * @return Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     * 
     */
    public Optional<Output<Integer>> statementTimeoutInSeconds() {
        return Optional.ofNullable(this.statementTimeoutInSeconds);
    }

    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Import(name="tags")
    private @Nullable Output<List<WarehouseTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    public Optional<Output<List<WarehouseTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     * 
     */
    @Import(name="waitForProvisioning")
    private @Nullable Output<Boolean> waitForProvisioning;

    /**
     * @return Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     * 
     */
    public Optional<Output<Boolean>> waitForProvisioning() {
        return Optional.ofNullable(this.waitForProvisioning);
    }

    /**
     * Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     * 
     */
    @Import(name="warehouseSize")
    private @Nullable Output<String> warehouseSize;

    /**
     * @return Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     * 
     */
    public Optional<Output<String>> warehouseSize() {
        return Optional.ofNullable(this.warehouseSize);
    }

    private WarehouseArgs() {}

    private WarehouseArgs(WarehouseArgs $) {
        this.autoResume = $.autoResume;
        this.autoSuspend = $.autoSuspend;
        this.comment = $.comment;
        this.initiallySuspended = $.initiallySuspended;
        this.maxClusterCount = $.maxClusterCount;
        this.maxConcurrencyLevel = $.maxConcurrencyLevel;
        this.minClusterCount = $.minClusterCount;
        this.name = $.name;
        this.resourceMonitor = $.resourceMonitor;
        this.scalingPolicy = $.scalingPolicy;
        this.statementQueuedTimeoutInSeconds = $.statementQueuedTimeoutInSeconds;
        this.statementTimeoutInSeconds = $.statementTimeoutInSeconds;
        this.tags = $.tags;
        this.waitForProvisioning = $.waitForProvisioning;
        this.warehouseSize = $.warehouseSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WarehouseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WarehouseArgs $;

        public Builder() {
            $ = new WarehouseArgs();
        }

        public Builder(WarehouseArgs defaults) {
            $ = new WarehouseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoResume Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
         * 
         * @return builder
         * 
         */
        public Builder autoResume(@Nullable Output<Boolean> autoResume) {
            $.autoResume = autoResume;
            return this;
        }

        /**
         * @param autoResume Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
         * 
         * @return builder
         * 
         */
        public Builder autoResume(Boolean autoResume) {
            return autoResume(Output.of(autoResume));
        }

        /**
         * @param autoSuspend Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
         * 
         * @return builder
         * 
         */
        public Builder autoSuspend(@Nullable Output<Integer> autoSuspend) {
            $.autoSuspend = autoSuspend;
            return this;
        }

        /**
         * @param autoSuspend Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
         * 
         * @return builder
         * 
         */
        public Builder autoSuspend(Integer autoSuspend) {
            return autoSuspend(Output.of(autoSuspend));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param initiallySuspended Specifies whether the warehouse is created initially in the ‘Suspended’ state.
         * 
         * @return builder
         * 
         */
        public Builder initiallySuspended(@Nullable Output<Boolean> initiallySuspended) {
            $.initiallySuspended = initiallySuspended;
            return this;
        }

        /**
         * @param initiallySuspended Specifies whether the warehouse is created initially in the ‘Suspended’ state.
         * 
         * @return builder
         * 
         */
        public Builder initiallySuspended(Boolean initiallySuspended) {
            return initiallySuspended(Output.of(initiallySuspended));
        }

        /**
         * @param maxClusterCount Specifies the maximum number of server clusters for the warehouse.
         * 
         * @return builder
         * 
         */
        public Builder maxClusterCount(@Nullable Output<Integer> maxClusterCount) {
            $.maxClusterCount = maxClusterCount;
            return this;
        }

        /**
         * @param maxClusterCount Specifies the maximum number of server clusters for the warehouse.
         * 
         * @return builder
         * 
         */
        public Builder maxClusterCount(Integer maxClusterCount) {
            return maxClusterCount(Output.of(maxClusterCount));
        }

        /**
         * @param maxConcurrencyLevel Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrencyLevel(@Nullable Output<Integer> maxConcurrencyLevel) {
            $.maxConcurrencyLevel = maxConcurrencyLevel;
            return this;
        }

        /**
         * @param maxConcurrencyLevel Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrencyLevel(Integer maxConcurrencyLevel) {
            return maxConcurrencyLevel(Output.of(maxConcurrencyLevel));
        }

        /**
         * @param minClusterCount Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
         * 
         * @return builder
         * 
         */
        public Builder minClusterCount(@Nullable Output<Integer> minClusterCount) {
            $.minClusterCount = minClusterCount;
            return this;
        }

        /**
         * @param minClusterCount Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
         * 
         * @return builder
         * 
         */
        public Builder minClusterCount(Integer minClusterCount) {
            return minClusterCount(Output.of(minClusterCount));
        }

        /**
         * @param name Identifier for the virtual warehouse; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier for the virtual warehouse; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceMonitor Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
         * 
         * @return builder
         * 
         */
        public Builder resourceMonitor(@Nullable Output<String> resourceMonitor) {
            $.resourceMonitor = resourceMonitor;
            return this;
        }

        /**
         * @param resourceMonitor Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
         * 
         * @return builder
         * 
         */
        public Builder resourceMonitor(String resourceMonitor) {
            return resourceMonitor(Output.of(resourceMonitor));
        }

        /**
         * @param scalingPolicy Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
         * 
         * @return builder
         * 
         */
        public Builder scalingPolicy(@Nullable Output<String> scalingPolicy) {
            $.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * @param scalingPolicy Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
         * 
         * @return builder
         * 
         */
        public Builder scalingPolicy(String scalingPolicy) {
            return scalingPolicy(Output.of(scalingPolicy));
        }

        /**
         * @param statementQueuedTimeoutInSeconds Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
         * 
         * @return builder
         * 
         */
        public Builder statementQueuedTimeoutInSeconds(@Nullable Output<Integer> statementQueuedTimeoutInSeconds) {
            $.statementQueuedTimeoutInSeconds = statementQueuedTimeoutInSeconds;
            return this;
        }

        /**
         * @param statementQueuedTimeoutInSeconds Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
         * 
         * @return builder
         * 
         */
        public Builder statementQueuedTimeoutInSeconds(Integer statementQueuedTimeoutInSeconds) {
            return statementQueuedTimeoutInSeconds(Output.of(statementQueuedTimeoutInSeconds));
        }

        /**
         * @param statementTimeoutInSeconds Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
         * 
         * @return builder
         * 
         */
        public Builder statementTimeoutInSeconds(@Nullable Output<Integer> statementTimeoutInSeconds) {
            $.statementTimeoutInSeconds = statementTimeoutInSeconds;
            return this;
        }

        /**
         * @param statementTimeoutInSeconds Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
         * 
         * @return builder
         * 
         */
        public Builder statementTimeoutInSeconds(Integer statementTimeoutInSeconds) {
            return statementTimeoutInSeconds(Output.of(statementTimeoutInSeconds));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(@Nullable Output<List<WarehouseTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(List<WarehouseTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(WarehouseTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param waitForProvisioning Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
         * 
         * @return builder
         * 
         */
        public Builder waitForProvisioning(@Nullable Output<Boolean> waitForProvisioning) {
            $.waitForProvisioning = waitForProvisioning;
            return this;
        }

        /**
         * @param waitForProvisioning Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
         * 
         * @return builder
         * 
         */
        public Builder waitForProvisioning(Boolean waitForProvisioning) {
            return waitForProvisioning(Output.of(waitForProvisioning));
        }

        /**
         * @param warehouseSize Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
         * 
         * @return builder
         * 
         */
        public Builder warehouseSize(@Nullable Output<String> warehouseSize) {
            $.warehouseSize = warehouseSize;
            return this;
        }

        /**
         * @param warehouseSize Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
         * 
         * @return builder
         * 
         */
        public Builder warehouseSize(String warehouseSize) {
            return warehouseSize(Output.of(warehouseSize));
        }

        public WarehouseArgs build() {
            return $;
        }
    }

}
