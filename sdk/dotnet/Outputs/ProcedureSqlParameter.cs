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
    public sealed class ProcedureSqlParameter
    {
        public readonly ImmutableArray<Outputs.ProcedureSqlParameterEnableConsoleOutput> EnableConsoleOutputs;
        public readonly ImmutableArray<Outputs.ProcedureSqlParameterLogLevel> LogLevels;
        public readonly ImmutableArray<Outputs.ProcedureSqlParameterMetricLevel> MetricLevels;
        public readonly ImmutableArray<Outputs.ProcedureSqlParameterTraceLevel> TraceLevels;

        [OutputConstructor]
        private ProcedureSqlParameter(
            ImmutableArray<Outputs.ProcedureSqlParameterEnableConsoleOutput> enableConsoleOutputs,

            ImmutableArray<Outputs.ProcedureSqlParameterLogLevel> logLevels,

            ImmutableArray<Outputs.ProcedureSqlParameterMetricLevel> metricLevels,

            ImmutableArray<Outputs.ProcedureSqlParameterTraceLevel> traceLevels)
        {
            EnableConsoleOutputs = enableConsoleOutputs;
            LogLevels = logLevels;
            MetricLevels = metricLevels;
            TraceLevels = traceLevels;
        }
    }
}
