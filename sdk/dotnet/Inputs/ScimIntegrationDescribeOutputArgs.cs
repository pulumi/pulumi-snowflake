// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ScimIntegrationDescribeOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("comments")]
        private InputList<Inputs.ScimIntegrationDescribeOutputCommentArgs>? _comments;
        public InputList<Inputs.ScimIntegrationDescribeOutputCommentArgs> Comments
        {
            get => _comments ?? (_comments = new InputList<Inputs.ScimIntegrationDescribeOutputCommentArgs>());
            set => _comments = value;
        }

        [Input("enableds")]
        private InputList<Inputs.ScimIntegrationDescribeOutputEnabledArgs>? _enableds;
        public InputList<Inputs.ScimIntegrationDescribeOutputEnabledArgs> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<Inputs.ScimIntegrationDescribeOutputEnabledArgs>());
            set => _enableds = value;
        }

        [Input("networkPolicies")]
        private InputList<Inputs.ScimIntegrationDescribeOutputNetworkPolicyArgs>? _networkPolicies;
        public InputList<Inputs.ScimIntegrationDescribeOutputNetworkPolicyArgs> NetworkPolicies
        {
            get => _networkPolicies ?? (_networkPolicies = new InputList<Inputs.ScimIntegrationDescribeOutputNetworkPolicyArgs>());
            set => _networkPolicies = value;
        }

        [Input("runAsRoles")]
        private InputList<Inputs.ScimIntegrationDescribeOutputRunAsRoleArgs>? _runAsRoles;
        public InputList<Inputs.ScimIntegrationDescribeOutputRunAsRoleArgs> RunAsRoles
        {
            get => _runAsRoles ?? (_runAsRoles = new InputList<Inputs.ScimIntegrationDescribeOutputRunAsRoleArgs>());
            set => _runAsRoles = value;
        }

        [Input("syncPasswords")]
        private InputList<Inputs.ScimIntegrationDescribeOutputSyncPasswordArgs>? _syncPasswords;
        public InputList<Inputs.ScimIntegrationDescribeOutputSyncPasswordArgs> SyncPasswords
        {
            get => _syncPasswords ?? (_syncPasswords = new InputList<Inputs.ScimIntegrationDescribeOutputSyncPasswordArgs>());
            set => _syncPasswords = value;
        }

        public ScimIntegrationDescribeOutputArgs()
        {
        }
        public static new ScimIntegrationDescribeOutputArgs Empty => new ScimIntegrationDescribeOutputArgs();
    }
}