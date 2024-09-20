// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ViewDataMetricFunctionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the data metric function to add to the table or view or drop from the table or view. This function identifier must be provided without arguments in parenthesis.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        [Input("ons", required: true)]
        private InputList<string>? _ons;

        /// <summary>
        /// The table or view columns on which to associate the data metric function. The data types of the columns must match the data types of the columns specified in the data metric function definition.
        /// </summary>
        public InputList<string> Ons
        {
            get => _ons ?? (_ons = new InputList<string>());
            set => _ons = value;
        }

        /// <summary>
        /// The status of the metrics association. Valid values are: `STARTED` | `SUSPENDED`. When status of a data metric function is changed, it is being reassigned with `DROP DATA METRIC FUNCTION` and `ADD DATA METRIC FUNCTION`, and then its status is changed by `MODIFY DATA METRIC FUNCTION`
        /// </summary>
        [Input("scheduleStatus", required: true)]
        public Input<string> ScheduleStatus { get; set; } = null!;

        public ViewDataMetricFunctionGetArgs()
        {
        }
        public static new ViewDataMetricFunctionGetArgs Empty => new ViewDataMetricFunctionGetArgs();
    }
}