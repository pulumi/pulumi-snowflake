// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class OauthIntegrationForCustomClientsRelatedParameterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("oauthAddPrivilegedRolesToBlockedLists")]
        private InputList<Inputs.OauthIntegrationForCustomClientsRelatedParameterOauthAddPrivilegedRolesToBlockedListGetArgs>? _oauthAddPrivilegedRolesToBlockedLists;
        public InputList<Inputs.OauthIntegrationForCustomClientsRelatedParameterOauthAddPrivilegedRolesToBlockedListGetArgs> OauthAddPrivilegedRolesToBlockedLists
        {
            get => _oauthAddPrivilegedRolesToBlockedLists ?? (_oauthAddPrivilegedRolesToBlockedLists = new InputList<Inputs.OauthIntegrationForCustomClientsRelatedParameterOauthAddPrivilegedRolesToBlockedListGetArgs>());
            set => _oauthAddPrivilegedRolesToBlockedLists = value;
        }

        public OauthIntegrationForCustomClientsRelatedParameterGetArgs()
        {
        }
        public static new OauthIntegrationForCustomClientsRelatedParameterGetArgs Empty => new OauthIntegrationForCustomClientsRelatedParameterGetArgs();
    }
}
