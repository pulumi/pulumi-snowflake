// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ProcedureJavaParameterArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableConsoleOutputs")]
        private InputList<Inputs.ProcedureJavaParameterEnableConsoleOutputArgs>? _enableConsoleOutputs;
        public InputList<Inputs.ProcedureJavaParameterEnableConsoleOutputArgs> EnableConsoleOutputs
        {
            get => _enableConsoleOutputs ?? (_enableConsoleOutputs = new InputList<Inputs.ProcedureJavaParameterEnableConsoleOutputArgs>());
            set => _enableConsoleOutputs = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.ProcedureJavaParameterLogLevelArgs>? _logLevels;
        public InputList<Inputs.ProcedureJavaParameterLogLevelArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.ProcedureJavaParameterLogLevelArgs>());
            set => _logLevels = value;
        }

        [Input("metricLevels")]
        private InputList<Inputs.ProcedureJavaParameterMetricLevelArgs>? _metricLevels;
        public InputList<Inputs.ProcedureJavaParameterMetricLevelArgs> MetricLevels
        {
            get => _metricLevels ?? (_metricLevels = new InputList<Inputs.ProcedureJavaParameterMetricLevelArgs>());
            set => _metricLevels = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.ProcedureJavaParameterTraceLevelArgs>? _traceLevels;
        public InputList<Inputs.ProcedureJavaParameterTraceLevelArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.ProcedureJavaParameterTraceLevelArgs>());
            set => _traceLevels = value;
        }

        public ProcedureJavaParameterArgs()
        {
        }
        public static new ProcedureJavaParameterArgs Empty => new ProcedureJavaParameterArgs();
    }
}
