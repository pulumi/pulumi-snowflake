// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.FunctionSqlParameterEnableConsoleOutput;
import com.pulumi.snowflake.outputs.FunctionSqlParameterLogLevel;
import com.pulumi.snowflake.outputs.FunctionSqlParameterMetricLevel;
import com.pulumi.snowflake.outputs.FunctionSqlParameterTraceLevel;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FunctionSqlParameter {
    private @Nullable List<FunctionSqlParameterEnableConsoleOutput> enableConsoleOutputs;
    private @Nullable List<FunctionSqlParameterLogLevel> logLevels;
    private @Nullable List<FunctionSqlParameterMetricLevel> metricLevels;
    private @Nullable List<FunctionSqlParameterTraceLevel> traceLevels;

    private FunctionSqlParameter() {}
    public List<FunctionSqlParameterEnableConsoleOutput> enableConsoleOutputs() {
        return this.enableConsoleOutputs == null ? List.of() : this.enableConsoleOutputs;
    }
    public List<FunctionSqlParameterLogLevel> logLevels() {
        return this.logLevels == null ? List.of() : this.logLevels;
    }
    public List<FunctionSqlParameterMetricLevel> metricLevels() {
        return this.metricLevels == null ? List.of() : this.metricLevels;
    }
    public List<FunctionSqlParameterTraceLevel> traceLevels() {
        return this.traceLevels == null ? List.of() : this.traceLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSqlParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FunctionSqlParameterEnableConsoleOutput> enableConsoleOutputs;
        private @Nullable List<FunctionSqlParameterLogLevel> logLevels;
        private @Nullable List<FunctionSqlParameterMetricLevel> metricLevels;
        private @Nullable List<FunctionSqlParameterTraceLevel> traceLevels;
        public Builder() {}
        public Builder(FunctionSqlParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConsoleOutputs = defaults.enableConsoleOutputs;
    	      this.logLevels = defaults.logLevels;
    	      this.metricLevels = defaults.metricLevels;
    	      this.traceLevels = defaults.traceLevels;
        }

        @CustomType.Setter
        public Builder enableConsoleOutputs(@Nullable List<FunctionSqlParameterEnableConsoleOutput> enableConsoleOutputs) {

            this.enableConsoleOutputs = enableConsoleOutputs;
            return this;
        }
        public Builder enableConsoleOutputs(FunctionSqlParameterEnableConsoleOutput... enableConsoleOutputs) {
            return enableConsoleOutputs(List.of(enableConsoleOutputs));
        }
        @CustomType.Setter
        public Builder logLevels(@Nullable List<FunctionSqlParameterLogLevel> logLevels) {

            this.logLevels = logLevels;
            return this;
        }
        public Builder logLevels(FunctionSqlParameterLogLevel... logLevels) {
            return logLevels(List.of(logLevels));
        }
        @CustomType.Setter
        public Builder metricLevels(@Nullable List<FunctionSqlParameterMetricLevel> metricLevels) {

            this.metricLevels = metricLevels;
            return this;
        }
        public Builder metricLevels(FunctionSqlParameterMetricLevel... metricLevels) {
            return metricLevels(List.of(metricLevels));
        }
        @CustomType.Setter
        public Builder traceLevels(@Nullable List<FunctionSqlParameterTraceLevel> traceLevels) {

            this.traceLevels = traceLevels;
            return this;
        }
        public Builder traceLevels(FunctionSqlParameterTraceLevel... traceLevels) {
            return traceLevels(List.of(traceLevels));
        }
        public FunctionSqlParameter build() {
            final var _resultValue = new FunctionSqlParameter();
            _resultValue.enableConsoleOutputs = enableConsoleOutputs;
            _resultValue.logLevels = logLevels;
            _resultValue.metricLevels = metricLevels;
            _resultValue.traceLevels = traceLevels;
            return _resultValue;
        }
    }
}
