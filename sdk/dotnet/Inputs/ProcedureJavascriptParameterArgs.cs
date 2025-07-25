// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ProcedureJavascriptParameterArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableConsoleOutputs")]
        private InputList<Inputs.ProcedureJavascriptParameterEnableConsoleOutputArgs>? _enableConsoleOutputs;
        public InputList<Inputs.ProcedureJavascriptParameterEnableConsoleOutputArgs> EnableConsoleOutputs
        {
            get => _enableConsoleOutputs ?? (_enableConsoleOutputs = new InputList<Inputs.ProcedureJavascriptParameterEnableConsoleOutputArgs>());
            set => _enableConsoleOutputs = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.ProcedureJavascriptParameterLogLevelArgs>? _logLevels;
        public InputList<Inputs.ProcedureJavascriptParameterLogLevelArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.ProcedureJavascriptParameterLogLevelArgs>());
            set => _logLevels = value;
        }

        [Input("metricLevels")]
        private InputList<Inputs.ProcedureJavascriptParameterMetricLevelArgs>? _metricLevels;
        public InputList<Inputs.ProcedureJavascriptParameterMetricLevelArgs> MetricLevels
        {
            get => _metricLevels ?? (_metricLevels = new InputList<Inputs.ProcedureJavascriptParameterMetricLevelArgs>());
            set => _metricLevels = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.ProcedureJavascriptParameterTraceLevelArgs>? _traceLevels;
        public InputList<Inputs.ProcedureJavascriptParameterTraceLevelArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.ProcedureJavascriptParameterTraceLevelArgs>());
            set => _traceLevels = value;
        }

        public ProcedureJavascriptParameterArgs()
        {
        }
        public static new ProcedureJavascriptParameterArgs Empty => new ProcedureJavascriptParameterArgs();
    }
}
