// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewDataMetricScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewDataMetricScheduleArgs Empty = new ViewDataMetricScheduleArgs();

    /**
     * Specifies an interval (in minutes) of wait time inserted between runs of the data metric function. Conflicts with `using_cron`. Valid values are: `5` | `15` | `30` | `60` | `720` | `1440`. Due to Snowflake limitations, changes in this field are not managed by the provider. Please consider using taint command, `using_cron` field, or replace*triggered*by metadata argument.
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<Integer> minutes;

    /**
     * @return Specifies an interval (in minutes) of wait time inserted between runs of the data metric function. Conflicts with `using_cron`. Valid values are: `5` | `15` | `30` | `60` | `720` | `1440`. Due to Snowflake limitations, changes in this field are not managed by the provider. Please consider using taint command, `using_cron` field, or replace*triggered*by metadata argument.
     * 
     */
    public Optional<Output<Integer>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * Specifies a cron expression and time zone for periodically running the data metric function. Supports a subset of standard cron utility syntax. Conflicts with `minutes`.
     * 
     */
    @Import(name="usingCron")
    private @Nullable Output<String> usingCron;

    /**
     * @return Specifies a cron expression and time zone for periodically running the data metric function. Supports a subset of standard cron utility syntax. Conflicts with `minutes`.
     * 
     */
    public Optional<Output<String>> usingCron() {
        return Optional.ofNullable(this.usingCron);
    }

    private ViewDataMetricScheduleArgs() {}

    private ViewDataMetricScheduleArgs(ViewDataMetricScheduleArgs $) {
        this.minutes = $.minutes;
        this.usingCron = $.usingCron;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewDataMetricScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewDataMetricScheduleArgs $;

        public Builder() {
            $ = new ViewDataMetricScheduleArgs();
        }

        public Builder(ViewDataMetricScheduleArgs defaults) {
            $ = new ViewDataMetricScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minutes Specifies an interval (in minutes) of wait time inserted between runs of the data metric function. Conflicts with `using_cron`. Valid values are: `5` | `15` | `30` | `60` | `720` | `1440`. Due to Snowflake limitations, changes in this field are not managed by the provider. Please consider using taint command, `using_cron` field, or replace*triggered*by metadata argument.
         * 
         * @return builder
         * 
         */
        public Builder minutes(@Nullable Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes Specifies an interval (in minutes) of wait time inserted between runs of the data metric function. Conflicts with `using_cron`. Valid values are: `5` | `15` | `30` | `60` | `720` | `1440`. Due to Snowflake limitations, changes in this field are not managed by the provider. Please consider using taint command, `using_cron` field, or replace*triggered*by metadata argument.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param usingCron Specifies a cron expression and time zone for periodically running the data metric function. Supports a subset of standard cron utility syntax. Conflicts with `minutes`.
         * 
         * @return builder
         * 
         */
        public Builder usingCron(@Nullable Output<String> usingCron) {
            $.usingCron = usingCron;
            return this;
        }

        /**
         * @param usingCron Specifies a cron expression and time zone for periodically running the data metric function. Supports a subset of standard cron utility syntax. Conflicts with `minutes`.
         * 
         * @return builder
         * 
         */
        public Builder usingCron(String usingCron) {
            return usingCron(Output.of(usingCron));
        }

        public ViewDataMetricScheduleArgs build() {
            return $;
        }
    }

}
