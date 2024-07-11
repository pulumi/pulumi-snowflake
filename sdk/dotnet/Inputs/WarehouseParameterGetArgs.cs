// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class WarehouseParameterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxConcurrencyLevels")]
        private InputList<Inputs.WarehouseParameterMaxConcurrencyLevelGetArgs>? _maxConcurrencyLevels;
        public InputList<Inputs.WarehouseParameterMaxConcurrencyLevelGetArgs> MaxConcurrencyLevels
        {
            get => _maxConcurrencyLevels ?? (_maxConcurrencyLevels = new InputList<Inputs.WarehouseParameterMaxConcurrencyLevelGetArgs>());
            set => _maxConcurrencyLevels = value;
        }

        [Input("statementQueuedTimeoutInSeconds")]
        private InputList<Inputs.WarehouseParameterStatementQueuedTimeoutInSecondGetArgs>? _statementQueuedTimeoutInSeconds;
        public InputList<Inputs.WarehouseParameterStatementQueuedTimeoutInSecondGetArgs> StatementQueuedTimeoutInSeconds
        {
            get => _statementQueuedTimeoutInSeconds ?? (_statementQueuedTimeoutInSeconds = new InputList<Inputs.WarehouseParameterStatementQueuedTimeoutInSecondGetArgs>());
            set => _statementQueuedTimeoutInSeconds = value;
        }

        [Input("statementTimeoutInSeconds")]
        private InputList<Inputs.WarehouseParameterStatementTimeoutInSecondGetArgs>? _statementTimeoutInSeconds;
        public InputList<Inputs.WarehouseParameterStatementTimeoutInSecondGetArgs> StatementTimeoutInSeconds
        {
            get => _statementTimeoutInSeconds ?? (_statementTimeoutInSeconds = new InputList<Inputs.WarehouseParameterStatementTimeoutInSecondGetArgs>());
            set => _statementTimeoutInSeconds = value;
        }

        public WarehouseParameterGetArgs()
        {
        }
        public static new WarehouseParameterGetArgs Empty => new WarehouseParameterGetArgs();
    }
}
