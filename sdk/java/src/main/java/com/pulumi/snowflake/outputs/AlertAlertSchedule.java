// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.AlertAlertScheduleCron;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertAlertSchedule {
    /**
     * @return Specifies the cron expression for the alert. The cron expression must be in the following format: &#34;minute hour day-of-month month day-of-week&#34;. The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     * 
     */
    private @Nullable AlertAlertScheduleCron cron;
    /**
     * @return Specifies the interval in minutes for the alert schedule. The interval must be greater than 0 and less than 1440 (24 hours).
     * 
     */
    private @Nullable Integer interval;

    private AlertAlertSchedule() {}
    /**
     * @return Specifies the cron expression for the alert. The cron expression must be in the following format: &#34;minute hour day-of-month month day-of-week&#34;. The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     * 
     */
    public Optional<AlertAlertScheduleCron> cron() {
        return Optional.ofNullable(this.cron);
    }
    /**
     * @return Specifies the interval in minutes for the alert schedule. The interval must be greater than 0 and less than 1440 (24 hours).
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertAlertSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AlertAlertScheduleCron cron;
        private @Nullable Integer interval;
        public Builder() {}
        public Builder(AlertAlertSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cron = defaults.cron;
    	      this.interval = defaults.interval;
        }

        @CustomType.Setter
        public Builder cron(@Nullable AlertAlertScheduleCron cron) {

            this.cron = cron;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {

            this.interval = interval;
            return this;
        }
        public AlertAlertSchedule build() {
            final var _resultValue = new AlertAlertSchedule();
            _resultValue.cron = cron;
            _resultValue.interval = interval;
            return _resultValue;
        }
    }
}
