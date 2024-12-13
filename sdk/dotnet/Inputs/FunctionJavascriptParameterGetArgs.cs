// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class FunctionJavascriptParameterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableConsoleOutputs")]
        private InputList<Inputs.FunctionJavascriptParameterEnableConsoleOutputGetArgs>? _enableConsoleOutputs;
        public InputList<Inputs.FunctionJavascriptParameterEnableConsoleOutputGetArgs> EnableConsoleOutputs
        {
            get => _enableConsoleOutputs ?? (_enableConsoleOutputs = new InputList<Inputs.FunctionJavascriptParameterEnableConsoleOutputGetArgs>());
            set => _enableConsoleOutputs = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.FunctionJavascriptParameterLogLevelGetArgs>? _logLevels;
        public InputList<Inputs.FunctionJavascriptParameterLogLevelGetArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.FunctionJavascriptParameterLogLevelGetArgs>());
            set => _logLevels = value;
        }

        [Input("metricLevels")]
        private InputList<Inputs.FunctionJavascriptParameterMetricLevelGetArgs>? _metricLevels;
        public InputList<Inputs.FunctionJavascriptParameterMetricLevelGetArgs> MetricLevels
        {
            get => _metricLevels ?? (_metricLevels = new InputList<Inputs.FunctionJavascriptParameterMetricLevelGetArgs>());
            set => _metricLevels = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.FunctionJavascriptParameterTraceLevelGetArgs>? _traceLevels;
        public InputList<Inputs.FunctionJavascriptParameterTraceLevelGetArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.FunctionJavascriptParameterTraceLevelGetArgs>());
            set => _traceLevels = value;
        }

        public FunctionJavascriptParameterGetArgs()
        {
        }
        public static new FunctionJavascriptParameterGetArgs Empty => new FunctionJavascriptParameterGetArgs();
    }
}