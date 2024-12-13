// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.FunctionScalaParameterEnableConsoleOutputArgs;
import com.pulumi.snowflake.inputs.FunctionScalaParameterLogLevelArgs;
import com.pulumi.snowflake.inputs.FunctionScalaParameterMetricLevelArgs;
import com.pulumi.snowflake.inputs.FunctionScalaParameterTraceLevelArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionScalaParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionScalaParameterArgs Empty = new FunctionScalaParameterArgs();

    @Import(name="enableConsoleOutputs")
    private @Nullable Output<List<FunctionScalaParameterEnableConsoleOutputArgs>> enableConsoleOutputs;

    public Optional<Output<List<FunctionScalaParameterEnableConsoleOutputArgs>>> enableConsoleOutputs() {
        return Optional.ofNullable(this.enableConsoleOutputs);
    }

    @Import(name="logLevels")
    private @Nullable Output<List<FunctionScalaParameterLogLevelArgs>> logLevels;

    public Optional<Output<List<FunctionScalaParameterLogLevelArgs>>> logLevels() {
        return Optional.ofNullable(this.logLevels);
    }

    @Import(name="metricLevels")
    private @Nullable Output<List<FunctionScalaParameterMetricLevelArgs>> metricLevels;

    public Optional<Output<List<FunctionScalaParameterMetricLevelArgs>>> metricLevels() {
        return Optional.ofNullable(this.metricLevels);
    }

    @Import(name="traceLevels")
    private @Nullable Output<List<FunctionScalaParameterTraceLevelArgs>> traceLevels;

    public Optional<Output<List<FunctionScalaParameterTraceLevelArgs>>> traceLevels() {
        return Optional.ofNullable(this.traceLevels);
    }

    private FunctionScalaParameterArgs() {}

    private FunctionScalaParameterArgs(FunctionScalaParameterArgs $) {
        this.enableConsoleOutputs = $.enableConsoleOutputs;
        this.logLevels = $.logLevels;
        this.metricLevels = $.metricLevels;
        this.traceLevels = $.traceLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionScalaParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionScalaParameterArgs $;

        public Builder() {
            $ = new FunctionScalaParameterArgs();
        }

        public Builder(FunctionScalaParameterArgs defaults) {
            $ = new FunctionScalaParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableConsoleOutputs(@Nullable Output<List<FunctionScalaParameterEnableConsoleOutputArgs>> enableConsoleOutputs) {
            $.enableConsoleOutputs = enableConsoleOutputs;
            return this;
        }

        public Builder enableConsoleOutputs(List<FunctionScalaParameterEnableConsoleOutputArgs> enableConsoleOutputs) {
            return enableConsoleOutputs(Output.of(enableConsoleOutputs));
        }

        public Builder enableConsoleOutputs(FunctionScalaParameterEnableConsoleOutputArgs... enableConsoleOutputs) {
            return enableConsoleOutputs(List.of(enableConsoleOutputs));
        }

        public Builder logLevels(@Nullable Output<List<FunctionScalaParameterLogLevelArgs>> logLevels) {
            $.logLevels = logLevels;
            return this;
        }

        public Builder logLevels(List<FunctionScalaParameterLogLevelArgs> logLevels) {
            return logLevels(Output.of(logLevels));
        }

        public Builder logLevels(FunctionScalaParameterLogLevelArgs... logLevels) {
            return logLevels(List.of(logLevels));
        }

        public Builder metricLevels(@Nullable Output<List<FunctionScalaParameterMetricLevelArgs>> metricLevels) {
            $.metricLevels = metricLevels;
            return this;
        }

        public Builder metricLevels(List<FunctionScalaParameterMetricLevelArgs> metricLevels) {
            return metricLevels(Output.of(metricLevels));
        }

        public Builder metricLevels(FunctionScalaParameterMetricLevelArgs... metricLevels) {
            return metricLevels(List.of(metricLevels));
        }

        public Builder traceLevels(@Nullable Output<List<FunctionScalaParameterTraceLevelArgs>> traceLevels) {
            $.traceLevels = traceLevels;
            return this;
        }

        public Builder traceLevels(List<FunctionScalaParameterTraceLevelArgs> traceLevels) {
            return traceLevels(Output.of(traceLevels));
        }

        public Builder traceLevels(FunctionScalaParameterTraceLevelArgs... traceLevels) {
            return traceLevels(List.of(traceLevels));
        }

        public FunctionScalaParameterArgs build() {
            return $;
        }
    }

}