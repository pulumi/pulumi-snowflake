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


public final class TaskScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskScheduleArgs Empty = new TaskScheduleArgs();

    /**
     * Specifies an interval (in minutes) of wait time inserted between runs of the task. Accepts positive integers only. (conflicts with `using_cron`)
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<Integer> minutes;

    /**
     * @return Specifies an interval (in minutes) of wait time inserted between runs of the task. Accepts positive integers only. (conflicts with `using_cron`)
     * 
     */
    public Optional<Output<Integer>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * Specifies a cron expression and time zone for periodically running the task. Supports a subset of standard cron utility syntax. (conflicts with `minutes`)
     * 
     */
    @Import(name="usingCron")
    private @Nullable Output<String> usingCron;

    /**
     * @return Specifies a cron expression and time zone for periodically running the task. Supports a subset of standard cron utility syntax. (conflicts with `minutes`)
     * 
     */
    public Optional<Output<String>> usingCron() {
        return Optional.ofNullable(this.usingCron);
    }

    private TaskScheduleArgs() {}

    private TaskScheduleArgs(TaskScheduleArgs $) {
        this.minutes = $.minutes;
        this.usingCron = $.usingCron;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskScheduleArgs $;

        public Builder() {
            $ = new TaskScheduleArgs();
        }

        public Builder(TaskScheduleArgs defaults) {
            $ = new TaskScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minutes Specifies an interval (in minutes) of wait time inserted between runs of the task. Accepts positive integers only. (conflicts with `using_cron`)
         * 
         * @return builder
         * 
         */
        public Builder minutes(@Nullable Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes Specifies an interval (in minutes) of wait time inserted between runs of the task. Accepts positive integers only. (conflicts with `using_cron`)
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param usingCron Specifies a cron expression and time zone for periodically running the task. Supports a subset of standard cron utility syntax. (conflicts with `minutes`)
         * 
         * @return builder
         * 
         */
        public Builder usingCron(@Nullable Output<String> usingCron) {
            $.usingCron = usingCron;
            return this;
        }

        /**
         * @param usingCron Specifies a cron expression and time zone for periodically running the task. Supports a subset of standard cron utility syntax. (conflicts with `minutes`)
         * 
         * @return builder
         * 
         */
        public Builder usingCron(String usingCron) {
            return usingCron(Output.of(usingCron));
        }

        public TaskScheduleArgs build() {
            return $;
        }
    }

}
