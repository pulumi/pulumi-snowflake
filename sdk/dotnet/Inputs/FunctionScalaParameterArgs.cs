// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class FunctionScalaParameterArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableConsoleOutputs")]
        private InputList<Inputs.FunctionScalaParameterEnableConsoleOutputArgs>? _enableConsoleOutputs;
        public InputList<Inputs.FunctionScalaParameterEnableConsoleOutputArgs> EnableConsoleOutputs
        {
            get => _enableConsoleOutputs ?? (_enableConsoleOutputs = new InputList<Inputs.FunctionScalaParameterEnableConsoleOutputArgs>());
            set => _enableConsoleOutputs = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.FunctionScalaParameterLogLevelArgs>? _logLevels;
        public InputList<Inputs.FunctionScalaParameterLogLevelArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.FunctionScalaParameterLogLevelArgs>());
            set => _logLevels = value;
        }

        [Input("metricLevels")]
        private InputList<Inputs.FunctionScalaParameterMetricLevelArgs>? _metricLevels;
        public InputList<Inputs.FunctionScalaParameterMetricLevelArgs> MetricLevels
        {
            get => _metricLevels ?? (_metricLevels = new InputList<Inputs.FunctionScalaParameterMetricLevelArgs>());
            set => _metricLevels = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.FunctionScalaParameterTraceLevelArgs>? _traceLevels;
        public InputList<Inputs.FunctionScalaParameterTraceLevelArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.FunctionScalaParameterTraceLevelArgs>());
            set => _traceLevels = value;
        }

        public FunctionScalaParameterArgs()
        {
        }
        public static new FunctionScalaParameterArgs Empty => new FunctionScalaParameterArgs();
    }
}