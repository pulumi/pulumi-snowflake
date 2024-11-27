// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceMonitorArgs Empty = new ResourceMonitorArgs();

    /**
     * The number of credits allocated to the resource monitor per frequency interval. When total usage for all warehouses assigned to the monitor reaches this number for the current frequency interval, the resource monitor is considered to be at 100% of quota.
     * 
     */
    @Import(name="creditQuota")
    private @Nullable Output<Integer> creditQuota;

    /**
     * @return The number of credits allocated to the resource monitor per frequency interval. When total usage for all warehouses assigned to the monitor reaches this number for the current frequency interval, the resource monitor is considered to be at 100% of quota.
     * 
     */
    public Optional<Output<Integer>> creditQuota() {
        return Optional.ofNullable(this.creditQuota);
    }

    /**
     * The date and time when the resource monitor suspends the assigned warehouses.
     * 
     */
    @Import(name="endTimestamp")
    private @Nullable Output<String> endTimestamp;

    /**
     * @return The date and time when the resource monitor suspends the assigned warehouses.
     * 
     */
    public Optional<Output<String>> endTimestamp() {
        return Optional.ofNullable(this.endTimestamp);
    }

    /**
     * The frequency interval at which the credit usage resets to 0. Valid values are (case-insensitive): `MONTHLY` | `DAILY` | `WEEKLY` | `YEARLY` | `NEVER`. If you set a `frequency` for a resource monitor, you must also set `start_timestamp`. If you specify `NEVER` for the frequency, the credit usage for the warehouse does not reset. After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    /**
     * @return The frequency interval at which the credit usage resets to 0. Valid values are (case-insensitive): `MONTHLY` | `DAILY` | `WEEKLY` | `YEARLY` | `NEVER`. If you set a `frequency` for a resource monitor, you must also set `start_timestamp`. If you specify `NEVER` for the frequency, the credit usage for the warehouse does not reset. After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
     * 
     */
    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * Identifier for the resource monitor; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier for the resource monitor; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies a list of percentages of the credit quota. After reaching any of the values the users passed in the notify_users field will be notified (to receive the notification they should have notifications enabled). Values over 100 are supported.
     * 
     */
    @Import(name="notifyTriggers")
    private @Nullable Output<List<Integer>> notifyTriggers;

    /**
     * @return Specifies a list of percentages of the credit quota. After reaching any of the values the users passed in the notify_users field will be notified (to receive the notification they should have notifications enabled). Values over 100 are supported.
     * 
     */
    public Optional<Output<List<Integer>>> notifyTriggers() {
        return Optional.ofNullable(this.notifyTriggers);
    }

    /**
     * Specifies the list of users (their identifiers) to receive email notifications on resource monitors.
     * 
     */
    @Import(name="notifyUsers")
    private @Nullable Output<List<String>> notifyUsers;

    /**
     * @return Specifies the list of users (their identifiers) to receive email notifications on resource monitors.
     * 
     */
    public Optional<Output<List<String>>> notifyUsers() {
        return Optional.ofNullable(this.notifyUsers);
    }

    /**
     * The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses. If you set a `start_timestamp` for a resource monitor, you must also set `frequency`.  After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
     * 
     */
    @Import(name="startTimestamp")
    private @Nullable Output<String> startTimestamp;

    /**
     * @return The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses. If you set a `start_timestamp` for a resource monitor, you must also set `frequency`.  After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
     * 
     */
    public Optional<Output<String>> startTimestamp() {
        return Optional.ofNullable(this.startTimestamp);
    }

    /**
     * Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses immediately cancel any currently running queries or statements. In addition, this action sends a notification to all users who have enabled notifications for themselves.
     * 
     */
    @Import(name="suspendImmediateTrigger")
    private @Nullable Output<Integer> suspendImmediateTrigger;

    /**
     * @return Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses immediately cancel any currently running queries or statements. In addition, this action sends a notification to all users who have enabled notifications for themselves.
     * 
     */
    public Optional<Output<Integer>> suspendImmediateTrigger() {
        return Optional.ofNullable(this.suspendImmediateTrigger);
    }

    /**
     * Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses while allowing currently running queries to complete will be suspended. No new queries can be executed by the warehouses until the credit quota for the resource monitor is increased. In addition, this action sends a notification to all users who have enabled notifications for themselves.
     * 
     */
    @Import(name="suspendTrigger")
    private @Nullable Output<Integer> suspendTrigger;

    /**
     * @return Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses while allowing currently running queries to complete will be suspended. No new queries can be executed by the warehouses until the credit quota for the resource monitor is increased. In addition, this action sends a notification to all users who have enabled notifications for themselves.
     * 
     */
    public Optional<Output<Integer>> suspendTrigger() {
        return Optional.ofNullable(this.suspendTrigger);
    }

    private ResourceMonitorArgs() {}

    private ResourceMonitorArgs(ResourceMonitorArgs $) {
        this.creditQuota = $.creditQuota;
        this.endTimestamp = $.endTimestamp;
        this.frequency = $.frequency;
        this.name = $.name;
        this.notifyTriggers = $.notifyTriggers;
        this.notifyUsers = $.notifyUsers;
        this.startTimestamp = $.startTimestamp;
        this.suspendImmediateTrigger = $.suspendImmediateTrigger;
        this.suspendTrigger = $.suspendTrigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceMonitorArgs $;

        public Builder() {
            $ = new ResourceMonitorArgs();
        }

        public Builder(ResourceMonitorArgs defaults) {
            $ = new ResourceMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param creditQuota The number of credits allocated to the resource monitor per frequency interval. When total usage for all warehouses assigned to the monitor reaches this number for the current frequency interval, the resource monitor is considered to be at 100% of quota.
         * 
         * @return builder
         * 
         */
        public Builder creditQuota(@Nullable Output<Integer> creditQuota) {
            $.creditQuota = creditQuota;
            return this;
        }

        /**
         * @param creditQuota The number of credits allocated to the resource monitor per frequency interval. When total usage for all warehouses assigned to the monitor reaches this number for the current frequency interval, the resource monitor is considered to be at 100% of quota.
         * 
         * @return builder
         * 
         */
        public Builder creditQuota(Integer creditQuota) {
            return creditQuota(Output.of(creditQuota));
        }

        /**
         * @param endTimestamp The date and time when the resource monitor suspends the assigned warehouses.
         * 
         * @return builder
         * 
         */
        public Builder endTimestamp(@Nullable Output<String> endTimestamp) {
            $.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * @param endTimestamp The date and time when the resource monitor suspends the assigned warehouses.
         * 
         * @return builder
         * 
         */
        public Builder endTimestamp(String endTimestamp) {
            return endTimestamp(Output.of(endTimestamp));
        }

        /**
         * @param frequency The frequency interval at which the credit usage resets to 0. Valid values are (case-insensitive): `MONTHLY` | `DAILY` | `WEEKLY` | `YEARLY` | `NEVER`. If you set a `frequency` for a resource monitor, you must also set `start_timestamp`. If you specify `NEVER` for the frequency, the credit usage for the warehouse does not reset. After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency The frequency interval at which the credit usage resets to 0. Valid values are (case-insensitive): `MONTHLY` | `DAILY` | `WEEKLY` | `YEARLY` | `NEVER`. If you set a `frequency` for a resource monitor, you must also set `start_timestamp`. If you specify `NEVER` for the frequency, the credit usage for the warehouse does not reset. After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param name Identifier for the resource monitor; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier for the resource monitor; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifyTriggers Specifies a list of percentages of the credit quota. After reaching any of the values the users passed in the notify_users field will be notified (to receive the notification they should have notifications enabled). Values over 100 are supported.
         * 
         * @return builder
         * 
         */
        public Builder notifyTriggers(@Nullable Output<List<Integer>> notifyTriggers) {
            $.notifyTriggers = notifyTriggers;
            return this;
        }

        /**
         * @param notifyTriggers Specifies a list of percentages of the credit quota. After reaching any of the values the users passed in the notify_users field will be notified (to receive the notification they should have notifications enabled). Values over 100 are supported.
         * 
         * @return builder
         * 
         */
        public Builder notifyTriggers(List<Integer> notifyTriggers) {
            return notifyTriggers(Output.of(notifyTriggers));
        }

        /**
         * @param notifyTriggers Specifies a list of percentages of the credit quota. After reaching any of the values the users passed in the notify_users field will be notified (to receive the notification they should have notifications enabled). Values over 100 are supported.
         * 
         * @return builder
         * 
         */
        public Builder notifyTriggers(Integer... notifyTriggers) {
            return notifyTriggers(List.of(notifyTriggers));
        }

        /**
         * @param notifyUsers Specifies the list of users (their identifiers) to receive email notifications on resource monitors.
         * 
         * @return builder
         * 
         */
        public Builder notifyUsers(@Nullable Output<List<String>> notifyUsers) {
            $.notifyUsers = notifyUsers;
            return this;
        }

        /**
         * @param notifyUsers Specifies the list of users (their identifiers) to receive email notifications on resource monitors.
         * 
         * @return builder
         * 
         */
        public Builder notifyUsers(List<String> notifyUsers) {
            return notifyUsers(Output.of(notifyUsers));
        }

        /**
         * @param notifyUsers Specifies the list of users (their identifiers) to receive email notifications on resource monitors.
         * 
         * @return builder
         * 
         */
        public Builder notifyUsers(String... notifyUsers) {
            return notifyUsers(List.of(notifyUsers));
        }

        /**
         * @param startTimestamp The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses. If you set a `start_timestamp` for a resource monitor, you must also set `frequency`.  After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder startTimestamp(@Nullable Output<String> startTimestamp) {
            $.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * @param startTimestamp The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses. If you set a `start_timestamp` for a resource monitor, you must also set `frequency`.  After removing this field from the config, the previously set value will be preserved on the Snowflake side, not the default value. That&#39;s due to Snowflake limitation and the lack of unset functionality for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder startTimestamp(String startTimestamp) {
            return startTimestamp(Output.of(startTimestamp));
        }

        /**
         * @param suspendImmediateTrigger Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses immediately cancel any currently running queries or statements. In addition, this action sends a notification to all users who have enabled notifications for themselves.
         * 
         * @return builder
         * 
         */
        public Builder suspendImmediateTrigger(@Nullable Output<Integer> suspendImmediateTrigger) {
            $.suspendImmediateTrigger = suspendImmediateTrigger;
            return this;
        }

        /**
         * @param suspendImmediateTrigger Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses immediately cancel any currently running queries or statements. In addition, this action sends a notification to all users who have enabled notifications for themselves.
         * 
         * @return builder
         * 
         */
        public Builder suspendImmediateTrigger(Integer suspendImmediateTrigger) {
            return suspendImmediateTrigger(Output.of(suspendImmediateTrigger));
        }

        /**
         * @param suspendTrigger Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses while allowing currently running queries to complete will be suspended. No new queries can be executed by the warehouses until the credit quota for the resource monitor is increased. In addition, this action sends a notification to all users who have enabled notifications for themselves.
         * 
         * @return builder
         * 
         */
        public Builder suspendTrigger(@Nullable Output<Integer> suspendTrigger) {
            $.suspendTrigger = suspendTrigger;
            return this;
        }

        /**
         * @param suspendTrigger Represents a numeric value specified as a percentage of the credit quota. Values over 100 are supported. After reaching this value, all assigned warehouses while allowing currently running queries to complete will be suspended. No new queries can be executed by the warehouses until the credit quota for the resource monitor is increased. In addition, this action sends a notification to all users who have enabled notifications for themselves.
         * 
         * @return builder
         * 
         */
        public Builder suspendTrigger(Integer suspendTrigger) {
            return suspendTrigger(Output.of(suspendTrigger));
        }

        public ResourceMonitorArgs build() {
            return $;
        }
    }

}
