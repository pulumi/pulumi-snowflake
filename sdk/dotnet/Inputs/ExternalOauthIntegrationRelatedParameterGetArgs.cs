// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ExternalOauthIntegrationRelatedParameterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("externalOauthAddPrivilegedRolesToBlockedLists")]
        private InputList<Inputs.ExternalOauthIntegrationRelatedParameterExternalOauthAddPrivilegedRolesToBlockedListGetArgs>? _externalOauthAddPrivilegedRolesToBlockedLists;
        public InputList<Inputs.ExternalOauthIntegrationRelatedParameterExternalOauthAddPrivilegedRolesToBlockedListGetArgs> ExternalOauthAddPrivilegedRolesToBlockedLists
        {
            get => _externalOauthAddPrivilegedRolesToBlockedLists ?? (_externalOauthAddPrivilegedRolesToBlockedLists = new InputList<Inputs.ExternalOauthIntegrationRelatedParameterExternalOauthAddPrivilegedRolesToBlockedListGetArgs>());
            set => _externalOauthAddPrivilegedRolesToBlockedLists = value;
        }

        public ExternalOauthIntegrationRelatedParameterGetArgs()
        {
        }
        public static new ExternalOauthIntegrationRelatedParameterGetArgs Empty => new ExternalOauthIntegrationRelatedParameterGetArgs();
    }
}
