// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class ProcedurePythonParameter
    {
        public readonly ImmutableArray<Outputs.ProcedurePythonParameterEnableConsoleOutput> EnableConsoleOutputs;
        public readonly ImmutableArray<Outputs.ProcedurePythonParameterLogLevel> LogLevels;
        public readonly ImmutableArray<Outputs.ProcedurePythonParameterMetricLevel> MetricLevels;
        public readonly ImmutableArray<Outputs.ProcedurePythonParameterTraceLevel> TraceLevels;

        [OutputConstructor]
        private ProcedurePythonParameter(
            ImmutableArray<Outputs.ProcedurePythonParameterEnableConsoleOutput> enableConsoleOutputs,

            ImmutableArray<Outputs.ProcedurePythonParameterLogLevel> logLevels,

            ImmutableArray<Outputs.ProcedurePythonParameterMetricLevel> metricLevels,

            ImmutableArray<Outputs.ProcedurePythonParameterTraceLevel> traceLevels)
        {
            EnableConsoleOutputs = enableConsoleOutputs;
            LogLevels = logLevels;
            MetricLevels = metricLevels;
            TraceLevels = traceLevels;
        }
    }
}
