// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class DatabaseReplicationConfigurationArgs : Pulumi.ResourceArgs
    {
        [Input("accounts", required: true)]
        private InputList<string>? _accounts;
        public InputList<string> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<string>());
            set => _accounts = value;
        }

        [Input("ignoreEditionCheck")]
        public Input<bool>? IgnoreEditionCheck { get; set; }

        public DatabaseReplicationConfigurationArgs()
        {
        }
    }
}
