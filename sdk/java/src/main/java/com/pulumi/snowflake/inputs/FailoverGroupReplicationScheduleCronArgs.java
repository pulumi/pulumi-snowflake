// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FailoverGroupReplicationScheduleCronArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailoverGroupReplicationScheduleCronArgs Empty = new FailoverGroupReplicationScheduleCronArgs();

    /**
     * Specifies the cron expression for the replication schedule. The cron expression must be in the following format: &#34;minute hour day-of-month month day-of-week&#34;. The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Specifies the cron expression for the replication schedule. The cron expression must be in the following format: &#34;minute hour day-of-month month day-of-week&#34;. The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Specifies the time zone for secondary group refresh.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return Specifies the time zone for secondary group refresh.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private FailoverGroupReplicationScheduleCronArgs() {}

    private FailoverGroupReplicationScheduleCronArgs(FailoverGroupReplicationScheduleCronArgs $) {
        this.expression = $.expression;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupReplicationScheduleCronArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupReplicationScheduleCronArgs $;

        public Builder() {
            $ = new FailoverGroupReplicationScheduleCronArgs();
        }

        public Builder(FailoverGroupReplicationScheduleCronArgs defaults) {
            $ = new FailoverGroupReplicationScheduleCronArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression Specifies the cron expression for the replication schedule. The cron expression must be in the following format: &#34;minute hour day-of-month month day-of-week&#34;. The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Specifies the cron expression for the replication schedule. The cron expression must be in the following format: &#34;minute hour day-of-month month day-of-week&#34;. The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param timeZone Specifies the time zone for secondary group refresh.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the time zone for secondary group refresh.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public FailoverGroupReplicationScheduleCronArgs build() {
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("FailoverGroupReplicationScheduleCronArgs", "expression");
            }
            if ($.timeZone == null) {
                throw new MissingRequiredPropertyException("FailoverGroupReplicationScheduleCronArgs", "timeZone");
            }
            return $;
        }
    }

}
