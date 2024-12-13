// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ProcedureScalaParameterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableConsoleOutputs")]
        private InputList<Inputs.ProcedureScalaParameterEnableConsoleOutputGetArgs>? _enableConsoleOutputs;
        public InputList<Inputs.ProcedureScalaParameterEnableConsoleOutputGetArgs> EnableConsoleOutputs
        {
            get => _enableConsoleOutputs ?? (_enableConsoleOutputs = new InputList<Inputs.ProcedureScalaParameterEnableConsoleOutputGetArgs>());
            set => _enableConsoleOutputs = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.ProcedureScalaParameterLogLevelGetArgs>? _logLevels;
        public InputList<Inputs.ProcedureScalaParameterLogLevelGetArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.ProcedureScalaParameterLogLevelGetArgs>());
            set => _logLevels = value;
        }

        [Input("metricLevels")]
        private InputList<Inputs.ProcedureScalaParameterMetricLevelGetArgs>? _metricLevels;
        public InputList<Inputs.ProcedureScalaParameterMetricLevelGetArgs> MetricLevels
        {
            get => _metricLevels ?? (_metricLevels = new InputList<Inputs.ProcedureScalaParameterMetricLevelGetArgs>());
            set => _metricLevels = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.ProcedureScalaParameterTraceLevelGetArgs>? _traceLevels;
        public InputList<Inputs.ProcedureScalaParameterTraceLevelGetArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.ProcedureScalaParameterTraceLevelGetArgs>());
            set => _traceLevels = value;
        }

        public ProcedureScalaParameterGetArgs()
        {
        }
        public static new ProcedureScalaParameterGetArgs Empty => new ProcedureScalaParameterGetArgs();
    }
}