// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ProcedureSqlParameterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableConsoleOutputs")]
        private InputList<Inputs.ProcedureSqlParameterEnableConsoleOutputGetArgs>? _enableConsoleOutputs;
        public InputList<Inputs.ProcedureSqlParameterEnableConsoleOutputGetArgs> EnableConsoleOutputs
        {
            get => _enableConsoleOutputs ?? (_enableConsoleOutputs = new InputList<Inputs.ProcedureSqlParameterEnableConsoleOutputGetArgs>());
            set => _enableConsoleOutputs = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.ProcedureSqlParameterLogLevelGetArgs>? _logLevels;
        public InputList<Inputs.ProcedureSqlParameterLogLevelGetArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.ProcedureSqlParameterLogLevelGetArgs>());
            set => _logLevels = value;
        }

        [Input("metricLevels")]
        private InputList<Inputs.ProcedureSqlParameterMetricLevelGetArgs>? _metricLevels;
        public InputList<Inputs.ProcedureSqlParameterMetricLevelGetArgs> MetricLevels
        {
            get => _metricLevels ?? (_metricLevels = new InputList<Inputs.ProcedureSqlParameterMetricLevelGetArgs>());
            set => _metricLevels = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.ProcedureSqlParameterTraceLevelGetArgs>? _traceLevels;
        public InputList<Inputs.ProcedureSqlParameterTraceLevelGetArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.ProcedureSqlParameterTraceLevelGetArgs>());
            set => _traceLevels = value;
        }

        public ProcedureSqlParameterGetArgs()
        {
        }
        public static new ProcedureSqlParameterGetArgs Empty => new ProcedureSqlParameterGetArgs();
    }
}