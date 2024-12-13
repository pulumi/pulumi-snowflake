// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.FunctionJavaParameterEnableConsoleOutputArgs;
import com.pulumi.snowflake.inputs.FunctionJavaParameterLogLevelArgs;
import com.pulumi.snowflake.inputs.FunctionJavaParameterMetricLevelArgs;
import com.pulumi.snowflake.inputs.FunctionJavaParameterTraceLevelArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionJavaParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavaParameterArgs Empty = new FunctionJavaParameterArgs();

    @Import(name="enableConsoleOutputs")
    private @Nullable Output<List<FunctionJavaParameterEnableConsoleOutputArgs>> enableConsoleOutputs;

    public Optional<Output<List<FunctionJavaParameterEnableConsoleOutputArgs>>> enableConsoleOutputs() {
        return Optional.ofNullable(this.enableConsoleOutputs);
    }

    @Import(name="logLevels")
    private @Nullable Output<List<FunctionJavaParameterLogLevelArgs>> logLevels;

    public Optional<Output<List<FunctionJavaParameterLogLevelArgs>>> logLevels() {
        return Optional.ofNullable(this.logLevels);
    }

    @Import(name="metricLevels")
    private @Nullable Output<List<FunctionJavaParameterMetricLevelArgs>> metricLevels;

    public Optional<Output<List<FunctionJavaParameterMetricLevelArgs>>> metricLevels() {
        return Optional.ofNullable(this.metricLevels);
    }

    @Import(name="traceLevels")
    private @Nullable Output<List<FunctionJavaParameterTraceLevelArgs>> traceLevels;

    public Optional<Output<List<FunctionJavaParameterTraceLevelArgs>>> traceLevels() {
        return Optional.ofNullable(this.traceLevels);
    }

    private FunctionJavaParameterArgs() {}

    private FunctionJavaParameterArgs(FunctionJavaParameterArgs $) {
        this.enableConsoleOutputs = $.enableConsoleOutputs;
        this.logLevels = $.logLevels;
        this.metricLevels = $.metricLevels;
        this.traceLevels = $.traceLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavaParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavaParameterArgs $;

        public Builder() {
            $ = new FunctionJavaParameterArgs();
        }

        public Builder(FunctionJavaParameterArgs defaults) {
            $ = new FunctionJavaParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableConsoleOutputs(@Nullable Output<List<FunctionJavaParameterEnableConsoleOutputArgs>> enableConsoleOutputs) {
            $.enableConsoleOutputs = enableConsoleOutputs;
            return this;
        }

        public Builder enableConsoleOutputs(List<FunctionJavaParameterEnableConsoleOutputArgs> enableConsoleOutputs) {
            return enableConsoleOutputs(Output.of(enableConsoleOutputs));
        }

        public Builder enableConsoleOutputs(FunctionJavaParameterEnableConsoleOutputArgs... enableConsoleOutputs) {
            return enableConsoleOutputs(List.of(enableConsoleOutputs));
        }

        public Builder logLevels(@Nullable Output<List<FunctionJavaParameterLogLevelArgs>> logLevels) {
            $.logLevels = logLevels;
            return this;
        }

        public Builder logLevels(List<FunctionJavaParameterLogLevelArgs> logLevels) {
            return logLevels(Output.of(logLevels));
        }

        public Builder logLevels(FunctionJavaParameterLogLevelArgs... logLevels) {
            return logLevels(List.of(logLevels));
        }

        public Builder metricLevels(@Nullable Output<List<FunctionJavaParameterMetricLevelArgs>> metricLevels) {
            $.metricLevels = metricLevels;
            return this;
        }

        public Builder metricLevels(List<FunctionJavaParameterMetricLevelArgs> metricLevels) {
            return metricLevels(Output.of(metricLevels));
        }

        public Builder metricLevels(FunctionJavaParameterMetricLevelArgs... metricLevels) {
            return metricLevels(List.of(metricLevels));
        }

        public Builder traceLevels(@Nullable Output<List<FunctionJavaParameterTraceLevelArgs>> traceLevels) {
            $.traceLevels = traceLevels;
            return this;
        }

        public Builder traceLevels(List<FunctionJavaParameterTraceLevelArgs> traceLevels) {
            return traceLevels(Output.of(traceLevels));
        }

        public Builder traceLevels(FunctionJavaParameterTraceLevelArgs... traceLevels) {
            return traceLevels(List.of(traceLevels));
        }

        public FunctionJavaParameterArgs build() {
            return $;
        }
    }

}