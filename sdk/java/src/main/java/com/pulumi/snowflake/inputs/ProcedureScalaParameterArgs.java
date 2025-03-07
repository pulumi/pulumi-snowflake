// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.ProcedureScalaParameterEnableConsoleOutputArgs;
import com.pulumi.snowflake.inputs.ProcedureScalaParameterLogLevelArgs;
import com.pulumi.snowflake.inputs.ProcedureScalaParameterMetricLevelArgs;
import com.pulumi.snowflake.inputs.ProcedureScalaParameterTraceLevelArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProcedureScalaParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcedureScalaParameterArgs Empty = new ProcedureScalaParameterArgs();

    @Import(name="enableConsoleOutputs")
    private @Nullable Output<List<ProcedureScalaParameterEnableConsoleOutputArgs>> enableConsoleOutputs;

    public Optional<Output<List<ProcedureScalaParameterEnableConsoleOutputArgs>>> enableConsoleOutputs() {
        return Optional.ofNullable(this.enableConsoleOutputs);
    }

    @Import(name="logLevels")
    private @Nullable Output<List<ProcedureScalaParameterLogLevelArgs>> logLevels;

    public Optional<Output<List<ProcedureScalaParameterLogLevelArgs>>> logLevels() {
        return Optional.ofNullable(this.logLevels);
    }

    @Import(name="metricLevels")
    private @Nullable Output<List<ProcedureScalaParameterMetricLevelArgs>> metricLevels;

    public Optional<Output<List<ProcedureScalaParameterMetricLevelArgs>>> metricLevels() {
        return Optional.ofNullable(this.metricLevels);
    }

    @Import(name="traceLevels")
    private @Nullable Output<List<ProcedureScalaParameterTraceLevelArgs>> traceLevels;

    public Optional<Output<List<ProcedureScalaParameterTraceLevelArgs>>> traceLevels() {
        return Optional.ofNullable(this.traceLevels);
    }

    private ProcedureScalaParameterArgs() {}

    private ProcedureScalaParameterArgs(ProcedureScalaParameterArgs $) {
        this.enableConsoleOutputs = $.enableConsoleOutputs;
        this.logLevels = $.logLevels;
        this.metricLevels = $.metricLevels;
        this.traceLevels = $.traceLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcedureScalaParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcedureScalaParameterArgs $;

        public Builder() {
            $ = new ProcedureScalaParameterArgs();
        }

        public Builder(ProcedureScalaParameterArgs defaults) {
            $ = new ProcedureScalaParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableConsoleOutputs(@Nullable Output<List<ProcedureScalaParameterEnableConsoleOutputArgs>> enableConsoleOutputs) {
            $.enableConsoleOutputs = enableConsoleOutputs;
            return this;
        }

        public Builder enableConsoleOutputs(List<ProcedureScalaParameterEnableConsoleOutputArgs> enableConsoleOutputs) {
            return enableConsoleOutputs(Output.of(enableConsoleOutputs));
        }

        public Builder enableConsoleOutputs(ProcedureScalaParameterEnableConsoleOutputArgs... enableConsoleOutputs) {
            return enableConsoleOutputs(List.of(enableConsoleOutputs));
        }

        public Builder logLevels(@Nullable Output<List<ProcedureScalaParameterLogLevelArgs>> logLevels) {
            $.logLevels = logLevels;
            return this;
        }

        public Builder logLevels(List<ProcedureScalaParameterLogLevelArgs> logLevels) {
            return logLevels(Output.of(logLevels));
        }

        public Builder logLevels(ProcedureScalaParameterLogLevelArgs... logLevels) {
            return logLevels(List.of(logLevels));
        }

        public Builder metricLevels(@Nullable Output<List<ProcedureScalaParameterMetricLevelArgs>> metricLevels) {
            $.metricLevels = metricLevels;
            return this;
        }

        public Builder metricLevels(List<ProcedureScalaParameterMetricLevelArgs> metricLevels) {
            return metricLevels(Output.of(metricLevels));
        }

        public Builder metricLevels(ProcedureScalaParameterMetricLevelArgs... metricLevels) {
            return metricLevels(List.of(metricLevels));
        }

        public Builder traceLevels(@Nullable Output<List<ProcedureScalaParameterTraceLevelArgs>> traceLevels) {
            $.traceLevels = traceLevels;
            return this;
        }

        public Builder traceLevels(List<ProcedureScalaParameterTraceLevelArgs> traceLevels) {
            return traceLevels(Output.of(traceLevels));
        }

        public Builder traceLevels(ProcedureScalaParameterTraceLevelArgs... traceLevels) {
            return traceLevels(List.of(traceLevels));
        }

        public ProcedureScalaParameterArgs build() {
            return $;
        }
    }

}
